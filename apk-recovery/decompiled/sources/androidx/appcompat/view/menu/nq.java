package androidx.appcompat.view.menu;

import androidx.window.extensions.WindowExtensionsProvider;
/* loaded from: classes.dex */
public final class nq {
    public static final nq a = new nq();
    public static final String b = go0.b(nq.class).c();

    public final int a() {
        try {
            return WindowExtensionsProvider.getWindowExtensions().getVendorApiLevel();
        } catch (NoClassDefFoundError unused) {
            z8.a.a();
            h51 h51Var = h51.STRICT;
            return 0;
        } catch (UnsupportedOperationException unused2) {
            z8.a.a();
            h51 h51Var2 = h51.STRICT;
            return 0;
        }
    }
}
