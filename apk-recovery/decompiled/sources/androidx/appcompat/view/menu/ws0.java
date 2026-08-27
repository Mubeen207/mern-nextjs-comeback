package androidx.appcompat.view.menu;

import java.util.Iterator;
/* loaded from: classes.dex */
public abstract class ws0 extends vs0 {

    /* loaded from: classes.dex */
    public static final class a implements ss0 {
        public final /* synthetic */ Iterator a;

        public a(Iterator it) {
            this.a = it;
        }

        @Override // androidx.appcompat.view.menu.ss0
        public Iterator iterator() {
            return this.a;
        }
    }

    public static ss0 a(Iterator it) {
        c60.e(it, "<this>");
        return b(new a(it));
    }

    public static final ss0 b(ss0 ss0Var) {
        c60.e(ss0Var, "<this>");
        return ss0Var instanceof jf ? ss0Var : new jf(ss0Var);
    }
}
