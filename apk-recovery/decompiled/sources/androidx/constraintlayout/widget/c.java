package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.view.menu.iz;
import androidx.appcompat.view.menu.jn0;
import androidx.appcompat.view.menu.mf;
import androidx.appcompat.view.menu.om0;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import java.util.HashMap;
/* loaded from: classes.dex */
public abstract class c extends View {
    public int[] a;
    public int b;
    public Context c;
    public iz d;
    public boolean e;
    public String f;
    public View[] g;
    public HashMap h;

    public c(Context context) {
        super(context);
        this.a = new int[32];
        this.e = false;
        this.g = null;
        this.h = new HashMap();
        this.c = context;
        g(null);
    }

    public final void a(String str) {
        if (str == null || str.length() == 0 || this.c == null) {
            return;
        }
        String trim = str.trim();
        if (getParent() instanceof ConstraintLayout) {
            ConstraintLayout constraintLayout = (ConstraintLayout) getParent();
        }
        int f = f(trim);
        if (f != 0) {
            this.h.put(Integer.valueOf(f), trim);
            b(f);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Could not find id of \"");
        sb.append(trim);
        sb.append("\"");
    }

    public final void b(int i) {
        if (i == getId()) {
            return;
        }
        int i2 = this.b + 1;
        int[] iArr = this.a;
        if (i2 > iArr.length) {
            this.a = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.a;
        int i3 = this.b;
        iArr2[i3] = i;
        this.b = i3 + 1;
    }

    public void c() {
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        d((ConstraintLayout) parent);
    }

    public void d(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i = 0; i < this.b; i++) {
            View h = constraintLayout.h(this.a[i]);
            if (h != null) {
                h.setVisibility(visibility);
                if (elevation > 0.0f) {
                    h.setTranslationZ(h.getTranslationZ() + elevation);
                }
            }
        }
    }

    public final int e(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        String str2;
        if (str == null || constraintLayout == null || (resources = this.c.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            if (childAt.getId() != -1) {
                try {
                    str2 = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                    str2 = null;
                }
                if (str.equals(str2)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    public final int f(String str) {
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        int i = 0;
        if (isInEditMode() && constraintLayout != null) {
            Object f = constraintLayout.f(0, str);
            if (f instanceof Integer) {
                i = ((Integer) f).intValue();
            }
        }
        if (i == 0 && constraintLayout != null) {
            i = e(constraintLayout, str);
        }
        if (i == 0) {
            try {
                i = om0.class.getField(str).getInt(null);
            } catch (Exception unused) {
            }
        }
        return i == 0 ? this.c.getResources().getIdentifier(str, "id", this.c.getPackageName()) : i;
    }

    public void g(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, jn0.a1);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == jn0.t1) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f = string;
                    setIds(string);
                }
            }
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.a, this.b);
    }

    public abstract void h(mf mfVar, boolean z);

    public void i(ConstraintLayout constraintLayout) {
    }

    public void j(ConstraintLayout constraintLayout) {
    }

    public void k(ConstraintLayout constraintLayout) {
    }

    public void l(ConstraintLayout constraintLayout) {
        String str;
        int e;
        if (isInEditMode()) {
            setIds(this.f);
        }
        iz izVar = this.d;
        if (izVar == null) {
            return;
        }
        izVar.b();
        for (int i = 0; i < this.b; i++) {
            int i2 = this.a[i];
            View h = constraintLayout.h(i2);
            if (h == null && (e = e(constraintLayout, (str = (String) this.h.get(Integer.valueOf(i2))))) != 0) {
                this.a[i] = e;
                this.h.put(Integer.valueOf(e), str);
                h = constraintLayout.h(e);
            }
            if (h != null) {
                this.d.a(constraintLayout.i(h));
            }
        }
        this.d.c(constraintLayout.c);
    }

    public void m() {
        if (this.d == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.b) {
            ((ConstraintLayout.b) layoutParams).n0 = (mf) this.d;
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f;
        if (str != null) {
            setIds(str);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        if (this.e) {
            super.onMeasure(i, i2);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    public void setIds(String str) {
        this.f = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.b = 0;
        while (true) {
            int indexOf = str.indexOf(44, i);
            if (indexOf == -1) {
                a(str.substring(i));
                return;
            } else {
                a(str.substring(i, indexOf));
                i = indexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f = null;
        this.b = 0;
        for (int i : iArr) {
            b(i);
        }
    }

    public c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new int[32];
        this.e = false;
        this.g = null;
        this.h = new HashMap();
        this.c = context;
        g(attributeSet);
    }
}
