package androidx.appcompat.view.menu;

import java.util.Locale;
/* loaded from: classes.dex */
public class a90 {
    public b a;
    public b b;
    public boolean c;
    public final f8 d;

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[b.values().length];
            a = iArr;
            try {
                iArr[b.RESUMED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[b.INACTIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[b.HIDDEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[b.PAUSED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[b.DETACHED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* loaded from: classes.dex */
    public enum b {
        DETACHED,
        RESUMED,
        INACTIVE,
        HIDDEN,
        PAUSED
    }

    public a90(si siVar) {
        this(new f8(siVar, "flutter/lifecycle", lx0.b));
    }

    public void a() {
        g(this.a, true);
    }

    public void b() {
        g(b.DETACHED, this.c);
    }

    public void c() {
        g(b.INACTIVE, this.c);
    }

    public void d() {
        g(b.PAUSED, this.c);
    }

    public void e() {
        g(b.RESUMED, this.c);
    }

    public void f() {
        g(this.a, false);
    }

    public final void g(b bVar, boolean z) {
        b bVar2 = this.a;
        if (bVar2 == bVar && z == this.c) {
            return;
        }
        if (bVar == null && bVar2 == null) {
            this.c = z;
            return;
        }
        int i = a.a[bVar.ordinal()];
        b bVar3 = i != 1 ? (i == 2 || i == 3 || i == 4 || i == 5) ? bVar : null : z ? b.RESUMED : b.INACTIVE;
        this.a = bVar;
        this.c = z;
        if (bVar3 == this.b) {
            return;
        }
        String str = "AppLifecycleState." + bVar3.name().toLowerCase(Locale.ROOT);
        ha0.f("LifecycleChannel", "Sending " + str + " message.");
        this.d.c(str);
        this.b = bVar3;
    }

    public a90(f8 f8Var) {
        this.a = null;
        this.b = null;
        this.c = true;
        this.d = f8Var;
    }
}
