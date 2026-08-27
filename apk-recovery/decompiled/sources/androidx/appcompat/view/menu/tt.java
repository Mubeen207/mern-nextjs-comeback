package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.Paint;
import android.hardware.HardwareBuffer;
import android.media.Image;
import android.media.ImageReader;
import android.os.Build;
import android.view.Surface;
import android.view.View;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import java.nio.ByteBuffer;
import java.util.Locale;
/* loaded from: classes.dex */
public class tt extends View implements yo0 {
    public ImageReader a;
    public Image b;
    public Bitmap c;
    public FlutterRenderer d;
    public b e;
    public boolean f;

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[b.values().length];
            a = iArr;
            try {
                iArr[b.background.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[b.overlay.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* loaded from: classes.dex */
    public enum b {
        background,
        overlay
    }

    public tt(Context context, int i, int i2, b bVar) {
        this(context, h(i, i2), bVar);
    }

    public static ImageReader h(int i, int i2) {
        int i3;
        int i4;
        ImageReader newInstance;
        if (i <= 0) {
            j("ImageReader width must be greater than 0, but given width=%d, set width=1", Integer.valueOf(i));
            i3 = 1;
        } else {
            i3 = i;
        }
        if (i2 <= 0) {
            j("ImageReader height must be greater than 0, but given height=%d, set height=1", Integer.valueOf(i2));
            i4 = 1;
        } else {
            i4 = i2;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            newInstance = ImageReader.newInstance(i3, i4, 1, 3, 768L);
            return newInstance;
        }
        return ImageReader.newInstance(i3, i4, 1, 3);
    }

    public static void j(String str, Object... objArr) {
        ha0.g("FlutterImageView", String.format(Locale.US, str, objArr));
    }

    @Override // androidx.appcompat.view.menu.yo0
    public void a() {
        if (this.f) {
            setAlpha(0.0f);
            e();
            this.c = null;
            f();
            invalidate();
            this.f = false;
        }
    }

    @Override // androidx.appcompat.view.menu.yo0
    public void b() {
    }

    @Override // androidx.appcompat.view.menu.yo0
    public void c(FlutterRenderer flutterRenderer) {
        if (a.a[this.e.ordinal()] == 1) {
            flutterRenderer.s(this.a.getSurface());
        }
        setAlpha(1.0f);
        this.d = flutterRenderer;
        this.f = true;
    }

    @Override // androidx.appcompat.view.menu.yo0
    public void d() {
    }

    public boolean e() {
        if (this.f) {
            Image acquireLatestImage = this.a.acquireLatestImage();
            if (acquireLatestImage != null) {
                f();
                this.b = acquireLatestImage;
                invalidate();
            }
            return acquireLatestImage != null;
        }
        return false;
    }

    public final void f() {
        Image image = this.b;
        if (image != null) {
            image.close();
            this.b = null;
        }
    }

    public void g() {
        this.a.close();
    }

    @Override // androidx.appcompat.view.menu.yo0
    public FlutterRenderer getAttachedRenderer() {
        return this.d;
    }

    public ImageReader getImageReader() {
        return this.a;
    }

    public Surface getSurface() {
        return this.a.getSurface();
    }

    public final void i() {
        setAlpha(0.0f);
    }

    public void k(int i, int i2) {
        if (this.d == null) {
            return;
        }
        if (i == this.a.getWidth() && i2 == this.a.getHeight()) {
            return;
        }
        f();
        g();
        this.a = h(i, i2);
    }

    public final void l() {
        Bitmap wrapHardwareBuffer;
        if (Build.VERSION.SDK_INT >= 29) {
            HardwareBuffer hardwareBuffer = this.b.getHardwareBuffer();
            wrapHardwareBuffer = Bitmap.wrapHardwareBuffer(hardwareBuffer, ColorSpace.get(ColorSpace.Named.SRGB));
            this.c = wrapHardwareBuffer;
            hardwareBuffer.close();
            return;
        }
        Image.Plane[] planes = this.b.getPlanes();
        if (planes.length != 1) {
            return;
        }
        Image.Plane plane = planes[0];
        int rowStride = plane.getRowStride() / plane.getPixelStride();
        int height = this.b.getHeight();
        Bitmap bitmap = this.c;
        if (bitmap == null || bitmap.getWidth() != rowStride || this.c.getHeight() != height) {
            this.c = Bitmap.createBitmap(rowStride, height, Bitmap.Config.ARGB_8888);
        }
        ByteBuffer buffer = plane.getBuffer();
        buffer.rewind();
        this.c.copyPixelsFromBuffer(buffer);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.b != null) {
            l();
        }
        Bitmap bitmap = this.c;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        if (!(i == this.a.getWidth() && i2 == this.a.getHeight()) && this.e == b.background && this.f) {
            k(i, i2);
            this.d.s(this.a.getSurface());
        }
    }

    public tt(Context context, ImageReader imageReader, b bVar) {
        super(context, null);
        this.f = false;
        this.a = imageReader;
        this.e = bVar;
        i();
    }
}
