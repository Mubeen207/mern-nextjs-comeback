package androidx.appcompat.view.menu;

import android.hardware.display.DisplayManager;
import android.view.Choreographer;
import io.flutter.embedding.engine.FlutterJNI;
import java.util.Objects;
/* loaded from: classes.dex */
public class o71 {
    public static o71 e;
    public static b f;
    public FlutterJNI b;
    public long a = -1;
    public c c = new c(0);
    public final FlutterJNI.b d = new a();

    /* loaded from: classes.dex */
    public class a implements FlutterJNI.b {
        public a() {
        }

        @Override // io.flutter.embedding.engine.FlutterJNI.b
        public void a(long j) {
            Choreographer.getInstance().postFrameCallback(b(j));
        }

        public final Choreographer.FrameCallback b(long j) {
            if (o71.this.c != null) {
                o71.this.c.a = j;
                c cVar = o71.this.c;
                o71.this.c = null;
                return cVar;
            }
            return new c(j);
        }
    }

    /* loaded from: classes.dex */
    public class b implements DisplayManager.DisplayListener {
        public DisplayManager a;

        public b(DisplayManager displayManager) {
            this.a = displayManager;
        }

        public void a() {
            this.a.registerDisplayListener(this, null);
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int i) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i) {
            if (i == 0) {
                float refreshRate = this.a.getDisplay(0).getRefreshRate();
                o71.this.a = (long) (1.0E9d / refreshRate);
                o71.this.b.setRefreshRateFPS(refreshRate);
            }
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int i) {
        }
    }

    /* loaded from: classes.dex */
    public class c implements Choreographer.FrameCallback {
        public long a;

        public c(long j) {
            this.a = j;
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j) {
            long nanoTime = System.nanoTime() - j;
            o71.this.b.onVsync(nanoTime < 0 ? 0L : nanoTime, o71.this.a, this.a);
            o71.this.c = this;
        }
    }

    public o71(FlutterJNI flutterJNI) {
        this.b = flutterJNI;
    }

    public static o71 f(DisplayManager displayManager, FlutterJNI flutterJNI) {
        if (e == null) {
            e = new o71(flutterJNI);
        }
        if (f == null) {
            o71 o71Var = e;
            Objects.requireNonNull(o71Var);
            b bVar = new b(displayManager);
            f = bVar;
            bVar.a();
        }
        if (e.a == -1) {
            float refreshRate = displayManager.getDisplay(0).getRefreshRate();
            e.a = (long) (1.0E9d / refreshRate);
            flutterJNI.setRefreshRateFPS(refreshRate);
        }
        return e;
    }

    public void g() {
        this.b.setAsyncWaitForVsyncDelegate(this.d);
    }
}
