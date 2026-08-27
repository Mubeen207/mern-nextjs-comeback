package androidx.appcompat.view.menu;

import androidx.appcompat.view.menu.i8;
import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public final class f8 {
    public final i8 a;
    public final String b;
    public final ad0 c;

    /* loaded from: classes.dex */
    public final class b implements i8.a {
        public final d a;

        /* loaded from: classes.dex */
        public class a implements e {
            public final /* synthetic */ i8.b a;

            public a(i8.b bVar) {
                this.a = bVar;
            }

            @Override // androidx.appcompat.view.menu.f8.e
            public void a(Object obj) {
                this.a.a(f8.this.c.a(obj));
            }
        }

        @Override // androidx.appcompat.view.menu.i8.a
        public void a(ByteBuffer byteBuffer, i8.b bVar) {
            try {
                this.a.a(f8.this.c.b(byteBuffer), new a(bVar));
            } catch (RuntimeException e) {
                ha0.c("BasicMessageChannel#" + f8.this.b, "Failed to handle message", e);
                bVar.a(null);
            }
        }

        public b(d dVar) {
            this.a = dVar;
        }
    }

    /* loaded from: classes.dex */
    public final class c implements i8.b {
        public final e a;

        @Override // androidx.appcompat.view.menu.i8.b
        public void a(ByteBuffer byteBuffer) {
            try {
                this.a.a(f8.this.c.b(byteBuffer));
            } catch (RuntimeException e) {
                ha0.c("BasicMessageChannel#" + f8.this.b, "Failed to handle message reply", e);
            }
        }

        public c(e eVar) {
            this.a = eVar;
        }
    }

    /* loaded from: classes.dex */
    public interface d {
        void a(Object obj, e eVar);
    }

    /* loaded from: classes.dex */
    public interface e {
        void a(Object obj);
    }

    public f8(i8 i8Var, String str, ad0 ad0Var) {
        this(i8Var, str, ad0Var, null);
    }

    public void c(Object obj) {
        d(obj, null);
    }

    public void d(Object obj, e eVar) {
        this.a.b(this.b, this.c.a(obj), eVar != null ? new c(eVar) : null);
    }

    public void e(d dVar) {
        this.a.a(this.b, dVar != null ? new b(dVar) : null);
    }

    public f8(i8 i8Var, String str, ad0 ad0Var, i8.c cVar) {
        this.a = i8Var;
        this.b = str;
        this.c = ad0Var;
    }
}
