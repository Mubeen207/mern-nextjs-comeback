package androidx.appcompat.view.menu;

import java.util.Random;
/* loaded from: classes.dex */
public abstract class o extends tn0 {
    @Override // androidx.appcompat.view.menu.tn0
    public int b() {
        return c().nextInt();
    }

    public abstract Random c();
}
