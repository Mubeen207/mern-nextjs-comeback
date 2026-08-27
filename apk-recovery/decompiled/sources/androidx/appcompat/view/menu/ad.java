package androidx.appcompat.view.menu;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
/* loaded from: classes.dex */
public abstract class ad extends zc {
    public static boolean n(Iterable iterable, Object obj) {
        c60.e(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).contains(obj) : o(iterable, obj) >= 0;
    }

    public static final int o(Iterable iterable, Object obj) {
        c60.e(iterable, "<this>");
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(obj);
        }
        int i = 0;
        for (Object obj2 : iterable) {
            if (i < 0) {
                sc.i();
            }
            if (c60.a(obj, obj2)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static final Appendable p(Iterable iterable, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, kw kwVar) {
        c60.e(iterable, "<this>");
        c60.e(appendable, "buffer");
        c60.e(charSequence, "separator");
        c60.e(charSequence2, "prefix");
        c60.e(charSequence3, "postfix");
        c60.e(charSequence4, "truncated");
        appendable.append(charSequence2);
        int i2 = 0;
        for (Object obj : iterable) {
            i2++;
            if (i2 > 1) {
                appendable.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            rx0.a(appendable, obj, kwVar);
        }
        if (i >= 0 && i2 > i) {
            appendable.append(charSequence4);
        }
        appendable.append(charSequence3);
        return appendable;
    }

    public static final String q(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, kw kwVar) {
        c60.e(iterable, "<this>");
        c60.e(charSequence, "separator");
        c60.e(charSequence2, "prefix");
        c60.e(charSequence3, "postfix");
        c60.e(charSequence4, "truncated");
        String sb = ((StringBuilder) p(iterable, new StringBuilder(), charSequence, charSequence2, charSequence3, i, charSequence4, kwVar)).toString();
        c60.d(sb, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb;
    }

    public static /* synthetic */ String r(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, kw kwVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            charSequence = ", ";
        }
        String str = (i2 & 2) != 0 ? "" : charSequence2;
        String str2 = (i2 & 4) == 0 ? charSequence3 : "";
        if ((i2 & 8) != 0) {
            i = -1;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence5 = charSequence4;
        if ((i2 & 32) != 0) {
            kwVar = null;
        }
        return q(iterable, charSequence, str, str2, i3, charSequence5, kwVar);
    }

    public static Object s(List list) {
        c60.e(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(sc.f(list));
    }

    public static final Collection t(Iterable iterable, Collection collection) {
        c60.e(iterable, "<this>");
        c60.e(collection, "destination");
        for (Object obj : iterable) {
            collection.add(obj);
        }
        return collection;
    }

    public static List u(Iterable iterable) {
        List h;
        List e;
        List b;
        List w;
        c60.e(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            h = sc.h(v(iterable));
            return h;
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            e = sc.e();
            return e;
        } else if (size != 1) {
            w = w(collection);
            return w;
        } else {
            b = rc.b(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
            return b;
        }
    }

    public static final List v(Iterable iterable) {
        List w;
        c60.e(iterable, "<this>");
        if (iterable instanceof Collection) {
            w = w((Collection) iterable);
            return w;
        }
        return (List) t(iterable, new ArrayList());
    }

    public static List w(Collection collection) {
        c60.e(collection, "<this>");
        return new ArrayList(collection);
    }

    public static Set x(Iterable iterable) {
        Set b;
        int a;
        c60.e(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size == 0) {
                b = kt0.b();
                return b;
            } else if (size == 1) {
                return jt0.a(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
            } else {
                a = eb0.a(collection.size());
                return (Set) t(iterable, new LinkedHashSet(a));
            }
        }
        return kt0.c((Set) t(iterable, new LinkedHashSet()));
    }
}
