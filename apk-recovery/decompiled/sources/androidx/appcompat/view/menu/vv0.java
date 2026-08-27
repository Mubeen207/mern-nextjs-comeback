package androidx.appcompat.view.menu;

import android.content.pm.PackageManager;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes.dex */
public class vv0 {
    public static final AtomicBoolean b = new AtomicBoolean(false);
    public final List a = new ArrayList();

    /* loaded from: classes.dex */
    public static final class a {
        public static final vv0 a = new vv0();
    }

    public static vv0 a() {
        return a.a;
    }

    public void b() {
        if (b.getAndSet(true)) {
            return;
        }
        ov0.x();
        this.a.add(x6.w2());
        this.a.add(f7.k());
        this.a.add(hv0.h());
        this.a.add(o6.k());
        this.a.add(b7.h());
        this.a.add(w6.h());
        this.a.add(a7.e());
        this.a.add(ev0.I2());
        this.a.add(t6.w2());
        this.a.add(sv0.k());
        for (n30 n30Var : this.a) {
            n30Var.j();
        }
        for (String str : y3.a()) {
            try {
                if (!x6.w2().F1(str, -1)) {
                    x6.w2().U0(bv0.r().getPackageInfo(str, 0).applicationInfo.sourceDir, o50.a(), -1);
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
    }
}
