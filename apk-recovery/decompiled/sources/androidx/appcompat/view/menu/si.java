package androidx.appcompat.view.menu;

import android.content.res.AssetManager;
import androidx.appcompat.view.menu.i8;
import io.flutter.embedding.engine.FlutterJNI;
import java.nio.ByteBuffer;
import java.util.List;
/* loaded from: classes.dex */
public class si implements i8 {
    public final FlutterJNI a;
    public final AssetManager b;
    public final ui c;
    public final i8 d;
    public boolean e;
    public String f;
    public final i8.a g;

    /* loaded from: classes.dex */
    public class a implements i8.a {
        public a() {
        }

        @Override // androidx.appcompat.view.menu.i8.a
        public void a(ByteBuffer byteBuffer, i8.b bVar) {
            si.this.f = lx0.b.b(byteBuffer);
            si.d(si.this);
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public final String a;
        public final String b;
        public final String c;

        public b(String str, String str2) {
            this.a = str;
            this.b = null;
            this.c = str2;
        }

        public static b a() {
            xt c = ut.e().c();
            if (c.i()) {
                return new b(c.g(), "main");
            }
            throw new AssertionError("DartEntrypoints can only be created once a FlutterEngine is created.");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            if (this.a.equals(bVar.a)) {
                return this.c.equals(bVar.c);
            }
            return false;
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.c.hashCode();
        }

        public String toString() {
            return "DartEntrypoint( bundle path: " + this.a + ", function: " + this.c + " )";
        }

        public b(String str, String str2, String str3) {
            this.a = str;
            this.b = str2;
            this.c = str3;
        }
    }

    /* loaded from: classes.dex */
    public static class c implements i8 {
        public final ui a;

        public /* synthetic */ c(ui uiVar, a aVar) {
            this(uiVar);
        }

        @Override // androidx.appcompat.view.menu.i8
        public void a(String str, i8.a aVar) {
            this.a.a(str, aVar);
        }

        @Override // androidx.appcompat.view.menu.i8
        public void b(String str, ByteBuffer byteBuffer, i8.b bVar) {
            this.a.b(str, byteBuffer, bVar);
        }

        public c(ui uiVar) {
            this.a = uiVar;
        }
    }

    /* loaded from: classes.dex */
    public interface d {
    }

    public si(FlutterJNI flutterJNI, AssetManager assetManager) {
        this.e = false;
        a aVar = new a();
        this.g = aVar;
        this.a = flutterJNI;
        this.b = assetManager;
        ui uiVar = new ui(flutterJNI);
        this.c = uiVar;
        uiVar.a("flutter/isolate", aVar);
        this.d = new c(uiVar, null);
        if (flutterJNI.isAttached()) {
            this.e = true;
        }
    }

    public static /* synthetic */ d d(si siVar) {
        siVar.getClass();
        return null;
    }

    @Override // androidx.appcompat.view.menu.i8
    public void a(String str, i8.a aVar) {
        this.d.a(str, aVar);
    }

    @Override // androidx.appcompat.view.menu.i8
    public void b(String str, ByteBuffer byteBuffer, i8.b bVar) {
        this.d.b(str, byteBuffer, bVar);
    }

    public void e(b bVar, List list) {
        if (this.e) {
            ha0.g("DartExecutor", "Attempted to run a DartExecutor that is already running.");
            return;
        }
        s11 i = s11.i("DartExecutor#executeDartEntrypoint");
        try {
            ha0.f("DartExecutor", "Executing Dart entrypoint: " + bVar);
            this.a.runBundleAndSnapshotFromLibrary(bVar.a, bVar.c, bVar.b, this.b, list);
            this.e = true;
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

    public i8 f() {
        return this.d;
    }

    public boolean g() {
        return this.e;
    }

    public void h() {
        if (this.a.isAttached()) {
            this.a.notifyLowMemoryWarning();
        }
    }

    public void i() {
        ha0.f("DartExecutor", "Attached to JNI. Registering the platform message handler for this Dart execution context.");
        this.a.setPlatformMessageHandler(this.c);
    }

    public void j() {
        ha0.f("DartExecutor", "Detached from JNI. De-registering the platform message handler for this Dart execution context.");
        this.a.setPlatformMessageHandler(null);
    }
}
