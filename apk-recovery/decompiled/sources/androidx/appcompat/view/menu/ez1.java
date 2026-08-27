package androidx.appcompat.view.menu;

import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.concurrent.Callable;
/* loaded from: classes.dex */
public final class ez1 implements Callable {
    public final /* synthetic */ fb2 a;
    public final /* synthetic */ Bundle b;
    public final /* synthetic */ nx1 c;

    public ez1(nx1 nx1Var, fb2 fb2Var, Bundle bundle) {
        this.c = nx1Var;
        this.a = fb2Var;
        this.b = bundle;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        r82 r82Var;
        r82 r82Var2;
        r82Var = this.c.l;
        r82Var.o0();
        r82Var2 = this.c.l;
        fb2 fb2Var = this.a;
        Bundle bundle = this.b;
        r82Var2.h().n();
        if (vc2.a() && r82Var2.c0().B(fb2Var.m, vi1.L0) && fb2Var.m != null) {
            if (bundle != null) {
                int[] intArray = bundle.getIntArray("uriSources");
                long[] longArray = bundle.getLongArray("uriTimestamps");
                if (intArray != null) {
                    if (longArray == null || longArray.length != intArray.length) {
                        r82Var2.l().G().a("Uri sources and timestamps do not match");
                    } else {
                        for (int i = 0; i < intArray.length; i++) {
                            og1 e0 = r82Var2.e0();
                            String str = fb2Var.m;
                            int i2 = intArray[i];
                            long j = longArray[i];
                            pj0.e(str);
                            e0.n();
                            e0.u();
                            try {
                                int delete = e0.B().delete("trigger_uris", "app_id=? and source=? and timestamp_millis<=?", new String[]{str, String.valueOf(i2), String.valueOf(j)});
                                e0.l().K().d("Pruned " + delete + " trigger URIs. appId, source, timestamp", str, Integer.valueOf(i2), Long.valueOf(j));
                            } catch (SQLiteException e) {
                                e0.l().G().c("Error pruning trigger URIs. appId", st1.v(str), e);
                            }
                        }
                    }
                }
            }
            return r82Var2.e0().K0(fb2Var.m);
        }
        return new ArrayList();
    }
}
