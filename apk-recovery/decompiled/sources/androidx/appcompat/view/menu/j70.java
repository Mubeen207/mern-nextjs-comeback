package androidx.appcompat.view.menu;

import java.io.Writer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
/* loaded from: classes.dex */
public final class j70 implements ko {
    public static final wf0 e = new wf0() { // from class: androidx.appcompat.view.menu.g70
        @Override // androidx.appcompat.view.menu.wf0
        public final void a(Object obj, Object obj2) {
            j70.l(obj, (xf0) obj2);
        }
    };
    public static final z41 f = new z41() { // from class: androidx.appcompat.view.menu.h70
        @Override // androidx.appcompat.view.menu.z41
        public final void a(Object obj, Object obj2) {
            ((a51) obj2).c((String) obj);
        }
    };
    public static final z41 g = new z41() { // from class: androidx.appcompat.view.menu.i70
        @Override // androidx.appcompat.view.menu.z41
        public final void a(Object obj, Object obj2) {
            j70.n((Boolean) obj, (a51) obj2);
        }
    };
    public static final b h = new b(null);
    public final Map a = new HashMap();
    public final Map b = new HashMap();
    public wf0 c = e;
    public boolean d = false;

    /* loaded from: classes.dex */
    public class a implements xi {
        public a() {
        }

        @Override // androidx.appcompat.view.menu.xi
        public void a(Object obj, Writer writer) {
            k70 k70Var = new k70(writer, j70.this.a, j70.this.b, j70.this.c, j70.this.d);
            k70Var.h(obj, false);
            k70Var.p();
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements z41 {
        public static final DateFormat a;

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            a = simpleDateFormat;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        }

        public b() {
        }

        public /* synthetic */ b(a aVar) {
            this();
        }

        @Override // androidx.appcompat.view.menu.z41
        /* renamed from: b */
        public void a(Date date, a51 a51Var) {
            a51Var.c(a.format(date));
        }
    }

    public j70() {
        p(String.class, f);
        p(Boolean.class, g);
        p(Date.class, h);
    }

    public static /* synthetic */ void l(Object obj, xf0 xf0Var) {
        throw new no("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
    }

    public static /* synthetic */ void n(Boolean bool, a51 a51Var) {
        a51Var.d(bool.booleanValue());
    }

    public xi i() {
        return new a();
    }

    public j70 j(bf bfVar) {
        bfVar.a(this);
        return this;
    }

    public j70 k(boolean z) {
        this.d = z;
        return this;
    }

    @Override // androidx.appcompat.view.menu.ko
    /* renamed from: o */
    public j70 a(Class cls, wf0 wf0Var) {
        this.a.put(cls, wf0Var);
        this.b.remove(cls);
        return this;
    }

    public j70 p(Class cls, z41 z41Var) {
        this.b.put(cls, z41Var);
        this.a.remove(cls);
        return this;
    }
}
