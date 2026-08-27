package androidx.appcompat.view.menu;

import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class nl implements jl {
    public b81 d;
    public int f;
    public int g;
    public jl a = null;
    public boolean b = false;
    public boolean c = false;
    public a e = a.UNKNOWN;
    public int h = 1;
    public zl i = null;
    public boolean j = false;
    public List k = new ArrayList();
    public List l = new ArrayList();

    /* loaded from: classes.dex */
    public enum a {
        UNKNOWN,
        HORIZONTAL_DIMENSION,
        VERTICAL_DIMENSION,
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        BASELINE
    }

    public nl(b81 b81Var) {
        this.d = b81Var;
    }

    @Override // androidx.appcompat.view.menu.jl
    public void a(jl jlVar) {
        for (nl nlVar : this.l) {
            if (!nlVar.j) {
                return;
            }
        }
        this.c = true;
        jl jlVar2 = this.a;
        if (jlVar2 != null) {
            jlVar2.a(this);
        }
        if (this.b) {
            this.d.a(this);
            return;
        }
        nl nlVar2 = null;
        int i = 0;
        for (nl nlVar3 : this.l) {
            if (!(nlVar3 instanceof zl)) {
                i++;
                nlVar2 = nlVar3;
            }
        }
        if (nlVar2 != null && i == 1 && nlVar2.j) {
            zl zlVar = this.i;
            if (zlVar != null) {
                if (!zlVar.j) {
                    return;
                }
                this.f = this.h * zlVar.g;
            }
            d(nlVar2.g + this.f);
        }
        jl jlVar3 = this.a;
        if (jlVar3 != null) {
            jlVar3.a(this);
        }
    }

    public void b(jl jlVar) {
        this.k.add(jlVar);
        if (this.j) {
            jlVar.a(jlVar);
        }
    }

    public void c() {
        this.l.clear();
        this.k.clear();
        this.j = false;
        this.g = 0;
        this.c = false;
        this.b = false;
    }

    public void d(int i) {
        if (this.j) {
            return;
        }
        this.j = true;
        this.g = i;
        for (jl jlVar : this.k) {
            jlVar.a(jlVar);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.d.b.r());
        sb.append(":");
        sb.append(this.e);
        sb.append("(");
        sb.append(this.j ? Integer.valueOf(this.g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.l.size());
        sb.append(":d=");
        sb.append(this.k.size());
        sb.append(">");
        return sb.toString();
    }
}
