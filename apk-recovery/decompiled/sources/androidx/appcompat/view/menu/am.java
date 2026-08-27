package androidx.appcompat.view.menu;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
/* loaded from: classes.dex */
public final class am {
    public final hj0 a = new jj0(10);
    public final qu0 b = new qu0();
    public final ArrayList c = new ArrayList();
    public final HashSet d = new HashSet();

    public void a(Object obj, Object obj2) {
        if (!this.b.containsKey(obj) || !this.b.containsKey(obj2)) {
            throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
        }
        ArrayList arrayList = (ArrayList) this.b.get(obj);
        if (arrayList == null) {
            arrayList = f();
            this.b.put(obj, arrayList);
        }
        arrayList.add(obj2);
    }

    public void b(Object obj) {
        if (this.b.containsKey(obj)) {
            return;
        }
        this.b.put(obj, null);
    }

    public void c() {
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            ArrayList arrayList = (ArrayList) this.b.m(i);
            if (arrayList != null) {
                j(arrayList);
            }
        }
        this.b.clear();
    }

    public boolean d(Object obj) {
        return this.b.containsKey(obj);
    }

    public final void e(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) this.b.get(obj);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                e(arrayList2.get(i), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }

    public final ArrayList f() {
        ArrayList arrayList = (ArrayList) this.a.b();
        return arrayList == null ? new ArrayList() : arrayList;
    }

    public List g(Object obj) {
        int size = this.b.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            ArrayList arrayList2 = (ArrayList) this.b.m(i);
            if (arrayList2 != null && arrayList2.contains(obj)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(this.b.i(i));
            }
        }
        return arrayList;
    }

    public ArrayList h() {
        this.c.clear();
        this.d.clear();
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            e(this.b.i(i), this.c, this.d);
        }
        return this.c;
    }

    public boolean i(Object obj) {
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            ArrayList arrayList = (ArrayList) this.b.m(i);
            if (arrayList != null && arrayList.contains(obj)) {
                return true;
            }
        }
        return false;
    }

    public final void j(ArrayList arrayList) {
        arrayList.clear();
        this.a.a(arrayList);
    }
}
