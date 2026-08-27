package androidx.appcompat.view.menu;

import android.content.pm.PackageParser;
import androidx.appcompat.view.menu.t02;
import java.io.ByteArrayOutputStream;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public class sw0 implements ad0 {
    public static final sw0 a = new sw0();
    public static final boolean b;
    public static final Charset c;

    /* loaded from: classes.dex */
    public static final class a extends ByteArrayOutputStream {
        public byte[] a() {
            return ((ByteArrayOutputStream) this).buf;
        }
    }

    static {
        b = ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN;
        c = Charset.forName("UTF8");
    }

    public static final void c(ByteBuffer byteBuffer, int i) {
        int position = byteBuffer.position() % i;
        if (position != 0) {
            byteBuffer.position((byteBuffer.position() + i) - position);
        }
    }

    public static final byte[] d(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[e(byteBuffer)];
        byteBuffer.get(bArr);
        return bArr;
    }

    public static final int e(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            int i = byteBuffer.get() & 255;
            return i < 254 ? i : i == 254 ? byteBuffer.getChar() : byteBuffer.getInt();
        }
        throw new IllegalArgumentException("Message corrupted");
    }

    public static final void h(ByteArrayOutputStream byteArrayOutputStream, int i) {
        int size = byteArrayOutputStream.size() % i;
        if (size != 0) {
            for (int i2 = 0; i2 < i - size; i2++) {
                byteArrayOutputStream.write(0);
            }
        }
    }

    public static final void i(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr) {
        o(byteArrayOutputStream, bArr.length);
        byteArrayOutputStream.write(bArr, 0, bArr.length);
    }

    public static final void j(ByteArrayOutputStream byteArrayOutputStream, int i) {
        if (b) {
            byteArrayOutputStream.write(i);
            byteArrayOutputStream.write(i >>> 8);
            return;
        }
        byteArrayOutputStream.write(i >>> 8);
        byteArrayOutputStream.write(i);
    }

    public static final void k(ByteArrayOutputStream byteArrayOutputStream, double d) {
        n(byteArrayOutputStream, Double.doubleToLongBits(d));
    }

    public static final void l(ByteArrayOutputStream byteArrayOutputStream, float f) {
        m(byteArrayOutputStream, Float.floatToIntBits(f));
    }

    public static final void m(ByteArrayOutputStream byteArrayOutputStream, int i) {
        if (b) {
            byteArrayOutputStream.write(i);
            byteArrayOutputStream.write(i >>> 8);
            byteArrayOutputStream.write(i >>> 16);
            byteArrayOutputStream.write(i >>> 24);
            return;
        }
        byteArrayOutputStream.write(i >>> 24);
        byteArrayOutputStream.write(i >>> 16);
        byteArrayOutputStream.write(i >>> 8);
        byteArrayOutputStream.write(i);
    }

    public static final void n(ByteArrayOutputStream byteArrayOutputStream, long j) {
        if (b) {
            byteArrayOutputStream.write((byte) j);
            byteArrayOutputStream.write((byte) (j >>> 8));
            byteArrayOutputStream.write((byte) (j >>> 16));
            byteArrayOutputStream.write((byte) (j >>> 24));
            byteArrayOutputStream.write((byte) (j >>> 32));
            byteArrayOutputStream.write((byte) (j >>> 40));
            byteArrayOutputStream.write((byte) (j >>> 48));
            byteArrayOutputStream.write((byte) (j >>> 56));
            return;
        }
        byteArrayOutputStream.write((byte) (j >>> 56));
        byteArrayOutputStream.write((byte) (j >>> 48));
        byteArrayOutputStream.write((byte) (j >>> 40));
        byteArrayOutputStream.write((byte) (j >>> 32));
        byteArrayOutputStream.write((byte) (j >>> 24));
        byteArrayOutputStream.write((byte) (j >>> 16));
        byteArrayOutputStream.write((byte) (j >>> 8));
        byteArrayOutputStream.write((byte) j);
    }

    public static final void o(ByteArrayOutputStream byteArrayOutputStream, int i) {
        if (i < 254) {
            byteArrayOutputStream.write(i);
        } else if (i <= 65535) {
            byteArrayOutputStream.write(254);
            j(byteArrayOutputStream, i);
        } else {
            byteArrayOutputStream.write(255);
            m(byteArrayOutputStream, i);
        }
    }

    @Override // androidx.appcompat.view.menu.ad0
    public ByteBuffer a(Object obj) {
        if (obj == null) {
            return null;
        }
        a aVar = new a();
        p(aVar, obj);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(aVar.size());
        allocateDirect.put(aVar.a(), 0, aVar.size());
        return allocateDirect;
    }

    @Override // androidx.appcompat.view.menu.ad0
    public Object b(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return null;
        }
        byteBuffer.order(ByteOrder.nativeOrder());
        Object f = f(byteBuffer);
        if (byteBuffer.hasRemaining()) {
            throw new IllegalArgumentException("Message corrupted");
        }
        return f;
    }

    public final Object f(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            return g(byteBuffer.get(), byteBuffer);
        }
        throw new IllegalArgumentException("Message corrupted");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.util.Map, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.List, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v9 */
    public Object g(byte b2, ByteBuffer byteBuffer) {
        ?? arrayList;
        int i = 0;
        switch (b2) {
            case 0:
                return null;
            case 1:
                return Boolean.TRUE;
            case 2:
                return Boolean.FALSE;
            case t02.c.c /* 3 */:
                return Integer.valueOf(byteBuffer.getInt());
            case 4:
                return Long.valueOf(byteBuffer.getLong());
            case t02.c.e /* 5 */:
                return new BigInteger(new String(d(byteBuffer), c), 16);
            case t02.c.f /* 6 */:
                c(byteBuffer, 8);
                return Double.valueOf(byteBuffer.getDouble());
            case t02.c.g /* 7 */:
                return new String(d(byteBuffer), c);
            case PackageParser.PARSE_IGNORE_PROCESSES /* 8 */:
                return d(byteBuffer);
            case 9:
                int e = e(byteBuffer);
                int[] iArr = new int[e];
                c(byteBuffer, 4);
                byteBuffer.asIntBuffer().get(iArr);
                byteBuffer.position(byteBuffer.position() + (e * 4));
                return iArr;
            case 10:
                int e2 = e(byteBuffer);
                long[] jArr = new long[e2];
                c(byteBuffer, 8);
                byteBuffer.asLongBuffer().get(jArr);
                byteBuffer.position(byteBuffer.position() + (e2 * 8));
                return jArr;
            case 11:
                int e3 = e(byteBuffer);
                double[] dArr = new double[e3];
                c(byteBuffer, 8);
                byteBuffer.asDoubleBuffer().get(dArr);
                byteBuffer.position(byteBuffer.position() + (e3 * 8));
                return dArr;
            case 12:
                int e4 = e(byteBuffer);
                arrayList = new ArrayList(e4);
                while (i < e4) {
                    arrayList.add(f(byteBuffer));
                    i++;
                }
                break;
            case 13:
                int e5 = e(byteBuffer);
                arrayList = new HashMap();
                while (i < e5) {
                    arrayList.put(f(byteBuffer), f(byteBuffer));
                    i++;
                }
                break;
            case 14:
                int e6 = e(byteBuffer);
                float[] fArr = new float[e6];
                c(byteBuffer, 4);
                byteBuffer.asFloatBuffer().get(fArr);
                byteBuffer.position(byteBuffer.position() + (e6 * 4));
                return fArr;
            default:
                throw new IllegalArgumentException("Message corrupted");
        }
        return arrayList;
    }

    public void p(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
        int i = 0;
        if (obj == null || obj.equals(null)) {
            byteArrayOutputStream.write(0);
        } else if (obj instanceof Boolean) {
            byteArrayOutputStream.write(((Boolean) obj).booleanValue() ? 1 : 2);
        } else if (obj instanceof Number) {
            if ((obj instanceof Integer) || (obj instanceof Short) || (obj instanceof Byte)) {
                byteArrayOutputStream.write(3);
                m(byteArrayOutputStream, ((Number) obj).intValue());
            } else if (obj instanceof Long) {
                byteArrayOutputStream.write(4);
                n(byteArrayOutputStream, ((Long) obj).longValue());
            } else if ((obj instanceof Float) || (obj instanceof Double)) {
                byteArrayOutputStream.write(6);
                h(byteArrayOutputStream, 8);
                k(byteArrayOutputStream, ((Number) obj).doubleValue());
            } else if (!(obj instanceof BigInteger)) {
                throw new IllegalArgumentException("Unsupported Number type: " + obj.getClass());
            } else {
                byteArrayOutputStream.write(5);
                i(byteArrayOutputStream, ((BigInteger) obj).toString(16).getBytes(c));
            }
        } else if (obj instanceof CharSequence) {
            byteArrayOutputStream.write(7);
            i(byteArrayOutputStream, obj.toString().getBytes(c));
        } else if (obj instanceof byte[]) {
            byteArrayOutputStream.write(8);
            i(byteArrayOutputStream, (byte[]) obj);
        } else if (obj instanceof int[]) {
            byteArrayOutputStream.write(9);
            int[] iArr = (int[]) obj;
            o(byteArrayOutputStream, iArr.length);
            h(byteArrayOutputStream, 4);
            int length = iArr.length;
            while (i < length) {
                m(byteArrayOutputStream, iArr[i]);
                i++;
            }
        } else if (obj instanceof long[]) {
            byteArrayOutputStream.write(10);
            long[] jArr = (long[]) obj;
            o(byteArrayOutputStream, jArr.length);
            h(byteArrayOutputStream, 8);
            int length2 = jArr.length;
            while (i < length2) {
                n(byteArrayOutputStream, jArr[i]);
                i++;
            }
        } else if (obj instanceof double[]) {
            byteArrayOutputStream.write(11);
            double[] dArr = (double[]) obj;
            o(byteArrayOutputStream, dArr.length);
            h(byteArrayOutputStream, 8);
            int length3 = dArr.length;
            while (i < length3) {
                k(byteArrayOutputStream, dArr[i]);
                i++;
            }
        } else if (obj instanceof List) {
            byteArrayOutputStream.write(12);
            List<Object> list = (List) obj;
            o(byteArrayOutputStream, list.size());
            for (Object obj2 : list) {
                p(byteArrayOutputStream, obj2);
            }
        } else if (obj instanceof Map) {
            byteArrayOutputStream.write(13);
            Map map = (Map) obj;
            o(byteArrayOutputStream, map.size());
            for (Map.Entry entry : map.entrySet()) {
                p(byteArrayOutputStream, entry.getKey());
                p(byteArrayOutputStream, entry.getValue());
            }
        } else if (!(obj instanceof float[])) {
            throw new IllegalArgumentException("Unsupported value: '" + obj + "' of type '" + obj.getClass() + "'");
        } else {
            byteArrayOutputStream.write(14);
            float[] fArr = (float[]) obj;
            o(byteArrayOutputStream, fArr.length);
            h(byteArrayOutputStream, 4);
            int length4 = fArr.length;
            while (i < length4) {
                l(byteArrayOutputStream, fArr[i]);
                i++;
            }
        }
    }
}
