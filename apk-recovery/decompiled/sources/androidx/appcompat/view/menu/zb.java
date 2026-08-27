package androidx.appcompat.view.menu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class zb {
    public static final zb e = new a().b();
    public final x01 a;
    public final List b;
    public final tx c;
    public final String d;

    /* loaded from: classes.dex */
    public static final class a {
        public x01 a = null;
        public List b = new ArrayList();
        public tx c = null;
        public String d = "";

        public a a(ma0 ma0Var) {
            this.b.add(ma0Var);
            return this;
        }

        public zb b() {
            return new zb(this.a, Collections.unmodifiableList(this.b), this.c, this.d);
        }

        public a c(String str) {
            this.d = str;
            return this;
        }

        public a d(tx txVar) {
            this.c = txVar;
            return this;
        }

        public a e(x01 x01Var) {
            this.a = x01Var;
            return this;
        }
    }

    public zb(x01 x01Var, List list, tx txVar, String str) {
        this.a = x01Var;
        this.b = list;
        this.c = txVar;
        this.d = str;
    }

    public static a e() {
        return new a();
    }

    public String a() {
        return this.d;
    }

    public tx b() {
        return this.c;
    }

    public List c() {
        return this.b;
    }

    public x01 d() {
        return this.a;
    }

    public byte[] f() {
        return yk0.a(this);
    }
}
