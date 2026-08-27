package androidx.appcompat.view.menu;

import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class nz {
    public static final nz b = new nz();
    public final Map a = new HashMap();

    public static nz c() {
        return b;
    }

    public void a(o10 o10Var) {
        this.a.put(o10Var.getClass(), o10Var);
    }

    public void b(Class cls) {
        o10 o10Var = (o10) this.a.get(cls);
        if (o10Var == null || !o10Var.a()) {
            return;
        }
        o10Var.b();
    }

    public void d() {
        if (bv0.h().z() || bv0.h().B()) {
            a(new f10());
            a(new zg0());
            a(new z71());
            a(new w10());
            a(new yz());
            a(new h20());
            a(new q30());
            a(new ry());
            a(new d40());
            a(new e40());
            a(new v00());
            a(new i30());
            a(new d00());
            a(new d20());
            a(new c00());
            a(new f00());
            a(new kg());
            a(new g40());
            a(new u30());
            a(new pp0());
            a(new z10());
            a(new e30());
            a(new t10());
            a(new r10());
            a(new qz());
            a(new s30());
            a(new e10());
            a(new tz());
            a(new y20());
            a(new x00());
            a(new m20());
            a(new y10());
            a(new t20());
            a(new x30());
            a(new l20());
            a(r3.g());
            a(new a9());
            if (y8.h()) {
                a(new uz(null));
                a(new b40());
            }
            if (y8.g()) {
                a(new j20());
            }
            if (y8.f()) {
                a(new b10());
                a(new w20());
                a(new a00());
            }
            if (y8.e()) {
                a(new o30());
            }
            if (i10.a != null) {
                a(new j10());
            }
            if (y8.d()) {
                a(new j00());
                a(new g30());
            }
            if (y8.c()) {
                a(new a10());
                a(new c20());
                a(new b30());
            }
            if (y8.b()) {
                a(new h10());
                a(new n10());
            }
            if (y8.a()) {
                a(new r10());
            }
            if (o20.a != null) {
                a(new p20());
            }
            if (q20.a != null) {
                a(new r20());
            }
            if (j30.a != null) {
                a(new k30());
            }
            if (l30.a != null) {
                a(new m30());
            }
            if (z30.a != null) {
                a(new y30());
            }
        }
        e();
        n8.b.d(null);
    }

    public void e() {
        for (o10 o10Var : this.a.values()) {
            try {
                o10Var.b();
            } catch (Exception unused) {
            }
        }
    }
}
