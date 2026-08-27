package androidx.appcompat.view.menu;

import android.content.pm.PackageParser;
import androidx.appcompat.view.menu.t02;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;
/* loaded from: classes.dex */
public final class h42 implements m52 {
    public static final int[] r = new int[0];
    public static final Unsafe s = z72.p();
    public final int[] a;
    public final Object[] b;
    public final int c;
    public final int d;
    public final z32 e;
    public final boolean f;
    public final boolean g;
    public final a52 h;
    public final boolean i;
    public final int[] j;
    public final int k;
    public final int l;
    public final o42 m;
    public final l22 n;
    public final o72 o;
    public final yz1 p;
    public final t32 q;

    public h42(int[] iArr, Object[] objArr, int i, int i2, z32 z32Var, a52 a52Var, boolean z, int[] iArr2, int i3, int i4, o42 o42Var, l22 l22Var, o72 o72Var, yz1 yz1Var, t32 t32Var) {
        this.a = iArr;
        this.b = objArr;
        this.c = i;
        this.d = i2;
        this.g = z32Var instanceof t02;
        this.h = a52Var;
        this.f = yz1Var != null && yz1Var.d(z32Var);
        this.i = false;
        this.j = iArr2;
        this.k = i3;
        this.l = i4;
        this.m = o42Var;
        this.n = l22Var;
        this.o = o72Var;
        this.p = yz1Var;
        this.e = z32Var;
        this.q = t32Var;
    }

    public static boolean A(Object obj, int i, m52 m52Var) {
        return m52Var.c(z72.B(obj, i & 1048575));
    }

    public static float B(Object obj, long j) {
        return ((Float) z72.B(obj, j)).floatValue();
    }

    public static int H(Object obj, long j) {
        return ((Integer) z72.B(obj, j)).intValue();
    }

    public static long L(Object obj, long j) {
        return ((Long) z72.B(obj, j)).longValue();
    }

    public static g72 O(Object obj) {
        t02 t02Var = (t02) obj;
        g72 g72Var = t02Var.zzb;
        if (g72Var == g72.k()) {
            g72 l = g72.l();
            t02Var.zzb = l;
            return l;
        }
        return g72Var;
    }

    public static boolean P(Object obj, long j) {
        return ((Boolean) z72.B(obj, j)).booleanValue();
    }

    public static void R(Object obj) {
        if (T(obj)) {
            return;
        }
        String valueOf = String.valueOf(obj);
        throw new IllegalArgumentException("Mutating immutable message: " + valueOf);
    }

    public static boolean S(int i) {
        return (i & 536870912) != 0;
    }

