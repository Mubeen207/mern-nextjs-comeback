package androidx.appcompat.view.menu;

import android.window.BackEvent;
import androidx.appcompat.view.menu.nd0;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class m7 {
    public final nd0 a;
    public final nd0.c b;

    /* loaded from: classes.dex */
    public class a implements nd0.c {
        public a() {
        }

        @Override // androidx.appcompat.view.menu.nd0.c
        public void C(ld0 ld0Var, nd0.d dVar) {
            dVar.c(null);
        }
    }

    public m7(si siVar) {
        a aVar = new a();
        this.b = aVar;
        nd0 nd0Var = new nd0(siVar, "flutter/backgesture", tw0.b);
        this.a = nd0Var;
        nd0Var.e(aVar);
    }

    public final Map a(BackEvent backEvent) {
        float touchX;
        float touchY;
        float progress;
        int swipeEdge;
        HashMap hashMap = new HashMap(3);
        touchX = backEvent.getTouchX();
        touchY = backEvent.getTouchY();
        hashMap.put("touchOffset", (Float.isNaN(touchX) || Float.isNaN(touchY)) ? null : Arrays.asList(Float.valueOf(touchX), Float.valueOf(touchY)));
        progress = backEvent.getProgress();
        hashMap.put("progress", Float.valueOf(progress));
        swipeEdge = backEvent.getSwipeEdge();
        hashMap.put("swipeEdge", Integer.valueOf(swipeEdge));
        return hashMap;
    }

    public void b() {
        ha0.f("BackGestureChannel", "Sending message to cancel back gesture");
        this.a.c("cancelBackGesture", null);
    }

    public void c() {
        ha0.f("BackGestureChannel", "Sending message to commit back gesture");
        this.a.c("commitBackGesture", null);
    }

    public void d(BackEvent backEvent) {
        ha0.f("BackGestureChannel", "Sending message to start back gesture");
        this.a.c("startBackGesture", a(backEvent));
    }

    public void e(BackEvent backEvent) {
        ha0.f("BackGestureChannel", "Sending message to update back gesture progress");
        this.a.c("updateBackGestureProgress", a(backEvent));
    }
}
