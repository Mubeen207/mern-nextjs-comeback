package androidx.appcompat.view.menu;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.util.HashMap;
/* loaded from: classes.dex */
public final class n82 extends j82 {
    public n82(r82 r82Var) {
        super(r82Var);
    }

    private final String v(String str) {
        String Q = r().Q(str);
        if (TextUtils.isEmpty(Q)) {
            return (String) vi1.s.a(null);
        }
        Uri parse = Uri.parse((String) vi1.s.a(null));
        Uri.Builder buildUpon = parse.buildUpon();
        String authority = parse.getAuthority();
        buildUpon.authority(Q + "." + authority);
        return buildUpon.build().toString();
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

    public final t82 u(String str) {
        if (zd2.a() && e().s(vi1.A0)) {
            l().K().a("sgtm feature flag enabled.");
            uw1 D0 = q().D0(str);
            if (D0 == null) {
                return new t82(v(str));
            }
            t82 t82Var = null;
            if (D0.t()) {
                l().K().a("sgtm upload enabled in manifest.");
                ur1 L = r().L(D0.t0());
                if (L != null) {
                    String S = L.S();
                    if (!TextUtils.isEmpty(S)) {
                        String R = L.R();
                        l().K().c("sgtm configured with upload_url, server_info", S, TextUtils.isEmpty(R) ? "Y" : "N");
                        if (TextUtils.isEmpty(R)) {
                            t82Var = new t82(S);
                        } else {
                            HashMap hashMap = new HashMap();
                            hashMap.put("x-google-sgtm-server-info", R);
                            t82Var = new t82(S, hashMap);
                        }
                    }
                }
            }
            if (t82Var != null) {
                return t82Var;
            }
        }
        return new t82(v(str));
    }
}
