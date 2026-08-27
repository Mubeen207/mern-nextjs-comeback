package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public abstract class sn0 extends ConstraintLayout {
    public final Runnable x;
    public int y;
    public rb0 z;

    public sn0(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(ym0.f, this);
        p51.o0(this, u());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, on0.z3, i, 0);
        this.y = obtainStyledAttributes.getDimensionPixelSize(on0.A3, 0);
        this.x = new Runnable() { // from class: androidx.appcompat.view.menu.rn0
            @Override // java.lang.Runnable
            public final void run() {
                sn0.this.z();
            }
        };
        obtainStyledAttributes.recycle();
    }

    public static boolean y(View view) {
        return "skip".equals(view.getTag());
    }

    public final void A() {
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.x);
            handler.post(this.x);
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (view.getId() == -1) {
            view.setId(p51.h());
        }
        A();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        z();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        A();
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.z.T(ColorStateList.valueOf(i));
    }

    public final void t(List list, androidx.constraintlayout.widget.d dVar, int i) {
        Iterator it = list.iterator();
        float f = 0.0f;
        while (it.hasNext()) {
            dVar.g(((View) it.next()).getId(), vm0.b, i, f);
            f += 360.0f / list.size();
        }
    }

    public final Drawable u() {
        rb0 rb0Var = new rb0();
        this.z = rb0Var;
        rb0Var.R(new po0(0.5f));
        this.z.T(ColorStateList.valueOf(-1));
        return this.z;
    }

    public int v(int i) {
        return i == 2 ? Math.round(this.y * 0.66f) : this.y;
    }

    public int w() {
        return this.y;
    }

    public void x(int i) {
        this.y = i;
        z();
    }

    public void z() {
        androidx.constraintlayout.widget.d dVar = new androidx.constraintlayout.widget.d();
        dVar.f(this);
        HashMap hashMap = new HashMap();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getId() != vm0.b && !y(childAt)) {
                int i2 = (Integer) childAt.getTag(vm0.i);
                if (i2 == null) {
                    i2 = 1;
                }
                if (!hashMap.containsKey(i2)) {
                    hashMap.put(i2, new ArrayList());
                }
                ((List) hashMap.get(i2)).add(childAt);
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            t((List) entry.getValue(), dVar, v(((Integer) entry.getKey()).intValue()));
        }
        dVar.c(this);
    }
}
