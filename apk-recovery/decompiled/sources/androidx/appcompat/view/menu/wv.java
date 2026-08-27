package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public final class wv extends g71 {
    public final String n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wv(fv fvVar, String str) {
        super(fvVar, "Attempting to reuse fragment " + fvVar + " with previous ID " + str);
        c60.e(fvVar, "fragment");
        c60.e(str, "previousFragmentId");
        this.n = str;
    }
}
