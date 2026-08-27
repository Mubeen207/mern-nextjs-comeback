package androidx.appcompat.view.menu;

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
/* loaded from: classes.dex */
public abstract class m60 {

    /* loaded from: classes.dex */
    public class a extends w31 {
        public boolean m;
        public final /* synthetic */ Object n;

        public a(Object obj) {
            this.n = obj;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return !this.m;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (this.m) {
                throw new NoSuchElementException();
            }
            this.m = true;
            return this.n;
        }
    }

    public static boolean a(Collection collection, Iterator it) {
        qj0.i(collection);
        qj0.i(it);
        boolean z = false;
        while (it.hasNext()) {
            z |= collection.add(it.next());
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0006  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean b(java.util.Iterator r3, java.util.Iterator r4) {
        /*
        L0:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L1d
            boolean r0 = r4.hasNext()
            r1 = 0
            if (r0 != 0) goto Le
            return r1
        Le:
            java.lang.Object r0 = r3.next()
            java.lang.Object r2 = r4.next()
            boolean r0 = androidx.appcompat.view.menu.ag0.a(r0, r2)
            if (r0 != 0) goto L0
            return r1
        L1d:
            boolean r3 = r4.hasNext()
            r3 = r3 ^ 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.m60.b(java.util.Iterator, java.util.Iterator):boolean");
    }

    public static w31 c(Object obj) {
        return new a(obj);
    }
}
