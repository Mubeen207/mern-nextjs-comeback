package androidx.appcompat.view.menu;

import android.os.Bundle;
import androidx.appcompat.view.menu.jf0;
import androidx.core.graphics.drawable.IconCompat;
/* loaded from: classes.dex */
public abstract class lf0 {
    public static final Object a = new Object();
    public static final Object b = new Object();

    public static Bundle a(jf0.a aVar) {
        Bundle bundle = new Bundle();
        IconCompat d = aVar.d();
        bundle.putInt("icon", d != null ? d.e() : 0);
        bundle.putCharSequence("title", aVar.h());
        bundle.putParcelable("actionIntent", aVar.a());
        Bundle bundle2 = aVar.c() != null ? new Bundle(aVar.c()) : new Bundle();
        bundle2.putBoolean("android.support.allowGeneratedReplies", aVar.b());
        bundle.putBundle("extras", bundle2);
        bundle.putParcelableArray("remoteInputs", c(aVar.e()));
        bundle.putBoolean("showsUserInterface", aVar.g());
        bundle.putInt("semanticAction", aVar.f());
        return bundle;
    }

    public static Bundle b(ro0 ro0Var) {
        new Bundle();
        throw null;
    }

    public static Bundle[] c(ro0[] ro0VarArr) {
        if (ro0VarArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[ro0VarArr.length];
        for (int i = 0; i < ro0VarArr.length; i++) {
            ro0 ro0Var = ro0VarArr[i];
            bundleArr[i] = b(null);
        }
        return bundleArr;
    }
}
