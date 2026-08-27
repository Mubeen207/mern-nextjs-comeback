package androidx.appcompat.view.menu;

import java.util.Collection;
import java.util.Map;
/* loaded from: classes.dex */
public abstract class m implements ie0 {
    @Override // androidx.appcompat.view.menu.ie0
    public abstract Map a();

    public boolean b(Object obj) {
        for (Collection collection : a().values()) {
            if (collection.contains(obj)) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(Object obj) {
        return je0.a(this, obj);
    }

    public int hashCode() {
        return a().hashCode();
    }

    public String toString() {
        return a().toString();
    }
}
