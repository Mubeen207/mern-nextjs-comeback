package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public abstract class qh {
    public static final void a(kh khVar, Throwable th) {
        for (oh ohVar : ph.a()) {
            try {
                ohVar.r(khVar, th);
            } catch (Throwable th2) {
                ph.b(rh.b(th, th2));
            }
        }
        try {
            pp.a(th, new tl(khVar));
        } catch (Throwable unused) {
        }
        ph.b(th);
    }
}
