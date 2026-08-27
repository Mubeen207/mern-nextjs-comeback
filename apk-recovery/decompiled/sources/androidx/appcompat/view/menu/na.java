package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import androidx.appcompat.view.menu.ia0;
import androidx.appcompat.view.menu.ka0;
import androidx.appcompat.view.menu.na;
import androidx.appcompat.view.menu.yb;
import androidx.appcompat.view.menu.ye0;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
/* loaded from: classes.dex */
public final class na implements f21 {
    public final xi a;
    public final ConnectivityManager b;
    public final Context c;
    public final URL d;
    public final ec e;
    public final ec f;
    public final int g;

    /* loaded from: classes.dex */
    public static final class a {
        public final URL a;
        public final g8 b;
        public final String c;

        public a(URL url, g8 g8Var, String str) {
            this.a = url;
            this.b = g8Var;
            this.c = str;
        }

        public a a(URL url) {
            return new a(url, this.b, this.c);
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        public final int a;
        public final URL b;
        public final long c;

        public b(int i, URL url, long j) {
            this.a = i;
            this.b = url;
            this.c = j;
        }
    }

    public na(Context context, ec ecVar, ec ecVar2, int i) {
        this.a = g8.b();
        this.c = context;
        this.b = (ConnectivityManager) context.getSystemService("connectivity");
        this.d = n(h9.c);
        this.e = ecVar2;
        this.f = ecVar;
        this.g = i;
    }

    public static int f(NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return ye0.b.UNKNOWN_MOBILE_SUBTYPE.e();
        }
        int subtype = networkInfo.getSubtype();
        if (subtype == -1) {
            return ye0.b.COMBINED.e();
        }
        if (ye0.b.c(subtype) != null) {
            return subtype;
        }
        return 0;
    }

    public static int g(NetworkInfo networkInfo) {
        return networkInfo == null ? ye0.c.NONE.e() : networkInfo.getType();
    }

