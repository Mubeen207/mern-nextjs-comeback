package androidx.appcompat.view.menu;

import android.os.IBinder;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public class x30 extends j8 {
    public static final String q;

    static {
        if (y8.h()) {
            q = "vibrator_manager";
        } else {
            q = "vibrator";
        }
    }

    public x30() {
        super((IBinder) et0.c.b(q));
    }

    @Override // androidx.appcompat.view.menu.o10
    public boolean a() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.ob
    public Object h() {
        IBinder iBinder = (IBinder) et0.c.b(q);
        return y8.h() ? v30.b.b(iBinder) : w30.b.b(iBinder);
    }

    @Override // androidx.appcompat.view.menu.ob
    public void i(Object obj, Object obj2) {
        l(q);
    }

    @Override // androidx.appcompat.view.menu.ob, java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) {
        rd0.g(objArr);
        rd0.f(objArr);
        return super.invoke(obj, method, objArr);
    }
}
