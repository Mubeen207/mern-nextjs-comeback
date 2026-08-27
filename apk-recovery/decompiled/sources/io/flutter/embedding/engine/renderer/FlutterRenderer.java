package io.flutter.embedding.engine.renderer;

import android.annotation.TargetApi;
import android.graphics.Rect;
import android.hardware.SyncFence;
import android.media.Image;
import android.media.ImageReader;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import androidx.annotation.Keep;
import androidx.appcompat.view.menu.d90;
import androidx.appcompat.view.menu.gu;
import androidx.appcompat.view.menu.ha0;
import androidx.appcompat.view.menu.hu;
import androidx.appcompat.view.menu.nu;
import androidx.appcompat.view.menu.uj;
import androidx.lifecycle.l;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import io.flutter.view.TextureRegistry;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
/* loaded from: classes.dex */
public class FlutterRenderer implements TextureRegistry {
    public final FlutterJNI a;
    public Surface c;
    public final nu h;
    public final AtomicLong b = new AtomicLong(0);
    public boolean d = false;
    public final Handler e = new Handler();
    public final Set f = new HashSet();
    public final List g = new ArrayList();

    @Keep
    @TargetApi(29)
    /* loaded from: classes.dex */
    public final class ImageReaderSurfaceProducer implements TextureRegistry.SurfaceProducer, TextureRegistry.ImageConsumer, TextureRegistry.b {
        private static final boolean CLEANUP_ON_MEMORY_PRESSURE = true;
        private static final int MAX_IMAGES = 5;
        private static final String TAG = "ImageReaderSurfaceProducer";
        private static final boolean VERBOSE_LOGS = false;
        private static final boolean trimOnMemoryPressure = true;
        private TextureRegistry.SurfaceProducer.a callback;
        private final long id;
        private boolean released;
        private boolean ignoringFence = VERBOSE_LOGS;
        private int requestedWidth = 1;
        private int requestedHeight = 1;
        private boolean createNewReader = true;
        private long lastDequeueTime = 0;
        private long lastQueueTime = 0;
        private long lastScheduleTime = 0;
        private int numTrims = 0;
        private final Object lock = new Object();
        private final ArrayDeque<b> imageReaderQueue = new ArrayDeque<>();
        private final HashMap<ImageReader, b> perImageReaders = new HashMap<>();
        private a lastDequeuedImage = null;
        private b lastReaderDequeuedFrom = null;

        /* loaded from: classes.dex */
        public class a {
            public final Image a;
            public final long b;

            public a(Image image, long j) {
                this.a = image;
                this.b = j;
            }
        }

        /* loaded from: classes.dex */
        public class b {
            public final ImageReader a;
            public final ArrayDeque b = new ArrayDeque();
            public boolean c = ImageReaderSurfaceProducer.VERBOSE_LOGS;

            public b(ImageReader imageReader) {
                this.a = imageReader;
                imageReader.setOnImageAvailableListener(new ImageReader.OnImageAvailableListener() { // from class: androidx.appcompat.view.menu.iu
                    @Override // android.media.ImageReader.OnImageAvailableListener
                    public final void onImageAvailable(ImageReader imageReader2) {
                        FlutterRenderer.ImageReaderSurfaceProducer.b.this.f(imageReader2);
                    }
                }, new Handler(Looper.getMainLooper()));
            }

            public boolean c() {
                if (!this.b.isEmpty() || ImageReaderSurfaceProducer.this.lastReaderDequeuedFrom == this) {
                    return ImageReaderSurfaceProducer.VERBOSE_LOGS;
                }
                return true;
            }

            public void d() {
                this.c = true;
                this.a.close();
                this.b.clear();
            }

            public a e() {
                if (this.b.isEmpty()) {
                    return null;
                }
                return (a) this.b.removeFirst();
            }

            public final /* synthetic */ void f(ImageReader imageReader) {
                Image image;
                try {
                    image = imageReader.acquireLatestImage();
                } catch (IllegalStateException e) {
                    ha0.b(ImageReaderSurfaceProducer.TAG, "onImageAvailable acquireLatestImage failed: " + e);
                    image = null;
                }
                if (image == null) {
                    return;
                }
                if (ImageReaderSurfaceProducer.this.released || this.c) {
                    image.close();
                } else {
                    ImageReaderSurfaceProducer.this.onImage(imageReader, image);
                }
            }

