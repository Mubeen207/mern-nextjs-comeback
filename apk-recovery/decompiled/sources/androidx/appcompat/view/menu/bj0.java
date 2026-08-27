package androidx.appcompat.view.menu;

import androidx.appcompat.view.menu.bj0;
import androidx.appcompat.view.menu.nd0;
import androidx.appcompat.view.menu.t02;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public class bj0 {
    public final nd0 a;
    public g b;
    public final nd0.c c;

    /* loaded from: classes.dex */
    public class a implements nd0.c {
        public a() {
        }

        public static /* synthetic */ void e(nd0.d dVar, c cVar) {
            if (cVar == null) {
                dVar.b("error", "Failed to resize the platform view", null);
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("width", Double.valueOf(cVar.a));
            hashMap.put("height", Double.valueOf(cVar.b));
            dVar.c(hashMap);
        }

        @Override // androidx.appcompat.view.menu.nd0.c
        public void C(ld0 ld0Var, nd0.d dVar) {
            if (bj0.this.b == null) {
                return;
            }
            ha0.f("PlatformViewsChannel", "Received '" + ld0Var.a + "' message.");
            String str = ld0Var.a;
            str.hashCode();
            char c = 65535;
            switch (str.hashCode()) {
                case -1352294148:
                    if (str.equals("create")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1019779949:
                    if (str.equals("offset")) {
                        c = 1;
                        break;
                    }
                    break;
                case -934437708:
                    if (str.equals("resize")) {
                        c = 2;
                        break;
                    }
                    break;
                case -756050293:
                    if (str.equals("clearFocus")) {
                        c = 3;
                        break;
                    }
                    break;
                case -308988850:
                    if (str.equals("synchronizeToNativeViewHierarchy")) {
                        c = 4;
                        break;
                    }
                    break;
                case 110550847:
                    if (str.equals("touch")) {
                        c = 5;
                        break;
                    }
                    break;
                case 576796989:
                    if (str.equals("setDirection")) {
                        c = 6;
                        break;
                    }
                    break;
                case 1671767583:
                    if (str.equals("dispose")) {
                        c = 7;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    c(ld0Var, dVar);
                    return;
                case 1:
                    f(ld0Var, dVar);
                    return;
                case 2:
                    g(ld0Var, dVar);
                    return;
                case t02.c.c /* 3 */:
                    b(ld0Var, dVar);
                    return;
                case 4:
                    i(ld0Var, dVar);
                    return;
                case t02.c.e /* 5 */:
                    j(ld0Var, dVar);
                    return;
                case t02.c.f /* 6 */:
                    h(ld0Var, dVar);
                    return;
                case t02.c.g /* 7 */:
                    d(ld0Var, dVar);
                    return;
                default:
                    dVar.a();
                    return;
            }
        }

        public final void b(ld0 ld0Var, nd0.d dVar) {
            try {
                bj0.this.b.h(((Integer) ld0Var.b()).intValue());
                dVar.c(null);
            } catch (IllegalStateException e) {
                dVar.b("error", bj0.c(e), null);
            }
        }

        public final void c(ld0 ld0Var, nd0.d dVar) {
            Map map = (Map) ld0Var.b();
            boolean z = false;
            boolean z2 = map.containsKey("hybrid") && ((Boolean) map.get("hybrid")).booleanValue();
            ByteBuffer wrap = map.containsKey("params") ? ByteBuffer.wrap((byte[]) map.get("params")) : null;
            try {
                if (z2) {
                    bj0.this.b.f(new d(((Integer) map.get("id")).intValue(), (String) map.get("viewType"), 0.0d, 0.0d, 0.0d, 0.0d, ((Integer) map.get("direction")).intValue(), d.a.HYBRID_ONLY, wrap));
                    dVar.c(null);
                    return;
                }
                if (map.containsKey("hybridFallback") && ((Boolean) map.get("hybridFallback")).booleanValue()) {
                    z = true;
                }
                long g = bj0.this.b.g(new d(((Integer) map.get("id")).intValue(), (String) map.get("viewType"), map.containsKey("top") ? ((Double) map.get("top")).doubleValue() : 0.0d, map.containsKey("left") ? ((Double) map.get("left")).doubleValue() : 0.0d, ((Double) map.get("width")).doubleValue(), ((Double) map.get("height")).doubleValue(), ((Integer) map.get("direction")).intValue(), z ? d.a.TEXTURE_WITH_HYBRID_FALLBACK : d.a.TEXTURE_WITH_VIRTUAL_FALLBACK, wrap));
                if (g != -2) {
                    dVar.c(Long.valueOf(g));
                } else if (!z) {
                    throw new AssertionError("Platform view attempted to fall back to hybrid mode when not requested.");
                } else {
                    dVar.c(null);
                }
            } catch (IllegalStateException e) {
                dVar.b("error", bj0.c(e), null);
            }
        }

        public final void d(ld0 ld0Var, nd0.d dVar) {
            try {
                bj0.this.b.i(((Integer) ((Map) ld0Var.b()).get("id")).intValue());
                dVar.c(null);
            } catch (IllegalStateException e) {
                dVar.b("error", bj0.c(e), null);
            }
        }

        public final void f(ld0 ld0Var, nd0.d dVar) {
            Map map = (Map) ld0Var.b();
            try {
                bj0.this.b.c(((Integer) map.get("id")).intValue(), ((Double) map.get("top")).doubleValue(), ((Double) map.get("left")).doubleValue());
                dVar.c(null);
            } catch (IllegalStateException e) {
                dVar.b("error", bj0.c(e), null);
            }
        }

        public final void g(ld0 ld0Var, final nd0.d dVar) {
            Map map = (Map) ld0Var.b();
            try {
                bj0.this.b.a(new e(((Integer) map.get("id")).intValue(), ((Double) map.get("width")).doubleValue(), ((Double) map.get("height")).doubleValue()), new b() { // from class: androidx.appcompat.view.menu.aj0
                    @Override // androidx.appcompat.view.menu.bj0.b
                    public final void a(bj0.c cVar) {
                        bj0.a.e(nd0.d.this, cVar);
                    }
                });
            } catch (IllegalStateException e) {
                dVar.b("error", bj0.c(e), null);
            }
        }

        public final void h(ld0 ld0Var, nd0.d dVar) {
            Map map = (Map) ld0Var.b();
            try {
                bj0.this.b.d(((Integer) map.get("id")).intValue(), ((Integer) map.get("direction")).intValue());
                dVar.c(null);
            } catch (IllegalStateException e) {
                dVar.b("error", bj0.c(e), null);
            }
        }

        public final void i(ld0 ld0Var, nd0.d dVar) {
            try {
                bj0.this.b.b(((Boolean) ld0Var.b()).booleanValue());
                dVar.c(null);
            } catch (IllegalStateException e) {
                dVar.b("error", bj0.c(e), null);
            }
        }

        public final void j(ld0 ld0Var, nd0.d dVar) {
            nd0.d dVar2;
            List list = (List) ld0Var.b();
            try {
                bj0.this.b.e(new f(((Integer) list.get(0)).intValue(), (Number) list.get(1), (Number) list.get(2), ((Integer) list.get(3)).intValue(), ((Integer) list.get(4)).intValue(), list.get(5), list.get(6), ((Integer) list.get(7)).intValue(), ((Integer) list.get(8)).intValue(), (float) ((Double) list.get(9)).doubleValue(), (float) ((Double) list.get(10)).doubleValue(), ((Integer) list.get(11)).intValue(), ((Integer) list.get(12)).intValue(), ((Integer) list.get(13)).intValue(), ((Integer) list.get(14)).intValue(), ((Number) list.get(15)).longValue()));
                dVar2 = dVar;
            } catch (IllegalStateException e) {
                e = e;
                dVar2 = dVar;
            }
            try {
                dVar2.c(null);
            } catch (IllegalStateException e2) {
                e = e2;
                dVar2.b("error", bj0.c(e), null);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(c cVar);
    }

    /* loaded from: classes.dex */
    public static class c {
        public final int a;
        public final int b;

        public c(int i, int i2) {
            this.a = i;
            this.b = i2;
        }
    }

    /* loaded from: classes.dex */
    public static class d {
        public final int a;
        public final String b;
        public final double c;
        public final double d;
        public final double e;
        public final double f;
        public final int g;
        public final a h;
        public final ByteBuffer i;

        /* loaded from: classes.dex */
        public enum a {
            TEXTURE_WITH_VIRTUAL_FALLBACK,
            TEXTURE_WITH_HYBRID_FALLBACK,
            HYBRID_ONLY
        }

        public d(int i, String str, double d, double d2, double d3, double d4, int i2, a aVar, ByteBuffer byteBuffer) {
            this.a = i;
            this.b = str;
            this.e = d;
            this.f = d2;
            this.c = d3;
            this.d = d4;
            this.g = i2;
            this.h = aVar;
            this.i = byteBuffer;
        }
    }

    /* loaded from: classes.dex */
    public static class e {
        public final int a;
        public final double b;
        public final double c;

        public e(int i, double d, double d2) {
            this.a = i;
            this.b = d;
            this.c = d2;
        }
    }

    /* loaded from: classes.dex */
    public static class f {
        public final int a;
        public final Number b;
        public final Number c;
        public final int d;
        public final int e;
        public final Object f;
        public final Object g;
        public final int h;
        public final int i;
        public final float j;
        public final float k;
        public final int l;
        public final int m;
        public final int n;
        public final int o;
        public final long p;

        public f(int i, Number number, Number number2, int i2, int i3, Object obj, Object obj2, int i4, int i5, float f, float f2, int i6, int i7, int i8, int i9, long j) {
            this.a = i;
            this.b = number;
            this.c = number2;
            this.d = i2;
            this.e = i3;
            this.f = obj;
            this.g = obj2;
            this.h = i4;
            this.i = i5;
            this.j = f;
            this.k = f2;
            this.l = i6;
            this.m = i7;
            this.n = i8;
            this.o = i9;
            this.p = j;
        }
    }

    /* loaded from: classes.dex */
    public interface g {
        void a(e eVar, b bVar);

        void b(boolean z);

        void c(int i, double d, double d2);

        void d(int i, int i2);

        void e(f fVar);

        void f(d dVar);

        long g(d dVar);

        void h(int i);

        void i(int i);
    }

    public bj0(si siVar) {
        a aVar = new a();
        this.c = aVar;
        nd0 nd0Var = new nd0(siVar, "flutter/platform_views", tw0.b);
        this.a = nd0Var;
        nd0Var.e(aVar);
    }

    public static String c(Exception exc) {
        return ha0.d(exc);
    }

    public void d(g gVar) {
        this.b = gVar;
    }
}
