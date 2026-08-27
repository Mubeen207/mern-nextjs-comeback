package androidx.appcompat.view.menu;

import androidx.window.extensions.layout.WindowLayoutComponent;
/* loaded from: classes.dex */
public abstract class iq implements e81 {
    public static final a a = new a(null);

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(lj ljVar) {
            this();
        }

        public final e81 a(WindowLayoutComponent windowLayoutComponent, qf qfVar) {
            c60.e(windowLayoutComponent, "component");
            c60.e(qfVar, "adapter");
            int a = nq.a.a();
            return a >= 2 ? new mq(windowLayoutComponent) : a == 1 ? new lq(windowLayoutComponent, qfVar) : new kq();
        }
    }
}
