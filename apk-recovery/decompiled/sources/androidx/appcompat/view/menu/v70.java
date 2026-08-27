package androidx.appcompat.view.menu;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
/* loaded from: classes.dex */
public class v70 {
    public long a;
    public b b;
    public long c;
    public long d;
    public boolean e;
    public a f;
    public String g;

    /* loaded from: classes.dex */
    public enum a {
        kKeyboard(0),
        kDirectionalPad(1),
        kGamepad(2),
        kJoystick(3),
        kHdmi(4);
        
        public final long m;

        a(long j) {
            this.m = j;
        }

        public long e() {
            return this.m;
        }
    }

    /* loaded from: classes.dex */
    public enum b {
        kDown(0),
        kUp(1),
        kRepeat(2);
        
        public long m;

        b(long j) {
            this.m = j;
        }

        public long e() {
            return this.m;
        }
    }

    public ByteBuffer a() {
        try {
            String str = this.g;
            byte[] bytes = str == null ? null : str.getBytes("UTF-8");
            int length = bytes == null ? 0 : bytes.length;
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(length + 56);
            allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
            allocateDirect.putLong(length);
            allocateDirect.putLong(this.a);
            allocateDirect.putLong(this.b.e());
            allocateDirect.putLong(this.c);
            allocateDirect.putLong(this.d);
            allocateDirect.putLong(this.e ? 1L : 0L);
            allocateDirect.putLong(this.f.e());
            if (bytes != null) {
                allocateDirect.put(bytes);
            }
            return allocateDirect;
        } catch (UnsupportedEncodingException unused) {
            throw new AssertionError("UTF-8 not supported");
        }
    }
}
