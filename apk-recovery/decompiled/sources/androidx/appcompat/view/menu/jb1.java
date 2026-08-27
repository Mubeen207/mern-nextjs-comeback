package androidx.appcompat.view.menu;

import com.google.android.gms.common.api.Status;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public final class jb1 {
    public final Map a = Collections.synchronizedMap(new WeakHashMap());
    public final Map b = Collections.synchronizedMap(new WeakHashMap());

    public final void b(ez0 ez0Var, boolean z) {
        this.b.put(ez0Var, Boolean.valueOf(z));
        ez0Var.a().b(new hb1(this, ez0Var));
    }

    public final void c(int i, String str) {
        StringBuilder sb = new StringBuilder("The connection to Google Play services was lost");
        if (i == 1) {
            sb.append(" due to service disconnection.");
        } else if (i == 3) {
            sb.append(" due to dead object exception.");
        }
        if (str != null) {
            sb.append(" Last reason for disconnect: ");
            sb.append(str);
        }
        f(true, new Status(20, sb.toString()));
    }

    public final void d() {
        f(false, gy.C);
    }

    public final boolean e() {
        return (this.a.isEmpty() && this.b.isEmpty()) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(boolean r5, com.google.android.gms.common.api.Status r6) {
        /*
            r4 = this;
            java.util.Map r0 = r4.a
            monitor-enter(r0)
            java.util.HashMap r1 = new java.util.HashMap     // Catch: java.lang.Throwable -> L77
            java.util.Map r2 = r4.a     // Catch: java.lang.Throwable -> L77
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L77
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L77
            java.util.Map r2 = r4.b
            monitor-enter(r2)
            java.util.HashMap r0 = new java.util.HashMap     // Catch: java.lang.Throwable -> L74
            java.util.Map r3 = r4.b     // Catch: java.lang.Throwable -> L74
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L74
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L74
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L1e:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L42
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            if (r5 != 0) goto L39
            java.lang.Object r3 = r2.getValue()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 != 0) goto L39
            goto L1e
        L39:
            java.lang.Object r5 = r2.getKey()
            androidx.appcompat.view.menu.my0.a(r5)
            r5 = 0
            throw r5
        L42:
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L4a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L73
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            if (r5 != 0) goto L64
            java.lang.Object r2 = r1.getValue()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L4a
        L64:
            java.lang.Object r1 = r1.getKey()
            androidx.appcompat.view.menu.ez0 r1 = (androidx.appcompat.view.menu.ez0) r1
            androidx.appcompat.view.menu.o2 r2 = new androidx.appcompat.view.menu.o2
            r2.<init>(r6)
            r1.d(r2)
            goto L4a
        L73:
            return
        L74:
            r5 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L74
            throw r5
        L77:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L77
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.jb1.f(boolean, com.google.android.gms.common.api.Status):void");
    }
}
