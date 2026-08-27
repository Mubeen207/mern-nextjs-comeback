package androidx.appcompat.view.menu;

import android.app.RemoteInput;
import android.content.Intent;
import android.os.Bundle;
/* loaded from: classes.dex */
public abstract class ro0 {

    /* loaded from: classes.dex */
    public static class a {
        public static void a(Object obj, Intent intent, Bundle bundle) {
            RemoteInput.addResultsToIntent((RemoteInput[]) obj, intent, bundle);
        }

        public static RemoteInput b(ro0 ro0Var) {
            throw null;
        }

        public static Bundle c(Intent intent) {
            return RemoteInput.getResultsFromIntent(intent);
        }
    }

    public static RemoteInput a(ro0 ro0Var) {
        return a.b(ro0Var);
    }

    public static RemoteInput[] b(ro0[] ro0VarArr) {
        if (ro0VarArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[ro0VarArr.length];
        for (int i = 0; i < ro0VarArr.length; i++) {
            ro0 ro0Var = ro0VarArr[i];
            remoteInputArr[i] = a(null);
        }
        return remoteInputArr;
    }
}
