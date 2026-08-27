package androidx.appcompat.view.menu;

import android.app.Activity;
import android.content.Intent;
/* loaded from: classes.dex */
public final class sc1 extends dd1 {
    public final /* synthetic */ Intent a;
    public final /* synthetic */ Activity b;
    public final /* synthetic */ int c;

    public sc1(Intent intent, Activity activity, int i) {
        this.a = intent;
        this.b = activity;
        this.c = i;
    }

    @Override // androidx.appcompat.view.menu.dd1
    public final void a() {
        Intent intent = this.a;
        if (intent != null) {
            this.b.startActivityForResult(intent, this.c);
        }
    }
}
