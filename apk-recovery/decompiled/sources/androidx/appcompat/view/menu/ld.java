package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public final class ld {
    public final Object a;
    public final kw b;
    public final Object c;
    public final Throwable d;

    public ld(Object obj, t9 t9Var, kw kwVar, Object obj2, Throwable th) {
        this.a = obj;
        this.b = kwVar;
        this.c = obj2;
        this.d = th;
    }

    public static /* synthetic */ ld b(ld ldVar, Object obj, t9 t9Var, kw kwVar, Object obj2, Throwable th, int i, Object obj3) {
        if ((i & 1) != 0) {
            obj = ldVar.a;
        }
        if ((i & 2) != 0) {
            ldVar.getClass();
            t9Var = null;
        }
        t9 t9Var2 = t9Var;
        if ((i & 4) != 0) {
            kwVar = ldVar.b;
        }
        kw kwVar2 = kwVar;
        if ((i & 8) != 0) {
            obj2 = ldVar.c;
        }
        Object obj4 = obj2;
        if ((i & 16) != 0) {
            th = ldVar.d;
        }
        return ldVar.a(obj, t9Var2, kwVar2, obj4, th);
    }

    public final ld a(Object obj, t9 t9Var, kw kwVar, Object obj2, Throwable th) {
        return new ld(obj, t9Var, kwVar, obj2, th);
    }

    public final boolean c() {
        return this.d != null;
    }

    public final void d(y9 y9Var, Throwable th) {
        kw kwVar = this.b;
        if (kwVar != null) {
            y9Var.m(kwVar, th);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ld) {
            ld ldVar = (ld) obj;
            return c60.a(this.a, ldVar.a) && c60.a(null, null) && c60.a(this.b, ldVar.b) && c60.a(this.c, ldVar.c) && c60.a(this.d, ldVar.d);
        }
        return false;
    }

    public int hashCode() {
        Object obj = this.a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 961;
        kw kwVar = this.b;
        int hashCode2 = (hashCode + (kwVar == null ? 0 : kwVar.hashCode())) * 31;
        Object obj2 = this.c;
        int hashCode3 = (hashCode2 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.d;
        return hashCode3 + (th != null ? th.hashCode() : 0);
    }

    public String toString() {
        return "CompletedContinuation(result=" + this.a + ", cancelHandler=" + ((Object) null) + ", onCancellation=" + this.b + ", idempotentResume=" + this.c + ", cancelCause=" + this.d + ')';
    }

    public /* synthetic */ ld(Object obj, t9 t9Var, kw kwVar, Object obj2, Throwable th, int i, lj ljVar) {
        this(obj, (i & 2) != 0 ? null : t9Var, (i & 4) != 0 ? null : kwVar, (i & 8) != 0 ? null : obj2, (i & 16) != 0 ? null : th);
    }
}
