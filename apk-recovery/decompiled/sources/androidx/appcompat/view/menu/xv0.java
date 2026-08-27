package androidx.appcompat.view.menu;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.view.menu.xv0;
/* loaded from: classes.dex */
public final class xv0 {
    public final c a;

    /* loaded from: classes.dex */
    public static class a extends c {
        public final View a;

        public a(View view) {
            this.a = view;
        }

        public static /* synthetic */ void c(View view) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
        }

        @Override // androidx.appcompat.view.menu.xv0.c
        public void a() {
            final View view = this.a;
            if (view == null) {
                return;
            }
            if (view.isInEditMode() || view.onCheckIsTextEditor()) {
                view.requestFocus();
            } else {
                view = view.getRootView().findFocus();
            }
            if (view == null) {
                view = this.a.getRootView().findViewById(16908290);
            }
            if (view == null || !view.hasWindowFocus()) {
                return;
            }
            view.post(new Runnable() { // from class: androidx.appcompat.view.menu.wv0
                @Override // java.lang.Runnable
                public final void run() {
                    xv0.a.c(view);
                }
            });
        }
    }

    /* loaded from: classes.dex */
    public static class b extends a {
        public View b;
        public WindowInsetsController c;

        public b(View view) {
            super(view);
            this.b = view;
        }

        @Override // androidx.appcompat.view.menu.xv0.a, androidx.appcompat.view.menu.xv0.c
        public void a() {
            int ime;
            View view = this.b;
            if (view != null && Build.VERSION.SDK_INT < 33) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).isActive();
            }
            WindowInsetsController windowInsetsController = this.c;
            if (windowInsetsController == null) {
                View view2 = this.b;
                windowInsetsController = view2 != null ? view2.getWindowInsetsController() : null;
            }
            if (windowInsetsController != null) {
                ime = WindowInsets.Type.ime();
                windowInsetsController.show(ime);
            }
            super.a();
        }

        public b(WindowInsetsController windowInsetsController) {
            super(null);
            this.c = windowInsetsController;
        }
    }

    /* loaded from: classes.dex */
    public static class c {
        public abstract void a();
    }

    public xv0(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.a = new b(view);
        } else {
            this.a = new a(view);
        }
    }

    public void a() {
        this.a.a();
    }

    public xv0(WindowInsetsController windowInsetsController) {
        this.a = new b(windowInsetsController);
    }
}
