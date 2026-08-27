package androidx.appcompat.view.menu;

import android.os.IBinder;
import androidx.appcompat.view.menu.g20;
import java.lang.reflect.Field;
/* loaded from: classes.dex */
public final class yf0 extends g20.a {
    public final Object l;

    public yf0(Object obj) {
        this.l = obj;
    }

    public static Object j(g20 g20Var) {
        if (g20Var instanceof yf0) {
            return ((yf0) g20Var).l;
        }
        IBinder asBinder = g20Var.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        Field field = null;
        int i = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i++;
                field = field2;
            }
        }
        if (i != 1) {
            throw new IllegalArgumentException("Unexpected number of IObjectWrapper declared fields: " + declaredFields.length);
        }
        pj0.i(field);
        if (field.isAccessible()) {
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
        field.setAccessible(true);
        try {
            return field.get(asBinder);
        } catch (IllegalAccessException e) {
            throw new IllegalArgumentException("Could not access the field in remoteBinder.", e);
        } catch (NullPointerException e2) {
            throw new IllegalArgumentException("Binder object is null.", e2);
        }
    }

    public static g20 k(Object obj) {
        return new yf0(obj);
    }
}
