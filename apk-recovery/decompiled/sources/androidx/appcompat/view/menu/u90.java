package androidx.appcompat.view.menu;

import android.os.LocaleList;
import java.util.Locale;
/* loaded from: classes.dex */
public final class u90 implements t90 {
    public final LocaleList a;

    public u90(Object obj) {
        this.a = (LocaleList) obj;
    }

    @Override // androidx.appcompat.view.menu.t90
    public Object a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        return this.a.equals(((t90) obj).a());
    }

    @Override // androidx.appcompat.view.menu.t90
    public Locale get(int i) {
        return this.a.get(i);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return this.a.toString();
    }
}
