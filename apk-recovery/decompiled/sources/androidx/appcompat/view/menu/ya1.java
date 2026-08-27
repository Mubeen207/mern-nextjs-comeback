package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public final class ya1 extends g71 {
    public final fv n;
    public final int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ya1(fv fvVar, fv fvVar2, int i) {
        super(fvVar, "Attempting to nest fragment " + fvVar + " within the view of parent fragment " + fvVar2 + " via container with ID " + i + " without using parent's childFragmentManager");
        c60.e(fvVar, "fragment");
        c60.e(fvVar2, "expectedParentFragment");
        this.n = fvVar2;
        this.o = i;
    }
}
