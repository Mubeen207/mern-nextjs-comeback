package androidx.appcompat.view.menu;

import android.os.Looper;
import java.util.List;
/* loaded from: classes.dex */
public final class d2 implements ua0 {
    @Override // androidx.appcompat.view.menu.ua0
    public String a() {
        return "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used";
    }

    @Override // androidx.appcompat.view.menu.ua0
    public ta0 b(List list) {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            return new uy(wy.a(mainLooper, true), null, 2, null);
        }
        throw new IllegalStateException("The main looper is not available");
    }

    @Override // androidx.appcompat.view.menu.ua0
    public int c() {
        return 1073741823;
    }
}
