package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.Handler;
/* loaded from: classes.dex */
public abstract class bv {

    /* loaded from: classes.dex */
    public static class a {
        public final int a;
        public final b[] b;

        public a(int i, b[] bVarArr) {
            this.a = i;
            this.b = bVarArr;
        }

        public static a a(int i, b[] bVarArr) {
            return new a(i, bVarArr);
        }

        public b[] b() {
            return this.b;
        }

        public int c() {
            return this.a;
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public final Uri a;
        public final int b;
        public final int c;
        public final boolean d;
        public final int e;

        public b(Uri uri, int i, int i2, boolean z, int i3) {
            this.a = (Uri) tj0.g(uri);
            this.b = i;
            this.c = i2;
            this.d = z;
            this.e = i3;
        }

        public static b a(Uri uri, int i, int i2, boolean z, int i3) {
            return new b(uri, i, i2, z, i3);
        }

        public int b() {
            return this.e;
        }

        public int c() {
            return this.b;
        }

        public Uri d() {
            return this.a;
        }

        public int e() {
            return this.c;
        }

        public boolean f() {
            return this.d;
        }
    }

    /* loaded from: classes.dex */
    public static class c {
        public abstract void a(int i);

        public abstract void b(Typeface typeface);
    }

    public static Typeface a(Context context, CancellationSignal cancellationSignal, b[] bVarArr) {
        return v21.b(context, cancellationSignal, bVarArr, 0);
    }

    public static a b(Context context, CancellationSignal cancellationSignal, xu xuVar) {
        return wu.e(context, xuVar, cancellationSignal);
    }

    public static Typeface c(Context context, xu xuVar, int i, boolean z, int i2, Handler handler, c cVar) {
        p9 p9Var = new p9(cVar, handler);
        return z ? zu.e(context, xuVar, p9Var, i, i2) : zu.d(context, xuVar, i, null, p9Var);
    }
}
