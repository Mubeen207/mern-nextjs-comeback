package androidx.appcompat.view.menu;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
/* loaded from: classes.dex */
public abstract class dx1 implements z32 {
    protected int zza = 0;

    public static void f(Iterable iterable, List list) {
        y02.e(iterable);
        if (iterable instanceof f22) {
            List b = ((f22) iterable).b();
            f22 f22Var = (f22) list;
            int size = list.size();
            for (Object obj : b) {
                if (obj == null) {
                    String str = "Element at index " + (f22Var.size() - size) + " is null.";
                    for (int size2 = f22Var.size() - 1; size2 >= size; size2--) {
                        f22Var.remove(size2);
                    }
                    throw new NullPointerException(str);
                } else if (obj instanceof tx1) {
                    f22Var.q((tx1) obj);
                } else {
                    f22Var.add((String) obj);
                }
            }
        } else if (iterable instanceof u42) {
            list.addAll((Collection) iterable);
        } else {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
            }
            int size3 = list.size();
            for (Object obj2 : iterable) {
                if (obj2 == null) {
                    String str2 = "Element at index " + (list.size() - size3) + " is null.";
                    for (int size4 = list.size() - 1; size4 >= size3; size4--) {
                        list.remove(size4);
                    }
                    throw new NullPointerException(str2);
                }
                list.add(obj2);
            }
        }
    }

    public abstract int e(m52 m52Var);

    public abstract int g();

    public final byte[] h() {
        try {
            byte[] bArr = new byte[a()];
            mz1 D = mz1.D(bArr);
            c(D);
            D.E();
            return bArr;
        } catch (IOException e) {
            String name = getClass().getName();
            throw new RuntimeException("Serializing " + name + " to a byte array threw an IOException (should never happen).", e);
        }
    }

    public abstract void i(int i);
}
