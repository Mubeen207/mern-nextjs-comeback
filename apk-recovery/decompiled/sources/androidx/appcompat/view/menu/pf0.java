package androidx.appcompat.view.menu;

import android.content.res.Resources;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.MissingFormatArgumentException;
import org.json.JSONArray;
import org.json.JSONException;
/* loaded from: classes.dex */
public class pf0 {
    public final Bundle a;

    public pf0(Bundle bundle) {
        if (bundle == null) {
            throw new NullPointerException("data");
        }
        this.a = new Bundle(bundle);
    }

    public static int d(String str) {
        int parseColor = Color.parseColor(str);
        if (parseColor != -16777216) {
            return parseColor;
        }
        throw new IllegalArgumentException("Transparent color is invalid");
    }

    public static boolean s(String str) {
        return str.startsWith("google.c.a.") || str.equals("from");
    }

    public static boolean t(Bundle bundle) {
        return "1".equals(bundle.getString("gcm.n.e")) || "1".equals(bundle.getString(v("gcm.n.e")));
    }

    public static boolean u(String str) {
        return str.startsWith("google.c.") || str.startsWith("gcm.n.") || str.startsWith("gcm.notification.");
    }

    public static String v(String str) {
        return !str.startsWith("gcm.n.") ? str : str.replace("gcm.n.", "gcm.notification.");
    }

    public static String z(String str) {
        return str.startsWith("gcm.n.") ? str.substring(6) : str;
    }

    public boolean a(String str) {
        String p = p(str);
        return "1".equals(p) || Boolean.parseBoolean(p);
    }

    public Integer b(String str) {
        String p = p(str);
        if (TextUtils.isEmpty(p)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(p));
        } catch (NumberFormatException unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("Couldn't parse value of ");
            sb.append(z(str));
            sb.append("(");
            sb.append(p);
            sb.append(") into an int");
            return null;
        }
    }

    public JSONArray c(String str) {
        String p = p(str);
        if (TextUtils.isEmpty(p)) {
            return null;
        }
        try {
            return new JSONArray(p);
        } catch (JSONException unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("Malformed JSON for key ");
            sb.append(z(str));
            sb.append(": ");
            sb.append(p);
            sb.append(", falling back to default");
            return null;
        }
    }

    public int[] e() {
        JSONArray c = c("gcm.n.light_settings");
        if (c == null) {
            return null;
        }
        int[] iArr = new int[3];
        try {
            if (c.length() == 3) {
                iArr[0] = d(c.optString(0));
                iArr[1] = c.optInt(1);
                iArr[2] = c.optInt(2);
                return iArr;
            }
            throw new JSONException("lightSettings don't have all three fields");
        } catch (IllegalArgumentException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("LightSettings is invalid: ");
            sb.append(c);
            sb.append(". ");
            sb.append(e.getMessage());
            sb.append(". Skipping setting LightSettings");
            return null;
        } catch (JSONException unused) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("LightSettings is invalid: ");
            sb2.append(c);
            sb2.append(". Skipping setting LightSettings");
            return null;
        }
    }

    public Uri f() {
        String p = p("gcm.n.link_android");
        if (TextUtils.isEmpty(p)) {
            p = p("gcm.n.link");
        }
        if (TextUtils.isEmpty(p)) {
            return null;
        }
        return Uri.parse(p);
    }

    public Object[] g(String str) {
        JSONArray c = c(str + "_loc_args");
        if (c == null) {
            return null;
        }
        int length = c.length();
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            strArr[i] = c.optString(i);
        }
        return strArr;
    }

    public String h(String str) {
        return p(str + "_loc_key");
    }

    public String i(Resources resources, String str, String str2) {
        String h = h(str2);
        if (TextUtils.isEmpty(h)) {
            return null;
        }
        int identifier = resources.getIdentifier(h, "string", str);
        if (identifier == 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(z(str2 + "_loc_key"));
            sb.append(" resource not found: ");
            sb.append(str2);
            sb.append(" Default value will be used.");
            return null;
        }
        Object[] g = g(str2);
        if (g == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, g);
        } catch (MissingFormatArgumentException unused) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Missing format argument for ");
            sb2.append(z(str2));
            sb2.append(": ");
            sb2.append(Arrays.toString(g));
            sb2.append(" Default value will be used.");
            return null;
        }
    }

    public Long j(String str) {
        String p = p(str);
        if (TextUtils.isEmpty(p)) {
            return null;
        }
        try {
            return Long.valueOf(Long.parseLong(p));
        } catch (NumberFormatException unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("Couldn't parse value of ");
            sb.append(z(str));
            sb.append("(");
            sb.append(p);
            sb.append(") into a long");
            return null;
        }
    }

    public String k() {
        return p("gcm.n.android_channel_id");
    }

    public Integer l() {
        Integer b = b("gcm.n.notification_count");
        if (b == null) {
            return null;
        }
        if (b.intValue() < 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("notificationCount is invalid: ");
            sb.append(b);
            sb.append(". Skipping setting notificationCount.");
            return null;
        }
        return b;
    }

    public Integer m() {
        Integer b = b("gcm.n.notification_priority");
        if (b == null) {
            return null;
        }
        if (b.intValue() < -2 || b.intValue() > 2) {
            StringBuilder sb = new StringBuilder();
            sb.append("notificationPriority is invalid ");
            sb.append(b);
            sb.append(". Skipping setting notificationPriority.");
            return null;
        }
        return b;
    }

    public String n(Resources resources, String str, String str2) {
        String p = p(str2);
        return !TextUtils.isEmpty(p) ? p : i(resources, str, str2);
    }

    public String o() {
        String p = p("gcm.n.sound2");
        return TextUtils.isEmpty(p) ? p("gcm.n.sound") : p;
    }

    public String p(String str) {
        return this.a.getString(w(str));
    }

    public long[] q() {
        JSONArray c = c("gcm.n.vibrate_timings");
        if (c == null) {
            return null;
        }
        try {
            if (c.length() > 1) {
                int length = c.length();
                long[] jArr = new long[length];
                for (int i = 0; i < length; i++) {
                    jArr[i] = c.optLong(i);
                }
                return jArr;
            }
            throw new JSONException("vibrateTimings have invalid length");
        } catch (NumberFormatException | JSONException unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("User defined vibrateTimings is invalid: ");
            sb.append(c);
            sb.append(". Skipping setting vibrateTimings.");
            return null;
        }
    }

    public Integer r() {
        Integer b = b("gcm.n.visibility");
        if (b == null) {
            return null;
        }
        if (b.intValue() < -1 || b.intValue() > 1) {
            StringBuilder sb = new StringBuilder();
            sb.append("visibility is invalid: ");
            sb.append(b);
            sb.append(". Skipping setting visibility.");
            return null;
        }
        return b;
    }

    public final String w(String str) {
        if (!this.a.containsKey(str) && str.startsWith("gcm.n.")) {
            String v = v(str);
            if (this.a.containsKey(v)) {
                return v;
            }
        }
        return str;
    }

    public Bundle x() {
        Bundle bundle = new Bundle(this.a);
        for (String str : this.a.keySet()) {
            if (!s(str)) {
                bundle.remove(str);
            }
        }
        return bundle;
    }

    public Bundle y() {
        Bundle bundle = new Bundle(this.a);
        for (String str : this.a.keySet()) {
            if (u(str)) {
                bundle.remove(str);
            }
        }
        return bundle;
    }
}
