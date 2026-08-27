package androidx.appcompat.view.menu;

import androidx.appcompat.view.menu.i8;
import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public class nd0 {
    public final i8 a;
    public final String b;
    public final od0 c;

    /* loaded from: classes.dex */
    public final class a implements i8.a {
        public final c a;

        /* renamed from: androidx.appcompat.view.menu.nd0$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0018a implements d {
            public final /* synthetic */ i8.b a;

            public C0018a(i8.b bVar) {
                this.a = bVar;
            }

            @Override // androidx.appcompat.view.menu.nd0.d
            public void a() {
                this.a.a(null);
            }

            @Override // androidx.appcompat.view.menu.nd0.d
            public void b(String str, String str2, Object obj) {
                this.a.a(nd0.this.c.c(str, str2, obj));
            }

            @Override // androidx.appcompat.view.menu.nd0.d
            public void c(Object obj) {
                this.a.a(nd0.this.c.a(obj));
            }
        }

        public a(c cVar) {
            this.a = cVar;
        }

        @Override // androidx.appcompat.view.menu.i8.a
        public void a(ByteBuffer byteBuffer, i8.b bVar) {
            try {
                this.a.C(nd0.this.c.d(byteBuffer), new C0018a(bVar));
            } catch (RuntimeException e) {
                ha0.c("MethodChannel#" + nd0.this.b, "Failed to handle method call", e);
                bVar.a(nd0.this.c.b("error", e.getMessage(), null, ha0.d(e)));
            }
        }
    }

    /* loaded from: classes.dex */
    public final class b implements i8.b {
        public final d a;

        public b(d dVar) {
            this.a = dVar;
        }

        @Override // androidx.appcompat.view.menu.i8.b
        public void a(ByteBuffer byteBuffer) {
            try {
                if (byteBuffer == null) {
                    this.a.a();
                } else {
                    try {
                        this.a.c(nd0.this.c.e(byteBuffer));
                    } catch (qt e) {
                        this.a.b(e.m, e.getMessage(), e.n);
                    }
                }
            } catch (RuntimeException e2) {
                ha0.c("MethodChannel#" + nd0.this.b, "Failed to handle method call result", e2);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        void C(ld0 ld0Var, d dVar);
    }

    /* loaded from: classes.dex */
    public interface d {
        void a();

        void b(String str, String str2, Object obj);

        void c(Object obj);
    }

    public nd0(i8 i8Var, String str) {
        this(i8Var, str, tw0.b);
    }

    public void c(String str, Object obj) {
        d(str, obj, null);
    }

    public void d(String str, Object obj, d dVar) {
        this.a.b(this.b, this.c.f(new ld0(str, obj)), dVar == null ? null : new b(dVar));
    }

    public void e(c cVar) {
        this.a.a(this.b, cVar == null ? null : new a(cVar));
    }

    public nd0(i8 i8Var, String str, od0 od0Var) {
        this(i8Var, str, od0Var, null);
    }

    public nd0(i8 i8Var, String str, od0 od0Var, i8.c cVar) {
        this.a = i8Var;
        this.b = str;
        this.c = od0Var;
    }
}
