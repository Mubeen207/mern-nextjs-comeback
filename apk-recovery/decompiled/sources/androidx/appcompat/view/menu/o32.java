package androidx.appcompat.view.menu;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public final class o32 implements Runnable {
    public final URL m;
    public final byte[] n;
    public final i32 o;
    public final String p;
    public final Map q;
    public final /* synthetic */ k32 r;

    public o32(k32 k32Var, String str, URL url, byte[] bArr, Map map, i32 i32Var) {
        this.r = k32Var;
        pj0.e(str);
        pj0.i(url);
        pj0.i(i32Var);
        this.m = url;
        this.n = null;
        this.o = i32Var;
        this.p = str;
        this.q = null;
    }

    public final /* synthetic */ void a(int i, Exception exc, byte[] bArr, Map map) {
        this.o.a(this.p, i, exc, bArr, map);
    }

    public final void b(final int i, final Exception exc, final byte[] bArr, final Map map) {
        this.r.h().D(new Runnable() { // from class: androidx.appcompat.view.menu.m32
            @Override // java.lang.Runnable
            public final void run() {
                o32.this.a(i, exc, bArr, map);
            }
        });
    }

    @Override // java.lang.Runnable
    public final void run() {
        HttpURLConnection httpURLConnection;
        Map<String, List<String>> map;
        byte[] v;
        this.r.k();
        int i = 0;
        try {
            URLConnection b = bl1.a().b(this.m, "client-measurement");
            if (!(b instanceof HttpURLConnection)) {
                throw new IOException("Failed to obtain HTTP connection");
            }
            httpURLConnection = (HttpURLConnection) b;
            httpURLConnection.setDefaultUseCaches(false);
            httpURLConnection.setConnectTimeout(60000);
            httpURLConnection.setReadTimeout(61000);
            httpURLConnection.setInstanceFollowRedirects(false);
            httpURLConnection.setDoInput(true);
            try {
                i = httpURLConnection.getResponseCode();
                map = httpURLConnection.getHeaderFields();
                try {
                    k32 k32Var = this.r;
                    v = k32.v(httpURLConnection);
                    httpURLConnection.disconnect();
                    b(i, null, v, map);
                } catch (IOException e) {
                    e = e;
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    b(i, e, null, map);
                } catch (Throwable th) {
                    th = th;
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    b(i, null, null, map);
                    throw th;
                }
            } catch (IOException e2) {
                e = e2;
                map = null;
            } catch (Throwable th2) {
                th = th2;
                map = null;
            }
        } catch (IOException e3) {
            e = e3;
            httpURLConnection = null;
            map = null;
        } catch (Throwable th3) {
            th = th3;
            httpURLConnection = null;
            map = null;
        }
    }
}
