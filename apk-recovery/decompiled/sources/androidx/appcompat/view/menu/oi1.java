package androidx.appcompat.view.menu;

import android.content.pm.PackageParser;
import androidx.appcompat.view.menu.t02;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public abstract class oi1 {
    public static sf1 a(sf1 sf1Var, sw1 sw1Var, jg1 jg1Var) {
        return b(sf1Var, sw1Var, jg1Var, null, null);
    }

    public static sf1 b(sf1 sf1Var, sw1 sw1Var, jg1 jg1Var, Boolean bool, Boolean bool2) {
        sf1 sf1Var2 = new sf1();
        Iterator A = sf1Var.A();
        while (A.hasNext()) {
            int intValue = ((Integer) A.next()).intValue();
            if (sf1Var.z(intValue)) {
                tg1 a = jg1Var.a(sw1Var, Arrays.asList(sf1Var.s(intValue), new bg1(Double.valueOf(intValue)), sf1Var));
                if (a.d().equals(bool)) {
                    return sf1Var2;
                }
                if (bool2 == null || a.d().equals(bool2)) {
                    sf1Var2.y(intValue, a);
                }
            }
        }
        return sf1Var2;
    }

    public static tg1 c(sf1 sf1Var, sw1 sw1Var, List list, boolean z) {
        tg1 tg1Var;
        lu1.k("reduce", 1, list);
        lu1.n("reduce", 2, list);
        tg1 b = sw1Var.b((tg1) list.get(0));
        if (b instanceof jg1) {
            if (list.size() == 2) {
                tg1Var = sw1Var.b((tg1) list.get(1));
                if (tg1Var instanceof fg1) {
                    throw new IllegalArgumentException("Failed to parse initial value");
                }
            } else if (sf1Var.v() == 0) {
                throw new IllegalStateException("Empty array with no initial value error");
            } else {
                tg1Var = null;
            }
            jg1 jg1Var = (jg1) b;
            int v = sf1Var.v();
            int i = z ? 0 : v - 1;
            int i2 = z ? v - 1 : 0;
            int i3 = z ? 1 : -1;
            if (tg1Var == null) {
                tg1Var = sf1Var.s(i);
                i += i3;
            }
            while ((i2 - i) * i3 >= 0) {
                if (sf1Var.z(i)) {
                    tg1Var = jg1Var.a(sw1Var, Arrays.asList(tg1Var, sf1Var.s(i), new bg1(Double.valueOf(i)), sf1Var));
                    if (tg1Var instanceof fg1) {
                        throw new IllegalStateException("Reduce operation failed");
                    }
                    i += i3;
                } else {
                    i += i3;
                }
            }
            return tg1Var;
        }
        throw new IllegalArgumentException("Callback should be a method");
    }

    public static tg1 d(String str, sf1 sf1Var, sw1 sw1Var, List list) {
        String str2;
        jg1 jg1Var;
        sw1 sw1Var2;
        char c;
        str.hashCode();
        char c2 = 65535;
        switch (str.hashCode()) {
            case -1776922004:
                if (str.equals("toString")) {
                    c2 = 0;
                    break;
                }
                break;
            case -1354795244:
                if (str.equals("concat")) {
                    c2 = 1;
                    break;
                }
                break;
            case -1274492040:
                if (str.equals("filter")) {
                    c2 = 2;
                    break;
                }
                break;
            case -934873754:
                if (str.equals("reduce")) {
                    c2 = 3;
                    break;
                }
                break;
            case -895859076:
                if (str.equals("splice")) {
                    c = 4;
                    c2 = c;
                    break;
                }
                break;
            case -678635926:
                if (str.equals("forEach")) {
                    c = 5;
                    c2 = c;
                    break;
                }
                break;
            case -467511597:
                if (str.equals("lastIndexOf")) {
                    c = 6;
                    c2 = c;
                    break;
                }
                break;
            case -277637751:
                if (str.equals("unshift")) {
                    c = 7;
                    c2 = c;
                    break;
                }
                break;
            case 107868:
                if (str.equals("map")) {
                    c = '\b';
                    c2 = c;
                    break;
                }
                break;
            case 111185:
                if (str.equals("pop")) {
                    c = '\t';
                    c2 = c;
                    break;
                }
                break;
            case 3267882:
                if (str.equals("join")) {
                    c = '\n';
                    c2 = c;
                    break;
                }
                break;
            case 3452698:
                if (str.equals("push")) {
                    c = 11;
                    c2 = c;
                    break;
                }
                break;
            case 3536116:
                if (str.equals("some")) {
                    c = '\f';
                    c2 = c;
                    break;
                }
                break;
            case 3536286:
                if (str.equals("sort")) {
                    c = '\r';
                    c2 = c;
                    break;
                }
                break;
            case 96891675:
                if (str.equals("every")) {
                    c = 14;
                    c2 = c;
                    break;
                }
                break;
            case 109407362:
                if (str.equals("shift")) {
                    c = 15;
                    c2 = c;
                    break;
                }
                break;
            case 109526418:
                if (str.equals("slice")) {
                    c = 16;
                    c2 = c;
                    break;
                }
                break;
            case 965561430:
                if (str.equals("reduceRight")) {
                    c = 17;
                    c2 = c;
                    break;
                }
                break;
            case 1099846370:
                if (str.equals("reverse")) {
                    c = 18;
                    c2 = c;
                    break;
                }
                break;
            case 1943291465:
                if (str.equals("indexOf")) {
                    c = 19;
                    c2 = c;
                    break;
                }
                break;
        }
        double d = 0.0d;
        switch (c2) {
            case 0:
                lu1.g("toString", 0, list);
                return new xg1(sf1Var.toString());
            case 1:
                sf1 sf1Var2 = (sf1) sf1Var.c();
                if (!list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        tg1 b = sw1Var.b((tg1) it.next());
                        if (b instanceof fg1) {
                            throw new IllegalStateException("Failed evaluation of arguments");
                        }
                        int v = sf1Var2.v();
                        if (b instanceof sf1) {
                            sf1 sf1Var3 = (sf1) b;
                            Iterator A = sf1Var3.A();
                            while (A.hasNext()) {
                                Integer num = (Integer) A.next();
                                sf1Var2.y(num.intValue() + v, sf1Var3.s(num.intValue()));
                            }
                        } else {
                            sf1Var2.y(v, b);
                        }
                    }
                }
                return sf1Var2;
            case 2:
                lu1.g("filter", 1, list);
                tg1 b2 = sw1Var.b((tg1) list.get(0));
                if (b2 instanceof vg1) {
                    if (sf1Var.r() == 0) {
                        return new sf1();
                    }
                    sf1 sf1Var4 = (sf1) sf1Var.c();
                    sf1 b3 = b(sf1Var, sw1Var, (vg1) b2, null, Boolean.TRUE);
                    sf1 sf1Var5 = new sf1();
                    Iterator A2 = b3.A();
                    while (A2.hasNext()) {
                        sf1Var5.u(sf1Var4.s(((Integer) A2.next()).intValue()));
                    }
                    return sf1Var5;
                }
                throw new IllegalArgumentException("Callback should be a method");
            case t02.c.c /* 3 */:
                return c(sf1Var, sw1Var, list, true);
            case 4:
                if (list.isEmpty()) {
                    return new sf1();
                }
                int a = (int) lu1.a(sw1Var.b((tg1) list.get(0)).f().doubleValue());
                if (a < 0) {
                    a = Math.max(0, a + sf1Var.v());
                } else if (a > sf1Var.v()) {
                    a = sf1Var.v();
                }
                int v2 = sf1Var.v();
                sf1 sf1Var6 = new sf1();
                if (list.size() <= 1) {
                    while (a < v2) {
                        sf1Var6.u(sf1Var.s(a));
                        sf1Var.y(a, null);
                        a++;
                    }
                    return sf1Var6;
                }
                int max = Math.max(0, (int) lu1.a(sw1Var.b((tg1) list.get(1)).f().doubleValue()));
                if (max > 0) {
                    for (int i = a; i < Math.min(v2, a + max); i++) {
                        sf1Var6.u(sf1Var.s(a));
                        sf1Var.x(a);
                    }
                }
                if (list.size() > 2) {
                    for (int i2 = 2; i2 < list.size(); i2++) {
                        tg1 b4 = sw1Var.b((tg1) list.get(i2));
                        if (b4 instanceof fg1) {
                            throw new IllegalArgumentException("Failed to parse elements to add");
                        }
                        sf1Var.t((a + i2) - 2, b4);
                    }
                }
                return sf1Var6;
            case t02.c.e /* 5 */:
                lu1.g("forEach", 1, list);
                tg1 b5 = sw1Var.b((tg1) list.get(0));
                if (b5 instanceof vg1) {
                    if (sf1Var.r() == 0) {
                        return tg1.e;
                    }
                    a(sf1Var, sw1Var, (vg1) b5);
                    return tg1.e;
                }
                throw new IllegalArgumentException("Callback should be a method");
            case t02.c.f /* 6 */:
                lu1.n("lastIndexOf", 2, list);
                tg1 tg1Var = tg1.e;
                if (!list.isEmpty()) {
                    tg1Var = sw1Var.b((tg1) list.get(0));
                }
                double v3 = sf1Var.v() - 1;
                if (list.size() > 1) {
                    tg1 b6 = sw1Var.b((tg1) list.get(1));
                    v3 = Double.isNaN(b6.f().doubleValue()) ? sf1Var.v() - 1 : lu1.a(b6.f().doubleValue());
                    if (v3 < 0.0d) {
                        v3 += sf1Var.v();
                    }
                }
                if (v3 < 0.0d) {
                    return new bg1(Double.valueOf(-1.0d));
                }
                for (int min = (int) Math.min(sf1Var.v(), v3); min >= 0; min--) {
                    if (sf1Var.z(min) && lu1.h(sf1Var.s(min), tg1Var)) {
                        return new bg1(Double.valueOf(min));
                    }
                }
                return new bg1(Double.valueOf(-1.0d));
            case t02.c.g /* 7 */:
                if (!list.isEmpty()) {
                    sf1 sf1Var7 = new sf1();
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        tg1 b7 = sw1Var.b((tg1) it2.next());
                        if (b7 instanceof fg1) {
                            throw new IllegalStateException("Argument evaluation failed");
                        }
                        sf1Var7.u(b7);
                    }
                    int v4 = sf1Var7.v();
                    Iterator A3 = sf1Var.A();
                    while (A3.hasNext()) {
                        Integer num2 = (Integer) A3.next();
                        sf1Var7.y(num2.intValue() + v4, sf1Var.s(num2.intValue()));
                    }
                    sf1Var.C();
                    Iterator A4 = sf1Var7.A();
                    while (A4.hasNext()) {
                        Integer num3 = (Integer) A4.next();
                        sf1Var.y(num3.intValue(), sf1Var7.s(num3.intValue()));
                    }
                }
                return new bg1(Double.valueOf(sf1Var.v()));
            case PackageParser.PARSE_IGNORE_PROCESSES /* 8 */:
                lu1.g("map", 1, list);
                tg1 b8 = sw1Var.b((tg1) list.get(0));
                if (b8 instanceof vg1) {
                    return sf1Var.v() == 0 ? new sf1() : a(sf1Var, sw1Var, (vg1) b8);
                }
                throw new IllegalArgumentException("Callback should be a method");
            case '\t':
                lu1.g("pop", 0, list);
                int v5 = sf1Var.v();
                if (v5 == 0) {
                    return tg1.e;
                }
                int i3 = v5 - 1;
                tg1 s = sf1Var.s(i3);
                sf1Var.x(i3);
                return s;
            case '\n':
                lu1.n("join", 1, list);
                if (sf1Var.v() == 0) {
                    return tg1.l;
                }
                if (list.isEmpty()) {
                    str2 = ",";
                } else {
                    tg1 b9 = sw1Var.b((tg1) list.get(0));
                    str2 = ((b9 instanceof pg1) || (b9 instanceof hh1)) ? "" : b9.g();
                }
                return new xg1(sf1Var.w(str2));
            case 11:
                if (!list.isEmpty()) {
                    Iterator it3 = list.iterator();
                    while (it3.hasNext()) {
                        sf1Var.u(sw1Var.b((tg1) it3.next()));
                    }
                }
                return new bg1(Double.valueOf(sf1Var.v()));
            case '\f':
                lu1.g("some", 1, list);
                tg1 b10 = sw1Var.b((tg1) list.get(0));
                if (b10 instanceof jg1) {
                    if (sf1Var.v() != 0) {
                        jg1 jg1Var2 = (jg1) b10;
                        Iterator A5 = sf1Var.A();
                        while (A5.hasNext()) {
                            int intValue = ((Integer) A5.next()).intValue();
                            if (sf1Var.z(intValue) && jg1Var2.a(sw1Var, Arrays.asList(sf1Var.s(intValue), new bg1(Double.valueOf(intValue)), sf1Var)).d().booleanValue()) {
                                return tg1.j;
                            }
                        }
                    }
                    return tg1.k;
                }
                throw new IllegalArgumentException("Callback should be a method");
            case '\r':
                lu1.n("sort", 1, list);
                if (sf1Var.v() >= 2) {
                    List<tg1> B = sf1Var.B();
                    if (list.isEmpty()) {
                        jg1Var = null;
                    } else {
                        tg1 b11 = sw1Var.b((tg1) list.get(0));
                        if (!(b11 instanceof jg1)) {
                            throw new IllegalArgumentException("Comparator should be a method");
                        }
                        jg1Var = (jg1) b11;
                    }
                    Collections.sort(B, new ui1(jg1Var, sw1Var));
                    sf1Var.C();
                    int i4 = 0;
                    for (tg1 tg1Var2 : B) {
                        sf1Var.y(i4, tg1Var2);
                        i4++;
                    }
                }
                return sf1Var;
            case 14:
                lu1.g("every", 1, list);
                tg1 b12 = sw1Var.b((tg1) list.get(0));
                if (b12 instanceof vg1) {
                    return (sf1Var.v() == 0 || b(sf1Var, sw1Var, (vg1) b12, Boolean.FALSE, Boolean.TRUE).v() == sf1Var.v()) ? tg1.j : tg1.k;
                }
                throw new IllegalArgumentException("Callback should be a method");
            case 15:
                lu1.g("shift", 0, list);
                if (sf1Var.v() == 0) {
                    return tg1.e;
                }
                tg1 s2 = sf1Var.s(0);
                sf1Var.x(0);
                return s2;
            case PackageParser.PARSE_FORWARD_LOCK /* 16 */:
                lu1.n("slice", 2, list);
                if (list.isEmpty()) {
                    return sf1Var.c();
                }
                double v6 = sf1Var.v();
                double a2 = lu1.a(sw1Var.b((tg1) list.get(0)).f().doubleValue());
                double max2 = a2 < 0.0d ? Math.max(a2 + v6, 0.0d) : Math.min(a2, v6);
                if (list.size() == 2) {
                    double a3 = lu1.a(sw1Var.b((tg1) list.get(1)).f().doubleValue());
                    v6 = a3 < 0.0d ? Math.max(v6 + a3, 0.0d) : Math.min(v6, a3);
                }
                sf1 sf1Var8 = new sf1();
                for (int i5 = (int) max2; i5 < v6; i5++) {
                    sf1Var8.u(sf1Var.s(i5));
                }
                return sf1Var8;
            case 17:
                return c(sf1Var, sw1Var, list, false);
            case 18:
                lu1.g("reverse", 0, list);
                int v7 = sf1Var.v();
                if (v7 != 0) {
                    for (int i6 = 0; i6 < v7 / 2; i6++) {
                        if (sf1Var.z(i6)) {
                            tg1 s3 = sf1Var.s(i6);
                            sf1Var.y(i6, null);
                            int i7 = (v7 - 1) - i6;
                            if (sf1Var.z(i7)) {
                                sf1Var.y(i6, sf1Var.s(i7));
                            }
                            sf1Var.y(i7, s3);
                        }
                    }
                }
                return sf1Var;
            case 19:
                lu1.n("indexOf", 2, list);
                tg1 tg1Var3 = tg1.e;
                if (list.isEmpty()) {
                    sw1Var2 = sw1Var;
                } else {
                    sw1Var2 = sw1Var;
                    tg1Var3 = sw1Var2.b((tg1) list.get(0));
                }
                if (list.size() > 1) {
                    double a4 = lu1.a(sw1Var2.b((tg1) list.get(1)).f().doubleValue());
                    if (a4 >= sf1Var.v()) {
                        return new bg1(Double.valueOf(-1.0d));
                    }
                    d = a4 < 0.0d ? sf1Var.v() + a4 : a4;
                }
                Iterator A6 = sf1Var.A();
                while (A6.hasNext()) {
                    int intValue2 = ((Integer) A6.next()).intValue();
                    double d2 = intValue2;
                    if (d2 >= d && lu1.h(sf1Var.s(intValue2), tg1Var3)) {
                        return new bg1(Double.valueOf(d2));
                    }
                }
                return new bg1(Double.valueOf(-1.0d));
            default:
                throw new IllegalArgumentException("Command not supported");
        }
    }
}
