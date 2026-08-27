package androidx.appcompat.view.menu;

import java.util.concurrent.Callable;
/* loaded from: classes.dex */
public final class if2 extends sf2 {
    public final Callable f;

    public /* synthetic */ if2(Callable callable, cf2 cf2Var) {
        super();
        this.f = callable;
    }

    @Override // androidx.appcompat.view.menu.sf2
    public final String a() {
        try {
            return (String) this.f.call();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
