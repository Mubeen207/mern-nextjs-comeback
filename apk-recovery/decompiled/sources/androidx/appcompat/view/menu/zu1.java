package androidx.appcompat.view.menu;

import android.os.Binder;
/* loaded from: classes.dex */
public abstract /* synthetic */ class zu1 {
    public static Object a(xu1 xu1Var) {
        try {
            return xu1Var.a();
        } catch (SecurityException unused) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                return xu1Var.a();
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
    }
}
