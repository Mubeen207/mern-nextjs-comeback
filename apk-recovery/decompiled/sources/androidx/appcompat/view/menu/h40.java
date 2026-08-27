package androidx.appcompat.view.menu;

import android.os.IInterface;
import android.view.WindowManager;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public class h40 extends j8 {
    public final IInterface q;

    /* loaded from: classes.dex */
    public static class a extends pd0 {
        @Override // androidx.appcompat.view.menu.pd0
        public Object d(Object obj, Method method, Object[] objArr) {
            for (Object obj2 : objArr) {
                if (obj2 != null && (obj2 instanceof WindowManager.LayoutParams)) {
                    ((WindowManager.LayoutParams) obj2).packageName = bv0.o();
                }
            }
            return method.invoke(obj, objArr);
        }
    }

    /* loaded from: classes.dex */
    public static class b extends a {
    }

    public h40(IInterface iInterface) {
        super(iInterface.asBinder());
        this.q = iInterface;
    }

    @Override // androidx.appcompat.view.menu.o10
    public boolean a() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.ob
    public Object h() {
        return this.q;
    }

    @Override // androidx.appcompat.view.menu.ob
    public void i(Object obj, Object obj2) {
    }

    @Override // androidx.appcompat.view.menu.j8, androidx.appcompat.view.menu.ob
    public void j() {
        super.j();
        e("addToDisplay", new a());
        e("addToDisplayAsUser", new b());
    }
}
