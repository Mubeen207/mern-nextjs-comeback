package androidx.appcompat.view.menu;

import android.content.pm.PackageParser;
import android.os.Bundle;
/* loaded from: classes.dex */
public final class ov1 {
    public final fx1 a;

    public ov1(r82 r82Var) {
        this.a = r82Var.i0();
    }

    public final Bundle a(String str, ck1 ck1Var) {
        this.a.h().n();
        if (ck1Var == null) {
            this.a.l().L().a("Attempting to use Install Referrer Service while it is not initialized");
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putString("package_name", str);
        try {
            Bundle f = ck1Var.f(bundle);
            if (f == null) {
                this.a.l().G().a("Install Referrer Service returned a null response");
                return null;
            }
            return f;
        } catch (Exception e) {
            this.a.l().G().b("Exception occurred while retrieving the Install Referrer", e.getMessage());
            return null;
        }
    }

    public final boolean b() {
        try {
            dh0 a = va1.a(this.a.a());
            if (a != null) {
                return a.e("com.android.vending", PackageParser.PARSE_IS_PRIVILEGED).versionCode >= 80837300;
            }
            this.a.l().K().a("Failed to get PackageManager for Install Referrer Play Store compatibility check");
            return false;
        } catch (Exception e) {
            this.a.l().K().b("Failed to retrieve Play Store version for Install Referrer", e);
            return false;
        }
    }
}
