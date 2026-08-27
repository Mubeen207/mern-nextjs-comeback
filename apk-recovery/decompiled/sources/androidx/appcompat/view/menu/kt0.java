package androidx.appcompat.view.menu;

import java.util.Set;
/* loaded from: classes.dex */
public abstract class kt0 extends jt0 {
    public static Set b() {
        return ho.m;
    }

    public static final Set c(Set set) {
        c60.e(set, "<this>");
        int size = set.size();
        return size != 0 ? size != 1 ? set : jt0.a(set.iterator().next()) : it0.b();
    }
}
