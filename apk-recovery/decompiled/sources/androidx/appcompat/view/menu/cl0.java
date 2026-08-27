package androidx.appcompat.view.menu;

import android.content.pm.PackageParser;
import androidx.appcompat.view.menu.al0;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Map;
/* loaded from: classes.dex */
public final class cl0 implements xf0 {
    public static final Charset f = Charset.forName("UTF-8");
    public static final nr g = nr.a("key").b(b5.b().c(1).a()).a();
    public static final nr h = nr.a("value").b(b5.b().c(2).a()).a();
    public static final wf0 i = new wf0() { // from class: androidx.appcompat.view.menu.bl0
        @Override // androidx.appcompat.view.menu.wf0
        public final void a(Object obj, Object obj2) {
            cl0.t((Map.Entry) obj, (xf0) obj2);
        }
    };
    public OutputStream a;
    public final Map b;
    public final Map c;
    public final wf0 d;
    public final fl0 e = new fl0(this);

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[al0.a.values().length];
            a = iArr;
            try {
                iArr[al0.a.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[al0.a.SIGNED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[al0.a.FIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public cl0(OutputStream outputStream, Map map, Map map2, wf0 wf0Var) {
        this.a = outputStream;
        this.b = map;
        this.c = map2;
        this.d = wf0Var;
    }

    public static ByteBuffer m(int i2) {
        return ByteBuffer.allocate(i2).order(ByteOrder.LITTLE_ENDIAN);
    }

    public static al0 r(nr nrVar) {
        al0 al0Var = (al0) nrVar.c(al0.class);
        if (al0Var != null) {
            return al0Var;
        }
        throw new no("Field has no @Protobuf config");
    }

    public static int s(nr nrVar) {
        al0 al0Var = (al0) nrVar.c(al0.class);
        if (al0Var != null) {
            return al0Var.tag();
        }
        throw new no("Field has no @Protobuf config");
    }

    public static /* synthetic */ void t(Map.Entry entry, xf0 xf0Var) {
        xf0Var.e(g, entry.getKey());
        xf0Var.e(h, entry.getValue());
    }

    public xf0 d(nr nrVar, double d, boolean z) {
        if (z && d == 0.0d) {
            return this;
        }
        u((s(nrVar) << 3) | 1);
        this.a.write(m(8).putDouble(d).array());
        return this;
    }

    @Override // androidx.appcompat.view.menu.xf0
    public xf0 e(nr nrVar, Object obj) {
        return g(nrVar, obj, true);
    }

    public xf0 f(nr nrVar, float f2, boolean z) {
        if (z && f2 == 0.0f) {
            return this;
        }
        u((s(nrVar) << 3) | 5);
        this.a.write(m(4).putFloat(f2).array());
        return this;
    }

    public xf0 g(nr nrVar, Object obj, boolean z) {
        if (obj == null) {
            return this;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z && charSequence.length() == 0) {
                return this;
            }
            u((s(nrVar) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f);
            u(bytes.length);
            this.a.write(bytes);
            return this;
        } else if (obj instanceof Collection) {
            for (Object obj2 : (Collection) obj) {
                g(nrVar, obj2, false);
            }
            return this;
        } else if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                o(i, nrVar, entry, false);
            }
            return this;
        } else if (obj instanceof Double) {
            return d(nrVar, ((Double) obj).doubleValue(), z);
        } else {
            if (obj instanceof Float) {
                return f(nrVar, ((Float) obj).floatValue(), z);
            }
            if (obj instanceof Number) {
                return k(nrVar, ((Number) obj).longValue(), z);
            }
            if (obj instanceof Boolean) {
                return l(nrVar, ((Boolean) obj).booleanValue(), z);
            }
            if (!(obj instanceof byte[])) {
                wf0 wf0Var = (wf0) this.b.get(obj.getClass());
                if (wf0Var != null) {
                    return o(wf0Var, nrVar, obj, z);
                }
                z41 z41Var = (z41) this.c.get(obj.getClass());
                return z41Var != null ? p(z41Var, nrVar, obj, z) : obj instanceof zk0 ? a(nrVar, ((zk0) obj).c()) : obj instanceof Enum ? a(nrVar, ((Enum) obj).ordinal()) : o(this.d, nrVar, obj, z);
            }
            byte[] bArr = (byte[]) obj;
            if (z && bArr.length == 0) {
                return this;
            }
            u((s(nrVar) << 3) | 2);
            u(bArr.length);
            this.a.write(bArr);
            return this;
        }
    }

    @Override // androidx.appcompat.view.menu.xf0
    /* renamed from: h */
    public cl0 a(nr nrVar, int i2) {
        return i(nrVar, i2, true);
    }

    public cl0 i(nr nrVar, int i2, boolean z) {
        if (z && i2 == 0) {
            return this;
        }
        al0 r = r(nrVar);
        int i3 = a.a[r.intEncoding().ordinal()];
        if (i3 == 1) {
            u(r.tag() << 3);
            u(i2);
        } else if (i3 == 2) {
            u(r.tag() << 3);
            u((i2 << 1) ^ (i2 >> 31));
        } else if (i3 == 3) {
            u((r.tag() << 3) | 5);
            this.a.write(m(4).putInt(i2).array());
        }
        return this;
    }

    @Override // androidx.appcompat.view.menu.xf0
    /* renamed from: j */
    public cl0 b(nr nrVar, long j) {
        return k(nrVar, j, true);
    }

    public cl0 k(nr nrVar, long j, boolean z) {
        if (z && j == 0) {
            return this;
        }
        al0 r = r(nrVar);
        int i2 = a.a[r.intEncoding().ordinal()];
        if (i2 == 1) {
            u(r.tag() << 3);
            v(j);
        } else if (i2 == 2) {
            u(r.tag() << 3);
            v((j >> 63) ^ (j << 1));
        } else if (i2 == 3) {
            u((r.tag() << 3) | 1);
            this.a.write(m(8).putLong(j).array());
        }
        return this;
    }

    public cl0 l(nr nrVar, boolean z, boolean z2) {
        return i(nrVar, z ? 1 : 0, z2);
    }

    public final long n(wf0 wf0Var, Object obj) {
        u80 u80Var = new u80();
        try {
            OutputStream outputStream = this.a;
            this.a = u80Var;
            wf0Var.a(obj, this);
            this.a = outputStream;
            long a2 = u80Var.a();
            u80Var.close();
            return a2;
        } catch (Throwable th) {
            try {
                u80Var.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final cl0 o(wf0 wf0Var, nr nrVar, Object obj, boolean z) {
        long n = n(wf0Var, obj);
        if (z && n == 0) {
            return this;
        }
        u((s(nrVar) << 3) | 2);
        v(n);
        wf0Var.a(obj, this);
        return this;
    }

    public final cl0 p(z41 z41Var, nr nrVar, Object obj, boolean z) {
        this.e.b(nrVar, z);
        z41Var.a(obj, this.e);
        return this;
    }

    public cl0 q(Object obj) {
        if (obj == null) {
            return this;
        }
        wf0 wf0Var = (wf0) this.b.get(obj.getClass());
        if (wf0Var != null) {
            wf0Var.a(obj, this);
            return this;
        }
        throw new no("No encoder for " + obj.getClass());
    }

    public final void u(int i2) {
        while ((i2 & (-128)) != 0) {
            this.a.write((i2 & 127) | PackageParser.PARSE_IS_PRIVILEGED);
            i2 >>>= 7;
        }
        this.a.write(i2 & 127);
    }

    public final void v(long j) {
        while (((-128) & j) != 0) {
            this.a.write((((int) j) & 127) | PackageParser.PARSE_IS_PRIVILEGED);
            j >>>= 7;
        }
        this.a.write(((int) j) & 127);
    }
}
