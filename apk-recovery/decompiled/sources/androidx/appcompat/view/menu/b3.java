package androidx.appcompat.view.menu;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.TextView;
/* loaded from: classes.dex */
public class b3 {
    public final TextView a;
    public final wn b;

    public b3(TextView textView) {
        this.a = textView;
        this.b = new wn(textView, false);
    }

    public InputFilter[] a(InputFilter[] inputFilterArr) {
        return this.b.a(inputFilterArr);
    }

    public void b(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = this.a.getContext().obtainStyledAttributes(attributeSet, pn0.S, i, 0);
        try {
            boolean z = obtainStyledAttributes.hasValue(pn0.g0) ? obtainStyledAttributes.getBoolean(pn0.g0, true) : true;
            obtainStyledAttributes.recycle();
            d(z);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public void c(boolean z) {
        this.b.b(z);
    }

    public void d(boolean z) {
        this.b.c(z);
    }
}
