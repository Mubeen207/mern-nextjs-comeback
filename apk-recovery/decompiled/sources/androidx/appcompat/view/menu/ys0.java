package androidx.appcompat.view.menu;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
/* loaded from: classes.dex */
public abstract class ys0 extends xs0 {
    public static final Collection c(ss0 ss0Var, Collection collection) {
        c60.e(ss0Var, "<this>");
        c60.e(collection, "destination");
        for (Object obj : ss0Var) {
            collection.add(obj);
        }
        return collection;
    }

    public static List d(ss0 ss0Var) {
        List h;
        c60.e(ss0Var, "<this>");
        h = sc.h(e(ss0Var));
        return h;
    }

    public static final List e(ss0 ss0Var) {
        c60.e(ss0Var, "<this>");
        return (List) c(ss0Var, new ArrayList());
    }
}
