package androidx.appcompat.view.menu;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
/* loaded from: classes.dex */
public final class jd0 extends az0 {
    public static jd0 h(ByteBuffer byteBuffer) {
        return i(byteBuffer, new jd0());
    }

    public static jd0 i(ByteBuffer byteBuffer, jd0 jd0Var) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return jd0Var.f(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public jd0 f(int i, ByteBuffer byteBuffer) {
        g(i, byteBuffer);
        return this;
    }

    public void g(int i, ByteBuffer byteBuffer) {
        c(i, byteBuffer);
    }

    public id0 j(id0 id0Var, int i) {
        int b = b(6);
        if (b != 0) {
            return id0Var.f(a(d(b) + (i * 4)), this.b);
        }
        return null;
    }

    public int k() {
        int b = b(6);
        if (b != 0) {
            return e(b);
        }
        return 0;
    }

    public int l() {
        int b = b(4);
        if (b != 0) {
            return this.b.getInt(b + this.a);
        }
        return 0;
    }
}
