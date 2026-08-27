package androidx.appcompat.view.menu;

import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Build;
import android.util.Base64;
import com.snake.helper.Native;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import org.json.JSONObject;
/* loaded from: classes.dex */
public abstract class ay {

    /* loaded from: classes.dex */
    public class a extends BroadcastReceiver {
        public final /* synthetic */ Context a;
        public final /* synthetic */ BroadcastReceiver[] b;
        public final /* synthetic */ long c;

        public a(Context context, BroadcastReceiver[] broadcastReceiverArr, long j) {
            this.a = context;
            this.b = broadcastReceiverArr;
            this.c = j;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            try {
                this.a.unregisterReceiver(this.b[0]);
            } catch (Throwable unused) {
            }
            if ("com.snake.INTERNAL_OAUTH_CANCELLED".equals(intent.getAction())) {
                ay.c(this.c, 2, "", "", "");
            } else {
                ay.b(intent.getStringExtra("url"), this.c);
            }
        }
    }

    public static void b(String str, long j) {
        String str2;
        try {
            if (str == null) {
                c(j, 3, "", "", "");
                return;
            }
            int indexOf = str.indexOf(35);
            String[] split = (indexOf >= 0 ? str.substring(indexOf + 1) : "").split("&");
            int length = split.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    String str3 = split[i];
                    int indexOf2 = str3.indexOf(61);
                    if (indexOf2 > 0 && Native.ilil(15799041).equals(Uri.decode(str3.substring(0, indexOf2)))) {
                        str2 = Uri.decode(str3.substring(indexOf2 + 1));
                        break;
                    }
                    i++;
                } else {
                    str2 = null;
                    break;
                }
            }
            String str4 = str2;
            if (str4 == null) {
                c(j, 3, "", "", "");
                return;
            }
            String h = h(str4);
            c(j, 0, h != null ? h : "", str4, "");
        } catch (Throwable th) {
            c(j, 5, "", "", String.valueOf(th.getMessage()));
        }
    }

    public static void c(long j, int i, String str, String str2, String str3) {
        try {
            ClassLoader d = d();
            if (d == null) {
                return;
            }
            Class<?> cls = Class.forName(Native.ilil(15799553), true, d);
            Field declaredField = cls.getDeclaredField(Native.ilil(15865089));
            declaredField.setAccessible(true);
            declaredField.setLong(null, j);
            try {
                Method declaredMethod = cls.getDeclaredMethod(Native.ilil(15930625), Integer.TYPE, String.class, String.class, String.class);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(null, Integer.valueOf(i), str, str2, str3);
            } catch (NoSuchMethodException unused) {
                Method declaredMethod2 = cls.getDeclaredMethod(Native.ilil(15930625), Boolean.TYPE, String.class, String.class);
                declaredMethod2.setAccessible(true);
                Object[] objArr = new Object[3];
                objArr[0] = Boolean.valueOf(i == 0);
                objArr[1] = str;
                objArr[2] = str2;
                declaredMethod2.invoke(null, objArr);
            }
        } catch (Throwable unused2) {
        }
    }

    public static ClassLoader d() {
        try {
            Object invoke = Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, new Object[0]);
            if (invoke != null) {
                return ((Application) invoke).getClassLoader();
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Activity e() {
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            Object invoke = cls.getMethod("currentActivityThread", new Class[0]).invoke(null, new Object[0]);
            Field declaredField = cls.getDeclaredField("mActivities");
            declaredField.setAccessible(true);
            for (Object obj : ((Map) declaredField.get(invoke)).values()) {
                Class<?> cls2 = obj.getClass();
                Field declaredField2 = cls2.getDeclaredField("paused");
                declaredField2.setAccessible(true);
                if (!declaredField2.getBoolean(obj)) {
                    Field declaredField3 = cls2.getDeclaredField("activity");
                    declaredField3.setAccessible(true);
                    return (Activity) declaredField3.get(obj);
                }
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public static void f(Activity activity, String str, int i, long j) {
        bv0.e(Native.ilil(15799584), Native.ilil(15799585));
        Context applicationContext = activity.getApplicationContext();
        BroadcastReceiver[] broadcastReceiverArr = {new a(applicationContext, broadcastReceiverArr, j)};
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.snake.INTERNAL_OAUTH_RESULT");
        intentFilter.addAction("com.snake.INTERNAL_OAUTH_CANCELLED");
        if (Build.VERSION.SDK_INT >= 33) {
            applicationContext.registerReceiver(broadcastReceiverArr[0], intentFilter, 4);
        } else {
            applicationContext.registerReceiver(broadcastReceiverArr[0], intentFilter);
        }
        bv0.d(i);
    }

    public static void g(String str, long j) {
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            Object invoke = cls.getMethod("currentActivityThread", new Class[0]).invoke(null, new Object[0]);
            Object invoke2 = cls.getMethod("currentApplication", new Class[0]).invoke(null, new Object[0]);
            if (invoke2 != null) {
                ((Application) invoke2).getPackageName();
            }
            String.valueOf(cls.getMethod("getProcessName", new Class[0]).invoke(invoke, new Object[0]));
        } catch (Throwable unused) {
        }
    }

    public static String h(String str) {
        try {
            String[] split = str.split("\\.");
            if (split.length < 2) {
                return null;
            }
            return new JSONObject(new String(Base64.decode(split[1], 11), StandardCharsets.UTF_8)).optString("sub", null);
        } catch (Throwable unused) {
            return null;
        }
    }
}
