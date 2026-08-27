package androidx.window.layout.adapter.sidecar;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.IBinder;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.view.menu.ba1;
import androidx.appcompat.view.menu.c60;
import androidx.appcompat.view.menu.j51;
import androidx.appcompat.view.menu.lj;
import androidx.appcompat.view.menu.lu0;
import androidx.appcompat.view.menu.pf;
import androidx.appcompat.view.menu.sc;
import androidx.appcompat.view.menu.u31;
import androidx.window.layout.adapter.sidecar.a;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarProvider;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;
/* loaded from: classes.dex */
public final class SidecarCompat implements androidx.window.layout.adapter.sidecar.a {
    public static final a f = new a(null);
    public final SidecarInterface a;
    public final lu0 b;
    public final Map c;
    public final Map d;
    public b e;

    /* loaded from: classes.dex */
    public final class TranslatingCallback implements SidecarInterface.SidecarCallback {
        public TranslatingCallback() {
        }

        public void onDeviceStateChanged(SidecarDeviceState sidecarDeviceState) {
            SidecarInterface g;
            c60.e(sidecarDeviceState, "newDeviceState");
            SidecarCompat sidecarCompat = SidecarCompat.this;
            for (Activity activity : SidecarCompat.this.c.values()) {
                IBinder a = SidecarCompat.f.a(activity);
                SidecarWindowLayoutInfo sidecarWindowLayoutInfo = null;
                if (a != null && (g = sidecarCompat.g()) != null) {
                    sidecarWindowLayoutInfo = g.getWindowLayoutInfo(a);
                }
                b bVar = sidecarCompat.e;
                if (bVar != null) {
                    bVar.a(activity, sidecarCompat.b.e(sidecarWindowLayoutInfo, sidecarDeviceState));
                }
            }
        }

