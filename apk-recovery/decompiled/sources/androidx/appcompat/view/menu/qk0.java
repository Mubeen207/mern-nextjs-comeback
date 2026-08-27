package androidx.appcompat.view.menu;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Map;
import java.util.TreeMap;
/* loaded from: classes.dex */
public abstract class qk0 {
    public static final byte[] a = {112, 114, 111, 0};
    public static final byte[] b = {112, 114, 109, 0};

    public static void A(InputStream inputStream) {
        mo.h(inputStream);
        int j = mo.j(inputStream);
        if (j == 6 || j == 7) {
            return;
        }
        while (j > 0) {
            mo.j(inputStream);
            for (int j2 = mo.j(inputStream); j2 > 0; j2--) {
                mo.h(inputStream);
            }
            j--;
        }
    }

    public static boolean B(OutputStream outputStream, byte[] bArr, sl[] slVarArr) {
        if (Arrays.equals(bArr, rk0.a)) {
            N(outputStream, slVarArr);
            return true;
        } else if (Arrays.equals(bArr, rk0.b)) {
            M(outputStream, slVarArr);
            return true;
        } else if (Arrays.equals(bArr, rk0.d)) {
            K(outputStream, slVarArr);
            return true;
        } else if (Arrays.equals(bArr, rk0.c)) {
            L(outputStream, slVarArr);
            return true;
        } else if (Arrays.equals(bArr, rk0.e)) {
            J(outputStream, slVarArr);
            return true;
        } else {
            return false;
        }
    }

    public static void C(OutputStream outputStream, sl slVar) {
        int i = 0;
        for (int i2 : slVar.h) {
            Integer valueOf = Integer.valueOf(i2);
            mo.p(outputStream, valueOf.intValue() - i);
            i = valueOf.intValue();
        }
    }

    public static wa1 D(sl[] slVarArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            mo.p(byteArrayOutputStream, slVarArr.length);
            int i = 2;
            for (sl slVar : slVarArr) {
                mo.q(byteArrayOutputStream, slVar.c);
                mo.q(byteArrayOutputStream, slVar.d);
                mo.q(byteArrayOutputStream, slVar.g);
                String j = j(slVar.a, slVar.b, rk0.a);
                int k = mo.k(j);
                mo.p(byteArrayOutputStream, k);
                i = i + 14 + k;
                mo.n(byteArrayOutputStream, j);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (i == byteArray.length) {
                wa1 wa1Var = new wa1(pr.DEX_FILES, i, byteArray, false);
                byteArrayOutputStream.close();
                return wa1Var;
            }
            throw mo.c("Expected size " + i + ", does not match actual size " + byteArray.length);
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static void E(OutputStream outputStream, byte[] bArr) {
        outputStream.write(a);
        outputStream.write(bArr);
    }

    public static void F(OutputStream outputStream, sl slVar) {
        I(outputStream, slVar);
        C(outputStream, slVar);
        H(outputStream, slVar);
    }

    public static void G(OutputStream outputStream, sl slVar, String str) {
        mo.p(outputStream, mo.k(str));
        mo.p(outputStream, slVar.e);
        mo.q(outputStream, slVar.f);
        mo.q(outputStream, slVar.c);
        mo.q(outputStream, slVar.g);
        mo.n(outputStream, str);
    }

    public static void H(OutputStream outputStream, sl slVar) {
        byte[] bArr = new byte[k(slVar.g)];
        for (Map.Entry entry : slVar.i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            if ((intValue2 & 2) != 0) {
                z(bArr, 2, intValue, slVar);
            }
            if ((intValue2 & 4) != 0) {
                z(bArr, 4, intValue, slVar);
            }
        }
        outputStream.write(bArr);
    }

    public static void I(OutputStream outputStream, sl slVar) {
        int i = 0;
        for (Map.Entry entry : slVar.i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                mo.p(outputStream, intValue - i);
                mo.p(outputStream, 0);
                i = intValue;
            }
        }
    }

    public static void J(OutputStream outputStream, sl[] slVarArr) {
        mo.p(outputStream, slVarArr.length);
        for (sl slVar : slVarArr) {
            String j = j(slVar.a, slVar.b, rk0.e);
            mo.p(outputStream, mo.k(j));
            mo.p(outputStream, slVar.i.size());
            mo.p(outputStream, slVar.h.length);
            mo.q(outputStream, slVar.c);
            mo.n(outputStream, j);
            for (Integer num : slVar.i.keySet()) {
                mo.p(outputStream, num.intValue());
            }
            for (int i : slVar.h) {
                mo.p(outputStream, i);
            }
        }
    }

    public static void K(OutputStream outputStream, sl[] slVarArr) {
        mo.r(outputStream, slVarArr.length);
        for (sl slVar : slVarArr) {
            String j = j(slVar.a, slVar.b, rk0.d);
            mo.p(outputStream, mo.k(j));
            mo.p(outputStream, slVar.h.length);
            mo.q(outputStream, slVar.i.size() * 4);
            mo.q(outputStream, slVar.c);
            mo.n(outputStream, j);
            for (Integer num : slVar.i.keySet()) {
                mo.p(outputStream, num.intValue());
                mo.p(outputStream, 0);
            }
            for (int i : slVar.h) {
                mo.p(outputStream, i);
            }
        }
    }

    public static void L(OutputStream outputStream, sl[] slVarArr) {
        byte[] b2 = b(slVarArr, rk0.c);
        mo.r(outputStream, slVarArr.length);
        mo.m(outputStream, b2);
    }

    public static void M(OutputStream outputStream, sl[] slVarArr) {
        byte[] b2 = b(slVarArr, rk0.b);
        mo.r(outputStream, slVarArr.length);
        mo.m(outputStream, b2);
    }

    public static void N(OutputStream outputStream, sl[] slVarArr) {
        O(outputStream, slVarArr);
    }

    public static void O(OutputStream outputStream, sl[] slVarArr) {
        int length;
        byte[] bArr;
        ArrayList arrayList = new ArrayList(3);
        ArrayList arrayList2 = new ArrayList(3);
        arrayList.add(D(slVarArr));
        arrayList.add(c(slVarArr));
        arrayList.add(d(slVarArr));
        long length2 = rk0.a.length + a.length + 4 + (arrayList.size() * 16);
        mo.q(outputStream, arrayList.size());
        for (int i = 0; i < arrayList.size(); i++) {
            wa1 wa1Var = (wa1) arrayList.get(i);
            mo.q(outputStream, wa1Var.a.e());
            mo.q(outputStream, length2);
            if (wa1Var.d) {
                byte[] b2 = mo.b(wa1Var.c);
                arrayList2.add(b2);
                mo.q(outputStream, b2.length);
                mo.q(outputStream, bArr.length);
                length = b2.length;
            } else {
                arrayList2.add(wa1Var.c);
                mo.q(outputStream, wa1Var.c.length);
                mo.q(outputStream, 0L);
                length = wa1Var.c.length;
            }
            length2 += length;
        }
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            outputStream.write((byte[]) arrayList2.get(i2));
        }
    }

