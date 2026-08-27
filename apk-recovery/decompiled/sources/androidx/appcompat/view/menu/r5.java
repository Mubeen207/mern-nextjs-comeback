package androidx.appcompat.view.menu;

import android.content.Context;
/* loaded from: classes.dex */
public final class r5 extends di {
    public final Context a;
    public final ec b;
    public final ec c;
    public final String d;

    public r5(Context context, ec ecVar, ec ecVar2, String str) {
        if (context == null) {
            throw new NullPointerException("Null applicationContext");
        }
        this.a = context;
        if (ecVar == null) {
            throw new NullPointerException("Null wallClock");
        }
        this.b = ecVar;
        if (ecVar2 == null) {
            throw new NullPointerException("Null monotonicClock");
        }
        this.c = ecVar2;
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.d = str;
    }

    @Override // androidx.appcompat.view.menu.di
    public Context b() {
        return this.a;
    }

    @Override // androidx.appcompat.view.menu.di
    public String c() {
        return this.d;
    }

    @Override // androidx.appcompat.view.menu.di
    public ec d() {
        return this.c;
    }

    @Override // androidx.appcompat.view.menu.di
    public ec e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof di) {
            di diVar = (di) obj;
            return this.a.equals(diVar.b()) && this.b.equals(diVar.e()) && this.c.equals(diVar.d()) && this.d.equals(diVar.c());
        }
        return false;
    }

    public int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public String toString() {
        return "CreationContext{applicationContext=" + this.a + ", wallClock=" + this.b + ", monotonicClock=" + this.c + ", backendName=" + this.d + "}";
    }
}
