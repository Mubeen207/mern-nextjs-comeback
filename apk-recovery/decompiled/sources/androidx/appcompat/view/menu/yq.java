package androidx.appcompat.view.menu;

import java.util.Random;
/* loaded from: classes.dex */
public final class yq extends o {
    public final a o = new a();

    /* loaded from: classes.dex */
    public static final class a extends ThreadLocal {
        @Override // java.lang.ThreadLocal
        /* renamed from: a */
        public Random initialValue() {
            return new Random();
        }
    }

    @Override // androidx.appcompat.view.menu.o
    public Random c() {
        Object obj = this.o.get();
        c60.d(obj, "implStorage.get()");
        return (Random) obj;
    }
}
