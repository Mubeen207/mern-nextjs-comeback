package androidx.lifecycle;

import android.content.Context;
import androidx.appcompat.view.menu.b50;
import androidx.appcompat.view.menu.c60;
import androidx.appcompat.view.menu.d90;
import androidx.appcompat.view.menu.q3;
import androidx.appcompat.view.menu.sc;
import androidx.lifecycle.l;
import java.util.List;
/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements b50 {
    @Override // androidx.appcompat.view.menu.b50
    public List a() {
        List e;
        e = sc.e();
        return e;
    }

    @Override // androidx.appcompat.view.menu.b50
    /* renamed from: c */
    public d90 b(Context context) {
        c60.e(context, "context");
        q3 e = q3.e(context);
        c60.d(e, "getInstance(context)");
        if (e.g(ProcessLifecycleInitializer.class)) {
            g.a(context);
            l.b bVar = l.i;
            bVar.b(context);
            return bVar.a();
        }
        throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml".toString());
    }
}
