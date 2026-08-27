package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public abstract class ab {
    public static final sa a(int i, u8 u8Var, kw kwVar) {
        sa v8Var;
        if (i == -2) {
            v8Var = u8Var == u8.SUSPEND ? new v8(sa.a.a(), kwVar) : new cf(1, u8Var, kwVar);
        } else if (i == -1) {
            if (u8Var == u8.SUSPEND) {
                return new cf(1, u8.DROP_OLDEST, kwVar);
            }
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
        } else if (i != 0) {
            return i != Integer.MAX_VALUE ? u8Var == u8.SUSPEND ? new v8(i, kwVar) : new cf(i, u8Var, kwVar) : new v8(Integer.MAX_VALUE, kwVar);
        } else {
            v8Var = u8Var == u8.SUSPEND ? new v8(0, kwVar) : new cf(1, u8Var, kwVar);
        }
        return v8Var;
    }

    public static /* synthetic */ sa b(int i, u8 u8Var, kw kwVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            u8Var = u8.SUSPEND;
        }
        if ((i2 & 4) != 0) {
            kwVar = null;
        }
        return a(i, u8Var, kwVar);
    }
}
