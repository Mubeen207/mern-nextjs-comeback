package androidx.appcompat.view.menu;

import java.util.Map;
/* loaded from: classes.dex */
public final class v82 implements du1 {
    public final /* synthetic */ String a;
    public final /* synthetic */ r82 b;

    public v82(r82 r82Var, String str) {
        this.b = r82Var;
        this.a = str;
    }

    @Override // androidx.appcompat.view.menu.du1
    public final void a(String str, int i, Throwable th, byte[] bArr, Map map) {
        this.b.I(true, i, th, bArr, this.a);
    }
}
