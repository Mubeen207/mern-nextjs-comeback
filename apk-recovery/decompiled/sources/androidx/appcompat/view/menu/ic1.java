package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Looper;
import android.os.Message;
/* loaded from: classes.dex */
public final class ic1 extends ce1 {
    public final Context a;
    public final /* synthetic */ dy b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ic1(dy dyVar, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
        this.b = dyVar;
        this.a = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i != 1) {
            StringBuilder sb = new StringBuilder(50);
            sb.append("Don't know how to handle this message: ");
            sb.append(i);
            return;
        }
        int g = this.b.g(this.a);
        if (this.b.j(g)) {
            this.b.o(this.a, g);
        }
    }
}
