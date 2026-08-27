package androidx.appcompat.view.menu;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public abstract class j42 {
    public static final char[] a;

    static {
        char[] cArr = new char[80];
        a = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static String a(z32 z32Var, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        c(z32Var, sb, 0);
        return sb.toString();
    }

    public static void b(int i, StringBuilder sb) {
        while (i > 0) {
            char[] cArr = a;
            int length = i > cArr.length ? cArr.length : i;
            sb.append(cArr, 0, length);
            i -= length;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0210, code lost:
        if (((java.lang.Boolean) androidx.appcompat.view.menu.t02.s(r13, r19, new java.lang.Object[0])).booleanValue() != false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0164, code lost:
        if (r5.containsKey("get" + r9.substring(0, r9.length() - 5)) == false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0193, code lost:
        if (((java.lang.Boolean) r7).booleanValue() == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01a1, code lost:
        if (((java.lang.Integer) r7).intValue() == 0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01b3, code lost:
        if (java.lang.Float.floatToRawIntBits(((java.lang.Float) r7).floatValue()) == 0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01ca, code lost:
        if (java.lang.Double.doubleToRawLongBits(((java.lang.Double) r7).doubleValue()) == 0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01e3, code lost:
        if (r13 == false) goto L75;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void c(androidx.appcompat.view.menu.z32 r19, java.lang.StringBuilder r20, int r21) {
        /*
            Method dump skipped, instructions count: 545
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.j42.c(androidx.appcompat.view.menu.z32, java.lang.StringBuilder, int):void");
    }

    public static void d(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            for (Object obj2 : (List) obj) {
                d(sb, i, str, obj2);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                d(sb, i, str, entry);
            }
        } else {
            sb.append('\n');
            b(i, sb);
            if (!str.isEmpty()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(Character.toLowerCase(str.charAt(0)));
                for (int i2 = 1; i2 < str.length(); i2++) {
                    char charAt = str.charAt(i2);
                    if (Character.isUpperCase(charAt)) {
                        sb2.append("_");
                    }
                    sb2.append(Character.toLowerCase(charAt));
                }
                str = sb2.toString();
            }
            sb.append(str);
            if (obj instanceof String) {
                sb.append(": \"");
                sb.append(a72.a(tx1.k((String) obj)));
                sb.append('\"');
            } else if (obj instanceof tx1) {
                sb.append(": \"");
                sb.append(a72.a((tx1) obj));
                sb.append('\"');
            } else if (obj instanceof t02) {
                sb.append(" {");
                c((t02) obj, sb, i + 2);
                sb.append("\n");
                b(i, sb);
                sb.append("}");
            } else if (!(obj instanceof Map.Entry)) {
                sb.append(": ");
                sb.append(obj);
            } else {
                sb.append(" {");
                Map.Entry entry2 = (Map.Entry) obj;
                int i3 = i + 2;
                d(sb, i3, "key", entry2.getKey());
                d(sb, i3, "value", entry2.getValue());
                sb.append("\n");
                b(i, sb);
                sb.append("}");
            }
        }
    }
}
