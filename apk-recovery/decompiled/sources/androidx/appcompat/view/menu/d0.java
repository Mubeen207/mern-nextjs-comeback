package androidx.appcompat.view.menu;

import android.view.MotionEvent;
/* loaded from: classes.dex */
public class d0 {
    public io.flutter.view.a a;

    public boolean a(MotionEvent motionEvent, boolean z) {
        io.flutter.view.a aVar = this.a;
        if (aVar == null) {
            return false;
        }
        return aVar.J(motionEvent, z);
    }

    public void b(io.flutter.view.a aVar) {
        this.a = aVar;
    }
}
