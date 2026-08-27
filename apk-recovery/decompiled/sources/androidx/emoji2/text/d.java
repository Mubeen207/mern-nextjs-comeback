package androidx.emoji2.text;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import androidx.appcompat.view.menu.c31;
import androidx.appcompat.view.menu.vn;
import androidx.appcompat.view.menu.y31;
import androidx.emoji2.text.c;
import androidx.emoji2.text.f;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
/* loaded from: classes.dex */
public final class d {
    public final c.j a;
    public final f b;
    public c.e c;
    public final boolean d;
    public final int[] e;

    /* loaded from: classes.dex */
    public static final class a {
        public static int a(CharSequence charSequence, int i, int i2) {
            int length = charSequence.length();
            if (i < 0 || length < i || i2 < 0) {
                return -1;
            }
            while (true) {
                boolean z = false;
                while (i2 != 0) {
                    i--;
                    if (i < 0) {
                        return z ? -1 : 0;
                    }
                    char charAt = charSequence.charAt(i);
                    if (z) {
                        if (!Character.isHighSurrogate(charAt)) {
                            return -1;
                        }
                        i2--;
                    } else if (!Character.isSurrogate(charAt)) {
                        i2--;
                    } else if (Character.isHighSurrogate(charAt)) {
                        return -1;
                    } else {
                        z = true;
                    }
                }
                return i;
            }
        }

