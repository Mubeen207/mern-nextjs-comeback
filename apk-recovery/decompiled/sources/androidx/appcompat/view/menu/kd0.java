package androidx.appcompat.view.menu;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
/* loaded from: classes.dex */
public abstract class kd0 {

    /* loaded from: classes.dex */
    public static class a implements c {
        public final ByteBuffer a;

        public a(ByteBuffer byteBuffer) {
            this.a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // androidx.appcompat.view.menu.kd0.c
        public void a(int i) {
            ByteBuffer byteBuffer = this.a;
            byteBuffer.position(byteBuffer.position() + i);
        }

        @Override // androidx.appcompat.view.menu.kd0.c
        public int b() {
            return kd0.d(this.a.getShort());
        }

        @Override // androidx.appcompat.view.menu.kd0.c
        public long c() {
            return kd0.c(this.a.getInt());
        }

        @Override // androidx.appcompat.view.menu.kd0.c
        public int d() {
            return this.a.getInt();
        }

        @Override // androidx.appcompat.view.menu.kd0.c
        public long e() {
            return this.a.position();
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public final long a;
        public final long b;

        public b(long j, long j2) {
            this.a = j;
            this.b = j2;
        }

        public long a() {
            return this.a;
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        void a(int i);

        int b();

        long c();

        int d();

        long e();
    }

    public static b a(c cVar) {
        long j;
        cVar.a(4);
        int b2 = cVar.b();
        if (b2 <= 100) {
            cVar.a(6);
            int i = 0;
            while (true) {
                if (i >= b2) {
                    j = -1;
                    break;
                }
                int d = cVar.d();
                cVar.a(4);
                j = cVar.c();
                cVar.a(4);
                if (1835365473 == d) {
                    break;
                }
                i++;
            }
            if (j != -1) {
                cVar.a((int) (j - cVar.e()));
                cVar.a(12);
                long c2 = cVar.c();
                for (int i2 = 0; i2 < c2; i2++) {
                    int d2 = cVar.d();
                    long c3 = cVar.c();
                    long c4 = cVar.c();
                    if (1164798569 == d2 || 1701669481 == d2) {
                        return new b(c3 + j, c4);
                    }
                }
            }
            throw new IOException("Cannot read metadata.");
        }
        throw new IOException("Cannot read metadata.");
    }

    public static jd0 b(ByteBuffer byteBuffer) {
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.position((int) a(new a(duplicate)).a());
        return jd0.h(duplicate);
    }

    public static long c(int i) {
        return i & 4294967295L;
    }

    public static int d(short s) {
        return s & 65535;
    }
}
