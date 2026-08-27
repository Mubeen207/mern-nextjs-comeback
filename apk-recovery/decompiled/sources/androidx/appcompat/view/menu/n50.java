package androidx.appcompat.view.menu;

import android.view.View;
import androidx.appcompat.view.menu.b91;
import androidx.appcompat.view.menu.o81;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public class n50 extends o81.b {
    public final View c;
    public int d;
    public int e;
    public final int[] f;

    public n50(View view) {
        super(0);
        this.f = new int[2];
        this.c = view;
    }

    @Override // androidx.appcompat.view.menu.o81.b
    public void b(o81 o81Var) {
        this.c.setTranslationY(0.0f);
    }

    @Override // androidx.appcompat.view.menu.o81.b
    public void c(o81 o81Var) {
        this.c.getLocationOnScreen(this.f);
        this.d = this.f[1];
    }

    @Override // androidx.appcompat.view.menu.o81.b
    public b91 d(b91 b91Var, List list) {
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            o81 o81Var = (o81) it.next();
            if ((o81Var.c() & b91.m.c()) != 0) {
                this.c.setTranslationY(j2.c(this.e, 0, o81Var.b()));
                break;
            }
        }
        return b91Var;
    }

    @Override // androidx.appcompat.view.menu.o81.b
    public o81.a e(o81 o81Var, o81.a aVar) {
        this.c.getLocationOnScreen(this.f);
        int i = this.d - this.f[1];
        this.e = i;
        this.c.setTranslationY(i);
        return aVar;
    }
}