            public a g(Image image) {
                if (this.c) {
                    return null;
                }
                a aVar = new a(image, System.nanoTime());
                this.b.add(aVar);
                while (this.b.size() > 2) {
                    ((a) this.b.removeFirst()).a.close();
                }
                return aVar;
            }
        }

        public ImageReaderSurfaceProducer(long j) {
            this.id = j;
        }

        public static /* synthetic */ TextureRegistry.SurfaceProducer.a access$200(ImageReaderSurfaceProducer imageReaderSurfaceProducer) {
            imageReaderSurfaceProducer.getClass();
            return null;
        }

        private void cleanup() {
            synchronized (this.lock) {
                try {
                    for (b bVar : this.perImageReaders.values()) {
                        if (this.lastReaderDequeuedFrom == bVar) {
                            this.lastReaderDequeuedFrom = null;
                        }
                        bVar.d();
                    }
                    this.perImageReaders.clear();
                    a aVar = this.lastDequeuedImage;
                    if (aVar != null) {
                        aVar.a.close();
                        this.lastDequeuedImage = null;
                    }
                    b bVar2 = this.lastReaderDequeuedFrom;
                    if (bVar2 != null) {
                        bVar2.d();
                        this.lastReaderDequeuedFrom = null;
                    }
                    this.imageReaderQueue.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        private ImageReader createImageReader() {
            int i = Build.VERSION.SDK_INT;
            if (i >= 33) {
                return createImageReader33();
            }
            if (i >= 29) {
                return createImageReader29();
            }
            throw new UnsupportedOperationException("ImageReaderPlatformViewRenderTarget requires API version 29+");
        }

        @TargetApi(29)
        private ImageReader createImageReader29() {
            ImageReader newInstance;
            newInstance = ImageReader.newInstance(this.requestedWidth, this.requestedHeight, 34, 5, 256L);
            return newInstance;
        }

        @TargetApi(33)
        private ImageReader createImageReader33() {
            ImageReader build;
            hu.a();
            ImageReader.Builder a2 = gu.a(this.requestedWidth, this.requestedHeight);
            a2.setMaxImages(5);
            a2.setImageFormat(34);
            a2.setUsage(256L);
            build = a2.build();
            return build;
        }

        private b getActiveReader() {
            synchronized (this.lock) {
                try {
                    if (!this.createNewReader) {
                        return this.imageReaderQueue.peekLast();
                    }
                    this.createNewReader = VERBOSE_LOGS;
                    return getOrCreatePerImageReader(createImageReader());
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        private void maybeWaitOnFence(Image image) {
            if (image == null || this.ignoringFence) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                waitOnFence(image);
                return;
            }
            this.ignoringFence = true;
            ha0.a(TAG, "ImageTextureEntry can't wait on the fence on Android < 33");
        }

        private void releaseInternal() {
            cleanup();
            this.released = true;
            FlutterRenderer.this.g.remove(this);
        }

        @TargetApi(33)
        private void waitOnFence(Image image) {
            SyncFence fence;
            try {
                fence = image.getFence();
                fence.awaitForever();
            } catch (IOException unused) {
            }
        }

        @Override // io.flutter.view.TextureRegistry.ImageConsumer
        @TargetApi(29)
        public Image acquireLatestImage() {
            a dequeueImage = dequeueImage();
            if (dequeueImage == null) {
                return null;
            }
            maybeWaitOnFence(dequeueImage.a);
            return dequeueImage.a;
        }

        public double deltaMillis(long j) {
            return j / 1000000.0d;
        }

        public a dequeueImage() {
            a aVar;
            synchronized (this.lock) {
                try {
                    Iterator<b> it = this.imageReaderQueue.iterator();
                    aVar = null;
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        b next = it.next();
                        a e = next.e();
                        if (e == null) {
                            aVar = e;
                        } else {
                            a aVar2 = this.lastDequeuedImage;
                            if (aVar2 != null) {
                                aVar2.a.close();
                            }
                            this.lastDequeuedImage = e;
                            this.lastReaderDequeuedFrom = next;
                            aVar = e;
                        }
                    }
                    pruneImageReaderQueue();
                } catch (Throwable th) {
                    throw th;
                }
            }
            return aVar;
        }

        public void disableFenceForTest() {
            this.ignoringFence = true;
        }

        public void finalize() {
            try {
                if (this.released) {
                    return;
                }
                releaseInternal();
                FlutterRenderer.this.e.post(new f(this.id, FlutterRenderer.this.a));
            } finally {
                super.finalize();
            }
        }

        @Override // io.flutter.view.TextureRegistry.SurfaceProducer
        public int getHeight() {
            return this.requestedHeight;
        }

        public b getOrCreatePerImageReader(ImageReader imageReader) {
            b bVar = this.perImageReaders.get(imageReader);
            if (bVar == null) {
                b bVar2 = new b(imageReader);
                this.perImageReaders.put(imageReader, bVar2);
                this.imageReaderQueue.add(bVar2);
                return bVar2;
            }
            return bVar;
        }

        @Override // io.flutter.view.TextureRegistry.SurfaceProducer
        public Surface getSurface() {
            return getActiveReader().a.getSurface();
        }

        @Override // io.flutter.view.TextureRegistry.SurfaceProducer
        public int getWidth() {
            return this.requestedWidth;
        }

        @Override // io.flutter.view.TextureRegistry.SurfaceProducer
        public long id() {
            return this.id;
        }

        public int numImageReaders() {
            int size;
            synchronized (this.lock) {
                size = this.imageReaderQueue.size();
            }
            return size;
        }

        public int numImages() {
            int i;
            synchronized (this.lock) {
                try {
                    Iterator<b> it = this.imageReaderQueue.iterator();
                    i = 0;
                    while (it.hasNext()) {
                        i += it.next().b.size();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return i;
        }

        public int numTrims() {
            int i;
            synchronized (this.lock) {
                i = this.numTrims;
            }
            return i;
        }

        public void onImage(ImageReader imageReader, Image image) {
            a g;
            synchronized (this.lock) {
                g = getOrCreatePerImageReader(imageReader).g(image);
            }
            if (g == null) {
                return;
            }
            FlutterRenderer.this.m();
        }

        @Override // io.flutter.view.TextureRegistry.b
        public void onTrimMemory(int i) {
            if (i < 40) {
                return;
            }
            synchronized (this.lock) {
                this.numTrims++;
            }
            cleanup();
            this.createNewReader = true;
        }

        public void pruneImageReaderQueue() {
            b peekFirst;
            while (this.imageReaderQueue.size() > 1 && (peekFirst = this.imageReaderQueue.peekFirst()) != null && peekFirst.c()) {
                this.imageReaderQueue.removeFirst();
                this.perImageReaders.remove(peekFirst.a);
                peekFirst.d();
            }
        }

        @Override // io.flutter.view.TextureRegistry.SurfaceProducer
        public void release() {
            if (this.released) {
                return;
            }
            releaseInternal();
            FlutterRenderer.this.t(this.id);
        }

        @Override // io.flutter.view.TextureRegistry.SurfaceProducer
        public void scheduleFrame() {
            FlutterRenderer.this.m();
        }

        @Override // io.flutter.view.TextureRegistry.SurfaceProducer
        public void setCallback(TextureRegistry.SurfaceProducer.a aVar) {
        }

        @Override // io.flutter.view.TextureRegistry.SurfaceProducer
        public void setSize(int i, int i2) {
            int max = Math.max(1, i);
            int max2 = Math.max(1, i2);
            if (this.requestedWidth == max && this.requestedHeight == max2) {
                return;
            }
            this.createNewReader = true;
            this.requestedHeight = max2;
            this.requestedWidth = max;
        }
    }

    @Keep
    /* loaded from: classes.dex */
    public final class ImageTextureRegistryEntry implements TextureRegistry.ImageTextureEntry, TextureRegistry.ImageConsumer {
        private static final String TAG = "ImageTextureRegistryEntry";
        private final long id;
        private boolean ignoringFence = false;
        private Image image;
        private boolean released;

        public ImageTextureRegistryEntry(long j) {
            this.id = j;
        }

        @TargetApi(29)
        private void maybeWaitOnFence(Image image) {
            if (image == null || this.ignoringFence) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                waitOnFence(image);
                return;
            }
            this.ignoringFence = true;
            ha0.a(TAG, "ImageTextureEntry can't wait on the fence on Android < 33");
        }

        @TargetApi(33)
        private void waitOnFence(Image image) {
            SyncFence fence;
            try {
                fence = image.getFence();
                fence.awaitForever();
            } catch (IOException unused) {
            }
        }

        @Override // io.flutter.view.TextureRegistry.ImageConsumer
        @TargetApi(29)
        public Image acquireLatestImage() {
            Image image;
            synchronized (this) {
                image = this.image;
                this.image = null;
            }
            maybeWaitOnFence(image);
            return image;
        }

        public void finalize() {
            try {
                if (this.released) {
                    super.finalize();
                    return;
                }
                Image image = this.image;
                if (image != null) {
                    image.close();
                    this.image = null;
                }
                this.released = true;
                FlutterRenderer.this.e.post(new f(this.id, FlutterRenderer.this.a));
                super.finalize();
            } catch (Throwable th) {
                super.finalize();
                throw th;
            }
        }

        @Override // io.flutter.view.TextureRegistry.ImageTextureEntry
        public long id() {
            return this.id;
        }

        @Override // io.flutter.view.TextureRegistry.ImageTextureEntry
        public void pushImage(Image image) {
            Image image2;
            if (this.released) {
                return;
            }
            synchronized (this) {
                image2 = this.image;
                this.image = image;
            }
            if (image2 != null) {
                ha0.b(TAG, "Dropping PlatformView Frame");
                image2.close();
            }
            if (image != null) {
                FlutterRenderer.this.m();
            }
        }

        @Override // io.flutter.view.TextureRegistry.ImageTextureEntry
        public void release() {
            if (this.released) {
                return;
            }
            this.released = true;
            Image image = this.image;
            if (image != null) {
                image.close();
                this.image = null;
            }
            FlutterRenderer.this.t(this.id);
        }
    }

    /* loaded from: classes.dex */
    public class a implements nu {
        public a() {
        }

        @Override // androidx.appcompat.view.menu.nu
        public void c() {
            FlutterRenderer.this.d = false;
        }

        @Override // androidx.appcompat.view.menu.nu
        public void f() {
            FlutterRenderer.this.d = true;
        }
    }

    /* loaded from: classes.dex */
    public class b implements uj {
        public b() {
        }

        @Override // androidx.appcompat.view.menu.uj
        public void g(d90 d90Var) {
            ha0.f("FlutterRenderer", "onResume called; notifying SurfaceProducers");
            for (ImageReaderSurfaceProducer imageReaderSurfaceProducer : FlutterRenderer.this.g) {
                ImageReaderSurfaceProducer.access$200(imageReaderSurfaceProducer);
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class c {
        public final Rect a;
        public final e b;
        public final d c;

        public c(Rect rect, e eVar, d dVar) {
            this.a = rect;
            this.b = eVar;
            this.c = dVar;
        }

        public c(Rect rect, e eVar) {
            this.a = rect;
            this.b = eVar;
            this.c = d.UNKNOWN;
        }
    }

    /* loaded from: classes.dex */
    public enum d {
        UNKNOWN(0),
        POSTURE_FLAT(1),
        POSTURE_HALF_OPENED(2);
        
        public final int m;

        d(int i) {
            this.m = i;
        }
    }

    /* loaded from: classes.dex */
    public enum e {
        UNKNOWN(0),
        FOLD(1),
        HINGE(2),
        CUTOUT(3);
        
        public final int m;

        e(int i) {
            this.m = i;
        }
    }

    /* loaded from: classes.dex */
    public static final class f implements Runnable {
        public final long m;
        public final FlutterJNI n;

        public f(long j, FlutterJNI flutterJNI) {
            this.m = j;
            this.n = flutterJNI;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.n.isAttached()) {
                ha0.f("FlutterRenderer", "Releasing a Texture (" + this.m + ").");
                this.n.unregisterTexture(this.m);
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class g {
        public float a = 1.0f;
        public int b = 0;
        public int c = 0;
        public int d = 0;
        public int e = 0;
        public int f = 0;
        public int g = 0;
        public int h = 0;
        public int i = 0;
        public int j = 0;
        public int k = 0;
        public int l = 0;
        public int m = 0;
        public int n = 0;
        public int o = 0;
        public int p = -1;
        public List q = new ArrayList();

        public boolean a() {
            return this.b > 0 && this.c > 0 && this.a > 0.0f;
        }
    }

    public FlutterRenderer(FlutterJNI flutterJNI) {
        a aVar = new a();
        this.h = aVar;
        this.a = flutterJNI;
        flutterJNI.addIsDisplayingFlutterUiListener(aVar);
        l.o().h().a(new b());
    }

    public void g(nu nuVar) {
        this.a.addIsDisplayingFlutterUiListener(nuVar);
        if (this.d) {
            nuVar.f();
        }
    }

    public void h(ByteBuffer byteBuffer, int i) {
        this.a.dispatchPointerDataPacket(byteBuffer, i);
    }

    public boolean i() {
        return this.d;
    }

    public boolean j() {
        return this.a.getIsSoftwareRenderingEnabled();
    }

    public void k(int i) {
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            TextureRegistry.b bVar = (TextureRegistry.b) ((WeakReference) it.next()).get();
            if (bVar != null) {
                bVar.onTrimMemory(i);
            } else {
                it.remove();
            }
        }
    }

    public void l(nu nuVar) {
        this.a.removeIsDisplayingFlutterUiListener(nuVar);
    }

    public final void m() {
        this.a.scheduleFrame();
    }

    public void n(boolean z) {
        this.a.setSemanticsEnabled(z);
    }

    public void o(g gVar) {
        if (gVar.a()) {
            ha0.f("FlutterRenderer", "Setting viewport metrics\nSize: " + gVar.b + " x " + gVar.c + "\nPadding - L: " + gVar.g + ", T: " + gVar.d + ", R: " + gVar.e + ", B: " + gVar.f + "\nInsets - L: " + gVar.k + ", T: " + gVar.h + ", R: " + gVar.i + ", B: " + gVar.j + "\nSystem Gesture Insets - L: " + gVar.o + ", T: " + gVar.l + ", R: " + gVar.m + ", B: " + gVar.m + "\nDisplay Features: " + gVar.q.size());
            int[] iArr = new int[gVar.q.size() * 4];
            int[] iArr2 = new int[gVar.q.size()];
            int[] iArr3 = new int[gVar.q.size()];
            for (int i = 0; i < gVar.q.size(); i++) {
                c cVar = (c) gVar.q.get(i);
                int i2 = i * 4;
                Rect rect = cVar.a;
                iArr[i2] = rect.left;
                iArr[i2 + 1] = rect.top;
                iArr[i2 + 2] = rect.right;
                iArr[i2 + 3] = rect.bottom;
                iArr2[i] = cVar.b.m;
                iArr3[i] = cVar.c.m;
            }
            this.a.setViewportMetrics(gVar.a, gVar.b, gVar.c, gVar.d, gVar.e, gVar.f, gVar.g, gVar.h, gVar.i, gVar.j, gVar.k, gVar.l, gVar.m, gVar.n, gVar.o, gVar.p, iArr, iArr2, iArr3);
        }
    }

    public void p(Surface surface, boolean z) {
        if (!z) {
            q();
        }
        this.c = surface;
        if (z) {
            this.a.onSurfaceWindowChanged(surface);
        } else {
            this.a.onSurfaceCreated(surface);
        }
    }

    public void q() {
        if (this.c != null) {
            this.a.onSurfaceDestroyed();
            if (this.d) {
                this.h.c();
            }
            this.d = false;
            this.c = null;
        }
    }

    public void r(int i, int i2) {
        this.a.onSurfaceChanged(i, i2);
    }

    public void s(Surface surface) {
        this.c = surface;
        this.a.onSurfaceWindowChanged(surface);
    }

    public final void t(long j) {
        this.a.unregisterTexture(j);
    }
}
