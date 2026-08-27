package androidx.appcompat.view.menu;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import androidx.appcompat.view.menu.ez;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutionException;
/* loaded from: classes.dex */
public class zx {
    public final tr a;
    public final fd0 b;
    public final aq0 c;
    public final hl0 d;
    public final hl0 e;
    public final gs f;

    public zx(tr trVar, fd0 fd0Var, hl0 hl0Var, hl0 hl0Var2, gs gsVar) {
        this(trVar, fd0Var, new aq0(trVar.j()), hl0Var, hl0Var2, gsVar);
    }

    public static String b(byte[] bArr) {
        return Base64.encodeToString(bArr, 11);
    }

    public static boolean g(String str) {
        return "SERVICE_NOT_AVAILABLE".equals(str) || "INTERNAL_SERVER_ERROR".equals(str) || "InternalServerError".equals(str);
    }

    public final cz0 c(cz0 cz0Var) {
        return cz0Var.f(new lc0(), new yg() { // from class: androidx.appcompat.view.menu.yx
            @Override // androidx.appcompat.view.menu.yg
            public final Object a(cz0 cz0Var2) {
                String h;
                h = zx.this.h(cz0Var2);
                return h;
            }
        });
    }

    public final String d() {
        try {
            return b(MessageDigest.getInstance("SHA-1").digest(this.a.l().getBytes()));
        } catch (NoSuchAlgorithmException unused) {
            return "[HASH-ERROR]";
        }
    }

    public cz0 e() {
        return c(j(fd0.c(this.a), "*", new Bundle()));
    }

    public final String f(Bundle bundle) {
        if (bundle != null) {
            String string = bundle.getString("registration_id");
            if (string != null) {
                return string;
            }
            String string2 = bundle.getString("unregistered");
            if (string2 != null) {
                return string2;
            }
            String string3 = bundle.getString("error");
            if ("RST".equals(string3)) {
                throw new IOException("INSTANCE_ID_RESET");
            }
            if (string3 != null) {
                throw new IOException(string3);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Unexpected response: ");
            sb.append(bundle);
            new Throwable();
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
        throw new IOException("SERVICE_NOT_AVAILABLE");
    }

    public final /* synthetic */ String h(cz0 cz0Var) {
        return f((Bundle) cz0Var.j(IOException.class));
    }

    public final void i(String str, String str2, Bundle bundle) {
        ez.a b;
        bundle.putString("scope", str2);
        bundle.putString("sender", str);
        bundle.putString("subtype", str);
        bundle.putString("gmp_app_id", this.a.m().c());
        bundle.putString("gmsv", Integer.toString(this.b.d()));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", this.b.a());
        bundle.putString("app_ver_name", this.b.b());
        bundle.putString("firebase-app-name-hash", d());
        try {
            String b2 = ((r50) mz0.a(this.f.b(false))).b();
            if (!TextUtils.isEmpty(b2)) {
                bundle.putString("Goog-Firebase-Installations-Auth", b2);
            }
        } catch (InterruptedException | ExecutionException unused) {
        }
        bundle.putString("appid", (String) mz0.a(this.f.a()));
        bundle.putString("cliv", "fcm-23.4.0");
        ez ezVar = (ez) this.e.get();
        o41 o41Var = (o41) this.d.get();
        if (ezVar == null || o41Var == null || (b = ezVar.b("fire-iid")) == ez.a.NONE) {
            return;
        }
        bundle.putString("Firebase-Client-Log-Type", Integer.toString(b.c()));
        bundle.putString("Firebase-Client", o41Var.a());
    }

    public final cz0 j(String str, String str2, Bundle bundle) {
        try {
            i(str, str2, bundle);
            return this.c.b(bundle);
        } catch (InterruptedException | ExecutionException e) {
            return mz0.d(e);
        }
    }

    public cz0 k(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str2);
        return c(j(str, "/topics/" + str2, bundle));
    }

    public cz0 l(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str2);
        bundle.putString("delete", "1");
        return c(j(str, "/topics/" + str2, bundle));
    }

    public zx(tr trVar, fd0 fd0Var, aq0 aq0Var, hl0 hl0Var, hl0 hl0Var2, gs gsVar) {
        this.a = trVar;
        this.b = fd0Var;
        this.c = aq0Var;
        this.d = hl0Var;
        this.e = hl0Var2;
        this.f = gsVar;
    }
}
