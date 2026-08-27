package androidx.appcompat.view.menu;

import androidx.appcompat.view.menu.m2;
/* loaded from: classes.dex */
public abstract class dz0 {
    public final mr[] a;
    public final boolean b;
    public final int c;

    /* loaded from: classes.dex */
    public static class a {
        public qo0 a;
        public mr[] c;
        public boolean b = true;
        public int d = 0;

        public /* synthetic */ a(rc1 rc1Var) {
        }

        public dz0 a() {
            pj0.b(this.a != null, "execute parameter required");
            return new qc1(this, this.c, this.b, this.d);
        }

        public a b(qo0 qo0Var) {
            this.a = qo0Var;
            return this;
        }

        public a c(boolean z) {
            this.b = z;
            return this;
        }

        public a d(mr... mrVarArr) {
            this.c = mrVarArr;
            return this;
        }
    }

    public dz0(mr[] mrVarArr, boolean z, int i) {
        this.a = mrVarArr;
        boolean z2 = false;
        if (mrVarArr != null && z) {
            z2 = true;
        }
        this.b = z2;
        this.c = i;
    }

    public static a a() {
        return new a(null);
    }

    public abstract void b(m2.b bVar, ez0 ez0Var);

    public boolean c() {
        return this.b;
    }

    public final int d() {
        return this.c;
    }

    public final mr[] e() {
        return this.a;
    }
}
