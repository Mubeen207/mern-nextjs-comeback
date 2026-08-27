package androidx.lifecycle;

import androidx.appcompat.view.menu.cg0;
import androidx.appcompat.view.menu.h4;
import androidx.appcompat.view.menu.jr0;
import java.util.Map;
/* loaded from: classes.dex */
public abstract class j {
    public static final Object j = new Object();
    public final Object a = new Object();
    public jr0 b = new jr0();
    public int c = 0;
    public volatile Object d;
    public volatile Object e;
    public int f;
    public boolean g;
    public boolean h;
    public final Runnable i;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Object obj;
            synchronized (j.this.a) {
                obj = j.this.e;
                j.this.e = j.j;
            }
            j.this.e(obj);
        }
    }

    /* loaded from: classes.dex */
    public abstract class b {
        public final cg0 a;
        public boolean b;
        public int c;

        public abstract void a(boolean z);

        public abstract void b();

        public abstract boolean c();
    }

    public j() {
        Object obj = j;
        this.e = obj;
        this.i = new a();
        this.d = obj;
        this.f = -1;
    }

    public static void a(String str) {
        if (h4.f().b()) {
            return;
        }
        throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
    }

    public final void b(b bVar) {
        if (bVar.b) {
            if (!bVar.c()) {
                bVar.a(false);
                return;
            }
            int i = bVar.c;
            int i2 = this.f;
            if (i >= i2) {
                return;
            }
            bVar.c = i2;
            bVar.a.a(this.d);
        }
    }

    public void c(b bVar) {
        if (this.g) {
            this.h = true;
            return;
        }
        this.g = true;
        do {
            this.h = false;
            jr0.d g = this.b.g();
            while (g.hasNext()) {
                b((b) ((Map.Entry) g.next()).getValue());
                if (this.h) {
                    break;
                }
            }
        } while (this.h);
        this.g = false;
    }

    public void d(cg0 cg0Var) {
        a("removeObserver");
        b bVar = (b) this.b.n(cg0Var);
    }

    public void e(Object obj) {
        a("setValue");
        this.f++;
        this.d = obj;
        c(null);
    }
}
