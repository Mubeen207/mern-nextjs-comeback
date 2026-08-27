package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public enum eg1 {
    UNSET('0'),
    REMOTE_DEFAULT('1'),
    REMOTE_DELEGATION('2'),
    MANIFEST('3'),
    INITIALIZATION('4'),
    API('5'),
    CHILD_ACCOUNT('6'),
    FAILSAFE('9');
    
    public final char m;

    eg1(char c) {
        this.m = c;
    }

    public static eg1 e(char c) {
        eg1[] values;
        for (eg1 eg1Var : values()) {
            if (eg1Var.m == c) {
                return eg1Var;
            }
        }
        return UNSET;
    }
}
