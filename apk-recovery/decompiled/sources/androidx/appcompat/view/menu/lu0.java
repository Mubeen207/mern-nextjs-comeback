package androidx.appcompat.view.menu;

import android.graphics.Rect;
import androidx.appcompat.view.menu.lw0;
import androidx.appcompat.view.menu.uu;
import androidx.appcompat.view.menu.xy;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public final class lu0 {
    public static final a b = new a(null);
    public static final String c = lu0.class.getSimpleName();
    public final h51 a;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(lj ljVar) {
            this();
        }

        public final int a(SidecarDeviceState sidecarDeviceState) {
            c60.e(sidecarDeviceState, "sidecarDeviceState");
            try {
                return sidecarDeviceState.posture;
            } catch (NoSuchFieldError unused) {
                try {
                    Object invoke = SidecarDeviceState.class.getMethod("getPosture", new Class[0]).invoke(sidecarDeviceState, new Object[0]);
                    c60.c(invoke, "null cannot be cast to non-null type kotlin.Int");
                    return ((Integer) invoke).intValue();
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
                    return 0;
                }
            }
        }

        public final int b(SidecarDeviceState sidecarDeviceState) {
            c60.e(sidecarDeviceState, "sidecarDeviceState");
            int a = a(sidecarDeviceState);
            if (a < 0 || a > 4) {
                return 0;
            }
            return a;
        }

        public final List c(SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
            List e;
            List e2;
            c60.e(sidecarWindowLayoutInfo, "info");
            try {
                try {
                    List list = sidecarWindowLayoutInfo.displayFeatures;
                    if (list == null) {
                        e2 = sc.e();
                        return e2;
                    }
                    return list;
                } catch (NoSuchFieldError unused) {
                    Object invoke = SidecarWindowLayoutInfo.class.getMethod("getDisplayFeatures", new Class[0]).invoke(sidecarWindowLayoutInfo, new Object[0]);
                    c60.c(invoke, "null cannot be cast to non-null type kotlin.collections.List<androidx.window.sidecar.SidecarDisplayFeature>");
                    return (List) invoke;
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
                e = sc.e();
                return e;
            }
        }

        public final void d(SidecarDeviceState sidecarDeviceState, int i) {
            c60.e(sidecarDeviceState, "sidecarDeviceState");
            try {
                try {
                    sidecarDeviceState.posture = i;
                } catch (NoSuchFieldError unused) {
                    SidecarDeviceState.class.getMethod("setPosture", Integer.TYPE).invoke(sidecarDeviceState, Integer.valueOf(i));
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends j80 implements kw {
        public static final b n = new b();

        public b() {
            super(1);
        }

        @Override // androidx.appcompat.view.menu.kw
        /* renamed from: a */
        public final Boolean i(SidecarDisplayFeature sidecarDisplayFeature) {
            c60.e(sidecarDisplayFeature, "$this$require");
            boolean z = true;
            if (sidecarDisplayFeature.getType() != 1 && sidecarDisplayFeature.getType() != 2) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends j80 implements kw {
        public static final c n = new c();

        public c() {
            super(1);
        }

        @Override // androidx.appcompat.view.menu.kw
        /* renamed from: a */
        public final Boolean i(SidecarDisplayFeature sidecarDisplayFeature) {
            c60.e(sidecarDisplayFeature, "$this$require");
            return Boolean.valueOf((sidecarDisplayFeature.getRect().width() == 0 && sidecarDisplayFeature.getRect().height() == 0) ? false : true);
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends j80 implements kw {
        public static final d n = new d();

        public d() {
            super(1);
        }

        @Override // androidx.appcompat.view.menu.kw
        /* renamed from: a */
        public final Boolean i(SidecarDisplayFeature sidecarDisplayFeature) {
            c60.e(sidecarDisplayFeature, "$this$require");
            boolean z = true;
            if (sidecarDisplayFeature.getType() == 1 && sidecarDisplayFeature.getRect().width() != 0 && sidecarDisplayFeature.getRect().height() != 0) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends j80 implements kw {
        public static final e n = new e();

        public e() {
            super(1);
        }

        @Override // androidx.appcompat.view.menu.kw
        /* renamed from: a */
        public final Boolean i(SidecarDisplayFeature sidecarDisplayFeature) {
            c60.e(sidecarDisplayFeature, "$this$require");
            return Boolean.valueOf(sidecarDisplayFeature.getRect().left == 0 || sidecarDisplayFeature.getRect().top == 0);
        }
    }

    public lu0(h51 h51Var) {
        c60.e(h51Var, "verificationMode");
        this.a = h51Var;
    }

    public final boolean a(SidecarDeviceState sidecarDeviceState, SidecarDeviceState sidecarDeviceState2) {
        if (c60.a(sidecarDeviceState, sidecarDeviceState2)) {
            return true;
        }
        if (sidecarDeviceState == null || sidecarDeviceState2 == null) {
            return false;
        }
        a aVar = b;
        return aVar.b(sidecarDeviceState) == aVar.b(sidecarDeviceState2);
    }

    public final boolean b(SidecarDisplayFeature sidecarDisplayFeature, SidecarDisplayFeature sidecarDisplayFeature2) {
        if (c60.a(sidecarDisplayFeature, sidecarDisplayFeature2)) {
            return true;
        }
        if (sidecarDisplayFeature == null || sidecarDisplayFeature2 == null || sidecarDisplayFeature.getType() != sidecarDisplayFeature2.getType()) {
            return false;
        }
        return c60.a(sidecarDisplayFeature.getRect(), sidecarDisplayFeature2.getRect());
    }

    public final boolean c(List list, List list2) {
        if (list == list2) {
            return true;
        }
        if (list == null || list2 == null || list.size() != list2.size()) {
            return false;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!b((SidecarDisplayFeature) list.get(i), (SidecarDisplayFeature) list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    public final boolean d(SidecarWindowLayoutInfo sidecarWindowLayoutInfo, SidecarWindowLayoutInfo sidecarWindowLayoutInfo2) {
        if (c60.a(sidecarWindowLayoutInfo, sidecarWindowLayoutInfo2)) {
            return true;
        }
        if (sidecarWindowLayoutInfo == null || sidecarWindowLayoutInfo2 == null) {
            return false;
        }
        a aVar = b;
        return c(aVar.c(sidecarWindowLayoutInfo), aVar.c(sidecarWindowLayoutInfo2));
    }

    public final ba1 e(SidecarWindowLayoutInfo sidecarWindowLayoutInfo, SidecarDeviceState sidecarDeviceState) {
        List e2;
        c60.e(sidecarDeviceState, "state");
        if (sidecarWindowLayoutInfo == null) {
            e2 = sc.e();
            return new ba1(e2);
        }
        SidecarDeviceState sidecarDeviceState2 = new SidecarDeviceState();
        a aVar = b;
        aVar.d(sidecarDeviceState2, aVar.b(sidecarDeviceState));
        return new ba1(f(aVar.c(sidecarWindowLayoutInfo), sidecarDeviceState2));
    }

    public final List f(List list, SidecarDeviceState sidecarDeviceState) {
        c60.e(list, "sidecarDisplayFeatures");
        c60.e(sidecarDeviceState, "deviceState");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            jm g = g((SidecarDisplayFeature) it.next(), sidecarDeviceState);
            if (g != null) {
                arrayList.add(g);
            }
        }
        return arrayList;
    }

    public final jm g(SidecarDisplayFeature sidecarDisplayFeature, SidecarDeviceState sidecarDeviceState) {
        xy.b a2;
        uu.b bVar;
        c60.e(sidecarDisplayFeature, "feature");
        c60.e(sidecarDeviceState, "deviceState");
        lw0.a aVar = lw0.a;
        String str = c;
        c60.d(str, "TAG");
        SidecarDisplayFeature sidecarDisplayFeature2 = (SidecarDisplayFeature) lw0.a.b(aVar, sidecarDisplayFeature, str, this.a, null, 4, null).c("Type must be either TYPE_FOLD or TYPE_HINGE", b.n).c("Feature bounds must not be 0", c.n).c("TYPE_FOLD must have 0 area", d.n).c("Feature be pinned to either left or top", e.n).a();
        if (sidecarDisplayFeature2 == null) {
            return null;
        }
        int type = sidecarDisplayFeature2.getType();
        if (type == 1) {
            a2 = xy.b.b.a();
        } else if (type != 2) {
            return null;
        } else {
            a2 = xy.b.b.b();
        }
        int b2 = b.b(sidecarDeviceState);
        if (b2 == 0 || b2 == 1) {
            return null;
        }
        if (b2 == 2) {
            bVar = uu.b.d;
        } else if (b2 == 3) {
            bVar = uu.b.c;
        } else if (b2 == 4) {
            return null;
        } else {
            bVar = uu.b.c;
        }
        Rect rect = sidecarDisplayFeature.getRect();
        c60.d(rect, "feature.rect");
        return new xy(new q8(rect), a2, bVar);
    }

    public /* synthetic */ lu0(h51 h51Var, int i, lj ljVar) {
        this((i & 1) != 0 ? h51.QUIET : h51Var);
    }
}
