package androidx.appcompat.view.menu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
/* loaded from: classes.dex */
public abstract class ni {

    /* loaded from: classes.dex */
    public static class b {
        public final ud a;
        public final Set b = new HashSet();
        public final Set c = new HashSet();

        public b(ud udVar) {
            this.a = udVar;
        }

        public void a(b bVar) {
            this.b.add(bVar);
        }

        public void b(b bVar) {
            this.c.add(bVar);
        }

        public ud c() {
            return this.a;
        }

        public Set d() {
            return this.b;
        }

        public boolean e() {
            return this.b.isEmpty();
        }

        public boolean f() {
            return this.c.isEmpty();
        }

        public void g(b bVar) {
            this.c.remove(bVar);
        }
    }

    /* loaded from: classes.dex */
    public static class c {
        public final xl0 a;
        public final boolean b;

        public boolean equals(Object obj) {
            if (obj instanceof c) {
                c cVar = (c) obj;
                return cVar.a.equals(this.a) && cVar.b == this.b;
            }
            return false;
        }

        public int hashCode() {
            return ((this.a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.b).hashCode();
        }

        public c(xl0 xl0Var, boolean z) {
            this.a = xl0Var;
            this.b = z;
        }
    }

    public static void a(List list) {
        Set<b> c2 = c(list);
        Set b2 = b(c2);
        int i = 0;
        while (!b2.isEmpty()) {
            b bVar = (b) b2.iterator().next();
            b2.remove(bVar);
            i++;
            for (b bVar2 : bVar.d()) {
                bVar2.g(bVar);
                if (bVar2.f()) {
                    b2.add(bVar2);
                }
            }
        }
        if (i == list.size()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (b bVar3 : c2) {
            if (!bVar3.f() && !bVar3.e()) {
                arrayList.add(bVar3.c());
            }
        }
        throw new kl(arrayList);
    }

    public static Set b(Set set) {
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar.f()) {
                hashSet.add(bVar);
            }
        }
        return hashSet;
    }

    public static Set c(List list) {
        Set<b> set;
        HashMap hashMap = new HashMap(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ud udVar = (ud) it.next();
            b bVar = new b(udVar);
            for (xl0 xl0Var : udVar.j()) {
                c cVar = new c(xl0Var, !udVar.p());
                if (!hashMap.containsKey(cVar)) {
                    hashMap.put(cVar, new HashSet());
                }
                Set set2 = (Set) hashMap.get(cVar);
                if (!set2.isEmpty() && !cVar.b) {
                    throw new IllegalArgumentException(String.format("Multiple components provide %s.", xl0Var));
                }
                set2.add(bVar);
            }
        }
        for (Set<b> set3 : hashMap.values()) {
            for (b bVar2 : set3) {
                for (il ilVar : bVar2.c().g()) {
                    if (ilVar.d() && (set = (Set) hashMap.get(new c(ilVar.b(), ilVar.f()))) != null) {
                        for (b bVar3 : set) {
                            bVar2.a(bVar3);
                            bVar3.b(bVar2);
                        }
                    }
                }
            }
        }
        HashSet hashSet = new HashSet();
        for (Set set4 : hashMap.values()) {
            hashSet.addAll(set4);
        }
        return hashSet;
    }
}
