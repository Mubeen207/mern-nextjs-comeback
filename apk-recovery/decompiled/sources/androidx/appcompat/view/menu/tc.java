package androidx.appcompat.view.menu;

import java.util.Collection;
/* loaded from: classes.dex */
public abstract class tc extends sc {
    public static int j(Iterable iterable, int i) {
        c60.e(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).size() : i;
    }
}