    public static boolean T(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof t02) {
            return ((t02) obj).F();
        }
        return true;
    }

    public static double j(Object obj, long j) {
        return ((Double) z72.B(obj, j)).doubleValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0279  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static androidx.appcompat.view.menu.h42 n(java.lang.Class r33, androidx.appcompat.view.menu.v32 r34, androidx.appcompat.view.menu.o42 r35, androidx.appcompat.view.menu.l22 r36, androidx.appcompat.view.menu.o72 r37, androidx.appcompat.view.menu.yz1 r38, androidx.appcompat.view.menu.t32 r39) {
        /*
            Method dump skipped, instructions count: 1039
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.h42.n(java.lang.Class, androidx.appcompat.view.menu.v32, androidx.appcompat.view.menu.o42, androidx.appcompat.view.menu.l22, androidx.appcompat.view.menu.o72, androidx.appcompat.view.menu.yz1, androidx.appcompat.view.menu.t32):androidx.appcompat.view.menu.h42");
    }

    public static Field s(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    public static void t(int i, Object obj, g92 g92Var) {
        if (obj instanceof String) {
            g92Var.F(i, (String) obj);
        } else {
            g92Var.x(i, (tx1) obj);
        }
    }

    public static void u(o72 o72Var, Object obj, g92 g92Var) {
        o72Var.g(o72Var.k(obj), g92Var);
    }

    public final int C(int i) {
        return this.a[i + 2];
    }

    public final void D(Object obj, int i) {
        int C = C(i);
        long j = 1048575 & C;
        if (j == 1048575) {
            return;
        }
        z72.h(obj, j, (1 << (C >>> 20)) | z72.t(obj, j));
    }

    public final void E(Object obj, int i, int i2) {
        z72.h(obj, C(i2) & 1048575, i);
    }

    public final void F(Object obj, Object obj2, int i) {
        int i2 = this.a[i];
        if (J(obj2, i2, i)) {
            long G = G(i) & 1048575;
            Unsafe unsafe = s;
            Object object = unsafe.getObject(obj2, G);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.a[i] + " is present but null: " + String.valueOf(obj2));
            }
            m52 N = N(i);
            if (!J(obj, i2, i)) {
                if (T(object)) {
                    Object a = N.a();
                    N.d(a, object);
                    unsafe.putObject(obj, G, a);
                } else {
                    unsafe.putObject(obj, G, object);
                }
                E(obj, i2, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, G);
            if (!T(object2)) {
                Object a2 = N.a();
                N.d(a2, object2);
                unsafe.putObject(obj, G, a2);
                object2 = a2;
            }
            N.d(object2, object);
        }
    }

    public final int G(int i) {
        return this.a[i + 1];
    }

    public final boolean I(Object obj, int i) {
        int C = C(i);
        long j = C & 1048575;
        if (j != 1048575) {
            return (z72.t(obj, j) & (1 << (C >>> 20))) != 0;
        }
        int G = G(i);
        long j2 = G & 1048575;
        switch ((G & 267386880) >>> 20) {
            case 0:
                return Double.doubleToRawLongBits(z72.a(obj, j2)) != 0;
            case 1:
                return Float.floatToRawIntBits(z72.n(obj, j2)) != 0;
            case 2:
                return z72.x(obj, j2) != 0;
            case t02.c.c /* 3 */:
                return z72.x(obj, j2) != 0;
            case 4:
                return z72.t(obj, j2) != 0;
            case t02.c.e /* 5 */:
                return z72.x(obj, j2) != 0;
            case t02.c.f /* 6 */:
                return z72.t(obj, j2) != 0;
            case t02.c.g /* 7 */:
                return z72.F(obj, j2);
            case PackageParser.PARSE_IGNORE_PROCESSES /* 8 */:
                Object B = z72.B(obj, j2);
                if (B instanceof String) {
                    return !((String) B).isEmpty();
                } else if (B instanceof tx1) {
                    return !tx1.n.equals(B);
                } else {
                    throw new IllegalArgumentException();
                }
            case 9:
                return z72.B(obj, j2) != null;
            case 10:
                return !tx1.n.equals(z72.B(obj, j2));
            case 11:
                return z72.t(obj, j2) != 0;
            case 12:
                return z72.t(obj, j2) != 0;
            case 13:
                return z72.t(obj, j2) != 0;
            case 14:
                return z72.x(obj, j2) != 0;
            case 15:
                return z72.t(obj, j2) != 0;
            case PackageParser.PARSE_FORWARD_LOCK /* 16 */:
                return z72.x(obj, j2) != 0;
            case 17:
                return z72.B(obj, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    public final boolean J(Object obj, int i, int i2) {
        return z72.t(obj, (long) (C(i2) & 1048575)) == i;
    }

    public final boolean K(Object obj, Object obj2, int i) {
        return I(obj, i) == I(obj2, i);
    }

    public final o12 M(int i) {
        return (o12) this.b[((i / 3) << 1) + 1];
    }

    public final m52 N(int i) {
        int i2 = (i / 3) << 1;
        m52 m52Var = (m52) this.b[i2];
        if (m52Var != null) {
            return m52Var;
        }
        m52 b = y42.a().b((Class) this.b[i2 + 1]);
        this.b[i2] = b;
        return b;
    }

    public final Object Q(int i) {
        return this.b[(i / 3) << 1];
    }

    @Override // androidx.appcompat.view.menu.m52
    public final Object a() {
        return this.m.b(this.e);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // androidx.appcompat.view.menu.m52
    public final int b(Object obj) {
        int i;
        int i2;
        int i3;
        int e;
        int z;
        int p0;
        boolean z2;
        int y;
        int D;
        int s0;
        int v0;
        Unsafe unsafe = s;
        int i4 = 1048575;
        int i5 = 1048575;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (i7 < this.a.length) {
            int G = G(i7);
            int i9 = (267386880 & G) >>> 20;
            int[] iArr = this.a;
            int i10 = iArr[i7];
            int i11 = iArr[i7 + 2];
            int i12 = i11 & i4;
            if (i9 <= 17) {
                if (i12 != i5) {
                    i6 = i12 == i4 ? 0 : unsafe.getInt(obj, i12);
                    i5 = i12;
                }
                i = i5;
                i2 = i6;
                i3 = 1 << (i11 >>> 20);
            } else {
                i = i5;
                i2 = i6;
                i3 = 0;
            }
            long j = G & i4;
            if (i9 >= j02.a0.a()) {
                j02.n0.a();
            }
            switch (i9) {
                case 0:
                    if (z(obj, i7, i, i2, i3)) {
                        e = mz1.e(i10, 0.0d);
                        i8 += e;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (z(obj, i7, i, i2, i3)) {
                        e = mz1.f(i10, 0.0f);
                        i8 += e;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (z(obj, i7, i, i2, i3)) {
                        e = mz1.Y(i10, unsafe.getLong(obj, j));
                        i8 += e;
                        break;
                    } else {
                        break;
                    }
                case t02.c.c /* 3 */:
                    if (z(obj, i7, i, i2, i3)) {
                        e = mz1.m0(i10, unsafe.getLong(obj, j));
                        i8 += e;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (z(obj, i7, i, i2, i3)) {
                        e = mz1.l0(i10, unsafe.getInt(obj, j));
                        i8 += e;
                        break;
                    } else {
                        break;
                    }
                case t02.c.e /* 5 */:
                    if (z(obj, i7, i, i2, i3)) {
                        e = mz1.P(i10, 0L);
                        i8 += e;
                        break;
                    } else {
                        break;
                    }
                case t02.c.f /* 6 */:
                    if (z(obj, i7, i, i2, i3)) {
                        e = mz1.h0(i10, 0);
                        i8 += e;
                        break;
                    }
                    break;
                case t02.c.g /* 7 */:
                    if (z(obj, i7, i, i2, i3)) {
                        z = mz1.z(i10, true);
                        i8 += z;
                    }
                    break;
                case PackageParser.PARSE_IGNORE_PROCESSES /* 8 */:
                    if (z(obj, i7, i, i2, i3)) {
                        Object object = unsafe.getObject(obj, j);
                        z = object instanceof tx1 ? mz1.Q(i10, (tx1) object) : mz1.y(i10, (String) object);
                        i8 += z;
                    }
                    break;
                case 9:
                    if (z(obj, i7, i, i2, i3)) {
                        z = p52.a(i10, unsafe.getObject(obj, j), N(i7));
                        i8 += z;
                    }
                    break;
                case 10:
                    if (z(obj, i7, i, i2, i3)) {
                        z = mz1.Q(i10, (tx1) unsafe.getObject(obj, j));
                        i8 += z;
                    }
                    break;
                case 11:
                    if (z(obj, i7, i, i2, i3)) {
                        z = mz1.w0(i10, unsafe.getInt(obj, j));
                        i8 += z;
                    }
                    break;
                case 12:
                    if (z(obj, i7, i, i2, i3)) {
                        z = mz1.d0(i10, unsafe.getInt(obj, j));
                        i8 += z;
                    }
                    break;
                case 13:
                    if (z(obj, i7, i, i2, i3)) {
                        p0 = mz1.p0(i10, 0);
                        i8 += p0;
                    }
                    break;
                case 14:
                    if (z(obj, i7, i, i2, i3)) {
                        z = mz1.e0(i10, 0L);
                        i8 += z;
                    }
                    break;
                case 15:
                    if (z(obj, i7, i, i2, i3)) {
                        z = mz1.t0(i10, unsafe.getInt(obj, j));
                        i8 += z;
                    }
                    break;
                case PackageParser.PARSE_FORWARD_LOCK /* 16 */:
                    if (z(obj, i7, i, i2, i3)) {
                        z = mz1.i0(i10, unsafe.getLong(obj, j));
                        i8 += z;
                    }
                    break;
                case 17:
                    if (z(obj, i7, i, i2, i3)) {
                        z = mz1.x(i10, (z32) unsafe.getObject(obj, j), N(i7));
                        i8 += z;
                    }
                    break;
                case 18:
                    z = p52.C(i10, (List) unsafe.getObject(obj, j), false);
                    i8 += z;
                    break;
                case 19:
                    z2 = false;
                    y = p52.y(i10, (List) unsafe.getObject(obj, j), false);
                    i8 += y;
                    break;
                case 20:
                    z2 = false;
                    y = p52.K(i10, (List) unsafe.getObject(obj, j), false);
                    i8 += y;
                    break;
                case 21:
                    z2 = false;
                    y = p52.W(i10, (List) unsafe.getObject(obj, j), false);
                    i8 += y;
                    break;
                case 22:
                    z2 = false;
                    y = p52.G(i10, (List) unsafe.getObject(obj, j), false);
                    i8 += y;
                    break;
                case 23:
                    z2 = false;
                    y = p52.C(i10, (List) unsafe.getObject(obj, j), false);
                    i8 += y;
                    break;
                case 24:
                    z2 = false;
                    y = p52.y(i10, (List) unsafe.getObject(obj, j), false);
                    i8 += y;
                    break;
                case 25:
                    z2 = false;
                    y = p52.d(i10, (List) unsafe.getObject(obj, j), false);
                    i8 += y;
                    break;
                case 26:
                    z = p52.q(i10, (List) unsafe.getObject(obj, j));
                    i8 += z;
                    break;
                case 27:
                    z = p52.r(i10, (List) unsafe.getObject(obj, j), N(i7));
                    i8 += z;
                    break;
                case 28:
                    z = p52.b(i10, (List) unsafe.getObject(obj, j));
                    i8 += z;
                    break;
                case 29:
                    z = p52.T(i10, (List) unsafe.getObject(obj, j), false);
                    i8 += z;
                    break;
                case 30:
                    z2 = false;
                    y = p52.s(i10, (List) unsafe.getObject(obj, j), false);
                    i8 += y;
                    break;
                case 31:
                    z2 = false;
                    y = p52.y(i10, (List) unsafe.getObject(obj, j), false);
                    i8 += y;
                    break;
                case PackageParser.PARSE_EXTERNAL_STORAGE /* 32 */:
                    z2 = false;
                    y = p52.C(i10, (List) unsafe.getObject(obj, j), false);
                    i8 += y;
                    break;
                case 33:
                    z2 = false;
                    y = p52.N(i10, (List) unsafe.getObject(obj, j), false);
                    i8 += y;
                    break;
                case 34:
                    z2 = false;
                    y = p52.Q(i10, (List) unsafe.getObject(obj, j), false);
                    i8 += y;
                    break;
                case 35:
                    D = p52.D((List) unsafe.getObject(obj, j));
                    if (D > 0) {
                        s0 = mz1.s0(i10);
                        v0 = mz1.v0(D);
                        p0 = s0 + v0 + D;
                        i8 += p0;
                    }
                    break;
                case 36:
                    D = p52.z((List) unsafe.getObject(obj, j));
                    if (D > 0) {
                        s0 = mz1.s0(i10);
                        v0 = mz1.v0(D);
                        p0 = s0 + v0 + D;
                        i8 += p0;
                    }
                    break;
                case 37:
                    D = p52.L((List) unsafe.getObject(obj, j));
                    if (D > 0) {
                        s0 = mz1.s0(i10);
                        v0 = mz1.v0(D);
                        p0 = s0 + v0 + D;
                        i8 += p0;
                    }
                    break;
                case 38:
                    D = p52.X((List) unsafe.getObject(obj, j));
                    if (D > 0) {
                        s0 = mz1.s0(i10);
                        v0 = mz1.v0(D);
                        p0 = s0 + v0 + D;
                        i8 += p0;
                    }
                    break;
                case 39:
                    D = p52.H((List) unsafe.getObject(obj, j));
                    if (D > 0) {
                        s0 = mz1.s0(i10);
                        v0 = mz1.v0(D);
                        p0 = s0 + v0 + D;
                        i8 += p0;
                    }
                    break;
                case 40:
                    D = p52.D((List) unsafe.getObject(obj, j));
                    if (D > 0) {
                        s0 = mz1.s0(i10);
                        v0 = mz1.v0(D);
                        p0 = s0 + v0 + D;
                        i8 += p0;
                    }
                    break;
                case 41:
                    D = p52.z((List) unsafe.getObject(obj, j));
                    if (D > 0) {
                        s0 = mz1.s0(i10);
                        v0 = mz1.v0(D);
                        p0 = s0 + v0 + D;
                        i8 += p0;
                    }
                    break;
                case 42:
                    D = p52.e((List) unsafe.getObject(obj, j));
                    if (D > 0) {
                        s0 = mz1.s0(i10);
                        v0 = mz1.v0(D);
                        p0 = s0 + v0 + D;
                        i8 += p0;
                    }
                    break;
                case 43:
                    D = p52.U((List) unsafe.getObject(obj, j));
                    if (D > 0) {
                        s0 = mz1.s0(i10);
                        v0 = mz1.v0(D);
                        p0 = s0 + v0 + D;
                        i8 += p0;
                    }
                    break;
                case 44:
                    D = p52.t((List) unsafe.getObject(obj, j));
                    if (D > 0) {
                        s0 = mz1.s0(i10);
                        v0 = mz1.v0(D);
                        p0 = s0 + v0 + D;
                        i8 += p0;
                    }
                    break;
                case 45:
                    D = p52.z((List) unsafe.getObject(obj, j));
                    if (D > 0) {
                        s0 = mz1.s0(i10);
                        v0 = mz1.v0(D);
                        p0 = s0 + v0 + D;
                        i8 += p0;
                    }
                    break;
                case 46:
                    D = p52.D((List) unsafe.getObject(obj, j));
                    if (D > 0) {
                        s0 = mz1.s0(i10);
                        v0 = mz1.v0(D);
                        p0 = s0 + v0 + D;
                        i8 += p0;
                    }
                    break;
                case 47:
                    D = p52.O((List) unsafe.getObject(obj, j));
                    if (D > 0) {
                        s0 = mz1.s0(i10);
                        v0 = mz1.v0(D);
                        p0 = s0 + v0 + D;
                        i8 += p0;
                    }
                    break;
                case 48:
                    D = p52.R((List) unsafe.getObject(obj, j));
                    if (D > 0) {
                        s0 = mz1.s0(i10);
                        v0 = mz1.v0(D);
                        p0 = s0 + v0 + D;
                        i8 += p0;
                    }
                    break;
                case 49:
                    z = p52.c(i10, (List) unsafe.getObject(obj, j), N(i7));
                    i8 += z;
                    break;
                case 50:
                    z = this.q.i(i10, unsafe.getObject(obj, j), Q(i7));
                    i8 += z;
                    break;
                case 51:
                    if (J(obj, i10, i7)) {
                        z = mz1.e(i10, 0.0d);
                        i8 += z;
                    }
                    break;
                case 52:
                    if (J(obj, i10, i7)) {
                        z = mz1.f(i10, 0.0f);
                        i8 += z;
                    }
                    break;
                case 53:
                    if (J(obj, i10, i7)) {
                        z = mz1.Y(i10, L(obj, j));
                        i8 += z;
                    }
                    break;
                case 54:
                    if (J(obj, i10, i7)) {
                        z = mz1.m0(i10, L(obj, j));
                        i8 += z;
                    }
                    break;
                case 55:
                    if (J(obj, i10, i7)) {
                        z = mz1.l0(i10, H(obj, j));
                        i8 += z;
                    }
                    break;
                case 56:
                    if (J(obj, i10, i7)) {
                        z = mz1.P(i10, 0L);
                        i8 += z;
                    }
                    break;
                case 57:
                    if (J(obj, i10, i7)) {
                        p0 = mz1.h0(i10, 0);
                        i8 += p0;
                    }
                    break;
                case 58:
                    if (J(obj, i10, i7)) {
                        z = mz1.z(i10, true);
                        i8 += z;
                    }
                    break;
                case 59:
                    if (J(obj, i10, i7)) {
                        Object object2 = unsafe.getObject(obj, j);
                        z = object2 instanceof tx1 ? mz1.Q(i10, (tx1) object2) : mz1.y(i10, (String) object2);
                        i8 += z;
                    }
                    break;
                case 60:
                    if (J(obj, i10, i7)) {
                        z = p52.a(i10, unsafe.getObject(obj, j), N(i7));
                        i8 += z;
                    }
                    break;
                case 61:
                    if (J(obj, i10, i7)) {
                        z = mz1.Q(i10, (tx1) unsafe.getObject(obj, j));
                        i8 += z;
                    }
                    break;
                case 62:
                    if (J(obj, i10, i7)) {
                        z = mz1.w0(i10, H(obj, j));
                        i8 += z;
                    }
                    break;
                case 63:
                    if (J(obj, i10, i7)) {
                        z = mz1.d0(i10, H(obj, j));
                        i8 += z;
                    }
                    break;
                case PackageParser.PARSE_IS_SYSTEM_DIR /* 64 */:
                    if (J(obj, i10, i7)) {
                        p0 = mz1.p0(i10, 0);
                        i8 += p0;
                    }
                    break;
                case 65:
                    if (J(obj, i10, i7)) {
                        z = mz1.e0(i10, 0L);
                        i8 += z;
                    }
                    break;
                case 66:
                    if (J(obj, i10, i7)) {
                        z = mz1.t0(i10, H(obj, j));
                        i8 += z;
                    }
                    break;
                case 67:
                    if (J(obj, i10, i7)) {
                        z = mz1.i0(i10, L(obj, j));
                        i8 += z;
                    }
                    break;
                case 68:
                    if (J(obj, i10, i7)) {
                        z = mz1.x(i10, (z32) unsafe.getObject(obj, j), N(i7));
                        i8 += z;
                    }
                    break;
            }
            i7 += 3;
            i5 = i;
            i6 = i2;
            i4 = 1048575;
        }
        int i13 = 0;
        o72 o72Var = this.o;
        int a = i8 + o72Var.a(o72Var.k(obj));
        if (this.f) {
            h02 b = this.p.b(obj);
            for (int i14 = 0; i14 < b.a.g(); i14++) {
                Map.Entry h = b.a.h(i14);
                my0.a(h.getKey());
                i13 += h02.b(null, h.getValue());
            }
            for (Map.Entry entry : b.a.j()) {
                my0.a(entry.getKey());
                i13 += h02.b(null, entry.getValue());
            }
            return a + i13;
        }
        return a;
    }

    @Override // androidx.appcompat.view.menu.m52
    public final boolean c(Object obj) {
        int i;
        int i2;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i5 < this.k) {
            int i6 = this.j[i5];
            int i7 = this.a[i6];
            int G = G(i6);
            int i8 = this.a[i6 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i3) {
                if (i9 != 1048575) {
                    i4 = s.getInt(obj, i9);
                }
                i2 = i4;
                i = i9;
            } else {
                i = i3;
                i2 = i4;
            }
            if ((268435456 & G) != 0 && !z(obj, i6, i, i2, i10)) {
                return false;
            }
            int i11 = (267386880 & G) >>> 20;
            if (i11 != 9 && i11 != 17) {
                if (i11 != 27) {
                    if (i11 == 60 || i11 == 68) {
                        if (J(obj, i7, i6) && !A(obj, G, N(i6))) {
                            return false;
                        }
                    } else if (i11 != 49) {
                        if (i11 == 50 && !this.q.c(z72.B(obj, G & 1048575)).isEmpty()) {
                            this.q.b(Q(i6));
                            throw null;
                        }
                    }
                }
                List list = (List) z72.B(obj, G & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    m52 N = N(i6);
                    for (int i12 = 0; i12 < list.size(); i12++) {
                        if (!N.c(list.get(i12))) {
                            return false;
                        }
                    }
                    continue;
                }
            } else if (z(obj, i6, i, i2, i10) && !A(obj, G, N(i6))) {
                return false;
            }
            i5++;
            i3 = i;
            i4 = i2;
        }
        return !this.f || this.p.b(obj).n();
    }

    @Override // androidx.appcompat.view.menu.m52
    public final void d(Object obj, Object obj2) {
        R(obj);
        obj2.getClass();
        for (int i = 0; i < this.a.length; i += 3) {
            int G = G(i);
            long j = 1048575 & G;
            int i2 = this.a[i];
            switch ((G & 267386880) >>> 20) {
                case 0:
                    if (I(obj2, i)) {
                        z72.f(obj, j, z72.a(obj2, j));
                        D(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (I(obj2, i)) {
                        z72.g(obj, j, z72.n(obj2, j));
                        D(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (I(obj2, i)) {
                        z72.i(obj, j, z72.x(obj2, j));
                        D(obj, i);
                        break;
                    } else {
                        break;
                    }
                case t02.c.c /* 3 */:
                    if (I(obj2, i)) {
                        z72.i(obj, j, z72.x(obj2, j));
                        D(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (I(obj2, i)) {
                        z72.h(obj, j, z72.t(obj2, j));
                        D(obj, i);
                        break;
                    } else {
                        break;
                    }
                case t02.c.e /* 5 */:
                    if (I(obj2, i)) {
                        z72.i(obj, j, z72.x(obj2, j));
                        D(obj, i);
                        break;
                    } else {
                        break;
                    }
                case t02.c.f /* 6 */:
                    if (I(obj2, i)) {
                        z72.h(obj, j, z72.t(obj2, j));
                        D(obj, i);
                        break;
                    } else {
                        break;
                    }
                case t02.c.g /* 7 */:
                    if (I(obj2, i)) {
                        z72.v(obj, j, z72.F(obj2, j));
                        D(obj, i);
                        break;
                    } else {
                        break;
                    }
                case PackageParser.PARSE_IGNORE_PROCESSES /* 8 */:
                    if (I(obj2, i)) {
                        z72.j(obj, j, z72.B(obj2, j));
                        D(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    y(obj, obj2, i);
                    break;
                case 10:
                    if (I(obj2, i)) {
                        z72.j(obj, j, z72.B(obj2, j));
                        D(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (I(obj2, i)) {
                        z72.h(obj, j, z72.t(obj2, j));
                        D(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (I(obj2, i)) {
                        z72.h(obj, j, z72.t(obj2, j));
                        D(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (I(obj2, i)) {
                        z72.h(obj, j, z72.t(obj2, j));
                        D(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (I(obj2, i)) {
                        z72.i(obj, j, z72.x(obj2, j));
                        D(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (I(obj2, i)) {
                        z72.h(obj, j, z72.t(obj2, j));
                        D(obj, i);
                        break;
                    } else {
                        break;
                    }
                case PackageParser.PARSE_FORWARD_LOCK /* 16 */:
                    if (I(obj2, i)) {
                        z72.i(obj, j, z72.x(obj2, j));
                        D(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    y(obj, obj2, i);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case PackageParser.PARSE_EXTERNAL_STORAGE /* 32 */:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.n.b(obj, obj2, j);
                    break;
                case 50:
                    p52.m(this.q, obj, obj2, j);
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (J(obj2, i2, i)) {
                        z72.j(obj, j, z72.B(obj2, j));
                        E(obj, i2, i);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    F(obj, obj2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case PackageParser.PARSE_IS_SYSTEM_DIR /* 64 */:
                case 65:
                case 66:
                case 67:
                    if (J(obj2, i2, i)) {
                        z72.j(obj, j, z72.B(obj2, j));
                        E(obj, i2, i);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    F(obj, obj2, i);
                    break;
            }
        }
        p52.n(this.o, obj, obj2);
        if (this.f) {
            p52.l(this.p, obj, obj2);
        }
    }

    @Override // androidx.appcompat.view.menu.m52
    public final void e(Object obj) {
        if (T(obj)) {
            if (obj instanceof t02) {
                t02 t02Var = (t02) obj;
                t02Var.i(Integer.MAX_VALUE);
                t02Var.zza = 0;
                t02Var.D();
            }
            int length = this.a.length;
            for (int i = 0; i < length; i += 3) {
                int G = G(i);
                long j = 1048575 & G;
                int i2 = (G & 267386880) >>> 20;
                if (i2 != 9) {
                    if (i2 != 60 && i2 != 68) {
                        switch (i2) {
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case PackageParser.PARSE_EXTERNAL_STORAGE /* 32 */:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                            case 45:
                            case 46:
                            case 47:
                            case 48:
                            case 49:
                                this.n.d(obj, j);
                                break;
                            case 50:
                                Unsafe unsafe = s;
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    unsafe.putObject(obj, j, this.q.e(object));
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (J(obj, this.a[i], i)) {
                        N(i).e(s.getObject(obj, j));
                    }
                }
                if (I(obj, i)) {
                    N(i).e(s.getObject(obj, j));
                }
            }
            this.o.l(obj);
            if (this.f) {
                this.p.f(obj);
            }
        }
    }

    @Override // androidx.appcompat.view.menu.m52
    public final int f(Object obj) {
        int i;
        int b;
        int length = this.a.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3 += 3) {
            int G = G(i3);
            int i4 = this.a[i3];
            long j = 1048575 & G;
            int i5 = 37;
            switch ((G & 267386880) >>> 20) {
                case 0:
                    i = i2 * 53;
                    b = y02.b(Double.doubleToLongBits(z72.a(obj, j)));
                    i2 = i + b;
                    break;
                case 1:
                    i = i2 * 53;
                    b = Float.floatToIntBits(z72.n(obj, j));
                    i2 = i + b;
                    break;
                case 2:
                    i = i2 * 53;
                    b = y02.b(z72.x(obj, j));
                    i2 = i + b;
                    break;
                case t02.c.c /* 3 */:
                    i = i2 * 53;
                    b = y02.b(z72.x(obj, j));
                    i2 = i + b;
                    break;
                case 4:
                    i = i2 * 53;
                    b = z72.t(obj, j);
                    i2 = i + b;
                    break;
                case t02.c.e /* 5 */:
                    i = i2 * 53;
                    b = y02.b(z72.x(obj, j));
                    i2 = i + b;
                    break;
                case t02.c.f /* 6 */:
                    i = i2 * 53;
                    b = z72.t(obj, j);
                    i2 = i + b;
                    break;
                case t02.c.g /* 7 */:
                    i = i2 * 53;
                    b = y02.c(z72.F(obj, j));
                    i2 = i + b;
                    break;
                case PackageParser.PARSE_IGNORE_PROCESSES /* 8 */:
                    i = i2 * 53;
                    b = ((String) z72.B(obj, j)).hashCode();
                    i2 = i + b;
                    break;
                case 9:
                    Object B = z72.B(obj, j);
                    if (B != null) {
                        i5 = B.hashCode();
                    }
                    i2 = (i2 * 53) + i5;
                    break;
                case 10:
                    i = i2 * 53;
                    b = z72.B(obj, j).hashCode();
                    i2 = i + b;
                    break;
                case 11:
                    i = i2 * 53;
                    b = z72.t(obj, j);
                    i2 = i + b;
                    break;
                case 12:
                    i = i2 * 53;
                    b = z72.t(obj, j);
                    i2 = i + b;
                    break;
                case 13:
                    i = i2 * 53;
                    b = z72.t(obj, j);
                    i2 = i + b;
                    break;
                case 14:
                    i = i2 * 53;
                    b = y02.b(z72.x(obj, j));
                    i2 = i + b;
                    break;
                case 15:
                    i = i2 * 53;
                    b = z72.t(obj, j);
                    i2 = i + b;
                    break;
                case PackageParser.PARSE_FORWARD_LOCK /* 16 */:
                    i = i2 * 53;
                    b = y02.b(z72.x(obj, j));
                    i2 = i + b;
                    break;
                case 17:
                    Object B2 = z72.B(obj, j);
                    if (B2 != null) {
                        i5 = B2.hashCode();
                    }
                    i2 = (i2 * 53) + i5;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case PackageParser.PARSE_EXTERNAL_STORAGE /* 32 */:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i = i2 * 53;
                    b = z72.B(obj, j).hashCode();
                    i2 = i + b;
                    break;
                case 50:
                    i = i2 * 53;
                    b = z72.B(obj, j).hashCode();
                    i2 = i + b;
                    break;
                case 51:
                    if (J(obj, i4, i3)) {
                        i = i2 * 53;
                        b = y02.b(Double.doubleToLongBits(j(obj, j)));
                        i2 = i + b;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (J(obj, i4, i3)) {
                        i = i2 * 53;
                        b = Float.floatToIntBits(B(obj, j));
                        i2 = i + b;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (J(obj, i4, i3)) {
                        i = i2 * 53;
                        b = y02.b(L(obj, j));
                        i2 = i + b;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (J(obj, i4, i3)) {
                        i = i2 * 53;
                        b = y02.b(L(obj, j));
                        i2 = i + b;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (J(obj, i4, i3)) {
                        i = i2 * 53;
                        b = H(obj, j);
                        i2 = i + b;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (J(obj, i4, i3)) {
                        i = i2 * 53;
                        b = y02.b(L(obj, j));
                        i2 = i + b;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (J(obj, i4, i3)) {
                        i = i2 * 53;
                        b = H(obj, j);
                        i2 = i + b;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (J(obj, i4, i3)) {
                        i = i2 * 53;
                        b = y02.c(P(obj, j));
                        i2 = i + b;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (J(obj, i4, i3)) {
                        i = i2 * 53;
                        b = ((String) z72.B(obj, j)).hashCode();
                        i2 = i + b;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (J(obj, i4, i3)) {
                        i = i2 * 53;
                        b = z72.B(obj, j).hashCode();
                        i2 = i + b;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (J(obj, i4, i3)) {
                        i = i2 * 53;
                        b = z72.B(obj, j).hashCode();
                        i2 = i + b;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (J(obj, i4, i3)) {
                        i = i2 * 53;
                        b = H(obj, j);
                        i2 = i + b;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (J(obj, i4, i3)) {
                        i = i2 * 53;
                        b = H(obj, j);
                        i2 = i + b;
                        break;
                    } else {
                        break;
                    }
                case PackageParser.PARSE_IS_SYSTEM_DIR /* 64 */:
                    if (J(obj, i4, i3)) {
                        i = i2 * 53;
                        b = H(obj, j);
                        i2 = i + b;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (J(obj, i4, i3)) {
                        i = i2 * 53;
                        b = y02.b(L(obj, j));
                        i2 = i + b;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (J(obj, i4, i3)) {
                        i = i2 * 53;
                        b = H(obj, j);
                        i2 = i + b;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (J(obj, i4, i3)) {
                        i = i2 * 53;
                        b = y02.b(L(obj, j));
                        i2 = i + b;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (J(obj, i4, i3)) {
                        i = i2 * 53;
                        b = z72.B(obj, j).hashCode();
                        i2 = i + b;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = (i2 * 53) + this.o.k(obj).hashCode();
        return this.f ? (hashCode * 53) + this.p.b(obj).hashCode() : hashCode;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0518  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0557  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x0b91  */
    @Override // androidx.appcompat.view.menu.m52
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(java.lang.Object r24, androidx.appcompat.view.menu.g92 r25) {
        /*
            Method dump skipped, instructions count: 3272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.h42.g(java.lang.Object, androidx.appcompat.view.menu.g92):void");
    }

    @Override // androidx.appcompat.view.menu.m52
    public final boolean h(Object obj, Object obj2) {
        boolean p;
        int length = this.a.length;
        for (int i = 0; i < length; i += 3) {
            int G = G(i);
            long j = G & 1048575;
            switch ((G & 267386880) >>> 20) {
                case 0:
                    if (K(obj, obj2, i) && Double.doubleToLongBits(z72.a(obj, j)) == Double.doubleToLongBits(z72.a(obj2, j))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (K(obj, obj2, i) && Float.floatToIntBits(z72.n(obj, j)) == Float.floatToIntBits(z72.n(obj2, j))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (K(obj, obj2, i) && z72.x(obj, j) == z72.x(obj2, j)) {
                        continue;
                    }
                    return false;
                case t02.c.c /* 3 */:
                    if (K(obj, obj2, i) && z72.x(obj, j) == z72.x(obj2, j)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (K(obj, obj2, i) && z72.t(obj, j) == z72.t(obj2, j)) {
                        continue;
                    }
                    return false;
                case t02.c.e /* 5 */:
                    if (K(obj, obj2, i) && z72.x(obj, j) == z72.x(obj2, j)) {
                        continue;
                    }
                    return false;
                case t02.c.f /* 6 */:
                    if (K(obj, obj2, i) && z72.t(obj, j) == z72.t(obj2, j)) {
                        continue;
                    }
                    return false;
                case t02.c.g /* 7 */:
                    if (K(obj, obj2, i) && z72.F(obj, j) == z72.F(obj2, j)) {
                        continue;
                    }
                    return false;
                case PackageParser.PARSE_IGNORE_PROCESSES /* 8 */:
                    if (K(obj, obj2, i) && p52.p(z72.B(obj, j), z72.B(obj2, j))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (K(obj, obj2, i) && p52.p(z72.B(obj, j), z72.B(obj2, j))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (K(obj, obj2, i) && p52.p(z72.B(obj, j), z72.B(obj2, j))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (K(obj, obj2, i) && z72.t(obj, j) == z72.t(obj2, j)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (K(obj, obj2, i) && z72.t(obj, j) == z72.t(obj2, j)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (K(obj, obj2, i) && z72.t(obj, j) == z72.t(obj2, j)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (K(obj, obj2, i) && z72.x(obj, j) == z72.x(obj2, j)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (K(obj, obj2, i) && z72.t(obj, j) == z72.t(obj2, j)) {
                        continue;
                    }
                    return false;
                case PackageParser.PARSE_FORWARD_LOCK /* 16 */:
                    if (K(obj, obj2, i) && z72.x(obj, j) == z72.x(obj2, j)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (K(obj, obj2, i) && p52.p(z72.B(obj, j), z72.B(obj2, j))) {
                        continue;
                    }
                    return false;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case PackageParser.PARSE_EXTERNAL_STORAGE /* 32 */:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    p = p52.p(z72.B(obj, j), z72.B(obj2, j));
                    break;
                case 50:
                    p = p52.p(z72.B(obj, j), z72.B(obj2, j));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case PackageParser.PARSE_IS_SYSTEM_DIR /* 64 */:
                case 65:
                case 66:
                case 67:
                case 68:
                    long C = C(i) & 1048575;
                    if (z72.t(obj, C) == z72.t(obj2, C) && p52.p(z72.B(obj, j), z72.B(obj2, j))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!p) {
                return false;
            }
        }
        if (this.o.k(obj).equals(this.o.k(obj2))) {
            if (this.f) {
                return this.p.b(obj).equals(this.p.b(obj2));
            }
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.m52
    public final void i(Object obj, byte[] bArr, int i, int i2, rx1 rx1Var) {
        m(obj, bArr, i, i2, 0, rx1Var);
    }

    public final int k(int i) {
        if (i < this.c || i > this.d) {
            return -1;
        }
        return l(i, 0);
    }

    public final int l(int i, int i2) {
        int length = (this.a.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.a[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:469:0x0b8a, code lost:
        if (r14 == 1048575) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:470:0x0b8c, code lost:
        r29.putInt(r7, r14, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:471:0x0b92, code lost:
        r12 = r31.k;
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:473:0x0b99, code lost:
        if (r12 >= r31.l) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:474:0x0b9b, code lost:
        r3 = (androidx.appcompat.view.menu.g72) r(r32, r31.j[r12], r3, r31.o, r32);
        r12 = r12 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:475:0x0bb1, code lost:
        if (r3 == null) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:476:0x0bb3, code lost:
        r31.o.h(r7, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:477:0x0bb8, code lost:
        if (r9 != 0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:478:0x0bba, code lost:
        if (r8 != r10) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:481:0x0bc1, code lost:
        throw androidx.appcompat.view.menu.v12.e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:482:0x0bc2, code lost:
        if (r8 > r10) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:483:0x0bc4, code lost:
        if (r11 != r9) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:484:0x0bc6, code lost:
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:486:0x0bcb, code lost:
        throw androidx.appcompat.view.menu.v12.e();
     */
    /* JADX WARN: Removed duplicated region for block: B:194:0x058c  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0619  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0667  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:192:0x0589 -> B:193:0x058a). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:224:0x0616 -> B:225:0x0617). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:244:0x0664 -> B:245:0x0665). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int m(java.lang.Object r32, byte[] r33, int r34, int r35, int r36, androidx.appcompat.view.menu.rx1 r37) {
        /*
            Method dump skipped, instructions count: 3168
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.h42.m(java.lang.Object, byte[], int, int, int, androidx.appcompat.view.menu.rx1):int");
    }

    public final Object o(int i, int i2, Map map, o12 o12Var, Object obj, o72 o72Var, Object obj2) {
        this.q.b(Q(i));
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!o12Var.e(((Integer) entry.getValue()).intValue())) {
                if (obj == null) {
                    obj = o72Var.i(obj2);
                }
                ly1 v = tx1.v(j32.a(null, entry.getKey(), entry.getValue()));
                try {
                    j32.b(v.b(), null, entry.getKey(), entry.getValue());
                    o72Var.c(obj, i2, v.a());
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return obj;
    }

    public final Object p(Object obj, int i) {
        m52 N = N(i);
        long G = G(i) & 1048575;
        if (I(obj, i)) {
            Object object = s.getObject(obj, G);
            if (T(object)) {
                return object;
            }
            Object a = N.a();
            if (object != null) {
                N.d(a, object);
            }
            return a;
        }
        return N.a();
    }

    public final Object q(Object obj, int i, int i2) {
        m52 N = N(i2);
        if (J(obj, i, i2)) {
            Object object = s.getObject(obj, G(i2) & 1048575);
            if (T(object)) {
                return object;
            }
            Object a = N.a();
            if (object != null) {
                N.d(a, object);
            }
            return a;
        }
        return N.a();
    }

    public final Object r(Object obj, int i, Object obj2, o72 o72Var, Object obj3) {
        o12 M;
        int i2 = this.a[i];
        Object B = z72.B(obj, G(i) & 1048575);
        return (B == null || (M = M(i)) == null) ? obj2 : o(i, i2, this.q.h(B), M, obj2, o72Var, obj3);
    }

    public final void v(g92 g92Var, int i, Object obj, int i2) {
        if (obj != null) {
            this.q.b(Q(i2));
            g92Var.p(i, null, this.q.c(obj));
        }
    }

    public final void w(Object obj, int i, int i2, Object obj2) {
        s.putObject(obj, G(i2) & 1048575, obj2);
        E(obj, i, i2);
    }

    public final void x(Object obj, int i, Object obj2) {
        s.putObject(obj, G(i) & 1048575, obj2);
        D(obj, i);
    }

    public final void y(Object obj, Object obj2, int i) {
        if (I(obj2, i)) {
            long G = G(i) & 1048575;
            Unsafe unsafe = s;
            Object object = unsafe.getObject(obj2, G);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.a[i] + " is present but null: " + String.valueOf(obj2));
            }
            m52 N = N(i);
            if (!I(obj, i)) {
                if (T(object)) {
                    Object a = N.a();
                    N.d(a, object);
                    unsafe.putObject(obj, G, a);
                } else {
                    unsafe.putObject(obj, G, object);
                }
                D(obj, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, G);
            if (!T(object2)) {
                Object a2 = N.a();
                N.d(a2, object2);
                unsafe.putObject(obj, G, a2);
                object2 = a2;
            }
            N.d(object2, object);
        }
    }

    public final boolean z(Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? I(obj, i) : (i3 & i4) != 0;
    }
}
