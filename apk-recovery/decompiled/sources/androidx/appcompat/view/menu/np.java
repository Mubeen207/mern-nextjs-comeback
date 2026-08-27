package androidx.appcompat.view.menu;

import java.util.concurrent.CancellationException;
/* loaded from: classes.dex */
public abstract class np {
    public static final CancellationException a(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }
}
