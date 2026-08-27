package androidx.appcompat.view.menu;

import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
public abstract class d52 extends z02 {
    public static final WeakReference n = new WeakReference(null);
    public WeakReference m;

    public d52(byte[] bArr) {
        super(bArr);
        this.m = n;
    }

    @Override // androidx.appcompat.view.menu.z02
    public final byte[] u2() {
        byte[] bArr;
        synchronized (this) {
            try {
                bArr = (byte[]) this.m.get();
                if (bArr == null) {
                    bArr = v2();
                    this.m = new WeakReference(bArr);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return bArr;
    }

    public abstract byte[] v2();
}
