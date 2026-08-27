package androidx.appcompat.view.menu;

import android.os.Bundle;
import android.util.Log;
/* loaded from: classes.dex */
public abstract class qe2 {
    public final int a;
    public final ez0 b = new ez0();
    public final int c;
    public final Bundle d;

    public qe2(int i, int i2, Bundle bundle) {
        this.a = i;
        this.c = i2;
        this.d = bundle;
    }

    public abstract void a(Bundle bundle);

    public abstract boolean b();

    public final void c(ve2 ve2Var) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String obj = toString();
            String obj2 = ve2Var.toString();
            StringBuilder sb = new StringBuilder();
            sb.append("Failing ");
            sb.append(obj);
            sb.append(" with ");
            sb.append(obj2);
        }
        this.b.b(ve2Var);
    }

    public final void d(Object obj) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String obj2 = toString();
            String valueOf = String.valueOf(obj);
            StringBuilder sb = new StringBuilder();
            sb.append("Finishing ");
            sb.append(obj2);
            sb.append(" with ");
            sb.append(valueOf);
        }
        this.b.c(obj);
    }

    public final String toString() {
        return "Request { what=" + this.c + " id=" + this.a + " oneWay=" + b() + "}";
    }
}
