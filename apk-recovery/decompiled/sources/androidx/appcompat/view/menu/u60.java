package androidx.appcompat.view.menu;

import java.util.concurrent.CancellationException;
/* loaded from: classes.dex */
public final class u60 extends CancellationException {
    public final transient t60 m;

    public u60(String str, Throwable th, t60 t60Var) {
        super(str);
        this.m = t60Var;
        if (th != null) {
            initCause(th);
        }
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof u60) {
                u60 u60Var = (u60) obj;
                if (!c60.a(u60Var.getMessage(), getMessage()) || !c60.a(u60Var.m, this.m) || !c60.a(u60Var.getCause(), getCause())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public int hashCode() {
        String message = getMessage();
        c60.b(message);
        int hashCode = ((message.hashCode() * 31) + this.m.hashCode()) * 31;
        Throwable cause = getCause();
        return hashCode + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public String toString() {
        return super.toString() + "; job=" + this.m;
    }
}
