package androidx.appcompat.view.menu;

import java.util.ArrayList;
/* loaded from: classes.dex */
public abstract class nk1 {
    public Object a;
    public boolean b = false;
    public final /* synthetic */ z7 c;

    public nk1(z7 z7Var, Object obj) {
        this.c = z7Var;
        this.a = obj;
    }

    public abstract void a(Object obj);

    public abstract void b();

    public final void c() {
        Object obj;
        synchronized (this) {
            try {
                obj = this.a;
                if (this.b) {
                    String obj2 = toString();
                    StringBuilder sb = new StringBuilder();
                    sb.append("Callback proxy ");
                    sb.append(obj2);
                    sb.append(" being reused. This is not safe.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (obj != null) {
            a(obj);
        }
        synchronized (this) {
            this.b = true;
        }
        e();
    }

    public final void d() {
        synchronized (this) {
            this.a = null;
        }
    }

    public final void e() {
        ArrayList arrayList;
        ArrayList arrayList2;
        d();
        arrayList = this.c.C;
        synchronized (arrayList) {
            arrayList2 = this.c.C;
            arrayList2.remove(this);
        }
    }
}
