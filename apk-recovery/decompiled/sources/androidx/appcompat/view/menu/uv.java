package androidx.appcompat.view.menu;

import androidx.lifecycle.r;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
/* loaded from: classes.dex */
public final class uv extends b61 {
    public static final r.b k = new a();
    public final boolean g;
    public final HashMap d = new HashMap();
    public final HashMap e = new HashMap();
    public final HashMap f = new HashMap();
    public boolean h = false;
    public boolean i = false;
    public boolean j = false;

    /* loaded from: classes.dex */
    public class a implements r.b {
        @Override // androidx.lifecycle.r.b
        public b61 a(Class cls) {
            return new uv(true);
        }
    }

    public uv(boolean z) {
        this.g = z;
    }

    @Override // androidx.appcompat.view.menu.b61
    public void c() {
        if (rv.v0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("onCleared called for ");
            sb.append(this);
        }
        this.h = true;
    }

    public void d(fv fvVar) {
        if (this.j) {
            rv.v0(2);
        } else if (this.d.containsKey(fvVar.e)) {
        } else {
            this.d.put(fvVar.e, fvVar);
            if (rv.v0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Updating retained Fragments: Added ");
                sb.append(fvVar);
            }
        }
    }

    public void e(fv fvVar, boolean z) {
        if (rv.v0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Clearing non-config state for ");
            sb.append(fvVar);
        }
        g(fvVar.e, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || uv.class != obj.getClass()) {
            return false;
        }
        uv uvVar = (uv) obj;
        return this.d.equals(uvVar.d) && this.e.equals(uvVar.e) && this.f.equals(uvVar.f);
    }

    public void f(String str, boolean z) {
        if (rv.v0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Clearing non-config state for saved state of Fragment ");
            sb.append(str);
        }
        g(str, z);
    }

    public final void g(String str, boolean z) {
        uv uvVar = (uv) this.e.get(str);
        if (uvVar != null) {
            if (z) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(uvVar.e.keySet());
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    uvVar.f((String) it.next(), true);
                }
            }
            uvVar.c();
            this.e.remove(str);
        }
        d61 d61Var = (d61) this.f.get(str);
        if (d61Var != null) {
            d61Var.a();
            this.f.remove(str);
        }
    }

    public fv h(String str) {
        return (fv) this.d.get(str);
    }

    public int hashCode() {
        return (((this.d.hashCode() * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
    }

    public uv i(fv fvVar) {
        uv uvVar = (uv) this.e.get(fvVar.e);
        if (uvVar == null) {
            uv uvVar2 = new uv(this.g);
            this.e.put(fvVar.e, uvVar2);
            return uvVar2;
        }
        return uvVar;
    }

    public Collection j() {
        return new ArrayList(this.d.values());
    }

    public d61 k(fv fvVar) {
        d61 d61Var = (d61) this.f.get(fvVar.e);
        if (d61Var == null) {
            d61 d61Var2 = new d61();
            this.f.put(fvVar.e, d61Var2);
            return d61Var2;
        }
        return d61Var;
    }

    public void l(fv fvVar) {
        if (this.j) {
            rv.v0(2);
        } else if (this.d.remove(fvVar.e) == null || !rv.v0(2)) {
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Updating retained Fragments: Removed ");
            sb.append(fvVar);
        }
    }

    public void m(boolean z) {
        this.j = z;
    }

    public boolean n(fv fvVar) {
        if (this.d.containsKey(fvVar.e)) {
            return this.g ? this.h : !this.i;
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.d.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.e.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.f.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
