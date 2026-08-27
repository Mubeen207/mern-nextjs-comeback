package androidx.appcompat.view.menu;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public final class w41 {
    public static final long b = TimeUnit.HOURS.toSeconds(1);
    public static final Pattern c = Pattern.compile("\\AA[\\w-]{38}\\z");
    public static w41 d;
    public final dc a;

    public w41(dc dcVar) {
        this.a = dcVar;
    }

    public static w41 c() {
        return d(vy0.b());
    }

    public static w41 d(dc dcVar) {
        if (d == null) {
            d = new w41(dcVar);
        }
        return d;
    }

    public static boolean g(String str) {
        return c.matcher(str).matches();
    }

    public static boolean h(String str) {
        return str.contains(":");
    }

    public long a() {
        return this.a.a();
    }

    public long b() {
        return TimeUnit.MILLISECONDS.toSeconds(a());
    }

    public long e() {
        return (long) (Math.random() * 1000.0d);
    }

    public boolean f(di0 di0Var) {
        return TextUtils.isEmpty(di0Var.b()) || di0Var.h() + di0Var.c() < b() + b;
    }
}
