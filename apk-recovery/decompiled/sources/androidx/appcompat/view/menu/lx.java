package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public interface lx extends xs {

    /* loaded from: classes.dex */
    public static final class a {
        public static /* synthetic */ xs a(lx lxVar, kh khVar, int i, u8 u8Var, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 1) != 0) {
                    khVar = bo.m;
                }
                if ((i2 & 2) != 0) {
                    i = -3;
                }
                if ((i2 & 4) != 0) {
                    u8Var = u8.SUSPEND;
                }
                return lxVar.c(khVar, i, u8Var);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fuse");
        }
    }

    xs c(kh khVar, int i, u8 u8Var);
}
