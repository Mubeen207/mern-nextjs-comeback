package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public enum te2 {
    DEBUG(3),
    ERROR(6),
    INFO(4),
    VERBOSE(2),
    WARN(5);
    
    public final int m;

    te2(int i) {
        this.m = i;
    }

    public static te2 c(int i) {
        return i != 2 ? i != 3 ? i != 5 ? i != 6 ? INFO : ERROR : WARN : DEBUG : VERBOSE;
    }
}