    public static int a(sl slVar) {
        int i = 0;
        for (Map.Entry entry : slVar.i.entrySet()) {
            i |= ((Integer) entry.getValue()).intValue();
        }
        return i;
    }

    public static byte[] b(sl[] slVarArr, byte[] bArr) {
        int i = 0;
        int i2 = 0;
        for (sl slVar : slVarArr) {
            i2 += mo.k(j(slVar.a, slVar.b, bArr)) + 16 + (slVar.e * 2) + slVar.f + k(slVar.g);
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i2);
        if (Arrays.equals(bArr, rk0.c)) {
            int length = slVarArr.length;
            while (i < length) {
                sl slVar2 = slVarArr[i];
                G(byteArrayOutputStream, slVar2, j(slVar2.a, slVar2.b, bArr));
                F(byteArrayOutputStream, slVar2);
                i++;
            }
        } else {
            for (sl slVar3 : slVarArr) {
                G(byteArrayOutputStream, slVar3, j(slVar3.a, slVar3.b, bArr));
            }
            int length2 = slVarArr.length;
            while (i < length2) {
                F(byteArrayOutputStream, slVarArr[i]);
                i++;
            }
        }
        if (byteArrayOutputStream.size() == i2) {
            return byteArrayOutputStream.toByteArray();
        }
        throw mo.c("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + i2);
    }

    public static wa1 c(sl[] slVarArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = 0;
        for (int i2 = 0; i2 < slVarArr.length; i2++) {
            try {
                sl slVar = slVarArr[i2];
                mo.p(byteArrayOutputStream, i2);
                mo.p(byteArrayOutputStream, slVar.e);
                i = i + 4 + (slVar.e * 2);
                C(byteArrayOutputStream, slVar);
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (i == byteArray.length) {
            wa1 wa1Var = new wa1(pr.CLASSES, i, byteArray, true);
            byteArrayOutputStream.close();
            return wa1Var;
        }
        throw mo.c("Expected size " + i + ", does not match actual size " + byteArray.length);
    }

    public static wa1 d(sl[] slVarArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = 0;
        for (int i2 = 0; i2 < slVarArr.length; i2++) {
            try {
                sl slVar = slVarArr[i2];
                int a2 = a(slVar);
                byte[] e = e(slVar);
                byte[] f = f(slVar);
                mo.p(byteArrayOutputStream, i2);
                int length = e.length + 2 + f.length;
                mo.q(byteArrayOutputStream, length);
                mo.p(byteArrayOutputStream, a2);
                byteArrayOutputStream.write(e);
                byteArrayOutputStream.write(f);
                i = i + 6 + length;
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (i == byteArray.length) {
            wa1 wa1Var = new wa1(pr.METHODS, i, byteArray, true);
            byteArrayOutputStream.close();
            return wa1Var;
        }
        throw mo.c("Expected size " + i + ", does not match actual size " + byteArray.length);
    }

    public static byte[] e(sl slVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            H(byteArrayOutputStream, slVar);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static byte[] f(sl slVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            I(byteArrayOutputStream, slVar);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static String g(String str, String str2) {
        return "!".equals(str2) ? str.replace(":", "!") : ":".equals(str2) ? str.replace("!", ":") : str;
    }

    public static String h(String str) {
        int indexOf = str.indexOf("!");
        if (indexOf < 0) {
            indexOf = str.indexOf(":");
        }
        return indexOf > 0 ? str.substring(indexOf + 1) : str;
    }

    public static sl i(sl[] slVarArr, String str) {
        if (slVarArr.length <= 0) {
            return null;
        }
        String h = h(str);
        for (int i = 0; i < slVarArr.length; i++) {
            if (slVarArr[i].b.equals(h)) {
                return slVarArr[i];
            }
        }
        return null;
    }

    public static String j(String str, String str2, byte[] bArr) {
        String a2 = rk0.a(bArr);
        if (str.length() <= 0) {
            return g(str2, a2);
        }
        if (str2.equals("classes.dex")) {
            return str;
        }
        if (str2.contains("!") || str2.contains(":")) {
            return g(str2, a2);
        }
        if (str2.endsWith(".apk")) {
            return str2;
        }
        return str + rk0.a(bArr) + str2;
    }

    public static int k(int i) {
        return y(i * 2) / 8;
    }

    public static int l(int i, int i2, int i3) {
        if (i != 1) {
            if (i != 2) {
                if (i == 4) {
                    return i2 + i3;
                }
                throw mo.c("Unexpected flag: " + i);
            }
            return i2;
        }
        throw mo.c("HOT methods are not stored in the bitmap");
    }

    public static int[] m(InputStream inputStream, int i) {
        int[] iArr = new int[i];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += mo.h(inputStream);
            iArr[i3] = i2;
        }
        return iArr;
    }

    public static int n(BitSet bitSet, int i, int i2) {
        int i3 = bitSet.get(l(2, i, i2)) ? 2 : 0;
        return bitSet.get(l(4, i, i2)) ? i3 | 4 : i3;
    }

    public static byte[] o(InputStream inputStream, byte[] bArr) {
        if (Arrays.equals(bArr, mo.d(inputStream, bArr.length))) {
            return mo.d(inputStream, rk0.b.length);
        }
        throw mo.c("Invalid magic");
    }

    public static void p(InputStream inputStream, sl slVar) {
        int available = inputStream.available() - slVar.f;
        int i = 0;
        while (inputStream.available() > available) {
            i += mo.h(inputStream);
            slVar.i.put(Integer.valueOf(i), 1);
            for (int h = mo.h(inputStream); h > 0; h--) {
                A(inputStream);
            }
        }
        if (inputStream.available() != available) {
            throw mo.c("Read too much data during profile line parse");
        }
    }

    public static sl[] q(InputStream inputStream, byte[] bArr, byte[] bArr2, sl[] slVarArr) {
        if (Arrays.equals(bArr, rk0.f)) {
            if (Arrays.equals(rk0.a, bArr2)) {
                throw mo.c("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
            }
            return r(inputStream, bArr, slVarArr);
        } else if (Arrays.equals(bArr, rk0.g)) {
            return t(inputStream, bArr2, slVarArr);
        } else {
            throw mo.c("Unsupported meta version");
        }
    }

    public static sl[] r(InputStream inputStream, byte[] bArr, sl[] slVarArr) {
        if (Arrays.equals(bArr, rk0.f)) {
            int j = mo.j(inputStream);
            byte[] e = mo.e(inputStream, (int) mo.i(inputStream), (int) mo.i(inputStream));
            if (inputStream.read() <= 0) {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(e);
                try {
                    sl[] s = s(byteArrayInputStream, j, slVarArr);
                    byteArrayInputStream.close();
                    return s;
                } catch (Throwable th) {
                    try {
                        byteArrayInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            throw mo.c("Content found after the end of file");
        }
        throw mo.c("Unsupported meta version");
    }

    public static sl[] s(InputStream inputStream, int i, sl[] slVarArr) {
        if (inputStream.available() == 0) {
            return new sl[0];
        }
        if (i == slVarArr.length) {
            String[] strArr = new String[i];
            int[] iArr = new int[i];
            for (int i2 = 0; i2 < i; i2++) {
                int h = mo.h(inputStream);
                iArr[i2] = mo.h(inputStream);
                strArr[i2] = mo.f(inputStream, h);
            }
            for (int i3 = 0; i3 < i; i3++) {
                sl slVar = slVarArr[i3];
                if (!slVar.b.equals(strArr[i3])) {
                    throw mo.c("Order of dexfiles in metadata did not match baseline");
                }
                int i4 = iArr[i3];
                slVar.e = i4;
                slVar.h = m(inputStream, i4);
            }
            return slVarArr;
        }
        throw mo.c("Mismatched number of dex files found in metadata");
    }

    public static sl[] t(InputStream inputStream, byte[] bArr, sl[] slVarArr) {
        int h = mo.h(inputStream);
        byte[] e = mo.e(inputStream, (int) mo.i(inputStream), (int) mo.i(inputStream));
        if (inputStream.read() <= 0) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(e);
            try {
                sl[] u = u(byteArrayInputStream, bArr, h, slVarArr);
                byteArrayInputStream.close();
                return u;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        throw mo.c("Content found after the end of file");
    }

    public static sl[] u(InputStream inputStream, byte[] bArr, int i, sl[] slVarArr) {
        if (inputStream.available() == 0) {
            return new sl[0];
        }
        if (i == slVarArr.length) {
            for (int i2 = 0; i2 < i; i2++) {
                mo.h(inputStream);
                String f = mo.f(inputStream, mo.h(inputStream));
                long i3 = mo.i(inputStream);
                int h = mo.h(inputStream);
                sl i4 = i(slVarArr, f);
                if (i4 == null) {
                    throw mo.c("Missing profile key: " + f);
                }
                i4.d = i3;
                int[] m = m(inputStream, h);
                if (Arrays.equals(bArr, rk0.e)) {
                    i4.e = h;
                    i4.h = m;
                }
            }
            return slVarArr;
        }
        throw mo.c("Mismatched number of dex files found in metadata");
    }

    public static void v(InputStream inputStream, sl slVar) {
        BitSet valueOf = BitSet.valueOf(mo.d(inputStream, mo.a(slVar.g * 2)));
        int i = 0;
        while (true) {
            int i2 = slVar.g;
            if (i >= i2) {
                return;
            }
            int n = n(valueOf, i, i2);
            if (n != 0) {
                Integer num = (Integer) slVar.i.get(Integer.valueOf(i));
                if (num == null) {
                    num = 0;
                }
                slVar.i.put(Integer.valueOf(i), Integer.valueOf(n | num.intValue()));
            }
            i++;
        }
    }

    public static sl[] w(InputStream inputStream, byte[] bArr, String str) {
        if (Arrays.equals(bArr, rk0.b)) {
            int j = mo.j(inputStream);
            byte[] e = mo.e(inputStream, (int) mo.i(inputStream), (int) mo.i(inputStream));
            if (inputStream.read() <= 0) {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(e);
                try {
                    sl[] x = x(byteArrayInputStream, str, j);
                    byteArrayInputStream.close();
                    return x;
                } catch (Throwable th) {
                    try {
                        byteArrayInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            throw mo.c("Content found after the end of file");
        }
        throw mo.c("Unsupported version");
    }

    public static sl[] x(InputStream inputStream, String str, int i) {
        if (inputStream.available() == 0) {
            return new sl[0];
        }
        sl[] slVarArr = new sl[i];
        for (int i2 = 0; i2 < i; i2++) {
            int h = mo.h(inputStream);
            int h2 = mo.h(inputStream);
            slVarArr[i2] = new sl(str, mo.f(inputStream, h), mo.i(inputStream), 0L, h2, (int) mo.i(inputStream), (int) mo.i(inputStream), new int[h2], new TreeMap());
        }
        for (int i3 = 0; i3 < i; i3++) {
            sl slVar = slVarArr[i3];
            p(inputStream, slVar);
            slVar.h = m(inputStream, slVar.e);
            v(inputStream, slVar);
        }
        return slVarArr;
    }

    public static int y(int i) {
        return (i + 7) & (-8);
    }

    public static void z(byte[] bArr, int i, int i2, sl slVar) {
        int l = l(i, i2, slVar.g);
        int i3 = l / 8;
        bArr[i3] = (byte) ((1 << (l % 8)) | bArr[i3]);
    }
}
