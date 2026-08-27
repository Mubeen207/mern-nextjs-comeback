package androidx.appcompat.view.menu;

import java.util.concurrent.atomic.AtomicReferenceArray;
/* loaded from: classes.dex */
public final class dp0 {
    private volatile AtomicReferenceArray<Object> array;

    public dp0(int i) {
        this.array = new AtomicReferenceArray<>(i);
    }

    public final int a() {
        return this.array.length();
    }

    public final Object b(int i) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.array;
        if (i < atomicReferenceArray.length()) {
            return atomicReferenceArray.get(i);
        }
        return null;
    }

    public final void c(int i, Object obj) {
        int a;
        AtomicReferenceArray<Object> atomicReferenceArray = this.array;
        int length = atomicReferenceArray.length();
        if (i < length) {
            atomicReferenceArray.set(i, obj);
            return;
        }
        a = xn0.a(i + 1, length * 2);
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(a);
        for (int i2 = 0; i2 < length; i2++) {
            atomicReferenceArray2.set(i2, atomicReferenceArray.get(i2));
        }
        atomicReferenceArray2.set(i, obj);
        this.array = atomicReferenceArray2;
    }
}
