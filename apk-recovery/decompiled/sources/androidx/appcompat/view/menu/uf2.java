package androidx.appcompat.view.menu;

import java.util.List;
import java.util.concurrent.Callable;
/* loaded from: classes.dex */
public final class uf2 extends jg1 {
    public final Callable o;

    public uf2(String str, Callable callable) {
        super(str);
        this.o = callable;
    }

    @Override // androidx.appcompat.view.menu.jg1
    public final tg1 a(sw1 sw1Var, List list) {
        try {
            return b12.b(this.o.call());
        } catch (Exception unused) {
            return tg1.e;
        }
    }
}
