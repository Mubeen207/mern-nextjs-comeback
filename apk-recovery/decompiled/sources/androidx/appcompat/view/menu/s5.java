package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public final class s5 extends wo {
    public final Integer a;
    public final Object b;
    public final wj0 c;
    public final kk0 d;

    public s5(Integer num, Object obj, wj0 wj0Var, kk0 kk0Var) {
        this.a = num;
        if (obj == null) {
            throw new NullPointerException("Null payload");
        }
        this.b = obj;
        if (wj0Var == null) {
            throw new NullPointerException("Null priority");
        }
        this.c = wj0Var;
        this.d = kk0Var;
    }

    @Override // androidx.appcompat.view.menu.wo
    public Integer a() {
        return this.a;
    }

    @Override // androidx.appcompat.view.menu.wo
    public Object b() {
        return this.b;
    }

    @Override // androidx.appcompat.view.menu.wo
    public wj0 c() {
        return this.c;
    }

    @Override // androidx.appcompat.view.menu.wo
    public kk0 d() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof wo) {
            wo woVar = (wo) obj;
            Integer num = this.a;
            if (num != null ? num.equals(woVar.a()) : woVar.a() == null) {
                if (this.b.equals(woVar.b()) && this.c.equals(woVar.c())) {
                    kk0 kk0Var = this.d;
                    if (kk0Var == null) {
                        if (woVar.d() == null) {
                            return true;
                        }
                    } else if (kk0Var.equals(woVar.d())) {
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        Integer num = this.a;
        int hashCode = ((((((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003;
        kk0 kk0Var = this.d;
        return hashCode ^ (kk0Var != null ? kk0Var.hashCode() : 0);
    }

    public String toString() {
        return "Event{code=" + this.a + ", payload=" + this.b + ", priority=" + this.c + ", productData=" + this.d + "}";
    }
}
