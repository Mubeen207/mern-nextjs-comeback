package io.flutter.embedding.engine;

import android.content.Context;
import androidx.appcompat.view.menu.ej0;
import androidx.appcompat.view.menu.si;
import androidx.appcompat.view.menu.ut;
import androidx.appcompat.view.menu.xt;
import io.flutter.embedding.engine.a;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class b {
    public final List a = new ArrayList();

    /* loaded from: classes.dex */
    public class a implements a.b {
        public final /* synthetic */ io.flutter.embedding.engine.a a;

        public a(io.flutter.embedding.engine.a aVar) {
            this.a = aVar;
        }

        @Override // io.flutter.embedding.engine.a.b
        public void a() {
            b.this.a.remove(this.a);
        }

        @Override // io.flutter.embedding.engine.a.b
        public void b() {
        }
    }

    /* renamed from: io.flutter.embedding.engine.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0068b {
        public Context a;
        public si.b b;
        public String c;
        public List d;
        public ej0 e;
        public boolean f = true;
        public boolean g = false;

        public C0068b(Context context) {
            this.a = context;
        }

        public boolean a() {
            return this.f;
        }

        public Context b() {
            return this.a;
        }

        public si.b c() {
            return this.b;
        }

        public List d() {
            return this.d;
        }

        public String e() {
            return this.c;
        }

        public ej0 f() {
            return this.e;
        }

        public boolean g() {
            return this.g;
        }

        public C0068b h(boolean z) {
            this.f = z;
            return this;
        }

        public C0068b i(si.b bVar) {
            this.b = bVar;
            return this;
        }

        public C0068b j(List list) {
            this.d = list;
            return this;
        }

        public C0068b k(String str) {
            this.c = str;
            return this;
        }

        public C0068b l(boolean z) {
            this.g = z;
            return this;
        }
    }

    public b(Context context, String[] strArr) {
        xt c = ut.e().c();
        if (c.i()) {
            return;
        }
        c.k(context.getApplicationContext());
        c.f(context.getApplicationContext(), strArr);
    }

    public io.flutter.embedding.engine.a a(C0068b c0068b) {
        io.flutter.embedding.engine.a z;
        Context b = c0068b.b();
        si.b c = c0068b.c();
        String e = c0068b.e();
        List d = c0068b.d();
        ej0 f = c0068b.f();
        if (f == null) {
            f = new ej0();
        }
        ej0 ej0Var = f;
        boolean a2 = c0068b.a();
        boolean g = c0068b.g();
        si.b a3 = c == null ? si.b.a() : c;
        if (this.a.size() == 0) {
            z = b(b, ej0Var, a2, g);
            if (e != null) {
                z.o().c(e);
            }
            z.k().e(a3, d);
        } else {
            z = ((io.flutter.embedding.engine.a) this.a.get(0)).z(b, a3, e, d, ej0Var, a2, g);
        }
        this.a.add(z);
        z.e(new a(z));
        return z;
    }

    public io.flutter.embedding.engine.a b(Context context, ej0 ej0Var, boolean z, boolean z2) {
        return new io.flutter.embedding.engine.a(context, null, null, ej0Var, null, z, z2, this);
    }
}
