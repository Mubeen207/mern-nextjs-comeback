package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.xc0;
import androidx.appcompat.view.menu.zc0;
import java.util.ArrayList;
/* loaded from: classes.dex */
public abstract class c8 implements xc0 {
    public Context a;
    public Context b;
    public pc0 c;
    public LayoutInflater d;
    public LayoutInflater e;
    public xc0.a f;
    public int g;
    public int h;
    public zc0 i;

    public c8(Context context, int i, int i2) {
        this.a = context;
        this.d = LayoutInflater.from(context);
        this.g = i;
        this.h = i2;
    }

    public void a(View view, int i) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.i).addView(view, i);
    }

    @Override // androidx.appcompat.view.menu.xc0
    public void b(pc0 pc0Var, boolean z) {
        xc0.a aVar = this.f;
        if (aVar != null) {
            aVar.b(pc0Var, z);
        }
    }

    @Override // androidx.appcompat.view.menu.xc0
    public void c(Context context, pc0 pc0Var) {
        this.b = context;
        this.e = LayoutInflater.from(context);
        this.c = pc0Var;
    }

    public abstract void d(tc0 tc0Var, zc0.a aVar);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.appcompat.view.menu.pc0] */
    @Override // androidx.appcompat.view.menu.xc0
    public boolean e(dy0 dy0Var) {
        xc0.a aVar = this.f;
        dy0 dy0Var2 = dy0Var;
        if (aVar != null) {
            if (dy0Var == null) {
                dy0Var2 = this.c;
            }
            return aVar.c(dy0Var2);
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.xc0
    public void f(boolean z) {
        ViewGroup viewGroup = (ViewGroup) this.i;
        if (viewGroup == null) {
            return;
        }
        pc0 pc0Var = this.c;
        int i = 0;
        if (pc0Var != null) {
            pc0Var.q();
            ArrayList A = this.c.A();
            int size = A.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                tc0 tc0Var = (tc0) A.get(i3);
                if (o(i2, tc0Var)) {
                    View childAt = viewGroup.getChildAt(i2);
                    tc0 itemData = childAt instanceof zc0.a ? ((zc0.a) childAt).getItemData() : null;
                    View n = n(tc0Var, childAt, viewGroup);
                    if (tc0Var != itemData) {
                        n.setPressed(false);
                        n.jumpDrawablesToCurrentState();
                    }
                    if (n != childAt) {
                        a(n, i2);
                    }
                    i2++;
                }
            }
            i = i2;
        }
        while (i < viewGroup.getChildCount()) {
            if (!l(viewGroup, i)) {
                i++;
            }
        }
    }

    @Override // androidx.appcompat.view.menu.xc0
    public boolean h(pc0 pc0Var, tc0 tc0Var) {
        return false;
    }

    public zc0.a i(ViewGroup viewGroup) {
        return (zc0.a) this.d.inflate(this.h, viewGroup, false);
    }

    @Override // androidx.appcompat.view.menu.xc0
    public boolean j(pc0 pc0Var, tc0 tc0Var) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.xc0
    public void k(xc0.a aVar) {
        this.f = aVar;
    }

    public boolean l(ViewGroup viewGroup, int i) {
        viewGroup.removeViewAt(i);
        return true;
    }

    public xc0.a m() {
        return this.f;
    }

    public View n(tc0 tc0Var, View view, ViewGroup viewGroup) {
        zc0.a i = view instanceof zc0.a ? (zc0.a) view : i(viewGroup);
        d(tc0Var, i);
        return (View) i;
    }

    public abstract boolean o(int i, tc0 tc0Var);
}
