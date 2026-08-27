package androidx.appcompat.view.menu;

import android.content.pm.PackageParser;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.appcompat.view.menu.s0;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public class p0 {
    public final AccessibilityNodeInfo a;
    public int b = -1;
    public int c = -1;

    /* loaded from: classes.dex */
    public static class a {
        public static final a A;
        public static final a B;
        public static final a C;
        public static final a D;
        public static final a E;
        public static final a F;
        public static final a G;
        public static final a H;
        public static final a I;
        public static final a J;
        public static final a K;
        public static final a L;
        public static final a M;
        public static final a N;
        public static final a O;
        public static final a P;
        public static final a Q;
        public static final a R;
        public static final a S;
        public static final a T;
        public static final a U;
        public static final a V;
        public static final a e = new a(1, null);
        public static final a f = new a(2, null);
        public static final a g = new a(4, null);
        public static final a h = new a(8, null);
        public static final a i = new a(16, null);
        public static final a j = new a(32, null);
        public static final a k = new a(64, null);
        public static final a l = new a(PackageParser.PARSE_IS_PRIVILEGED, null);
        public static final a m = new a((int) PackageParser.PARSE_COLLECT_CERTIFICATES, (CharSequence) null, s0.b.class);
        public static final a n = new a((int) PackageParser.PARSE_TRUSTED_OVERLAY, (CharSequence) null, s0.b.class);
        public static final a o = new a(1024, (CharSequence) null, s0.c.class);
        public static final a p = new a(2048, (CharSequence) null, s0.c.class);
        public static final a q = new a(4096, null);
        public static final a r = new a(8192, null);
        public static final a s = new a(16384, null);
        public static final a t = new a(32768, null);
        public static final a u = new a(65536, null);
        public static final a v = new a(131072, (CharSequence) null, s0.g.class);
        public static final a w = new a(262144, null);
        public static final a x = new a(524288, null);
        public static final a y = new a(1048576, null);
        public static final a z = new a(2097152, (CharSequence) null, s0.h.class);
        public final Object a;
        public final int b;
        public final Class c;
        public final s0 d;

        static {
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction2;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction3;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction4;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction5;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction6;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction7;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction8;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction9;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction10;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction11;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction12;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction13;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction14;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction15;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction16;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction17;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction18;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction19;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction20;
            int i2 = Build.VERSION.SDK_INT;
            A = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, 16908342, null, null, null);
            B = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, 16908343, null, null, s0.e.class);
            C = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, 16908344, null, null, null);
            D = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, 16908345, null, null, null);
            E = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, 16908346, null, null, null);
            F = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, 16908347, null, null, null);
            if (i2 >= 29) {
                accessibilityAction20 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP;
                accessibilityAction = accessibilityAction20;
            } else {
                accessibilityAction = null;
            }
            G = new a(accessibilityAction, 16908358, null, null, null);
            if (i2 >= 29) {
                accessibilityAction19 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN;
                accessibilityAction2 = accessibilityAction19;
            } else {
                accessibilityAction2 = null;
            }
            H = new a(accessibilityAction2, 16908359, null, null, null);
            if (i2 >= 29) {
                accessibilityAction18 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT;
                accessibilityAction3 = accessibilityAction18;
            } else {
                accessibilityAction3 = null;
            }
            I = new a(accessibilityAction3, 16908360, null, null, null);
            if (i2 >= 29) {
                accessibilityAction17 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT;
                accessibilityAction4 = accessibilityAction17;
            } else {
                accessibilityAction4 = null;
            }
            J = new a(accessibilityAction4, 16908361, null, null, null);
            K = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, 16908348, null, null, null);
            L = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, 16908349, null, null, s0.f.class);
            M = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW, 16908354, null, null, s0.d.class);
            N = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP, 16908356, null, null, null);
            O = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP, 16908357, null, null, null);
            if (i2 >= 30) {
                accessibilityAction16 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD;
                accessibilityAction5 = accessibilityAction16;
            } else {
                accessibilityAction5 = null;
            }
            P = new a(accessibilityAction5, 16908362, null, null, null);
            if (i2 >= 30) {
                accessibilityAction15 = AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER;
                accessibilityAction6 = accessibilityAction15;
            } else {
                accessibilityAction6 = null;
            }
            Q = new a(accessibilityAction6, 16908372, null, null, null);
            if (i2 >= 32) {
                accessibilityAction14 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START;
                accessibilityAction7 = accessibilityAction14;
            } else {
                accessibilityAction7 = null;
            }
            R = new a(accessibilityAction7, 16908373, null, null, null);
            if (i2 >= 32) {
                accessibilityAction13 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP;
                accessibilityAction8 = accessibilityAction13;
            } else {
                accessibilityAction8 = null;
            }
            S = new a(accessibilityAction8, 16908374, null, null, null);
            if (i2 >= 32) {
                accessibilityAction12 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL;
                accessibilityAction9 = accessibilityAction12;
            } else {
                accessibilityAction9 = null;
            }
            T = new a(accessibilityAction9, 16908375, null, null, null);
            if (i2 >= 33) {
                accessibilityAction11 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS;
                accessibilityAction10 = accessibilityAction11;
            } else {
                accessibilityAction10 = null;
            }
            U = new a(accessibilityAction10, 16908376, null, null, null);
            V = new a(i2 >= 34 ? d.a() : null, 16908382, null, null, null);
        }

        public a(int i2, CharSequence charSequence) {
            this(null, i2, charSequence, null, null);
        }

        public a a(CharSequence charSequence, s0 s0Var) {
            return new a(null, this.b, charSequence, s0Var, this.c);
        }

        public int b() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.a).getId();
        }

        public CharSequence c() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.a).getLabel();
        }

        public boolean d(View view, Bundle bundle) {
            if (this.d != null) {
                Class cls = this.c;
                if (cls != null) {
                    try {
                        my0.a(cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                        throw null;
                    } catch (Exception unused) {
                        Class cls2 = this.c;
                        String name = cls2 == null ? "null" : cls2.getName();
                        StringBuilder sb = new StringBuilder();
                        sb.append("Failed to execute command with argument class ViewCommandArgument: ");
                        sb.append(name);
                    }
                }
                return this.d.a(view, null);
            }
            return false;
        }

        public boolean equals(Object obj) {
            if (obj != null && (obj instanceof a)) {
                a aVar = (a) obj;
                Object obj2 = this.a;
                return obj2 == null ? aVar.a == null : obj2.equals(aVar.a);
            }
            return false;
        }

        public int hashCode() {
            Object obj = this.a;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("AccessibilityActionCompat: ");
            String g2 = p0.g(this.b);
            if (g2.equals("ACTION_UNKNOWN") && c() != null) {
                g2 = c().toString();
            }
            sb.append(g2);
            return sb.toString();
        }

        public a(int i2, CharSequence charSequence, s0 s0Var) {
            this(null, i2, charSequence, s0Var, null);
        }

        public a(Object obj) {
            this(obj, 0, null, null, null);
        }

        public a(int i2, CharSequence charSequence, Class cls) {
            this(null, i2, charSequence, null, cls);
        }

        public a(Object obj, int i2, CharSequence charSequence, s0 s0Var, Class cls) {
            this.b = i2;
            this.d = s0Var;
            if (obj == null) {
                this.a = new AccessibilityNodeInfo.AccessibilityAction(i2, charSequence);
            } else {
                this.a = obj;
            }
            this.c = cls;
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public static Object a(int i, float f, float f2, float f3) {
            return new AccessibilityNodeInfo.RangeInfo(i, f, f2, f3);
        }

        public static CharSequence b(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getStateDescription();
        }

        public static void c(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
            accessibilityNodeInfo.setStateDescription(charSequence);
        }
    }

    /* loaded from: classes.dex */
    public static class c {
        public static f a(boolean z, int i, int i2, int i3, int i4, boolean z2, String str, String str2) {
            return new f(new AccessibilityNodeInfo.CollectionItemInfo.Builder().setHeading(z).setColumnIndex(i).setRowIndex(i2).setColumnSpan(i3).setRowSpan(i4).setSelected(z2).setRowTitle(str).setColumnTitle(str2).build());
        }

        public static p0 b(AccessibilityNodeInfo accessibilityNodeInfo, int i, int i2) {
            return p0.D0(accessibilityNodeInfo.getChild(i, i2));
        }

        public static String c(Object obj) {
            return ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnTitle();
        }

        public static String d(Object obj) {
            return ((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowTitle();
        }

        public static AccessibilityNodeInfo.ExtraRenderingInfo e(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getExtraRenderingInfo();
        }

        public static p0 f(AccessibilityNodeInfo accessibilityNodeInfo, int i) {
            return p0.D0(accessibilityNodeInfo.getParent(i));
        }

        public static String g(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getUniqueId();
        }

        public static boolean h(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isTextSelectable();
        }

        public static void i(AccessibilityNodeInfo accessibilityNodeInfo, boolean z) {
            accessibilityNodeInfo.setTextSelectable(z);
        }

        public static void j(AccessibilityNodeInfo accessibilityNodeInfo, String str) {
            accessibilityNodeInfo.setUniqueId(str);
        }
    }

    /* loaded from: classes.dex */
    public static class d {
        public static AccessibilityNodeInfo.AccessibilityAction a() {
            return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION;
        }

        public static void b(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
            accessibilityNodeInfo.getBoundsInWindow(rect);
        }

        public static CharSequence c(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getContainerTitle();
        }

        public static long d(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getMinDurationBetweenContentChanges().toMillis();
        }

        public static boolean e(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.hasRequestInitialAccessibilityFocus();
        }

        public static boolean f(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isAccessibilityDataSensitive();
        }

        public static void g(AccessibilityNodeInfo accessibilityNodeInfo, boolean z) {
            accessibilityNodeInfo.setAccessibilityDataSensitive(z);
        }

        public static void h(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
            accessibilityNodeInfo.setBoundsInWindow(rect);
        }

        public static void i(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
            accessibilityNodeInfo.setContainerTitle(charSequence);
        }

        public static void j(AccessibilityNodeInfo accessibilityNodeInfo, long j) {
            accessibilityNodeInfo.setMinDurationBetweenContentChanges(Duration.ofMillis(j));
        }

        public static void k(AccessibilityNodeInfo accessibilityNodeInfo, View view, boolean z) {
            accessibilityNodeInfo.setQueryFromAppProcessEnabled(view, z);
        }

        public static void l(AccessibilityNodeInfo accessibilityNodeInfo, boolean z) {
            accessibilityNodeInfo.setRequestInitialAccessibilityFocus(z);
        }
    }

    /* loaded from: classes.dex */
    public static class e {
        public final Object a;

        public e(Object obj) {
            this.a = obj;
        }

        public static e a(int i, int i2, boolean z, int i3) {
            return new e(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z, i3));
        }
    }

    /* loaded from: classes.dex */
    public static class f {
        public final Object a;

        public f(Object obj) {
            this.a = obj;
        }

        public static f a(int i, int i2, int i3, int i4, boolean z, boolean z2) {
            return new f(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z, z2));
        }
    }

    public p0(Object obj) {
        this.a = (AccessibilityNodeInfo) obj;
    }

    public static p0 C0(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new p0(accessibilityNodeInfo);
    }

    public static p0 D0(Object obj) {
        if (obj != null) {
            return new p0(obj);
        }
        return null;
    }

    public static p0 S() {
        return C0(AccessibilityNodeInfo.obtain());
    }

    public static p0 T(View view) {
        return C0(AccessibilityNodeInfo.obtain(view));
    }

    public static p0 U(p0 p0Var) {
        return C0(AccessibilityNodeInfo.obtain(p0Var.a));
    }

    public static String g(int i) {
        if (i != 1) {
            if (i != 2) {
                switch (i) {
                    case 4:
                        return "ACTION_SELECT";
                    case PackageParser.PARSE_IGNORE_PROCESSES /* 8 */:
                        return "ACTION_CLEAR_SELECTION";
                    case PackageParser.PARSE_FORWARD_LOCK /* 16 */:
                        return "ACTION_CLICK";
                    case PackageParser.PARSE_EXTERNAL_STORAGE /* 32 */:
                        return "ACTION_LONG_CLICK";
                    case PackageParser.PARSE_IS_SYSTEM_DIR /* 64 */:
                        return "ACTION_ACCESSIBILITY_FOCUS";
                    case PackageParser.PARSE_IS_PRIVILEGED /* 128 */:
                        return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
                    case PackageParser.PARSE_COLLECT_CERTIFICATES /* 256 */:
                        return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
                    case PackageParser.PARSE_TRUSTED_OVERLAY /* 512 */:
                        return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
                    case 1024:
                        return "ACTION_NEXT_HTML_ELEMENT";
                    case 2048:
                        return "ACTION_PREVIOUS_HTML_ELEMENT";
                    case 4096:
                        return "ACTION_SCROLL_FORWARD";
                    case 8192:
                        return "ACTION_SCROLL_BACKWARD";
                    case 16384:
                        return "ACTION_COPY";
                    case 32768:
                        return "ACTION_PASTE";
                    case 65536:
                        return "ACTION_CUT";
                    case 131072:
                        return "ACTION_SET_SELECTION";
                    case 262144:
                        return "ACTION_EXPAND";
                    case 524288:
                        return "ACTION_COLLAPSE";
                    case 2097152:
                        return "ACTION_SET_TEXT";
                    case 16908354:
                        return "ACTION_MOVE_WINDOW";
                    case 16908382:
                        return "ACTION_SCROLL_IN_DIRECTION";
                    default:
                        switch (i) {
                            case 16908342:
                                return "ACTION_SHOW_ON_SCREEN";
                            case 16908343:
                                return "ACTION_SCROLL_TO_POSITION";
                            case 16908344:
                                return "ACTION_SCROLL_UP";
                            case 16908345:
                                return "ACTION_SCROLL_LEFT";
                            case 16908346:
                                return "ACTION_SCROLL_DOWN";
                            case 16908347:
                                return "ACTION_SCROLL_RIGHT";
                            case 16908348:
                                return "ACTION_CONTEXT_CLICK";
                            case 16908349:
                                return "ACTION_SET_PROGRESS";
                            default:
                                switch (i) {
                                    case 16908356:
                                        return "ACTION_SHOW_TOOLTIP";
                                    case 16908357:
                                        return "ACTION_HIDE_TOOLTIP";
                                    case 16908358:
                                        return "ACTION_PAGE_UP";
                                    case 16908359:
                                        return "ACTION_PAGE_DOWN";
                                    case 16908360:
                                        return "ACTION_PAGE_LEFT";
                                    case 16908361:
                                        return "ACTION_PAGE_RIGHT";
                                    case 16908362:
                                        return "ACTION_PRESS_AND_HOLD";
                                    default:
                                        switch (i) {
                                            case 16908372:
                                                return "ACTION_IME_ENTER";
                                            case 16908373:
                                                return "ACTION_DRAG_START";
                                            case 16908374:
                                                return "ACTION_DRAG_DROP";
                                            case 16908375:
                                                return "ACTION_DRAG_CANCEL";
                                            default:
                                                return "ACTION_UNKNOWN";
                                        }
                                }
                        }
                }
            }
            return "ACTION_CLEAR_FOCUS";
        }
        return "ACTION_FOCUS";
    }

    public static ClickableSpan[] o(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    public final boolean A() {
        return !e("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
    }

    public void A0(boolean z) {
        this.a.setVisibleToUser(z);
    }

    public boolean B() {
        return Build.VERSION.SDK_INT >= 34 ? d.f(this.a) : i(64);
    }

    public AccessibilityNodeInfo B0() {
        return this.a;
    }

    public boolean C() {
        return this.a.isCheckable();
    }

    public boolean D() {
        return this.a.isChecked();
    }

    public boolean E() {
        return this.a.isClickable();
    }

    public boolean F() {
        return this.a.isContextClickable();
    }

    public boolean G() {
        return this.a.isEnabled();
    }

    public boolean H() {
        return this.a.isFocusable();
    }

    public boolean I() {
        return this.a.isFocused();
    }

    public boolean J() {
        return i(67108864);
    }

    public boolean K() {
        return this.a.isImportantForAccessibility();
    }

    public boolean L() {
        return this.a.isLongClickable();
    }

    public boolean M() {
        return this.a.isPassword();
    }

    public boolean N() {
        return this.a.isScrollable();
    }

    public boolean O() {
        return this.a.isSelected();
    }

    public boolean P() {
        return this.a.isShowingHintText();
    }

    public boolean Q() {
        return Build.VERSION.SDK_INT >= 33 ? c.h(this.a) : i(8388608);
    }

    public boolean R() {
        return this.a.isVisibleToUser();
    }

    public boolean V(int i, Bundle bundle) {
        return this.a.performAction(i, bundle);
    }

    public void W() {
    }

    public void X(boolean z) {
        this.a.setAccessibilityFocused(z);
    }

    public void Y(Rect rect) {
        this.a.setBoundsInParent(rect);
    }

    public void Z(Rect rect) {
        this.a.setBoundsInScreen(rect);
    }

    public void a(int i) {
        this.a.addAction(i);
    }

    public void a0(boolean z) {
        this.a.setCheckable(z);
    }

    public void b(a aVar) {
        this.a.addAction((AccessibilityNodeInfo.AccessibilityAction) aVar.a);
    }

    public void b0(boolean z) {
        this.a.setChecked(z);
    }

    public void c(View view, int i) {
        this.a.addChild(view, i);
    }

    public void c0(CharSequence charSequence) {
        this.a.setClassName(charSequence);
    }

    public void d(CharSequence charSequence, View view) {
    }

    public void d0(boolean z) {
        this.a.setClickable(z);
    }

    public final List e(String str) {
        ArrayList<Integer> integerArrayList = this.a.getExtras().getIntegerArrayList(str);
        if (integerArrayList == null) {
            ArrayList<Integer> arrayList = new ArrayList<>();
            this.a.getExtras().putIntegerArrayList(str, arrayList);
            return arrayList;
        }
        return integerArrayList;
    }

    public void e0(Object obj) {
        this.a.setCollectionInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionInfo) ((e) obj).a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof p0)) {
            p0 p0Var = (p0) obj;
            AccessibilityNodeInfo accessibilityNodeInfo = this.a;
            if (accessibilityNodeInfo == null) {
                if (p0Var.a != null) {
                    return false;
                }
            } else if (!accessibilityNodeInfo.equals(p0Var.a)) {
                return false;
            }
            return this.c == p0Var.c && this.b == p0Var.b;
        }
        return false;
    }

    public List f() {
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = this.a.getActionList();
        if (actionList != null) {
            ArrayList arrayList = new ArrayList();
            int size = actionList.size();
            for (int i = 0; i < size; i++) {
                arrayList.add(new a(actionList.get(i)));
            }
            return arrayList;
        }
        return Collections.emptyList();
    }

    public void f0(Object obj) {
        this.a.setCollectionItemInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionItemInfo) ((f) obj).a);
    }

    public void g0(CharSequence charSequence) {
        this.a.setContentDescription(charSequence);
    }

    public int h() {
        return this.a.getActions();
    }

    public void h0(boolean z) {
        this.a.setEnabled(z);
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public final boolean i(int i) {
        Bundle s = s();
        return s != null && (s.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & i) == i;
    }

    public void i0(CharSequence charSequence) {
        this.a.setError(charSequence);
    }

    public void j(Rect rect) {
        this.a.getBoundsInParent(rect);
    }

    public void j0(boolean z) {
        this.a.setFocusable(z);
    }

    public void k(Rect rect) {
        this.a.getBoundsInScreen(rect);
    }

    public void k0(boolean z) {
        this.a.setFocused(z);
    }

    public void l(Rect rect) {
        if (Build.VERSION.SDK_INT >= 34) {
            d.b(this.a, rect);
            return;
        }
        Rect rect2 = (Rect) this.a.getExtras().getParcelable("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOUNDS_IN_WINDOW_KEY");
        if (rect2 != null) {
            rect.set(rect2.left, rect2.top, rect2.right, rect2.bottom);
        }
    }

    public void l0(boolean z) {
        this.a.setHeading(z);
    }

    public int m() {
        return this.a.getChildCount();
    }

    public void m0(CharSequence charSequence) {
        this.a.setHintText(charSequence);
    }

    public CharSequence n() {
        return this.a.getClassName();
    }

    public void n0(View view) {
        this.a.setLabelFor(view);
    }

    public void o0(int i) {
        this.a.setMaxTextLength(i);
    }

    public CharSequence p() {
        return Build.VERSION.SDK_INT >= 34 ? d.c(this.a) : this.a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.CONTAINER_TITLE_KEY");
    }

    public void p0(CharSequence charSequence) {
        this.a.setPackageName(charSequence);
    }

    public CharSequence q() {
        return this.a.getContentDescription();
    }

    public void q0(CharSequence charSequence) {
        this.a.setPaneTitle(charSequence);
    }

    public CharSequence r() {
        return this.a.getError();
    }

    public void r0(View view) {
        this.b = -1;
        this.a.setParent(view);
    }

    public Bundle s() {
        return this.a.getExtras();
    }

    public void s0(View view, int i) {
        this.b = i;
        this.a.setParent(view, i);
    }

    public int t() {
        return this.a.getMaxTextLength();
    }

    public void t0(boolean z) {
        this.a.setScreenReaderFocusable(z);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        j(rect);
        sb.append("; boundsInParent: " + rect);
        k(rect);
        sb.append("; boundsInScreen: " + rect);
        l(rect);
        sb.append("; boundsInWindow: " + rect);
        sb.append("; packageName: ");
        sb.append(u());
        sb.append("; className: ");
        sb.append(n());
        sb.append("; text: ");
        sb.append(w());
        sb.append("; error: ");
        sb.append(r());
        sb.append("; maxTextLength: ");
        sb.append(t());
        sb.append("; stateDescription: ");
        sb.append(v());
        sb.append("; contentDescription: ");
        sb.append(q());
        sb.append("; tooltipText: ");
        sb.append(x());
        sb.append("; viewIdResName: ");
        sb.append(z());
        sb.append("; uniqueId: ");
        sb.append(y());
        sb.append("; checkable: ");
        sb.append(C());
        sb.append("; checked: ");
        sb.append(D());
        sb.append("; focusable: ");
        sb.append(H());
        sb.append("; focused: ");
        sb.append(I());
        sb.append("; selected: ");
        sb.append(O());
        sb.append("; clickable: ");
        sb.append(E());
        sb.append("; longClickable: ");
        sb.append(L());
        sb.append("; contextClickable: ");
        sb.append(F());
        sb.append("; enabled: ");
        sb.append(G());
        sb.append("; password: ");
        sb.append(M());
        sb.append("; scrollable: " + N());
        sb.append("; containerTitle: ");
        sb.append(p());
        sb.append("; granularScrollingSupported: ");
        sb.append(J());
        sb.append("; importantForAccessibility: ");
        sb.append(K());
        sb.append("; visible: ");
        sb.append(R());
        sb.append("; isTextSelectable: ");
        sb.append(Q());
        sb.append("; accessibilityDataSensitive: ");
        sb.append(B());
        sb.append("; [");
        List f2 = f();
        for (int i = 0; i < f2.size(); i++) {
            a aVar = (a) f2.get(i);
            String g = g(aVar.b());
            if (g.equals("ACTION_UNKNOWN") && aVar.c() != null) {
                g = aVar.c().toString();
            }
            sb.append(g);
            if (i != f2.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public CharSequence u() {
        return this.a.getPackageName();
    }

    public void u0(boolean z) {
        this.a.setScrollable(z);
    }

    public CharSequence v() {
        return Build.VERSION.SDK_INT >= 30 ? b.b(this.a) : this.a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY");
    }

    public void v0(boolean z) {
        this.a.setShowingHintText(z);
    }

    public CharSequence w() {
        if (A()) {
            List e2 = e("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            List e3 = e("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            List e4 = e("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            List e5 = e("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
            SpannableString spannableString = new SpannableString(TextUtils.substring(this.a.getText(), 0, this.a.getText().length()));
            for (int i = 0; i < e2.size(); i++) {
                spannableString.setSpan(new a0(((Integer) e5.get(i)).intValue(), this, s().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), ((Integer) e2.get(i)).intValue(), ((Integer) e3.get(i)).intValue(), ((Integer) e4.get(i)).intValue());
            }
            return spannableString;
        }
        return this.a.getText();
    }

    public void w0(View view, int i) {
        this.c = i;
        this.a.setSource(view, i);
    }

    public CharSequence x() {
        return this.a.getTooltipText();
    }

    public void x0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 30) {
            b.c(this.a, charSequence);
        } else {
            this.a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
    }

    public String y() {
        return Build.VERSION.SDK_INT >= 33 ? c.g(this.a) : this.a.getExtras().getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY");
    }

    public void y0(CharSequence charSequence) {
        this.a.setText(charSequence);
    }

    public String z() {
        return this.a.getViewIdResourceName();
    }

    public void z0(View view) {
        this.a.setTraversalAfter(view);
    }

    public p0(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.a = accessibilityNodeInfo;
    }
}
