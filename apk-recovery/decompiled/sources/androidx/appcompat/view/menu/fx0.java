package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;
/* loaded from: classes.dex */
public class fx0 {
    public static final Lock c = new ReentrantLock();
    public static fx0 d;
    public final Lock a = new ReentrantLock();
    public final SharedPreferences b;

    public fx0(Context context) {
        this.b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public static fx0 a(Context context) {
        pj0.i(context);
        Lock lock = c;
        lock.lock();
        try {
            if (d == null) {
                d = new fx0(context.getApplicationContext());
            }
            fx0 fx0Var = d;
            lock.unlock();
            return fx0Var;
        } catch (Throwable th) {
            c.unlock();
            throw th;
        }
    }

    public static final String d(String str, String str2) {
        StringBuilder sb = new StringBuilder(str.length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        return sb.toString();
    }

    public GoogleSignInAccount b() {
        String c2;
        String c3 = c("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(c3) || (c2 = c(d("googleSignInAccount", c3))) == null) {
            return null;
        }
        try {
            return GoogleSignInAccount.v(c2);
        } catch (JSONException unused) {
            return null;
        }
    }

    public final String c(String str) {
        this.a.lock();
        try {
            return this.b.getString(str, null);
        } finally {
            this.a.unlock();
        }
    }
}
