package androidx.appcompat.view.menu;

import android.os.Handler;
import androidx.appcompat.view.menu.v7;
/* loaded from: classes.dex */
public final class rb1 implements v7.a {
    public final /* synthetic */ gy a;

    public rb1(gy gyVar) {
        this.a = gyVar;
    }

    @Override // androidx.appcompat.view.menu.v7.a
    public final void a(boolean z) {
        Handler handler;
        Handler handler2;
        gy gyVar = this.a;
        handler = gyVar.A;
        handler2 = gyVar.A;
        handler.sendMessage(handler2.obtainMessage(1, Boolean.valueOf(z)));
    }
}
