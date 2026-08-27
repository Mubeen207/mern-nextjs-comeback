package androidx.appcompat.view.menu;

import android.os.IBinder;
import android.os.IInterface;
/* loaded from: classes.dex */
public abstract class nv0 {
    public IInterface a;
    public String b = "";
    public final Class c;

    /* loaded from: classes.dex */
    public class a implements IBinder.DeathRecipient {
        public a() {
        }

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            nv0.this.a.asBinder().unlinkToDeath(this, 0);
            nv0.this.a = null;
        }
    }

    public nv0(Class cls) {
        this.c = cls;
    }

    public IInterface c() {
        IInterface iInterface = this.a;
        if (iInterface != null && iInterface.asBinder().pingBinder() && this.a.asBinder().isBinderAlive()) {
            return this.a;
        }
        try {
            IInterface iInterface2 = (IInterface) jo0.x(e().getName() + "$Stub").z("asInterface", IBinder.class).c(bv0.h().t(d()));
            this.a = iInterface2;
            iInterface2.asBinder().linkToDeath(new a(), 0);
            if (this.b.isEmpty()) {
                this.b = this.a.toString();
            }
            return c();
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public abstract String d();

    public final Class e() {
        getClass().getGenericSuperclass();
        return this.c;
    }
}
