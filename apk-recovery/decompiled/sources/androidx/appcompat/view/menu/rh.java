package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public abstract class rh {
    public static final void a(kh khVar, Throwable th) {
        try {
            oh ohVar = (oh) khVar.d(oh.c);
            if (ohVar != null) {
                ohVar.r(khVar, th);
            } else {
                qh.a(khVar, th);
            }
        } catch (Throwable th2) {
            qh.a(khVar, b(th, th2));
        }
    }

    public static final Throwable b(Throwable th, Throwable th2) {
        if (th == th2) {
            return th;
        }
        RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
        pp.a(runtimeException, th);
        return runtimeException;
    }
}
