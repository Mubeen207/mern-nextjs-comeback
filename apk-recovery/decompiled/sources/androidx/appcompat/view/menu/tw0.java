package androidx.appcompat.view.menu;

import androidx.appcompat.view.menu.sw0;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
/* loaded from: classes.dex */
public final class tw0 implements od0 {
    public static final tw0 b = new tw0(sw0.a);
    public final sw0 a;

    public tw0(sw0 sw0Var) {
        this.a = sw0Var;
    }

    @Override // androidx.appcompat.view.menu.od0
    public ByteBuffer a(Object obj) {
        sw0.a aVar = new sw0.a();
        aVar.write(0);
        this.a.p(aVar, obj);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(aVar.size());
        allocateDirect.put(aVar.a(), 0, aVar.size());
        return allocateDirect;
    }

    @Override // androidx.appcompat.view.menu.od0
    public ByteBuffer b(String str, String str2, Object obj, String str3) {
        sw0.a aVar = new sw0.a();
        aVar.write(1);
        this.a.p(aVar, str);
        this.a.p(aVar, str2);
        if (obj instanceof Throwable) {
            this.a.p(aVar, ha0.d((Throwable) obj));
        } else {
            this.a.p(aVar, obj);
        }
        this.a.p(aVar, str3);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(aVar.size());
        allocateDirect.put(aVar.a(), 0, aVar.size());
        return allocateDirect;
    }

    @Override // androidx.appcompat.view.menu.od0
    public ByteBuffer c(String str, String str2, Object obj) {
        sw0.a aVar = new sw0.a();
        aVar.write(1);
        this.a.p(aVar, str);
        this.a.p(aVar, str2);
        if (obj instanceof Throwable) {
            this.a.p(aVar, ha0.d((Throwable) obj));
        } else {
            this.a.p(aVar, obj);
        }
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(aVar.size());
        allocateDirect.put(aVar.a(), 0, aVar.size());
        return allocateDirect;
    }

    @Override // androidx.appcompat.view.menu.od0
    public ld0 d(ByteBuffer byteBuffer) {
        byteBuffer.order(ByteOrder.nativeOrder());
        Object f = this.a.f(byteBuffer);
        Object f2 = this.a.f(byteBuffer);
        if (!(f instanceof String) || byteBuffer.hasRemaining()) {
            throw new IllegalArgumentException("Method call corrupted");
        }
        return new ld0((String) f, f2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x000e, code lost:
        if (r0 == 1) goto L8;
     */
    @Override // androidx.appcompat.view.menu.od0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object e(java.nio.ByteBuffer r5) {
        /*
            r4 = this;
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()
            r5.order(r0)
            byte r0 = r5.get()
            if (r0 == 0) goto L11
            r1 = 1
            if (r0 != r1) goto L4a
            goto L1e
        L11:
            androidx.appcompat.view.menu.sw0 r0 = r4.a
            java.lang.Object r0 = r0.f(r5)
            boolean r1 = r5.hasRemaining()
            if (r1 != 0) goto L1e
            return r0
        L1e:
            androidx.appcompat.view.menu.sw0 r0 = r4.a
            java.lang.Object r0 = r0.f(r5)
            androidx.appcompat.view.menu.sw0 r1 = r4.a
            java.lang.Object r1 = r1.f(r5)
            androidx.appcompat.view.menu.sw0 r2 = r4.a
            java.lang.Object r2 = r2.f(r5)
            boolean r3 = r0 instanceof java.lang.String
            if (r3 == 0) goto L4a
            if (r1 == 0) goto L3a
            boolean r3 = r1 instanceof java.lang.String
            if (r3 == 0) goto L4a
        L3a:
            boolean r5 = r5.hasRemaining()
            if (r5 != 0) goto L4a
            androidx.appcompat.view.menu.qt r5 = new androidx.appcompat.view.menu.qt
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = (java.lang.String) r1
            r5.<init>(r0, r1, r2)
            throw r5
        L4a:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Envelope corrupted"
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.tw0.e(java.nio.ByteBuffer):java.lang.Object");
    }

    @Override // androidx.appcompat.view.menu.od0
    public ByteBuffer f(ld0 ld0Var) {
        sw0.a aVar = new sw0.a();
        this.a.p(aVar, ld0Var.a);
        this.a.p(aVar, ld0Var.b);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(aVar.size());
        allocateDirect.put(aVar.a(), 0, aVar.size());
        return allocateDirect;
    }
}
