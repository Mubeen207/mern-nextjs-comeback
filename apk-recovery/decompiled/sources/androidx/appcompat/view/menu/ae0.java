package androidx.appcompat.view.menu;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.TypedArray;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class ae0 {
    public final qu0 a = new qu0();
    public final qu0 b = new qu0();

    public static void a(ae0 ae0Var, Animator animator) {
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            ae0Var.e(objectAnimator.getPropertyName(), objectAnimator.getValues());
            ae0Var.f(objectAnimator.getPropertyName(), be0.a(objectAnimator));
            return;
        }
        throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
    }

    public static ae0 b(Context context, TypedArray typedArray, int i) {
        int resourceId;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) {
            return null;
        }
        return c(context, resourceId);
    }

    public static ae0 c(Context context, int i) {
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i);
            if (loadAnimator instanceof AnimatorSet) {
                return d(((AnimatorSet) loadAnimator).getChildAnimations());
            }
            if (loadAnimator != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(loadAnimator);
                return d(arrayList);
            }
            return null;
        } catch (Exception unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("Can't load animation resource ID #0x");
            sb.append(Integer.toHexString(i));
            return null;
        }
    }

    public static ae0 d(List list) {
        ae0 ae0Var = new ae0();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            a(ae0Var, (Animator) list.get(i));
        }
        return ae0Var;
    }

    public void e(String str, PropertyValuesHolder[] propertyValuesHolderArr) {
        this.b.put(str, propertyValuesHolderArr);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ae0) {
            return this.a.equals(((ae0) obj).a);
        }
        return false;
    }

    public void f(String str, be0 be0Var) {
        this.a.put(str, be0Var);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return '\n' + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.a + "}\n";
    }
}
