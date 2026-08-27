package androidx.appcompat.view.menu;

import android.os.Bundle;
import androidx.appcompat.view.menu.sr0;
import androidx.lifecycle.f;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class ao0 implements androidx.lifecycle.h {
    public static final a b = new a(null);
    public final ur0 a;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(lj ljVar) {
            this();
        }
    }

    public ao0(ur0 ur0Var) {
        c60.e(ur0Var, "owner");
        this.a = ur0Var;
    }

    @Override // androidx.lifecycle.h
    public void c(d90 d90Var, f.a aVar) {
        c60.e(d90Var, "source");
        c60.e(aVar, "event");
        if (aVar != f.a.ON_CREATE) {
            throw new AssertionError("Next event must be ON_CREATE");
        }
        d90Var.h().c(this);
        Bundle b2 = this.a.l().b("androidx.savedstate.Restarter");
        if (b2 == null) {
            return;
        }
        ArrayList<String> stringArrayList = b2.getStringArrayList("classes_to_restore");
        if (stringArrayList == null) {
            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        for (String str : stringArrayList) {
            h(str);
        }
    }

    public final void h(String str) {
        try {
            Class<? extends U> asSubclass = Class.forName(str, false, ao0.class.getClassLoader()).asSubclass(sr0.a.class);
            c60.d(asSubclass, "{\n                Class.…class.java)\n            }");
            try {
                Constructor declaredConstructor = asSubclass.getDeclaredConstructor(new Class[0]);
                declaredConstructor.setAccessible(true);
                try {
                    Object newInstance = declaredConstructor.newInstance(new Object[0]);
                    c60.d(newInstance, "{\n                constr…wInstance()\n            }");
                    my0.a(newInstance);
                    throw null;
                } catch (Exception e) {
                    throw new RuntimeException("Failed to instantiate " + str, e);
                }
            } catch (NoSuchMethodException e2) {
                throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
            }
        } catch (ClassNotFoundException e3) {
            throw new RuntimeException("Class " + str + " wasn't found", e3);
        }
    }
}
