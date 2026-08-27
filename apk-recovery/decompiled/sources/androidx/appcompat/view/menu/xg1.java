package androidx.appcompat.view.menu;

import java.util.Iterator;
/* loaded from: classes.dex */
public final class xg1 implements tg1, Iterable {
    public final String m;

    public xg1(String str) {
        if (str == null) {
            throw new IllegalArgumentException("StringValue cannot be null.");
        }
        this.m = str;
    }

    @Override // androidx.appcompat.view.menu.tg1
    public final tg1 c() {
        return new xg1(this.m);
    }

    @Override // androidx.appcompat.view.menu.tg1
    public final Boolean d() {
        return Boolean.valueOf(!this.m.isEmpty());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof xg1) {
            return this.m.equals(((xg1) obj).m);
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.tg1
    public final Double f() {
        if (this.m.isEmpty()) {
            return Double.valueOf(0.0d);
        }
        try {
            return Double.valueOf(this.m);
        } catch (NumberFormatException unused) {
            return Double.valueOf(Double.NaN);
        }
    }

    @Override // androidx.appcompat.view.menu.tg1
    public final String g() {
        return this.m;
    }

    public final int hashCode() {
        return this.m.hashCode();
    }

    @Override // androidx.appcompat.view.menu.tg1
    public final Iterator i() {
        return new dh1(this);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new bh1(this);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0498  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x04ac  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x04c2  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0525  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0539  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x058a  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x05a0  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x05d9  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x061f  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0633  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x063c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c3 A[PHI: r19 
      PHI: (r19v21 char) = (r19v0 char), (r19v0 char), (r19v6 char), (r19v0 char), (r19v7 char), (r19v0 char), (r19v8 char), (r19v0 char), (r19v9 char), (r19v0 char), (r19v10 char), (r19v0 char), (r19v11 char), (r19v0 char), (r19v12 char), (r19v0 char), (r19v13 char), (r19v0 char), (r19v14 char), (r19v0 char), (r19v15 char), (r19v0 char), (r19v16 char), (r19v0 char), (r19v17 char), (r19v0 char), (r19v18 char) binds: [B:42:0x00c0, B:94:0x014a, B:96:0x014e, B:90:0x013f, B:92:0x0142, B:86:0x0135, B:88:0x0138, B:82:0x012b, B:84:0x012e, B:78:0x0121, B:80:0x0124, B:74:0x0117, B:76:0x011a, B:70:0x010d, B:72:0x0110, B:66:0x0103, B:68:0x0106, B:62:0x00f9, B:64:0x00fc, B:58:0x00ef, B:60:0x00f2, B:54:0x00e5, B:56:0x00e8, B:50:0x00db, B:52:0x00de, B:46:0x00d1, B:48:0x00d4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0152  */
    @Override // androidx.appcompat.view.menu.tg1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.appcompat.view.menu.tg1 p(java.lang.String r22, androidx.appcompat.view.menu.sw1 r23, java.util.List r24) {
        /*
            Method dump skipped, instructions count: 1774
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.xg1.p(java.lang.String, androidx.appcompat.view.menu.sw1, java.util.List):androidx.appcompat.view.menu.tg1");
    }

    public final String toString() {
        String str = this.m;
        return "\"" + str + "\"";
    }
}
