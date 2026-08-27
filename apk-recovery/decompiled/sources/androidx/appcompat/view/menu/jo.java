package androidx.appcompat.view.menu;

import java.util.Arrays;
/* loaded from: classes.dex */
public final class jo {
    public final lo a;
    public final byte[] b;

    public jo(lo loVar, byte[] bArr) {
        if (loVar == null) {
            throw new NullPointerException("encoding is null");
        }
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        }
        this.a = loVar;
        this.b = bArr;
    }

    public byte[] a() {
        return this.b;
    }

    public lo b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof jo) {
            jo joVar = (jo) obj;
            if (this.a.equals(joVar.a)) {
                return Arrays.equals(this.b, joVar.b);
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b);
    }

    public String toString() {
        return "EncodedPayload{encoding=" + this.a + ", bytes=[...]}";
    }
}
