package androidx.appcompat.view.menu;

import java.util.concurrent.atomic.AtomicReferenceArray;
/* loaded from: classes.dex */
public abstract /* synthetic */ class cb {
    public static /* synthetic */ boolean a(AtomicReferenceArray atomicReferenceArray, int i, Object obj, Object obj2) {
        while (!atomicReferenceArray.compareAndSet(i, obj, obj2)) {
            if (atomicReferenceArray.get(i) != obj) {
                return false;
            }
        }
        return true;
    }
}
