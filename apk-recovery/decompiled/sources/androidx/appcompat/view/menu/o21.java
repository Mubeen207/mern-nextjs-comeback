package androidx.appcompat.view.menu;

import android.content.Context;
import java.io.Closeable;
/* loaded from: classes.dex */
public abstract class o21 implements Closeable {

    /* loaded from: classes.dex */
    public interface a {
        o21 a();

        a b(Context context);
    }

    public abstract gp a();

    public abstract n21 c();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        a().close();
    }
}
