package androidx.appcompat.view.menu;

import android.content.BroadcastReceiver;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.appcompat.view.menu.u6;
import com.snake.helper.ProxyBroadcastReceiver;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public class s8 implements eh0 {
    public static volatile s8 p;
    public final x6 l;
    public final Map m = new HashMap();
    public final Map n = new HashMap();
    public final Handler o = new a(Looper.getMainLooper());

    /* loaded from: classes.dex */
    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == 1) {
                try {
                    ((zh0) message.obj).a().finish();
                } catch (Throwable unused) {
                }
            }
        }
    }

    public s8(x6 x6Var) {
        this.l = x6Var;
    }

    public static s8 e(x6 x6Var) {
        if (p == null) {
            synchronized (s8.class) {
                try {
                    if (p == null) {
                        p = new s8(x6Var);
                    }
                } finally {
                }
            }
        }
        return p;
    }

    public final void a(String str, BroadcastReceiver broadcastReceiver) {
        List list = (List) this.m.get(str);
        if (list == null) {
            list = new ArrayList();
            this.m.put(str, list);
        }
        list.add(broadcastReceiver);
    }

    public void b(zh0 zh0Var) {
        synchronized (this.n) {
            this.o.removeMessages(1, this.n.get(zh0Var.x));
        }
    }

    public final void c(u6 u6Var) {
        synchronized (this.m) {
            try {
                Iterator it = u6Var.n.iterator();
                while (it.hasNext()) {
                    for (u6.c cVar : ((u6.b) it.next()).b) {
                        ProxyBroadcastReceiver proxyBroadcastReceiver = new ProxyBroadcastReceiver();
                        bv0.m().registerReceiver(proxyBroadcastReceiver, cVar.m, 4);
                        a(u6Var.y, proxyBroadcastReceiver);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void d(zh0 zh0Var) {
        synchronized (this.n) {
            this.n.put(zh0Var.x, zh0Var);
            this.o.sendMessageDelayed(Message.obtain(this.o, 1, zh0Var), 9000L);
        }
    }

    public void f() {
        this.l.k(this);
        for (y6 y6Var : this.l.A2()) {
            c(y6Var.m);
        }
    }

    @Override // androidx.appcompat.view.menu.eh0
    public void h(String str, boolean z, int i) {
        if (z) {
            synchronized (this.m) {
                List<BroadcastReceiver> list = (List) this.m.get(str);
                if (list != null) {
                    for (BroadcastReceiver broadcastReceiver : list) {
                        try {
                            bv0.m().unregisterReceiver(broadcastReceiver);
                        } catch (Throwable unused) {
                        }
                    }
                }
                this.m.remove(str);
            }
        }
    }

    @Override // androidx.appcompat.view.menu.eh0
    public void k(String str, int i) {
        synchronized (this.m) {
            try {
                this.m.remove(str);
                y6 z2 = this.l.z2(str);
                if (z2 != null) {
                    c(z2.m);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
