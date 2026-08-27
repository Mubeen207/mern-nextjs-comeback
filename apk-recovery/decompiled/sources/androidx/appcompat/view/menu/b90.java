package androidx.appcompat.view.menu;

import android.app.Activity;
import android.content.Intent;
import com.google.android.gms.common.api.internal.LifecycleCallback;
/* loaded from: classes.dex */
public interface b90 {
    void a(String str, LifecycleCallback lifecycleCallback);

    LifecycleCallback d(String str, Class cls);

    Activity e();

    void startActivityForResult(Intent intent, int i);
}
