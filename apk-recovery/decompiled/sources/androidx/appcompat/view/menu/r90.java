package androidx.appcompat.view.menu;

import android.content.pm.PackageParser;
import androidx.lifecycle.r;
/* loaded from: classes.dex */
public class r90 extends q90 {
    public final d90 a;
    public final a b;

    /* loaded from: classes.dex */
    public static class a extends b61 {
        public static final r.b f = new C0028a();
        public gw0 d = new gw0();
        public boolean e = false;

        /* renamed from: androidx.appcompat.view.menu.r90$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0028a implements r.b {
            @Override // androidx.lifecycle.r.b
            public b61 a(Class cls) {
                return new a();
            }
        }

        public static a d(d61 d61Var) {
            return (a) new androidx.lifecycle.r(d61Var, f).a(a.class);
        }

        @Override // androidx.appcompat.view.menu.b61
        public void c() {
            super.c();
            if (this.d.j() <= 0) {
                this.d.b();
            } else {
                my0.a(this.d.n(0));
                throw null;
            }
        }

        public void e() {
            if (this.d.j() <= 0) {
                return;
            }
            my0.a(this.d.n(0));
            throw null;
        }
    }

    public r90(d90 d90Var, d61 d61Var) {
        this.a = d90Var;
        this.b = a.d(d61Var);
    }

    @Override // androidx.appcompat.view.menu.q90
    public void b() {
        this.b.e();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder((int) PackageParser.PARSE_IS_PRIVILEGED);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        ij.a(this.a, sb);
        sb.append("}}");
        return sb.toString();
    }
}
