package androidx.appcompat.view.menu;

import androidx.appcompat.view.menu.kh;
import java.io.Closeable;
/* loaded from: classes.dex */
public abstract class up extends nh implements Closeable {
    public static final a o = new a(null);

    /* loaded from: classes.dex */
    public static final class a extends i {

        /* renamed from: androidx.appcompat.view.menu.up$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0032a extends j80 implements kw {
            public static final C0032a n = new C0032a();

            public C0032a() {
                super(1);
            }

            @Override // androidx.appcompat.view.menu.kw
            /* renamed from: a */
            public final up i(kh.b bVar) {
                if (bVar instanceof up) {
                    return (up) bVar;
                }
                return null;
            }
        }

        public /* synthetic */ a(lj ljVar) {
            this();
        }

        public a() {
            super(nh.n, C0032a.n);
        }
    }
}
