package androidx.appcompat.view.menu;

import androidx.appcompat.view.menu.jo0;
import java.util.List;
/* loaded from: classes.dex */
public abstract class ph0 {
    public static final jo0 a;
    public static jo0.a b;
    public static jo0.a c;
    public static jo0.d d;
    public static jo0.d e;
    public static jo0.d f;

    static {
        jo0 w = jo0.w("android.content.pm.ParceledListSlice");
        a = w;
        b = w.c(new Class[0]);
        c = w.c(List.class);
        d = w.u("append", Object.class);
        e = w.u("getList", new Class[0]);
        f = w.u("setLastSlice", Boolean.TYPE);
    }
}
