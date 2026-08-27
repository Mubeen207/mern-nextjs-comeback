package androidx.appcompat.view.menu;

import android.adservices.measurement.DeletionRequest;
import android.adservices.measurement.MeasurementManager;
import android.adservices.measurement.WebSourceRegistrationRequest;
import android.adservices.measurement.WebTriggerRegistrationRequest;
import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;
/* loaded from: classes.dex */
public abstract class mc0 {
    public static final b a = new b(null);

    /* loaded from: classes.dex */
    public static final class a extends mc0 {
        public final MeasurementManager b;

        public a(MeasurementManager measurementManager) {
            c60.e(measurementManager, "mMeasurementManager");
            this.b = measurementManager;
        }

        @Override // androidx.appcompat.view.menu.mc0
        public Object a(hl hlVar, xg xgVar) {
            xg b;
            Object c;
            Object c2;
            b = e60.b(xgVar);
            y9 y9Var = new y9(b, 1);
            y9Var.z();
            this.b.deleteRegistrations(k(hlVar), new lc0(), bh0.a(y9Var));
            Object w = y9Var.w();
            c = f60.c();
            if (w == c) {
                gj.c(xgVar);
            }
            c2 = f60.c();
            return w == c2 ? w : u31.a;
        }

        @Override // androidx.appcompat.view.menu.mc0
        public Object b(xg xgVar) {
            xg b;
            Object c;
            b = e60.b(xgVar);
            y9 y9Var = new y9(b, 1);
            y9Var.z();
            this.b.getMeasurementApiStatus(new lc0(), bh0.a(y9Var));
            Object w = y9Var.w();
            c = f60.c();
            if (w == c) {
                gj.c(xgVar);
            }
            return w;
        }

        @Override // androidx.appcompat.view.menu.mc0
        public Object c(Uri uri, InputEvent inputEvent, xg xgVar) {
            xg b;
            Object c;
            Object c2;
            b = e60.b(xgVar);
            y9 y9Var = new y9(b, 1);
            y9Var.z();
            this.b.registerSource(uri, inputEvent, new lc0(), bh0.a(y9Var));
            Object w = y9Var.w();
            c = f60.c();
            if (w == c) {
                gj.c(xgVar);
            }
            c2 = f60.c();
            return w == c2 ? w : u31.a;
        }

        @Override // androidx.appcompat.view.menu.mc0
        public Object d(Uri uri, xg xgVar) {
            xg b;
            Object c;
            Object c2;
            b = e60.b(xgVar);
            y9 y9Var = new y9(b, 1);
            y9Var.z();
            this.b.registerTrigger(uri, new lc0(), bh0.a(y9Var));
            Object w = y9Var.w();
            c = f60.c();
            if (w == c) {
                gj.c(xgVar);
            }
            c2 = f60.c();
            return w == c2 ? w : u31.a;
        }

        @Override // androidx.appcompat.view.menu.mc0
        public Object e(w71 w71Var, xg xgVar) {
            xg b;
            Object c;
            Object c2;
            b = e60.b(xgVar);
            y9 y9Var = new y9(b, 1);
            y9Var.z();
            this.b.registerWebSource(l(w71Var), new lc0(), bh0.a(y9Var));
            Object w = y9Var.w();
            c = f60.c();
            if (w == c) {
                gj.c(xgVar);
            }
            c2 = f60.c();
            return w == c2 ? w : u31.a;
        }

        @Override // androidx.appcompat.view.menu.mc0
        public Object f(x71 x71Var, xg xgVar) {
            xg b;
            Object c;
            Object c2;
            b = e60.b(xgVar);
            y9 y9Var = new y9(b, 1);
            y9Var.z();
            this.b.registerWebTrigger(m(x71Var), new lc0(), bh0.a(y9Var));
            Object w = y9Var.w();
            c = f60.c();
            if (w == c) {
                gj.c(xgVar);
            }
            c2 = f60.c();
            return w == c2 ? w : u31.a;
        }

        public final DeletionRequest k(hl hlVar) {
            dc0.a();
            throw null;
        }

        public final WebSourceRegistrationRequest l(w71 w71Var) {
            ac0.a();
            throw null;
        }

        public final WebTriggerRegistrationRequest m(x71 x71Var) {
            cc0.a();
            throw null;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public a(android.content.Context r2) {
            /*
                r1 = this;
                java.lang.String r0 = "context"
                androidx.appcompat.view.menu.c60.e(r2, r0)
                java.lang.Class r0 = androidx.appcompat.view.menu.kc0.a()
                java.lang.Object r2 = r2.getSystemService(r0)
                java.lang.String r0 = "context.getSystemService…:class.java\n            )"
                androidx.appcompat.view.menu.c60.d(r2, r0)
                android.adservices.measurement.MeasurementManager r2 = androidx.appcompat.view.menu.bc0.a(r2)
                r1.<init>(r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.mc0.a.<init>(android.content.Context):void");
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        public b() {
        }

        public /* synthetic */ b(lj ljVar) {
            this();
        }

        public final mc0 a(Context context) {
            c60.e(context, "context");
            StringBuilder sb = new StringBuilder();
            sb.append("AdServicesInfo.version=");
            w1 w1Var = w1.a;
            sb.append(w1Var.a());
            if (w1Var.a() >= 5) {
                return new a(context);
            }
            return null;
        }
    }

    public abstract Object a(hl hlVar, xg xgVar);

    public abstract Object b(xg xgVar);

    public abstract Object c(Uri uri, InputEvent inputEvent, xg xgVar);

    public abstract Object d(Uri uri, xg xgVar);

    public abstract Object e(w71 w71Var, xg xgVar);

    public abstract Object f(x71 x71Var, xg xgVar);
}
