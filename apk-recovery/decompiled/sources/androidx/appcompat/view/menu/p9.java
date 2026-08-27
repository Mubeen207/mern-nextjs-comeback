package androidx.appcompat.view.menu;

import android.graphics.Typeface;
import android.os.Handler;
import androidx.appcompat.view.menu.bv;
import androidx.appcompat.view.menu.zu;
/* loaded from: classes.dex */
public class p9 {
    public final bv.c a;
    public final Handler b;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public final /* synthetic */ bv.c m;
        public final /* synthetic */ Typeface n;

        public a(bv.c cVar, Typeface typeface) {
            this.m = cVar;
            this.n = typeface;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.m.b(this.n);
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public final /* synthetic */ bv.c m;
        public final /* synthetic */ int n;

        public b(bv.c cVar, int i) {
            this.m = cVar;
            this.n = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.m.a(this.n);
        }
    }

    public p9(bv.c cVar, Handler handler) {
        this.a = cVar;
        this.b = handler;
    }

    public final void a(int i) {
        this.b.post(new b(this.a, i));
    }

    public void b(zu.e eVar) {
        if (eVar.a()) {
            c(eVar.a);
        } else {
            a(eVar.b);
        }
    }

    public final void c(Typeface typeface) {
        this.b.post(new a(this.a, typeface));
    }
}
