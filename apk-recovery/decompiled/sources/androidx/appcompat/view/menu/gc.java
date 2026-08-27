package androidx.appcompat.view.menu;

import java.io.Closeable;
/* loaded from: classes.dex */
public abstract class gc {
    public static final void a(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                pp.a(th, th2);
            }
        }
    }
}
