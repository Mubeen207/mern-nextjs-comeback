package androidx.lifecycle;

import androidx.appcompat.view.menu.b61;
import androidx.appcompat.view.menu.c60;
import androidx.appcompat.view.menu.c61;
import androidx.appcompat.view.menu.d61;
import androidx.appcompat.view.menu.e61;
import androidx.appcompat.view.menu.gi;
import androidx.appcompat.view.menu.le0;
import androidx.appcompat.view.menu.lj;
/* loaded from: classes.dex */
public class r {
    public final d61 a;
    public final b b;
    public final gi c;

    /* loaded from: classes.dex */
    public static class a extends c {
        public static final C0046a d = new C0046a(null);
        public static final gi.b e = C0046a.C0047a.a;

        /* renamed from: androidx.lifecycle.r$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0046a {

            /* renamed from: androidx.lifecycle.r$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0047a implements gi.b {
                public static final C0047a a = new C0047a();
            }

            public C0046a() {
            }

            public /* synthetic */ C0046a(lj ljVar) {
                this();
            }
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        public static final a a = a.a;

        /* loaded from: classes.dex */
        public static final class a {
            public static final /* synthetic */ a a = new a();
        }

        default b61 a(Class cls) {
            c60.e(cls, "modelClass");
            throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
        }

        default b61 b(Class cls, gi giVar) {
            c60.e(cls, "modelClass");
            c60.e(giVar, "extras");
            return a(cls);
        }
    }

    /* loaded from: classes.dex */
    public static class c implements b {
        public static final a b = new a(null);
        public static final gi.b c = a.C0048a.a;

        /* loaded from: classes.dex */
        public static final class a {

            /* renamed from: androidx.lifecycle.r$c$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0048a implements gi.b {
                public static final C0048a a = new C0048a();
            }

            public a() {
            }

            public /* synthetic */ a(lj ljVar) {
                this();
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public r(d61 d61Var, b bVar) {
        this(d61Var, bVar, null, 4, null);
        c60.e(d61Var, "store");
        c60.e(bVar, "factory");
    }

    public b61 a(Class cls) {
        c60.e(cls, "modelClass");
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return b("androidx.lifecycle.ViewModelProvider.DefaultKey:" + canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public b61 b(String str, Class cls) {
        b61 a2;
        c60.e(str, "key");
        c60.e(cls, "modelClass");
        b61 b2 = this.a.b(str);
        if (cls.isInstance(b2)) {
            c60.c(b2, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
            return b2;
        }
        le0 le0Var = new le0(this.c);
        le0Var.b(c.c, str);
        try {
            a2 = this.b.b(cls, le0Var);
        } catch (AbstractMethodError unused) {
            a2 = this.b.a(cls);
        }
        this.a.c(str, a2);
        return a2;
    }

    public r(d61 d61Var, b bVar, gi giVar) {
        c60.e(d61Var, "store");
        c60.e(bVar, "factory");
        c60.e(giVar, "defaultCreationExtras");
        this.a = d61Var;
        this.b = bVar;
        this.c = giVar;
    }

    public /* synthetic */ r(d61 d61Var, b bVar, gi giVar, int i, lj ljVar) {
        this(d61Var, bVar, (i & 4) != 0 ? gi.a.b : giVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public r(e61 e61Var, b bVar) {
        this(e61Var.c(), bVar, c61.a(e61Var));
        c60.e(e61Var, "owner");
        c60.e(bVar, "factory");
    }
}
