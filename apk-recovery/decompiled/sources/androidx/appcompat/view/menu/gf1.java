package androidx.appcompat.view.menu;

import androidx.appcompat.view.menu.t02;
import androidx.appcompat.view.menu.wq1;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
/* loaded from: classes.dex */
public abstract class gf1 {
    public String a;
    public int b;
    public Boolean c;
    public Boolean d;
    public Long e;
    public Long f;

    public gf1(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public static Boolean b(double d, uq1 uq1Var) {
        try {
            return h(new BigDecimal(d), uq1Var, Math.ulp(d));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static Boolean c(long j, uq1 uq1Var) {
        try {
            return h(new BigDecimal(j), uq1Var, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static Boolean d(Boolean bool, boolean z) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() != z);
    }

    public static Boolean e(String str, uq1 uq1Var) {
        if (l92.f0(str)) {
            try {
                return h(new BigDecimal(str), uq1Var, 0.0d);
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        return null;
    }

    public static Boolean f(String str, wq1.a aVar, boolean z, String str2, List list, String str3, st1 st1Var) {
        if (str == null) {
            return null;
        }
        if (aVar == wq1.a.IN_LIST) {
            if (list == null || list.isEmpty()) {
                return null;
            }
        } else if (str2 == null) {
            return null;
        }
        if (!z && aVar != wq1.a.REGEXP) {
            str = str.toUpperCase(Locale.ENGLISH);
        }
        switch (pf2.a[aVar.ordinal()]) {
            case 1:
                if (str3 == null) {
                    return null;
                }
                try {
                    return Boolean.valueOf(Pattern.compile(str3, z ? 0 : 66).matcher(str).matches());
                } catch (PatternSyntaxException unused) {
                    if (st1Var != null) {
                        st1Var.L().b("Invalid regular expression in REGEXP audience filter. expression", str3);
                    }
                    return null;
                }
            case 2:
                return Boolean.valueOf(str.startsWith(str2));
            case t02.c.c /* 3 */:
                return Boolean.valueOf(str.endsWith(str2));
            case 4:
                return Boolean.valueOf(str.contains(str2));
            case t02.c.e /* 5 */:
                return Boolean.valueOf(str.equals(str2));
            case t02.c.f /* 6 */:
                if (list == null) {
                    return null;
                }
                return Boolean.valueOf(list.contains(str));
            default:
                return null;
        }
    }

    public static Boolean g(String str, wq1 wq1Var, st1 st1Var) {
        List list;
        pj0.i(wq1Var);
        if (str == null || !wq1Var.O() || wq1Var.G() == wq1.a.UNKNOWN_MATCH_TYPE) {
            return null;
        }
        wq1.a G = wq1Var.G();
        wq1.a aVar = wq1.a.IN_LIST;
        if (G == aVar) {
            if (wq1Var.j() == 0) {
                return null;
            }
        } else if (!wq1Var.N()) {
            return null;
        }
        wq1.a G2 = wq1Var.G();
        boolean L = wq1Var.L();
        String J = (L || G2 == wq1.a.REGEXP || G2 == aVar) ? wq1Var.J() : wq1Var.J().toUpperCase(Locale.ENGLISH);
        if (wq1Var.j() == 0) {
            list = null;
        } else {
            List<String> K = wq1Var.K();
            if (!L) {
                ArrayList arrayList = new ArrayList(K.size());
                for (String str2 : K) {
                    arrayList.add(str2.toUpperCase(Locale.ENGLISH));
                }
                K = Collections.unmodifiableList(arrayList);
            }
            list = K;
        }
        return f(str, G2, L, J, list, G2 == wq1.a.REGEXP ? J : null, st1Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0080, code lost:
        if (r3 != null) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Boolean h(java.math.BigDecimal r8, androidx.appcompat.view.menu.uq1 r9, double r10) {
        /*
            Method dump skipped, instructions count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.gf1.h(java.math.BigDecimal, androidx.appcompat.view.menu.uq1, double):java.lang.Boolean");
    }

    public abstract int a();

    public abstract boolean i();

    public abstract boolean j();
}
