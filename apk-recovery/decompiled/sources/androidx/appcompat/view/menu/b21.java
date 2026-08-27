package androidx.appcompat.view.menu;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class b21 {
    public View b;
    public final Map a = new HashMap();
    public final ArrayList c = new ArrayList();

    public b21(View view) {
        this.b = view;
    }

    public boolean equals(Object obj) {
        if (obj instanceof b21) {
            b21 b21Var = (b21) obj;
            return this.b == b21Var.b && this.a.equals(b21Var.a);
        }
        return false;
    }

    public int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public String toString() {
        String str = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.b + "\n") + "    values:";
        for (String str2 : this.a.keySet()) {
            str = str + "    " + str2 + ": " + this.a.get(str2) + "\n";
        }
        return str;
    }
}
