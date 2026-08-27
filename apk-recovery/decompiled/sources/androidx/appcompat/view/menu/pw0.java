package androidx.appcompat.view.menu;

import androidx.appcompat.view.menu.qp0;
/* loaded from: classes.dex */
public abstract class pw0 {
    public static final StackTraceElement a = new z4().a();
    public static final String b;
    public static final String c;

    static {
        Object a2;
        Object a3;
        try {
            qp0.a aVar = qp0.m;
            a2 = qp0.a(y7.class.getCanonicalName());
        } catch (Throwable th) {
            qp0.a aVar2 = qp0.m;
            a2 = qp0.a(rp0.a(th));
        }
        if (qp0.b(a2) != null) {
            a2 = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        b = (String) a2;
        try {
            a3 = qp0.a(pw0.class.getCanonicalName());
        } catch (Throwable th2) {
            qp0.a aVar3 = qp0.m;
            a3 = qp0.a(rp0.a(th2));
        }
        if (qp0.b(a3) != null) {
            a3 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
        c = (String) a3;
    }

    public static final Throwable a(Throwable th) {
        return th;
    }
}
