package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public interface ez {

    /* loaded from: classes.dex */
    public enum a {
        NONE(0),
        SDK(1),
        GLOBAL(2),
        COMBINED(3);
        
        public final int m;

        a(int i) {
            this.m = i;
        }

        public int c() {
            return this.m;
        }
    }

    a b(String str);
}
