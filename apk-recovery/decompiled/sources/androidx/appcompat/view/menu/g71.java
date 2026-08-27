package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public abstract class g71 extends RuntimeException {
    public final fv m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g71(fv fvVar, String str) {
        super(str);
        c60.e(fvVar, "fragment");
        this.m = fvVar;
    }

    public final fv a() {
        return this.m;
    }
}
