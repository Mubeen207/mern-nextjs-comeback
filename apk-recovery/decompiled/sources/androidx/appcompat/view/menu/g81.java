package androidx.appcompat.view.menu;

import android.view.View;
import android.view.WindowId;
/* loaded from: classes.dex */
public class g81 implements h81 {
    public final WindowId a;

    public g81(View view) {
        this.a = view.getWindowId();
    }

    public boolean equals(Object obj) {
        return (obj instanceof g81) && ((g81) obj).a.equals(this.a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }
}
