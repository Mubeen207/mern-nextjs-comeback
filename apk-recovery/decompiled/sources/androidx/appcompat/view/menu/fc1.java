package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.PackageParser;
import android.content.res.Resources;
import android.text.TextUtils;
import androidx.appcompat.view.menu.t02;
import java.util.Locale;
/* loaded from: classes.dex */
public abstract class fc1 {
    public static final qu0 a = new qu0();
    public static Locale b;

    public static String a(Context context) {
        String packageName = context.getPackageName();
        try {
            return va1.a(context).d(packageName).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    public static String b(Context context) {
        return context.getResources().getString(bn0.g);
    }

    public static String c(Context context, int i) {
        Resources resources = context.getResources();
        return i != 1 ? i != 2 ? i != 3 ? resources.getString(17039370) : resources.getString(bn0.a) : resources.getString(bn0.j) : resources.getString(bn0.d);
    }

    public static String d(Context context, int i) {
        Resources resources = context.getResources();
        String a2 = a(context);
        if (i != 1) {
            if (i == 2) {
                return rl.d(context) ? resources.getString(bn0.n) : resources.getString(bn0.k, a2);
            } else if (i != 3) {
                if (i != 5) {
                    if (i != 7) {
                        if (i != 9) {
                            if (i != 20) {
                                switch (i) {
                                    case PackageParser.PARSE_FORWARD_LOCK /* 16 */:
                                        return h(context, "common_google_play_services_api_unavailable_text", a2);
                                    case 17:
                                        return h(context, "common_google_play_services_sign_in_failed_text", a2);
                                    case 18:
                                        return resources.getString(bn0.m, a2);
                                    default:
                                        return resources.getString(cn0.a, a2);
                                }
                            }
                            return h(context, "common_google_play_services_restricted_profile_text", a2);
                        }
                        return resources.getString(bn0.i, a2);
                    }
                    return h(context, "common_google_play_services_network_error_text", a2);
                }
                return h(context, "common_google_play_services_invalid_account_text", a2);
            } else {
                return resources.getString(bn0.b, a2);
            }
        }
        return resources.getString(bn0.e, a2);
    }

    public static String e(Context context, int i) {
        return (i == 6 || i == 19) ? h(context, "common_google_play_services_resolution_required_text", a(context)) : d(context, i);
    }

    public static String f(Context context, int i) {
        String i2 = i == 6 ? i(context, "common_google_play_services_resolution_required_title") : g(context, i);
        return i2 == null ? context.getResources().getString(bn0.h) : i2;
    }

    public static String g(Context context, int i) {
        Resources resources = context.getResources();
        switch (i) {
            case 1:
                return resources.getString(bn0.f);
            case 2:
                return resources.getString(bn0.l);
            case t02.c.c /* 3 */:
                return resources.getString(bn0.c);
            case 4:
            case t02.c.f /* 6 */:
            case 18:
                return null;
            case t02.c.e /* 5 */:
                return i(context, "common_google_play_services_invalid_account_title");
            case t02.c.g /* 7 */:
                return i(context, "common_google_play_services_network_error_title");
            case PackageParser.PARSE_IGNORE_PROCESSES /* 8 */:
            case 9:
            case 10:
            case 11:
            case PackageParser.PARSE_FORWARD_LOCK /* 16 */:
                return null;
            case 12:
            case 13:
            case 14:
            case 15:
            case 19:
            default:
                StringBuilder sb = new StringBuilder(33);
                sb.append("Unexpected error code ");
                sb.append(i);
                return null;
            case 17:
                return i(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                return i(context, "common_google_play_services_restricted_profile_title");
        }
    }

    public static String h(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String i = i(context, str);
        if (i == null) {
            i = resources.getString(cn0.a);
        }
        return String.format(resources.getConfiguration().locale, i, str2);
    }

    public static String i(Context context, String str) {
        qu0 qu0Var = a;
        synchronized (qu0Var) {
            try {
                Locale b2 = af.a(context.getResources().getConfiguration()).b(0);
                if (!b2.equals(b)) {
                    qu0Var.clear();
                    b = b2;
                }
                String str2 = (String) qu0Var.get(str);
                if (str2 != null) {
                    return str2;
                }
                Resources c = jy.c(context);
                if (c == null) {
                    return null;
                }
                int identifier = c.getIdentifier(str, "string", "com.google.android.gms");
                if (identifier == 0) {
                    if (str.length() != 0) {
                        "Missing resource: ".concat(str);
                    }
                    return null;
                }
                String string = c.getString(identifier);
                if (!TextUtils.isEmpty(string)) {
                    qu0Var.put(str, string);
                    return string;
                }
                if (str.length() != 0) {
                    "Got empty resource: ".concat(str);
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
