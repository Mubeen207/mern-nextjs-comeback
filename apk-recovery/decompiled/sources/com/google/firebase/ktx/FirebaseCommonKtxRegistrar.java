package com.google.firebase.ktx;

import androidx.annotation.Keep;
import androidx.appcompat.view.menu.c60;
import androidx.appcompat.view.menu.de;
import androidx.appcompat.view.menu.f90;
import androidx.appcompat.view.menu.i31;
import androidx.appcompat.view.menu.il;
import androidx.appcompat.view.menu.k8;
import androidx.appcompat.view.menu.nh;
import androidx.appcompat.view.menu.sc;
import androidx.appcompat.view.menu.u7;
import androidx.appcompat.view.menu.ud;
import androidx.appcompat.view.menu.xd;
import androidx.appcompat.view.menu.xl0;
import androidx.appcompat.view.menu.xp;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import java.util.concurrent.Executor;
@Keep
/* loaded from: classes.dex */
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {

    /* loaded from: classes.dex */
    public static final class a implements de {
        public static final a a = new a();

        @Override // androidx.appcompat.view.menu.de
        /* renamed from: b */
        public final nh a(xd xdVar) {
            Object e = xdVar.e(xl0.a(u7.class, Executor.class));
            c60.d(e, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return xp.a((Executor) e);
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements de {
        public static final b a = new b();

        @Override // androidx.appcompat.view.menu.de
        /* renamed from: b */
        public final nh a(xd xdVar) {
            Object e = xdVar.e(xl0.a(f90.class, Executor.class));
            c60.d(e, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return xp.a((Executor) e);
        }
    }

    /* loaded from: classes.dex */
    public static final class c implements de {
        public static final c a = new c();

        @Override // androidx.appcompat.view.menu.de
        /* renamed from: b */
        public final nh a(xd xdVar) {
            Object e = xdVar.e(xl0.a(k8.class, Executor.class));
            c60.d(e, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return xp.a((Executor) e);
        }
    }

    /* loaded from: classes.dex */
    public static final class d implements de {
        public static final d a = new d();

        @Override // androidx.appcompat.view.menu.de
        /* renamed from: b */
        public final nh a(xd xdVar) {
            Object e = xdVar.e(xl0.a(i31.class, Executor.class));
            c60.d(e, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return xp.a((Executor) e);
        }
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<ud> getComponents() {
        List<ud> g;
        ud d2 = ud.c(xl0.a(u7.class, nh.class)).b(il.i(xl0.a(u7.class, Executor.class))).f(a.a).d();
        c60.d(d2, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        ud d3 = ud.c(xl0.a(f90.class, nh.class)).b(il.i(xl0.a(f90.class, Executor.class))).f(b.a).d();
        c60.d(d3, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        ud d4 = ud.c(xl0.a(k8.class, nh.class)).b(il.i(xl0.a(k8.class, Executor.class))).f(c.a).d();
        c60.d(d4, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        ud d5 = ud.c(xl0.a(i31.class, nh.class)).b(il.i(xl0.a(i31.class, Executor.class))).f(d.a).d();
        c60.d(d5, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        g = sc.g(d2, d3, d4, d5);
        return g;
    }
}
