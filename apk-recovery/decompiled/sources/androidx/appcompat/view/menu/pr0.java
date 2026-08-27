package androidx.appcompat.view.menu;

import android.os.Bundle;
import androidx.appcompat.view.menu.sr0;
import java.util.Iterator;
import java.util.Map;
/* loaded from: classes.dex */
public final class pr0 implements sr0.c {
    public final sr0 a;
    public boolean b;
    public Bundle c;
    public final l80 d;

    /* loaded from: classes.dex */
    public static final class a extends j80 implements iw {
        public final /* synthetic */ e61 n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e61 e61Var) {
            super(0);
            this.n = e61Var;
        }

        @Override // androidx.appcompat.view.menu.iw
        /* renamed from: a */
        public final qr0 d() {
            return androidx.lifecycle.p.b(this.n);
        }
    }

    public pr0(sr0 sr0Var, e61 e61Var) {
        l80 a2;
        c60.e(sr0Var, "savedStateRegistry");
        c60.e(e61Var, "viewModelStoreOwner");
        this.a = sr0Var;
        a2 = p80.a(new a(e61Var));
        this.d = a2;
    }

    @Override // androidx.appcompat.view.menu.sr0.c
    public Bundle a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        Iterator it = b().d().entrySet().iterator();
        if (!it.hasNext()) {
            this.b = false;
            return bundle;
        }
        Map.Entry entry = (Map.Entry) it.next();
        String str = (String) entry.getKey();
        my0.a(entry.getValue());
        throw null;
    }

    public final qr0 b() {
        return (qr0) this.d.getValue();
    }

    public final void c() {
        if (this.b) {
            return;
        }
        Bundle b = this.a.b("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        if (b != null) {
            bundle.putAll(b);
        }
        this.c = bundle;
        this.b = true;
        b();
    }
}
