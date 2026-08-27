package androidx.appcompat.view.menu;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
/* loaded from: classes.dex */
public abstract class dd1 implements DialogInterface.OnClickListener {
    public static dd1 b(Activity activity, Intent intent, int i) {
        return new sc1(intent, activity, i);
    }

    public static dd1 c(b90 b90Var, Intent intent, int i) {
        return new cd1(intent, b90Var, 2);
    }

    public abstract void a();

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        try {
            a();
        } catch (ActivityNotFoundException unused) {
            Build.FINGERPRINT.contains("generic");
        } finally {
            dialogInterface.dismiss();
        }
    }
}
