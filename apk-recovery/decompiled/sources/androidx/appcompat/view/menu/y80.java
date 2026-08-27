package androidx.appcompat.view.menu;

import android.content.Context;
/* loaded from: classes.dex */
public abstract class y80 {

    /* loaded from: classes.dex */
    public interface a {
        String a(Object obj);
    }

    public static ud b(String str, String str2) {
        return ud.l(w80.a(str, str2), w80.class);
    }

    public static ud c(final String str, final a aVar) {
        return ud.m(w80.class).b(il.j(Context.class)).f(new de() { // from class: androidx.appcompat.view.menu.x80
            @Override // androidx.appcompat.view.menu.de
            public final Object a(xd xdVar) {
                w80 d;
                d = y80.d(str, aVar, xdVar);
                return d;
            }
        }).d();
    }

    public static /* synthetic */ w80 d(String str, a aVar, xd xdVar) {
        return w80.a(str, aVar.a((Context) xdVar.a(Context.class)));
    }
}
