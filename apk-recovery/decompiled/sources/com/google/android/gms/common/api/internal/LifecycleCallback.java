package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Keep;
import androidx.appcompat.view.menu.b90;
import androidx.appcompat.view.menu.pj0;
import androidx.appcompat.view.menu.wm1;
import androidx.appcompat.view.menu.yh1;
import androidx.appcompat.view.menu.z80;
import java.io.FileDescriptor;
import java.io.PrintWriter;
/* loaded from: classes.dex */
public class LifecycleCallback {
    public final b90 a;

    public LifecycleCallback(b90 b90Var) {
        this.a = b90Var;
    }

    public static b90 c(Activity activity) {
        return d(new z80(activity));
    }

    public static b90 d(z80 z80Var) {
        if (z80Var.d()) {
            z80Var.b();
            return wm1.h1(null);
        } else if (z80Var.c()) {
            return yh1.f(z80Var.a());
        } else {
            throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
        }
    }

    @Keep
    private static b90 getChimeraLifecycleFragmentImpl(z80 z80Var) {
        throw new IllegalStateException("Method not available in SDK.");
    }

    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public Activity b() {
        Activity e = this.a.e();
        pj0.i(e);
        return e;
    }

    public void e(int i, int i2, Intent intent) {
    }

    public void f(Bundle bundle) {
    }

    public void g() {
    }

    public void h() {
    }

    public void i(Bundle bundle) {
    }

    public void j() {
    }

    public void k() {
    }
}
