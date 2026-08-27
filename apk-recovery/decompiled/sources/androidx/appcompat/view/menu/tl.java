package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public final class tl extends RuntimeException {
    public final transient kh m;

    public tl(kh khVar) {
        this.m = khVar;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public String getLocalizedMessage() {
        return this.m.toString();
    }
}
