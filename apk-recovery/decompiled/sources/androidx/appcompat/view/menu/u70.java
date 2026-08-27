package androidx.appcompat.view.menu;

import android.view.KeyEvent;
import androidx.appcompat.view.menu.b80;
import androidx.appcompat.view.menu.d80;
/* loaded from: classes.dex */
public class u70 implements d80.d {
    public final b80 a;
    public final d80.b b = new d80.b();

    public u70(b80 b80Var) {
        this.a = b80Var;
    }

    @Override // androidx.appcompat.view.menu.d80.d
    public void a(KeyEvent keyEvent, final d80.d.a aVar) {
        int action = keyEvent.getAction();
        if (action == 0 || action == 1) {
            this.a.e(new b80.b(keyEvent, this.b.a(keyEvent.getUnicodeChar())), action != 0, new b80.a() { // from class: androidx.appcompat.view.menu.t70
                @Override // androidx.appcompat.view.menu.b80.a
                public final void a(boolean z) {
                    d80.d.a.this.a(z);
                }
            });
        } else {
            aVar.a(false);
        }
    }
}
