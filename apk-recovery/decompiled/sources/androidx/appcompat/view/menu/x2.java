package androidx.appcompat.view.menu;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CompoundButton;
/* loaded from: classes.dex */
public class x2 {
    public final CompoundButton a;
    public ColorStateList b = null;
    public PorterDuff.Mode c = null;
    public boolean d = false;
    public boolean e = false;
    public boolean f;

    public x2(CompoundButton compoundButton) {
        this.a = compoundButton;
    }

    public void a() {
        Drawable a = ue.a(this.a);
        if (a != null) {
            if (this.d || this.e) {
                Drawable mutate = om.l(a).mutate();
                if (this.d) {
                    om.i(mutate, this.b);
                }
                if (this.e) {
                    om.j(mutate, this.c);
                }
                if (mutate.isStateful()) {
                    mutate.setState(this.a.getDrawableState());
                }
                this.a.setButtonDrawable(mutate);
            }
        }
    }

    public ColorStateList b() {
        return this.b;
    }

    public PorterDuff.Mode c() {
        return this.c;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0064 A[Catch: all -> 0x003d, TryCatch #1 {all -> 0x003d, blocks: (B:3:0x001f, B:5:0x0027, B:7:0x002f, B:16:0x005c, B:18:0x0064, B:19:0x006f, B:21:0x0077, B:11:0x003f, B:13:0x0047, B:15:0x004f), top: B:29:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0077 A[Catch: all -> 0x003d, TRY_LEAVE, TryCatch #1 {all -> 0x003d, blocks: (B:3:0x001f, B:5:0x0027, B:7:0x002f, B:16:0x005c, B:18:0x0064, B:19:0x006f, B:21:0x0077, B:11:0x003f, B:13:0x0047, B:15:0x004f), top: B:29:0x001f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d(android.util.AttributeSet r11, int r12) {
        /*
            r10 = this;
            android.widget.CompoundButton r0 = r10.a
            android.content.Context r0 = r0.getContext()
            int[] r1 = androidx.appcompat.view.menu.pn0.p0
            r2 = 0
            androidx.appcompat.view.menu.b11 r0 = androidx.appcompat.view.menu.b11.t(r0, r11, r1, r12, r2)
            android.widget.CompoundButton r3 = r10.a
            android.content.Context r4 = r3.getContext()
            int[] r5 = androidx.appcompat.view.menu.pn0.p0
            android.content.res.TypedArray r7 = r0.p()
            r9 = 0
            r6 = r11
            r8 = r12
            androidx.appcompat.view.menu.p51.i0(r3, r4, r5, r6, r7, r8, r9)
            int r11 = androidx.appcompat.view.menu.pn0.r0     // Catch: java.lang.Throwable -> L3d
            boolean r11 = r0.q(r11)     // Catch: java.lang.Throwable -> L3d
            if (r11 == 0) goto L3f
            int r11 = androidx.appcompat.view.menu.pn0.r0     // Catch: java.lang.Throwable -> L3d
            int r11 = r0.m(r11, r2)     // Catch: java.lang.Throwable -> L3d
            if (r11 == 0) goto L3f
            android.widget.CompoundButton r12 = r10.a     // Catch: java.lang.Throwable -> L3d android.content.res.Resources.NotFoundException -> L3f
            android.content.Context r1 = r12.getContext()     // Catch: java.lang.Throwable -> L3d android.content.res.Resources.NotFoundException -> L3f
            android.graphics.drawable.Drawable r11 = androidx.appcompat.view.menu.i3.b(r1, r11)     // Catch: java.lang.Throwable -> L3d android.content.res.Resources.NotFoundException -> L3f
            r12.setButtonDrawable(r11)     // Catch: java.lang.Throwable -> L3d android.content.res.Resources.NotFoundException -> L3f
            goto L5c
        L3d:
            r11 = move-exception
            goto L8c
        L3f:
            int r11 = androidx.appcompat.view.menu.pn0.q0     // Catch: java.lang.Throwable -> L3d
            boolean r11 = r0.q(r11)     // Catch: java.lang.Throwable -> L3d
            if (r11 == 0) goto L5c
            int r11 = androidx.appcompat.view.menu.pn0.q0     // Catch: java.lang.Throwable -> L3d
            int r11 = r0.m(r11, r2)     // Catch: java.lang.Throwable -> L3d
            if (r11 == 0) goto L5c
            android.widget.CompoundButton r12 = r10.a     // Catch: java.lang.Throwable -> L3d
            android.content.Context r1 = r12.getContext()     // Catch: java.lang.Throwable -> L3d
            android.graphics.drawable.Drawable r11 = androidx.appcompat.view.menu.i3.b(r1, r11)     // Catch: java.lang.Throwable -> L3d
            r12.setButtonDrawable(r11)     // Catch: java.lang.Throwable -> L3d
        L5c:
            int r11 = androidx.appcompat.view.menu.pn0.s0     // Catch: java.lang.Throwable -> L3d
            boolean r11 = r0.q(r11)     // Catch: java.lang.Throwable -> L3d
            if (r11 == 0) goto L6f
            android.widget.CompoundButton r11 = r10.a     // Catch: java.lang.Throwable -> L3d
            int r12 = androidx.appcompat.view.menu.pn0.s0     // Catch: java.lang.Throwable -> L3d
            android.content.res.ColorStateList r12 = r0.c(r12)     // Catch: java.lang.Throwable -> L3d
            androidx.appcompat.view.menu.ue.b(r11, r12)     // Catch: java.lang.Throwable -> L3d
        L6f:
            int r11 = androidx.appcompat.view.menu.pn0.t0     // Catch: java.lang.Throwable -> L3d
            boolean r11 = r0.q(r11)     // Catch: java.lang.Throwable -> L3d
            if (r11 == 0) goto L88
            android.widget.CompoundButton r11 = r10.a     // Catch: java.lang.Throwable -> L3d
            int r12 = androidx.appcompat.view.menu.pn0.t0     // Catch: java.lang.Throwable -> L3d
            r1 = -1
            int r12 = r0.j(r12, r1)     // Catch: java.lang.Throwable -> L3d
            r1 = 0
            android.graphics.PorterDuff$Mode r12 = androidx.appcompat.view.menu.vm.d(r12, r1)     // Catch: java.lang.Throwable -> L3d
            androidx.appcompat.view.menu.ue.c(r11, r12)     // Catch: java.lang.Throwable -> L3d
        L88:
            r0.v()
            return
        L8c:
            r0.v()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.x2.d(android.util.AttributeSet, int):void");
    }

    public void e() {
        if (this.f) {
            this.f = false;
            return;
        }
        this.f = true;
        a();
    }

    public void f(ColorStateList colorStateList) {
        this.b = colorStateList;
        this.d = true;
        a();
    }

    public void g(PorterDuff.Mode mode) {
        this.c = mode;
        this.e = true;
        a();
    }
}
