package androidx.appcompat.view.menu;

import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes.dex */
public abstract class t41 {
    public static AtomicReference a = new AtomicReference();

    public static long a(long j) {
        Calendar i = i();
        i.setTimeInMillis(j);
        return c(i).getTimeInMillis();
    }

    public static DateFormat b(String str, Locale locale) {
        DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton(str, locale);
        instanceForSkeleton.setTimeZone(h());
        instanceForSkeleton.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
        return instanceForSkeleton;
    }

    public static Calendar c(Calendar calendar) {
        Calendar j = j(calendar);
        Calendar i = i();
        i.set(j.get(1), j.get(2), j.get(5));
        return i;
    }

    public static DateFormat d(Locale locale) {
        return b("MMMMEEEEd", locale);
    }

    public static w01 e() {
        w01 w01Var = (w01) a.get();
        return w01Var == null ? w01.c() : w01Var;
    }

    public static TimeZone f() {
        return TimeZone.getTimeZone("UTC");
    }

    public static Calendar g() {
        Calendar a2 = e().a();
        a2.set(11, 0);
        a2.set(12, 0);
        a2.set(13, 0);
        a2.set(14, 0);
        a2.setTimeZone(f());
        return a2;
    }

    public static android.icu.util.TimeZone h() {
        return android.icu.util.TimeZone.getTimeZone("UTC");
    }

    public static Calendar i() {
        return j(null);
    }

    public static Calendar j(Calendar calendar) {
        Calendar calendar2 = Calendar.getInstance(f());
        if (calendar == null) {
            calendar2.clear();
        } else {
            calendar2.setTimeInMillis(calendar.getTimeInMillis());
        }
        return calendar2;
    }

    public static DateFormat k(Locale locale) {
        return b("yMMMM", locale);
    }

    public static DateFormat l(Locale locale) {
        return b("yMMMMEEEEd", locale);
    }
}
