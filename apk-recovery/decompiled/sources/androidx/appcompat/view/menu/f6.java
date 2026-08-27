package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public final class f6 extends kk0 {
    public final Integer a;

    public f6(Integer num) {
        this.a = num;
    }

    @Override // androidx.appcompat.view.menu.kk0
    public Integer a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kk0) {
            Integer num = this.a;
            Integer a = ((kk0) obj).a();
            return num == null ? a == null : num.equals(a);
        }
        return false;
    }

    public int hashCode() {
        Integer num = this.a;
        return (num == null ? 0 : num.hashCode()) ^ 1000003;
    }

    public String toString() {
        return "ProductData{productId=" + this.a + "}";
    }
}
