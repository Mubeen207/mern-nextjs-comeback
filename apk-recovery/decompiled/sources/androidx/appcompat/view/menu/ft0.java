package androidx.appcompat.view.menu;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public class ft0 {
    public Service a;
    public final Map b = new HashMap();
    public boolean c;
    public int d;

    /* loaded from: classes.dex */
    public class a implements IBinder.DeathRecipient {
        public final /* synthetic */ IBinder l;
        public final /* synthetic */ Intent.FilterComparison m;

        public a(IBinder iBinder, Intent.FilterComparison filterComparison) {
            this.l = iBinder;
            this.m = filterComparison;
        }

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            this.l.unlinkToDeath(this, 0);
            ft0.this.b.remove(this.m);
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public IBinder a;
        public final AtomicInteger b = new AtomicInteger(0);

        public int a() {
            return this.b.decrementAndGet();
        }

        public IBinder b() {
            return this.a;
        }

        public void c() {
            this.b.incrementAndGet();
        }

        public void d(IBinder iBinder) {
            this.a = iBinder;
        }
    }

    public void b(Intent intent, IBinder iBinder) {
        Intent.FilterComparison filterComparison = new Intent.FilterComparison(intent);
        b e = e(intent);
        if (e == null) {
            e = new b();
            this.b.put(filterComparison, e);
        }
        e.d(iBinder);
        try {
            iBinder.linkToDeath(new a(iBinder, filterComparison), 0);
        } catch (RemoteException e2) {
            e2.printStackTrace();
        }
    }

    public boolean c(Intent intent) {
        b bVar = (b) this.b.get(new Intent.FilterComparison(intent));
        return bVar == null || bVar.a() <= 0;
    }

    public IBinder d(Intent intent) {
        return e(intent).b();
    }

    public b e(Intent intent) {
        Intent.FilterComparison filterComparison = new Intent.FilterComparison(intent);
        b bVar = (b) this.b.get(filterComparison);
        if (bVar == null) {
            b bVar2 = new b();
            this.b.put(filterComparison, bVar2);
            return bVar2;
        }
        return bVar;
    }

    public Service f() {
        return this.a;
    }

    public int g() {
        return this.d;
    }

    public boolean h(Intent intent) {
        return e(intent).b() != null;
    }

    public void i(Intent intent) {
        e(intent).c();
    }

    public boolean j() {
        return this.c;
    }

    public void k(boolean z) {
        this.c = z;
    }

    public void l(Service service) {
        this.a = service;
    }

    public void m(int i) {
        this.d = i;
    }
}
