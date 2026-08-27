package androidx.appcompat.view.menu;

import android.text.Editable;
/* loaded from: classes.dex */
public final class qn extends Editable.Factory {
    public static final Object a = new Object();
    public static volatile Editable.Factory b;
    public static Class c;

    public qn() {
        try {
            c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, qn.class.getClassLoader());
        } catch (Throwable unused) {
        }
    }

    public static Editable.Factory getInstance() {
        if (b == null) {
            synchronized (a) {
                try {
                    if (b == null) {
                        b = new qn();
                    }
                } finally {
                }
            }
        }
        return b;
    }

    @Override // android.text.Editable.Factory
    public Editable newEditable(CharSequence charSequence) {
        Class cls = c;
        return cls != null ? fw0.c(cls, charSequence) : super.newEditable(charSequence);
    }
}
