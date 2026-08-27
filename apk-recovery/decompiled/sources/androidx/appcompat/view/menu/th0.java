package androidx.appcompat.view.menu;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
/* loaded from: classes.dex */
public class th0 extends oo {
    public int e;
    public EditText f;
    public final View.OnClickListener g;

    public th0(com.google.android.material.textfield.a aVar, int i) {
        super(aVar);
        this.e = lm0.a;
        this.g = new View.OnClickListener() { // from class: androidx.appcompat.view.menu.sh0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                th0.this.y(view);
            }
        };
        if (i != 0) {
            this.e = i;
        }
    }

    public static boolean x(EditText editText) {
        return editText != null && (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void y(View view) {
        EditText editText = this.f;
        if (editText == null) {
            return;
        }
        int selectionEnd = editText.getSelectionEnd();
        if (w()) {
            this.f.setTransformationMethod(null);
        } else {
            this.f.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
        if (selectionEnd >= 0) {
            this.f.setSelection(selectionEnd);
        }
        r();
    }

    @Override // androidx.appcompat.view.menu.oo
    public void b(CharSequence charSequence, int i, int i2, int i3) {
        r();
    }

    @Override // androidx.appcompat.view.menu.oo
    public int c() {
        return dn0.s;
    }

    @Override // androidx.appcompat.view.menu.oo
    public int d() {
        return this.e;
    }

    @Override // androidx.appcompat.view.menu.oo
    public View.OnClickListener f() {
        return this.g;
    }

    @Override // androidx.appcompat.view.menu.oo
    public boolean l() {
        return true;
    }

    @Override // androidx.appcompat.view.menu.oo
    public boolean m() {
        return !w();
    }

    @Override // androidx.appcompat.view.menu.oo
    public void n(EditText editText) {
        this.f = editText;
        r();
    }

    @Override // androidx.appcompat.view.menu.oo
    public void s() {
        if (x(this.f)) {
            this.f.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    @Override // androidx.appcompat.view.menu.oo
    public void u() {
        EditText editText = this.f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    public final boolean w() {
        EditText editText = this.f;
        return editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod);
    }
}
