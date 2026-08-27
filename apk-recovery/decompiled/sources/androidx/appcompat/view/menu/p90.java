package androidx.appcompat.view.menu;

import android.app.Instrumentation;
import androidx.appcompat.view.menu.jo0;
/* loaded from: classes.dex */
public abstract class p90 {
    public static final jo0 a;
    public static jo0.b b;
    public static jo0.b c;
    public static jo0.b d;
    public static jo0.b e;
    public static jo0.b f;
    public static jo0.b g;
    public static jo0.d h;
    public static jo0.d i;

    /* loaded from: classes.dex */
    public static class a {
        public static final jo0 a;
        public static jo0.b b;

        /* renamed from: androidx.appcompat.view.menu.p90$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0024a {
            public static final jo0 a;
            public static jo0.b b;

            static {
                jo0 w = jo0.w("android.app.LoadedApk$ReceiverDispatcher$InnerReceiver");
                a = w;
                b = w.e("mDispatcher");
            }
        }

        static {
            jo0 w = jo0.w("android.app.LoadedApk$ReceiverDispatcher");
            a = w;
            b = w.e("mIIntentReceiver");
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public static final jo0 a;
        public static jo0.b b;

        /* loaded from: classes.dex */
        public static class a {
            public static final jo0 a;
            public static jo0.b b;

            static {
                jo0 w = jo0.w("android.app.LoadedApk$ServiceDispatcher$InnerConnection");
                a = w;
                b = w.e("mDispatcher");
            }
        }

        static {
            jo0 w = jo0.w("android.app.LoadedApk$ServiceDispatcher");
            a = w;
            b = w.e("mConnection");
        }
    }

    static {
        jo0 w = jo0.w("android.app.LoadedApk");
        a = w;
        b = w.e("mClassLoader");
        c = w.e("mDataDirFile");
        d = w.e("mDeviceProtectedDataDirFile");
        e = w.e("mCredentialProtectedDataDirFile");
        f = w.e("mApplicationInfo");
        g = w.e("mSecurityViolation");
        h = w.u("getClassLoader", new Class[0]);
        i = w.u("makeApplication", Boolean.TYPE, Instrumentation.class);
    }
}
