package androidx.appcompat.view.menu;

import java.util.NoSuchElementException;
/* loaded from: classes.dex */
public abstract class cy0 extends by0 {
    public static char H(CharSequence charSequence) {
        c60.e(charSequence, "<this>");
        if (charSequence.length() != 0) {
            return charSequence.charAt(ay0.k(charSequence));
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }
}
