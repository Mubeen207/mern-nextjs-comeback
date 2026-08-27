package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public abstract /* synthetic */ class yi1 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[wj1.values().length];
        a = iArr;
        try {
            iArr[wj1.AND.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[wj1.NOT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[wj1.OR.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
