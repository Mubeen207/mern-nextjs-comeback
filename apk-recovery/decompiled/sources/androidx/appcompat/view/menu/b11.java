package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.appcompat.view.menu.ip0;
/* loaded from: classes.dex */
public class b11 {
    public final Context a;
    public final TypedArray b;
    public TypedValue c;

    public b11(Context context, TypedArray typedArray) {
        this.a = context;
        this.b = typedArray;
    }

    public static b11 r(Context context, int i, int[] iArr) {
        return new b11(context, context.obtainStyledAttributes(i, iArr));
    }

    public static b11 s(Context context, AttributeSet attributeSet, int[] iArr) {
        return new b11(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public static b11 t(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2) {
        return new b11(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    public boolean a(int i, boolean z) {
        return this.b.getBoolean(i, z);
    }

    public int b(int i, int i2) {
        return this.b.getColor(i, i2);
    }

    public ColorStateList c(int i) {
        int resourceId;
        ColorStateList a;
        return (!this.b.hasValue(i) || (resourceId = this.b.getResourceId(i, 0)) == 0 || (a = i3.a(this.a, resourceId)) == null) ? this.b.getColorStateList(i) : a;
    }

    public float d(int i, float f) {
        return this.b.getDimension(i, f);
    }

    public int e(int i, int i2) {
        return this.b.getDimensionPixelOffset(i, i2);
    }

    public int f(int i, int i2) {
        return this.b.getDimensionPixelSize(i, i2);
    }

    public Drawable g(int i) {
        int resourceId;
        return (!this.b.hasValue(i) || (resourceId = this.b.getResourceId(i, 0)) == 0) ? this.b.getDrawable(i) : i3.b(this.a, resourceId);
    }

    public float h(int i, float f) {
        return this.b.getFloat(i, f);
    }

    public Typeface i(int i, int i2, ip0.e eVar) {
        int resourceId = this.b.getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.c == null) {
            this.c = new TypedValue();
        }
        return ip0.h(this.a, resourceId, this.c, i2, eVar);
    }

    public int j(int i, int i2) {
        return this.b.getInt(i, i2);
    }

    public int k(int i, int i2) {
        return this.b.getInteger(i, i2);
    }

    public int l(int i, int i2) {
        return this.b.getLayoutDimension(i, i2);
    }

    public int m(int i, int i2) {
        return this.b.getResourceId(i, i2);
    }

    public String n(int i) {
        return this.b.getString(i);
    }

    public CharSequence o(int i) {
        return this.b.getText(i);
    }

    public TypedArray p() {
        return this.b;
    }

    public boolean q(int i) {
        return this.b.hasValue(i);
    }

    public TypedValue u(int i) {
        return this.b.peekValue(i);
    }

    public void v() {
        this.b.recycle();
    }
}
