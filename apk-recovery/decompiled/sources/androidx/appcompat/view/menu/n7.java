package androidx.appcompat.view.menu;

import android.content.pm.PackageParser;
import androidx.appcompat.view.menu.cw;
import androidx.appcompat.view.menu.rv;
import androidx.appcompat.view.menu.t02;
import java.io.PrintWriter;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class n7 extends cw implements rv.h {
    public final rv t;
    public boolean u;
    public int v;
    public boolean w;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public n7(androidx.appcompat.view.menu.rv r3) {
        /*
            r2 = this;
            androidx.appcompat.view.menu.jv r0 = r3.i0()
            r3.j0()
            r1 = 0
            r2.<init>(r0, r1)
            r0 = -1
            r2.v = r0
            r0 = 0
            r2.w = r0
            r2.t = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.n7.<init>(androidx.appcompat.view.menu.rv):void");
    }

    @Override // androidx.appcompat.view.menu.rv.h
    public boolean a(ArrayList arrayList, ArrayList arrayList2) {
        if (rv.v0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Run: ");
            sb.append(this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (this.i) {
            this.t.f(this);
            return true;
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.cw
    public int e() {
        return p(false);
    }

    @Override // androidx.appcompat.view.menu.cw
    public int f() {
        return p(true);
    }

    @Override // androidx.appcompat.view.menu.cw
    public void g() {
        i();
        this.t.R(this, false);
    }

    @Override // androidx.appcompat.view.menu.cw
    public void h() {
        i();
        this.t.R(this, true);
    }

    @Override // androidx.appcompat.view.menu.cw
    public void j(int i, fv fvVar, String str, int i2) {
        super.j(i, fvVar, str, i2);
        fvVar.t = this.t;
    }

    @Override // androidx.appcompat.view.menu.cw
    public cw k(fv fvVar) {
        rv rvVar = fvVar.t;
        if (rvVar == null || rvVar == this.t) {
            return super.k(fvVar);
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + fvVar.toString() + " is already attached to a FragmentManager.");
    }

    public void o(int i) {
        if (this.i) {
            if (rv.v0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Bump nesting in ");
                sb.append(this);
                sb.append(" by ");
                sb.append(i);
            }
            int size = this.c.size();
            for (int i2 = 0; i2 < size; i2++) {
                cw.a aVar = (cw.a) this.c.get(i2);
                fv fvVar = aVar.b;
                if (fvVar != null) {
                    fvVar.s += i;
                    if (rv.v0(2)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Bump nesting of ");
                        sb2.append(aVar.b);
                        sb2.append(" to ");
                        sb2.append(aVar.b.s);
                    }
                }
            }
        }
    }

    public int p(boolean z) {
        if (this.u) {
            throw new IllegalStateException("commit already called");
        }
        if (rv.v0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Commit: ");
            sb.append(this);
            PrintWriter printWriter = new PrintWriter(new na0("FragmentManager"));
            q("  ", printWriter);
            printWriter.close();
        }
        this.u = true;
        if (this.i) {
            this.v = this.t.i();
        } else {
            this.v = -1;
        }
        this.t.O(this, z);
        return this.v;
    }

    public void q(String str, PrintWriter printWriter) {
        r(str, printWriter, true);
    }

    public void r(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.k);
            printWriter.print(" mIndex=");
            printWriter.print(this.v);
            printWriter.print(" mCommitted=");
            printWriter.println(this.u);
            if (this.h != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.h));
            }
            if (this.d != 0 || this.e != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.d));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.e));
            }
            if (this.f != 0 || this.g != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.g));
            }
            if (this.l != 0 || this.m != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.l));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.m);
            }
            if (this.n != 0 || this.o != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.n));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.o);
            }
        }
        if (this.c.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = this.c.size();
        for (int i = 0; i < size; i++) {
            cw.a aVar = (cw.a) this.c.get(i);
            switch (aVar.a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case t02.c.c /* 3 */:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case t02.c.e /* 5 */:
                    str2 = "SHOW";
                    break;
                case t02.c.f /* 6 */:
                    str2 = "DETACH";
                    break;
                case t02.c.g /* 7 */:
                    str2 = "ATTACH";
                    break;
                case PackageParser.PARSE_IGNORE_PROCESSES /* 8 */:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + aVar.a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(aVar.b);
            if (z) {
                if (aVar.d != 0 || aVar.e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.e));
                }
                if (aVar.f != 0 || aVar.g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.g));
                }
            }
        }
    }

    public void s() {
        int size = this.c.size();
        for (int i = 0; i < size; i++) {
            cw.a aVar = (cw.a) this.c.get(i);
            fv fvVar = aVar.b;
            if (fvVar != null) {
                fvVar.n = this.w;
                fvVar.a1(false);
                fvVar.Z0(this.h);
                fvVar.c1(this.p, this.q);
            }
            switch (aVar.a) {
                case 1:
                    fvVar.W0(aVar.d, aVar.e, aVar.f, aVar.g);
                    this.t.Y0(fvVar, false);
                    this.t.g(fvVar);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.a);
                case t02.c.c /* 3 */:
                    fvVar.W0(aVar.d, aVar.e, aVar.f, aVar.g);
                    this.t.S0(fvVar);
                    break;
                case 4:
                    fvVar.W0(aVar.d, aVar.e, aVar.f, aVar.g);
                    this.t.s0(fvVar);
                    break;
                case t02.c.e /* 5 */:
                    fvVar.W0(aVar.d, aVar.e, aVar.f, aVar.g);
                    this.t.Y0(fvVar, false);
                    this.t.c1(fvVar);
                    break;
                case t02.c.f /* 6 */:
                    fvVar.W0(aVar.d, aVar.e, aVar.f, aVar.g);
                    this.t.t(fvVar);
                    break;
                case t02.c.g /* 7 */:
                    fvVar.W0(aVar.d, aVar.e, aVar.f, aVar.g);
                    this.t.Y0(fvVar, false);
                    this.t.k(fvVar);
                    break;
                case PackageParser.PARSE_IGNORE_PROCESSES /* 8 */:
                    this.t.a1(fvVar);
                    break;
                case 9:
                    this.t.a1(null);
                    break;
                case 10:
                    this.t.Z0(fvVar, aVar.i);
                    break;
            }
        }
    }

    public void t() {
        for (int size = this.c.size() - 1; size >= 0; size--) {
            cw.a aVar = (cw.a) this.c.get(size);
            fv fvVar = aVar.b;
            if (fvVar != null) {
                fvVar.n = this.w;
                fvVar.a1(true);
                fvVar.Z0(rv.W0(this.h));
                fvVar.c1(this.q, this.p);
            }
            switch (aVar.a) {
                case 1:
                    fvVar.W0(aVar.d, aVar.e, aVar.f, aVar.g);
                    this.t.Y0(fvVar, true);
                    this.t.S0(fvVar);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.a);
                case t02.c.c /* 3 */:
                    fvVar.W0(aVar.d, aVar.e, aVar.f, aVar.g);
                    this.t.g(fvVar);
                    break;
                case 4:
                    fvVar.W0(aVar.d, aVar.e, aVar.f, aVar.g);
                    this.t.c1(fvVar);
                    break;
                case t02.c.e /* 5 */:
                    fvVar.W0(aVar.d, aVar.e, aVar.f, aVar.g);
                    this.t.Y0(fvVar, true);
                    this.t.s0(fvVar);
                    break;
                case t02.c.f /* 6 */:
                    fvVar.W0(aVar.d, aVar.e, aVar.f, aVar.g);
                    this.t.k(fvVar);
                    break;
                case t02.c.g /* 7 */:
                    fvVar.W0(aVar.d, aVar.e, aVar.f, aVar.g);
                    this.t.Y0(fvVar, true);
                    this.t.t(fvVar);
                    break;
                case PackageParser.PARSE_IGNORE_PROCESSES /* 8 */:
                    this.t.a1(null);
                    break;
                case 9:
                    this.t.a1(fvVar);
                    break;
                case 10:
                    this.t.Z0(fvVar, aVar.h);
                    break;
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder((int) PackageParser.PARSE_IS_PRIVILEGED);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.v >= 0) {
            sb.append(" #");
            sb.append(this.v);
        }
        if (this.k != null) {
            sb.append(" ");
            sb.append(this.k);
        }
        sb.append("}");
        return sb.toString();
    }

    public fv u(ArrayList arrayList, fv fvVar) {
        fv fvVar2 = fvVar;
        int i = 0;
        while (i < this.c.size()) {
            cw.a aVar = (cw.a) this.c.get(i);
            int i2 = aVar.a;
            if (i2 != 1) {
                if (i2 == 2) {
                    fv fvVar3 = aVar.b;
                    int i3 = fvVar3.x;
                    boolean z = false;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        fv fvVar4 = (fv) arrayList.get(size);
                        if (fvVar4.x == i3) {
                            if (fvVar4 == fvVar3) {
                                z = true;
                            } else {
                                if (fvVar4 == fvVar2) {
                                    this.c.add(i, new cw.a(9, fvVar4, true));
                                    i++;
                                    fvVar2 = null;
                                }
                                cw.a aVar2 = new cw.a(3, fvVar4, true);
                                aVar2.d = aVar.d;
                                aVar2.f = aVar.f;
                                aVar2.e = aVar.e;
                                aVar2.g = aVar.g;
                                this.c.add(i, aVar2);
                                arrayList.remove(fvVar4);
                                i++;
                            }
                        }
                    }
                    if (z) {
                        this.c.remove(i);
                        i--;
                    } else {
                        aVar.a = 1;
                        aVar.c = true;
                        arrayList.add(fvVar3);
                    }
                } else if (i2 == 3 || i2 == 6) {
                    arrayList.remove(aVar.b);
                    fv fvVar5 = aVar.b;
                    if (fvVar5 == fvVar2) {
                        this.c.add(i, new cw.a(9, fvVar5));
                        i++;
                        fvVar2 = null;
                    }
                } else if (i2 != 7) {
                    if (i2 == 8) {
                        this.c.add(i, new cw.a(9, fvVar2, true));
                        aVar.c = true;
                        i++;
                        fvVar2 = aVar.b;
                    }
                }
                i++;
            }
            arrayList.add(aVar.b);
            i++;
        }
        return fvVar2;
    }

    public String v() {
        return this.k;
    }

    public void w() {
        if (this.s != null) {
            for (int i = 0; i < this.s.size(); i++) {
                ((Runnable) this.s.get(i)).run();
            }
            this.s = null;
        }
    }

    public fv x(ArrayList arrayList, fv fvVar) {
        for (int size = this.c.size() - 1; size >= 0; size--) {
            cw.a aVar = (cw.a) this.c.get(size);
            int i = aVar.a;
            if (i != 1) {
                if (i != 3) {
                    switch (i) {
                        case PackageParser.PARSE_IGNORE_PROCESSES /* 8 */:
                            fvVar = null;
                            break;
                        case 9:
                            fvVar = aVar.b;
                            break;
                        case 10:
                            aVar.i = aVar.h;
                            break;
                    }
                }
                arrayList.add(aVar.b);
            }
            arrayList.remove(aVar.b);
        }
        return fvVar;
    }
}
