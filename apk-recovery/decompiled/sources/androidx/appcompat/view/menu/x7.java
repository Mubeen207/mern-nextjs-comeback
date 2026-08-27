package androidx.appcompat.view.menu;

import android.util.Base64;
/* loaded from: classes.dex */
public abstract class x7 {
    public static String a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 11);
    }
}
