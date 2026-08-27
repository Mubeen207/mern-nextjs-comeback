package androidx.appcompat.view.menu;

import android.view.ViewGroup;
/* loaded from: classes.dex */
public final class xa1 extends g71 {
    public final ViewGroup n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xa1(fv fvVar, ViewGroup viewGroup) {
        super(fvVar, "Attempting to add fragment " + fvVar + " to container " + viewGroup + " which is not a FragmentContainerView");
        c60.e(fvVar, "fragment");
        c60.e(viewGroup, "container");
        this.n = viewGroup;
    }
}
