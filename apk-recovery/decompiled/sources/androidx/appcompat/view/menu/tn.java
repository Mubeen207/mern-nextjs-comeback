package androidx.appcompat.view.menu;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.text.Spanned;
import android.widget.TextView;
import androidx.emoji2.text.c;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
public final class tn implements InputFilter {
    public final TextView a;
    public c.f b;

    /* loaded from: classes.dex */
    public static class a extends c.f {
        public final Reference a;
        public final Reference b;

        public a(TextView textView, tn tnVar) {
            this.a = new WeakReference(textView);
            this.b = new WeakReference(tnVar);
        }

        @Override // androidx.emoji2.text.c.f
        public void b() {
            CharSequence text;
            CharSequence p;
            super.b();
            TextView textView = (TextView) this.a.get();
            if (c(textView, (InputFilter) this.b.get()) && textView.isAttachedToWindow() && text != (p = androidx.emoji2.text.c.c().p((text = textView.getText())))) {
                int selectionStart = Selection.getSelectionStart(p);
                int selectionEnd = Selection.getSelectionEnd(p);
                textView.setText(p);
                if (p instanceof Spannable) {
                    tn.b((Spannable) p, selectionStart, selectionEnd);
                }
            }
        }

        public final boolean c(TextView textView, InputFilter inputFilter) {
            InputFilter[] filters;
            if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
                return false;
            }
            for (InputFilter inputFilter2 : filters) {
                if (inputFilter2 == inputFilter) {
                    return true;
                }
            }
            return false;
        }
    }

    public tn(TextView textView) {
        this.a = textView;
    }

    public static void b(Spannable spannable, int i, int i2) {
        if (i >= 0 && i2 >= 0) {
            Selection.setSelection(spannable, i, i2);
        } else if (i >= 0) {
            Selection.setSelection(spannable, i);
        } else if (i2 >= 0) {
            Selection.setSelection(spannable, i2);
        }
    }

    public final c.f a() {
        if (this.b == null) {
            this.b = new a(this.a, this);
        }
        return this.b;
    }

    @Override // android.text.InputFilter
    public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        if (this.a.isInEditMode()) {
            return charSequence;
        }
        int e = androidx.emoji2.text.c.c().e();
        if (e != 0) {
            if (e == 1) {
                if ((i4 == 0 && i3 == 0 && spanned.length() == 0 && charSequence == this.a.getText()) || charSequence == null) {
                    return charSequence;
                }
                if (i != 0 || i2 != charSequence.length()) {
                    charSequence = charSequence.subSequence(i, i2);
                }
                return androidx.emoji2.text.c.c().q(charSequence, 0, charSequence.length());
            } else if (e != 3) {
                return charSequence;
            }
        }
        androidx.emoji2.text.c.c().t(a());
        return charSequence;
    }
}
