package androidx.appcompat.view.menu;

import android.os.Bundle;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes.dex */
public final class em1 extends qm1 {
    public final AtomicReference l = new AtomicReference();
    public boolean m;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0003, code lost:
        r3 = r3.get("r");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object k(android.os.Bundle r3, java.lang.Class r4) {
        /*
            r0 = 0
            if (r3 == 0) goto L38
            java.lang.String r1 = "r"
            java.lang.Object r3 = r3.get(r1)
            if (r3 == 0) goto L38
            java.lang.Object r3 = r4.cast(r3)     // Catch: java.lang.ClassCastException -> L10
            return r3
        L10:
            r0 = move-exception
            java.lang.String r4 = r4.getCanonicalName()
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.getCanonicalName()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unexpected object type. Expected, Received"
            r1.append(r2)
            java.lang.String r2 = ": %s, %s"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.Object[] r3 = new java.lang.Object[]{r4, r3}
            java.lang.String.format(r1, r3)
            throw r0
        L38:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.em1.k(android.os.Bundle, java.lang.Class):java.lang.Object");
    }

    @Override // androidx.appcompat.view.menu.km1
    public final void f(Bundle bundle) {
        synchronized (this.l) {
            try {
                this.l.set(bundle);
                this.m = true;
                this.l.notify();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Bundle j(long j) {
        Bundle bundle;
        synchronized (this.l) {
            if (!this.m) {
                try {
                    this.l.wait(j);
                } catch (InterruptedException unused) {
                    return null;
                }
            }
            bundle = (Bundle) this.l.get();
        }
        return bundle;
    }

    public final Long u2(long j) {
        return (Long) k(j(j), Long.class);
    }

    public final String v2(long j) {
        return (String) k(j(j), String.class);
    }
}
