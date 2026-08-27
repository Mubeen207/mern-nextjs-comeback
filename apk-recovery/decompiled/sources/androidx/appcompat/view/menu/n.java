package androidx.appcompat.view.menu;

import java.util.AbstractList;
import java.util.List;
/* loaded from: classes.dex */
public abstract class n extends AbstractList implements List {
    public abstract int d();

    public abstract Object f(int i);

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ Object remove(int i) {
        return f(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return d();
    }
}
