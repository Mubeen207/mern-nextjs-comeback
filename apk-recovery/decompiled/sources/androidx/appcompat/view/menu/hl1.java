package androidx.appcompat.view.menu;

import java.net.URL;
import java.net.URLConnection;
/* loaded from: classes.dex */
public final class hl1 extends bl1 {
    @Override // androidx.appcompat.view.menu.bl1
    public final URLConnection b(URL url, String str) {
        return url.openConnection();
    }

    public hl1() {
    }
}
