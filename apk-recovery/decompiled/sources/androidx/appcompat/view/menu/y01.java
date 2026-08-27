package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class y01 extends ContextWrapper {
    public static final Object c = new Object();
    public static ArrayList d;
    public final Resources a;
    public final Resources.Theme b;

    public y01(Context context) {
        super(context);
        if (!e51.c()) {
            this.a = new a11(this, context.getResources());
            this.b = null;
            return;
        }
        e51 e51Var = new e51(this, context.getResources());
        this.a = e51Var;
        Resources.Theme newTheme = e51Var.newTheme();
        this.b = newTheme;
        newTheme.setTo(context.getTheme());
    }

    public static boolean a(Context context) {
        if ((context instanceof y01) || (context.getResources() instanceof a11) || (context.getResources() instanceof e51)) {
            return false;
        }
        return e51.c();
    }

    public static Context b(Context context) {
        if (a(context)) {
            synchronized (c) {
                try {
                    ArrayList arrayList = d;
                    if (arrayList == null) {
                        d = new ArrayList();
                    } else {
                        for (int size = arrayList.size() - 1; size >= 0; size--) {
                            WeakReference weakReference = (WeakReference) d.get(size);
                            if (weakReference == null || weakReference.get() == null) {
                                d.remove(size);
                            }
                        }
                        for (int size2 = d.size() - 1; size2 >= 0; size2--) {
                            WeakReference weakReference2 = (WeakReference) d.get(size2);
                            y01 y01Var = weakReference2 != null ? (y01) weakReference2.get() : null;
                            if (y01Var != null && y01Var.getBaseContext() == context) {
                                return y01Var;
                            }
                        }
                    }
                    y01 y01Var2 = new y01(context);
                    d.add(new WeakReference(y01Var2));
                    return y01Var2;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return context;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return this.a.getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return this.a;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.b;
        return theme == null ? super.getTheme() : theme;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        Resources.Theme theme = this.b;
        if (theme == null) {
            super.setTheme(i);
        } else {
            theme.applyStyle(i, true);
        }
    }
}
