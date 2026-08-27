package androidx.appcompat.view.menu;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public final class nr {
    public final String a;
    public final Map b;

    /* loaded from: classes.dex */
    public static final class b {
        public final String a;
        public Map b = null;

        public b(String str) {
            this.a = str;
        }

        public nr a() {
            return new nr(this.a, this.b == null ? Collections.emptyMap() : Collections.unmodifiableMap(new HashMap(this.b)));
        }

        public b b(Annotation annotation) {
            if (this.b == null) {
                this.b = new HashMap();
            }
            this.b.put(annotation.annotationType(), annotation);
            return this;
        }
    }

    public static b a(String str) {
        return new b(str);
    }

    public static nr d(String str) {
        return new nr(str, Collections.emptyMap());
    }

    public String b() {
        return this.a;
    }

    public Annotation c(Class cls) {
        return (Annotation) this.b.get(cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof nr) {
            nr nrVar = (nr) obj;
            return this.a.equals(nrVar.a) && this.b.equals(nrVar.b);
        }
        return false;
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        return "FieldDescriptor{name=" + this.a + ", properties=" + this.b.values() + "}";
    }

    public nr(String str, Map map) {
        this.a = str;
        this.b = map;
    }
}
