package androidx.appcompat.view.menu;

import android.os.SystemClock;
/* loaded from: classes.dex */
public class kj implements cc {
    public static final kj a = new kj();

    public static cc d() {
        return a;
    }

    @Override // androidx.appcompat.view.menu.cc
    public final long a() {
        return System.currentTimeMillis();
    }

    @Override // androidx.appcompat.view.menu.cc
    public final long b() {
        return SystemClock.elapsedRealtime();
    }

    @Override // androidx.appcompat.view.menu.cc
    public final long c() {
        return System.nanoTime();
    }
}
