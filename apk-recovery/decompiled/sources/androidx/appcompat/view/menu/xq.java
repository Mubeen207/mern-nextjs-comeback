package androidx.appcompat.view.menu;

import java.util.List;
/* loaded from: classes.dex */
public final class xq extends lw0 {
    public final Object b;
    public final String c;
    public final String d;
    public final oa0 e;
    public final h51 f;
    public final ha1 g;

    /* loaded from: classes.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[h51.values().length];
            try {
                iArr[h51.STRICT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[h51.LOG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[h51.QUIET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public xq(Object obj, String str, String str2, oa0 oa0Var, h51 h51Var) {
        List g;
        c60.e(obj, "value");
        c60.e(str, "tag");
        c60.e(str2, "message");
        c60.e(oa0Var, "logger");
        c60.e(h51Var, "verificationMode");
        this.b = obj;
        this.c = str;
        this.d = str2;
        this.e = oa0Var;
        this.f = h51Var;
        ha1 ha1Var = new ha1(b(obj, str2));
        StackTraceElement[] stackTrace = ha1Var.getStackTrace();
        c60.d(stackTrace, "stackTrace");
        g = x4.g(stackTrace, 2);
        ha1Var.setStackTrace((StackTraceElement[]) g.toArray(new StackTraceElement[0]));
        this.g = ha1Var;
    }

    @Override // androidx.appcompat.view.menu.lw0
    public Object a() {
        int i = a.a[this.f.ordinal()];
        if (i != 1) {
            if (i == 2) {
                this.e.a(this.c, b(this.b, this.d));
                return null;
            } else if (i == 3) {
                return null;
            } else {
                throw new bf0();
            }
        }
        throw this.g;
    }

    @Override // androidx.appcompat.view.menu.lw0
    public lw0 c(String str, kw kwVar) {
        c60.e(str, "message");
        c60.e(kwVar, "condition");
        return this;
    }
}
