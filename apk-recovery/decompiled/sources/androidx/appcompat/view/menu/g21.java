package androidx.appcompat.view.menu;

import android.util.Base64;
import androidx.appcompat.view.menu.l6;
/* loaded from: classes.dex */
public abstract class g21 {

    /* loaded from: classes.dex */
    public static abstract class a {
        public abstract g21 a();

        public abstract a b(String str);

        public abstract a c(byte[] bArr);

        public abstract a d(wj0 wj0Var);
    }

    public static a a() {
        return new l6.b().d(wj0.DEFAULT);
    }

    public abstract String b();

    public abstract byte[] c();

    public abstract wj0 d();

    public boolean e() {
        return c() != null;
    }

    public g21 f(wj0 wj0Var) {
        return a().b(b()).d(wj0Var).c(c()).a();
    }

    public final String toString() {
        Object[] objArr = new Object[3];
        objArr[0] = b();
        objArr[1] = d();
        objArr[2] = c() == null ? "" : Base64.encodeToString(c(), 2);
        return String.format("TransportContext(%s, %s, %s)", objArr);
    }
}
