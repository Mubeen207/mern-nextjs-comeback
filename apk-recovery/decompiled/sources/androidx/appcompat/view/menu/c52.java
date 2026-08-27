package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public final class c52 implements v32 {
    public final z32 a;
    public final String b;
    public final Object[] c;
    public final int d;

    public c52(z32 z32Var, String str, Object[] objArr) {
        this.a = z32Var;
        this.b = str;
        this.c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.d = charAt;
            return;
        }
        int i = charAt & 8191;
        int i2 = 13;
        int i3 = 1;
        while (true) {
            int i4 = i3 + 1;
            char charAt2 = str.charAt(i3);
            if (charAt2 < 55296) {
                this.d = i | (charAt2 << i2);
                return;
            }
            i |= (charAt2 & 8191) << i2;
            i2 += 13;
            i3 = i4;
        }
    }

    @Override // androidx.appcompat.view.menu.v32
    public final z32 a() {
        return this.a;
    }

    @Override // androidx.appcompat.view.menu.v32
    public final a52 b() {
        int i = this.d;
        return (i & 1) != 0 ? a52.PROTO2 : (i & 4) == 4 ? a52.EDITIONS : a52.PROTO3;
    }

    @Override // androidx.appcompat.view.menu.v32
    public final boolean c() {
        return (this.d & 2) == 2;
    }

    public final String d() {
        return this.b;
    }

    public final Object[] e() {
        return this.c;
    }
}
