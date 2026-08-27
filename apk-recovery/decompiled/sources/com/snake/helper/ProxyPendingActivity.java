package com.snake.helper;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.view.menu.mv0;
import androidx.appcompat.view.menu.tl0;
/* loaded from: classes.dex */
public abstract class ProxyPendingActivity extends Activity {

    /* loaded from: classes.dex */
    public static class P0 extends ProxyPendingActivity {
    }

    /* loaded from: classes.dex */
    public static class P1 extends ProxyPendingActivity {
    }

    /* loaded from: classes.dex */
    public static class P2 extends ProxyPendingActivity {
    }

    /* loaded from: classes.dex */
    public static class P3 extends ProxyPendingActivity {
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        finish();
        tl0 a = tl0.a(getIntent());
        Intent intent = a.b;
        if (intent == null) {
            return;
        }
        intent.addFlags(268435456);
        a.b.setExtrasClassLoader(mv0.H2().getClassLoader());
        startActivity(a.b);
    }
}
