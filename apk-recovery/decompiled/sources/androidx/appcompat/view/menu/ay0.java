package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public abstract class ay0 extends zx0 {
    public static final String A(String str, char c, String str2) {
        c60.e(str, "<this>");
        c60.e(str2, "missingDelimiterValue");
        int t = t(str, c, 0, false, 6, null);
        if (t == -1) {
            return str2;
        }
        String substring = str.substring(t + 1, str.length());
        c60.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static /* synthetic */ String B(String str, char c, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = str;
        }
        return A(str, c, str2);
    }

    public static final String C(String str, char c, String str2) {
        c60.e(str, "<this>");
        c60.e(str2, "missingDelimiterValue");
        int p = p(str, c, 0, false, 6, null);
        if (p == -1) {
            return str2;
        }
        String substring = str.substring(0, p);
        c60.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static final String D(String str, String str2, String str3) {
        c60.e(str, "<this>");
        c60.e(str2, "delimiter");
        c60.e(str3, "missingDelimiterValue");
        int q = q(str, str2, 0, false, 6, null);
        if (q == -1) {
            return str3;
        }
        String substring = str.substring(0, q);
        c60.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static /* synthetic */ String E(String str, char c, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = str;
        }
        return C(str, c, str2);
    }

    public static /* synthetic */ String F(String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str3 = str;
        }
        return D(str, str2, str3);
    }

    public static CharSequence G(CharSequence charSequence) {
        c60.e(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean c = gb.c(charSequence.charAt(!z ? i : length));
            if (z) {
                if (!c) {
                    break;
                }
                length--;
            } else if (c) {
                i++;
            } else {
                z = true;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }

    public static final y50 j(CharSequence charSequence) {
        c60.e(charSequence, "<this>");
        return new y50(0, charSequence.length() - 1);
    }

    public static final int k(CharSequence charSequence) {
        c60.e(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static final int l(CharSequence charSequence, char c, int i, boolean z) {
        c60.e(charSequence, "<this>");
        return (z || !(charSequence instanceof String)) ? r(charSequence, new char[]{c}, i, z) : ((String) charSequence).indexOf(c, i);
    }

    public static final int m(CharSequence charSequence, String str, int i, boolean z) {
        c60.e(charSequence, "<this>");
        c60.e(str, "string");
        return (z || !(charSequence instanceof String)) ? o(charSequence, str, i, charSequence.length(), z, false, 16, null) : ((String) charSequence).indexOf(str, i);
    }

    public static final int n(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2) {
        int b;
        int a;
        w50 d;
        int a2;
        int b2;
        if (z2) {
            b = xn0.b(i, k(charSequence));
            a = xn0.a(i2, 0);
            d = xn0.d(b, a);
        } else {
            a2 = xn0.a(i, 0);
            b2 = xn0.b(i2, charSequence.length());
            d = new y50(a2, b2);
        }
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            int d2 = d.d();
            int f = d.f();
            int g = d.g();
            if ((g <= 0 || d2 > f) && (g >= 0 || f > d2)) {
                return -1;
            }
            while (!zx0.e((String) charSequence2, 0, (String) charSequence, d2, charSequence2.length(), z)) {
                if (d2 == f) {
                    return -1;
                }
                d2 += g;
            }
            return d2;
        }
        int d3 = d.d();
        int f2 = d.f();
        int g2 = d.g();
        if ((g2 <= 0 || d3 > f2) && (g2 >= 0 || f2 > d3)) {
            return -1;
        }
        while (!v(charSequence2, 0, charSequence, d3, charSequence2.length(), z)) {
            if (d3 == f2) {
                return -1;
            }
            d3 += g2;
        }
        return d3;
    }

    public static /* synthetic */ int o(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2, int i3, Object obj) {
        if ((i3 & 16) != 0) {
            z2 = false;
        }
        return n(charSequence, charSequence2, i, i2, z, z2);
    }

    public static /* synthetic */ int p(CharSequence charSequence, char c, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return l(charSequence, c, i, z);
    }

    public static /* synthetic */ int q(CharSequence charSequence, String str, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m(charSequence, str, i, z);
    }

    public static final int r(CharSequence charSequence, char[] cArr, int i, boolean z) {
        int a;
        char j;
        c60.e(charSequence, "<this>");
        c60.e(cArr, "chars");
        if (!z && cArr.length == 1 && (charSequence instanceof String)) {
            j = x4.j(cArr);
            return ((String) charSequence).indexOf(j, i);
        }
        a = xn0.a(i, 0);
        v50 it = new y50(a, k(charSequence)).iterator();
        while (it.hasNext()) {
            int b = it.b();
            char charAt = charSequence.charAt(b);
            for (char c : cArr) {
                if (hb.d(c, charAt, z)) {
                    return b;
                }
            }
        }
        return -1;
    }

    public static final int s(CharSequence charSequence, char c, int i, boolean z) {
        c60.e(charSequence, "<this>");
        return (z || !(charSequence instanceof String)) ? u(charSequence, new char[]{c}, i, z) : ((String) charSequence).lastIndexOf(c, i);
    }

    public static /* synthetic */ int t(CharSequence charSequence, char c, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = k(charSequence);
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return s(charSequence, c, i, z);
    }

    public static final int u(CharSequence charSequence, char[] cArr, int i, boolean z) {
        int b;
        char j;
        c60.e(charSequence, "<this>");
        c60.e(cArr, "chars");
        if (!z && cArr.length == 1 && (charSequence instanceof String)) {
            j = x4.j(cArr);
            return ((String) charSequence).lastIndexOf(j, i);
        }
        for (b = xn0.b(i, k(charSequence)); -1 < b; b--) {
            char charAt = charSequence.charAt(b);
            for (char c : cArr) {
                if (hb.d(c, charAt, z)) {
                    return b;
                }
            }
        }
        return -1;
    }

    public static final boolean v(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3, boolean z) {
        c60.e(charSequence, "<this>");
        c60.e(charSequence2, "other");
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > charSequence2.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!hb.d(charSequence.charAt(i + i4), charSequence2.charAt(i2 + i4), z)) {
                return false;
            }
        }
        return true;
    }

    public static final String w(String str, char c, String str2) {
        c60.e(str, "<this>");
        c60.e(str2, "missingDelimiterValue");
        int p = p(str, c, 0, false, 6, null);
        if (p == -1) {
            return str2;
        }
        String substring = str.substring(p + 1, str.length());
        c60.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static final String x(String str, String str2, String str3) {
        c60.e(str, "<this>");
        c60.e(str2, "delimiter");
        c60.e(str3, "missingDelimiterValue");
        int q = q(str, str2, 0, false, 6, null);
        if (q == -1) {
            return str3;
        }
        String substring = str.substring(q + str2.length(), str.length());
        c60.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static /* synthetic */ String y(String str, char c, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = str;
        }
        return w(str, c, str2);
    }

    public static /* synthetic */ String z(String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str3 = str;
        }
        return x(str, str2, str3);
    }
}
