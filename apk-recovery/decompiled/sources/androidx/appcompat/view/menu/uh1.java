package androidx.appcompat.view.menu;

import android.os.Bundle;
import androidx.appcompat.view.menu.q40;
/* loaded from: classes.dex */
public abstract class uh1 {
    public static final t40 a = t40.x("_in", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire");
    public static final q40 b = q40.x("_e", "_f", "_iap", "_s", "_au", "_ui", "_cd");
    public static final q40 c = q40.w("auto", "app", "am");
    public static final q40 d = q40.v("_r", "_dbg");
    public static final q40 e = new q40.a().e(rz1.a).e(rz1.b).f();
    public static final q40 f = q40.v("^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$");

    public static void a(String str, String str2, Bundle bundle) {
        if ("clx".equals(str) && "_ae".equals(str2)) {
            bundle.putLong("_r", 1L);
        }
    }

    public static boolean b(String str, Bundle bundle) {
        if (b.contains(str)) {
            return false;
        }
        if (bundle != null) {
            q40 q40Var = d;
            int size = q40Var.size();
            int i = 0;
            while (i < size) {
                Object obj = q40Var.get(i);
                i++;
                if (bundle.containsKey((String) obj)) {
                    return false;
                }
            }
            return true;
        }
        return true;
    }

    public static boolean c(String str, String str2) {
        if ("_ce1".equals(str2) || "_ce2".equals(str2)) {
            return str.equals("fcm") || str.equals("frc");
        } else if ("_ln".equals(str2)) {
            return str.equals("fcm") || str.equals("fiam");
        } else if (e.contains(str2)) {
            return false;
        } else {
            q40 q40Var = f;
            int size = q40Var.size();
            int i = 0;
            while (i < size) {
                Object obj = q40Var.get(i);
                i++;
                if (str2.matches((String) obj)) {
                    return false;
                }
            }
            return true;
        }
    }

    public static boolean d(String str, String str2, Bundle bundle) {
        if ("_cmp".equals(str2)) {
            if (e(str) && bundle != null) {
                q40 q40Var = d;
                int size = q40Var.size();
                int i = 0;
                while (i < size) {
                    Object obj = q40Var.get(i);
                    i++;
                    if (bundle.containsKey((String) obj)) {
                        return false;
                    }
                }
                str.hashCode();
                char c2 = 65535;
                switch (str.hashCode()) {
                    case 101200:
                        if (str.equals("fcm")) {
                            c2 = 0;
                            break;
                        }
                        break;
                    case 101230:
                        if (str.equals("fdl")) {
                            c2 = 1;
                            break;
                        }
                        break;
                    case 3142703:
                        if (str.equals("fiam")) {
                            c2 = 2;
                            break;
                        }
                        break;
                }
                switch (c2) {
                    case 0:
                        bundle.putString("_cis", "fcm_integration");
                        return true;
                    case 1:
                        bundle.putString("_cis", "fdl_integration");
                        return true;
                    case 2:
                        bundle.putString("_cis", "fiam_integration");
                        return true;
                    default:
                        return false;
                }
            }
            return false;
        }
        return true;
    }

    public static boolean e(String str) {
        return !c.contains(str);
    }
}
