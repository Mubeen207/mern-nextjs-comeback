package androidx.appcompat.view.menu;

import android.view.View;
/* loaded from: classes.dex */
public class g61 {
    public final View a;
    public int b;
    public int c;
    public int d;
    public int e;
    public boolean f = true;
    public boolean g = true;

    public g61(View view) {
        this.a = view;
    }

    public void a() {
        View view = this.a;
        p51.V(view, this.d - (view.getTop() - this.b));
        View view2 = this.a;
        p51.U(view2, this.e - (view2.getLeft() - this.c));
    }

    public int b() {
        return this.d;
    }

    public void c() {
        this.b = this.a.getTop();
        this.c = this.a.getLeft();
    }

    public boolean d(int i) {
        if (!this.g || this.e == i) {
            return false;
        }
        this.e = i;
        a();
        return true;
    }

    public boolean e(int i) {
        if (!this.f || this.d == i) {
            return false;
        }
        this.d = i;
        a();
        return true;
    }
}
