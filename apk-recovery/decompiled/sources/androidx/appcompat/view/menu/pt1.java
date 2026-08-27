package androidx.appcompat.view.menu;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes.dex */
public final class pt1 {
    public static final AtomicReference b = new AtomicReference();
    public static final AtomicReference c = new AtomicReference();
    public static final AtomicReference d = new AtomicReference();
    public final ot1 a;

    public pt1(ot1 ot1Var) {
        this.a = ot1Var;
    }

    public static String d(String str, String[] strArr, String[] strArr2, AtomicReference atomicReference) {
        String str2;
        pj0.i(strArr);
        pj0.i(strArr2);
        pj0.i(atomicReference);
        pj0.a(strArr.length == strArr2.length);
        for (int i = 0; i < strArr.length; i++) {
            String str3 = strArr[i];
            if (str == str3 || (str != null && str.equals(str3))) {
                synchronized (atomicReference) {
                    try {
                        String[] strArr3 = (String[]) atomicReference.get();
                        if (strArr3 == null) {
                            strArr3 = new String[strArr2.length];
                            atomicReference.set(strArr3);
                        }
                        if (strArr3[i] == null) {
                            strArr3[i] = strArr2[i] + "(" + strArr[i] + ")";
                        }
                        str2 = strArr3[i];
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return str2;
            }
        }
        return str;
    }

    public final String a(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        if (this.a.a()) {
            StringBuilder sb = new StringBuilder();
            sb.append("Bundle[{");
            for (String str : bundle.keySet()) {
                if (sb.length() != 8) {
                    sb.append(", ");
                }
                sb.append(f(str));
                sb.append("=");
                Object obj = bundle.get(str);
                sb.append(obj instanceof Bundle ? e(new Object[]{obj}) : obj instanceof Object[] ? e((Object[]) obj) : obj instanceof ArrayList ? e(((ArrayList) obj).toArray()) : String.valueOf(obj));
            }
            sb.append("}]");
            return sb.toString();
        }
        return bundle.toString();
    }

    public final String b(ri1 ri1Var) {
        if (ri1Var == null) {
            return null;
        }
        if (this.a.a()) {
            StringBuilder sb = new StringBuilder();
            sb.append("origin=");
            sb.append(ri1Var.o);
            sb.append(",name=");
            sb.append(c(ri1Var.m));
            sb.append(",params=");
            hi1 hi1Var = ri1Var.n;
            sb.append(hi1Var != null ? !this.a.a() ? hi1Var.toString() : a(hi1Var.k()) : null);
            return sb.toString();
        }
        return ri1Var.toString();
    }

    public final String c(String str) {
        if (str == null) {
            return null;
        }
        return !this.a.a() ? str : d(str, qz1.c, qz1.a, b);
    }

    public final String e(Object[] objArr) {
        if (objArr == null) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (Object obj : objArr) {
            String a = obj instanceof Bundle ? a((Bundle) obj) : String.valueOf(obj);
            if (a != null) {
                if (sb.length() != 1) {
                    sb.append(", ");
                }
                sb.append(a);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public final String f(String str) {
        if (str == null) {
            return null;
        }
        return !this.a.a() ? str : d(str, uz1.b, uz1.a, c);
    }

    public final String g(String str) {
        if (str == null) {
            return null;
        }
        if (this.a.a()) {
            if (str.startsWith("_exp_")) {
                return "experiment_id(" + str + ")";
            }
            return d(str, rz1.b, rz1.a, d);
        }
        return str;
    }
}
