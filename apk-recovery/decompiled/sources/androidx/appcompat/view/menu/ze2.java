package androidx.appcompat.view.menu;

import java.util.Map;
import java.util.Set;
/* loaded from: classes.dex */
public final class ze2 extends p82 {
    public String d;
    public Set e;
    public Map f;
    public Long g;
    public Long h;

    public ze2(r82 r82Var) {
        super(r82Var);
    }

    public final boolean A(int i, int i2) {
        lf2 lf2Var = (lf2) this.f.get(Integer.valueOf(i));
        if (lf2Var == null) {
            return false;
        }
        return lf2.b(lf2Var).get(i2);
    }

    @Override // androidx.appcompat.view.menu.p82
    public final boolean x() {
        return false;
    }

    public final lf2 y(Integer num) {
        if (this.f.containsKey(num)) {
            return (lf2) this.f.get(num);
        }
        lf2 lf2Var = new lf2(this, this.d);
        this.f.put(num, lf2Var);
        return lf2Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:202:0x0641, code lost:
        if (r8 != false) goto L249;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List z(java.lang.String r53, java.util.List r54, java.util.List r55, java.lang.Long r56, java.lang.Long r57) {
        /*
            Method dump skipped, instructions count: 1782
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ze2.z(java.lang.String, java.util.List, java.util.List, java.lang.Long, java.lang.Long):java.util.List");
    }
}
