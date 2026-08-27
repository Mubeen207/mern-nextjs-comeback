package androidx.appcompat.view.menu;

import androidx.appcompat.view.menu.q5;
/* loaded from: classes.dex */
public abstract class yb {

    /* loaded from: classes.dex */
    public static abstract class a {
        public abstract yb a();

        public abstract a b(c2 c2Var);

        public abstract a c(b bVar);
    }

    /* loaded from: classes.dex */
    public enum b {
        UNKNOWN(0),
        ANDROID_FIREBASE(23);
        
        public final int m;

        b(int i) {
            this.m = i;
        }
    }

    public static a a() {
        return new q5.b();
    }

    public abstract c2 b();

    public abstract b c();
}
