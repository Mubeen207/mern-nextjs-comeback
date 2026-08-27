package androidx.lifecycle;

import androidx.appcompat.view.menu.c60;
import androidx.appcompat.view.menu.d90;
import androidx.appcompat.view.menu.t02;
import androidx.appcompat.view.menu.uj;
import androidx.lifecycle.f;
/* loaded from: classes.dex */
public final class c implements h {
    public final uj a;
    public final h b;

    /* loaded from: classes.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[f.a.values().length];
            try {
                iArr[f.a.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[f.a.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[f.a.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[f.a.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[f.a.ON_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[f.a.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[f.a.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            a = iArr;
        }
    }

    public c(uj ujVar, h hVar) {
        c60.e(ujVar, "defaultLifecycleObserver");
        this.a = ujVar;
        this.b = hVar;
    }

    @Override // androidx.lifecycle.h
    public void c(d90 d90Var, f.a aVar) {
        c60.e(d90Var, "source");
        c60.e(aVar, "event");
        switch (a.a[aVar.ordinal()]) {
            case 1:
                this.a.f(d90Var);
                break;
            case 2:
                this.a.e(d90Var);
                break;
            case t02.c.c /* 3 */:
                this.a.g(d90Var);
                break;
            case 4:
                this.a.b(d90Var);
                break;
            case t02.c.e /* 5 */:
                this.a.a(d90Var);
                break;
            case t02.c.f /* 6 */:
                this.a.d(d90Var);
                break;
            case t02.c.g /* 7 */:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        h hVar = this.b;
        if (hVar != null) {
            hVar.c(d90Var, aVar);
        }
    }
}
