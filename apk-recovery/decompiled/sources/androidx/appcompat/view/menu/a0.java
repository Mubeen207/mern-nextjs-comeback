package androidx.appcompat.view.menu;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
/* loaded from: classes.dex */
public final class a0 extends ClickableSpan {
    public final int a;
    public final p0 b;
    public final int c;

    public a0(int i, p0 p0Var, int i2) {
        this.a = i;
        this.b = p0Var;
        this.c = i2;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.a);
        this.b.V(this.c, bundle);
    }
}
