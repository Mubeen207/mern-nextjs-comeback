package androidx.appcompat.view.menu;

import android.accounts.Account;
import android.view.View;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/* loaded from: classes.dex */
public final class ac {
    public final Account a;
    public final Set b;
    public final Set c;
    public final Map d;
    public final int e;
    public final View f;
    public final String g;
    public final String h;
    public final ou0 i;
    public Integer j;

    /* loaded from: classes.dex */
    public static final class a {
        public Account a;
        public q4 b;
        public String c;
        public String d;
        public ou0 e = ou0.j;

        public ac a() {
            return new ac(this.a, this.b, null, 0, null, this.c, this.d, this.e, false);
        }

        public a b(String str) {
            this.c = str;
            return this;
        }

        public final a c(Collection collection) {
            if (this.b == null) {
                this.b = new q4();
            }
            this.b.addAll(collection);
            return this;
        }

        public final a d(Account account) {
            this.a = account;
            return this;
        }

        public final a e(String str) {
            this.d = str;
            return this;
        }
    }

    public ac(Account account, Set set, Map map, int i, View view, String str, String str2, ou0 ou0Var, boolean z) {
        this.a = account;
        Set emptySet = set == null ? Collections.emptySet() : Collections.unmodifiableSet(set);
        this.b = emptySet;
        map = map == null ? Collections.emptyMap() : map;
        this.d = map;
        this.f = view;
        this.e = i;
        this.g = str;
        this.h = str2;
        this.i = ou0Var == null ? ou0.j : ou0Var;
        HashSet hashSet = new HashSet(emptySet);
        Iterator it = map.values().iterator();
        if (it.hasNext()) {
            my0.a(it.next());
            throw null;
        } else {
            this.c = Collections.unmodifiableSet(hashSet);
        }
    }

    public Account a() {
        return this.a;
    }

    public Account b() {
        Account account = this.a;
        return account != null ? account : new Account("<<default account>>", "com.google");
    }

    public Set c() {
        return this.c;
    }

    public String d() {
        return this.g;
    }

    public Set e() {
        return this.b;
    }

    public final ou0 f() {
        return this.i;
    }

    public final Integer g() {
        return this.j;
    }

    public final String h() {
        return this.h;
    }

    public final void i(Integer num) {
        this.j = num;
    }
}
