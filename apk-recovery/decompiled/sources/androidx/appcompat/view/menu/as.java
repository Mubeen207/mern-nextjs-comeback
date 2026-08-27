package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.JsonReader;
import androidx.appcompat.view.menu.d11;
import androidx.appcompat.view.menu.hs;
import androidx.appcompat.view.menu.q50;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.concurrent.ExecutionException;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class as {
    public static final Pattern d = Pattern.compile("[0-9]+s");
    public static final Charset e = Charset.forName("UTF-8");
    public final Context a;
    public final hl0 b;
    public final cp0 c = new cp0();

    public as(Context context, hl0 hl0Var) {
        this.a = context;
        this.b = hl0Var;
    }

    public static String a(String str, String str2, String str3) {
        String str4;
        Object[] objArr = new Object[3];
        objArr[0] = str2;
        objArr[1] = str3;
        if (TextUtils.isEmpty(str)) {
            str4 = "";
        } else {
            str4 = ", " + str;
        }
        objArr[2] = str4;
        return String.format("Firebase options used while communicating with Firebase server APIs: %s, %s%s", objArr);
    }

    public static JSONObject b(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("fid", str);
            jSONObject.put("appId", str2);
            jSONObject.put("authVersion", "FIS_v2");
            jSONObject.put("sdkVersion", "a:17.2.0");
            return jSONObject;
        } catch (JSONException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public static JSONObject c() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sdkVersion", "a:17.2.0");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("installation", jSONObject);
            return jSONObject2;
        } catch (JSONException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public static byte[] h(JSONObject jSONObject) {
        return jSONObject.toString().getBytes("UTF-8");
    }

    public static boolean i(int i) {
        return i >= 200 && i < 300;
    }

    public static void j() {
    }

    public static void k(HttpURLConnection httpURLConnection, String str, String str2, String str3) {
        if (TextUtils.isEmpty(o(httpURLConnection))) {
            return;
        }
        a(str, str2, str3);
    }

    public static long m(String str) {
        pj0.b(d.matcher(str).matches(), "Invalid Expiration Timestamp.");
        if (str == null || str.length() == 0) {
            return 0L;
        }
        return Long.parseLong(str.substring(0, str.length() - 1));
    }

    public static String o(HttpURLConnection httpURLConnection) {
        InputStream errorStream = httpURLConnection.getErrorStream();
        if (errorStream == null) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, e));
        try {
            try {
                StringBuilder sb = new StringBuilder();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    sb.append(readLine);
                    sb.append('\n');
                }
                String format = String.format("Error when communicating with the Firebase Installations server API. HTTP response: [%d %s: %s]", Integer.valueOf(httpURLConnection.getResponseCode()), httpURLConnection.getResponseMessage(), sb);
                try {
                    bufferedReader.close();
                } catch (IOException unused) {
                }
                return format;
            } catch (IOException unused2) {
                return null;
            }
        } catch (IOException unused3) {
            bufferedReader.close();
            return null;
        } catch (Throwable th) {
            try {
                bufferedReader.close();
            } catch (IOException unused4) {
            }
            throw th;
        }
    }

    public static void s(URLConnection uRLConnection, byte[] bArr) {
        OutputStream outputStream = uRLConnection.getOutputStream();
        if (outputStream == null) {
            throw new IOException("Cannot send request to FIS servers. No OutputStream available.");
        }
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
        try {
            gZIPOutputStream.write(bArr);
        } finally {
            try {
                gZIPOutputStream.close();
                outputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    public q50 d(String str, String str2, String str3, String str4, String str5) {
        int responseCode;
        q50 n;
        if (this.c.b()) {
            URL g = g(String.format("projects/%s/installations", str3));
            for (int i = 0; i <= 1; i++) {
                TrafficStats.setThreadStatsTag(32769);
                HttpURLConnection l = l(g, str);
                try {
                    l.setRequestMethod("POST");
                    l.setDoOutput(true);
                    if (str5 != null) {
                        l.addRequestProperty("x-goog-fis-android-iid-migration-auth", str5);
                    }
                    q(l, str2, str4);
                    responseCode = l.getResponseCode();
                    this.c.f(responseCode);
                } catch (IOException | AssertionError unused) {
                } catch (Throwable th) {
                    l.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    throw th;
                }
                if (i(responseCode)) {
                    n = n(l);
                } else {
                    k(l, str4, str, str3);
                    if (responseCode == 429) {
                        throw new hs("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", hs.a.TOO_MANY_REQUESTS);
                    }
                    if (responseCode < 500 || responseCode >= 600) {
                        j();
                        n = q50.a().e(q50.b.BAD_CONFIG).a();
                    }
                    l.disconnect();
                    TrafficStats.clearThreadStatsTag();
                }
                l.disconnect();
                TrafficStats.clearThreadStatsTag();
                return n;
            }
            throw new hs("Firebase Installations Service is unavailable. Please try again later.", hs.a.UNAVAILABLE);
        }
        throw new hs("Firebase Installations Service is unavailable. Please try again later.", hs.a.UNAVAILABLE);
    }

    public d11 e(String str, String str2, String str3, String str4) {
        int responseCode;
        d11 p;
        if (this.c.b()) {
            URL g = g(String.format("projects/%s/installations/%s/authTokens:generate", str3, str2));
            for (int i = 0; i <= 1; i++) {
                TrafficStats.setThreadStatsTag(32771);
                HttpURLConnection l = l(g, str);
                try {
                    l.setRequestMethod("POST");
                    l.addRequestProperty("Authorization", "FIS_v2 " + str4);
                    l.setDoOutput(true);
                    r(l);
                    responseCode = l.getResponseCode();
                    this.c.f(responseCode);
                } catch (IOException | AssertionError unused) {
                } catch (Throwable th) {
                    l.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    throw th;
                }
                if (i(responseCode)) {
                    p = p(l);
                } else {
                    k(l, null, str, str3);
                    if (responseCode == 401 || responseCode == 404) {
                        p = d11.a().b(d11.b.AUTH_ERROR).a();
                    } else if (responseCode == 429) {
                        throw new hs("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", hs.a.TOO_MANY_REQUESTS);
                    } else {
                        if (responseCode < 500 || responseCode >= 600) {
                            j();
                            p = d11.a().b(d11.b.BAD_CONFIG).a();
                        }
                        l.disconnect();
                        TrafficStats.clearThreadStatsTag();
                    }
                }
                l.disconnect();
                TrafficStats.clearThreadStatsTag();
                return p;
            }
            throw new hs("Firebase Installations Service is unavailable. Please try again later.", hs.a.UNAVAILABLE);
        }
        throw new hs("Firebase Installations Service is unavailable. Please try again later.", hs.a.UNAVAILABLE);
    }

    public final String f() {
        try {
            Context context = this.a;
            byte[] a = i2.a(context, context.getPackageName());
            if (a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Could not get fingerprint hash for package: ");
                sb.append(this.a.getPackageName());
                return null;
            }
            return lz.b(a, false);
        } catch (PackageManager.NameNotFoundException unused) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("No such package: ");
            sb2.append(this.a.getPackageName());
            return null;
        }
    }

    public final URL g(String str) {
        try {
            return new URL(String.format("https://%s/%s/%s", "firebaseinstallations.googleapis.com", "v1", str));
        } catch (MalformedURLException e2) {
            throw new hs(e2.getMessage(), hs.a.UNAVAILABLE);
        }
    }

    public final HttpURLConnection l(URL url, String str) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setReadTimeout(10000);
            httpURLConnection.addRequestProperty("Content-Type", "application/json");
            httpURLConnection.addRequestProperty("Accept", "application/json");
            httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
            httpURLConnection.addRequestProperty("Cache-Control", "no-cache");
            httpURLConnection.addRequestProperty("X-Android-Package", this.a.getPackageName());
            dz dzVar = (dz) this.b.get();
            if (dzVar != null) {
                try {
                    httpURLConnection.addRequestProperty("x-firebase-client", (String) mz0.a(dzVar.a()));
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                } catch (ExecutionException unused2) {
                }
            }
            httpURLConnection.addRequestProperty("X-Android-Cert", f());
            httpURLConnection.addRequestProperty("x-goog-api-key", str);
            return httpURLConnection;
        } catch (IOException unused3) {
            throw new hs("Firebase Installations Service is unavailable. Please try again later.", hs.a.UNAVAILABLE);
        }
    }

    public final q50 n(HttpURLConnection httpURLConnection) {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, e));
        d11.a a = d11.a();
        q50.a a2 = q50.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("name")) {
                a2.f(jsonReader.nextString());
            } else if (nextName.equals("fid")) {
                a2.c(jsonReader.nextString());
            } else if (nextName.equals("refreshToken")) {
                a2.d(jsonReader.nextString());
            } else if (nextName.equals("authToken")) {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    if (nextName2.equals("token")) {
                        a.c(jsonReader.nextString());
                    } else if (nextName2.equals("expiresIn")) {
                        a.d(m(jsonReader.nextString()));
                    } else {
                        jsonReader.skipValue();
                    }
                }
                a2.b(a.a());
                jsonReader.endObject();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return a2.e(q50.b.OK).a();
    }

    public final d11 p(HttpURLConnection httpURLConnection) {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, e));
        d11.a a = d11.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("token")) {
                a.c(jsonReader.nextString());
            } else if (nextName.equals("expiresIn")) {
                a.d(m(jsonReader.nextString()));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return a.b(d11.b.OK).a();
    }

    public final void q(HttpURLConnection httpURLConnection, String str, String str2) {
        s(httpURLConnection, h(b(str, str2)));
    }

    public final void r(HttpURLConnection httpURLConnection) {
        s(httpURLConnection, h(c()));
    }
}
