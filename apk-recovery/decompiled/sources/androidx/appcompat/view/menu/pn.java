package androidx.appcompat.view.menu;

import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
/* loaded from: classes.dex */
public final class pn {
    public final b a;
    public int b = Integer.MAX_VALUE;
    public int c = 0;

    /* loaded from: classes.dex */
    public static class a extends b {
        public final EditText a;
        public final xn b;

        public a(EditText editText, boolean z) {
            this.a = editText;
            xn xnVar = new xn(editText, z);
            this.b = xnVar;
            editText.addTextChangedListener(xnVar);
            editText.setEditableFactory(qn.getInstance());
        }

        @Override // androidx.appcompat.view.menu.pn.b
        public KeyListener a(KeyListener keyListener) {
            if (keyListener instanceof un) {
                return keyListener;
            }
            if (keyListener == null) {
                return null;
            }
            return keyListener instanceof NumberKeyListener ? keyListener : new un(keyListener);
        }

        @Override // androidx.appcompat.view.menu.pn.b
        public InputConnection b(InputConnection inputConnection, EditorInfo editorInfo) {
            return inputConnection instanceof sn ? inputConnection : new sn(this.a, inputConnection, editorInfo);
        }

        @Override // androidx.appcompat.view.menu.pn.b
        public void c(boolean z) {
            this.b.c(z);
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public abstract KeyListener a(KeyListener keyListener);

        public abstract InputConnection b(InputConnection inputConnection, EditorInfo editorInfo);

        public abstract void c(boolean z);
    }

    public pn(EditText editText, boolean z) {
        tj0.h(editText, "editText cannot be null");
        this.a = new a(editText, z);
    }

    public KeyListener a(KeyListener keyListener) {
        return this.a.a(keyListener);
    }

    public InputConnection b(InputConnection inputConnection, EditorInfo editorInfo) {
        if (inputConnection == null) {
            return null;
        }
        return this.a.b(inputConnection, editorInfo);
    }

    public void c(boolean z) {
        this.a.c(z);
    }
}
