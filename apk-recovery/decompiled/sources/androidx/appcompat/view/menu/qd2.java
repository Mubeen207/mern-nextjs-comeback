package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import java.util.HashMap;
/* loaded from: classes.dex */
public final class qd2 implements Handler.Callback {
    public final /* synthetic */ le2 l;

    public /* synthetic */ qd2(le2 le2Var, jc2 jc2Var) {
        this.l = le2Var;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        HashMap hashMap;
        HashMap hashMap2;
        HashMap hashMap3;
        HashMap hashMap4;
        HashMap hashMap5;
        int i = message.what;
        if (i == 0) {
            hashMap = this.l.f;
            synchronized (hashMap) {
                try {
                    o92 o92Var = (o92) message.obj;
                    hashMap2 = this.l.f;
                    db2 db2Var = (db2) hashMap2.get(o92Var);
                    if (db2Var != null && db2Var.i()) {
                        if (db2Var.j()) {
                            db2Var.g("GmsClientSupervisor");
                        }
                        hashMap3 = this.l.f;
                        hashMap3.remove(o92Var);
                    }
                } finally {
                }
            }
            return true;
        } else if (i != 1) {
            return false;
        } else {
            hashMap4 = this.l.f;
            synchronized (hashMap4) {
                try {
                    o92 o92Var2 = (o92) message.obj;
                    hashMap5 = this.l.f;
                    db2 db2Var2 = (db2) hashMap5.get(o92Var2);
                    if (db2Var2 != null && db2Var2.a() == 3) {
                        String valueOf = String.valueOf(o92Var2);
                        StringBuilder sb = new StringBuilder();
                        sb.append("Timeout waiting for ServiceConnection callback ");
                        sb.append(valueOf);
                        new Exception();
                        ComponentName b = db2Var2.b();
                        if (b == null) {
                            b = o92Var2.b();
                        }
                        if (b == null) {
                            String d = o92Var2.d();
                            pj0.i(d);
                            b = new ComponentName(d, "unknown");
                        }
                        db2Var2.onServiceDisconnected(b);
                    }
                } finally {
                }
            }
            return true;
        }
    }
}
