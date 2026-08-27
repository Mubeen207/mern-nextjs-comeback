package androidx.appcompat.view.menu;

import androidx.appcompat.view.menu.el0;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class el0 {
    public final Map a;
    public final Map b;
    public final wf0 c;

    /* loaded from: classes.dex */
    public static final class a implements ko {
        public static final wf0 d = new wf0() { // from class: androidx.appcompat.view.menu.dl0
            @Override // androidx.appcompat.view.menu.wf0
            public final void a(Object obj, Object obj2) {
                el0.a.e(obj, (xf0) obj2);
            }
        };
        public final Map a = new HashMap();
        public final Map b = new HashMap();
        public wf0 c = d;

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void e(Object obj, xf0 xf0Var) {
            throw new no("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }

        public el0 c() {
            return new el0(new HashMap(this.a), new HashMap(this.b), this.c);
        }

        public a d(bf bfVar) {
            bfVar.a(this);
            return this;
        }

        @Override // androidx.appcompat.view.menu.ko
        /* renamed from: f */
        public a a(Class cls, wf0 wf0Var) {
            this.a.put(cls, wf0Var);
            this.b.remove(cls);
            return this;
        }
    }

    public el0(Map map, Map map2, wf0 wf0Var) {
        this.a = map;
        this.b = map2;
        this.c = wf0Var;
    }

    public static a a() {
        return new a();
    }

    public void b(Object obj, OutputStream outputStream) {
        new cl0(outputStream, this.a, this.b, this.c).q(obj);
    }

    public byte[] c(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            b(obj, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
