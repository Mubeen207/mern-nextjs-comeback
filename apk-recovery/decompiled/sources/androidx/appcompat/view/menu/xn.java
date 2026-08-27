package androidx.appcompat.view.menu;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.emoji2.text.c;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
public final class xn implements TextWatcher {
    public final EditText a;
    public final boolean b;
    public c.f c;
    public int d = Integer.MAX_VALUE;
    public int e = 0;
    public boolean f = true;

    /* loaded from: classes.dex */
    public static class a extends c.f {
        public final Reference a;

        public a(EditText editText) {
            this.a = new WeakReference(editText);
        }

        @Override // androidx.emoji2.text.c.f
        public void b() {
            super.b();
            xn.b((EditText) this.a.get(), 1);
        }
    }

    public xn(EditText editText, boolean z) {
        this.a = editText;
        this.b = z;
    }

    public static void b(EditText editText, int i) {
        if (i == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            androidx.emoji2.text.c.c().p(editableText);
            tn.b(editableText, selectionStart, selectionEnd);
        }
    }

    public final c.f a() {
        if (this.c == null) {
            this.c = new a(this.a);
        }
        return this.c;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void c(boolean z) {
        if (this.f != z) {
            if (this.c != null) {
                androidx.emoji2.text.c.c().u(this.c);
            }
            this.f = z;
            if (z) {
                b(this.a, androidx.emoji2.text.c.c().e());
            }
        }
    }

    public final boolean d() {
        return (this.f && (this.b || androidx.emoji2.text.c.i())) ? false : true;
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (this.a.isInEditMode() || d() || i2 > i3 || !(charSequence instanceof Spannable)) {
            return;
        }
        int e = androidx.emoji2.text.c.c().e();
        if (e != 0) {
            if (e == 1) {
                androidx.emoji2.text.c.c().s((Spannable) charSequence, i, i + i3, this.d, this.e);
                return;
            } else if (e != 3) {
                return;
            }
        }
        androidx.emoji2.text.c.c().t(a());
    }
}
