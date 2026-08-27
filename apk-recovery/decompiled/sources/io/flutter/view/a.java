package io.flutter.view;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.pm.PackageParser;
import android.database.ContentObserver;
import android.graphics.Rect;
import android.net.Uri;
import android.opengl.Matrix;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.provider.Settings;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.LocaleSpan;
import android.text.style.TtsSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.appcompat.view.menu.ha0;
import androidx.appcompat.view.menu.r61;
import androidx.appcompat.view.menu.uj0;
import androidx.appcompat.view.menu.z;
import androidx.appcompat.view.menu.zi0;
import io.flutter.view.a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public class a extends AccessibilityNodeProvider {
    public final View a;
    public final z b;
    public final AccessibilityManager c;
    public final AccessibilityViewEmbedder d;
    public final zi0 e;
    public final ContentResolver f;
    public final Map g;
    public final Map h;
    public l i;
    public Integer j;
    public Integer k;
    public int l;
    public l m;
    public l n;
    public l o;
    public final List p;
    public int q;
    public Integer r;
    public k s;
    public boolean t;
    public boolean u;
    public final z.b v;
    public final AccessibilityManager.AccessibilityStateChangeListener w;
    public final AccessibilityManager.TouchExplorationStateChangeListener x;
    public final ContentObserver y;
    public static final int z = ((g.SCROLL_RIGHT.m | g.SCROLL_LEFT.m) | g.SCROLL_UP.m) | g.SCROLL_DOWN.m;
    public static final int A = ((((((((((i.HAS_CHECKED_STATE.m | i.IS_CHECKED.m) | i.IS_SELECTED.m) | i.IS_TEXT_FIELD.m) | i.IS_FOCUSED.m) | i.HAS_ENABLED_STATE.m) | i.IS_ENABLED.m) | i.IS_IN_MUTUALLY_EXCLUSIVE_GROUP.m) | i.HAS_TOGGLED_STATE.m) | i.IS_TOGGLED.m) | i.IS_FOCUSABLE.m) | i.IS_SLIDER.m;
    public static int B = 267386881;
    public static int C = (g.DID_GAIN_ACCESSIBILITY_FOCUS.m & g.DID_LOSE_ACCESSIBILITY_FOCUS.m) & g.SHOW_ON_SCREEN.m;

    /* renamed from: io.flutter.view.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0072a implements z.b {
        public C0072a() {
        }

        @Override // androidx.appcompat.view.menu.z.b
        public void a(String str) {
            a.this.a.announceForAccessibility(str);
        }

        @Override // io.flutter.embedding.engine.FlutterJNI.a
        public void b(ByteBuffer byteBuffer, String[] strArr, ByteBuffer[] byteBufferArr) {
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            for (ByteBuffer byteBuffer2 : byteBufferArr) {
                byteBuffer2.order(ByteOrder.LITTLE_ENDIAN);
            }
            a.this.a0(byteBuffer, strArr, byteBufferArr);
        }

        @Override // io.flutter.embedding.engine.FlutterJNI.a
        public void c(ByteBuffer byteBuffer, String[] strArr) {
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            a.this.Z(byteBuffer, strArr);
        }

        @Override // androidx.appcompat.view.menu.z.b
        public void d(String str) {
        }

        @Override // androidx.appcompat.view.menu.z.b
        public void e(int i) {
            a.this.Q(i, 8);
        }

        @Override // androidx.appcompat.view.menu.z.b
        public void f(int i) {
            a.this.Q(i, 2);
        }

        @Override // androidx.appcompat.view.menu.z.b
        public void g(int i) {
            a.this.Q(i, 1);
        }
    }

    /* loaded from: classes.dex */
    public class b implements AccessibilityManager.AccessibilityStateChangeListener {
        public b() {
        }

        @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
        public void onAccessibilityStateChanged(boolean z) {
            if (a.this.u) {
                return;
            }
            if (z) {
                a.this.b.g(a.this.v);
                a.this.b.e();
            } else {
                a.this.V(false);
                a.this.b.g(null);
                a.this.b.d();
            }
            if (a.this.s != null) {
                a.this.s.a(z, a.this.c.isTouchExplorationEnabled());
            }
        }
    }

    /* loaded from: classes.dex */
    public class c extends ContentObserver {
        public c(Handler handler) {
            super(handler);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z) {
            onChange(z, null);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z, Uri uri) {
            if (a.this.u) {
                return;
            }
            if (Settings.Global.getFloat(a.this.f, "transition_animation_scale", 1.0f) == 0.0f) {
                a.f(a.this, f.DISABLE_ANIMATIONS.m);
            } else {
                a.e(a.this, ~f.DISABLE_ANIMATIONS.m);
            }
            a.this.S();
        }
    }

    /* loaded from: classes.dex */
    public class d implements AccessibilityManager.TouchExplorationStateChangeListener {
        public final /* synthetic */ AccessibilityManager a;

        public d(AccessibilityManager accessibilityManager) {
            this.a = accessibilityManager;
        }

        @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
        public void onTouchExplorationStateChanged(boolean z) {
            if (a.this.u) {
                return;
            }
            if (!z) {
                a.this.V(false);
                a.this.K();
            }
            if (a.this.s != null) {
                a.this.s.a(this.a.isEnabled(), z);
            }
        }
    }

    /* loaded from: classes.dex */
    public static /* synthetic */ class e {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[o.values().length];
            a = iArr;
            try {
                iArr[o.SPELLOUT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[o.LOCALE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* loaded from: classes.dex */
    public enum f {
        ACCESSIBLE_NAVIGATION(1),
        INVERT_COLORS(2),
        DISABLE_ANIMATIONS(4),
        BOLD_TEXT(8),
        REDUCE_MOTION(16),
        HIGH_CONTRAST(32),
        ON_OFF_SWITCH_LABELS(64);
        
        public final int m;

        f(int i) {
            this.m = i;
        }
    }

    /* loaded from: classes.dex */
    public enum g {
        TAP(1),
        LONG_PRESS(2),
        SCROLL_LEFT(4),
        SCROLL_RIGHT(8),
        SCROLL_UP(16),
        SCROLL_DOWN(32),
        INCREASE(64),
        DECREASE(PackageParser.PARSE_IS_PRIVILEGED),
        SHOW_ON_SCREEN(PackageParser.PARSE_COLLECT_CERTIFICATES),
        MOVE_CURSOR_FORWARD_BY_CHARACTER(PackageParser.PARSE_TRUSTED_OVERLAY),
        MOVE_CURSOR_BACKWARD_BY_CHARACTER(1024),
        SET_SELECTION(2048),
        COPY(4096),
        CUT(8192),
        PASTE(16384),
        DID_GAIN_ACCESSIBILITY_FOCUS(32768),
        DID_LOSE_ACCESSIBILITY_FOCUS(65536),
        CUSTOM_ACTION(131072),
        DISMISS(262144),
        MOVE_CURSOR_FORWARD_BY_WORD(524288),
        MOVE_CURSOR_BACKWARD_BY_WORD(1048576),
        SET_TEXT(2097152),
        FOCUS(4194304);
        
        public final int m;

        g(int i) {
            this.m = i;
        }
    }

    /* loaded from: classes.dex */
    public static class h {
        public int a = -1;
        public int b = -1;
        public int c = -1;
        public String d;
        public String e;
    }

    /* loaded from: classes.dex */
    public enum i {
        HAS_CHECKED_STATE(1),
        IS_CHECKED(2),
        IS_SELECTED(4),
        IS_BUTTON(8),
        IS_TEXT_FIELD(16),
        IS_FOCUSED(32),
        HAS_ENABLED_STATE(64),
        IS_ENABLED(PackageParser.PARSE_IS_PRIVILEGED),
        IS_IN_MUTUALLY_EXCLUSIVE_GROUP(PackageParser.PARSE_COLLECT_CERTIFICATES),
        IS_HEADER(PackageParser.PARSE_TRUSTED_OVERLAY),
        IS_OBSCURED(1024),
        SCOPES_ROUTE(2048),
        NAMES_ROUTE(4096),
        IS_HIDDEN(8192),
        IS_IMAGE(16384),
        IS_LIVE_REGION(32768),
        HAS_TOGGLED_STATE(65536),
        IS_TOGGLED(131072),
        HAS_IMPLICIT_SCROLLING(262144),
        IS_MULTILINE(524288),
        IS_READ_ONLY(1048576),
        IS_FOCUSABLE(2097152),
        IS_LINK(4194304),
        IS_SLIDER(8388608),
        IS_KEYBOARD_KEY(16777216),
        IS_CHECK_STATE_MIXED(33554432),
        HAS_EXPANDED_STATE(67108864),
        IS_EXPANDED(134217728);
        
        public final int m;

        i(int i) {
            this.m = i;
        }
    }

    /* loaded from: classes.dex */
    public static class j extends n {
        public String d;

        public j() {
            super(null);
        }

        public /* synthetic */ j(C0072a c0072a) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public interface k {
        void a(boolean z, boolean z2);
    }

    /* loaded from: classes.dex */
    public static class l {
        public p B;
        public int D;
        public int E;
        public int F;
        public int G;
        public float H;
        public float I;
        public float J;
        public String K;
        public String L;
        public float M;
        public float N;
        public float O;
        public float P;
        public float[] Q;
        public l R;
        public List U;
        public h V;
        public h W;
        public float[] Y;
        public final a a;
        public float[] a0;
        public Rect b0;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;
        public int h;
        public int i;
        public int j;
        public int k;
        public float l;
        public float m;
        public float n;
        public String o;
        public String p;
        public List q;
        public String r;
        public List s;
        public String t;
        public List u;
        public String v;
        public List w;
        public String x;
        public List y;
        public String z;
        public int b = -1;
        public int A = -1;
        public boolean C = false;
        public List S = new ArrayList();
        public List T = new ArrayList();
        public boolean X = true;
        public boolean Z = true;

        public l(a aVar) {
            this.a = aVar;
        }

        public static boolean C0(l lVar, uj0 uj0Var) {
            return (lVar == null || lVar.l0(uj0Var) == null) ? false : true;
        }

        public static /* synthetic */ int n(l lVar, int i) {
            int i2 = lVar.h + i;
            lVar.h = i2;
            return i2;
        }

        public static /* synthetic */ int o(l lVar, int i) {
            int i2 = lVar.h - i;
            lVar.h = i2;
            return i2;
        }

        public final float A0(float f, float f2, float f3, float f4) {
            return Math.max(f, Math.max(f2, Math.max(f3, f4)));
        }

        public final float B0(float f, float f2, float f3, float f4) {
            return Math.min(f, Math.min(f2, Math.min(f3, f4)));
        }

        public final void D0(float[] fArr, float[] fArr2, float[] fArr3) {
            Matrix.multiplyMV(fArr, 0, fArr2, 0, fArr3, 0);
            float f = fArr[3];
            fArr[0] = fArr[0] / f;
            fArr[1] = fArr[1] / f;
            fArr[2] = fArr[2] / f;
            fArr[3] = 0.0f;
        }

        public final void E0(float[] fArr, Set set, boolean z) {
            set.add(this);
            if (this.Z) {
                z = true;
            }
            if (z) {
                if (this.a0 == null) {
                    this.a0 = new float[16];
                }
                if (this.Q == null) {
                    this.Q = new float[16];
                }
                Matrix.multiplyMM(this.a0, 0, fArr, 0, this.Q, 0);
                float[] fArr2 = {this.M, this.N, 0.0f, 1.0f};
                float[] fArr3 = new float[4];
                float[] fArr4 = new float[4];
                float[] fArr5 = new float[4];
                float[] fArr6 = new float[4];
                D0(fArr3, this.a0, fArr2);
                fArr2[0] = this.O;
                fArr2[1] = this.N;
                D0(fArr4, this.a0, fArr2);
                fArr2[0] = this.O;
                fArr2[1] = this.P;
                D0(fArr5, this.a0, fArr2);
                fArr2[0] = this.M;
                fArr2[1] = this.P;
                D0(fArr6, this.a0, fArr2);
                if (this.b0 == null) {
                    this.b0 = new Rect();
                }
                this.b0.set(Math.round(B0(fArr3[0], fArr4[0], fArr5[0], fArr6[0])), Math.round(B0(fArr3[1], fArr4[1], fArr5[1], fArr6[1])), Math.round(A0(fArr3[0], fArr4[0], fArr5[0], fArr6[0])), Math.round(A0(fArr3[1], fArr4[1], fArr5[1], fArr6[1])));
                this.Z = false;
            }
            int i = -1;
            for (l lVar : this.S) {
                lVar.A = i;
                i = lVar.b;
                lVar.E0(this.a0, set, z);
            }
        }

        public final void F0(ByteBuffer byteBuffer, String[] strArr, ByteBuffer[] byteBufferArr) {
            this.C = true;
            this.K = this.r;
            this.L = this.p;
            this.D = this.c;
            this.E = this.d;
            this.F = this.g;
            this.G = this.h;
            this.H = this.l;
            this.I = this.m;
            this.J = this.n;
            this.c = byteBuffer.getInt();
            this.d = byteBuffer.getInt();
            this.e = byteBuffer.getInt();
            this.f = byteBuffer.getInt();
            this.g = byteBuffer.getInt();
            this.h = byteBuffer.getInt();
            this.i = byteBuffer.getInt();
            this.j = byteBuffer.getInt();
            this.k = byteBuffer.getInt();
            this.l = byteBuffer.getFloat();
            this.m = byteBuffer.getFloat();
            this.n = byteBuffer.getFloat();
            int i = byteBuffer.getInt();
            this.o = i == -1 ? null : strArr[i];
            int i2 = byteBuffer.getInt();
            this.p = i2 == -1 ? null : strArr[i2];
            this.q = q0(byteBuffer, byteBufferArr);
            int i3 = byteBuffer.getInt();
            this.r = i3 == -1 ? null : strArr[i3];
            this.s = q0(byteBuffer, byteBufferArr);
            int i4 = byteBuffer.getInt();
            this.t = i4 == -1 ? null : strArr[i4];
            this.u = q0(byteBuffer, byteBufferArr);
            int i5 = byteBuffer.getInt();
            this.v = i5 == -1 ? null : strArr[i5];
            this.w = q0(byteBuffer, byteBufferArr);
            int i6 = byteBuffer.getInt();
            this.x = i6 == -1 ? null : strArr[i6];
            this.y = q0(byteBuffer, byteBufferArr);
            int i7 = byteBuffer.getInt();
            this.z = i7 == -1 ? null : strArr[i7];
            this.B = p.e(byteBuffer.getInt());
            this.M = byteBuffer.getFloat();
            this.N = byteBuffer.getFloat();
            this.O = byteBuffer.getFloat();
            this.P = byteBuffer.getFloat();
            if (this.Q == null) {
                this.Q = new float[16];
            }
            for (int i8 = 0; i8 < 16; i8++) {
                this.Q[i8] = byteBuffer.getFloat();
            }
            this.X = true;
            this.Z = true;
            int i9 = byteBuffer.getInt();
            this.S.clear();
            this.T.clear();
            for (int i10 = 0; i10 < i9; i10++) {
                l w = this.a.w(byteBuffer.getInt());
                w.R = this;
                this.S.add(w);
            }
            for (int i11 = 0; i11 < i9; i11++) {
                l w2 = this.a.w(byteBuffer.getInt());
                w2.R = this;
                this.T.add(w2);
            }
            int i12 = byteBuffer.getInt();
            if (i12 == 0) {
                this.U = null;
                return;
            }
            List list = this.U;
            if (list == null) {
                this.U = new ArrayList(i12);
            } else {
                list.clear();
            }
            for (int i13 = 0; i13 < i12; i13++) {
                h v = this.a.v(byteBuffer.getInt());
                if (v.c == g.TAP.m) {
                    this.V = v;
                } else if (v.c == g.LONG_PRESS.m) {
                    this.W = v;
                } else {
                    this.U.add(v);
                }
                this.U.add(v);
            }
        }

        public final void g0(List list) {
            if (x0(i.SCOPES_ROUTE)) {
                list.add(this);
            }
            for (l lVar : this.S) {
                lVar.g0(list);
            }
        }

        public final SpannableString h0(String str, List list) {
            if (str == null) {
                return null;
            }
            SpannableString spannableString = new SpannableString(str);
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    n nVar = (n) it.next();
                    int i = e.a[nVar.c.ordinal()];
                    if (i == 1) {
                        spannableString.setSpan(new TtsSpan.Builder("android.type.verbatim").build(), nVar.a, nVar.b, 0);
                    } else if (i == 2) {
                        spannableString.setSpan(new LocaleSpan(Locale.forLanguageTag(((j) nVar).d)), nVar.a, nVar.b, 0);
                    }
                }
            }
            return spannableString;
        }

        public final boolean i0() {
            String str;
            String str2 = this.p;
            if (str2 == null && this.L == null) {
                return false;
            }
            return str2 == null || (str = this.L) == null || !str2.equals(str);
        }

        public final boolean j0() {
            return (Float.isNaN(this.l) || Float.isNaN(this.H) || this.H == this.l) ? false : true;
        }

        public final void k0() {
            if (this.X) {
                this.X = false;
                if (this.Y == null) {
                    this.Y = new float[16];
                }
                if (Matrix.invertM(this.Y, 0, this.Q, 0)) {
                    return;
                }
                Arrays.fill(this.Y, 0.0f);
            }
        }

        public final l l0(uj0 uj0Var) {
            for (l lVar = this.R; lVar != null; lVar = lVar.R) {
                if (uj0Var.test(lVar)) {
                    return lVar;
                }
            }
            return null;
        }

        public final Rect m0() {
            return this.b0;
        }

        public final CharSequence n0() {
            return h0(this.x, this.y);
        }

        public final CharSequence o0() {
            return h0(this.p, this.q);
        }

        public final String p0() {
            String str;
            if (!x0(i.NAMES_ROUTE) || (str = this.p) == null || str.isEmpty()) {
                for (l lVar : this.S) {
                    String p0 = lVar.p0();
                    if (p0 != null && !p0.isEmpty()) {
                        return p0;
                    }
                }
                return null;
            }
            return this.p;
        }

        public final List q0(ByteBuffer byteBuffer, ByteBuffer[] byteBufferArr) {
            int i = byteBuffer.getInt();
            if (i == -1) {
                return null;
            }
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 < i; i2++) {
                int i3 = byteBuffer.getInt();
                int i4 = byteBuffer.getInt();
                o oVar = o.values()[byteBuffer.getInt()];
                int i5 = e.a[oVar.ordinal()];
                if (i5 == 1) {
                    byteBuffer.getInt();
                    m mVar = new m(null);
                    mVar.a = i3;
                    mVar.b = i4;
                    mVar.c = oVar;
                    arrayList.add(mVar);
                } else if (i5 == 2) {
                    ByteBuffer byteBuffer2 = byteBufferArr[byteBuffer.getInt()];
                    j jVar = new j(null);
                    jVar.a = i3;
                    jVar.b = i4;
                    jVar.c = oVar;
                    jVar.d = Charset.forName("UTF-8").decode(byteBuffer2).toString();
                    arrayList.add(jVar);
                }
            }
            return arrayList;
        }

        public final CharSequence r0() {
            CharSequence[] charSequenceArr = {o0(), n0()};
            CharSequence charSequence = null;
            for (int i = 0; i < 2; i++) {
                CharSequence charSequence2 = charSequenceArr[i];
                if (charSequence2 != null && charSequence2.length() > 0) {
                    charSequence = (charSequence == null || charSequence.length() == 0) ? charSequence2 : TextUtils.concat(charSequence, ", ", charSequence2);
                }
            }
            return charSequence;
        }

        public final CharSequence s0() {
            return h0(this.r, this.s);
        }

        public final CharSequence t0() {
            CharSequence[] charSequenceArr = {s0(), o0(), n0()};
            CharSequence charSequence = null;
            for (int i = 0; i < 3; i++) {
                CharSequence charSequence2 = charSequenceArr[i];
                if (charSequence2 != null && charSequence2.length() > 0) {
                    charSequence = (charSequence == null || charSequence.length() == 0) ? charSequence2 : TextUtils.concat(charSequence, ", ", charSequence2);
                }
            }
            return charSequence;
        }

        public final boolean u0(g gVar) {
            return (gVar.m & this.E) != 0;
        }

        public final boolean v0(i iVar) {
            return (iVar.m & this.D) != 0;
        }

        public final boolean w0(g gVar) {
            return (gVar.m & this.d) != 0;
        }

        public final boolean x0(i iVar) {
            return (iVar.m & this.c) != 0;
        }

        public final l y0(float[] fArr, boolean z) {
            float f = fArr[3];
            boolean z2 = false;
            float f2 = fArr[0] / f;
            float f3 = fArr[1] / f;
            if (f2 < this.M || f2 >= this.O || f3 < this.N || f3 >= this.P) {
                return null;
            }
            float[] fArr2 = new float[4];
            for (l lVar : this.T) {
                if (!lVar.x0(i.IS_HIDDEN)) {
                    lVar.k0();
                    Matrix.multiplyMV(fArr2, 0, lVar.Y, 0, fArr, 0);
                    l y0 = lVar.y0(fArr2, z);
                    if (y0 != null) {
                        return y0;
                    }
                }
            }
            if (z && this.i != -1) {
                z2 = true;
            }
            if (z0() || z2) {
                return this;
            }
            return null;
        }

        public final boolean z0() {
            String str;
            String str2;
            String str3;
            if (x0(i.SCOPES_ROUTE)) {
                return false;
            }
            if (x0(i.IS_FOCUSABLE)) {
                return true;
            }
            return ((this.d & (~a.z)) == 0 && (this.c & a.A) == 0 && ((str = this.p) == null || str.isEmpty()) && (((str2 = this.r) == null || str2.isEmpty()) && ((str3 = this.x) == null || str3.isEmpty()))) ? false : true;
        }
    }

    /* loaded from: classes.dex */
    public static class m extends n {
        public m() {
            super(null);
        }

        public /* synthetic */ m(C0072a c0072a) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public static class n {
        public int a;
        public int b;
        public o c;

        public n() {
        }

        public /* synthetic */ n(C0072a c0072a) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public enum o {
        SPELLOUT,
        LOCALE
    }

    /* loaded from: classes.dex */
    public enum p {
        UNKNOWN,
        LTR,
        RTL;

        public static p e(int i) {
            return i != 1 ? i != 2 ? UNKNOWN : LTR : RTL;
        }
    }

    public a(View view, z zVar, AccessibilityManager accessibilityManager, ContentResolver contentResolver, zi0 zi0Var) {
        this(view, zVar, accessibilityManager, contentResolver, new AccessibilityViewEmbedder(view, 65536), zi0Var);
    }

    public static /* synthetic */ boolean C(l lVar, l lVar2) {
        return lVar2 == lVar;
    }

    public static /* synthetic */ boolean D(l lVar) {
        return lVar.x0(i.HAS_IMPLICIT_SCROLLING);
    }

    public static /* synthetic */ int e(a aVar, int i2) {
        int i3 = i2 & aVar.l;
        aVar.l = i3;
        return i3;
    }

    public static /* synthetic */ int f(a aVar, int i2) {
        int i3 = i2 | aVar.l;
        aVar.l = i3;
        return i3;
    }

    public final boolean A(l lVar) {
        if (lVar.x0(i.SCOPES_ROUTE)) {
            return false;
        }
        return (lVar.t0() == null && (lVar.d & (~C)) == 0) ? false : true;
    }

    public boolean B() {
        return this.c.isTouchExplorationEnabled();
    }

    public AccessibilityEvent E(int i2) {
        return AccessibilityEvent.obtain(i2);
    }

    public final AccessibilityEvent F(int i2, int i3) {
        AccessibilityEvent E = E(i3);
        E.setPackageName(this.a.getContext().getPackageName());
        E.setSource(this.a, i2);
        return E;
    }

    public AccessibilityNodeInfo G(View view) {
        return AccessibilityNodeInfo.obtain(view);
    }

    public AccessibilityNodeInfo H(View view, int i2) {
        return AccessibilityNodeInfo.obtain(view, i2);
    }

    public boolean I(MotionEvent motionEvent) {
        return J(motionEvent, false);
    }

    public boolean J(MotionEvent motionEvent, boolean z2) {
        if (this.c.isTouchExplorationEnabled() && !this.g.isEmpty()) {
            l y0 = x().y0(new float[]{motionEvent.getX(), motionEvent.getY(), 0.0f, 1.0f}, z2);
            if (y0 != null && y0.i != -1) {
                if (z2) {
                    return false;
                }
                return this.d.onAccessibilityHoverEvent(y0.b, motionEvent);
            }
            if (motionEvent.getAction() == 9 || motionEvent.getAction() == 7) {
                y(motionEvent.getX(), motionEvent.getY(), z2);
            } else if (motionEvent.getAction() != 10) {
                ha0.a("flutter", "unexpected accessibility hover event: " + motionEvent);
                return false;
            } else {
                K();
            }
            return true;
        }
        return false;
    }

    public final void K() {
        l lVar = this.o;
        if (lVar != null) {
            Q(lVar.b, PackageParser.PARSE_COLLECT_CERTIFICATES);
            this.o = null;
        }
    }

    public final void L(l lVar) {
        String p0 = lVar.p0();
        if (p0 == null) {
            p0 = " ";
        }
        U(p0);
    }

    public final boolean M(l lVar, int i2, Bundle bundle, boolean z2) {
        int i3 = bundle.getInt("ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT");
        boolean z3 = bundle.getBoolean("ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN");
        int i4 = lVar.g;
        int i5 = lVar.h;
        O(lVar, i3, z2, z3);
        if (i4 != lVar.g || i5 != lVar.h) {
            String str = lVar.r != null ? lVar.r : "";
            AccessibilityEvent F = F(lVar.b, 8192);
            F.getText().add(str);
            F.setFromIndex(lVar.g);
            F.setToIndex(lVar.h);
            F.setItemCount(str.length());
            R(F);
        }
        if (i3 == 1) {
            if (z2) {
                g gVar = g.MOVE_CURSOR_FORWARD_BY_CHARACTER;
                if (lVar.w0(gVar)) {
                    this.b.c(i2, gVar, Boolean.valueOf(z3));
                    return true;
                }
            }
            if (z2) {
                return false;
            }
            g gVar2 = g.MOVE_CURSOR_BACKWARD_BY_CHARACTER;
            if (lVar.w0(gVar2)) {
                this.b.c(i2, gVar2, Boolean.valueOf(z3));
                return true;
            }
            return false;
        } else if (i3 != 2) {
            return i3 == 4 || i3 == 8 || i3 == 16;
        } else {
            if (z2) {
                g gVar3 = g.MOVE_CURSOR_FORWARD_BY_WORD;
                if (lVar.w0(gVar3)) {
                    this.b.c(i2, gVar3, Boolean.valueOf(z3));
                    return true;
                }
            }
            if (z2) {
                return false;
            }
            g gVar4 = g.MOVE_CURSOR_BACKWARD_BY_WORD;
            if (lVar.w0(gVar4)) {
                this.b.c(i2, gVar4, Boolean.valueOf(z3));
                return true;
            }
            return false;
        }
    }

    public final boolean N(l lVar, int i2, Bundle bundle) {
        String string = (bundle == null || !bundle.containsKey("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE")) ? "" : bundle.getString("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE");
        this.b.c(i2, g.SET_TEXT, string);
        lVar.r = string;
        lVar.s = null;
        return true;
    }

    public final void O(l lVar, int i2, boolean z2, boolean z3) {
        if (lVar.h < 0 || lVar.g < 0) {
            return;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 4) {
                    if (i2 == 8 || i2 == 16) {
                        if (z2) {
                            lVar.h = lVar.r.length();
                        } else {
                            lVar.h = 0;
                        }
                    }
                } else if (z2 && lVar.h < lVar.r.length()) {
                    Matcher matcher = Pattern.compile("(?!^)(\\n)").matcher(lVar.r.substring(lVar.h));
                    if (matcher.find()) {
                        l.n(lVar, matcher.start(1));
                    } else {
                        lVar.h = lVar.r.length();
                    }
                } else if (!z2 && lVar.h > 0) {
                    Matcher matcher2 = Pattern.compile("(?s:.*)(\\n)").matcher(lVar.r.substring(0, lVar.h));
                    if (matcher2.find()) {
                        lVar.h = matcher2.start(1);
                    } else {
                        lVar.h = 0;
                    }
                }
            } else if (z2 && lVar.h < lVar.r.length()) {
                Matcher matcher3 = Pattern.compile("\\p{L}(\\b)").matcher(lVar.r.substring(lVar.h));
                matcher3.find();
                if (matcher3.find()) {
                    l.n(lVar, matcher3.start(1));
                } else {
                    lVar.h = lVar.r.length();
                }
            } else if (!z2 && lVar.h > 0) {
                Matcher matcher4 = Pattern.compile("(?s:.*)(\\b)\\p{L}").matcher(lVar.r.substring(0, lVar.h));
                if (matcher4.find()) {
                    lVar.h = matcher4.start(1);
                }
            }
        } else if (z2 && lVar.h < lVar.r.length()) {
            l.n(lVar, 1);
        } else if (!z2 && lVar.h > 0) {
            l.o(lVar, 1);
        }
        if (z3) {
            return;
        }
        lVar.g = lVar.h;
    }

    public void P() {
        this.u = true;
        this.e.d();
        X(null);
        this.c.removeAccessibilityStateChangeListener(this.w);
        this.c.removeTouchExplorationStateChangeListener(this.x);
        this.f.unregisterContentObserver(this.y);
        this.b.g(null);
    }

    public void Q(int i2, int i3) {
        if (this.c.isEnabled()) {
            R(F(i2, i3));
        }
    }

    public final void R(AccessibilityEvent accessibilityEvent) {
        if (this.c.isEnabled()) {
            this.a.getParent().requestSendAccessibilityEvent(this.a, accessibilityEvent);
        }
    }

    public final void S() {
        this.b.f(this.l);
    }

    public final void T(int i2) {
        AccessibilityEvent F = F(i2, 2048);
        F.setContentChangeTypes(1);
        R(F);
    }

    public final void U(String str) {
        this.a.setAccessibilityPaneTitle(str);
    }

    public final void V(boolean z2) {
        if (this.t == z2) {
            return;
        }
        this.t = z2;
        if (z2) {
            this.l |= f.ACCESSIBLE_NAVIGATION.m;
        } else {
            this.l &= ~f.ACCESSIBLE_NAVIGATION.m;
        }
        S();
    }

    public final void W() {
        int i2;
        View view = this.a;
        if (view == null || view.getResources() == null) {
            return;
        }
        i2 = this.a.getResources().getConfiguration().fontWeightAdjustment;
        if (i2 == Integer.MAX_VALUE || i2 < 300) {
            this.l &= ~f.BOLD_TEXT.m;
        } else {
            this.l |= f.BOLD_TEXT.m;
        }
        S();
    }

    public void X(k kVar) {
        this.s = kVar;
    }

    public final boolean Y(final l lVar) {
        return lVar.j > 0 && (l.C0(this.i, new uj0() { // from class: androidx.appcompat.view.menu.x
            @Override // androidx.appcompat.view.menu.uj0
            public final boolean test(Object obj) {
                boolean C2;
                C2 = io.flutter.view.a.C(a.l.this, (a.l) obj);
                return C2;
            }
        }) || !l.C0(this.i, new uj0() { // from class: androidx.appcompat.view.menu.y
            @Override // androidx.appcompat.view.menu.uj0
            public final boolean test(Object obj) {
                boolean D;
                D = io.flutter.view.a.D((a.l) obj);
                return D;
            }
        }));
    }

    public void Z(ByteBuffer byteBuffer, String[] strArr) {
        while (byteBuffer.hasRemaining()) {
            h v = v(byteBuffer.getInt());
            v.c = byteBuffer.getInt();
            int i2 = byteBuffer.getInt();
            String str = null;
            v.d = i2 == -1 ? null : strArr[i2];
            int i3 = byteBuffer.getInt();
            if (i3 != -1) {
                str = strArr[i3];
            }
            v.e = str;
        }
    }

    public void a0(ByteBuffer byteBuffer, String[] strArr, ByteBuffer[] byteBufferArr) {
        l lVar;
        l lVar2;
        float f2;
        float f3;
        WindowInsets rootWindowInsets;
        Integer valueOf;
        View c2;
        ArrayList arrayList = new ArrayList();
        while (byteBuffer.hasRemaining()) {
            l w = w(byteBuffer.getInt());
            w.F0(byteBuffer, strArr, byteBufferArr);
            if (!w.x0(i.IS_HIDDEN)) {
                if (w.x0(i.IS_FOCUSED)) {
                    this.m = w;
                }
                if (w.C) {
                    arrayList.add(w);
                }
                if (w.i != -1 && !this.e.b(w.i) && (c2 = this.e.c(w.i)) != null) {
                    c2.setImportantForAccessibility(0);
                }
            }
        }
        HashSet hashSet = new HashSet();
        l x = x();
        ArrayList<l> arrayList2 = new ArrayList();
        if (x != null) {
            float[] fArr = new float[16];
            Matrix.setIdentityM(fArr, 0);
            if (t() && (rootWindowInsets = this.a.getRootWindowInsets()) != null) {
                if (!this.r.equals(Integer.valueOf(rootWindowInsets.getSystemWindowInsetLeft()))) {
                    x.Z = true;
                    x.X = true;
                }
                this.r = Integer.valueOf(rootWindowInsets.getSystemWindowInsetLeft());
                Matrix.translateM(fArr, 0, valueOf.intValue(), 0.0f, 0.0f);
            }
            x.E0(fArr, hashSet, false);
            x.g0(arrayList2);
        }
        l lVar3 = null;
        for (l lVar4 : arrayList2) {
            if (!this.p.contains(Integer.valueOf(lVar4.b))) {
                lVar3 = lVar4;
            }
        }
        if (lVar3 == null && arrayList2.size() > 0) {
            lVar3 = (l) arrayList2.get(arrayList2.size() - 1);
        }
        if (lVar3 != null && (lVar3.b != this.q || arrayList2.size() != this.p.size())) {
            this.q = lVar3.b;
            L(lVar3);
        }
        this.p.clear();
        for (l lVar5 : arrayList2) {
            this.p.add(Integer.valueOf(lVar5.b));
        }
        Iterator it = this.g.entrySet().iterator();
        while (it.hasNext()) {
            l lVar6 = (l) ((Map.Entry) it.next()).getValue();
            if (!hashSet.contains(lVar6)) {
                b0(lVar6);
                it.remove();
            }
        }
        T(0);
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            l lVar7 = (l) it2.next();
            if (lVar7.j0()) {
                AccessibilityEvent F = F(lVar7.b, 4096);
                float f4 = lVar7.l;
                float f5 = lVar7.m;
                if (Float.isInfinite(lVar7.m)) {
                    if (f4 > 70000.0f) {
                        f4 = 70000.0f;
                    }
                    f5 = 100000.0f;
                }
                if (Float.isInfinite(lVar7.n)) {
                    f2 = f5 + 100000.0f;
                    if (f4 < -70000.0f) {
                        f4 = -70000.0f;
                    }
                    f3 = f4 + 100000.0f;
                } else {
                    f2 = f5 - lVar7.n;
                    f3 = f4 - lVar7.n;
                }
                if (lVar7.u0(g.SCROLL_UP) || lVar7.u0(g.SCROLL_DOWN)) {
                    F.setScrollY((int) f3);
                    F.setMaxScrollY((int) f2);
                } else if (lVar7.u0(g.SCROLL_LEFT) || lVar7.u0(g.SCROLL_RIGHT)) {
                    F.setScrollX((int) f3);
                    F.setMaxScrollX((int) f2);
                }
                if (lVar7.j > 0) {
                    F.setItemCount(lVar7.j);
                    F.setFromIndex(lVar7.k);
                    int i2 = 0;
                    for (l lVar8 : lVar7.T) {
                        if (!lVar8.x0(i.IS_HIDDEN)) {
                            i2++;
                        }
                    }
                    F.setToIndex((lVar7.k + i2) - 1);
                }
                R(F);
            }
            if (lVar7.x0(i.IS_LIVE_REGION) && lVar7.i0()) {
                T(lVar7.b);
            }
            l lVar9 = this.i;
            if (lVar9 != null && lVar9.b == lVar7.b) {
                i iVar = i.IS_SELECTED;
                if (!lVar7.v0(iVar) && lVar7.x0(iVar)) {
                    AccessibilityEvent F2 = F(lVar7.b, 4);
                    F2.getText().add(lVar7.p);
                    R(F2);
                }
            }
            l lVar10 = this.m;
            if (lVar10 != null && lVar10.b == lVar7.b && ((lVar2 = this.n) == null || lVar2.b != this.m.b)) {
                this.n = this.m;
                R(F(lVar7.b, 8));
            } else if (this.m == null) {
                this.n = null;
            }
            l lVar11 = this.m;
            if (lVar11 != null && lVar11.b == lVar7.b) {
                i iVar2 = i.IS_TEXT_FIELD;
                if (lVar7.v0(iVar2) && lVar7.x0(iVar2) && ((lVar = this.i) == null || lVar.b == this.m.b)) {
                    String str = lVar7.K != null ? lVar7.K : "";
                    String str2 = lVar7.r != null ? lVar7.r : "";
                    AccessibilityEvent s = s(lVar7.b, str, str2);
                    if (s != null) {
                        R(s);
                    }
                    if (lVar7.F != lVar7.g || lVar7.G != lVar7.h) {
                        AccessibilityEvent F3 = F(lVar7.b, 8192);
                        F3.getText().add(str2);
                        F3.setFromIndex(lVar7.g);
                        F3.setToIndex(lVar7.h);
                        F3.setItemCount(str2.length());
                        R(F3);
                    }
                }
            }
        }
    }

    public final void b0(l lVar) {
        View c2;
        Integer num;
        lVar.R = null;
        if (lVar.i != -1 && (num = this.j) != null && this.d.platformViewOfNode(num.intValue()) == this.e.c(lVar.i)) {
            Q(this.j.intValue(), 65536);
            this.j = null;
        }
        if (lVar.i != -1 && (c2 = this.e.c(lVar.i)) != null) {
            c2.setImportantForAccessibility(4);
        }
        l lVar2 = this.i;
        if (lVar2 == lVar) {
            Q(lVar2.b, 65536);
            this.i = null;
        }
        if (this.m == lVar) {
            this.m = null;
        }
        if (this.o == lVar) {
            this.o = null;
        }
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public AccessibilityNodeInfo createAccessibilityNodeInfo(int i2) {
        CharSequence t0;
        i iVar;
        int i3;
        boolean z2 = true;
        V(true);
        if (i2 >= 65536) {
            return this.d.createAccessibilityNodeInfo(i2);
        }
        if (i2 == -1) {
            AccessibilityNodeInfo G = G(this.a);
            this.a.onInitializeAccessibilityNodeInfo(G);
            if (this.g.containsKey(0)) {
                G.addChild(this.a, 0);
            }
            G.setImportantForAccessibility(false);
            return G;
        }
        l lVar = (l) this.g.get(Integer.valueOf(i2));
        if (lVar == null) {
            return null;
        }
        if (lVar.i != -1 && this.e.b(lVar.i)) {
            View c2 = this.e.c(lVar.i);
            if (c2 == null) {
                return null;
            }
            return this.d.getRootNode(c2, lVar.b, lVar.m0());
        }
        AccessibilityNodeInfo H = H(this.a, i2);
        H.setImportantForAccessibility(A(lVar));
        H.setViewIdResourceName("");
        if (lVar.o != null) {
            H.setViewIdResourceName(lVar.o);
        }
        H.setPackageName(this.a.getContext().getPackageName());
        H.setClassName("android.view.View");
        H.setSource(this.a, i2);
        H.setFocusable(lVar.z0());
        l lVar2 = this.m;
        if (lVar2 != null) {
            H.setFocused(lVar2.b == i2);
        }
        l lVar3 = this.i;
        if (lVar3 != null) {
            H.setAccessibilityFocused(lVar3.b == i2);
        }
        i iVar2 = i.IS_TEXT_FIELD;
        if (lVar.x0(iVar2)) {
            H.setPassword(lVar.x0(i.IS_OBSCURED));
            if (!lVar.x0(i.IS_READ_ONLY)) {
                H.setClassName("android.widget.EditText");
            }
            H.setEditable(!lVar.x0(iVar));
            if (lVar.g != -1 && lVar.h != -1) {
                H.setTextSelection(lVar.g, lVar.h);
            }
            l lVar4 = this.i;
            if (lVar4 != null && lVar4.b == i2) {
                H.setLiveRegion(1);
            }
            if (lVar.w0(g.MOVE_CURSOR_FORWARD_BY_CHARACTER)) {
                H.addAction(PackageParser.PARSE_COLLECT_CERTIFICATES);
                i3 = 1;
            } else {
                i3 = 0;
            }
            if (lVar.w0(g.MOVE_CURSOR_BACKWARD_BY_CHARACTER)) {
                H.addAction(PackageParser.PARSE_TRUSTED_OVERLAY);
                i3 |= 1;
            }
            if (lVar.w0(g.MOVE_CURSOR_FORWARD_BY_WORD)) {
                H.addAction(PackageParser.PARSE_COLLECT_CERTIFICATES);
                i3 |= 2;
            }
            if (lVar.w0(g.MOVE_CURSOR_BACKWARD_BY_WORD)) {
                H.addAction(PackageParser.PARSE_TRUSTED_OVERLAY);
                i3 |= 2;
            }
            H.setMovementGranularities(i3);
            if (lVar.e >= 0) {
                int length = lVar.r == null ? 0 : lVar.r.length();
                int unused = lVar.f;
                int unused2 = lVar.e;
                H.setMaxTextLength((length - lVar.f) + lVar.e);
            }
        }
        if (lVar.w0(g.SET_SELECTION)) {
            H.addAction(131072);
        }
        if (lVar.w0(g.COPY)) {
            H.addAction(16384);
        }
        if (lVar.w0(g.CUT)) {
            H.addAction(65536);
        }
        if (lVar.w0(g.PASTE)) {
            H.addAction(32768);
        }
        if (lVar.w0(g.SET_TEXT)) {
            H.addAction(2097152);
        }
        if (lVar.x0(i.IS_BUTTON) || lVar.x0(i.IS_LINK)) {
            H.setClassName("android.widget.Button");
        }
        if (lVar.x0(i.IS_IMAGE)) {
            H.setClassName("android.widget.ImageView");
        }
        if (lVar.w0(g.DISMISS)) {
            H.setDismissable(true);
            H.addAction(1048576);
        }
        if (lVar.R != null) {
            H.setParent(this.a, lVar.R.b);
        } else {
            H.setParent(this.a);
        }
        if (lVar.A != -1) {
            H.setTraversalAfter(this.a, lVar.A);
        }
        Rect m0 = lVar.m0();
        if (lVar.R != null) {
            Rect m02 = lVar.R.m0();
            Rect rect = new Rect(m0);
            rect.offset(-m02.left, -m02.top);
            H.setBoundsInParent(rect);
        } else {
            H.setBoundsInParent(m0);
        }
        H.setBoundsInScreen(u(m0));
        H.setVisibleToUser(true);
        H.setEnabled(!lVar.x0(i.HAS_ENABLED_STATE) || lVar.x0(i.IS_ENABLED));
        if (lVar.w0(g.TAP)) {
            if (lVar.V != null) {
                H.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, lVar.V.e));
                H.setClickable(true);
            } else {
                H.addAction(16);
                H.setClickable(true);
            }
        }
        if (lVar.w0(g.LONG_PRESS)) {
            if (lVar.W != null) {
                H.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, lVar.W.e));
                H.setLongClickable(true);
            } else {
                H.addAction(32);
                H.setLongClickable(true);
            }
        }
        g gVar = g.SCROLL_LEFT;
        if (lVar.w0(gVar) || lVar.w0(g.SCROLL_UP) || lVar.w0(g.SCROLL_RIGHT) || lVar.w0(g.SCROLL_DOWN)) {
            H.setScrollable(true);
            if (lVar.x0(i.HAS_IMPLICIT_SCROLLING)) {
                if (lVar.w0(gVar) || lVar.w0(g.SCROLL_RIGHT)) {
                    if (Y(lVar)) {
                        H.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(0, lVar.j, false));
                    } else {
                        H.setClassName("android.widget.HorizontalScrollView");
                    }
                } else if (Y(lVar)) {
                    H.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(lVar.j, 0, false));
                } else {
                    H.setClassName("android.widget.ScrollView");
                }
            }
            if (lVar.w0(gVar) || lVar.w0(g.SCROLL_UP)) {
                H.addAction(4096);
            }
            if (lVar.w0(g.SCROLL_RIGHT) || lVar.w0(g.SCROLL_DOWN)) {
                H.addAction(8192);
            }
        }
        g gVar2 = g.INCREASE;
        if (lVar.w0(gVar2) || lVar.w0(g.DECREASE)) {
            H.setClassName("android.widget.SeekBar");
            if (lVar.w0(gVar2)) {
                H.addAction(4096);
            }
            if (lVar.w0(g.DECREASE)) {
                H.addAction(8192);
            }
        }
        if (lVar.x0(i.IS_LIVE_REGION)) {
            H.setLiveRegion(1);
        }
        if (lVar.x0(iVar2)) {
            H.setText(lVar.s0());
            H.setHintText(lVar.r0());
        } else if (!lVar.x0(i.SCOPES_ROUTE) && (t0 = lVar.t0()) != null) {
            H.setContentDescription(t0);
        }
        if (lVar.z != null) {
            H.setTooltipText(lVar.z);
        }
        boolean x0 = lVar.x0(i.HAS_CHECKED_STATE);
        boolean x02 = lVar.x0(i.HAS_TOGGLED_STATE);
        if (!x0 && !x02) {
            z2 = false;
        }
        H.setCheckable(z2);
        if (x0) {
            H.setChecked(lVar.x0(i.IS_CHECKED));
            if (lVar.x0(i.IS_IN_MUTUALLY_EXCLUSIVE_GROUP)) {
                H.setClassName("android.widget.RadioButton");
            } else {
                H.setClassName("android.widget.CheckBox");
            }
        } else if (x02) {
            H.setChecked(lVar.x0(i.IS_TOGGLED));
            H.setClassName("android.widget.Switch");
        }
        H.setSelected(lVar.x0(i.IS_SELECTED));
        H.setHeading(lVar.x0(i.IS_HEADER));
        l lVar5 = this.i;
        if (lVar5 == null || lVar5.b != i2) {
            H.addAction(64);
        } else {
            H.addAction(PackageParser.PARSE_IS_PRIVILEGED);
        }
        if (lVar.U != null) {
            for (h hVar : lVar.U) {
                H.addAction(new AccessibilityNodeInfo.AccessibilityAction(hVar.a, hVar.d));
            }
        }
        for (l lVar6 : lVar.S) {
            if (!lVar6.x0(i.IS_HIDDEN)) {
                if (lVar6.i != -1) {
                    View c3 = this.e.c(lVar6.i);
                    if (!this.e.b(lVar6.i)) {
                        H.addChild(c3);
                    }
                }
                H.addChild(this.a, lVar6.b);
            }
        }
        return H;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public AccessibilityNodeInfo findFocus(int i2) {
        if (i2 == 1) {
            l lVar = this.m;
            if (lVar != null) {
                return createAccessibilityNodeInfo(lVar.b);
            }
            Integer num = this.k;
            if (num != null) {
                return createAccessibilityNodeInfo(num.intValue());
            }
        } else if (i2 != 2) {
            return null;
        }
        l lVar2 = this.i;
        if (lVar2 != null) {
            return createAccessibilityNodeInfo(lVar2.b);
        }
        Integer num2 = this.j;
        if (num2 != null) {
            return createAccessibilityNodeInfo(num2.intValue());
        }
        return null;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public boolean performAction(int i2, int i3, Bundle bundle) {
        if (i2 >= 65536) {
            boolean performAction = this.d.performAction(i2, i3, bundle);
            if (performAction && i3 == 128) {
                this.j = null;
            }
            return performAction;
        }
        l lVar = (l) this.g.get(Integer.valueOf(i2));
        if (lVar == null) {
            return false;
        }
        switch (i3) {
            case PackageParser.PARSE_FORWARD_LOCK /* 16 */:
                this.b.b(i2, g.TAP);
                return true;
            case PackageParser.PARSE_EXTERNAL_STORAGE /* 32 */:
                this.b.b(i2, g.LONG_PRESS);
                return true;
            case PackageParser.PARSE_IS_SYSTEM_DIR /* 64 */:
                if (this.i == null) {
                    this.a.invalidate();
                }
                this.i = lVar;
                this.b.b(i2, g.DID_GAIN_ACCESSIBILITY_FOCUS);
                HashMap hashMap = new HashMap();
                hashMap.put("type", "didGainFocus");
                hashMap.put("nodeId", Integer.valueOf(lVar.b));
                this.b.a.c(hashMap);
                Q(i2, 32768);
                if (lVar.w0(g.INCREASE) || lVar.w0(g.DECREASE)) {
                    Q(i2, 4);
                }
                return true;
            case PackageParser.PARSE_IS_PRIVILEGED /* 128 */:
                l lVar2 = this.i;
                if (lVar2 != null && lVar2.b == i2) {
                    this.i = null;
                }
                Integer num = this.j;
                if (num != null && num.intValue() == i2) {
                    this.j = null;
                }
                this.b.b(i2, g.DID_LOSE_ACCESSIBILITY_FOCUS);
                Q(i2, 65536);
                return true;
            case PackageParser.PARSE_COLLECT_CERTIFICATES /* 256 */:
                return M(lVar, i2, bundle, true);
            case PackageParser.PARSE_TRUSTED_OVERLAY /* 512 */:
                return M(lVar, i2, bundle, false);
            case 4096:
                g gVar = g.SCROLL_UP;
                if (lVar.w0(gVar)) {
                    this.b.b(i2, gVar);
                } else {
                    g gVar2 = g.SCROLL_LEFT;
                    if (lVar.w0(gVar2)) {
                        this.b.b(i2, gVar2);
                    } else {
                        g gVar3 = g.INCREASE;
                        if (!lVar.w0(gVar3)) {
                            return false;
                        }
                        lVar.r = lVar.t;
                        lVar.s = lVar.u;
                        Q(i2, 4);
                        this.b.b(i2, gVar3);
                    }
                }
                return true;
            case 8192:
                g gVar4 = g.SCROLL_DOWN;
                if (lVar.w0(gVar4)) {
                    this.b.b(i2, gVar4);
                } else {
                    g gVar5 = g.SCROLL_RIGHT;
                    if (lVar.w0(gVar5)) {
                        this.b.b(i2, gVar5);
                    } else {
                        g gVar6 = g.DECREASE;
                        if (!lVar.w0(gVar6)) {
                            return false;
                        }
                        lVar.r = lVar.v;
                        lVar.s = lVar.w;
                        Q(i2, 4);
                        this.b.b(i2, gVar6);
                    }
                }
                return true;
            case 16384:
                this.b.b(i2, g.COPY);
                return true;
            case 32768:
                this.b.b(i2, g.PASTE);
                return true;
            case 65536:
                this.b.b(i2, g.CUT);
                return true;
            case 131072:
                HashMap hashMap2 = new HashMap();
                if (bundle != null && bundle.containsKey("ACTION_ARGUMENT_SELECTION_START_INT") && bundle.containsKey("ACTION_ARGUMENT_SELECTION_END_INT")) {
                    hashMap2.put("base", Integer.valueOf(bundle.getInt("ACTION_ARGUMENT_SELECTION_START_INT")));
                    hashMap2.put("extent", Integer.valueOf(bundle.getInt("ACTION_ARGUMENT_SELECTION_END_INT")));
                } else {
                    hashMap2.put("base", Integer.valueOf(lVar.h));
                    hashMap2.put("extent", Integer.valueOf(lVar.h));
                }
                this.b.c(i2, g.SET_SELECTION, hashMap2);
                l lVar3 = (l) this.g.get(Integer.valueOf(i2));
                lVar3.g = ((Integer) hashMap2.get("base")).intValue();
                lVar3.h = ((Integer) hashMap2.get("extent")).intValue();
                return true;
            case 1048576:
                this.b.b(i2, g.DISMISS);
                return true;
            case 2097152:
                return N(lVar, i2, bundle);
            case 16908342:
                this.b.b(i2, g.SHOW_ON_SCREEN);
                return true;
            default:
                h hVar = (h) this.h.get(Integer.valueOf(i3 - B));
                if (hVar != null) {
                    this.b.c(i2, g.CUSTOM_ACTION, Integer.valueOf(hVar.b));
                    return true;
                }
                return false;
        }
    }

    public final AccessibilityEvent s(int i2, String str, String str2) {
        AccessibilityEvent F = F(i2, 16);
        F.setBeforeText(str);
        F.getText().add(str2);
        int i3 = 0;
        while (i3 < str.length() && i3 < str2.length() && str.charAt(i3) == str2.charAt(i3)) {
            i3++;
        }
        if (i3 < str.length() || i3 < str2.length()) {
            F.setFromIndex(i3);
            int length = str.length() - 1;
            int length2 = str2.length() - 1;
            while (length >= i3 && length2 >= i3 && str.charAt(length) == str2.charAt(length2)) {
                length--;
                length2--;
            }
            F.setRemovedCount((length - i3) + 1);
            F.setAddedCount((length2 - i3) + 1);
            return F;
        }
        return null;
    }

    public final boolean t() {
        Activity b2 = r61.b(this.a.getContext());
        if (b2 == null || b2.getWindow() == null) {
            return false;
        }
        int i2 = b2.getWindow().getAttributes().layoutInDisplayCutoutMode;
        return i2 == 2 || i2 == 0;
    }

    public final Rect u(Rect rect) {
        Rect rect2 = new Rect(rect);
        int[] iArr = new int[2];
        this.a.getLocationOnScreen(iArr);
        rect2.offset(iArr[0], iArr[1]);
        return rect2;
    }

    public final h v(int i2) {
        h hVar = (h) this.h.get(Integer.valueOf(i2));
        if (hVar == null) {
            h hVar2 = new h();
            hVar2.b = i2;
            hVar2.a = B + i2;
            this.h.put(Integer.valueOf(i2), hVar2);
            return hVar2;
        }
        return hVar;
    }

    public final l w(int i2) {
        l lVar = (l) this.g.get(Integer.valueOf(i2));
        if (lVar == null) {
            l lVar2 = new l(this);
            lVar2.b = i2;
            this.g.put(Integer.valueOf(i2), lVar2);
            return lVar2;
        }
        return lVar;
    }

    public final l x() {
        return (l) this.g.get(0);
    }

    public final void y(float f2, float f3, boolean z2) {
        l y0;
        if (this.g.isEmpty() || (y0 = x().y0(new float[]{f2, f3, 0.0f, 1.0f}, z2)) == this.o) {
            return;
        }
        if (y0 != null) {
            Q(y0.b, PackageParser.PARSE_IS_PRIVILEGED);
        }
        l lVar = this.o;
        if (lVar != null) {
            Q(lVar.b, PackageParser.PARSE_COLLECT_CERTIFICATES);
        }
        this.o = y0;
    }

    public boolean z() {
        return this.c.isEnabled();
    }

    public a(View view, z zVar, AccessibilityManager accessibilityManager, ContentResolver contentResolver, AccessibilityViewEmbedder accessibilityViewEmbedder, zi0 zi0Var) {
        this.g = new HashMap();
        this.h = new HashMap();
        this.l = 0;
        this.p = new ArrayList();
        this.q = 0;
        this.r = 0;
        this.t = false;
        this.u = false;
        this.v = new C0072a();
        b bVar = new b();
        this.w = bVar;
        c cVar = new c(new Handler());
        this.y = cVar;
        this.a = view;
        this.b = zVar;
        this.c = accessibilityManager;
        this.f = contentResolver;
        this.d = accessibilityViewEmbedder;
        this.e = zi0Var;
        bVar.onAccessibilityStateChanged(accessibilityManager.isEnabled());
        accessibilityManager.addAccessibilityStateChangeListener(bVar);
        d dVar = new d(accessibilityManager);
        this.x = dVar;
        dVar.onTouchExplorationStateChanged(accessibilityManager.isTouchExplorationEnabled());
        accessibilityManager.addTouchExplorationStateChangeListener(dVar);
        cVar.onChange(false);
        contentResolver.registerContentObserver(Settings.Global.getUriFor("transition_animation_scale"), false, cVar);
        if (Build.VERSION.SDK_INT >= 31) {
            W();
        }
        zi0Var.a(this);
    }
}
