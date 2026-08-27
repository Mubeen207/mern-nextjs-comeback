package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.appcompat.view.menu.fy;
import androidx.appcompat.view.menu.m2;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
/* loaded from: classes.dex */
public final class wb1 implements fy.a, fy.b {
    public final m2.f m;
    public final r2 n;
    public final jb1 o;
    public final int r;
    public final pc1 s;
    public boolean t;
    public final /* synthetic */ gy x;
    public final Queue l = new LinkedList();
    public final Set p = new HashSet();
    public final Map q = new HashMap();
    public final List u = new ArrayList();
    public ef v = null;
    public int w = 0;

    public wb1(gy gyVar, cy cyVar) {
        Handler handler;
        Context context;
        Handler handler2;
        this.x = gyVar;
        handler = gyVar.A;
        m2.f g = cyVar.g(handler.getLooper(), this);
        this.m = g;
        this.n = cyVar.d();
        this.o = new jb1();
        this.r = cyVar.f();
        if (!g.o()) {
            this.s = null;
            return;
        }
        context = gyVar.r;
        handler2 = gyVar.A;
        this.s = cyVar.h(context, handler2);
    }

    public static /* bridge */ /* synthetic */ void A(wb1 wb1Var, yb1 yb1Var) {
        if (wb1Var.u.contains(yb1Var) && !wb1Var.t) {
            if (wb1Var.m.a()) {
                wb1Var.f();
            } else {
                wb1Var.D();
            }
        }
    }

