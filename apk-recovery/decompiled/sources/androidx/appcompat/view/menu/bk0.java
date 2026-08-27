package androidx.appcompat.view.menu;

import android.content.pm.ApplicationInfo;
import android.os.Binder;
import android.os.ConditionVariable;
import android.os.IInterface;
import java.util.Arrays;
/* loaded from: classes.dex */
public class bk0 extends Binder {
    public final ApplicationInfo l;
    public final String m;
    public m00 n;
    public IInterface o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;
    public final ConditionVariable v = new ConditionVariable();

    public bk0(ApplicationInfo applicationInfo, String str) {
        this.l = applicationInfo;
        this.m = str;
    }

    public p3 a() {
        p3 p3Var = new p3();
        p3Var.m = this.l.packageName;
        p3Var.n = this.m;
        p3Var.o = this.s;
        p3Var.p = this.r;
        p3Var.q = this.p;
        p3Var.s = this.t;
        p3Var.r = this.u;
        p3Var.t = this;
        return p3Var;
    }

    public String b() {
        return this.l.packageName;
    }

    public String c() {
        return nl0.e(this.s);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.m, Integer.valueOf(this.q), Integer.valueOf(this.r), Integer.valueOf(this.s), Integer.valueOf(this.p), Integer.valueOf(this.q), Integer.valueOf(this.u)});
    }
}
