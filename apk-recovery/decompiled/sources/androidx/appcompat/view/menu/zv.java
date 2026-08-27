package androidx.appcompat.view.menu;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public class zv {
    public final ArrayList a = new ArrayList();
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public uv d;

    public void a(fv fvVar) {
        if (this.a.contains(fvVar)) {
            throw new IllegalStateException("Fragment already added: " + fvVar);
        }
        synchronized (this.a) {
            this.a.add(fvVar);
        }
        fvVar.k = true;
    }

    public void b() {
        this.b.values().removeAll(Collections.singleton(null));
    }

    public boolean c(String str) {
        return this.b.get(str) != null;
    }

    public void d(int i) {
        for (yv yvVar : this.b.values()) {
            if (yvVar != null) {
                yvVar.r(i);
            }
        }
    }

    public fv e(String str) {
        yv yvVar = (yv) this.b.get(str);
        if (yvVar != null) {
            return yvVar.k();
        }
        return null;
    }

    public fv f(int i) {
        for (int size = this.a.size() - 1; size >= 0; size--) {
            fv fvVar = (fv) this.a.get(size);
            if (fvVar != null && fvVar.w == i) {
                return fvVar;
            }
        }
        for (yv yvVar : this.b.values()) {
            if (yvVar != null) {
                fv k = yvVar.k();
                if (k.w == i) {
                    return k;
                }
            }
        }
        return null;
    }

    public fv g(String str) {
        if (str != null) {
            for (int size = this.a.size() - 1; size >= 0; size--) {
                fv fvVar = (fv) this.a.get(size);
                if (fvVar != null && str.equals(fvVar.y)) {
                    return fvVar;
                }
            }
        }
        if (str != null) {
            for (yv yvVar : this.b.values()) {
                if (yvVar != null) {
                    fv k = yvVar.k();
                    if (str.equals(k.y)) {
                        return k;
                    }
                }
            }
            return null;
        }
        return null;
    }

    public int h(fv fvVar) {
        View view;
        View view2;
        ViewGroup viewGroup = fvVar.G;
        if (viewGroup == null) {
            return -1;
        }
        int indexOf = this.a.indexOf(fvVar);
        for (int i = indexOf - 1; i >= 0; i--) {
            fv fvVar2 = (fv) this.a.get(i);
            if (fvVar2.G == viewGroup && (view2 = fvVar2.H) != null) {
                return viewGroup.indexOfChild(view2) + 1;
            }
        }
        while (true) {
            indexOf++;
            if (indexOf >= this.a.size()) {
                return -1;
            }
            fv fvVar3 = (fv) this.a.get(indexOf);
            if (fvVar3.G == viewGroup && (view = fvVar3.H) != null) {
                return viewGroup.indexOfChild(view);
            }
        }
    }

    public List i() {
        ArrayList arrayList = new ArrayList();
        for (yv yvVar : this.b.values()) {
            if (yvVar != null) {
                arrayList.add(yvVar);
            }
        }
        return arrayList;
    }

    public List j() {
        ArrayList arrayList = new ArrayList();
        for (yv yvVar : this.b.values()) {
            if (yvVar != null) {
                arrayList.add(yvVar.k());
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public HashMap k() {
        return this.c;
    }

    public yv l(String str) {
        return (yv) this.b.get(str);
    }

    public List m() {
        ArrayList arrayList;
        if (this.a.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.a) {
            arrayList = new ArrayList(this.a);
        }
        return arrayList;
    }

    public uv n() {
        return this.d;
    }

    public Bundle o(String str) {
        return (Bundle) this.c.get(str);
    }

    public void p(yv yvVar) {
        fv k = yvVar.k();
        if (c(k.e)) {
            return;
        }
        this.b.put(k.e, yvVar);
        if (k.C) {
            if (k.B) {
                this.d.d(k);
            } else {
                this.d.l(k);
            }
            k.C = false;
        }
        if (rv.v0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Added fragment to active set ");
            sb.append(k);
        }
    }

    public void q(yv yvVar) {
        fv k = yvVar.k();
        if (k.B) {
            this.d.l(k);
        }
        if (this.b.get(k.e) == yvVar && ((yv) this.b.put(k.e, null)) != null && rv.v0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Removed fragment from active set ");
            sb.append(k);
        }
    }

    public void r() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            yv yvVar = (yv) this.b.get(((fv) it.next()).e);
            if (yvVar != null) {
                yvVar.m();
            }
        }
        for (yv yvVar2 : this.b.values()) {
            if (yvVar2 != null) {
                yvVar2.m();
                fv k = yvVar2.k();
                if (k.l && !k.V()) {
                    if (k.n && !this.c.containsKey(k.e)) {
                        z(k.e, yvVar2.p());
                    }
                    q(yvVar2);
                }
            }
        }
    }

    public void s(fv fvVar) {
        synchronized (this.a) {
            this.a.remove(fvVar);
        }
        fvVar.k = false;
    }

    public void t() {
        this.b.clear();
    }

    public void u(List list) {
        this.a.clear();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                fv e = e(str);
                if (e == null) {
                    throw new IllegalStateException("No instantiated fragment for (" + str + ")");
                }
                if (rv.v0(2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("restoreSaveState: added (");
                    sb.append(str);
                    sb.append("): ");
                    sb.append(e);
                }
                a(e);
            }
        }
    }

    public void v(HashMap hashMap) {
        this.c.clear();
        this.c.putAll(hashMap);
    }

    public ArrayList w() {
        ArrayList arrayList = new ArrayList(this.b.size());
        for (yv yvVar : this.b.values()) {
            if (yvVar != null) {
                fv k = yvVar.k();
                z(k.e, yvVar.p());
                arrayList.add(k.e);
                if (rv.v0(2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Saved state of ");
                    sb.append(k);
                    sb.append(": ");
                    sb.append(k.b);
                }
            }
        }
        return arrayList;
    }

    public ArrayList x() {
        synchronized (this.a) {
            try {
                if (this.a.isEmpty()) {
                    return null;
                }
                ArrayList arrayList = new ArrayList(this.a.size());
                Iterator it = this.a.iterator();
                while (it.hasNext()) {
                    fv fvVar = (fv) it.next();
                    arrayList.add(fvVar.e);
                    if (rv.v0(2)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("saveAllState: adding fragment (");
                        sb.append(fvVar.e);
                        sb.append("): ");
                        sb.append(fvVar);
                    }
                }
                return arrayList;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void y(uv uvVar) {
        this.d = uvVar;
    }

    public Bundle z(String str, Bundle bundle) {
        return bundle != null ? (Bundle) this.c.put(str, bundle) : (Bundle) this.c.remove(str);
    }
}
