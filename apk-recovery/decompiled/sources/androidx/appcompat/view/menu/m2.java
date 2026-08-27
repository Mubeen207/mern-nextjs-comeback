package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Looper;
import androidx.appcompat.view.menu.fy;
import androidx.appcompat.view.menu.z7;
import java.util.Set;
/* loaded from: classes.dex */
public final class m2 {
    public final a a;
    public final g b;
    public final String c;

    /* loaded from: classes.dex */
    public static abstract class a extends e {
        public f a(Context context, Looper looper, ac acVar, Object obj, df dfVar, kg0 kg0Var) {
            throw new UnsupportedOperationException("buildClient must be implemented");
        }

        public f b(Context context, Looper looper, ac acVar, Object obj, fy.a aVar, fy.b bVar) {
            return a(context, looper, acVar, obj, aVar, bVar);
        }
    }

    /* loaded from: classes.dex */
    public interface b {
    }

    /* loaded from: classes.dex */
    public static class c {
    }

    /* loaded from: classes.dex */
    public interface d {
    }

    /* loaded from: classes.dex */
    public static abstract class e {
    }

    /* loaded from: classes.dex */
    public interface f extends b {
        boolean a();

        Set b();

        void c(String str);

        boolean d();

        int e();

        boolean f();

        mr[] g();

        String h();

        String j();

        void k(rz rzVar, Set set);

        void l(z7.e eVar);

        void m(z7.c cVar);

        void n();

        boolean o();
    }

    /* loaded from: classes.dex */
    public static final class g extends c {
    }

    public m2(String str, a aVar, g gVar) {
        pj0.j(aVar, "Cannot construct an Api with a null ClientBuilder");
        pj0.j(gVar, "Cannot construct an Api with a null ClientKey");
        this.c = str;
        this.a = aVar;
        this.b = gVar;
    }

    public final a a() {
        return this.a;
    }

    public final String b() {
        return this.c;
    }
}
