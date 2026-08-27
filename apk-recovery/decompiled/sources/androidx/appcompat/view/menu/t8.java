package androidx.appcompat.view.menu;

import android.os.Bundle;
import android.os.IBinder;
import androidx.appcompat.view.menu.jo0;
/* loaded from: classes.dex */
public abstract class t8 {
    public static final jo0 a;
    public static jo0.d b;
    public static jo0.d c;

    /* loaded from: classes.dex */
    public static class a {
        public static final jo0 a;
        public static jo0.a b;
        public static jo0.b c;
        public static jo0.b d;
        public static jo0.b e;
        public static jo0.b f;
        public static jo0.b g;
        public static jo0.b h;
        public static jo0.b i;
        public static jo0.b j;
        public static jo0.b k;

        static {
            jo0 w = jo0.w("android.content.BroadcastReceiver$PendingResult");
            a = w;
            Class cls = Integer.TYPE;
            Class cls2 = Boolean.TYPE;
            b = w.c(cls, String.class, Bundle.class, cls, cls2, cls2, IBinder.class, cls);
            c = w.e("mAbortBroadcast");
            d = w.e("mFinished");
            e = w.e("mInitialStickyHint");
            f = w.e("mOrderedHint");
            g = w.e("mResultData");
            h = w.e("mResultExtras");
            i = w.e("mSendingUser");
            j = w.e("mToken");
            k = w.e("mType");
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public static final jo0 a;
        public static jo0.a b;
        public static jo0.b c;
        public static jo0.b d;
        public static jo0.b e;
        public static jo0.b f;
        public static jo0.b g;
        public static jo0.b h;
        public static jo0.b i;
        public static jo0.b j;
        public static jo0.b k;
        public static jo0.b l;

        static {
            jo0 w = jo0.w("android.content.BroadcastReceiver$PendingResult");
            a = w;
            Class cls = Integer.TYPE;
            Class cls2 = Boolean.TYPE;
            b = w.c(cls, String.class, Bundle.class, cls, cls2, cls2, IBinder.class, cls, cls);
            c = w.e("mAbortBroadcast");
            d = w.e("mFinished");
            e = w.e("mFlags");
            f = w.e("mInitialStickyHint");
            g = w.e("mOrderedHint");
            h = w.e("mResultData");
            i = w.e("mResultExtras");
            j = w.e("mSendingUser");
            k = w.e("mToken");
            l = w.e("mType");
        }
    }

    static {
        jo0 w = jo0.w("android.content.BroadcastReceiver");
        a = w;
        b = w.u("getPendingResult", new Class[0]);
        c = w.u("setPendingResult", jo0.f("android.content.BroadcastReceiver$PendingResult"));
    }
}