    public static /* bridge */ /* synthetic */ void B(wb1 wb1Var, yb1 yb1Var) {
        Handler handler;
        Handler handler2;
        mr mrVar;
        mr[] g;
        if (wb1Var.u.remove(yb1Var)) {
            handler = wb1Var.x.A;
            handler.removeMessages(15, yb1Var);
            handler2 = wb1Var.x.A;
            handler2.removeMessages(16, yb1Var);
            mrVar = yb1Var.b;
            ArrayList arrayList = new ArrayList(wb1Var.l.size());
            for (md1 md1Var : wb1Var.l) {
                if ((md1Var instanceof ec1) && (g = ((ec1) md1Var).g(wb1Var)) != null && s4.b(g, mrVar)) {
                    arrayList.add(md1Var);
                }
            }
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                md1 md1Var2 = (md1) arrayList.get(i);
                wb1Var.l.remove(md1Var2);
                md1Var2.b(new z31(mrVar));
            }
        }
    }

    public static /* bridge */ /* synthetic */ r2 v(wb1 wb1Var) {
        return wb1Var.n;
    }

    public static /* bridge */ /* synthetic */ void x(wb1 wb1Var, Status status) {
        wb1Var.d(status);
    }

    public final void C() {
        Handler handler;
        handler = this.x.A;
        pj0.c(handler);
        this.v = null;
    }

    public final void D() {
        Handler handler;
        rd1 rd1Var;
        Context context;
        handler = this.x.A;
        pj0.c(handler);
        if (this.m.a() || this.m.f()) {
            return;
        }
        try {
            gy gyVar = this.x;
            rd1Var = gyVar.t;
            context = gyVar.r;
            int b = rd1Var.b(context, this.m);
            if (b != 0) {
                ef efVar = new ef(b, null);
                String name = this.m.getClass().getName();
                String obj = efVar.toString();
                StringBuilder sb = new StringBuilder(name.length() + 35 + obj.length());
                sb.append("The service for ");
                sb.append(name);
                sb.append(" is not available: ");
                sb.append(obj);
                G(efVar, null);
                return;
            }
            gy gyVar2 = this.x;
            m2.f fVar = this.m;
            ac1 ac1Var = new ac1(gyVar2, fVar, this.n);
            if (fVar.o()) {
                ((pc1) pj0.i(this.s)).x2(ac1Var);
            }
            try {
                this.m.m(ac1Var);
            } catch (SecurityException e) {
                G(new ef(10), e);
            }
        } catch (IllegalStateException e2) {
            G(new ef(10), e2);
        }
    }

    public final void E(md1 md1Var) {
        Handler handler;
        handler = this.x.A;
        pj0.c(handler);
        if (this.m.a()) {
            if (o(md1Var)) {
                l();
                return;
            } else {
                this.l.add(md1Var);
                return;
            }
        }
        this.l.add(md1Var);
        ef efVar = this.v;
        if (efVar == null || !efVar.k()) {
            D();
        } else {
            G(this.v, null);
        }
    }

    public final void F() {
        this.w++;
    }

    public final void G(ef efVar, Exception exc) {
        Handler handler;
        rd1 rd1Var;
        boolean z;
        Status h;
        Status h2;
        Status h3;
        Handler handler2;
        Handler handler3;
        long j;
        Handler handler4;
        Status status;
        Handler handler5;
        Handler handler6;
        handler = this.x.A;
        pj0.c(handler);
        pc1 pc1Var = this.s;
        if (pc1Var != null) {
            pc1Var.y2();
        }
        C();
        rd1Var = this.x.t;
        rd1Var.c();
        c(efVar);
        if ((this.m instanceof ae1) && efVar.d() != 24) {
            this.x.o = true;
            gy gyVar = this.x;
            handler5 = gyVar.A;
            handler6 = gyVar.A;
            handler5.sendMessageDelayed(handler6.obtainMessage(19), 300000L);
        }
        if (efVar.d() == 4) {
            status = gy.D;
            d(status);
        } else if (this.l.isEmpty()) {
            this.v = efVar;
        } else if (exc != null) {
            handler4 = this.x.A;
            pj0.c(handler4);
            e(null, exc, false);
        } else {
            z = this.x.B;
            if (!z) {
                h = gy.h(this.n, efVar);
                d(h);
                return;
            }
            h2 = gy.h(this.n, efVar);
            e(h2, null, true);
            if (this.l.isEmpty() || p(efVar) || this.x.g(efVar, this.r)) {
                return;
            }
            if (efVar.d() == 18) {
                this.t = true;
            }
            if (!this.t) {
                h3 = gy.h(this.n, efVar);
                d(h3);
                return;
            }
            gy gyVar2 = this.x;
            handler2 = gyVar2.A;
            handler3 = gyVar2.A;
            Message obtain = Message.obtain(handler3, 9, this.n);
            j = this.x.l;
            handler2.sendMessageDelayed(obtain, j);
        }
    }

    public final void H(ef efVar) {
        Handler handler;
        handler = this.x.A;
        pj0.c(handler);
        m2.f fVar = this.m;
        String name = fVar.getClass().getName();
        String valueOf = String.valueOf(efVar);
        StringBuilder sb = new StringBuilder(name.length() + 25 + valueOf.length());
        sb.append("onSignInFailed for ");
        sb.append(name);
        sb.append(" with ");
        sb.append(valueOf);
        fVar.c(sb.toString());
        G(efVar, null);
    }

    public final void I() {
        Handler handler;
        handler = this.x.A;
        pj0.c(handler);
        if (this.t) {
            D();
        }
    }

    public final void J() {
        Handler handler;
        n90[] n90VarArr;
        handler = this.x.A;
        pj0.c(handler);
        d(gy.C);
        this.o.d();
        for (n90 n90Var : (n90[]) this.q.keySet().toArray(new n90[0])) {
            E(new id1(null, new ez0()));
        }
        c(new ef(4));
        if (this.m.a()) {
            this.m.l(new vb1(this));
        }
    }

    public final void K() {
        Handler handler;
        dy dyVar;
        Context context;
        handler = this.x.A;
        pj0.c(handler);
        if (this.t) {
            n();
            gy gyVar = this.x;
            dyVar = gyVar.s;
            context = gyVar.r;
            d(dyVar.g(context) == 18 ? new Status(21, "Connection timed out waiting for Google Play services update to complete.") : new Status(22, "API failed to connect while resuming due to an unknown error."));
            this.m.c("Timing out connection while resuming.");
        }
    }

    public final boolean L() {
        return this.m.o();
    }

    public final boolean a() {
        return q(true);
    }

    public final mr b(mr[] mrVarArr) {
        if (mrVarArr != null && mrVarArr.length != 0) {
            mr[] g = this.m.g();
            if (g == null) {
                g = new mr[0];
            }
            o4 o4Var = new o4(g.length);
            for (mr mrVar : g) {
                o4Var.put(mrVar.d(), Long.valueOf(mrVar.f()));
            }
            for (mr mrVar2 : mrVarArr) {
                Long l = (Long) o4Var.get(mrVar2.d());
                if (l == null || l.longValue() < mrVar2.f()) {
                    return mrVar2;
                }
            }
        }
        return null;
    }

    public final void c(ef efVar) {
        Iterator it = this.p.iterator();
        if (!it.hasNext()) {
            this.p.clear();
            return;
        }
        my0.a(it.next());
        if (zf0.a(efVar, ef.q)) {
            this.m.h();
        }
        throw null;
    }

    public final void d(Status status) {
        Handler handler;
        handler = this.x.A;
        pj0.c(handler);
        e(status, null, false);
    }

    public final void e(Status status, Exception exc, boolean z) {
        Handler handler;
        handler = this.x.A;
        pj0.c(handler);
        if ((status == null) == (exc == null)) {
            throw new IllegalArgumentException("Status XOR exception should be null");
        }
        Iterator it = this.l.iterator();
        while (it.hasNext()) {
            md1 md1Var = (md1) it.next();
            if (!z || md1Var.a == 2) {
                if (status != null) {
                    md1Var.a(status);
                } else {
                    md1Var.b(exc);
                }
                it.remove();
            }
        }
    }

    public final void f() {
        ArrayList arrayList = new ArrayList(this.l);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            md1 md1Var = (md1) arrayList.get(i);
            if (!this.m.a()) {
                return;
            }
            if (o(md1Var)) {
                this.l.remove(md1Var);
            }
        }
    }

    public final void g() {
        C();
        c(ef.q);
        n();
        Iterator it = this.q.values().iterator();
        if (it.hasNext()) {
            my0.a(it.next());
            throw null;
        }
        f();
        l();
    }

    @Override // androidx.appcompat.view.menu.df
    public final void h(int i) {
        Handler handler;
        Handler handler2;
        Looper myLooper = Looper.myLooper();
        handler = this.x.A;
        if (myLooper == handler.getLooper()) {
            i(i);
            return;
        }
        handler2 = this.x.A;
        handler2.post(new tb1(this, i));
    }

    public final void i(int i) {
        Handler handler;
        Handler handler2;
        long j;
        Handler handler3;
        Handler handler4;
        long j2;
        rd1 rd1Var;
        C();
        this.t = true;
        this.o.c(i, this.m.j());
        gy gyVar = this.x;
        handler = gyVar.A;
        handler2 = gyVar.A;
        Message obtain = Message.obtain(handler2, 9, this.n);
        j = this.x.l;
        handler.sendMessageDelayed(obtain, j);
        gy gyVar2 = this.x;
        handler3 = gyVar2.A;
        handler4 = gyVar2.A;
        Message obtain2 = Message.obtain(handler4, 11, this.n);
        j2 = this.x.m;
        handler3.sendMessageDelayed(obtain2, j2);
        rd1Var = this.x.t;
        rd1Var.c();
        Iterator it = this.q.values().iterator();
        if (it.hasNext()) {
            my0.a(it.next());
            throw null;
        }
    }

    @Override // androidx.appcompat.view.menu.kg0
    public final void j(ef efVar) {
        G(efVar, null);
    }

    @Override // androidx.appcompat.view.menu.df
    public final void k(Bundle bundle) {
        Handler handler;
        Handler handler2;
        Looper myLooper = Looper.myLooper();
        handler = this.x.A;
        if (myLooper == handler.getLooper()) {
            g();
            return;
        }
        handler2 = this.x.A;
        handler2.post(new sb1(this));
    }

    public final void l() {
        Handler handler;
        Handler handler2;
        Handler handler3;
        long j;
        handler = this.x.A;
        handler.removeMessages(12, this.n);
        gy gyVar = this.x;
        handler2 = gyVar.A;
        handler3 = gyVar.A;
        Message obtainMessage = handler3.obtainMessage(12, this.n);
        j = this.x.n;
        handler2.sendMessageDelayed(obtainMessage, j);
    }

    public final void m(md1 md1Var) {
        md1Var.d(this.o, L());
        try {
            md1Var.c(this);
        } catch (DeadObjectException unused) {
            h(1);
            this.m.c("DeadObjectException thrown while running ApiCallRunner.");
        }
    }

    public final void n() {
        Handler handler;
        Handler handler2;
        if (this.t) {
            handler = this.x.A;
            handler.removeMessages(11, this.n);
            handler2 = this.x.A;
            handler2.removeMessages(9, this.n);
            this.t = false;
        }
    }

    public final boolean o(md1 md1Var) {
        boolean z;
        Handler handler;
        Handler handler2;
        long j;
        Handler handler3;
        Handler handler4;
        long j2;
        Handler handler5;
        Handler handler6;
        Handler handler7;
        long j3;
        if (!(md1Var instanceof ec1)) {
            m(md1Var);
            return true;
        }
        ec1 ec1Var = (ec1) md1Var;
        mr b = b(ec1Var.g(this));
        if (b == null) {
            m(md1Var);
            return true;
        }
        String name = this.m.getClass().getName();
        String d = b.d();
        long f = b.f();
        StringBuilder sb = new StringBuilder(name.length() + 77 + String.valueOf(d).length());
        sb.append(name);
        sb.append(" could not execute call because it requires feature (");
        sb.append(d);
        sb.append(", ");
        sb.append(f);
        sb.append(").");
        z = this.x.B;
        if (!z || !ec1Var.f(this)) {
            ec1Var.b(new z31(b));
            return true;
        }
        yb1 yb1Var = new yb1(this.n, b, null);
        int indexOf = this.u.indexOf(yb1Var);
        if (indexOf >= 0) {
            yb1 yb1Var2 = (yb1) this.u.get(indexOf);
            handler5 = this.x.A;
            handler5.removeMessages(15, yb1Var2);
            gy gyVar = this.x;
            handler6 = gyVar.A;
            handler7 = gyVar.A;
            Message obtain = Message.obtain(handler7, 15, yb1Var2);
            j3 = this.x.l;
            handler6.sendMessageDelayed(obtain, j3);
            return false;
        }
        this.u.add(yb1Var);
        gy gyVar2 = this.x;
        handler = gyVar2.A;
        handler2 = gyVar2.A;
        Message obtain2 = Message.obtain(handler2, 15, yb1Var);
        j = this.x.l;
        handler.sendMessageDelayed(obtain2, j);
        gy gyVar3 = this.x;
        handler3 = gyVar3.A;
        handler4 = gyVar3.A;
        Message obtain3 = Message.obtain(handler4, 16, yb1Var);
        j2 = this.x.m;
        handler3.sendMessageDelayed(obtain3, j2);
        ef efVar = new ef(2, null);
        if (p(efVar)) {
            return false;
        }
        this.x.g(efVar, this.r);
        return false;
    }

    public final boolean p(ef efVar) {
        Object obj;
        kb1 kb1Var;
        Set set;
        kb1 kb1Var2;
        obj = gy.E;
        synchronized (obj) {
            try {
                gy gyVar = this.x;
                kb1Var = gyVar.x;
                if (kb1Var != null) {
                    set = gyVar.y;
                    if (set.contains(this.n)) {
                        kb1Var2 = this.x.x;
                        kb1Var2.s(efVar, this.r);
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean q(boolean z) {
        Handler handler;
        handler = this.x.A;
        pj0.c(handler);
        if (this.m.a() && this.q.size() == 0) {
            if (!this.o.e()) {
                this.m.c("Timing out service connection.");
                return true;
            }
            if (z) {
                l();
            }
            return false;
        }
        return false;
    }

    public final int r() {
        return this.r;
    }

    public final int s() {
        return this.w;
    }

    public final m2.f u() {
        return this.m;
    }

    public final Map w() {
        return this.q;
    }
}
