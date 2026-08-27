package androidx.appcompat.view.menu;

import android.app.PendingIntent;
import android.os.Looper;
import android.os.Message;
import androidx.appcompat.view.menu.z7;
/* loaded from: classes.dex */
public final class zh1 extends wy1 {
    public final /* synthetic */ z7 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zh1(z7 z7Var, Looper looper) {
        super(looper);
        this.a = z7Var;
    }

    public static final void a(Message message) {
        nk1 nk1Var = (nk1) message.obj;
        nk1Var.b();
        nk1Var.e();
    }

    public static final boolean b(Message message) {
        int i = message.what;
        return i == 2 || i == 1 || i == 7;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        z7.a aVar;
        z7.a aVar2;
        ef efVar;
        ef efVar2;
        boolean z;
        if (this.a.N.get() != message.arg1) {
            if (b(message)) {
                a(message);
                return;
            }
            return;
        }
        int i = message.what;
        if ((i == 1 || i == 7 || ((i == 4 && !this.a.t()) || message.what == 5)) && !this.a.f()) {
            a(message);
            return;
        }
        int i2 = message.what;
        if (i2 == 4) {
            this.a.K = new ef(message.arg2);
            if (z7.h0(this.a)) {
                z7 z7Var = this.a;
                z = z7Var.L;
                if (!z) {
                    z7Var.i0(3, null);
                    return;
                }
            }
            z7 z7Var2 = this.a;
            efVar2 = z7Var2.K;
            ef efVar3 = efVar2 != null ? z7Var2.K : new ef(8);
            this.a.A.a(efVar3);
            this.a.L(efVar3);
        } else if (i2 == 5) {
            z7 z7Var3 = this.a;
            efVar = z7Var3.K;
            ef efVar4 = efVar != null ? z7Var3.K : new ef(8);
            this.a.A.a(efVar4);
            this.a.L(efVar4);
        } else if (i2 == 3) {
            Object obj = message.obj;
            ef efVar5 = new ef(message.arg2, obj instanceof PendingIntent ? (PendingIntent) obj : null);
            this.a.A.a(efVar5);
            this.a.L(efVar5);
        } else if (i2 == 6) {
            this.a.i0(5, null);
            z7 z7Var4 = this.a;
            aVar = z7Var4.F;
            if (aVar != null) {
                aVar2 = z7Var4.F;
                aVar2.h(message.arg2);
            }
            this.a.M(message.arg2);
            z7.g0(this.a, 5, 1, null);
        } else if (i2 == 2 && !this.a.a()) {
            a(message);
        } else if (b(message)) {
            ((nk1) message.obj).c();
        } else {
            int i3 = message.what;
            StringBuilder sb = new StringBuilder();
            sb.append("Don't know how to handle message: ");
            sb.append(i3);
            new Exception();
        }
    }
}
