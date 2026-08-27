package androidx.appcompat.view.menu;

import androidx.appcompat.view.menu.ap;
import java.util.Map;
/* loaded from: classes.dex */
public final class t5 extends ap {
    public final String a;
    public final Integer b;
    public final jo c;
    public final long d;
    public final long e;
    public final Map f;

    /* loaded from: classes.dex */
    public static final class b extends ap.a {
        public String a;
        public Integer b;
        public jo c;
        public Long d;
        public Long e;
        public Map f;

        @Override // androidx.appcompat.view.menu.ap.a
        public ap d() {
            String str = "";
            if (this.a == null) {
                str = " transportName";
            }
            if (this.c == null) {
                str = str + " encodedPayload";
            }
            if (this.d == null) {
                str = str + " eventMillis";
            }
            if (this.e == null) {
                str = str + " uptimeMillis";
            }
            if (this.f == null) {
                str = str + " autoMetadata";
            }
            if (str.isEmpty()) {
                return new t5(this.a, this.b, this.c, this.d.longValue(), this.e.longValue(), this.f);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // androidx.appcompat.view.menu.ap.a
        public Map e() {
            Map map = this.f;
            if (map != null) {
                return map;
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }

        @Override // androidx.appcompat.view.menu.ap.a
        public ap.a f(Map map) {
            if (map != null) {
                this.f = map;
                return this;
            }
            throw new NullPointerException("Null autoMetadata");
        }

        @Override // androidx.appcompat.view.menu.ap.a
        public ap.a g(Integer num) {
            this.b = num;
            return this;
        }

        @Override // androidx.appcompat.view.menu.ap.a
        public ap.a h(jo joVar) {
            if (joVar != null) {
                this.c = joVar;
                return this;
            }
            throw new NullPointerException("Null encodedPayload");
        }

        @Override // androidx.appcompat.view.menu.ap.a
        public ap.a i(long j) {
            this.d = Long.valueOf(j);
            return this;
        }

        @Override // androidx.appcompat.view.menu.ap.a
        public ap.a j(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null transportName");
        }

        @Override // androidx.appcompat.view.menu.ap.a
        public ap.a k(long j) {
            this.e = Long.valueOf(j);
            return this;
        }
    }

    @Override // androidx.appcompat.view.menu.ap
    public Map c() {
        return this.f;
    }

    @Override // androidx.appcompat.view.menu.ap
    public Integer d() {
        return this.b;
    }

    @Override // androidx.appcompat.view.menu.ap
    public jo e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ap) {
            ap apVar = (ap) obj;
            return this.a.equals(apVar.j()) && ((num = this.b) != null ? num.equals(apVar.d()) : apVar.d() == null) && this.c.equals(apVar.e()) && this.d == apVar.f() && this.e == apVar.k() && this.f.equals(apVar.c());
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.ap
    public long f() {
        return this.d;
    }

    public int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.b;
        int hashCode2 = num == null ? 0 : num.hashCode();
        long j = this.d;
        long j2 = this.e;
        return ((((((((hashCode ^ hashCode2) * 1000003) ^ this.c.hashCode()) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.f.hashCode();
    }

    @Override // androidx.appcompat.view.menu.ap
    public String j() {
        return this.a;
    }

    @Override // androidx.appcompat.view.menu.ap
    public long k() {
        return this.e;
    }

    public String toString() {
        return "EventInternal{transportName=" + this.a + ", code=" + this.b + ", encodedPayload=" + this.c + ", eventMillis=" + this.d + ", uptimeMillis=" + this.e + ", autoMetadata=" + this.f + "}";
    }

    public t5(String str, Integer num, jo joVar, long j, long j2, Map map) {
        this.a = str;
        this.b = num;
        this.c = joVar;
        this.d = j;
        this.e = j2;
        this.f = map;
    }
}
