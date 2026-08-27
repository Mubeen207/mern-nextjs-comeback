package androidx.appcompat.view.menu;

import android.content.pm.PackageParser;
import androidx.appcompat.view.menu.bw0;
import androidx.appcompat.view.menu.t02;
import java.util.HashSet;
import java.util.Iterator;
/* loaded from: classes.dex */
public class kf {
    public final mf b;
    public final b c;
    public kf d;
    public bw0 g;
    public HashSet a = null;
    public int e = 0;
    public int f = -1;

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[b.values().length];
            a = iArr;
            try {
                iArr[b.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[b.LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[b.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[b.TOP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[b.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[b.BASELINE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[b.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[b.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[b.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* loaded from: classes.dex */
    public enum b {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public kf(mf mfVar, b bVar) {
        this.b = mfVar;
        this.c = bVar;
    }

    public boolean a(kf kfVar, int i) {
        return b(kfVar, i, -1, false);
    }

    public boolean b(kf kfVar, int i, int i2, boolean z) {
        if (kfVar == null) {
            l();
            return true;
        } else if (z || k(kfVar)) {
            this.d = kfVar;
            if (kfVar.a == null) {
                kfVar.a = new HashSet();
            }
            this.d.a.add(this);
            if (i > 0) {
                this.e = i;
            } else {
                this.e = 0;
            }
            this.f = i2;
            return true;
        } else {
            return false;
        }
    }

    public int c() {
        kf kfVar;
        if (this.b.O() == 8) {
            return 0;
        }
        return (this.f <= -1 || (kfVar = this.d) == null || kfVar.b.O() != 8) ? this.e : this.f;
    }

    public final kf d() {
        switch (a.a[this.c.ordinal()]) {
            case 1:
            case t02.c.f /* 6 */:
            case t02.c.g /* 7 */:
            case PackageParser.PARSE_IGNORE_PROCESSES /* 8 */:
            case 9:
                return null;
            case 2:
                return this.b.D;
            case t02.c.c /* 3 */:
                return this.b.B;
            case 4:
                return this.b.E;
            case t02.c.e /* 5 */:
                return this.b.C;
            default:
                throw new AssertionError(this.c.name());
        }
    }

    public mf e() {
        return this.b;
    }

    public bw0 f() {
        return this.g;
    }

    public kf g() {
        return this.d;
    }

    public b h() {
        return this.c;
    }

    public boolean i() {
        HashSet hashSet = this.a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((kf) it.next()).d().j()) {
                return true;
            }
        }
        return false;
    }

    public boolean j() {
        return this.d != null;
    }

    public boolean k(kf kfVar) {
        boolean z = false;
        if (kfVar == null) {
            return false;
        }
        b h = kfVar.h();
        b bVar = this.c;
        if (h == bVar) {
            return bVar != b.BASELINE || (kfVar.e().S() && e().S());
        }
        switch (a.a[bVar.ordinal()]) {
            case 1:
                return (h == b.BASELINE || h == b.CENTER_X || h == b.CENTER_Y) ? false : true;
            case 2:
            case t02.c.c /* 3 */:
                boolean z2 = h == b.LEFT || h == b.RIGHT;
                if (kfVar.e() instanceof oy) {
                    if (z2 || h == b.CENTER_X) {
                        z = true;
                    }
                    return z;
                }
                return z2;
            case 4:
            case t02.c.e /* 5 */:
                boolean z3 = h == b.TOP || h == b.BOTTOM;
                if (kfVar.e() instanceof oy) {
                    if (z3 || h == b.CENTER_Y) {
                        z = true;
                    }
                    return z;
                }
                return z3;
            case t02.c.f /* 6 */:
            case t02.c.g /* 7 */:
            case PackageParser.PARSE_IGNORE_PROCESSES /* 8 */:
            case 9:
                return false;
            default:
                throw new AssertionError(this.c.name());
        }
    }

    public void l() {
        HashSet hashSet;
        kf kfVar = this.d;
        if (kfVar != null && (hashSet = kfVar.a) != null) {
            hashSet.remove(this);
        }
        this.d = null;
        this.e = 0;
        this.f = -1;
    }

    public void m(i9 i9Var) {
        bw0 bw0Var = this.g;
        if (bw0Var == null) {
            this.g = new bw0(bw0.a.UNRESTRICTED, null);
        } else {
            bw0Var.d();
        }
    }

    public void n(int i) {
        if (j()) {
            this.f = i;
        }
    }

    public String toString() {
        return this.b.r() + ":" + this.c.toString();
    }
}
