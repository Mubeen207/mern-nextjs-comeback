package com.snake.helper;

import android.app.Activity;
import android.content.Intent;
/* loaded from: classes.dex */
public class ProxyActivity extends Activity {

    /* loaded from: classes.dex */
    public static class P0 extends ProxyActivity {
    }

    /* loaded from: classes.dex */
    public static class P0_L extends ProxyActivity {
    }

    /* loaded from: classes.dex */
    public static class P1 extends ProxyActivity {
    }

    /* loaded from: classes.dex */
    public static class P1_L extends ProxyActivity {
    }

    /* loaded from: classes.dex */
    public static class P2 extends ProxyActivity {
    }

    /* loaded from: classes.dex */
    public static class P2_L extends ProxyActivity {
    }

    /* loaded from: classes.dex */
    public static class P3 extends ProxyActivity {
    }

    /* loaded from: classes.dex */
    public static class P3_L extends ProxyActivity {
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        intent.getData();
    }
}
