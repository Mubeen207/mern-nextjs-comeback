package androidx.appcompat.view.menu;

import androidx.appcompat.view.menu.nt1;
/* loaded from: classes.dex */
public abstract /* synthetic */ class xy1 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[nt1.b.values().length];
        a = iArr;
        try {
            iArr[nt1.b.STRING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[nt1.b.NUMBER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[nt1.b.BOOLEAN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            a[nt1.b.STATEMENT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            a[nt1.b.UNKNOWN.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
