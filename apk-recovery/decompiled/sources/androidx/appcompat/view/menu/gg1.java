package androidx.appcompat.view.menu;

import androidx.appcompat.view.menu.oz1;
import java.util.EnumMap;
/* loaded from: classes.dex */
public final class gg1 {
    public final EnumMap a;

    public gg1() {
        this.a = new EnumMap(oz1.a.class);
    }

    public static gg1 b(String str) {
        EnumMap enumMap = new EnumMap(oz1.a.class);
        if (str.length() >= oz1.a.values().length) {
            int i = 0;
            if (str.charAt(0) == '1') {
                oz1.a[] values = oz1.a.values();
                int length = values.length;
                int i2 = 1;
                while (i < length) {
                    enumMap.put((EnumMap) values[i], (oz1.a) eg1.e(str.charAt(i2)));
                    i++;
                    i2++;
                }
                return new gg1(enumMap);
            }
        }
        return new gg1();
    }

    public final eg1 a(oz1.a aVar) {
        eg1 eg1Var = (eg1) this.a.get(aVar);
        return eg1Var == null ? eg1.UNSET : eg1Var;
    }

    public final void c(oz1.a aVar, int i) {
        eg1 eg1Var = eg1.UNSET;
        if (i != -20) {
            if (i == -10) {
                eg1Var = eg1.MANIFEST;
            } else if (i != 0) {
                if (i == 30) {
                    eg1Var = eg1.INITIALIZATION;
                }
            }
            this.a.put((EnumMap) aVar, (oz1.a) eg1Var);
        }
        eg1Var = eg1.API;
        this.a.put((EnumMap) aVar, (oz1.a) eg1Var);
    }

    public final void d(oz1.a aVar, eg1 eg1Var) {
        this.a.put((EnumMap) aVar, (oz1.a) eg1Var);
    }

    public final String toString() {
        char c;
        StringBuilder sb = new StringBuilder("1");
        for (oz1.a aVar : oz1.a.values()) {
            eg1 eg1Var = (eg1) this.a.get(aVar);
            if (eg1Var == null) {
                eg1Var = eg1.UNSET;
            }
            c = eg1Var.m;
            sb.append(c);
        }
        return sb.toString();
    }

    public gg1(EnumMap enumMap) {
        EnumMap enumMap2 = new EnumMap(oz1.a.class);
        this.a = enumMap2;
        enumMap2.putAll(enumMap);
    }
}
