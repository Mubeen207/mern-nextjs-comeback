package androidx.appcompat.view.menu;

import java.util.Arrays;
/* loaded from: classes.dex */
public final class a32 extends z02 {
    public final byte[] m;

    public a32(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.m = bArr;
    }

    @Override // androidx.appcompat.view.menu.z02
    public final byte[] u2() {
        return this.m;
    }
}
