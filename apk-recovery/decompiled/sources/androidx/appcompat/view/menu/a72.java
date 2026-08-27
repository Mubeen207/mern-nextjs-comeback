package androidx.appcompat.view.menu;

import android.content.pm.PackageParser;
import androidx.appcompat.view.menu.t02;
/* loaded from: classes.dex */
public abstract class a72 {
    public static String a(tx1 tx1Var) {
        y62 y62Var = new y62(tx1Var);
        StringBuilder sb = new StringBuilder(y62Var.a());
        for (int i = 0; i < y62Var.a(); i++) {
            byte e = y62Var.e(i);
            if (e == 34) {
                sb.append("\\\"");
            } else if (e == 39) {
                sb.append("\\'");
            } else if (e != 92) {
                switch (e) {
                    case t02.c.g /* 7 */:
                        sb.append("\\a");
                        continue;
                    case PackageParser.PARSE_IGNORE_PROCESSES /* 8 */:
                        sb.append("\\b");
                        continue;
                    case 9:
                        sb.append("\\t");
                        continue;
                    case 10:
                        sb.append("\\n");
                        continue;
                    case 11:
                        sb.append("\\v");
                        continue;
                    case 12:
                        sb.append("\\f");
                        continue;
                    case 13:
                        sb.append("\\r");
                        continue;
                    default:
                        if (e < 32 || e > 126) {
                            sb.append('\\');
                            sb.append((char) (((e >>> 6) & 3) + 48));
                            sb.append((char) (((e >>> 3) & 7) + 48));
                            sb.append((char) ((e & 7) + 48));
                            break;
                        } else {
                            sb.append((char) e);
                            continue;
                        }
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }
}
