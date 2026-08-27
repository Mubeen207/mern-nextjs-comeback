package androidx.appcompat.view.menu;

import androidx.appcompat.view.menu.g21;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class l6 extends g21 {
    public final String a;
    public final byte[] b;
    public final wj0 c;

    /* loaded from: classes.dex */
    public static final class b extends g21.a {
        public String a;
        public byte[] b;
        public wj0 c;

        @Override // androidx.appcompat.view.menu.g21.a
        public g21 a() {
            String str = "";
            if (this.a == null) {
                str = " backendName";
            }
            if (this.c == null) {
                str = str + " priority";
            }
            if (str.isEmpty()) {
                return new l6(this.a, this.b, this.c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // androidx.appcompat.view.menu.g21.a
        public g21.a b(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null backendName");
        }

        @Override // androidx.appcompat.view.menu.g21.a
        public g21.a c(byte[] bArr) {
            this.b = bArr;
            return this;
        }

        @Override // androidx.appcompat.view.menu.g21.a
        public g21.a d(wj0 wj0Var) {
            if (wj0Var != null) {
                this.c = wj0Var;
                return this;
            }
            throw new NullPointerException("Null priority");
        }
    }

    @Override // androidx.appcompat.view.menu.g21
    public String b() {
        return this.a;
    }

    @Override // androidx.appcompat.view.menu.g21
    public byte[] c() {
        return this.b;
    }

    @Override // androidx.appcompat.view.menu.g21
    public wj0 d() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g21) {
            g21 g21Var = (g21) obj;
            if (this.a.equals(g21Var.b())) {
                if (Arrays.equals(this.b, g21Var instanceof l6 ? ((l6) g21Var).b : g21Var.c()) && this.c.equals(g21Var.d())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b)) * 1000003) ^ this.c.hashCode();
    }

    public l6(String str, byte[] bArr, wj0 wj0Var) {
        this.a = str;
        this.b = bArr;
        this.c = wj0Var;
    }
}
