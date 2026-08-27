package androidx.appcompat.view.menu;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.f;
/* loaded from: classes.dex */
public class ae extends Dialog implements d90, hg0, ur0 {
    public androidx.lifecycle.i a;
    public final tr0 b;
    public final fg0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ae(Context context, int i) {
        super(context, i);
        c60.e(context, "context");
        this.b = tr0.d.a(this);
        this.c = new fg0(new Runnable() { // from class: androidx.appcompat.view.menu.zd
            @Override // java.lang.Runnable
            public final void run() {
                ae.d(ae.this);
            }
        });
    }

    public static final void d(ae aeVar) {
        c60.e(aeVar, "this$0");
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        c60.e(view, "view");
        c();
        super.addContentView(view, layoutParams);
    }

    public final androidx.lifecycle.i b() {
        androidx.lifecycle.i iVar = this.a;
        if (iVar == null) {
            androidx.lifecycle.i iVar2 = new androidx.lifecycle.i(this);
            this.a = iVar2;
            return iVar2;
        }
        return iVar;
    }

    public void c() {
        Window window = getWindow();
        c60.b(window);
        View decorView = window.getDecorView();
        c60.d(decorView, "window!!.decorView");
        k61.a(decorView, this);
        Window window2 = getWindow();
        c60.b(window2);
        View decorView2 = window2.getDecorView();
        c60.d(decorView2, "window!!.decorView");
        l61.a(decorView2, this);
        Window window3 = getWindow();
        c60.b(window3);
        View decorView3 = window3.getDecorView();
        c60.d(decorView3, "window!!.decorView");
        m61.a(decorView3, this);
    }

    @Override // androidx.appcompat.view.menu.d90
    public androidx.lifecycle.f h() {
        return b();
    }

    @Override // androidx.appcompat.view.menu.hg0
    public final fg0 k() {
        return this.c;
    }

    @Override // androidx.appcompat.view.menu.ur0
    public sr0 l() {
        return this.b.b();
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        this.c.e();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            fg0 fg0Var = this.c;
            onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            c60.d(onBackInvokedDispatcher, "onBackInvokedDispatcher");
            fg0Var.h(onBackInvokedDispatcher);
        }
        this.b.d(bundle);
        b().h(f.a.ON_CREATE);
    }

    @Override // android.app.Dialog
    public Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        c60.d(onSaveInstanceState, "super.onSaveInstanceState()");
        this.b.e(onSaveInstanceState);
        return onSaveInstanceState;
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        b().h(f.a.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        b().h(f.a.ON_DESTROY);
        this.a = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        c();
        super.setContentView(i);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        c60.e(view, "view");
        c();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        c60.e(view, "view");
        c();
        super.setContentView(view, layoutParams);
    }
}
