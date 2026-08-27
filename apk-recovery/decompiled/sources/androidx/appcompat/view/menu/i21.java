package androidx.appcompat.view.menu;

import java.util.Set;
/* loaded from: classes.dex */
public final class i21 implements h21 {
    public final Set a;
    public final g21 b;
    public final l21 c;

    public i21(Set set, g21 g21Var, l21 l21Var) {
        this.a = set;
        this.b = g21Var;
        this.c = l21Var;
    }

    @Override // androidx.appcompat.view.menu.h21
    public e21 a(String str, Class cls, lo loVar, u11 u11Var) {
        if (this.a.contains(loVar)) {
            return new k21(this.b, str, loVar, u11Var, this.c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", loVar, this.a));
    }
}