        public static int b(CharSequence charSequence, int i, int i2) {
            int length = charSequence.length();
            if (i < 0 || length < i || i2 < 0) {
                return -1;
            }
            while (true) {
                boolean z = false;
                while (i2 != 0) {
                    if (i >= length) {
                        if (z) {
                            return -1;
                        }
                        return length;
                    }
                    char charAt = charSequence.charAt(i);
                    if (z) {
                        if (!Character.isLowSurrogate(charAt)) {
                            return -1;
                        }
                        i2--;
                        i++;
                    } else if (!Character.isSurrogate(charAt)) {
                        i2--;
                        i++;
                    } else if (Character.isLowSurrogate(charAt)) {
                        return -1;
                    } else {
                        i++;
                        z = true;
                    }
                }
                return i;
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b implements c {
        public y31 a;
        public final c.j b;

        public b(y31 y31Var, c.j jVar) {
            this.a = y31Var;
            this.b = jVar;
        }

        @Override // androidx.emoji2.text.d.c
        public boolean b(CharSequence charSequence, int i, int i2, c31 c31Var) {
            if (c31Var.k()) {
                return true;
            }
            if (this.a == null) {
                this.a = new y31(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
            }
            this.a.setSpan(this.b.a(c31Var), i, i2, 33);
            return true;
        }

        @Override // androidx.emoji2.text.d.c
        /* renamed from: c */
        public y31 a() {
            return this.a;
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        Object a();

        boolean b(CharSequence charSequence, int i, int i2, c31 c31Var);
    }

    /* renamed from: androidx.emoji2.text.d$d  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0042d implements c {
        public final String a;

        public C0042d(String str) {
            this.a = str;
        }

        @Override // androidx.emoji2.text.d.c
        public boolean b(CharSequence charSequence, int i, int i2, c31 c31Var) {
            if (TextUtils.equals(charSequence.subSequence(i, i2), this.a)) {
                c31Var.l(true);
                return false;
            }
            return true;
        }

        @Override // androidx.emoji2.text.d.c
        /* renamed from: c */
        public C0042d a() {
            return this;
        }
    }

    /* loaded from: classes.dex */
    public static final class e {
        public int a = 1;
        public final f.a b;
        public f.a c;
        public f.a d;
        public int e;
        public int f;
        public final boolean g;
        public final int[] h;

        public e(f.a aVar, boolean z, int[] iArr) {
            this.b = aVar;
            this.c = aVar;
            this.g = z;
            this.h = iArr;
        }

        public static boolean d(int i) {
            return i == 65039;
        }

        public static boolean f(int i) {
            return i == 65038;
        }

        public int a(int i) {
            f.a a = this.c.a(i);
            int i2 = 2;
            if (this.a != 2) {
                if (a == null) {
                    i2 = g();
                } else {
                    this.a = 2;
                    this.c = a;
                    this.f = 1;
                }
            } else if (a != null) {
                this.c = a;
                this.f++;
            } else if (f(i)) {
                i2 = g();
            } else if (!d(i)) {
                if (this.c.b() != null) {
                    i2 = 3;
                    if (this.f != 1) {
                        this.d = this.c;
                        g();
                    } else if (h()) {
                        this.d = this.c;
                        g();
                    } else {
                        i2 = g();
                    }
                } else {
                    i2 = g();
                }
            }
            this.e = i;
            return i2;
        }

        public c31 b() {
            return this.c.b();
        }

        public c31 c() {
            return this.d.b();
        }

        public boolean e() {
            return this.a == 2 && this.c.b() != null && (this.f > 1 || h());
        }

        public final int g() {
            this.a = 1;
            this.c = this.b;
            this.f = 0;
            return 1;
        }

        public final boolean h() {
            if (this.c.b().j() || d(this.e)) {
                return true;
            }
            if (this.g) {
                if (this.h == null) {
                    return true;
                }
                if (Arrays.binarySearch(this.h, this.c.b().b(0)) < 0) {
                    return true;
                }
            }
            return false;
        }
    }

    public d(f fVar, c.j jVar, c.e eVar, boolean z, int[] iArr, Set set) {
        this.a = jVar;
        this.b = fVar;
        this.c = eVar;
        this.d = z;
        this.e = iArr;
        g(set);
    }

    public static boolean a(Editable editable, KeyEvent keyEvent, boolean z) {
        vn[] vnVarArr;
        if (f(keyEvent)) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (!e(selectionStart, selectionEnd) && (vnVarArr = (vn[]) editable.getSpans(selectionStart, selectionEnd, vn.class)) != null && vnVarArr.length > 0) {
            for (vn vnVar : vnVarArr) {
                int spanStart = editable.getSpanStart(vnVar);
                int spanEnd = editable.getSpanEnd(vnVar);
                if ((z && spanStart == selectionStart) || ((!z && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean b(InputConnection inputConnection, Editable editable, int i, int i2, boolean z) {
        int max;
        int min;
        if (editable != null && inputConnection != null && i >= 0 && i2 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (e(selectionStart, selectionEnd)) {
                return false;
            }
            if (z) {
                max = a.a(editable, selectionStart, Math.max(i, 0));
                min = a.b(editable, selectionEnd, Math.max(i2, 0));
                if (max == -1 || min == -1) {
                    return false;
                }
            } else {
                max = Math.max(selectionStart - i, 0);
                min = Math.min(selectionEnd + i2, editable.length());
            }
            vn[] vnVarArr = (vn[]) editable.getSpans(max, min, vn.class);
            if (vnVarArr != null && vnVarArr.length > 0) {
                for (vn vnVar : vnVarArr) {
                    int spanStart = editable.getSpanStart(vnVar);
                    int spanEnd = editable.getSpanEnd(vnVar);
                    max = Math.min(spanStart, max);
                    min = Math.max(spanEnd, min);
                }
                int max2 = Math.max(max, 0);
                int min2 = Math.min(min, editable.length());
                inputConnection.beginBatchEdit();
                editable.delete(max2, min2);
                inputConnection.endBatchEdit();
                return true;
            }
        }
        return false;
    }

    public static boolean c(Editable editable, int i, KeyEvent keyEvent) {
        boolean a2;
        if (i != 67) {
            if (i == 112) {
                a2 = a(editable, keyEvent, true);
            }
            return false;
        }
        a2 = a(editable, keyEvent, false);
        if (a2) {
            MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
            return true;
        }
        return false;
    }

    public static boolean e(int i, int i2) {
        return i == -1 || i2 == -1 || i != i2;
    }

    public static boolean f(KeyEvent keyEvent) {
        return !KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState());
    }

    public final boolean d(CharSequence charSequence, int i, int i2, c31 c31Var) {
        if (c31Var.d() == 0) {
            c31Var.m(this.c.a(charSequence, i, i2, c31Var.h()));
        }
        return c31Var.d() == 2;
    }

    public final void g(Set set) {
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            i(str, 0, str.length(), 1, true, new C0042d(str));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0049 A[Catch: all -> 0x002a, TryCatch #0 {all -> 0x002a, blocks: (B:7:0x000e, B:10:0x0013, B:12:0x0017, B:14:0x0024, B:21:0x003a, B:23:0x0042, B:25:0x0045, B:27:0x0049, B:29:0x0055, B:30:0x0058, B:33:0x0066, B:39:0x0074, B:40:0x0080, B:42:0x0094, B:18:0x002f), top: B:55:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0094 A[Catch: all -> 0x002a, TRY_LEAVE, TryCatch #0 {all -> 0x002a, blocks: (B:7:0x000e, B:10:0x0013, B:12:0x0017, B:14:0x0024, B:21:0x003a, B:23:0x0042, B:25:0x0045, B:27:0x0049, B:29:0x0055, B:30:0x0058, B:33:0x0066, B:39:0x0074, B:40:0x0080, B:42:0x0094, B:18:0x002f), top: B:55:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.CharSequence h(java.lang.CharSequence r11, int r12, int r13, int r14, boolean r15) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof androidx.appcompat.view.menu.fw0
            if (r0 == 0) goto La
            r1 = r11
            androidx.appcompat.view.menu.fw0 r1 = (androidx.appcompat.view.menu.fw0) r1
            r1.a()
        La:
            java.lang.Class<androidx.appcompat.view.menu.vn> r1 = androidx.appcompat.view.menu.vn.class
            if (r0 != 0) goto L2f
            boolean r2 = r11 instanceof android.text.Spannable     // Catch: java.lang.Throwable -> L2a
            if (r2 == 0) goto L13
            goto L2f
        L13:
            boolean r2 = r11 instanceof android.text.Spanned     // Catch: java.lang.Throwable -> L2a
            if (r2 == 0) goto L2d
            r2 = r11
            android.text.Spanned r2 = (android.text.Spanned) r2     // Catch: java.lang.Throwable -> L2a
            int r3 = r12 + (-1)
            int r4 = r13 + 1
            int r2 = r2.nextSpanTransition(r3, r4, r1)     // Catch: java.lang.Throwable -> L2a
            if (r2 > r13) goto L2d
            androidx.appcompat.view.menu.y31 r2 = new androidx.appcompat.view.menu.y31     // Catch: java.lang.Throwable -> L2a
            r2.<init>(r11)     // Catch: java.lang.Throwable -> L2a
            goto L37
        L2a:
            r12 = move-exception
            goto Lb2
        L2d:
            r2 = 0
            goto L37
        L2f:
            androidx.appcompat.view.menu.y31 r2 = new androidx.appcompat.view.menu.y31     // Catch: java.lang.Throwable -> L2a
            r3 = r11
            android.text.Spannable r3 = (android.text.Spannable) r3     // Catch: java.lang.Throwable -> L2a
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L2a
        L37:
            r3 = 0
            if (r2 == 0) goto L63
            java.lang.Object[] r4 = r2.getSpans(r12, r13, r1)     // Catch: java.lang.Throwable -> L2a
            androidx.appcompat.view.menu.vn[] r4 = (androidx.appcompat.view.menu.vn[]) r4     // Catch: java.lang.Throwable -> L2a
            if (r4 == 0) goto L63
            int r5 = r4.length     // Catch: java.lang.Throwable -> L2a
            if (r5 <= 0) goto L63
            int r5 = r4.length     // Catch: java.lang.Throwable -> L2a
            r6 = r3
        L47:
            if (r6 >= r5) goto L63
            r7 = r4[r6]     // Catch: java.lang.Throwable -> L2a
            int r8 = r2.getSpanStart(r7)     // Catch: java.lang.Throwable -> L2a
            int r9 = r2.getSpanEnd(r7)     // Catch: java.lang.Throwable -> L2a
            if (r8 == r13) goto L58
            r2.removeSpan(r7)     // Catch: java.lang.Throwable -> L2a
        L58:
            int r12 = java.lang.Math.min(r8, r12)     // Catch: java.lang.Throwable -> L2a
            int r13 = java.lang.Math.max(r9, r13)     // Catch: java.lang.Throwable -> L2a
            int r6 = r6 + 1
            goto L47
        L63:
            r4 = r13
            if (r12 == r4) goto La9
            int r13 = r11.length()     // Catch: java.lang.Throwable -> L2a
            if (r12 < r13) goto L6d
            goto La9
        L6d:
            r13 = 2147483647(0x7fffffff, float:NaN)
            if (r14 == r13) goto L80
            if (r2 == 0) goto L80
            int r13 = r2.length()     // Catch: java.lang.Throwable -> L2a
            java.lang.Object[] r13 = r2.getSpans(r3, r13, r1)     // Catch: java.lang.Throwable -> L2a
            androidx.appcompat.view.menu.vn[] r13 = (androidx.appcompat.view.menu.vn[]) r13     // Catch: java.lang.Throwable -> L2a
            int r13 = r13.length     // Catch: java.lang.Throwable -> L2a
            int r14 = r14 - r13
        L80:
            r5 = r14
            androidx.emoji2.text.d$b r7 = new androidx.emoji2.text.d$b     // Catch: java.lang.Throwable -> L2a
            androidx.emoji2.text.c$j r13 = r10.a     // Catch: java.lang.Throwable -> L2a
            r7.<init>(r2, r13)     // Catch: java.lang.Throwable -> L2a
            r1 = r10
            r2 = r11
            r3 = r12
            r6 = r15
            java.lang.Object r12 = r1.i(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L2a
            androidx.appcompat.view.menu.y31 r12 = (androidx.appcompat.view.menu.y31) r12     // Catch: java.lang.Throwable -> L2a
            if (r12 == 0) goto La0
            android.text.Spannable r12 = r12.b()     // Catch: java.lang.Throwable -> L2a
            if (r0 == 0) goto L9f
            androidx.appcompat.view.menu.fw0 r11 = (androidx.appcompat.view.menu.fw0) r11
            r11.d()
        L9f:
            return r12
        La0:
            if (r0 == 0) goto La8
            r12 = r11
            androidx.appcompat.view.menu.fw0 r12 = (androidx.appcompat.view.menu.fw0) r12
            r12.d()
        La8:
            return r11
        La9:
            if (r0 == 0) goto Lb1
            r12 = r11
            androidx.appcompat.view.menu.fw0 r12 = (androidx.appcompat.view.menu.fw0) r12
            r12.d()
        Lb1:
            return r11
        Lb2:
            if (r0 == 0) goto Lb9
            androidx.appcompat.view.menu.fw0 r11 = (androidx.appcompat.view.menu.fw0) r11
            r11.d()
        Lb9:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.d.h(java.lang.CharSequence, int, int, int, boolean):java.lang.CharSequence");
    }

    public final Object i(CharSequence charSequence, int i, int i2, int i3, boolean z, c cVar) {
        int i4;
        e eVar = new e(this.b.f(), this.d, this.e);
        int i5 = 0;
        boolean z2 = true;
        int codePointAt = Character.codePointAt(charSequence, i);
        loop0: while (true) {
            i4 = i;
            while (i < i2 && i5 < i3 && z2) {
                int a2 = eVar.a(codePointAt);
                if (a2 == 1) {
                    i4 += Character.charCount(Character.codePointAt(charSequence, i4));
                    if (i4 < i2) {
                        codePointAt = Character.codePointAt(charSequence, i4);
                    }
                    i = i4;
                } else if (a2 == 2) {
                    i += Character.charCount(codePointAt);
                    if (i < i2) {
                        codePointAt = Character.codePointAt(charSequence, i);
                    }
                } else if (a2 == 3) {
                    if (z || !d(charSequence, i4, i, eVar.c())) {
                        z2 = cVar.b(charSequence, i4, i, eVar.c());
                        i5++;
                    }
                }
            }
        }
        if (eVar.e() && i5 < i3 && z2 && (z || !d(charSequence, i4, i, eVar.b()))) {
            cVar.b(charSequence, i4, i, eVar.b());
        }
        return cVar.a();
    }
}
