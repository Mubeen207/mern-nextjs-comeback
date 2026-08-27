package androidx.appcompat.view.menu;

import android.os.Bundle;
import androidx.appcompat.view.menu.m2;
/* loaded from: classes.dex */
public class rz0 implements m2.d {
    public static final rz0 b = a().a();
    public final String a;

    /* loaded from: classes.dex */
    public static class a {
        public String a;

        public /* synthetic */ a(gb1 gb1Var) {
        }

        public rz0 a() {
            return new rz0(this.a, null);
        }
    }

    public /* synthetic */ rz0(String str, ib1 ib1Var) {
        this.a = str;
    }

    public static a a() {
        return new a(null);
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        String str = this.a;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rz0) {
            return zf0.a(this.a, ((rz0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return zf0.b(this.a);
    }
}
