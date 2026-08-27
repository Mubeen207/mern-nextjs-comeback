package androidx.appcompat.view.menu;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ContentInfo;
import android.view.Display;
import android.view.KeyEvent;
import android.view.OnReceiveContentListener;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import androidx.appcompat.view.menu.b0;
import androidx.appcompat.view.menu.b91;
import androidx.appcompat.view.menu.o81;
import androidx.appcompat.view.menu.p0;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public abstract class p51 {
    public static Field a = null;
    public static boolean b = false;
    public static final int[] c = {pm0.b, pm0.c, pm0.n, pm0.y, pm0.B, pm0.C, pm0.D, pm0.E, pm0.F, pm0.G, pm0.d, pm0.e, pm0.f, pm0.g, pm0.h, pm0.i, pm0.j, pm0.k, pm0.l, pm0.m, pm0.o, pm0.p, pm0.q, pm0.r, pm0.s, pm0.t, pm0.u, pm0.v, pm0.w, pm0.x, pm0.z, pm0.A};
    public static final ng0 d = new ng0() { // from class: androidx.appcompat.view.menu.o51
        @Override // androidx.appcompat.view.menu.ng0
        public final uf a(uf ufVar) {
            uf S;
            S = p51.S(ufVar);
            return S;
        }
    };
    public static final e e = new e();

    /* loaded from: classes.dex */
    public class a extends f {
        public a(int i, Class cls, int i2) {
            super(i, cls, i2);
        }

        @Override // androidx.appcompat.view.menu.p51.f
        /* renamed from: h */
        public Boolean c(View view) {
            return Boolean.valueOf(k.d(view));
        }

        @Override // androidx.appcompat.view.menu.p51.f
        /* renamed from: i */
        public void d(View view, Boolean bool) {
            k.j(view, bool.booleanValue());
        }

        @Override // androidx.appcompat.view.menu.p51.f
        /* renamed from: j */
        public boolean g(Boolean bool, Boolean bool2) {
            return !a(bool, bool2);
        }
    }

    /* loaded from: classes.dex */
    public class b extends f {
        public b(int i, Class cls, int i2, int i3) {
            super(i, cls, i2, i3);
        }

        @Override // androidx.appcompat.view.menu.p51.f
        /* renamed from: h */
        public CharSequence c(View view) {
            return k.b(view);
        }

        @Override // androidx.appcompat.view.menu.p51.f
        /* renamed from: i */
        public void d(View view, CharSequence charSequence) {
            k.h(view, charSequence);
        }

        @Override // androidx.appcompat.view.menu.p51.f
        /* renamed from: j */
        public boolean g(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    /* loaded from: classes.dex */
    public class c extends f {
        public c(int i, Class cls, int i2, int i3) {
            super(i, cls, i2, i3);
        }

        @Override // androidx.appcompat.view.menu.p51.f
        /* renamed from: h */
        public CharSequence c(View view) {
            return m.b(view);
        }

        @Override // androidx.appcompat.view.menu.p51.f
        /* renamed from: i */
        public void d(View view, CharSequence charSequence) {
            m.f(view, charSequence);
        }

        @Override // androidx.appcompat.view.menu.p51.f
        /* renamed from: j */
        public boolean g(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    /* loaded from: classes.dex */
    public class d extends f {
        public d(int i, Class cls, int i2) {
            super(i, cls, i2);
        }

        @Override // androidx.appcompat.view.menu.p51.f
        /* renamed from: h */
        public Boolean c(View view) {
            return Boolean.valueOf(k.c(view));
        }

        @Override // androidx.appcompat.view.menu.p51.f
        /* renamed from: i */
        public void d(View view, Boolean bool) {
            k.g(view, bool.booleanValue());
        }

        @Override // androidx.appcompat.view.menu.p51.f
        /* renamed from: j */
        public boolean g(Boolean bool, Boolean bool2) {
            return !a(bool, bool2);
        }
    }

    /* loaded from: classes.dex */
    public static class e implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {
        public final WeakHashMap a = new WeakHashMap();

        public void a(View view) {
            this.a.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(this);
            if (view.isAttachedToWindow()) {
                b(view);
            }
        }

        public final void b(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        public void c(View view) {
            this.a.remove(view);
            view.removeOnAttachStateChangeListener(this);
            d(view);
        }

        public final void d(View view) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            b(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* loaded from: classes.dex */
    public static abstract class f {
        public final int a;
        public final Class b;
        public final int c;
        public final int d;

        public f(int i, Class cls, int i2) {
            this(i, cls, 0, i2);
        }

        public boolean a(Boolean bool, Boolean bool2) {
            return (bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue());
        }

        public final boolean b() {
            return Build.VERSION.SDK_INT >= this.c;
        }

        public abstract Object c(View view);

        public abstract void d(View view, Object obj);

        public Object e(View view) {
            if (b()) {
                return c(view);
            }
            Object tag = view.getTag(this.a);
            if (this.b.isInstance(tag)) {
                return tag;
            }
            return null;
        }

        public void f(View view, Object obj) {
            if (b()) {
                d(view, obj);
            } else if (g(e(view), obj)) {
                p51.g(view);
                view.setTag(this.a, obj);
                p51.T(view, this.d);
            }
        }

        public abstract boolean g(Object obj, Object obj2);

        public f(int i, Class cls, int i2, int i3) {
            this.a = i;
            this.b = cls;
            this.d = i2;
            this.c = i3;
        }
    }

    /* loaded from: classes.dex */
    public static class g {
        public static WindowInsets a(View view, WindowInsets windowInsets) {
            return view.dispatchApplyWindowInsets(windowInsets);
        }

        public static WindowInsets b(View view, WindowInsets windowInsets) {
            return view.onApplyWindowInsets(windowInsets);
        }

        public static void c(View view) {
            view.requestApplyInsets();
        }
    }

    /* loaded from: classes.dex */
    public static class h {

        /* loaded from: classes.dex */
        public class a implements View.OnApplyWindowInsetsListener {
            public b91 a = null;
            public final /* synthetic */ View b;
            public final /* synthetic */ dg0 c;

            public a(View view, dg0 dg0Var) {
                this.b = view;
                this.c = dg0Var;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                b91 u = b91.u(windowInsets, view);
                int i = Build.VERSION.SDK_INT;
                if (i < 30) {
                    h.a(windowInsets, this.b);
                    if (u.equals(this.a)) {
                        return this.c.a(view, u).s();
                    }
                }
                this.a = u;
                b91 a = this.c.a(view, u);
                if (i >= 30) {
                    return a.s();
                }
                p51.h0(view);
                return a.s();
            }
        }

        public static void a(WindowInsets windowInsets, View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(pm0.R);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        public static b91 b(View view, b91 b91Var, Rect rect) {
            WindowInsets s = b91Var.s();
            if (s != null) {
                return b91.u(view.computeSystemWindowInsets(s, rect), view);
            }
            rect.setEmpty();
            return b91Var;
        }

        public static boolean c(View view, float f, float f2, boolean z) {
            return view.dispatchNestedFling(f, f2, z);
        }

        public static boolean d(View view, float f, float f2) {
            return view.dispatchNestedPreFling(f, f2);
        }

        public static boolean e(View view, int i, int i2, int[] iArr, int[] iArr2) {
            return view.dispatchNestedPreScroll(i, i2, iArr, iArr2);
        }

        public static boolean f(View view, int i, int i2, int i3, int i4, int[] iArr) {
            return view.dispatchNestedScroll(i, i2, i3, i4, iArr);
        }

        public static ColorStateList g(View view) {
            return view.getBackgroundTintList();
        }

        public static PorterDuff.Mode h(View view) {
            return view.getBackgroundTintMode();
        }

        public static float i(View view) {
            return view.getElevation();
        }

        public static b91 j(View view) {
            return b91.a.a(view);
        }

        public static String k(View view) {
            return view.getTransitionName();
        }

        public static float l(View view) {
            return view.getTranslationZ();
        }

        public static float m(View view) {
            return view.getZ();
        }

        public static boolean n(View view) {
            return view.hasNestedScrollingParent();
        }

        public static boolean o(View view) {
            return view.isImportantForAccessibility();
        }

        public static boolean p(View view) {
            return view.isNestedScrollingEnabled();
        }

        public static void q(View view, ColorStateList colorStateList) {
            view.setBackgroundTintList(colorStateList);
        }

        public static void r(View view, PorterDuff.Mode mode) {
            view.setBackgroundTintMode(mode);
        }

        public static void s(View view, float f) {
            view.setElevation(f);
        }

        public static void t(View view, boolean z) {
            view.setNestedScrollingEnabled(z);
        }

        public static void u(View view, dg0 dg0Var) {
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(pm0.L, dg0Var);
            }
            if (dg0Var == null) {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(pm0.R));
            } else {
                view.setOnApplyWindowInsetsListener(new a(view, dg0Var));
            }
        }

        public static void v(View view, String str) {
            view.setTransitionName(str);
        }

        public static void w(View view, float f) {
            view.setTranslationZ(f);
        }

        public static void x(View view, float f) {
            view.setZ(f);
        }

        public static boolean y(View view, int i) {
            return view.startNestedScroll(i);
        }

        public static void z(View view) {
            view.stopNestedScroll();
        }
    }

    /* loaded from: classes.dex */
    public static class i {
        public static b91 a(View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            b91 t = b91.t(rootWindowInsets);
            t.q(t);
            t.d(view.getRootView());
            return t;
        }

        public static int b(View view) {
            return view.getScrollIndicators();
        }

        public static void c(View view, int i) {
            view.setScrollIndicators(i);
        }

        public static void d(View view, int i, int i2) {
            view.setScrollIndicators(i, i2);
        }
    }

    /* loaded from: classes.dex */
    public static class j {
        public static void a(View view, Collection<View> collection, int i) {
            view.addKeyboardNavigationClusters(collection, i);
        }

        public static AutofillId b(View view) {
            return view.getAutofillId();
        }

        public static int c(View view) {
            return view.getImportantForAutofill();
        }

        public static int d(View view) {
            return view.getNextClusterForwardId();
        }

        public static boolean e(View view) {
            return view.hasExplicitFocusable();
        }

        public static boolean f(View view) {
            return view.isFocusedByDefault();
        }

        public static boolean g(View view) {
            return view.isImportantForAutofill();
        }

        public static boolean h(View view) {
            return view.isKeyboardNavigationCluster();
        }

        public static View i(View view, View view2, int i) {
            return view.keyboardNavigationClusterSearch(view2, i);
        }

        public static boolean j(View view) {
            return view.restoreDefaultFocus();
        }

        public static void k(View view, String... strArr) {
            view.setAutofillHints(strArr);
        }

        public static void l(View view, boolean z) {
            view.setFocusedByDefault(z);
        }

        public static void m(View view, int i) {
            view.setImportantForAutofill(i);
        }

        public static void n(View view, boolean z) {
            view.setKeyboardNavigationCluster(z);
        }

        public static void o(View view, int i) {
            view.setNextClusterForwardId(i);
        }

        public static void p(View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    /* loaded from: classes.dex */
    public static class k {
        public static void a(View view, final p pVar) {
            qu0 qu0Var = (qu0) view.getTag(pm0.Q);
            if (qu0Var == null) {
                qu0Var = new qu0();
                view.setTag(pm0.Q, qu0Var);
            }
            Objects.requireNonNull(pVar);
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener = new View.OnUnhandledKeyEventListener(pVar) { // from class: androidx.appcompat.view.menu.q51
                @Override // android.view.View.OnUnhandledKeyEventListener
                public final boolean onUnhandledKeyEvent(View view2, KeyEvent keyEvent) {
                    throw null;
                }
            };
            qu0Var.put(pVar, onUnhandledKeyEventListener);
            view.addOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
        }

        public static CharSequence b(View view) {
            return view.getAccessibilityPaneTitle();
        }

        public static boolean c(View view) {
            return view.isAccessibilityHeading();
        }

        public static boolean d(View view) {
            return view.isScreenReaderFocusable();
        }

        public static void e(View view, p pVar) {
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
            qu0 qu0Var = (qu0) view.getTag(pm0.Q);
            if (qu0Var == null || (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) qu0Var.get(pVar)) == null) {
                return;
            }
            view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
        }

        public static <T> T f(View view, int i) {
            return (T) view.requireViewById(i);
        }

        public static void g(View view, boolean z) {
            view.setAccessibilityHeading(z);
        }

        public static void h(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        public static void i(View view, m6 m6Var) {
            view.setAutofillId(null);
        }

        public static void j(View view, boolean z) {
            view.setScreenReaderFocusable(z);
        }
    }

    /* loaded from: classes.dex */
    public static class l {
        public static View.AccessibilityDelegate a(View view) {
            return view.getAccessibilityDelegate();
        }

        public static ContentCaptureSession b(View view) {
            return view.getContentCaptureSession();
        }

        public static List<Rect> c(View view) {
            return view.getSystemGestureExclusionRects();
        }

        public static void d(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i, int i2) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i, i2);
        }

        public static void e(View view, sf sfVar) {
            view.setContentCaptureSession(null);
        }

        public static void f(View view, List<Rect> list) {
            view.setSystemGestureExclusionRects(list);
        }
    }

    /* loaded from: classes.dex */
    public static class m {
        public static int a(View view) {
            return view.getImportantForContentCapture();
        }

        public static CharSequence b(View view) {
            return view.getStateDescription();
        }

        public static y91 c(View view) {
            WindowInsetsController windowInsetsController = view.getWindowInsetsController();
            if (windowInsetsController != null) {
                return y91.d(windowInsetsController);
            }
            return null;
        }

        public static boolean d(View view) {
            return view.isImportantForContentCapture();
        }

        public static void e(View view, int i) {
            view.setImportantForContentCapture(i);
        }

        public static void f(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }
    }

    /* loaded from: classes.dex */
    public static final class n {
        public static String[] a(View view) {
            return view.getReceiveContentMimeTypes();
        }

        public static uf b(View view, uf ufVar) {
            ContentInfo f = ufVar.f();
            ContentInfo performReceiveContent = view.performReceiveContent(f);
            if (performReceiveContent == null) {
                return null;
            }
            return performReceiveContent == f ? ufVar : uf.g(performReceiveContent);
        }

        public static void c(View view, String[] strArr, mg0 mg0Var) {
            if (mg0Var == null) {
                view.setOnReceiveContentListener(strArr, null);
            } else {
                view.setOnReceiveContentListener(strArr, new o(mg0Var));
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class o implements OnReceiveContentListener {
        public final mg0 a;

        public o(mg0 mg0Var) {
            this.a = mg0Var;
        }

        public ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
            uf g = uf.g(contentInfo);
            uf a = this.a.a(view, g);
            if (a == null) {
                return null;
            }
            return a == g ? contentInfo : a.f();
        }
    }

    /* loaded from: classes.dex */
    public interface p {
    }

    public static String[] A(View view) {
        return Build.VERSION.SDK_INT >= 31 ? n.a(view) : (String[]) view.getTag(pm0.N);
    }

    public static void A0(View view, String str) {
        h.v(view, str);
    }

    public static int B(View view) {
        return view.getPaddingEnd();
    }

    public static void B0(View view, o81.b bVar) {
        o81.d(view, bVar);
    }

    public static int C(View view) {
        return view.getPaddingStart();
    }

    public static f C0() {
        return new c(pm0.P, CharSequence.class, 64, 30);
    }

    public static b91 D(View view) {
        return i.a(view);
    }

    public static void D0(View view) {
        h.z(view);
    }

    public static CharSequence E(View view) {
        return (CharSequence) C0().e(view);
    }

    public static String F(View view) {
        return h.k(view);
    }

    public static y91 G(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            return m.c(view);
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                Window window = ((Activity) context).getWindow();
                if (window != null) {
                    return f81.a(window, view);
                }
                return null;
            }
        }
        return null;
    }

    public static int H(View view) {
        return view.getWindowSystemUiVisibility();
    }

    public static float I(View view) {
        return h.m(view);
    }

    public static boolean J(View view) {
        return view.hasOnClickListeners();
    }

    public static boolean K(View view) {
        return view.hasOverlappingRendering();
    }

    public static boolean L(View view) {
        return view.hasTransientState();
    }

    public static boolean M(View view) {
        Boolean bool = (Boolean) b().e(view);
        return bool != null && bool.booleanValue();
    }

    public static boolean N(View view) {
        return view.isAttachedToWindow();
    }

    public static boolean O(View view) {
        return view.isLaidOut();
    }

    public static boolean P(View view) {
        return h.p(view);
    }

    public static boolean Q(View view) {
        return view.isPaddingRelative();
    }

    public static boolean R(View view) {
        Boolean bool = (Boolean) j0().e(view);
        return bool != null && bool.booleanValue();
    }

    public static /* synthetic */ uf S(uf ufVar) {
        return ufVar;
    }

    public static void T(View view, int i2) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z = l(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                obtain.setEventType(z ? 32 : 2048);
                obtain.setContentChangeTypes(i2);
                if (z) {
                    obtain.getText().add(l(view));
                    v0(view);
                }
                view.sendAccessibilityEventUnchecked(obtain);
            } else if (i2 != 32) {
                if (view.getParent() != null) {
                    try {
                        view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i2);
                    } catch (AbstractMethodError unused) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(view.getParent().getClass().getSimpleName());
                        sb.append(" does not fully implement ViewParent");
                    }
                }
            } else {
                AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(obtain2);
                obtain2.setEventType(32);
                obtain2.setContentChangeTypes(i2);
                obtain2.setSource(view);
                view.onPopulateAccessibilityEvent(obtain2);
                obtain2.getText().add(l(view));
                accessibilityManager.sendAccessibilityEvent(obtain2);
            }
        }
    }

    public static void U(View view, int i2) {
        view.offsetLeftAndRight(i2);
    }

    public static void V(View view, int i2) {
        view.offsetTopAndBottom(i2);
    }

    public static b91 W(View view, b91 b91Var) {
        WindowInsets s = b91Var.s();
        if (s != null) {
            WindowInsets b2 = g.b(view, s);
            if (!b2.equals(s)) {
                return b91.u(b2, view);
            }
        }
        return b91Var;
    }

    public static void X(View view, p0 p0Var) {
        view.onInitializeAccessibilityNodeInfo(p0Var.B0());
    }

    public static f Y() {
        return new b(pm0.K, CharSequence.class, 8, 28);
    }

    public static boolean Z(View view, int i2, Bundle bundle) {
        return view.performAccessibilityAction(i2, bundle);
    }

    public static uf a0(View view, uf ufVar) {
        if (Log.isLoggable("ViewCompat", 3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("performReceiveContent: ");
            sb.append(ufVar);
            sb.append(", view=");
            sb.append(view.getClass().getSimpleName());
            sb.append("[");
            sb.append(view.getId());
            sb.append("]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return n.b(view, ufVar);
        }
        mg0 mg0Var = (mg0) view.getTag(pm0.M);
        if (mg0Var != null) {
            uf a2 = mg0Var.a(view, ufVar);
            if (a2 == null) {
                return null;
            }
            return t(view).a(a2);
        }
        return t(view).a(ufVar);
    }

    public static f b() {
        return new d(pm0.J, Boolean.class, 28);
    }

    public static void b0(View view) {
        view.postInvalidateOnAnimation();
    }

    public static int c(View view, CharSequence charSequence, s0 s0Var) {
        int n2 = n(view, charSequence);
        if (n2 != -1) {
            d(view, new p0.a(n2, charSequence, s0Var));
        }
        return n2;
    }

    public static void c0(View view, Runnable runnable) {
        view.postOnAnimation(runnable);
    }

    public static void d(View view, p0.a aVar) {
        g(view);
        f0(aVar.b(), view);
        m(view).add(aVar);
        T(view, 0);
    }

    public static void d0(View view, Runnable runnable, long j2) {
        view.postOnAnimationDelayed(runnable, j2);
    }

    public static b91 e(View view, b91 b91Var, Rect rect) {
        return h.b(view, b91Var, rect);
    }

    public static void e0(View view, int i2) {
        f0(i2, view);
        T(view, 0);
    }

    public static b91 f(View view, b91 b91Var) {
        WindowInsets s = b91Var.s();
        if (s != null) {
            WindowInsets a2 = g.a(view, s);
            if (!a2.equals(s)) {
                return b91.u(a2, view);
            }
        }
        return b91Var;
    }

    public static void f0(int i2, View view) {
        List m2 = m(view);
        for (int i3 = 0; i3 < m2.size(); i3++) {
            if (((p0.a) m2.get(i3)).b() == i2) {
                m2.remove(i3);
                return;
            }
        }
    }

    public static void g(View view) {
        b0 i2 = i(view);
        if (i2 == null) {
            i2 = new b0();
        }
        k0(view, i2);
    }

    public static void g0(View view, p0.a aVar, CharSequence charSequence, s0 s0Var) {
        if (s0Var == null && charSequence == null) {
            e0(view, aVar.b());
        } else {
            d(view, aVar.a(charSequence, s0Var));
        }
    }

    public static int h() {
        return View.generateViewId();
    }

    public static void h0(View view) {
        g.c(view);
    }

    public static b0 i(View view) {
        View.AccessibilityDelegate j2 = j(view);
        if (j2 == null) {
            return null;
        }
        return j2 instanceof b0.a ? ((b0.a) j2).a : new b0(j2);
    }

    public static void i0(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i2, int i3) {
        if (Build.VERSION.SDK_INT >= 29) {
            l.d(view, context, iArr, attributeSet, typedArray, i2, i3);
        }
    }

    public static View.AccessibilityDelegate j(View view) {
        return Build.VERSION.SDK_INT >= 29 ? l.a(view) : k(view);
    }

    public static f j0() {
        return new a(pm0.O, Boolean.class, 28);
    }

    public static View.AccessibilityDelegate k(View view) {
        if (b) {
            return null;
        }
        if (a == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                a = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                b = true;
                return null;
            }
        }
        try {
            Object obj = a.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            b = true;
            return null;
        }
    }

    public static void k0(View view, b0 b0Var) {
        if (b0Var == null && (j(view) instanceof b0.a)) {
            b0Var = new b0();
        }
        v0(view);
        view.setAccessibilityDelegate(b0Var == null ? null : b0Var.d());
    }

    public static CharSequence l(View view) {
        return (CharSequence) Y().e(view);
    }

    public static void l0(View view, boolean z) {
        b().f(view, Boolean.valueOf(z));
    }

    public static List m(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(pm0.H);
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            view.setTag(pm0.H, arrayList2);
            return arrayList2;
        }
        return arrayList;
    }

    public static void m0(View view, int i2) {
        view.setAccessibilityLiveRegion(i2);
    }

    public static int n(View view, CharSequence charSequence) {
        List m2 = m(view);
        for (int i2 = 0; i2 < m2.size(); i2++) {
            if (TextUtils.equals(charSequence, ((p0.a) m2.get(i2)).c())) {
                return ((p0.a) m2.get(i2)).b();
            }
        }
        int i3 = -1;
        int i4 = 0;
        while (true) {
            int[] iArr = c;
            if (i4 >= iArr.length || i3 != -1) {
                break;
            }
            int i5 = iArr[i4];
            boolean z = true;
            for (int i6 = 0; i6 < m2.size(); i6++) {
                z &= ((p0.a) m2.get(i6)).b() != i5;
            }
            if (z) {
                i3 = i5;
            }
            i4++;
        }
        return i3;
    }

    public static void n0(View view, CharSequence charSequence) {
        Y().f(view, charSequence);
        if (charSequence != null) {
            e.a(view);
        } else {
            e.c(view);
        }
    }

    public static ColorStateList o(View view) {
        return h.g(view);
    }

    public static void o0(View view, Drawable drawable) {
        view.setBackground(drawable);
    }

    public static PorterDuff.Mode p(View view) {
        return h.h(view);
    }

    public static void p0(View view, ColorStateList colorStateList) {
        h.q(view, colorStateList);
    }

    public static Rect q(View view) {
        return view.getClipBounds();
    }

    public static void q0(View view, PorterDuff.Mode mode) {
        h.r(view, mode);
    }

    public static Display r(View view) {
        return view.getDisplay();
    }

    public static void r0(View view, Rect rect) {
        view.setClipBounds(rect);
    }

    public static float s(View view) {
        return h.i(view);
    }

    public static void s0(View view, float f2) {
        h.s(view, f2);
    }

    public static ng0 t(View view) {
        return view instanceof ng0 ? (ng0) view : d;
    }

    public static void t0(View view, boolean z) {
        view.setHasTransientState(z);
    }

    public static boolean u(View view) {
        return view.getFitsSystemWindows();
    }

    public static void u0(View view, int i2) {
        view.setImportantForAccessibility(i2);
    }

    public static int v(View view) {
        return view.getImportantForAccessibility();
    }

    public static void v0(View view) {
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
    }

    public static int w(View view) {
        return j.c(view);
    }

    public static void w0(View view, int i2) {
        j.m(view, i2);
    }

    public static int x(View view) {
        return view.getLayoutDirection();
    }

    public static void x0(View view, int i2) {
        view.setLabelFor(i2);
    }

    public static int y(View view) {
        return view.getMinimumHeight();
    }

    public static void y0(View view, dg0 dg0Var) {
        h.u(view, dg0Var);
    }

    public static int z(View view) {
        return view.getMinimumWidth();
    }

    public static void z0(View view, int i2, int i3, int i4, int i5) {
        view.setPaddingRelative(i2, i3, i4, i5);
    }
}
