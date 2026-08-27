package androidx.appcompat.view.menu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class ma0 {
    public static final ma0 c = new a().a();
    public final String a;
    public final List b;

    /* loaded from: classes.dex */
    public static final class a {
        public String a = "";
        public List b = new ArrayList();

        public ma0 a() {
            return new ma0(this.a, Collections.unmodifiableList(this.b));
        }

        public a b(List list) {
            this.b = list;
            return this;
        }

        public a c(String str) {
            this.a = str;
            return this;
        }
    }

    public ma0(String str, List list) {
        this.a = str;
        this.b = list;
    }

    public static a c() {
        return new a();
    }

    public List a() {
        return this.b;
    }

    public String b() {
        return this.a;
    }
}
