package io.flutter.plugin.editing;

import android.text.Editable;
import android.text.Selection;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import androidx.appcompat.view.menu.a01;
import androidx.appcompat.view.menu.ha0;
import androidx.appcompat.view.menu.zz0;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public class b extends SpannableStringBuilder {
    public int m = 0;
    public int n = 0;
    public ArrayList o = new ArrayList();
    public ArrayList p = new ArrayList();
    public ArrayList q = new ArrayList();
    public String r;
    public String s;
    public int t;
    public int u;
    public int v;
    public int w;
    public BaseInputConnection x;

    /* loaded from: classes.dex */
    public class a extends BaseInputConnection {
        public final /* synthetic */ Editable a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View view, boolean z, Editable editable) {
            super(view, z);
            this.a = editable;
        }

        @Override // android.view.inputmethod.BaseInputConnection
        public Editable getEditable() {
            return this.a;
        }
    }

    /* renamed from: io.flutter.plugin.editing.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0070b {
        void a(boolean z, boolean z2, boolean z3);
    }

    public b(a01.e eVar, View view) {
        this.x = new a(view, true, this);
        if (eVar != null) {
            n(eVar);
        }
    }

    public void a(InterfaceC0070b interfaceC0070b) {
        if (this.n > 0) {
            ha0.b("ListenableEditingState", "adding a listener " + interfaceC0070b.toString() + " in a listener callback");
        }
        if (this.m <= 0) {
            this.o.add(interfaceC0070b);
            return;
        }
        ha0.g("ListenableEditingState", "a listener was added to EditingState while a batch edit was in progress");
        this.p.add(interfaceC0070b);
    }

    public void b() {
        this.m++;
        if (this.n > 0) {
            ha0.b("ListenableEditingState", "editing state should not be changed in a listener callback");
        }
        if (this.m != 1 || this.o.isEmpty()) {
            return;
        }
        this.s = toString();
        this.t = i();
        this.u = h();
        this.v = g();
        this.w = f();
    }

    public void c() {
        this.q.clear();
    }

    public void d() {
        int i = this.m;
        if (i == 0) {
            ha0.b("ListenableEditingState", "endBatchEdit called without a matching beginBatchEdit");
            return;
        }
        if (i == 1) {
            Iterator it = this.p.iterator();
            while (it.hasNext()) {
                j((InterfaceC0070b) it.next(), true, true, true);
            }
            if (!this.o.isEmpty()) {
                ha0.f("ListenableEditingState", "didFinishBatchEdit with " + String.valueOf(this.o.size()) + " listener(s)");
                boolean equals = toString().equals(this.s) ^ true;
                boolean z = false;
                boolean z2 = (this.t == i() && this.u == h()) ? false : true;
                if (this.v != g() || this.w != f()) {
                    z = true;
                }
                k(equals, z2, z);
            }
        }
        this.o.addAll(this.p);
        this.p.clear();
        this.m--;
    }

    public ArrayList e() {
        ArrayList arrayList = new ArrayList(this.q);
        this.q.clear();
        return arrayList;
    }

    public final int f() {
        return BaseInputConnection.getComposingSpanEnd(this);
    }

    public final int g() {
        return BaseInputConnection.getComposingSpanStart(this);
    }

    public final int h() {
        return Selection.getSelectionEnd(this);
    }

    public final int i() {
        return Selection.getSelectionStart(this);
    }

    public final void j(InterfaceC0070b interfaceC0070b, boolean z, boolean z2, boolean z3) {
        this.n++;
        interfaceC0070b.a(z, z2, z3);
        this.n--;
    }

    public final void k(boolean z, boolean z2, boolean z3) {
        if (z || z2 || z3) {
            Iterator it = this.o.iterator();
            while (it.hasNext()) {
                j((InterfaceC0070b) it.next(), z, z2, z3);
            }
        }
    }

    public void l(InterfaceC0070b interfaceC0070b) {
        if (this.n > 0) {
            ha0.b("ListenableEditingState", "removing a listener " + interfaceC0070b.toString() + " in a listener callback");
        }
        this.o.remove(interfaceC0070b);
        if (this.m > 0) {
            this.p.remove(interfaceC0070b);
        }
    }

    public void m(int i, int i2) {
        if (i < 0 || i >= i2) {
            BaseInputConnection.removeComposingSpans(this);
        } else {
            this.x.setComposingRegion(i, i2);
        }
    }

    public void n(a01.e eVar) {
        b();
        replace(0, length(), (CharSequence) eVar.a);
        if (eVar.c()) {
            Selection.setSelection(this, eVar.b, eVar.c);
        } else {
            Selection.removeSelection(this);
        }
        m(eVar.d, eVar.e);
        c();
        d();
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public void setSpan(Object obj, int i, int i2, int i3) {
        super.setSpan(obj, i, i2, i3);
        this.q.add(new zz0(toString(), i(), h(), g(), f()));
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public String toString() {
        String str = this.r;
        if (str != null) {
            return str;
        }
        String spannableStringBuilder = super.toString();
        this.r = spannableStringBuilder;
        return spannableStringBuilder;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public SpannableStringBuilder replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
        boolean z;
        boolean z2;
        if (this.n > 0) {
            ha0.b("ListenableEditingState", "editing state should not be changed in a listener callback");
        }
        String bVar = toString();
        int i5 = i2 - i;
        boolean z3 = i5 != i4 - i3;
        for (int i6 = 0; i6 < i5 && !z3; i6++) {
            z3 |= charAt(i + i6) != charSequence.charAt(i3 + i6);
        }
        if (z3) {
            this.r = null;
        }
        int i7 = i();
        int h = h();
        int g = g();
        int f = f();
        SpannableStringBuilder replace = super.replace(i, i2, charSequence, i3, i4);
        boolean z4 = z3;
        this.q.add(new zz0(bVar, i, i2, charSequence, i(), h(), g(), f()));
        if (this.m > 0) {
            return replace;
        }
        boolean z5 = (i() == i7 && h() == h) ? false : true;
        if (g() == g && f() == f) {
            z = z4;
            z2 = false;
        } else {
            z = z4;
            z2 = true;
        }
        k(z, z5, z2);
        return replace;
    }
}
