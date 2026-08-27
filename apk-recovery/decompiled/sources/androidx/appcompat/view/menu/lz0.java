package androidx.appcompat.view.menu;

import android.content.Intent;
import java.util.LinkedList;
import java.util.List;
/* loaded from: classes.dex */
public class lz0 {
    public final int a;
    public final int b;
    public final String c;
    public Intent d;
    public final List e = new LinkedList();

    public lz0(int i, int i2, String str) {
        this.a = i;
        this.b = i2;
        this.c = str;
    }

    public void a(p1 p1Var) {
        this.e.add(p1Var);
    }

    public p1 b() {
        for (int size = this.e.size() - 1; size >= 0; size--) {
            p1 p1Var = (p1) this.e.get(size);
            if (!p1Var.s) {
                return p1Var;
            }
        }
        return null;
    }

    public boolean c() {
        for (p1 p1Var : this.e) {
            if (!p1Var.s) {
                return false;
            }
        }
        return true;
    }

    public void d(p1 p1Var) {
        this.e.remove(p1Var);
    }
}
