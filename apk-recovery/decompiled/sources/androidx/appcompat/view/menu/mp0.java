package androidx.appcompat.view.menu;

import androidx.appcompat.view.menu.nd0;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class mp0 {
    public final boolean a;
    public byte[] b;
    public nd0 c;
    public nd0.d d;
    public boolean e;
    public boolean f;
    public final nd0.c g;

    /* loaded from: classes.dex */
    public class a implements nd0.d {
        public final /* synthetic */ byte[] a;

        public a(byte[] bArr) {
            this.a = bArr;
        }

        @Override // androidx.appcompat.view.menu.nd0.d
        public void a() {
        }

        @Override // androidx.appcompat.view.menu.nd0.d
        public void b(String str, String str2, Object obj) {
            ha0.b("RestorationChannel", "Error " + str + " while sending restoration data to framework: " + str2);
        }

        @Override // androidx.appcompat.view.menu.nd0.d
        public void c(Object obj) {
            mp0.this.b = this.a;
        }
    }

    /* loaded from: classes.dex */
    public class b implements nd0.c {
        public b() {
        }

        @Override // androidx.appcompat.view.menu.nd0.c
        public void C(ld0 ld0Var, nd0.d dVar) {
            String str = ld0Var.a;
            Object obj = ld0Var.b;
            str.hashCode();
            if (!str.equals("get")) {
                if (!str.equals("put")) {
                    dVar.a();
                    return;
                }
                mp0.this.b = (byte[]) obj;
                dVar.c(null);
                return;
            }
            mp0.this.f = true;
            if (!mp0.this.e) {
                mp0 mp0Var = mp0.this;
                if (mp0Var.a) {
                    mp0Var.d = dVar;
                    return;
                }
            }
            mp0 mp0Var2 = mp0.this;
            dVar.c(mp0Var2.i(mp0Var2.b));
        }
    }

    public mp0(si siVar, boolean z) {
        this(new nd0(siVar, "flutter/restoration", tw0.b), z);
    }

    public void g() {
        this.b = null;
    }

    public byte[] h() {
        return this.b;
    }

    public final Map i(byte[] bArr) {
        HashMap hashMap = new HashMap();
        hashMap.put("enabled", Boolean.TRUE);
        hashMap.put("data", bArr);
        return hashMap;
    }

    public void j(byte[] bArr) {
        this.e = true;
        nd0.d dVar = this.d;
        if (dVar != null) {
            dVar.c(i(bArr));
            this.d = null;
            this.b = bArr;
        } else if (this.f) {
            this.c.d("push", i(bArr), new a(bArr));
        } else {
            this.b = bArr;
        }
    }

    public mp0(nd0 nd0Var, boolean z) {
        this.e = false;
        this.f = false;
        b bVar = new b();
        this.g = bVar;
        this.c = nd0Var;
        this.a = z;
        nd0Var.e(bVar);
    }
}
