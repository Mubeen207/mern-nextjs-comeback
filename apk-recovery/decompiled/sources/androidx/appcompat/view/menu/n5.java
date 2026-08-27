package androidx.appcompat.view.menu;

import androidx.appcompat.view.menu.s7;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class n5 extends s7 {
    public final Iterable a;
    public final byte[] b;

    /* loaded from: classes.dex */
    public static final class b extends s7.a {
        public Iterable a;
        public byte[] b;

        @Override // androidx.appcompat.view.menu.s7.a
        public s7 a() {
            String str = "";
            if (this.a == null) {
                str = " events";
            }
            if (str.isEmpty()) {
                return new n5(this.a, this.b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // androidx.appcompat.view.menu.s7.a
        public s7.a b(Iterable iterable) {
            if (iterable != null) {
                this.a = iterable;
                return this;
            }
            throw new NullPointerException("Null events");
        }

        @Override // androidx.appcompat.view.menu.s7.a
        public s7.a c(byte[] bArr) {
            this.b = bArr;
            return this;
        }
    }

    @Override // androidx.appcompat.view.menu.s7
    public Iterable b() {
        return this.a;
    }

    @Override // androidx.appcompat.view.menu.s7
    public byte[] c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof s7) {
            s7 s7Var = (s7) obj;
            if (this.a.equals(s7Var.b())) {
                if (Arrays.equals(this.b, s7Var instanceof n5 ? ((n5) s7Var).b : s7Var.c())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b);
    }

    public String toString() {
        return "BackendRequest{events=" + this.a + ", extras=" + Arrays.toString(this.b) + "}";
    }

    public n5(Iterable iterable, byte[] bArr) {
        this.a = iterable;
        this.b = bArr;
    }
}
