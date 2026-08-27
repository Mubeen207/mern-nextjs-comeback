package androidx.appcompat.view.menu;

import androidx.appcompat.view.menu.k6;
/* loaded from: classes.dex */
public abstract class d11 {

    /* loaded from: classes.dex */
    public static abstract class a {
        public abstract d11 a();

        public abstract a b(b bVar);

        public abstract a c(String str);

        public abstract a d(long j);
    }

    /* loaded from: classes.dex */
    public enum b {
        OK,
        BAD_CONFIG,
        AUTH_ERROR
    }

    public static a a() {
        return new k6.b().d(0L);
    }

    public abstract b b();

    public abstract String c();

    public abstract long d();
}
