package androidx.appcompat.view.menu;

import android.content.Intent;
/* loaded from: classes.dex */
public final class cd1 extends dd1 {
    public final /* synthetic */ Intent a;
    public final /* synthetic */ b90 b;

    public cd1(Intent intent, b90 b90Var, int i) {
        this.a = intent;
        this.b = b90Var;
    }

    @Override // androidx.appcompat.view.menu.dd1
    public final void a() {
        Intent intent = this.a;
        if (intent != null) {
            this.b.startActivityForResult(intent, 2);
        }
    }
}
