package androidx.appcompat.view.menu;

import android.graphics.Rect;
import androidx.appcompat.view.menu.uu;
/* loaded from: classes.dex */
public final class xy implements uu {
    public static final a d = new a(null);
    public final q8 a;
    public final b b;
    public final uu.b c;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(lj ljVar) {
            this();
        }

        public final void a(q8 q8Var) {
            c60.e(q8Var, "bounds");
            if (q8Var.d() == 0 && q8Var.a() == 0) {
                throw new IllegalArgumentException("Bounds must be non zero".toString());
            }
            if (q8Var.b() != 0 && q8Var.c() != 0) {
                throw new IllegalArgumentException("Bounding rectangle must start at the top or left window edge for folding features".toString());
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        public static final a b = new a(null);
        public static final b c = new b("FOLD");
        public static final b d = new b("HINGE");
        public final String a;

        /* loaded from: classes.dex */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(lj ljVar) {
                this();
            }

            public final b a() {
                return b.c;
            }

            public final b b() {
                return b.d;
            }
        }

        public b(String str) {
            this.a = str;
        }

        public String toString() {
            return this.a;
        }
    }

    public xy(q8 q8Var, b bVar, uu.b bVar2) {
        c60.e(q8Var, "featureBounds");
        c60.e(bVar, "type");
        c60.e(bVar2, "state");
        this.a = q8Var;
        this.b = bVar;
        this.c = bVar2;
        d.a(q8Var);
    }

    @Override // androidx.appcompat.view.menu.jm
    public Rect a() {
        return this.a.f();
    }

    @Override // androidx.appcompat.view.menu.uu
    public uu.a b() {
        return (this.a.d() == 0 || this.a.a() == 0) ? uu.a.c : uu.a.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (c60.a(xy.class, obj != null ? obj.getClass() : null)) {
            c60.c(obj, "null cannot be cast to non-null type androidx.window.layout.HardwareFoldingFeature");
            xy xyVar = (xy) obj;
            return c60.a(this.a, xyVar.a) && c60.a(this.b, xyVar.b) && c60.a(getState(), xyVar.getState());
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.uu
    public uu.b getState() {
        return this.c;
    }

    public int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + getState().hashCode();
    }

    public String toString() {
        return xy.class.getSimpleName() + " { " + this.a + ", type=" + this.b + ", state=" + getState() + " }";
    }
}
