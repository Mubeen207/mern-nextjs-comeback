package androidx.appcompat.view.menu;

import android.os.IBinder;
import android.os.IInterface;
import android.os.storage.StorageVolume;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public class e30 extends j8 {

    /* loaded from: classes.dex */
    public static class a extends pd0 {
        @Override // androidx.appcompat.view.menu.pd0
        public Object d(Object obj, Method method, Object[] objArr) {
            if (objArr == null) {
                StorageVolume[] h = bv0.l().h(mv0.J2(), null, 0, mv0.N2());
                return h == null ? method.invoke(obj, objArr) : h;
            }
            try {
                StorageVolume[] h2 = bv0.l().h(((Integer) objArr[0]).intValue(), (String) objArr[1], ((Integer) objArr[2]).intValue(), mv0.N2());
                return h2 == null ? method.invoke(obj, objArr) : h2;
            } catch (Throwable unused) {
                return method.invoke(obj, objArr);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b extends pd0 {
        @Override // androidx.appcompat.view.menu.pd0
        public Object d(Object obj, Method method, Object[] objArr) {
            return 0;
        }
    }

    public e30() {
        super((IBinder) et0.c.b("mount"));
    }

    @Override // androidx.appcompat.view.menu.o10
    public boolean a() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.ob
    public Object h() {
        return y8.d() ? (IInterface) d30.b.b(et0.c.b("mount")) : (IInterface) a20.b.b(et0.c.b("mount"));
    }

    @Override // androidx.appcompat.view.menu.ob
    public void i(Object obj, Object obj2) {
        l("mount");
    }

    @Override // androidx.appcompat.view.menu.j8, androidx.appcompat.view.menu.ob
    public void j() {
        super.j();
        e("getVolumeList", new a());
        e("mkdirs", new b());
    }
}
