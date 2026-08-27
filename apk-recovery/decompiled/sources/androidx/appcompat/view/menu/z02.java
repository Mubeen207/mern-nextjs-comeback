package androidx.appcompat.view.menu;

import android.os.RemoteException;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
/* loaded from: classes.dex */
public abstract class z02 extends yf2 {
    public final int l;

    public z02(byte[] bArr) {
        pj0.a(bArr.length == 25);
        this.l = Arrays.hashCode(bArr);
    }

    public static byte[] k(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    @Override // androidx.appcompat.view.menu.cg2
    public final int c() {
        return this.l;
    }

    @Override // androidx.appcompat.view.menu.cg2
    public final g20 d() {
        return yf0.k(u2());
    }

    public final boolean equals(Object obj) {
        g20 d;
        if (obj != null && (obj instanceof cg2)) {
            try {
                cg2 cg2Var = (cg2) obj;
                if (cg2Var.c() == this.l && (d = cg2Var.d()) != null) {
                    return Arrays.equals(u2(), (byte[]) yf0.j(d));
                }
                return false;
            } catch (RemoteException unused) {
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.l;
    }

    public abstract byte[] u2();
}
