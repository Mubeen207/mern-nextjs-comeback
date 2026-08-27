package androidx.appcompat.view.menu;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
/* loaded from: classes.dex */
public final class st1 extends gz1 {
    public char c;
    public long d;
    public String e;
    public final vt1 f;
    public final vt1 g;
    public final vt1 h;
    public final vt1 i;
    public final vt1 j;
    public final vt1 k;
    public final vt1 l;
    public final vt1 m;
    public final vt1 n;

    public st1(fx1 fx1Var) {
        super(fx1Var);
        this.c = (char) 0;
        this.d = -1L;
        this.f = new vt1(this, 6, false, false);
        this.g = new vt1(this, 6, true, false);
        this.h = new vt1(this, 6, false, true);
        this.i = new vt1(this, 5, false, false);
        this.j = new vt1(this, 5, true, false);
        this.k = new vt1(this, 5, false, true);
        this.l = new vt1(this, 4, false, false);
        this.m = new vt1(this, 3, false, false);
        this.n = new vt1(this, 2, false, false);
    }

    public static String E(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int lastIndexOf = str.lastIndexOf(46);
        return lastIndexOf == -1 ? (kb2.a() && ((Boolean) vi1.H0.a(null)).booleanValue()) ? "" : str : str.substring(0, lastIndexOf);
    }

    public static Object v(String str) {
        if (str == null) {
            return null;
        }
        return new bu1(str);
    }

    public static String w(boolean z, Object obj) {
        String str;
        String className;
        if (obj == null) {
            return "";
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf(((Integer) obj).intValue());
        }
        int i = 0;
        if (obj instanceof Long) {
            if (z) {
                Long l = (Long) obj;
                if (Math.abs(l.longValue()) < 100) {
                    return String.valueOf(obj);
                }
                String str2 = String.valueOf(obj).charAt(0) == '-' ? "-" : "";
                String valueOf = String.valueOf(Math.abs(l.longValue()));
                long round = Math.round(Math.pow(10.0d, valueOf.length() - 1));
                long round2 = Math.round(Math.pow(10.0d, valueOf.length()) - 1.0d);
                return str2 + round + "..." + str2 + round2;
            }
            return String.valueOf(obj);
        } else if (obj instanceof Boolean) {
            return String.valueOf(obj);
        } else {
            if (!(obj instanceof Throwable)) {
                if (!(obj instanceof bu1)) {
                    return z ? "-" : String.valueOf(obj);
                }
                str = ((bu1) obj).a;
                return str;
            }
            Throwable th = (Throwable) obj;
            StringBuilder sb = new StringBuilder(z ? th.getClass().getName() : th.toString());
            String E = E(fx1.class.getCanonicalName());
            StackTraceElement[] stackTrace = th.getStackTrace();
            int length = stackTrace.length;
            while (true) {
                if (i >= length) {
                    break;
                }
                StackTraceElement stackTraceElement = stackTrace[i];
                if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null && E(className).equals(E)) {
                    sb.append(": ");
                    sb.append(stackTraceElement);
                    break;
                }
                i++;
            }
            return sb.toString();
        }
    }

    public static String x(boolean z, String str, Object obj, Object obj2, Object obj3) {
        String str2 = "";
        if (str == null) {
            str = "";
        }
        String w = w(z, obj);
        String w2 = w(z, obj2);
        String w3 = w(z, obj3);
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(w)) {
            sb.append(str2);
            sb.append(w);
            str2 = ", ";
        }
        if (TextUtils.isEmpty(w2)) {
            str3 = str2;
        } else {
            sb.append(str2);
            sb.append(w2);
        }
        if (!TextUtils.isEmpty(w3)) {
            sb.append(str3);
            sb.append(w3);
        }
        return sb.toString();
    }

    public final boolean C(int i) {
        return Log.isLoggable(P(), i);
    }

    public final vt1 F() {
        return this.m;
    }

    public final vt1 G() {
        return this.f;
    }

    public final vt1 H() {
        return this.h;
    }

    public final vt1 I() {
        return this.g;
    }

    public final vt1 J() {
        return this.l;
    }

    public final vt1 K() {
        return this.n;
    }

    public final vt1 L() {
        return this.i;
    }

    public final vt1 M() {
        return this.k;
    }

    public final vt1 N() {
        return this.j;
    }

    public final String O() {
        Pair a;
        if (i().d == null || (a = i().d.a()) == null || a == wu1.z) {
            return null;
        }
        String valueOf = String.valueOf(a.second);
        return valueOf + ":" + ((String) a.first);
    }

    public final String P() {
        String str;
        synchronized (this) {
            try {
                if (this.e == null) {
                    this.e = this.a.O() != null ? this.a.O() : "FA";
                }
                pj0.i(this.e);
                str = this.e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
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

    @Override // androidx.appcompat.view.menu.gz1
    public final boolean s() {
        return false;
    }

    public final void y(int i, String str) {
        P();
    }

    public final void z(int i, boolean z, boolean z2, String str, Object obj, Object obj2, Object obj3) {
        if (!z && C(i)) {
            y(i, x(false, str, obj, obj2, obj3));
        }
        if (z2 || i < 5) {
            return;
        }
        pj0.i(str);
        mw1 G = this.a.G();
        if (G == null) {
            y(6, "Scheduler not set. Not logging error/warn");
        } else if (!G.r()) {
            y(6, "Scheduler not initialized. Not logging error/warn");
        } else {
            if (i < 0) {
                i = 0;
            }
            if (i >= 9) {
                i = 8;
            }
            G.D(new xt1(this, i, str, obj, obj2, obj3));
        }
    }
}
