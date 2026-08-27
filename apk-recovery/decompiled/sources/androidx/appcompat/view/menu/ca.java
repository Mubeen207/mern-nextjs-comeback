package androidx.appcompat.view.menu;

import android.os.CancellationSignal;
/* loaded from: classes.dex */
public final class ca {
    public boolean a;
    public Object b;
    public boolean c;

    public void a() {
        synchronized (this) {
            try {
                if (this.a) {
                    return;
                }
                this.a = true;
                this.c = true;
                Object obj = this.b;
                if (obj != null) {
                    try {
                        ((CancellationSignal) obj).cancel();
                    } catch (Throwable th) {
                        synchronized (this) {
                            this.c = false;
                            notifyAll();
                            throw th;
                        }
                    }
                }
                synchronized (this) {
                    this.c = false;
                    notifyAll();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
