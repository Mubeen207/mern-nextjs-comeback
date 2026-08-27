package androidx.appcompat.view.menu;

import android.content.Context;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
/* loaded from: classes.dex */
public abstract class zi {
    public static String a(Context context, long j, boolean z, boolean z2, boolean z3) {
        String d = d(j);
        if (z) {
            d = String.format(context.getString(dn0.n), d);
        }
        return z2 ? String.format(context.getString(dn0.m), d) : z3 ? String.format(context.getString(dn0.j), d) : d;
    }

    public static String b(long j) {
        return c(j, Locale.getDefault());
    }

    public static String c(long j, Locale locale) {
        return t41.d(locale).format(new Date(j));
    }

    public static String d(long j) {
        return i(j) ? b(j) : g(j);
    }

    public static String e(Context context, int i) {
        return t41.g().get(1) == i ? String.format(context.getString(dn0.k), Integer.valueOf(i)) : String.format(context.getString(dn0.l), Integer.valueOf(i));
    }

    public static String f(long j) {
        return t41.k(Locale.getDefault()).format(new Date(j));
    }

    public static String g(long j) {
        return h(j, Locale.getDefault());
    }

    public static String h(long j, Locale locale) {
        return t41.l(locale).format(new Date(j));
    }

    public static boolean i(long j) {
        Calendar g = t41.g();
        Calendar i = t41.i();
        i.setTimeInMillis(j);
        return g.get(1) == i.get(1);
    }
}
