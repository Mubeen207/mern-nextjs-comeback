package androidx.appcompat.view.menu;

import android.content.pm.PackageParser;
import androidx.appcompat.view.menu.t02;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public final class h02 {
    public static final h02 d = new h02(true);
    public final v52 a;
    public boolean b;
    public boolean c;

    public h02() {
        this.a = v52.b(16);
    }

    public static int b(l02 l02Var, Object obj) {
        o82 b = l02Var.b();
        int a = l02Var.a();
        if (l02Var.f()) {
            List<Object> list = (List) obj;
            int i = 0;
            if (!l02Var.d()) {
                for (Object obj2 : list) {
                    i += c(b, a, obj2);
                }
                return i;
            } else if (list.isEmpty()) {
                return 0;
            } else {
                for (Object obj3 : list) {
                    i += d(b, obj3);
                }
                return mz1.s0(a) + i + mz1.v0(i);
            }
        }
        return c(b, a, obj);
    }

    public static int c(o82 o82Var, int i, Object obj) {
        int s0 = mz1.s0(i);
        if (o82Var == o82.x) {
            y02.g((z32) obj);
            s0 <<= 1;
        }
        return s0 + d(o82Var, obj);
    }

    public static int d(o82 o82Var, Object obj) {
        switch (e02.b[o82Var.ordinal()]) {
            case 1:
                return mz1.c(((Double) obj).doubleValue());
            case 2:
                return mz1.d(((Float) obj).floatValue());
            case t02.c.c /* 3 */:
                return mz1.a0(((Long) obj).longValue());
            case 4:
                return mz1.n0(((Long) obj).longValue());
            case t02.c.e /* 5 */:
                return mz1.g0(((Integer) obj).intValue());
            case t02.c.f /* 6 */:
                return mz1.S(((Long) obj).longValue());
            case t02.c.g /* 7 */:
                return mz1.c0(((Integer) obj).intValue());
            case PackageParser.PARSE_IGNORE_PROCESSES /* 8 */:
                return mz1.h(((Boolean) obj).booleanValue());
            case 9:
                return mz1.B((z32) obj);
            case 10:
                return mz1.T((z32) obj);
            case 11:
                return obj instanceof tx1 ? mz1.A((tx1) obj) : mz1.C((String) obj);
            case 12:
                return obj instanceof tx1 ? mz1.A((tx1) obj) : mz1.i((byte[]) obj);
            case 13:
                return mz1.v0(((Integer) obj).intValue());
            case 14:
                return mz1.k0(((Integer) obj).intValue());
            case 15:
                return mz1.f0(((Long) obj).longValue());
            case PackageParser.PARSE_FORWARD_LOCK /* 16 */:
                return mz1.o0(((Integer) obj).intValue());
            case 17:
                return mz1.j0(((Long) obj).longValue());
            case 18:
                return obj instanceof k12 ? mz1.X(((k12) obj).a()) : mz1.X(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int e(Map.Entry entry) {
        my0.a(entry.getKey());
        entry.getValue();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void j(androidx.appcompat.view.menu.l02 r2, java.lang.Object r3) {
        /*
            androidx.appcompat.view.menu.o82 r0 = r2.b()
            androidx.appcompat.view.menu.y02.e(r3)
            int[] r1 = androidx.appcompat.view.menu.e02.a
            androidx.appcompat.view.menu.i92 r0 = r0.c()
            int r0 = r0.ordinal()
            r0 = r1[r0]
            switch(r0) {
                case 1: goto L3d;
                case 2: goto L3a;
                case 3: goto L37;
                case 4: goto L34;
                case 5: goto L31;
                case 6: goto L2e;
                case 7: goto L25;
                case 8: goto L1c;
                case 9: goto L17;
                default: goto L16;
            }
        L16:
            goto L42
        L17:
            boolean r0 = r3 instanceof androidx.appcompat.view.menu.z32
            if (r0 == 0) goto L42
            goto L41
        L1c:
            boolean r0 = r3 instanceof java.lang.Integer
            if (r0 != 0) goto L41
            boolean r0 = r3 instanceof androidx.appcompat.view.menu.k12
            if (r0 == 0) goto L42
            goto L41
        L25:
            boolean r0 = r3 instanceof androidx.appcompat.view.menu.tx1
            if (r0 != 0) goto L41
            boolean r0 = r3 instanceof byte[]
            if (r0 == 0) goto L42
            goto L41
        L2e:
            boolean r0 = r3 instanceof java.lang.String
            goto L3f
        L31:
            boolean r0 = r3 instanceof java.lang.Boolean
            goto L3f
        L34:
            boolean r0 = r3 instanceof java.lang.Double
            goto L3f
        L37:
            boolean r0 = r3 instanceof java.lang.Float
            goto L3f
        L3a:
            boolean r0 = r3 instanceof java.lang.Long
            goto L3f
        L3d:
            boolean r0 = r3 instanceof java.lang.Integer
        L3f:
            if (r0 == 0) goto L42
        L41:
            return
        L42:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            int r1 = r2.a()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            androidx.appcompat.view.menu.o82 r2 = r2.b()
            androidx.appcompat.view.menu.i92 r2 = r2.c()
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.getName()
            java.lang.Object[] r2 = new java.lang.Object[]{r1, r2, r3}
            java.lang.String r3 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r2 = java.lang.String.format(r3, r2)
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.h02.j(androidx.appcompat.view.menu.l02, java.lang.Object):void");
    }

    public static boolean k(Map.Entry entry) {
        my0.a(entry.getKey());
        throw null;
    }

    public final int a() {
        int i = 0;
        for (int i2 = 0; i2 < this.a.g(); i2++) {
            i += e(this.a.h(i2));
        }
        for (Map.Entry entry : this.a.j()) {
            i += e(entry);
        }
        return i;
    }

    public final /* synthetic */ Object clone() {
        h02 h02Var = new h02();
        for (int i = 0; i < this.a.g(); i++) {
            Map.Entry h = this.a.h(i);
            my0.a(h.getKey());
            h02Var.g(null, h.getValue());
        }
        for (Map.Entry entry : this.a.j()) {
            my0.a(entry.getKey());
            h02Var.g(null, entry.getValue());
        }
        h02Var.c = this.c;
        return h02Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h02) {
            return this.a.equals(((h02) obj).a);
        }
        return false;
    }

    public final void f(h02 h02Var) {
        for (int i = 0; i < h02Var.a.g(); i++) {
            h(h02Var.a.h(i));
        }
        for (Map.Entry entry : h02Var.a.j()) {
            h(entry);
        }
    }

    public final void g(l02 l02Var, Object obj) {
        if (!l02Var.f()) {
            j(l02Var, obj);
        } else if (!(obj instanceof List)) {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        } else {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayList.get(i);
                i++;
                j(l02Var, obj2);
            }
            obj = arrayList;
        }
        this.a.put(l02Var, obj);
    }

    public final void h(Map.Entry entry) {
        my0.a(entry.getKey());
        entry.getValue();
        throw null;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final Iterator i() {
        return this.c ? new d22(this.a.m().iterator()) : this.a.m().iterator();
    }

    public final Iterator l() {
        return this.c ? new d22(this.a.entrySet().iterator()) : this.a.entrySet().iterator();
    }

    public final void m() {
        if (this.b) {
            return;
        }
        for (int i = 0; i < this.a.g(); i++) {
            Map.Entry h = this.a.h(i);
            if (h.getValue() instanceof t02) {
                ((t02) h.getValue()).C();
            }
        }
        this.a.f();
        this.b = true;
    }

    public final boolean n() {
        for (int i = 0; i < this.a.g(); i++) {
            if (!k(this.a.h(i))) {
                return false;
            }
        }
        for (Map.Entry entry : this.a.j()) {
            if (!k(entry)) {
                return false;
            }
        }
        return true;
    }

    public h02(v52 v52Var) {
        this.a = v52Var;
        m();
    }

    public h02(boolean z) {
        this(v52.b(0));
        m();
    }
}
