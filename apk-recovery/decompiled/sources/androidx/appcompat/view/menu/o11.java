package androidx.appcompat.view.menu;

import android.os.Build;
import android.os.Trace;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public abstract class o11 {
    public static long a;
    public static Method b;
    public static Method c;
    public static Method d;

    public static void a(String str, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            q11.a(j(str), i);
        } else {
            b(j(str), i);
        }
    }

    public static void b(String str, int i) {
        try {
            if (c == null) {
                c = Trace.class.getMethod("asyncTraceBegin", Long.TYPE, String.class, Integer.TYPE);
            }
            c.invoke(null, Long.valueOf(a), str, Integer.valueOf(i));
        } catch (Exception e) {
            g("asyncTraceBegin", e);
        }
    }

    public static void c(String str) {
        p11.a(j(str));
    }

    public static void d(String str, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            q11.b(j(str), i);
        } else {
            e(j(str), i);
        }
    }

    public static void e(String str, int i) {
        try {
            if (d == null) {
                d = Trace.class.getMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE);
            }
            d.invoke(null, Long.valueOf(a), str, Integer.valueOf(i));
        } catch (Exception e) {
            g("asyncTraceEnd", e);
        }
    }

    public static void f() {
        p11.b();
    }

    public static void g(String str, Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (!(cause instanceof RuntimeException)) {
                throw new RuntimeException(cause);
            }
            throw ((RuntimeException) cause);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unable to call ");
        sb.append(str);
        sb.append(" via reflection");
    }

    public static boolean h() {
        return Build.VERSION.SDK_INT >= 29 ? q11.c() : i();
    }

    public static boolean i() {
        try {
            if (b == null) {
                a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) b.invoke(null, Long.valueOf(a))).booleanValue();
        } catch (Exception e) {
            g("isTagEnabled", e);
            return false;
        }
    }

    public static String j(String str) {
        return str.length() <= 127 ? str : str.substring(0, 127);
    }
}
