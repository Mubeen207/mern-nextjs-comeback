package androidx.appcompat.view.menu;

import android.content.Context;
import androidx.appcompat.view.menu.oz1;
import java.math.BigInteger;
import java.util.List;
import java.util.Locale;
/* loaded from: classes.dex */
public final class ct1 extends fp1 {
    public String c;
    public String d;
    public int e;
    public String f;
    public String g;
    public long h;
    public long i;
    public List j;
    public String k;
    public int l;
    public String m;
    public String n;
    public String o;
    public long p;
    public String q;

    public ct1(fx1 fx1Var, long j) {
        super(fx1Var);
        this.p = 0L;
        this.q = null;
        this.i = j;
    }

    private final String J() {
        if (ae2.a() && e().s(vi1.n0)) {
            l().K().a("Disabled IID for tests.");
            return null;
        }
        try {
            Class<?> loadClass = a().getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
            if (loadClass == null) {
                return null;
            }
            try {
                Object invoke = loadClass.getDeclaredMethod("getInstance", Context.class).invoke(null, a());
                if (invoke == null) {
                    return null;
                }
                try {
                    return (String) loadClass.getDeclaredMethod("getFirebaseInstanceId", new Class[0]).invoke(invoke, new Object[0]);
                } catch (Exception unused) {
                    l().M().a("Failed to retrieve Firebase Instance Id");
                    return null;
                }
            } catch (Exception unused2) {
                l().N().a("Failed to obtain Firebase Analytics instance");
                return null;
            }
        } catch (ClassNotFoundException unused3) {
        }
    }

    @Override // androidx.appcompat.view.menu.fp1
    public final boolean A() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x017f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.appcompat.view.menu.fb2 B(java.lang.String r47) {
        /*
            Method dump skipped, instructions count: 519
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ct1.B(java.lang.String):androidx.appcompat.view.menu.fb2");
    }

    public final int C() {
        v();
        return this.l;
    }

    public final int D() {
        v();
        return this.e;
    }

    public final String E() {
        v();
        return this.n;
    }

    public final String F() {
        v();
        pj0.i(this.c);
        return this.c;
    }

    public final String G() {
        n();
        v();
        pj0.i(this.m);
        return this.m;
    }

    public final List H() {
        return this.j;
    }

    public final void I() {
        String format;
        n();
        if (i().J().l(oz1.a.ANALYTICS_STORAGE)) {
            byte[] bArr = new byte[16];
            j().U0().nextBytes(bArr);
            format = String.format(Locale.US, "%032x", new BigInteger(1, bArr));
        } else {
            l().F().a("Analytics Storage consent is not granted");
            format = null;
        }
        vt1 F = l().F();
        Object[] objArr = new Object[1];
        objArr[0] = format == null ? "null" : "not null";
        F.a(String.format("Resetting session stitching token to %s", objArr));
        this.o = format;
        this.p = b().a();
    }

    public final boolean K(String str) {
        String str2 = this.q;
        boolean z = (str2 == null || str2.equals(str)) ? false : true;
        this.q = str;
        return z;
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

    @Override // androidx.appcompat.view.menu.kr1, androidx.appcompat.view.menu.iz1
    public final /* bridge */ /* synthetic */ void k() {
        super.k();
    }

    @Override // androidx.appcompat.view.menu.iz1, androidx.appcompat.view.menu.lz1
    public final /* bridge */ /* synthetic */ st1 l() {
        return super.l();
    }

    @Override // androidx.appcompat.view.menu.kr1, androidx.appcompat.view.menu.iz1
    public final /* bridge */ /* synthetic */ void m() {
        super.m();
    }

    @Override // androidx.appcompat.view.menu.kr1, androidx.appcompat.view.menu.iz1
    public final /* bridge */ /* synthetic */ void n() {
        super.n();
    }

    @Override // androidx.appcompat.view.menu.kr1
    public final /* bridge */ /* synthetic */ rh1 o() {
        return super.o();
    }

    @Override // androidx.appcompat.view.menu.kr1
    public final /* bridge */ /* synthetic */ ct1 p() {
        return super.p();
    }

    @Override // androidx.appcompat.view.menu.kr1
    public final /* bridge */ /* synthetic */ it1 q() {
        return super.q();
    }

    @Override // androidx.appcompat.view.menu.kr1
    public final /* bridge */ /* synthetic */ g02 r() {
        return super.r();
    }

    @Override // androidx.appcompat.view.menu.kr1
    public final /* bridge */ /* synthetic */ u32 s() {
        return super.s();
    }

    @Override // androidx.appcompat.view.menu.kr1
    public final /* bridge */ /* synthetic */ k42 t() {
        return super.t();
    }

    @Override // androidx.appcompat.view.menu.kr1
    public final /* bridge */ /* synthetic */ b72 u() {
        return super.u();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(21:1|(1:3)(6:65|66|(1:68)(2:83|(1:85))|69|70|(21:72|(1:74)(1:81)|76|77|5|(1:64)(1:9)|10|11|(1:14)|15|(1:17)|18|19|(1:21)(1:51)|22|(1:24)|(3:26|(1:28)(1:31)|29)|32|(3:34|(1:36)(3:43|(3:46|(1:48)|44)|49)|(2:38|39)(2:41|42))|50|(0)(0)))|4|5|(1:7)|64|10|11|(0)|15|(0)|18|19|(0)(0)|22|(0)|(0)|32|(0)|50|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01ac, code lost:
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01cd, code lost:
        l().G().c("Fetching Google App Id failed with exception. appId", androidx.appcompat.view.menu.st1.v(r0), r3);
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0194 A[Catch: IllegalStateException -> 0x01ac, TryCatch #3 {IllegalStateException -> 0x01ac, blocks: (B:50:0x016f, B:54:0x018c, B:56:0x0194, B:60:0x01b0, B:62:0x01c4, B:64:0x01c9, B:63:0x01c7), top: B:90:0x016f }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01b0 A[Catch: IllegalStateException -> 0x01ac, TryCatch #3 {IllegalStateException -> 0x01ac, blocks: (B:50:0x016f, B:54:0x018c, B:56:0x0194, B:60:0x01b0, B:62:0x01c4, B:64:0x01c9, B:63:0x01c7), top: B:90:0x016f }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x022d  */
    @Override // androidx.appcompat.view.menu.fp1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void y() {
        /*
            Method dump skipped, instructions count: 582
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ct1.y():void");
    }
}
