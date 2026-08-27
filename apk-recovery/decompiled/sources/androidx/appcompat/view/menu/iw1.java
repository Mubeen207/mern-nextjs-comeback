package androidx.appcompat.view.menu;

import androidx.appcompat.view.menu.rr1;
/* loaded from: classes.dex */
public abstract /* synthetic */ class iw1 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[rr1.e.values().length];
        b = iArr;
        try {
            iArr[rr1.e.AD_STORAGE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            b[rr1.e.ANALYTICS_STORAGE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            b[rr1.e.AD_USER_DATA.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            b[rr1.e.AD_PERSONALIZATION.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        int[] iArr2 = new int[te2.values().length];
        a = iArr2;
        try {
            iArr2[te2.DEBUG.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            a[te2.ERROR.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            a[te2.WARN.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            a[te2.VERBOSE.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
    }
}
