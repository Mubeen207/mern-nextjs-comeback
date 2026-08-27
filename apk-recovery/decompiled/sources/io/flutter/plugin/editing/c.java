package io.flutter.plugin.editing;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.view.menu.a01;
import androidx.appcompat.view.menu.d80;
import androidx.appcompat.view.menu.ej0;
import androidx.appcompat.view.menu.ha0;
import androidx.appcompat.view.menu.mn;
import io.flutter.plugin.editing.b;
import java.util.HashMap;
/* loaded from: classes.dex */
public class c implements b.InterfaceC0070b {
    public final View a;
    public final InputMethodManager b;
    public final AutofillManager c;
    public final a01 d;
    public C0071c e = new C0071c(C0071c.a.NO_TARGET, 0);
    public a01.b f;
    public SparseArray g;
    public io.flutter.plugin.editing.b h;
    public boolean i;
    public InputConnection j;
    public ej0 k;
    public Rect l;
    public ImeSyncDeferringInsetsCallback m;
    public a01.e n;
    public boolean o;

    /* loaded from: classes.dex */
    public class a implements a01.f {
        public a() {
        }

        @Override // androidx.appcompat.view.menu.a01.f
        public void a() {
            c cVar = c.this;
            cVar.D(cVar.a);
        }

        @Override // androidx.appcompat.view.menu.a01.f
        public void b() {
            c.this.k();
        }

        @Override // androidx.appcompat.view.menu.a01.f
        public void c(int i, a01.b bVar) {
            c.this.B(i, bVar);
        }

        @Override // androidx.appcompat.view.menu.a01.f
        public void d(String str, Bundle bundle) {
            c.this.z(str, bundle);
        }

        @Override // androidx.appcompat.view.menu.a01.f
        public void e(int i, boolean z) {
            c.this.A(i, z);
        }

        @Override // androidx.appcompat.view.menu.a01.f
        public void f(double d, double d2, double[] dArr) {
            c.this.y(d, d2, dArr);
        }

        @Override // androidx.appcompat.view.menu.a01.f
        public void g(a01.e eVar) {
            c cVar = c.this;
            cVar.C(cVar.a, eVar);
        }

        @Override // androidx.appcompat.view.menu.a01.f
        public void h() {
            c.this.v();
        }

        @Override // androidx.appcompat.view.menu.a01.f
        public void i(boolean z) {
            if (c.this.c == null) {
                return;
            }
            if (z) {
                c.this.c.commit();
            } else {
                c.this.c.cancel();
            }
        }

        @Override // androidx.appcompat.view.menu.a01.f
        public void j() {
            if (c.this.e.a == C0071c.a.PHYSICAL_DISPLAY_PLATFORM_VIEW) {
                c.this.w();
                return;
            }
            c cVar = c.this;
            cVar.q(cVar.a);
        }
    }

    /* loaded from: classes.dex */
    public class b implements d {
        public final /* synthetic */ boolean a;
        public final /* synthetic */ double[] b;
        public final /* synthetic */ double[] c;

        public b(boolean z, double[] dArr, double[] dArr2) {
            this.a = z;
            this.b = dArr;
            this.c = dArr2;
        }

        @Override // io.flutter.plugin.editing.c.d
        public void a(double d, double d2) {
            double d3 = 1.0d;
            if (!this.a) {
                double[] dArr = this.b;
                d3 = 1.0d / (((dArr[3] * d) + (dArr[7] * d2)) + dArr[15]);
            }
            double[] dArr2 = this.b;
            double d4 = ((dArr2[0] * d) + (dArr2[4] * d2) + dArr2[12]) * d3;
            double d5 = ((dArr2[1] * d) + (dArr2[5] * d2) + dArr2[13]) * d3;
            double[] dArr3 = this.c;
            if (d4 < dArr3[0]) {
                dArr3[0] = d4;
            } else if (d4 > dArr3[1]) {
                dArr3[1] = d4;
            }
            if (d5 < dArr3[2]) {
                dArr3[2] = d5;
            } else if (d5 > dArr3[3]) {
                dArr3[3] = d5;
            }
        }
    }