        public void onWindowLayoutChanged(IBinder iBinder, SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
            SidecarDeviceState sidecarDeviceState;
            c60.e(iBinder, "windowToken");
            c60.e(sidecarWindowLayoutInfo, "newLayout");
            Activity activity = (Activity) SidecarCompat.this.c.get(iBinder);
            if (activity == null) {
                return;
            }
            lu0 lu0Var = SidecarCompat.this.b;
            SidecarInterface g = SidecarCompat.this.g();
            if (g == null || (sidecarDeviceState = g.getDeviceState()) == null) {
                sidecarDeviceState = new SidecarDeviceState();
            }
            ba1 e = lu0Var.e(sidecarWindowLayoutInfo, sidecarDeviceState);
            b bVar = SidecarCompat.this.e;
            if (bVar != null) {
                bVar.a(activity, e);
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(lj ljVar) {
            this();
        }

        public final IBinder a(Activity activity) {
            Window window;
            WindowManager.LayoutParams attributes;
            if (activity == null || (window = activity.getWindow()) == null || (attributes = window.getAttributes()) == null) {
                return null;
            }
            return attributes.token;
        }

        public final SidecarInterface b(Context context) {
            c60.e(context, "context");
            return SidecarProvider.getSidecarImpl(context.getApplicationContext());
        }

        public final j51 c() {
            try {
                String apiVersion = SidecarProvider.getApiVersion();
                if (TextUtils.isEmpty(apiVersion)) {
                    return null;
                }
                return j51.r.b(apiVersion);
            } catch (NoClassDefFoundError | UnsupportedOperationException unused) {
                return null;
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements a.InterfaceC0056a {
        public final a.InterfaceC0056a a;
        public final ReentrantLock b;
        public final WeakHashMap c;

        public b(a.InterfaceC0056a interfaceC0056a) {
            c60.e(interfaceC0056a, "callbackInterface");
            this.a = interfaceC0056a;
            this.b = new ReentrantLock();
            this.c = new WeakHashMap();
        }

        @Override // androidx.window.layout.adapter.sidecar.a.InterfaceC0056a
        public void a(Activity activity, ba1 ba1Var) {
            c60.e(activity, "activity");
            c60.e(ba1Var, "newLayout");
            ReentrantLock reentrantLock = this.b;
            reentrantLock.lock();
            try {
                if (c60.a(ba1Var, (ba1) this.c.get(activity))) {
                    return;
                }
                ba1 ba1Var2 = (ba1) this.c.put(activity, ba1Var);
                reentrantLock.unlock();
                this.a.a(activity, ba1Var);
            } finally {
                reentrantLock.unlock();
            }
        }

        public final void b(Activity activity) {
            c60.e(activity, "activity");
            ReentrantLock reentrantLock = this.b;
            reentrantLock.lock();
            try {
                this.c.put(activity, null);
                u31 u31Var = u31.a;
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class c implements View.OnAttachStateChangeListener {
        public final SidecarCompat a;
        public final WeakReference b;

        public c(SidecarCompat sidecarCompat, Activity activity) {
            c60.e(sidecarCompat, "sidecarCompat");
            c60.e(activity, "activity");
            this.a = sidecarCompat;
            this.b = new WeakReference(activity);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            c60.e(view, "view");
            view.removeOnAttachStateChangeListener(this);
            Activity activity = (Activity) this.b.get();
            IBinder a = SidecarCompat.f.a(activity);
            if (activity == null || a == null) {
                return;
            }
            this.a.i(a, activity);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            c60.e(view, "view");
        }
    }

    public SidecarCompat(SidecarInterface sidecarInterface, lu0 lu0Var) {
        c60.e(lu0Var, "sidecarAdapter");
        this.a = sidecarInterface;
        this.b = lu0Var;
        this.c = new LinkedHashMap();
        this.d = new LinkedHashMap();
    }

    @Override // androidx.window.layout.adapter.sidecar.a
    public void a(a.InterfaceC0056a interfaceC0056a) {
        c60.e(interfaceC0056a, "extensionCallback");
        this.e = new b(interfaceC0056a);
        SidecarInterface sidecarInterface = this.a;
        if (sidecarInterface != null) {
            sidecarInterface.setSidecarCallback(new DistinctElementSidecarCallback(this.b, new TranslatingCallback()));
        }
    }

    @Override // androidx.window.layout.adapter.sidecar.a
    public void b(Activity activity) {
        c60.e(activity, "activity");
        IBinder a2 = f.a(activity);
        if (a2 != null) {
            i(a2, activity);
            return;
        }
        activity.getWindow().getDecorView().addOnAttachStateChangeListener(new c(this, activity));
    }

    @Override // androidx.window.layout.adapter.sidecar.a
    public void c(Activity activity) {
        SidecarInterface sidecarInterface;
        c60.e(activity, "activity");
        IBinder a2 = f.a(activity);
        if (a2 == null) {
            return;
        }
        SidecarInterface sidecarInterface2 = this.a;
        if (sidecarInterface2 != null) {
            sidecarInterface2.onWindowLayoutChangeListenerRemoved(a2);
        }
        k(activity);
        b bVar = this.e;
        if (bVar != null) {
            bVar.b(activity);
        }
        boolean z = this.c.size() == 1;
        this.c.remove(a2);
        if (!z || (sidecarInterface = this.a) == null) {
            return;
        }
        sidecarInterface.onDeviceStateListenersChanged(true);
    }

    public final SidecarInterface g() {
        return this.a;
    }

    public final ba1 h(Activity activity) {
        SidecarDeviceState sidecarDeviceState;
        List e;
        c60.e(activity, "activity");
        IBinder a2 = f.a(activity);
        if (a2 == null) {
            e = sc.e();
            return new ba1(e);
        }
        SidecarInterface sidecarInterface = this.a;
        SidecarWindowLayoutInfo windowLayoutInfo = sidecarInterface != null ? sidecarInterface.getWindowLayoutInfo(a2) : null;
        lu0 lu0Var = this.b;
        SidecarInterface sidecarInterface2 = this.a;
        if (sidecarInterface2 == null || (sidecarDeviceState = sidecarInterface2.getDeviceState()) == null) {
            sidecarDeviceState = new SidecarDeviceState();
        }
        return lu0Var.e(windowLayoutInfo, sidecarDeviceState);
    }

    public final void i(IBinder iBinder, Activity activity) {
        SidecarInterface sidecarInterface;
        c60.e(iBinder, "windowToken");
        c60.e(activity, "activity");
        this.c.put(iBinder, activity);
        SidecarInterface sidecarInterface2 = this.a;
        if (sidecarInterface2 != null) {
            sidecarInterface2.onWindowLayoutChangeListenerAdded(iBinder);
        }
        if (this.c.size() == 1 && (sidecarInterface = this.a) != null) {
            sidecarInterface.onDeviceStateListenersChanged(false);
        }
        b bVar = this.e;
        if (bVar != null) {
            bVar.a(activity, h(activity));
        }
        j(activity);
    }

    public final void j(Activity activity) {
        this.d.get(activity);
    }

    public final void k(Activity activity) {
        if (((pf) this.d.get(activity)) == null) {
            return;
        }
        this.d.remove(activity);
    }

    public boolean l() {
        Class<?> cls;
        Class<?> cls2;
        Class<?> cls3;
        Class<?> cls4;
        try {
            SidecarInterface sidecarInterface = this.a;
            Method method = (sidecarInterface == null || (cls4 = sidecarInterface.getClass()) == null) ? null : cls4.getMethod("setSidecarCallback", SidecarInterface.SidecarCallback.class);
            Class<?> returnType = method != null ? method.getReturnType() : null;
            Class cls5 = Void.TYPE;
            if (!c60.a(returnType, cls5)) {
                throw new NoSuchMethodException("Illegal return type for 'setSidecarCallback': " + returnType);
            }
            SidecarInterface sidecarInterface2 = this.a;
            if (sidecarInterface2 != null) {
                sidecarInterface2.getDeviceState();
            }
            SidecarInterface sidecarInterface3 = this.a;
            if (sidecarInterface3 != null) {
                sidecarInterface3.onDeviceStateListenersChanged(true);
            }
            SidecarInterface sidecarInterface4 = this.a;
            Method method2 = (sidecarInterface4 == null || (cls3 = sidecarInterface4.getClass()) == null) ? null : cls3.getMethod("getWindowLayoutInfo", IBinder.class);
            Class<?> returnType2 = method2 != null ? method2.getReturnType() : null;
            if (!c60.a(returnType2, SidecarWindowLayoutInfo.class)) {
                throw new NoSuchMethodException("Illegal return type for 'getWindowLayoutInfo': " + returnType2);
            }
            SidecarInterface sidecarInterface5 = this.a;
            Method method3 = (sidecarInterface5 == null || (cls2 = sidecarInterface5.getClass()) == null) ? null : cls2.getMethod("onWindowLayoutChangeListenerAdded", IBinder.class);
            Class<?> returnType3 = method3 != null ? method3.getReturnType() : null;
            if (!c60.a(returnType3, cls5)) {
                throw new NoSuchMethodException("Illegal return type for 'onWindowLayoutChangeListenerAdded': " + returnType3);
            }
            SidecarInterface sidecarInterface6 = this.a;
            Method method4 = (sidecarInterface6 == null || (cls = sidecarInterface6.getClass()) == null) ? null : cls.getMethod("onWindowLayoutChangeListenerRemoved", IBinder.class);
            Class<?> returnType4 = method4 != null ? method4.getReturnType() : null;
            if (!c60.a(returnType4, cls5)) {
                throw new NoSuchMethodException("Illegal return type for 'onWindowLayoutChangeListenerRemoved': " + returnType4);
            }
            SidecarDeviceState sidecarDeviceState = new SidecarDeviceState();
            try {
                sidecarDeviceState.posture = 3;
            } catch (NoSuchFieldError unused) {
                SidecarDeviceState.class.getMethod("setPosture", Integer.TYPE).invoke(sidecarDeviceState, 3);
                Object invoke = SidecarDeviceState.class.getMethod("getPosture", new Class[0]).invoke(sidecarDeviceState, new Object[0]);
                c60.c(invoke, "null cannot be cast to non-null type kotlin.Int");
                if (((Integer) invoke).intValue() != 3) {
                    throw new Exception("Invalid device posture getter/setter");
                }
            }
            SidecarDisplayFeature sidecarDisplayFeature = new SidecarDisplayFeature();
            Rect rect = sidecarDisplayFeature.getRect();
            c60.d(rect, "displayFeature.rect");
            sidecarDisplayFeature.setRect(rect);
            sidecarDisplayFeature.getType();
            sidecarDisplayFeature.setType(1);
            SidecarWindowLayoutInfo sidecarWindowLayoutInfo = new SidecarWindowLayoutInfo();
            try {
                List list = sidecarWindowLayoutInfo.displayFeatures;
            } catch (NoSuchFieldError unused2) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(sidecarDisplayFeature);
                SidecarWindowLayoutInfo.class.getMethod("setDisplayFeatures", List.class).invoke(sidecarWindowLayoutInfo, arrayList);
                Object invoke2 = SidecarWindowLayoutInfo.class.getMethod("getDisplayFeatures", new Class[0]).invoke(sidecarWindowLayoutInfo, new Object[0]);
                c60.c(invoke2, "null cannot be cast to non-null type kotlin.collections.List<androidx.window.sidecar.SidecarDisplayFeature>");
                if (!c60.a(arrayList, (List) invoke2)) {
                    throw new Exception("Invalid display feature getter/setter");
                }
            }
            return true;
        } catch (Throwable unused3) {
            return false;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SidecarCompat(Context context) {
        this(f.b(context), new lu0(null, 1, null));
        c60.e(context, "context");
    }
}
