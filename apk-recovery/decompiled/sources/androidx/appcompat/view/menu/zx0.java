package androidx.appcompat.view.menu;

import java.util.Collection;
import java.util.Iterator;
/* loaded from: classes.dex */
public abstract class zx0 extends yx0 {
    public static boolean d(CharSequence charSequence) {
        c60.e(charSequence, "<this>");
        if (charSequence.length() != 0) {
            y50 j = ay0.j(charSequence);
            if (!(j instanceof Collection) || !((Collection) j).isEmpty()) {
                Iterator it = j.iterator();
                while (it.hasNext()) {
                    if (!gb.c(charSequence.charAt(((v50) it).b()))) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static final boolean e(String str, int i, String str2, int i2, int i3, boolean z) {
        c60.e(str, "<this>");
        c60.e(str2, "other");
        return !z ? str.regionMatches(i, str2, i2, i3) : str.regionMatches(z, i, str2, i2, i3);
    }

    public static final String f(String str, String str2, String str3, boolean z) {
        int a;
        c60.e(str, "<this>");
        c60.e(str2, "oldValue");
        c60.e(str3, "newValue");
        int i = 0;
        int m = ay0.m(str, str2, 0, z);
        if (m < 0) {
            return str;
        }
        int length = str2.length();
        a = xn0.a(length, 1);
        int length2 = (str.length() - length) + str3.length();
        if (length2 >= 0) {
            StringBuilder sb = new StringBuilder(length2);
            do {
                sb.append((CharSequence) str, i, m);
                sb.append(str3);
                i = m + length;
                if (m >= str.length()) {
                    break;
                }
                m = ay0.m(str, str2, m + a, z);
            } while (m > 0);
            sb.append((CharSequence) str, i, str.length());
            String sb2 = sb.toString();
            c60.d(sb2, "stringBuilder.append(this, i, length).toString()");
            return sb2;
        }
        throw new OutOfMemoryError();
    }

    public static /* synthetic */ String g(String str, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return f(str, str2, str3, z);
    }

    public static final boolean h(String str, String str2, boolean z) {
        c60.e(str, "<this>");
        c60.e(str2, "prefix");
        return !z ? str.startsWith(str2) : e(str, 0, str2, 0, str2.length(), z);
    }

    public static /* synthetic */ boolean i(String str, String str2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return h(str, str2, z);
    }
}
