package androidx.appcompat.view.menu;

import android.accounts.Account;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Base64;
import java.security.SecureRandom;
import java.util.Arrays;
import org.json.JSONObject;
/* loaded from: classes.dex */
public abstract class hy {
    public static volatile String a;
    public static volatile String b;
    public static volatile BroadcastReceiver c;

    /* loaded from: classes.dex */
    public class a extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            int intExtra = intent.getIntExtra("_userId", 0);
            if ("com.snake.INTERNAL_OAUTH_RESULT".equals(action)) {
                try {
                    hy.e(intent.getStringExtra("url"), intExtra);
                } catch (Throwable unused) {
                }
            } else if ("com.snake.INTERNAL_OAUTH_CANCELLED".equals(action)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Google login cancelled for userId=");
                sb.append(intExtra);
            }
        }
    }

    public static void b(String str, String str2) {
        a = str;
        b = str2;
    }

    public static JSONObject c(String str) {
        String[] split = str.split("\\.");
        if (split.length >= 2) {
            return new JSONObject(new String(Base64.decode(split[1], 11), "UTF-8"));
        }
        throw new IllegalArgumentException("malformed JWT");
    }

    public static synchronized void d(Context context) {
        synchronized (hy.class) {
            try {
                if (c != null) {
                    return;
                }
                c = new a();
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("com.snake.INTERNAL_OAUTH_RESULT");
                intentFilter.addAction("com.snake.INTERNAL_OAUTH_CANCELLED");
                if (Build.VERSION.SDK_INT >= 33) {
                    context.registerReceiver(c, intentFilter, 4);
                } else {
                    context.registerReceiver(c, intentFilter);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void e(String str, int i) {
        String[] split;
        if (str == null) {
            throw new IllegalArgumentException("null redirect url");
        }
        int indexOf = str.indexOf(35);
        String substring = indexOf >= 0 ? str.substring(indexOf + 1) : Uri.parse(str).getQuery();
        if (substring == null) {
            throw new IllegalStateException("no params in redirect: " + str);
        }
        String str2 = null;
        String str3 = null;
        for (String str4 : substring.split("&")) {
            int indexOf2 = str4.indexOf(61);
            if (indexOf2 >= 0) {
                String decode = Uri.decode(str4.substring(0, indexOf2));
                String decode2 = Uri.decode(str4.substring(indexOf2 + 1));
                if ("id_token".equals(decode)) {
                    str2 = decode2;
                } else if ("access_token".equals(decode)) {
                    str3 = decode2;
                }
            }
        }
        if (str2 == null) {
            throw new IllegalStateException("no id_token in redirect");
        }
        JSONObject c2 = c(str2);
        String optString = c2.optString("email", null);
        String optString2 = c2.optString("sub", null);
        if (optString == null || optString.isEmpty()) {
            throw new IllegalStateException("id_token missing email claim");
        }
        Account account = new Account(optString, "com.google");
        Bundle bundle = new Bundle();
        if (optString2 != null) {
            bundle.putString("sub", optString2);
        }
        dv0 p = dv0.p();
        boolean j = p.j(account, "", bundle, i);
        p.L(account, "id_token", str2, i);
        if (str3 != null) {
            p.L(account, "oauth2:https://www.googleapis.com/auth/userinfo.email", str3, i);
        }
        if (optString2 != null) {
            p.O(account, "sub", optString2, i);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Google account added: ");
        sb.append(optString);
        sb.append(" userId=");
        sb.append(i);
        sb.append(" added=");
        sb.append(j);
        Account[] u = p.u("com.google", i);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("post-add query userId=");
        sb2.append(i);
        sb2.append(" → ");
        sb2.append(u == null ? "null" : Arrays.toString(u));
    }

    public static String f() {
        byte[] bArr = new byte[16];
        new SecureRandom().nextBytes(bArr);
        return Base64.encodeToString(bArr, 11);
    }

    public static void g(int i) {
        if (a == null || b == null) {
            throw new IllegalStateException("GoogleLoginHelper not configured. Call SnakeEngine.configureGoogleLogin(clientId, redirectUri) first.");
        }
        StringBuilder sb = new StringBuilder();
        sb.append("startLogin userId=");
        sb.append(i);
        sb.append(" clientId=");
        sb.append(a);
        sb.append(" redirect=");
        sb.append(b);
        Context m = bv0.m();
        d(m);
        String f = f();
        String uri = Uri.parse("https://accounts.google.com/o/oauth2/v2/auth").buildUpon().appendQueryParameter("response_type", "id_token token").appendQueryParameter("client_id", a).appendQueryParameter("redirect_uri", b).appendQueryParameter("scope", "openid email profile").appendQueryParameter("nonce", f).appendQueryParameter("state", f()).appendQueryParameter("prompt", "select_account").build().toString();
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(bv0.o(), "com.snake.helper.InternalWebBrowser"));
        intent.putExtra("url", uri);
        intent.putExtra("_userId", i);
        intent.putExtra("_oauth_redirect_prefix", b);
        intent.addFlags(268435456);
        m.startActivity(intent);
    }
}
