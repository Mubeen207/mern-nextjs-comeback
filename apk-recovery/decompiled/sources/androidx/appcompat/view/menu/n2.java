package androidx.appcompat.view.menu;

import android.window.BackEvent;
/* loaded from: classes.dex */
public final class n2 {
    public static final n2 a = new n2();

    public final BackEvent a(float f, float f2, float f3, int i) {
        return new BackEvent(f, f2, f3, i);
    }

    public final float b(BackEvent backEvent) {
        c60.e(backEvent, "backEvent");
        return backEvent.getProgress();
    }

    public final int c(BackEvent backEvent) {
        c60.e(backEvent, "backEvent");
        return backEvent.getSwipeEdge();
    }

    public final float d(BackEvent backEvent) {
        c60.e(backEvent, "backEvent");
        return backEvent.getTouchX();
    }

    public final float e(BackEvent backEvent) {
        c60.e(backEvent, "backEvent");
        return backEvent.getTouchY();
    }
}
