package androidx.appcompat.view.menu;

import androidx.appcompat.view.menu.q00;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class w6 extends q00.a implements n30 {
    public static final w6 l = new w6();

    public static w6 h() {
        return l;
    }

    @Override // androidx.appcompat.view.menu.q00
    public int P(y6 y6Var, int i) {
        ArrayList<tp> arrayList = new ArrayList();
        arrayList.add(new vo0());
        arrayList.add(new ci());
        o50 o50Var = y6Var.o;
        for (tp tpVar : arrayList) {
            int a = tpVar.a(y6Var, o50Var, i);
            if (a != 0) {
                return a;
            }
        }
        return 0;
    }

    @Override // androidx.appcompat.view.menu.q00
    public int b1(y6 y6Var, boolean z, int i) {
        ArrayList<tp> arrayList = new ArrayList();
        if (z) {
            arrayList.add(new uo0());
        }
        arrayList.add(new vo0());
        o50 o50Var = y6Var.o;
        for (tp tpVar : arrayList) {
            int a = tpVar.a(y6Var, o50Var, i);
            if (a != 0) {
                return a;
            }
        }
        return 0;
    }

    @Override // androidx.appcompat.view.menu.n30
    public void j() {
    }

    @Override // androidx.appcompat.view.menu.q00
    public int j1(y6 y6Var) {
        ArrayList<tp> arrayList = new ArrayList();
        arrayList.add(new bi());
        arrayList.add(new eh());
        o50 o50Var = y6Var.o;
        for (tp tpVar : arrayList) {
            int a = tpVar.a(y6Var, o50Var, -1);
            if (a != 0) {
                return a;
            }
        }
        return 0;
    }

    @Override // androidx.appcompat.view.menu.q00
    public int w(y6 y6Var, int i) {
        ArrayList<tp> arrayList = new ArrayList();
        arrayList.add(new ci());
        arrayList.add(new bi());
        arrayList.add(new eh());
        o50 o50Var = y6Var.o;
        for (tp tpVar : arrayList) {
            int a = tpVar.a(y6Var, o50Var, i);
            if (a != 0) {
                return a;
            }
        }
        return 0;
    }
}
