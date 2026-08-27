package androidx.appcompat.view.menu;

import java.util.Objects;
/* loaded from: classes.dex */
public class yh0 {
    public int a;
    public String b;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof yh0) {
            yh0 yh0Var = (yh0) obj;
            return this.a == yh0Var.a && Objects.equals(this.b, yh0Var.b);
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), this.b);
    }
}
