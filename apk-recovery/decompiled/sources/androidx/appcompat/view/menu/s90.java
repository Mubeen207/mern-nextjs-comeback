package androidx.appcompat.view.menu;

import android.os.LocaleList;
import java.util.Locale;
/* loaded from: classes.dex */
public final class s90 {
    public static final s90 b = a(new Locale[0]);
    public final t90 a;

    /* loaded from: classes.dex */
    public static class a {
        public static LocaleList a(Locale... localeArr) {
            return new LocaleList(localeArr);
        }

        public static LocaleList b() {
            return LocaleList.getAdjustedDefault();
        }

        public static LocaleList c() {
            return LocaleList.getDefault();
        }
    }

    public s90(t90 t90Var) {
        this.a = t90Var;
    }

    public static s90 a(Locale... localeArr) {
        return d(a.a(localeArr));
    }

    public static s90 d(LocaleList localeList) {
        return new s90(new u90(localeList));
    }

    public Locale b(int i) {
        return this.a.get(i);
    }

    public Object c() {
        return this.a.a();
    }

    public boolean equals(Object obj) {
        return (obj instanceof s90) && this.a.equals(((s90) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return this.a.toString();
    }
}
