package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public final class gn extends IllegalStateException {
    public gn(String str, Throwable th) {
        super(str, th);
    }

    public static IllegalStateException a(cz0 cz0Var) {
        if (cz0Var.l()) {
            Exception h = cz0Var.h();
            return new gn("Complete with: ".concat(h != null ? "failure" : cz0Var.m() ? "result ".concat(String.valueOf(cz0Var.i())) : cz0Var.k() ? "cancellation" : "unknown issue"), h);
        }
        return new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
    }
}
