package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public abstract class gx1 implements f42 {
    public abstract /* synthetic */ Object clone();

    public abstract gx1 e(byte[] bArr, int i, int i2);

    public abstract gx1 f(byte[] bArr, int i, int i2, tz1 tz1Var);

    @Override // androidx.appcompat.view.menu.f42
    public final /* synthetic */ f42 l(byte[] bArr) {
        return e(bArr, 0, bArr.length);
    }

    @Override // androidx.appcompat.view.menu.f42
    public final /* synthetic */ f42 m(byte[] bArr, tz1 tz1Var) {
        return f(bArr, 0, bArr.length, tz1Var);
    }
}
