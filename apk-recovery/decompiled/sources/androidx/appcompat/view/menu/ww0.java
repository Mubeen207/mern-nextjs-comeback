package androidx.appcompat.view.menu;

import android.os.SystemClock;
/* loaded from: classes.dex */
public abstract class ww0 {
    public static ww0 a(long j, long j2, long j3) {
        return new j6(j, j2, j3);
    }

    public static ww0 e() {
        return a(System.currentTimeMillis(), SystemClock.elapsedRealtime(), SystemClock.uptimeMillis());
    }

    public abstract long b();

    public abstract long c();

    public abstract long d();
}
