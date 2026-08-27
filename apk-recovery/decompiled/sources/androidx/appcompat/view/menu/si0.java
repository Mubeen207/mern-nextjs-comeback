package androidx.appcompat.view.menu;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
/* loaded from: classes.dex */
public final class si0 extends o {
    @Override // androidx.appcompat.view.menu.o
    public Random c() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        c60.d(current, "current()");
        return current;
    }
}
