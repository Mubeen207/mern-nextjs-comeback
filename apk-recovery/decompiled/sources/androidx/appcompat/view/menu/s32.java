package androidx.appcompat.view.menu;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import androidx.appcompat.view.menu.ns1;
import androidx.appcompat.view.menu.ps1;
import androidx.appcompat.view.menu.rs1;
import androidx.appcompat.view.menu.ss1;
import androidx.appcompat.view.menu.ws1;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public final class s32 extends p82 {
    public s32(r82 r82Var) {
        super(r82Var);
    }

    private static String c(String str, String str2) {
        throw new SecurityException("This implementation should not be used.");
    }

    @Override // androidx.appcompat.view.menu.p82
    public final boolean x() {
        return false;
    }

    public final byte[] y(ri1 ri1Var, String str) {
        ca2 ca2Var;
        ss1.a aVar;
        Bundle bundle;
        uw1 uw1Var;
        rs1.a aVar2;
        byte[] bArr;
        long j;
        ji1 a;
        n();
        this.a.Q();
        pj0.i(ri1Var);
        pj0.e(str);
        if (!e().B(str, vi1.f0)) {
            l().F().b("Generating ScionPayload disabled. packageName", str);
            return new byte[0];
        } else if (!"_iap".equals(ri1Var.m) && !"_iapx".equals(ri1Var.m)) {
            l().F().c("Generating a payload for this event is not available. package_name, event_name", str, ri1Var.m);
            return null;
        } else {
            rs1.a J = rs1.J();
            q().Q0();
            try {
                uw1 D0 = q().D0(str);
                if (D0 == null) {
                    l().F().b("Log and bundle not available. package_name", str);
                    return new byte[0];
                } else if (!D0.r()) {
                    l().F().b("Log and bundle disabled. package_name", str);
                    return new byte[0];
                } else {
                    ss1.a J0 = ss1.A3().h0(1).J0("android");
                    if (!TextUtils.isEmpty(D0.t0())) {
                        J0.J(D0.t0());
                    }
                    if (!TextUtils.isEmpty(D0.v0())) {
                        J0.V((String) pj0.i(D0.v0()));
                    }
                    if (!TextUtils.isEmpty(D0.h())) {
                        J0.b0((String) pj0.i(D0.h()));
                    }
                    if (D0.z() != -2147483648L) {
                        J0.Y((int) D0.z());
                    }
                    J0.e0(D0.g0()).T(D0.c0());
                    String j2 = D0.j();
                    String r0 = D0.r0();
                    if (!TextUtils.isEmpty(j2)) {
                        J0.D0(j2);
                    } else if (!TextUtils.isEmpty(r0)) {
                        J0.D(r0);
                    }
                    J0.t0(D0.p0());
                    oz1 Q = this.b.Q(str);
                    J0.N(D0.a0());
                    if (this.a.p() && e().K(J0.N0()) && Q.x() && !TextUtils.isEmpty(null)) {
                        J0.u0(null);
                    }
                    J0.j0(Q.v());
                    if (Q.x() && D0.q()) {
                        Pair z = s().z(D0.t0(), Q);
                        if (D0.q() && z != null && !TextUtils.isEmpty((CharSequence) z.first)) {
                            J0.L0(c((String) z.first, Long.toString(ri1Var.p)));
                            Object obj = z.second;
                            if (obj != null) {
                                J0.Q(((Boolean) obj).booleanValue());
                            }
                        }
                    }
                    f().o();
                    ss1.a r02 = J0.r0(Build.MODEL);
                    f().o();
                    r02.H0(Build.VERSION.RELEASE).p0((int) f().v()).O0(f().w());
                    if (Q.y() && D0.u0() != null) {
                        J0.P(c((String) pj0.i(D0.u0()), Long.toString(ri1Var.p)));
                    }
                    if (!TextUtils.isEmpty(D0.i())) {
                        J0.B0((String) pj0.i(D0.i()));
                    }
                    String t0 = D0.t0();
                    List M0 = q().M0(t0);
                    Iterator it = M0.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            ca2Var = null;
                            break;
                        }
                        ca2Var = (ca2) it.next();
                        if ("_lte".equals(ca2Var.c)) {
                            break;
                        }
                    }
                    if (ca2Var == null || ca2Var.e == null) {
                        ca2 ca2Var2 = new ca2(t0, "auto", "_lte", b().a(), 0L);
                        M0.add(ca2Var2);
                        q().e0(ca2Var2);
                    }
                    ws1[] ws1VarArr = new ws1[M0.size()];
                    for (int i = 0; i < M0.size(); i++) {
                        ws1.a w = ws1.X().u(((ca2) M0.get(i)).c).w(((ca2) M0.get(i)).d);
                        o().U(w, ((ca2) M0.get(i)).e);
                        ws1VarArr[i] = (ws1) ((t02) w.j());
                    }
                    J0.a0(Arrays.asList(ws1VarArr));
                    o().T(J0);
                    if (qa2.a() && e().s(vi1.T0)) {
                        this.b.v(D0, J0);
                    }
                    zt1 b = zt1.b(ri1Var);
                    j().M(b.d, q().A0(str));
                    j().V(b, e().y(str));
                    Bundle bundle2 = b.d;
                    bundle2.putLong("_c", 1L);
                    l().F().a("Marking in-app purchase as real-time");
                    bundle2.putLong("_r", 1L);
                    bundle2.putString("_o", ri1Var.o);
                    if (j().F0(J0.N0())) {
                        j().N(bundle2, "_dbg", 1L);
                        j().N(bundle2, "_r", 1L);
                    }
                    ji1 C0 = q().C0(str, ri1Var.m);
                    if (C0 == null) {
                        aVar = J0;
                        bundle = bundle2;
                        uw1Var = D0;
                        aVar2 = J;
                        bArr = null;
                        a = new ji1(str, ri1Var.m, 0L, 0L, ri1Var.p, 0L, null, null, null, null);
                        j = 0;
                    } else {
                        aVar = J0;
                        bundle = bundle2;
                        uw1Var = D0;
                        aVar2 = J;
                        bArr = null;
                        j = C0.f;
                        a = C0.a(ri1Var.p);
                    }
                    q().U(a);
                    kh1 kh1Var = new kh1(this.a, ri1Var.o, str, ri1Var.m, ri1Var.p, j, bundle);
                    ns1.a v = ns1.Z().B(kh1Var.d).z(kh1Var.b).v(kh1Var.e);
                    Iterator it2 = kh1Var.f.iterator();
                    while (it2.hasNext()) {
                        String str2 = (String) it2.next();
                        ps1.a w2 = ps1.Z().w(str2);
                        Object p = kh1Var.f.p(str2);
                        if (p != null) {
                            o().S(w2, p);
                            v.w(w2);
                        }
                    }
                    ss1.a aVar3 = aVar;
                    aVar3.y(v).z(ts1.G().r(os1.G().r(a.c).s(ri1Var.m)));
                    aVar3.C(p().z(uw1Var.t0(), Collections.emptyList(), aVar3.U0(), Long.valueOf(v.D()), Long.valueOf(v.D())));
                    if (v.H()) {
                        aVar3.q0(v.D()).Z(v.D());
                    }
                    long i0 = uw1Var.i0();
                    int i2 = (i0 > 0L ? 1 : (i0 == 0L ? 0 : -1));
                    if (i2 != 0) {
                        aVar3.i0(i0);
                    }
                    long m0 = uw1Var.m0();
                    if (m0 != 0) {
                        aVar3.m0(m0);
                    } else if (i2 != 0) {
                        aVar3.m0(i0);
                    }
                    String m = uw1Var.m();
                    if (hd2.a() && e().B(str, vi1.y0) && m != null) {
                        aVar3.M0(m);
                    }
                    uw1Var.p();
                    aVar3.d0((int) uw1Var.k0()).A0(82001L).x0(b().a()).W(true);
                    if (e().s(vi1.C0)) {
                        this.b.B(aVar3.N0(), aVar3);
                    }
                    rs1.a aVar4 = aVar2;
                    aVar4.s(aVar3);
                    uw1 uw1Var2 = uw1Var;
                    uw1Var2.j0(aVar3.R());
                    uw1Var2.f0(aVar3.L());
                    q().V(uw1Var2);
                    q().T0();
                    try {
                        return o().g0(((rs1) ((t02) aVar4.j())).h());
                    } catch (IOException e) {
                        l().G().c("Data loss. Failed to bundle and serialize. appId", st1.v(str), e);
                        return bArr;
                    }
                }
            } catch (SecurityException e2) {
                l().F().b("Resettable device id encryption failed", e2.getMessage());
                return new byte[0];
            } catch (SecurityException e3) {
                l().F().b("app instance id encryption failed", e3.getMessage());
                return new byte[0];
            } finally {
                q().R0();
            }
        }
    }
}
