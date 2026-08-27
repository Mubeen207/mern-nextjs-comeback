package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Pair;
import androidx.appcompat.view.menu.y1;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
/* loaded from: classes.dex */
public final class s62 extends p82 {
    public final Map d;
    public final gv1 e;
    public final gv1 f;
    public final gv1 g;
    public final gv1 h;
    public final gv1 i;

    public s62(r82 r82Var) {
        super(r82Var);
        this.d = new HashMap();
        wu1 i = i();
        i.getClass();
        this.e = new gv1(i, "last_delete_stale", 0L);
        wu1 i2 = i();
        i2.getClass();
        this.f = new gv1(i2, "backoff", 0L);
        wu1 i3 = i();
        i3.getClass();
        this.g = new gv1(i3, "last_upload", 0L);
        wu1 i4 = i();
        i4.getClass();
        this.h = new gv1(i4, "last_upload_attempt", 0L);
        wu1 i5 = i();
        i5.getClass();
        this.i = new gv1(i5, "midnight_offset", 0L);
    }

    private final Pair y(String str) {
        q62 q62Var;
        y1.a aVar;
        n();
        long b = b().b();
        q62 q62Var2 = (q62) this.d.get(str);
        if (q62Var2 == null || b >= q62Var2.c) {
            y1.b(true);
            long C = e().C(str) + b;
            try {
                long x = e().x(str, vi1.d);
                if (x > 0) {
                    try {
                        aVar = y1.a(a());
                    } catch (PackageManager.NameNotFoundException unused) {
                        if (q62Var2 != null && b < q62Var2.c + x) {
                            return new Pair(q62Var2.a, Boolean.valueOf(q62Var2.b));
                        }
                        aVar = null;
                    }
                } else {
                    aVar = y1.a(a());
                }
            } catch (Exception e) {
                l().F().b("Unable to get advertising id", e);
                q62Var = new q62("", false, C);
            }
            if (aVar == null) {
                return new Pair("00000000-0000-0000-0000-000000000000", Boolean.FALSE);
            }
            String a = aVar.a();
            q62Var = a != null ? new q62(a, aVar.b(), C) : new q62("", aVar.b(), C);
            this.d.put(str, q62Var);
            y1.b(false);
            return new Pair(q62Var.a, Boolean.valueOf(q62Var.b));
        }
        return new Pair(q62Var2.a, Boolean.valueOf(q62Var2.b));
    }

    public final String A(String str, boolean z) {
        n();
        String str2 = z ? (String) y(str).first : "00000000-0000-0000-0000-000000000000";
        MessageDigest T0 = aa2.T0();
        if (T0 == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, T0.digest(str2.getBytes())));
    }

    @Override // androidx.appcompat.view.menu.iz1, androidx.appcompat.view.menu.lz1
    public final /* bridge */ /* synthetic */ Context a() {
        return super.a();
    }

    @Override // androidx.appcompat.view.menu.iz1, androidx.appcompat.view.menu.lz1
    public final /* bridge */ /* synthetic */ cc b() {
        return super.b();
    }

    @Override // androidx.appcompat.view.menu.iz1, androidx.appcompat.view.menu.lz1
    public final /* bridge */ /* synthetic */ pf1 d() {
        return super.d();
    }

    @Override // androidx.appcompat.view.menu.iz1
    public final /* bridge */ /* synthetic */ tf1 e() {
        return super.e();
    }

    @Override // androidx.appcompat.view.menu.iz1
    public final /* bridge */ /* synthetic */ fi1 f() {
        return super.f();
    }

    @Override // androidx.appcompat.view.menu.iz1
    public final /* bridge */ /* synthetic */ pt1 g() {
        return super.g();
    }

    @Override // androidx.appcompat.view.menu.iz1, androidx.appcompat.view.menu.lz1
    public final /* bridge */ /* synthetic */ mw1 h() {
        return super.h();
    }

    @Override // androidx.appcompat.view.menu.iz1
    public final /* bridge */ /* synthetic */ wu1 i() {
        return super.i();
    }

    @Override // androidx.appcompat.view.menu.iz1
    public final /* bridge */ /* synthetic */ aa2 j() {
        return super.j();
    }

    @Override // androidx.appcompat.view.menu.iz1
    public final /* bridge */ /* synthetic */ void k() {
        super.k();
    }

    @Override // androidx.appcompat.view.menu.iz1, androidx.appcompat.view.menu.lz1
    public final /* bridge */ /* synthetic */ st1 l() {
        return super.l();
    }

    @Override // androidx.appcompat.view.menu.iz1
    public final /* bridge */ /* synthetic */ void m() {
        super.m();
    }

    @Override // androidx.appcompat.view.menu.iz1
    public final /* bridge */ /* synthetic */ void n() {
        super.n();
    }

    @Override // androidx.appcompat.view.menu.j82
    public final /* bridge */ /* synthetic */ l92 o() {
        return super.o();
    }

    @Override // androidx.appcompat.view.menu.j82
    public final /* bridge */ /* synthetic */ ze2 p() {
        return super.p();
    }

    @Override // androidx.appcompat.view.menu.j82
    public final /* bridge */ /* synthetic */ og1 q() {
        return super.q();
    }

    @Override // androidx.appcompat.view.menu.j82
    public final /* bridge */ /* synthetic */ uv1 r() {
        return super.r();
    }

    @Override // androidx.appcompat.view.menu.j82
    public final /* bridge */ /* synthetic */ s62 s() {
        return super.s();
    }

    @Override // androidx.appcompat.view.menu.j82
    public final /* bridge */ /* synthetic */ n82 t() {
        return super.t();
    }

    @Override // androidx.appcompat.view.menu.p82
    public final boolean x() {
        return false;
    }

    public final Pair z(String str, oz1 oz1Var) {
        return oz1Var.x() ? y(str) : new Pair("", Boolean.FALSE);
    }
}