    /* renamed from: io.flutter.plugin.editing.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0071c {
        public a a;
        public int b;

        /* renamed from: io.flutter.plugin.editing.c$c$a */
        /* loaded from: classes.dex */
        public enum a {
            NO_TARGET,
            FRAMEWORK_CLIENT,
            VIRTUAL_DISPLAY_PLATFORM_VIEW,
            PHYSICAL_DISPLAY_PLATFORM_VIEW
        }

        public C0071c(a aVar, int i) {
            this.a = aVar;
            this.b = i;
        }
    }

    /* loaded from: classes.dex */
    public interface d {
        void a(double d, double d2);
    }

    public c(View view, a01 a01Var, ej0 ej0Var) {
        this.a = view;
        this.h = new io.flutter.plugin.editing.b(null, view);
        this.b = (InputMethodManager) view.getContext().getSystemService("input_method");
        int i = Build.VERSION.SDK_INT;
        this.c = (AutofillManager) view.getContext().getSystemService(AutofillManager.class);
        if (i >= 30) {
            ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback = new ImeSyncDeferringInsetsCallback(view);
            this.m = imeSyncDeferringInsetsCallback;
            imeSyncDeferringInsetsCallback.install();
        }
        this.d = a01Var;
        a01Var.n(new a());
        a01Var.k();
        this.k = ej0Var;
        ej0Var.v(this);
    }

    public static boolean l(a01.e eVar, a01.e eVar2) {
        int i = eVar.e - eVar.d;
        if (i != eVar2.e - eVar2.d) {
            return true;
        }
        for (int i2 = 0; i2 < i; i2++) {
            if (eVar.a.charAt(eVar.d + i2) != eVar2.a.charAt(eVar2.d + i2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int r(androidx.appcompat.view.menu.a01.c r1, boolean r2, boolean r3, boolean r4, boolean r5, androidx.appcompat.view.menu.a01.d r6) {
        /*
            androidx.appcompat.view.menu.a01$g r5 = r1.a
            androidx.appcompat.view.menu.a01$g r0 = androidx.appcompat.view.menu.a01.g.DATETIME
            if (r5 != r0) goto L8
            r1 = 4
            return r1
        L8:
            androidx.appcompat.view.menu.a01$g r0 = androidx.appcompat.view.menu.a01.g.NUMBER
            if (r5 != r0) goto L1b
            boolean r2 = r1.b
            if (r2 == 0) goto L13
            r2 = 4098(0x1002, float:5.743E-42)
            goto L14
        L13:
            r2 = 2
        L14:
            boolean r1 = r1.c
            if (r1 == 0) goto L1a
            r2 = r2 | 8192(0x2000, float:1.14794E-41)
        L1a:
            return r2
        L1b:
            androidx.appcompat.view.menu.a01$g r1 = androidx.appcompat.view.menu.a01.g.PHONE
            if (r5 != r1) goto L21
            r1 = 3
            return r1
        L21:
            androidx.appcompat.view.menu.a01$g r1 = androidx.appcompat.view.menu.a01.g.NONE
            if (r5 != r1) goto L27
            r1 = 0
            return r1
        L27:
            androidx.appcompat.view.menu.a01$g r1 = androidx.appcompat.view.menu.a01.g.MULTILINE
            if (r5 != r1) goto L2f
            r1 = 131073(0x20001, float:1.83672E-40)
            goto L53
        L2f:
            androidx.appcompat.view.menu.a01$g r1 = androidx.appcompat.view.menu.a01.g.EMAIL_ADDRESS
            if (r5 != r1) goto L36
            r1 = 33
            goto L53
        L36:
            androidx.appcompat.view.menu.a01$g r1 = androidx.appcompat.view.menu.a01.g.URL
            if (r5 != r1) goto L3d
            r1 = 17
            goto L53
        L3d:
            androidx.appcompat.view.menu.a01$g r1 = androidx.appcompat.view.menu.a01.g.VISIBLE_PASSWORD
            if (r5 != r1) goto L44
            r1 = 145(0x91, float:2.03E-43)
            goto L53
        L44:
            androidx.appcompat.view.menu.a01$g r1 = androidx.appcompat.view.menu.a01.g.NAME
            if (r5 != r1) goto L4b
            r1 = 97
            goto L53
        L4b:
            androidx.appcompat.view.menu.a01$g r1 = androidx.appcompat.view.menu.a01.g.POSTAL_ADDRESS
            if (r5 != r1) goto L52
            r1 = 113(0x71, float:1.58E-43)
            goto L53
        L52:
            r1 = 1
        L53:
            if (r2 == 0) goto L5a
            r2 = 524416(0x80080, float:7.34863E-40)
        L58:
            r1 = r1 | r2
            goto L66
        L5a:
            if (r3 == 0) goto L60
            r2 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 | r2
        L60:
            if (r4 != 0) goto L66
            r2 = 524432(0x80090, float:7.34886E-40)
            goto L58
        L66:
            androidx.appcompat.view.menu.a01$d r2 = androidx.appcompat.view.menu.a01.d.CHARACTERS
            if (r6 != r2) goto L6d
            r1 = r1 | 4096(0x1000, float:5.74E-42)
            goto L7a
        L6d:
            androidx.appcompat.view.menu.a01$d r2 = androidx.appcompat.view.menu.a01.d.WORDS
            if (r6 != r2) goto L74
            r1 = r1 | 8192(0x2000, float:1.14794E-41)
            goto L7a
        L74:
            androidx.appcompat.view.menu.a01$d r2 = androidx.appcompat.view.menu.a01.d.SENTENCES
            if (r6 != r2) goto L7a
            r1 = r1 | 16384(0x4000, float:2.2959E-41)
        L7a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugin.editing.c.r(androidx.appcompat.view.menu.a01$c, boolean, boolean, boolean, boolean, androidx.appcompat.view.menu.a01$d):int");
    }

    public final void A(int i, boolean z) {
        if (!z) {
            this.e = new C0071c(C0071c.a.PHYSICAL_DISPLAY_PLATFORM_VIEW, i);
            this.j = null;
            return;
        }
        this.a.requestFocus();
        this.e = new C0071c(C0071c.a.VIRTUAL_DISPLAY_PLATFORM_VIEW, i);
        this.b.restartInput(this.a);
        this.i = false;
    }

    public void B(int i, a01.b bVar) {
        w();
        this.f = bVar;
        this.e = new C0071c(C0071c.a.FRAMEWORK_CLIENT, i);
        this.h.l(this);
        a01.b.a aVar = bVar.j;
        this.h = new io.flutter.plugin.editing.b(aVar != null ? aVar.c : null, this.a);
        F(bVar);
        this.i = true;
        E();
        this.l = null;
        this.h.a(this);
    }

    public void C(View view, a01.e eVar) {
        a01.e eVar2;
        if (!this.i && (eVar2 = this.n) != null && eVar2.b()) {
            boolean l = l(this.n, eVar);
            this.i = l;
            if (l) {
                ha0.e("TextInputPlugin", "Composing region changed by the framework. Restarting the input method.");
            }
        }
        this.n = eVar;
        this.h.n(eVar);
        if (this.i) {
            this.b.restartInput(view);
            this.i = false;
        }
    }

    public void D(View view) {
        a01.c cVar;
        a01.b bVar = this.f;
        if (bVar != null && (cVar = bVar.g) != null && cVar.a == a01.g.NONE) {
            q(view);
            return;
        }
        view.requestFocus();
        this.b.showSoftInput(view, 0);
    }

    public void E() {
        if (this.e.a == C0071c.a.VIRTUAL_DISPLAY_PLATFORM_VIEW) {
            this.o = false;
        }
    }

    public final void F(a01.b bVar) {
        if (bVar == null || bVar.j == null) {
            this.g = null;
            return;
        }
        a01.b[] bVarArr = bVar.l;
        SparseArray sparseArray = new SparseArray();
        this.g = sparseArray;
        if (bVarArr == null) {
            sparseArray.put(bVar.j.a.hashCode(), bVar);
            return;
        }
        for (a01.b bVar2 : bVarArr) {
            a01.b.a aVar = bVar2.j;
            if (aVar != null) {
                this.g.put(aVar.a.hashCode(), bVar2);
                this.c.notifyValueChanged(this.a, aVar.a.hashCode(), AutofillValue.forText(aVar.c.a));
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004d, code lost:
        if (r7 == r1.e) goto L22;
     */
    @Override // io.flutter.plugin.editing.b.InterfaceC0070b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(boolean r9, boolean r10, boolean r11) {
        /*
            r8 = this;
            if (r9 == 0) goto Lb
            io.flutter.plugin.editing.b r9 = r8.h
            java.lang.String r9 = r9.toString()
            r8.u(r9)
        Lb:
            io.flutter.plugin.editing.b r9 = r8.h
            int r9 = r9.i()
            io.flutter.plugin.editing.b r10 = r8.h
            int r10 = r10.h()
            io.flutter.plugin.editing.b r11 = r8.h
            int r11 = r11.g()
            io.flutter.plugin.editing.b r0 = r8.h
            int r7 = r0.f()
            io.flutter.plugin.editing.b r0 = r8.h
            java.util.ArrayList r0 = r0.e()
            androidx.appcompat.view.menu.a01$e r1 = r8.n
            if (r1 == 0) goto La7
            io.flutter.plugin.editing.b r1 = r8.h
            java.lang.String r1 = r1.toString()
            androidx.appcompat.view.menu.a01$e r2 = r8.n
            java.lang.String r2 = r2.a
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L50
            androidx.appcompat.view.menu.a01$e r1 = r8.n
            int r2 = r1.b
            if (r9 != r2) goto L50
            int r2 = r1.c
            if (r10 != r2) goto L50
            int r2 = r1.d
            if (r11 != r2) goto L50
            int r1 = r1.e
            if (r7 != r1) goto L50
            goto La7
        L50:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "send EditingState to flutter: "
            r1.append(r2)
            io.flutter.plugin.editing.b r2 = r8.h
            java.lang.String r2 = r2.toString()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "TextInputPlugin"
            androidx.appcompat.view.menu.ha0.f(r2, r1)
            androidx.appcompat.view.menu.a01$b r1 = r8.f
            boolean r1 = r1.e
            if (r1 == 0) goto L81
            androidx.appcompat.view.menu.a01 r1 = r8.d
            io.flutter.plugin.editing.c$c r2 = r8.e
            int r2 = r2.b
            r1.q(r2, r0)
            io.flutter.plugin.editing.b r0 = r8.h
            r0.c()
            goto L94
        L81:
            androidx.appcompat.view.menu.a01 r0 = r8.d
            io.flutter.plugin.editing.c$c r1 = r8.e
            int r1 = r1.b
            io.flutter.plugin.editing.b r2 = r8.h
            java.lang.String r2 = r2.toString()
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r7
            r0.p(r1, r2, r3, r4, r5, r6)
        L94:
            androidx.appcompat.view.menu.a01$e r6 = new androidx.appcompat.view.menu.a01$e
            io.flutter.plugin.editing.b r0 = r8.h
            java.lang.String r1 = r0.toString()
            r0 = r6
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            r8.n = r6
            goto Lac
        La7:
            io.flutter.plugin.editing.b r9 = r8.h
            r9.c()
        Lac:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugin.editing.c.a(boolean, boolean, boolean):void");
    }

    public void j(SparseArray sparseArray) {
        a01.b.a aVar;
        a01.b.a aVar2;
        a01.b bVar = this.f;
        if (bVar == null || this.g == null || (aVar = bVar.j) == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        for (int i = 0; i < sparseArray.size(); i++) {
            a01.b bVar2 = (a01.b) this.g.get(sparseArray.keyAt(i));
            if (bVar2 != null && (aVar2 = bVar2.j) != null) {
                String charSequence = ((AutofillValue) sparseArray.valueAt(i)).getTextValue().toString();
                a01.e eVar = new a01.e(charSequence, charSequence.length(), charSequence.length(), -1, -1);
                if (aVar2.a.equals(aVar.a)) {
                    this.h.n(eVar);
                } else {
                    hashMap.put(aVar2.a, eVar);
                }
            }
        }
        this.d.r(this.e.b, hashMap);
    }

    public void k() {
        if (this.e.a == C0071c.a.VIRTUAL_DISPLAY_PLATFORM_VIEW) {
            return;
        }
        this.h.l(this);
        w();
        this.f = null;
        F(null);
        this.e = new C0071c(C0071c.a.NO_TARGET, 0);
        E();
        this.l = null;
        this.b.restartInput(this.a);
    }

    public InputConnection m(View view, d80 d80Var, EditorInfo editorInfo) {
        C0071c c0071c = this.e;
        C0071c.a aVar = c0071c.a;
        if (aVar == C0071c.a.NO_TARGET) {
            this.j = null;
            return null;
        } else if (aVar == C0071c.a.PHYSICAL_DISPLAY_PLATFORM_VIEW) {
            return null;
        } else {
            if (aVar == C0071c.a.VIRTUAL_DISPLAY_PLATFORM_VIEW) {
                if (this.o) {
                    return this.j;
                }
                InputConnection onCreateInputConnection = this.k.c(c0071c.b).onCreateInputConnection(editorInfo);
                this.j = onCreateInputConnection;
                return onCreateInputConnection;
            }
            a01.b bVar = this.f;
            int r = r(bVar.g, bVar.a, bVar.b, bVar.c, bVar.d, bVar.f);
            editorInfo.inputType = r;
            editorInfo.imeOptions = 33554432;
            a01.b bVar2 = this.f;
            if (!bVar2.d) {
                editorInfo.imeOptions = 33554432 | 16777216;
            }
            Integer num = bVar2.h;
            int intValue = num == null ? (r & 131072) != 0 ? 1 : 6 : num.intValue();
            a01.b bVar3 = this.f;
            String str = bVar3.i;
            if (str != null) {
                editorInfo.actionLabel = str;
                editorInfo.actionId = intValue;
            }
            editorInfo.imeOptions = intValue | editorInfo.imeOptions;
            String[] strArr = bVar3.k;
            if (strArr != null) {
                mn.c(editorInfo, strArr);
            }
            io.flutter.plugin.editing.a aVar2 = new io.flutter.plugin.editing.a(view, this.e.b, this.d, d80Var, this.h, editorInfo);
            editorInfo.initialSelStart = this.h.i();
            editorInfo.initialSelEnd = this.h.h();
            this.j = aVar2;
            return aVar2;
        }
    }

    public void n() {
        this.k.G();
        this.d.n(null);
        w();
        this.h.l(this);
        ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback = this.m;
        if (imeSyncDeferringInsetsCallback != null) {
            imeSyncDeferringInsetsCallback.remove();
        }
    }

    public InputMethodManager o() {
        return this.b;
    }

    public boolean p(KeyEvent keyEvent) {
        InputConnection inputConnection;
        if (!o().isAcceptingText() || (inputConnection = this.j) == null) {
            return false;
        }
        return inputConnection instanceof io.flutter.plugin.editing.a ? ((io.flutter.plugin.editing.a) inputConnection).f(keyEvent) : inputConnection.sendKeyEvent(keyEvent);
    }

    public final void q(View view) {
        w();
        this.b.hideSoftInputFromWindow(view.getApplicationWindowToken(), 0);
    }

    public void s() {
        if (this.e.a == C0071c.a.VIRTUAL_DISPLAY_PLATFORM_VIEW) {
            this.o = true;
        }
    }

    public final boolean t() {
        return this.g != null;
    }

    public final void u(String str) {
        if (this.c == null || !t()) {
            return;
        }
        this.c.notifyValueChanged(this.a, this.f.j.a.hashCode(), AutofillValue.forText(str));
    }

    public final void v() {
        if (this.c == null || !t()) {
            return;
        }
        String str = this.f.j.a;
        int[] iArr = new int[2];
        this.a.getLocationOnScreen(iArr);
        Rect rect = new Rect(this.l);
        rect.offset(iArr[0], iArr[1]);
        this.c.notifyViewEntered(this.a, str.hashCode(), rect);
    }

    public final void w() {
        a01.b bVar;
        if (this.c == null || (bVar = this.f) == null || bVar.j == null || !t()) {
            return;
        }
        this.c.notifyViewExited(this.a, this.f.j.a.hashCode());
    }

    public void x(ViewStructure viewStructure, int i) {
        Rect rect;
        if (t()) {
            String str = this.f.j.a;
            AutofillId autofillId = viewStructure.getAutofillId();
            for (int i2 = 0; i2 < this.g.size(); i2++) {
                int keyAt = this.g.keyAt(i2);
                a01.b.a aVar = ((a01.b) this.g.valueAt(i2)).j;
                if (aVar != null) {
                    viewStructure.addChildCount(1);
                    ViewStructure newChild = viewStructure.newChild(i2);
                    newChild.setAutofillId(autofillId, keyAt);
                    String[] strArr = aVar.b;
                    if (strArr.length > 0) {
                        newChild.setAutofillHints(strArr);
                    }
                    newChild.setAutofillType(1);
                    newChild.setVisibility(0);
                    String str2 = aVar.d;
                    if (str2 != null) {
                        newChild.setHint(str2);
                    }
                    if (str.hashCode() != keyAt || (rect = this.l) == null) {
                        newChild.setDimens(0, 0, 0, 0, 1, 1);
                        newChild.setAutofillValue(AutofillValue.forText(aVar.c.a));
                    } else {
                        newChild.setDimens(rect.left, rect.top, 0, 0, rect.width(), this.l.height());
                        newChild.setAutofillValue(AutofillValue.forText(this.h));
                    }
                }
            }
        }
    }

    public final void y(double d2, double d3, double[] dArr) {
        double[] dArr2 = new double[4];
        boolean z = dArr[3] == 0.0d && dArr[7] == 0.0d && dArr[15] == 1.0d;
        double d4 = dArr[12];
        double d5 = dArr[15];
        double d6 = d4 / d5;
        dArr2[1] = d6;
        dArr2[0] = d6;
        double d7 = dArr[13] / d5;
        dArr2[3] = d7;
        dArr2[2] = d7;
        b bVar = new b(z, dArr, dArr2);
        bVar.a(d2, 0.0d);
        bVar.a(d2, d3);
        bVar.a(0.0d, d3);
        Float valueOf = Float.valueOf(this.a.getContext().getResources().getDisplayMetrics().density);
        this.l = new Rect((int) (dArr2[0] * valueOf.floatValue()), (int) (dArr2[2] * valueOf.floatValue()), (int) Math.ceil(dArr2[1] * valueOf.floatValue()), (int) Math.ceil(dArr2[3] * valueOf.floatValue()));
    }

    public void z(String str, Bundle bundle) {
        this.b.sendAppPrivateCommand(this.a, str, bundle);
    }
}
