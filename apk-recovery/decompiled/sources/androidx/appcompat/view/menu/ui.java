package androidx.appcompat.view.menu;

import androidx.appcompat.view.menu.i8;
import io.flutter.embedding.engine.FlutterJNI;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes.dex */
public class ui implements i8, li0 {
    public final FlutterJNI a;
    public final Map b;
    public Map c;
    public final Object d;
    public final AtomicBoolean e;
    public final Map f;
    public int g;
    public final b h;
    public WeakHashMap i;
    public f j;

    /* loaded from: classes.dex */
    public static class a {
        public final ByteBuffer a;
        public int b;
        public long c;

        public a(ByteBuffer byteBuffer, int i, long j) {
            this.a = byteBuffer;
            this.b = i;
            this.c = j;
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(Runnable runnable);
    }

    /* loaded from: classes.dex */
    public static class c implements f {
        public ExecutorService a = ut.e().b();
    }

    /* loaded from: classes.dex */
    public static class d {
        public final i8.a a;
        public final b b;

        public d(i8.a aVar, b bVar) {
            this.a = aVar;
            this.b = bVar;
        }
    }

    /* loaded from: classes.dex */
    public static class e implements i8.b {
        public final FlutterJNI a;
        public final int b;
        public final AtomicBoolean c = new AtomicBoolean(false);

        public e(FlutterJNI flutterJNI, int i) {
            this.a = flutterJNI;
            this.b = i;
        }

        @Override // androidx.appcompat.view.menu.i8.b
        public void a(ByteBuffer byteBuffer) {
            if (this.c.getAndSet(true)) {
                throw new IllegalStateException("Reply already submitted");
            }
            if (byteBuffer == null) {
                this.a.invokePlatformMessageEmptyResponseCallback(this.b);
            } else {
                this.a.invokePlatformMessageResponseCallback(this.b, byteBuffer, byteBuffer.position());
            }
        }
    }

    /* loaded from: classes.dex */
    public interface f {
    }

    public ui(FlutterJNI flutterJNI, f fVar) {
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new Object();
        this.e = new AtomicBoolean(false);
        this.f = new HashMap();
        this.g = 1;
        this.h = new ri0();
        this.i = new WeakHashMap();
        this.a = flutterJNI;
        this.j = fVar;
    }

    public static void g(Error error) {
        Thread currentThread = Thread.currentThread();
        if (currentThread.getUncaughtExceptionHandler() == null) {
            throw error;
        }
        currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, error);
    }

    @Override // androidx.appcompat.view.menu.i8
    public void a(String str, i8.a aVar) {
        j(str, aVar, null);
    }

    @Override // androidx.appcompat.view.menu.i8
    public void b(String str, ByteBuffer byteBuffer, i8.b bVar) {
        s11 i = s11.i("DartMessenger#send on " + str);
        try {
            ha0.f("DartMessenger", "Sending message with callback over channel '" + str + "'");
            int i2 = this.g;
            this.g = i2 + 1;
            if (bVar != null) {
                this.f.put(Integer.valueOf(i2), bVar);
            }
            if (byteBuffer == null) {
                this.a.dispatchEmptyPlatformMessage(str, i2);
            } else {
                this.a.dispatchPlatformMessage(str, byteBuffer, byteBuffer.position(), i2);
            }
            if (i != null) {
                i.close();
            }
        } catch (Throwable th) {
            if (i != null) {
                try {
                    i.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // androidx.appcompat.view.menu.li0
    public void c(int i, ByteBuffer byteBuffer) {
        ha0.f("DartMessenger", "Received message reply from Dart.");
        i8.b bVar = (i8.b) this.f.remove(Integer.valueOf(i));
        if (bVar != null) {
            try {
                ha0.f("DartMessenger", "Invoking registered callback for reply from Dart.");
                bVar.a(byteBuffer);
                if (byteBuffer == null || !byteBuffer.isDirect()) {
                    return;
                }
                byteBuffer.limit(0);
            } catch (Error e2) {
                g(e2);
            } catch (Exception e3) {
                ha0.c("DartMessenger", "Uncaught exception in binary message reply handler", e3);
            }
        }
    }

    @Override // androidx.appcompat.view.menu.li0
    public void d(String str, ByteBuffer byteBuffer, int i, long j) {
        d dVar;
        boolean z;
        ha0.f("DartMessenger", "Received message from Dart over channel '" + str + "'");
        synchronized (this.d) {
            try {
                dVar = (d) this.b.get(str);
                z = this.e.get() && dVar == null;
                if (z) {
                    if (!this.c.containsKey(str)) {
                        this.c.put(str, new LinkedList());
                    }
                    ((List) this.c.get(str)).add(new a(byteBuffer, i, j));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            return;
        }
        f(str, dVar, byteBuffer, i, j);
    }

    public final void f(final String str, final d dVar, final ByteBuffer byteBuffer, final int i, final long j) {
        b bVar = dVar != null ? dVar.b : null;
        s11.c("PlatformChannel ScheduleHandler on " + str, i);
        Runnable runnable = new Runnable() { // from class: androidx.appcompat.view.menu.ti
            @Override // java.lang.Runnable
            public final void run() {
                ui.this.i(str, i, dVar, byteBuffer, j);
            }
        };
        if (bVar == null) {
            bVar = this.h;
        }
        bVar.a(runnable);
    }

    public final void h(d dVar, ByteBuffer byteBuffer, int i) {
        if (dVar == null) {
            ha0.f("DartMessenger", "No registered handler for message. Responding to Dart with empty reply message.");
            this.a.invokePlatformMessageEmptyResponseCallback(i);
            return;
        }
        try {
            ha0.f("DartMessenger", "Deferring to registered handler to process message.");
            dVar.a.a(byteBuffer, new e(this.a, i));
        } catch (Error e2) {
            g(e2);
        } catch (Exception e3) {
            ha0.c("DartMessenger", "Uncaught exception in binary message listener", e3);
            this.a.invokePlatformMessageEmptyResponseCallback(i);
        }
    }

    public final /* synthetic */ void i(String str, int i, d dVar, ByteBuffer byteBuffer, long j) {
        s11.h("PlatformChannel ScheduleHandler on " + str, i);
        try {
            s11 i2 = s11.i("DartMessenger#handleMessageFromDart on " + str);
            h(dVar, byteBuffer, i);
            if (byteBuffer != null && byteBuffer.isDirect()) {
                byteBuffer.limit(0);
            }
            if (i2 != null) {
                i2.close();
            }
        } finally {
            this.a.cleanupMessageData(j);
        }
    }

    public void j(String str, i8.a aVar, i8.c cVar) {
        b bVar;
        if (aVar == null) {
            ha0.f("DartMessenger", "Removing handler for channel '" + str + "'");
            synchronized (this.d) {
                this.b.remove(str);
            }
            return;
        }
        if (cVar != null) {
            bVar = (b) this.i.get(cVar);
            if (bVar == null) {
                throw new IllegalArgumentException("Unrecognized TaskQueue, use BinaryMessenger to create your TaskQueue (ex makeBackgroundTaskQueue).");
            }
        } else {
            bVar = null;
        }
        ha0.f("DartMessenger", "Setting handler for channel '" + str + "'");
        synchronized (this.d) {
            try {
                this.b.put(str, new d(aVar, bVar));
                List<a> list = (List) this.c.remove(str);
                if (list == null) {
                    return;
                }
                for (a aVar2 : list) {
                    f(str, (d) this.b.get(str), aVar2.a, aVar2.b, aVar2.c);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public ui(FlutterJNI flutterJNI) {
        this(flutterJNI, new c());
    }
}
