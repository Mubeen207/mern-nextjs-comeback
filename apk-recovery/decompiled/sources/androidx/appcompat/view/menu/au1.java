package androidx.appcompat.view.menu;

import android.content.Context;
/* loaded from: classes.dex */
public final class au1 extends fw1 {
    public final Context a;
    public final hy0 b;

    public au1(Context context, hy0 hy0Var) {
        if (context == null) {
            throw new NullPointerException("Null context");
        }
        this.a = context;
        this.b = hy0Var;
    }

    @Override // androidx.appcompat.view.menu.fw1
    public final Context a() {
        return this.a;
    }

    @Override // androidx.appcompat.view.menu.fw1
    public final hy0 b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        hy0 hy0Var;
        if (obj == this) {
            return true;
        }
        if (obj instanceof fw1) {
            fw1 fw1Var = (fw1) obj;
            if (this.a.equals(fw1Var.a()) && ((hy0Var = this.b) != null ? hy0Var.equals(fw1Var.b()) : fw1Var.b() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        hy0 hy0Var = this.b;
        return hashCode ^ (hy0Var == null ? 0 : hy0Var.hashCode());
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        return "FlagsContext{context=" + valueOf + ", hermeticFileOverrides=" + valueOf2 + "}";
    }
}