    public static int h(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            pa0.c("CctTransportBackend", "Unable to find version code for package", e);
            return -1;
        }
    }

    public static TelephonyManager j(Context context) {
        return (TelephonyManager) context.getSystemService("phone");
    }

    public static long k() {
        Calendar.getInstance();
        return TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000;
    }

    public static /* synthetic */ a l(a aVar, b bVar) {
        URL url = bVar.b;
        if (url != null) {
            pa0.a("CctTransportBackend", "Following redirect to: %s", url);
            return aVar.a(bVar.b);
        }
        return null;
    }

    public static InputStream m(InputStream inputStream, String str) {
        return "gzip".equals(str) ? new GZIPInputStream(inputStream) : inputStream;
    }

    public static URL n(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException("Invalid url: " + str, e);
        }
    }

    @Override // androidx.appcompat.view.menu.f21
    public ap a(ap apVar) {
        NetworkInfo activeNetworkInfo = this.b.getActiveNetworkInfo();
        return apVar.l().a("sdk-version", Build.VERSION.SDK_INT).c("model", Build.MODEL).c("hardware", Build.HARDWARE).c("device", Build.DEVICE).c("product", Build.PRODUCT).c("os-uild", Build.ID).c("manufacturer", Build.MANUFACTURER).c("fingerprint", Build.FINGERPRINT).b("tz-offset", k()).a("net-type", g(activeNetworkInfo)).a("mobile-subtype", f(activeNetworkInfo)).c("country", Locale.getDefault().getCountry()).c("locale", Locale.getDefault().getLanguage()).c("mcc_mnc", j(this.c).getSimOperator()).c("application_build", Integer.toString(h(this.c))).d();
    }

    @Override // androidx.appcompat.view.menu.f21
    public t7 b(s7 s7Var) {
        g8 i = i(s7Var);
        URL url = this.d;
        if (s7Var.c() != null) {
            try {
                h9 e = h9.e(s7Var.c());
                r3 = e.f() != null ? e.f() : null;
                if (e.g() != null) {
                    url = n(e.g());
                }
            } catch (IllegalArgumentException unused) {
                return t7.a();
            }
        }
        try {
            b bVar = (b) sp0.a(5, new a(url, i, r3), new hx() { // from class: androidx.appcompat.view.menu.la
                @Override // androidx.appcompat.view.menu.hx
                public final Object apply(Object obj) {
                    na.b e2;
                    e2 = na.this.e((na.a) obj);
                    return e2;
                }
            }, new tp0() { // from class: androidx.appcompat.view.menu.ma
                @Override // androidx.appcompat.view.menu.tp0
                public final Object a(Object obj, Object obj2) {
                    na.a l;
                    l = na.l((na.a) obj, (na.b) obj2);
                    return l;
                }
            });
            int i2 = bVar.a;
            if (i2 == 200) {
                return t7.e(bVar.c);
            }
            if (i2 < 500 && i2 != 404) {
                return i2 == 400 ? t7.d() : t7.a();
            }
            return t7.f();
        } catch (IOException e2) {
            pa0.c("CctTransportBackend", "Could not make request to the backend", e2);
            return t7.f();
        }
    }

    public final b e(a aVar) {
        pa0.e("CctTransportBackend", "Making request to: %s", aVar.a);
        HttpURLConnection httpURLConnection = (HttpURLConnection) aVar.a.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(this.g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", String.format("datatransport/%s android/", "3.1.8"));
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = aVar.c;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                this.a.a(aVar.b, new BufferedWriter(new OutputStreamWriter(gZIPOutputStream)));
                gZIPOutputStream.close();
                if (outputStream != null) {
                    outputStream.close();
                }
                int responseCode = httpURLConnection.getResponseCode();
                pa0.e("CctTransportBackend", "Status Code: %d", Integer.valueOf(responseCode));
                pa0.a("CctTransportBackend", "Content-Type: %s", httpURLConnection.getHeaderField("Content-Type"));
                pa0.a("CctTransportBackend", "Content-Encoding: %s", httpURLConnection.getHeaderField("Content-Encoding"));
                if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                    return new b(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                }
                if (responseCode != 200) {
                    return new b(responseCode, null, 0L);
                }
                InputStream inputStream = httpURLConnection.getInputStream();
                try {
                    InputStream m = m(inputStream, httpURLConnection.getHeaderField("Content-Encoding"));
                    b bVar = new b(responseCode, null, la0.b(new BufferedReader(new InputStreamReader(m))).c());
                    if (m != null) {
                        m.close();
                    }
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    return bVar;
                } catch (Throwable th) {
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                }
                throw th3;
            }
        } catch (no e) {
            e = e;
            pa0.c("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new b(400, null, 0L);
        } catch (ConnectException e2) {
            e = e2;
            pa0.c("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new b(500, null, 0L);
        } catch (UnknownHostException e3) {
            e = e3;
            pa0.c("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new b(500, null, 0L);
        } catch (IOException e4) {
            e = e4;
            pa0.c("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new b(400, null, 0L);
        }
    }

    public final g8 i(s7 s7Var) {
        ia0.a j;
        HashMap hashMap = new HashMap();
        for (ap apVar : s7Var.b()) {
            String j2 = apVar.j();
            if (hashMap.containsKey(j2)) {
                ((List) hashMap.get(j2)).add(apVar);
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(apVar);
                hashMap.put(j2, arrayList);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : hashMap.entrySet()) {
            ap apVar2 = (ap) ((List) entry.getValue()).get(0);
            ka0.a b2 = ka0.a().f(wl0.DEFAULT).g(this.f.a()).h(this.e.a()).b(yb.a().c(yb.b.ANDROID_FIREBASE).b(c2.a().m(Integer.valueOf(apVar2.g("sdk-version"))).j(apVar2.b("model")).f(apVar2.b("hardware")).d(apVar2.b("device")).l(apVar2.b("product")).k(apVar2.b("os-uild")).h(apVar2.b("manufacturer")).e(apVar2.b("fingerprint")).c(apVar2.b("country")).g(apVar2.b("locale")).i(apVar2.b("mcc_mnc")).b(apVar2.b("application_build")).a()).a());
            try {
                b2.i(Integer.parseInt((String) entry.getKey()));
            } catch (NumberFormatException unused) {
                b2.j((String) entry.getKey());
            }
            ArrayList arrayList3 = new ArrayList();
            for (ap apVar3 : (List) entry.getValue()) {
                jo e = apVar3.e();
                lo b3 = e.b();
                if (b3.equals(lo.b("proto"))) {
                    j = ia0.j(e.a());
                } else if (b3.equals(lo.b("json"))) {
                    j = ia0.i(new String(e.a(), Charset.forName("UTF-8")));
                } else {
                    pa0.f("CctTransportBackend", "Received event of unsupported encoding %s. Skipping...", b3);
                }
                j.c(apVar3.f()).d(apVar3.k()).h(apVar3.h("tz-offset")).e(ye0.a().c(ye0.c.c(apVar3.g("net-type"))).b(ye0.b.c(apVar3.g("mobile-subtype"))).a());
                if (apVar3.d() != null) {
                    j.b(apVar3.d());
                }
                arrayList3.add(j.a());
            }
            b2.c(arrayList3);
            arrayList2.add(b2.a());
        }
        return g8.a(arrayList2);
    }

    public na(Context context, ec ecVar, ec ecVar2) {
        this(context, ecVar, ecVar2, 130000);
    }
}
