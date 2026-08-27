package androidx.appcompat.view.menu;

import android.view.ViewGroup;
import androidx.lifecycle.f;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
/* loaded from: classes.dex */
public abstract class cw {
    public final jv a;
    public final ClassLoader b;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public boolean i;
    public String k;
    public int l;
    public CharSequence m;
    public int n;
    public CharSequence o;
    public ArrayList p;
    public ArrayList q;
    public ArrayList s;
    public ArrayList c = new ArrayList();
    public boolean j = true;
    public boolean r = false;

    /* loaded from: classes.dex */
    public static final class a {
        public int a;
        public fv b;
        public boolean c;
        public int d;
        public int e;
        public int f;
        public int g;
        public f.b h;
        public f.b i;

        public a() {
        }

        public a(int i, fv fvVar) {
            this.a = i;
            this.b = fvVar;
            this.c = false;
            f.b bVar = f.b.RESUMED;
            this.h = bVar;
            this.i = bVar;
        }

        public a(int i, fv fvVar, boolean z) {
            this.a = i;
            this.b = fvVar;
            this.c = z;
            f.b bVar = f.b.RESUMED;
            this.h = bVar;
            this.i = bVar;
        }
    }

    public cw(jv jvVar, ClassLoader classLoader) {
        this.a = jvVar;
        this.b = classLoader;
    }

    public cw b(int i, fv fvVar, String str) {
        j(i, fvVar, str, 1);
        return this;
    }

    public cw c(ViewGroup viewGroup, fv fvVar, String str) {
        fvVar.G = viewGroup;
        return b(viewGroup.getId(), fvVar, str);
    }

    public void d(a aVar) {
        this.c.add(aVar);
        aVar.d = this.d;
        aVar.e = this.e;
        aVar.f = this.f;
        aVar.g = this.g;
    }

    public abstract int e();

    public abstract int f();

    public abstract void g();

    public abstract void h();

    public cw i() {
        if (this.i) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        this.j = false;
        return this;
    }

    public void j(int i, fv fvVar, String str, int i2) {
        String str2 = fvVar.P;
        if (str2 != null) {
            bw.f(fvVar, str2);
        }
        Class<?> cls = fvVar.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = fvVar.y;
            if (str3 != null && !str.equals(str3)) {
                throw new IllegalStateException("Can't change tag of fragment " + fvVar + ": was " + fvVar.y + " now " + str);
            }
            fvVar.y = str;
        }
        if (i != 0) {
            if (i == -1) {
                throw new IllegalArgumentException("Can't add fragment " + fvVar + " with tag " + str + " to container view with no id");
            }
            int i3 = fvVar.w;
            if (i3 != 0 && i3 != i) {
                throw new IllegalStateException("Can't change container ID of fragment " + fvVar + ": was " + fvVar.w + " now " + i);
            }
            fvVar.w = i;
            fvVar.x = i;
        }
        d(new a(i2, fvVar));
    }

    public cw k(fv fvVar) {
        d(new a(3, fvVar));
        return this;
    }

    public cw l(int i, fv fvVar) {
        return m(i, fvVar, null);
    }

    public cw m(int i, fv fvVar, String str) {
        if (i != 0) {
            j(i, fvVar, str, 2);
            return this;
        }
        throw new IllegalArgumentException("Must use non-zero containerViewId");
    }

    public cw n(boolean z) {
        this.r = z;
        return this;
    }
}
