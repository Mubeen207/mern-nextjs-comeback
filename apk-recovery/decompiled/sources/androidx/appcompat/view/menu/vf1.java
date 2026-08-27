package androidx.appcompat.view.menu;

import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public final class vf1 implements tg1 {
    public final boolean m;

    public vf1(Boolean bool) {
        if (bool == null) {
            this.m = false;
        } else {
            this.m = bool.booleanValue();
        }
    }

    @Override // androidx.appcompat.view.menu.tg1
    public final tg1 c() {
        return new vf1(Boolean.valueOf(this.m));
    }

    @Override // androidx.appcompat.view.menu.tg1
    public final Boolean d() {
        return Boolean.valueOf(this.m);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vf1) && this.m == ((vf1) obj).m;
    }

    @Override // androidx.appcompat.view.menu.tg1
    public final Double f() {
        return Double.valueOf(this.m ? 1.0d : 0.0d);
    }

    @Override // androidx.appcompat.view.menu.tg1
    public final String g() {
        return Boolean.toString(this.m);
    }

    public final int hashCode() {
        return Boolean.valueOf(this.m).hashCode();
    }

    @Override // androidx.appcompat.view.menu.tg1
    public final Iterator i() {
        return null;
    }

    @Override // androidx.appcompat.view.menu.tg1
    public final tg1 p(String str, sw1 sw1Var, List list) {
        if ("toString".equals(str)) {
            return new xg1(Boolean.toString(this.m));
        }
        throw new IllegalArgumentException(String.format("%s.%s is not a function.", Boolean.toString(this.m), str));
    }

    public final String toString() {
        return String.valueOf(this.m);
    }
}
