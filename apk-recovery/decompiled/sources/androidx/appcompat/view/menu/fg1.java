package androidx.appcompat.view.menu;

import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public final class fg1 implements tg1 {
    public final tg1 m;
    public final String n;

    public fg1(String str) {
        this.m = tg1.e;
        this.n = str;
    }

    public final tg1 a() {
        return this.m;
    }

    public final String b() {
        return this.n;
    }

    @Override // androidx.appcompat.view.menu.tg1
    public final tg1 c() {
        return new fg1(this.n, this.m.c());
    }

    @Override // androidx.appcompat.view.menu.tg1
    public final Boolean d() {
        throw new IllegalStateException("Control is not a boolean");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof fg1) {
            fg1 fg1Var = (fg1) obj;
            return this.n.equals(fg1Var.n) && this.m.equals(fg1Var.m);
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.tg1
    public final Double f() {
        throw new IllegalStateException("Control is not a double");
    }

    @Override // androidx.appcompat.view.menu.tg1
    public final String g() {
        throw new IllegalStateException("Control is not a String");
    }

    public final int hashCode() {
        return (this.n.hashCode() * 31) + this.m.hashCode();
    }

    @Override // androidx.appcompat.view.menu.tg1
    public final Iterator i() {
        return null;
    }

    @Override // androidx.appcompat.view.menu.tg1
    public final tg1 p(String str, sw1 sw1Var, List list) {
        throw new IllegalStateException("Control does not have functions");
    }

    public fg1(String str, tg1 tg1Var) {
        this.m = tg1Var;
        this.n = str;
    }
}
