package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.pm.PackageParser;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.e8;
import androidx.appcompat.view.menu.jn0;
import androidx.appcompat.view.menu.kf;
import androidx.appcompat.view.menu.lf;
import androidx.appcompat.view.menu.mf;
import androidx.appcompat.view.menu.nf;
import androidx.appcompat.view.menu.of;
import androidx.appcompat.view.menu.oy;
import androidx.appcompat.view.menu.t02;
import java.util.ArrayList;
import java.util.HashMap;
/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {
    public SparseArray a;
    public ArrayList b;
    public nf c;
    public int d;
    public int e;
    public int f;
    public int g;
    public boolean h;
    public int i;
    public d j;
    public lf k;
    public int l;
    public HashMap m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public SparseArray t;
    public c u;
    public int v;
    public int w;

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[mf.b.values().length];
            a = iArr;
            try {
                iArr[mf.b.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[mf.b.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[mf.b.MATCH_PARENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[mf.b.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* loaded from: classes.dex */
    public class c implements e8.b {
        public ConstraintLayout a;
        public int b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;

        public c(ConstraintLayout constraintLayout) {
            this.a = constraintLayout;
        }

        @Override // androidx.appcompat.view.menu.e8.b
        public final void a() {
            int childCount = this.a.getChildCount();
            for (int i = 0; i < childCount; i++) {
                this.a.getChildAt(i);
            }
            int size = this.a.b.size();
            if (size > 0) {
                for (int i2 = 0; i2 < size; i2++) {
                    ((androidx.constraintlayout.widget.c) this.a.b.get(i2)).j(this.a);
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:102:0x016b A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:112:0x0184  */
        /* JADX WARN: Removed duplicated region for block: B:118:0x01a3  */
        /* JADX WARN: Removed duplicated region for block: B:119:0x01ae  */
        /* JADX WARN: Removed duplicated region for block: B:121:0x01ba  */
        /* JADX WARN: Removed duplicated region for block: B:122:0x01c4  */
        /* JADX WARN: Removed duplicated region for block: B:125:0x01d1  */
        /* JADX WARN: Removed duplicated region for block: B:126:0x01d6  */
        /* JADX WARN: Removed duplicated region for block: B:129:0x01db  */
        /* JADX WARN: Removed duplicated region for block: B:132:0x01e3  */
        /* JADX WARN: Removed duplicated region for block: B:133:0x01e8  */
        /* JADX WARN: Removed duplicated region for block: B:136:0x01ed  */
        /* JADX WARN: Removed duplicated region for block: B:139:0x01f5 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:142:0x0201 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:145:0x020c A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:151:0x0218  */
        /* JADX WARN: Removed duplicated region for block: B:153:0x021e  */
        /* JADX WARN: Removed duplicated region for block: B:156:0x0234  */
        /* JADX WARN: Removed duplicated region for block: B:157:0x0236  */
        /* JADX WARN: Removed duplicated region for block: B:160:0x023c  */
        /* JADX WARN: Removed duplicated region for block: B:167:0x024b  */
        /* JADX WARN: Removed duplicated region for block: B:168:0x024d  */
        /* JADX WARN: Removed duplicated region for block: B:170:0x0250  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00b8  */
        /* JADX WARN: Removed duplicated region for block: B:68:0x011d  */
        /* JADX WARN: Removed duplicated region for block: B:71:0x012c  */
        /* JADX WARN: Removed duplicated region for block: B:72:0x012e  */
        /* JADX WARN: Removed duplicated region for block: B:74:0x0131  */
        /* JADX WARN: Removed duplicated region for block: B:75:0x0133  */
        /* JADX WARN: Removed duplicated region for block: B:78:0x0138  */
        /* JADX WARN: Removed duplicated region for block: B:84:0x0142  */
        /* JADX WARN: Removed duplicated region for block: B:91:0x014d  */
        /* JADX WARN: Removed duplicated region for block: B:96:0x0158  */
        @Override // androidx.appcompat.view.menu.e8.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void b(androidx.appcompat.view.menu.mf r20, androidx.appcompat.view.menu.e8.a r21) {
            /*
                Method dump skipped, instructions count: 613
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.c.b(androidx.appcompat.view.menu.mf, androidx.appcompat.view.menu.e8$a):void");
        }

        public void c(int i, int i2, int i3, int i4, int i5, int i6) {
            this.b = i3;
            this.c = i4;
            this.d = i5;
            this.e = i6;
            this.f = i;
            this.g = i2;
        }
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new SparseArray();
        this.b = new ArrayList(4);
        this.c = new nf();
        this.d = 0;
        this.e = 0;
        this.f = Integer.MAX_VALUE;
        this.g = Integer.MAX_VALUE;
        this.h = true;
        this.i = 263;
        this.j = null;
        this.k = null;
        this.l = -1;
        this.m = new HashMap();
        this.n = -1;
        this.o = -1;
        this.p = -1;
        this.q = -1;
        this.r = 0;
        this.s = 0;
        this.t = new SparseArray();
        this.u = new c(this);
        this.v = 0;
        this.w = 0;
        j(attributeSet, 0, 0);
    }

    private int getPaddingWidth() {
        int max = Math.max(0, getPaddingLeft()) + Math.max(0, getPaddingRight());
        int max2 = Math.max(0, getPaddingStart()) + Math.max(0, getPaddingEnd());
        return max2 > 0 ? max2 : max;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
    }

    public void c(boolean z, View view, mf mfVar, b bVar, SparseArray sparseArray) {
        float f;
        mf mfVar2;
        mf mfVar3;
        mf mfVar4;
        mf mfVar5;
        int i;
        bVar.a();
        bVar.o0 = false;
        mfVar.D0(view.getVisibility());
        if (bVar.b0) {
            mfVar.p0(true);
            mfVar.D0(8);
        }
        mfVar.c0(view);
        if (view instanceof androidx.constraintlayout.widget.c) {
            ((androidx.constraintlayout.widget.c) view).h(mfVar, this.c.a1());
        }
        if (bVar.Z) {
            oy oyVar = (oy) mfVar;
            int i2 = bVar.k0;
            int i3 = bVar.l0;
            float f2 = bVar.m0;
            if (f2 != -1.0f) {
                oyVar.Q0(f2);
                return;
            } else if (i2 != -1) {
                oyVar.O0(i2);
                return;
            } else if (i3 != -1) {
                oyVar.P0(i3);
                return;
            } else {
                return;
            }
        }
        int i4 = bVar.d0;
        int i5 = bVar.e0;
        int i6 = bVar.f0;
        int i7 = bVar.g0;
        int i8 = bVar.h0;
        int i9 = bVar.i0;
        float f3 = bVar.j0;
        int i10 = bVar.m;
        if (i10 != -1) {
            mf mfVar6 = (mf) sparseArray.get(i10);
            if (mfVar6 != null) {
                mfVar.k(mfVar6, bVar.o, bVar.n);
            }
        } else {
            if (i4 != -1) {
                mf mfVar7 = (mf) sparseArray.get(i4);
                if (mfVar7 != null) {
                    kf.b bVar2 = kf.b.LEFT;
                    f = f3;
                    mfVar.T(bVar2, mfVar7, bVar2, ((ViewGroup.MarginLayoutParams) bVar).leftMargin, i8);
                } else {
                    f = f3;
                }
            } else {
                f = f3;
                if (i5 != -1 && (mfVar2 = (mf) sparseArray.get(i5)) != null) {
                    mfVar.T(kf.b.LEFT, mfVar2, kf.b.RIGHT, ((ViewGroup.MarginLayoutParams) bVar).leftMargin, i8);
                }
            }
            if (i6 != -1) {
                mf mfVar8 = (mf) sparseArray.get(i6);
                if (mfVar8 != null) {
                    mfVar.T(kf.b.RIGHT, mfVar8, kf.b.LEFT, ((ViewGroup.MarginLayoutParams) bVar).rightMargin, i9);
                }
            } else if (i7 != -1 && (mfVar3 = (mf) sparseArray.get(i7)) != null) {
                kf.b bVar3 = kf.b.RIGHT;
                mfVar.T(bVar3, mfVar3, bVar3, ((ViewGroup.MarginLayoutParams) bVar).rightMargin, i9);
            }
            int i11 = bVar.h;
            if (i11 != -1) {
                mf mfVar9 = (mf) sparseArray.get(i11);
                if (mfVar9 != null) {
                    kf.b bVar4 = kf.b.TOP;
                    mfVar.T(bVar4, mfVar9, bVar4, ((ViewGroup.MarginLayoutParams) bVar).topMargin, bVar.u);
                }
            } else {
                int i12 = bVar.i;
                if (i12 != -1 && (mfVar4 = (mf) sparseArray.get(i12)) != null) {
                    mfVar.T(kf.b.TOP, mfVar4, kf.b.BOTTOM, ((ViewGroup.MarginLayoutParams) bVar).topMargin, bVar.u);
                }
            }
            int i13 = bVar.j;
            if (i13 != -1) {
                mf mfVar10 = (mf) sparseArray.get(i13);
                if (mfVar10 != null) {
                    mfVar.T(kf.b.BOTTOM, mfVar10, kf.b.TOP, ((ViewGroup.MarginLayoutParams) bVar).bottomMargin, bVar.w);
                }
            } else {
                int i14 = bVar.k;
                if (i14 != -1 && (mfVar5 = (mf) sparseArray.get(i14)) != null) {
                    kf.b bVar5 = kf.b.BOTTOM;
                    mfVar.T(bVar5, mfVar5, bVar5, ((ViewGroup.MarginLayoutParams) bVar).bottomMargin, bVar.w);
                }
            }
            int i15 = bVar.l;
            if (i15 != -1) {
                View view2 = (View) this.a.get(i15);
                mf mfVar11 = (mf) sparseArray.get(bVar.l);
                if (mfVar11 != null && view2 != null && (view2.getLayoutParams() instanceof b)) {
                    b bVar6 = (b) view2.getLayoutParams();
                    bVar.Y = true;
                    bVar6.Y = true;
                    kf.b bVar7 = kf.b.BASELINE;
                    mfVar.m(bVar7).b(mfVar11.m(bVar7), 0, -1, true);
                    mfVar.g0(true);
                    bVar6.n0.g0(true);
                    mfVar.m(kf.b.TOP).l();
                    mfVar.m(kf.b.BOTTOM).l();
                }
            }
            float f4 = f;
            if (f4 >= 0.0f) {
                mfVar.i0(f4);
            }
            float f5 = bVar.A;
            if (f5 >= 0.0f) {
                mfVar.x0(f5);
            }
        }
        if (z && ((i = bVar.Q) != -1 || bVar.R != -1)) {
            mfVar.v0(i, bVar.R);
        }
        if (bVar.W) {
            mfVar.l0(mf.b.FIXED);
            mfVar.E0(((ViewGroup.MarginLayoutParams) bVar).width);
            if (((ViewGroup.MarginLayoutParams) bVar).width == -2) {
                mfVar.l0(mf.b.WRAP_CONTENT);
            }
        } else if (((ViewGroup.MarginLayoutParams) bVar).width == -1) {
            if (bVar.T) {
                mfVar.l0(mf.b.MATCH_CONSTRAINT);
            } else {
                mfVar.l0(mf.b.MATCH_PARENT);
            }
            mfVar.m(kf.b.LEFT).e = ((ViewGroup.MarginLayoutParams) bVar).leftMargin;
            mfVar.m(kf.b.RIGHT).e = ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
        } else {
            mfVar.l0(mf.b.MATCH_CONSTRAINT);
            mfVar.E0(0);
        }
        if (bVar.X) {
            mfVar.A0(mf.b.FIXED);
            mfVar.h0(((ViewGroup.MarginLayoutParams) bVar).height);
            if (((ViewGroup.MarginLayoutParams) bVar).height == -2) {
                mfVar.A0(mf.b.WRAP_CONTENT);
            }
        } else if (((ViewGroup.MarginLayoutParams) bVar).height == -1) {
            if (bVar.U) {
                mfVar.A0(mf.b.MATCH_CONSTRAINT);
            } else {
                mfVar.A0(mf.b.MATCH_PARENT);
            }
            mfVar.m(kf.b.TOP).e = ((ViewGroup.MarginLayoutParams) bVar).topMargin;
            mfVar.m(kf.b.BOTTOM).e = ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
        } else {
            mfVar.A0(mf.b.MATCH_CONSTRAINT);
            mfVar.h0(0);
        }
        mfVar.e0(bVar.B);
        mfVar.n0(bVar.E);
        mfVar.C0(bVar.F);
        mfVar.j0(bVar.G);
        mfVar.y0(bVar.H);
        mfVar.m0(bVar.I, bVar.K, bVar.M, bVar.O);
        mfVar.B0(bVar.J, bVar.L, bVar.N, bVar.P);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof b;
    }

    @Override // android.view.ViewGroup
    /* renamed from: d */
    public b generateDefaultLayoutParams() {
        return new b(-2, -2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList arrayList = this.b;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
                ((androidx.constraintlayout.widget.c) this.b.get(i)).k(this);
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            int childCount = getChildCount();
            float width = getWidth();
            float height = getHeight();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i3 = (int) ((parseInt / 1080.0f) * width);
                        int i4 = (int) ((parseInt2 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f = i3;
                        float f2 = i4;
                        float f3 = i3 + ((int) ((parseInt3 / 1080.0f) * width));
                        canvas.drawLine(f, f2, f3, f2, paint);
                        float parseInt4 = i4 + ((int) ((Integer.parseInt(split[3]) / 1920.0f) * height));
                        canvas.drawLine(f3, f2, f3, parseInt4, paint);
                        canvas.drawLine(f3, parseInt4, f, parseInt4, paint);
                        canvas.drawLine(f, parseInt4, f, f2, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f, f2, f3, parseInt4, paint);
                        canvas.drawLine(f, parseInt4, f3, f2, paint);
                    }
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    /* renamed from: e */
    public b generateLayoutParams(AttributeSet attributeSet) {
        return new b(getContext(), attributeSet);
    }

    public Object f(int i, Object obj) {
        if (i == 0 && (obj instanceof String)) {
            String str = (String) obj;
            HashMap hashMap = this.m;
            if (hashMap == null || !hashMap.containsKey(str)) {
                return null;
            }
            return this.m.get(str);
        }
        return null;
    }

    @Override // android.view.View
    public void forceLayout() {
        l();
        super.forceLayout();
    }

    public final mf g(int i) {
        if (i == 0) {
            return this.c;
        }
        View view = (View) this.a.get(i);
        if (view == null && (view = findViewById(i)) != null && view != this && view.getParent() == this) {
            onViewAdded(view);
        }
        if (view == this) {
            return this.c;
        }
        if (view == null) {
            return null;
        }
        return ((b) view.getLayoutParams()).n0;
    }

    public int getMaxHeight() {
        return this.g;
    }

    public int getMaxWidth() {
        return this.f;
    }

    public int getMinHeight() {
        return this.e;
    }

    public int getMinWidth() {
        return this.d;
    }

    public int getOptimizationLevel() {
        return this.c.V0();
    }

    public View h(int i) {
        return (View) this.a.get(i);
    }

    public final mf i(View view) {
        if (view == this) {
            return this.c;
        }
        if (view == null) {
            return null;
        }
        return ((b) view.getLayoutParams()).n0;
    }

    public final void j(AttributeSet attributeSet, int i, int i2) {
        this.c.c0(this);
        this.c.f1(this.u);
        this.a.put(getId(), this);
        this.j = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, jn0.a1, i, i2);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = obtainStyledAttributes.getIndex(i3);
                if (index == jn0.k1) {
                    this.d = obtainStyledAttributes.getDimensionPixelOffset(index, this.d);
                } else if (index == jn0.l1) {
                    this.e = obtainStyledAttributes.getDimensionPixelOffset(index, this.e);
                } else if (index == jn0.i1) {
                    this.f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f);
                } else if (index == jn0.j1) {
                    this.g = obtainStyledAttributes.getDimensionPixelOffset(index, this.g);
                } else if (index == jn0.L2) {
                    this.i = obtainStyledAttributes.getInt(index, this.i);
                } else if (index == jn0.M1) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            m(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.k = null;
                        }
                    }
                } else if (index == jn0.s1) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        d dVar = new d();
                        this.j = dVar;
                        dVar.k(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.j = null;
                    }
                    this.l = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.c.g1(this.i);
    }

    public boolean k() {
        return (getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == getLayoutDirection();
    }

    public final void l() {
        this.h = true;
        this.n = -1;
        this.o = -1;
        this.p = -1;
        this.q = -1;
        this.r = 0;
        this.s = 0;
    }

    public void m(int i) {
        this.k = new lf(getContext(), this, i);
    }

    public void n(int i, int i2, int i3, int i4, boolean z, boolean z2) {
        c cVar = this.u;
        int i5 = cVar.e;
        int resolveSizeAndState = View.resolveSizeAndState(i3 + cVar.d, i, 0);
        int min = Math.min(this.f, resolveSizeAndState & 16777215);
        int min2 = Math.min(this.g, View.resolveSizeAndState(i4 + i5, i2, 0) & 16777215);
        if (z) {
            min |= 16777216;
        }
        if (z2) {
            min2 |= 16777216;
        }
        setMeasuredDimension(min, min2);
        this.n = min;
        this.o = min2;
    }

    public void o(nf nfVar, int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        int max = Math.max(0, getPaddingTop());
        int max2 = Math.max(0, getPaddingBottom());
        int i4 = max + max2;
        int paddingWidth = getPaddingWidth();
        this.u.c(i2, i3, max, max2, paddingWidth, i4);
        int max3 = Math.max(0, getPaddingStart());
        int max4 = Math.max(0, getPaddingEnd());
        int max5 = (max3 > 0 || max4 > 0) ? k() ? max4 : max3 : Math.max(0, getPaddingLeft());
        int i5 = size - paddingWidth;
        int i6 = size2 - i4;
        r(nfVar, mode, i5, mode2, i6);
        nfVar.c1(i, mode, i5, mode2, i6, this.n, this.o, max5, max);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            b bVar = (b) childAt.getLayoutParams();
            mf mfVar = bVar.n0;
            if ((childAt.getVisibility() != 8 || bVar.Z || bVar.a0 || bVar.c0 || isInEditMode) && !bVar.b0) {
                int Q = mfVar.Q();
                int R = mfVar.R();
                childAt.layout(Q, R, mfVar.P() + Q, mfVar.v() + R);
            }
        }
        int size = this.b.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                ((androidx.constraintlayout.widget.c) this.b.get(i6)).i(this);
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        this.v = i;
        this.w = i2;
        this.c.h1(k());
        if (this.h) {
            this.h = false;
            if (s()) {
                this.c.j1();
            }
        }
        o(this.c, this.i, i, i2);
        n(i, i2, this.c.P(), this.c.v(), this.c.b1(), this.c.Z0());
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        mf i = i(view);
        if ((view instanceof e) && !(i instanceof oy)) {
            b bVar = (b) view.getLayoutParams();
            oy oyVar = new oy();
            bVar.n0 = oyVar;
            bVar.Z = true;
            oyVar.R0(bVar.S);
        }
        if (view instanceof androidx.constraintlayout.widget.c) {
            androidx.constraintlayout.widget.c cVar = (androidx.constraintlayout.widget.c) view;
            cVar.m();
            ((b) view.getLayoutParams()).a0 = true;
            if (!this.b.contains(cVar)) {
                this.b.add(cVar);
            }
        }
        this.a.put(view.getId(), view);
        this.h = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.a.remove(view.getId());
        this.c.L0(i(view));
        this.b.remove(view);
        this.h = true;
    }

    public final void p() {
        boolean isInEditMode = isInEditMode();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            mf i2 = i(getChildAt(i));
            if (i2 != null) {
                i2.Y();
            }
        }
        if (isInEditMode) {
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                try {
                    String resourceName = getResources().getResourceName(childAt.getId());
                    q(0, resourceName, Integer.valueOf(childAt.getId()));
                    int indexOf = resourceName.indexOf(47);
                    if (indexOf != -1) {
                        resourceName = resourceName.substring(indexOf + 1);
                    }
                    g(childAt.getId()).d0(resourceName);
                } catch (Resources.NotFoundException unused) {
                }
            }
        }
        if (this.l != -1) {
            for (int i4 = 0; i4 < childCount; i4++) {
                getChildAt(i4).getId();
            }
        }
        d dVar = this.j;
        if (dVar != null) {
            dVar.d(this, true);
        }
        this.c.M0();
        int size = this.b.size();
        if (size > 0) {
            for (int i5 = 0; i5 < size; i5++) {
                ((androidx.constraintlayout.widget.c) this.b.get(i5)).l(this);
            }
        }
        for (int i6 = 0; i6 < childCount; i6++) {
            getChildAt(i6);
        }
        this.t.clear();
        this.t.put(0, this.c);
        this.t.put(getId(), this.c);
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt2 = getChildAt(i7);
            this.t.put(childAt2.getId(), i(childAt2));
        }
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt3 = getChildAt(i8);
            mf i9 = i(childAt3);
            if (i9 != null) {
                b bVar = (b) childAt3.getLayoutParams();
                this.c.a(i9);
                c(isInEditMode, childAt3, i9, bVar, this.t);
            }
        }
    }

    public void q(int i, Object obj, Object obj2) {
        if (i == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.m == null) {
                this.m = new HashMap();
            }
            String str = (String) obj;
            int indexOf = str.indexOf("/");
            if (indexOf != -1) {
                str = str.substring(indexOf + 1);
            }
            this.m.put(str, Integer.valueOf(((Integer) obj2).intValue()));
        }
    }

    public void r(nf nfVar, int i, int i2, int i3, int i4) {
        mf.b bVar;
        c cVar = this.u;
        int i5 = cVar.e;
        int i6 = cVar.d;
        mf.b bVar2 = mf.b.FIXED;
        int childCount = getChildCount();
        if (i == Integer.MIN_VALUE) {
            bVar = mf.b.WRAP_CONTENT;
            if (childCount == 0) {
                i2 = Math.max(0, this.d);
            }
        } else if (i == 0) {
            bVar = mf.b.WRAP_CONTENT;
            if (childCount == 0) {
                i2 = Math.max(0, this.d);
            }
            i2 = 0;
        } else if (i != 1073741824) {
            bVar = bVar2;
            i2 = 0;
        } else {
            i2 = Math.min(this.f - i6, i2);
            bVar = bVar2;
        }
        if (i3 == Integer.MIN_VALUE) {
            bVar2 = mf.b.WRAP_CONTENT;
            if (childCount == 0) {
                i4 = Math.max(0, this.e);
            }
        } else if (i3 != 0) {
            if (i3 == 1073741824) {
                i4 = Math.min(this.g - i5, i4);
            }
            i4 = 0;
        } else {
            bVar2 = mf.b.WRAP_CONTENT;
            if (childCount == 0) {
                i4 = Math.max(0, this.e);
            }
            i4 = 0;
        }
        if (i2 != nfVar.P() || i4 != nfVar.v()) {
            nfVar.Y0();
        }
        nfVar.F0(0);
        nfVar.G0(0);
        nfVar.s0(this.f - i6);
        nfVar.r0(this.g - i5);
        nfVar.u0(0);
        nfVar.t0(0);
        nfVar.l0(bVar);
        nfVar.E0(i2);
        nfVar.A0(bVar2);
        nfVar.h0(i4);
        nfVar.u0(this.d - i6);
        nfVar.t0(this.e - i5);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        super.removeView(view);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        l();
        super.requestLayout();
    }

    public final boolean s() {
        int childCount = getChildCount();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            } else if (getChildAt(i).isLayoutRequested()) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (z) {
            p();
        }
        return z;
    }

    public void setConstraintSet(d dVar) {
        this.j = dVar;
    }

    @Override // android.view.View
    public void setId(int i) {
        this.a.remove(getId());
        super.setId(i);
        this.a.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i == this.g) {
            return;
        }
        this.g = i;
        requestLayout();
    }

    public void setMaxWidth(int i) {
        if (i == this.f) {
            return;
        }
        this.f = i;
        requestLayout();
    }

    public void setMinHeight(int i) {
        if (i == this.e) {
            return;
        }
        this.e = i;
        requestLayout();
    }

    public void setMinWidth(int i) {
        if (i == this.d) {
            return;
        }
        this.d = i;
        requestLayout();
    }

    public void setOnConstraintsChanged(of ofVar) {
        lf lfVar = this.k;
        if (lfVar != null) {
            lfVar.c(ofVar);
        }
    }

    public void setOptimizationLevel(int i) {
        this.i = i;
        this.c.g1(i);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new b(layoutParams);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new SparseArray();
        this.b = new ArrayList(4);
        this.c = new nf();
        this.d = 0;
        this.e = 0;
        this.f = Integer.MAX_VALUE;
        this.g = Integer.MAX_VALUE;
        this.h = true;
        this.i = 263;
        this.j = null;
        this.k = null;
        this.l = -1;
        this.m = new HashMap();
        this.n = -1;
        this.o = -1;
        this.p = -1;
        this.q = -1;
        this.r = 0;
        this.s = 0;
        this.t = new SparseArray();
        this.u = new c(this);
        this.v = 0;
        this.w = 0;
        j(attributeSet, i, 0);
    }

    /* loaded from: classes.dex */
    public static class b extends ViewGroup.MarginLayoutParams {
        public float A;
        public String B;
        public float C;
        public int D;
        public float E;
        public float F;
        public int G;
        public int H;
        public int I;
        public int J;
        public int K;
        public int L;
        public int M;
        public int N;
        public float O;
        public float P;
        public int Q;
        public int R;
        public int S;
        public boolean T;
        public boolean U;
        public String V;
        public boolean W;
        public boolean X;
        public boolean Y;
        public boolean Z;
        public int a;
        public boolean a0;
        public int b;
        public boolean b0;
        public float c;
        public boolean c0;
        public int d;
        public int d0;
        public int e;
        public int e0;
        public int f;
        public int f0;
        public int g;
        public int g0;
        public int h;
        public int h0;
        public int i;
        public int i0;
        public int j;
        public float j0;
        public int k;
        public int k0;
        public int l;
        public int l0;
        public int m;
        public float m0;
        public int n;
        public mf n0;
        public float o;
        public boolean o0;
        public int p;
        public int q;
        public int r;
        public int s;
        public int t;
        public int u;
        public int v;
        public int w;
        public int x;
        public int y;
        public float z;

        /* loaded from: classes.dex */
        public static class a {
            public static final SparseIntArray a;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                a = sparseIntArray;
                sparseIntArray.append(jn0.l2, 8);
                sparseIntArray.append(jn0.m2, 9);
                sparseIntArray.append(jn0.o2, 10);
                sparseIntArray.append(jn0.p2, 11);
                sparseIntArray.append(jn0.v2, 12);
                sparseIntArray.append(jn0.u2, 13);
                sparseIntArray.append(jn0.T1, 14);
                sparseIntArray.append(jn0.S1, 15);
                sparseIntArray.append(jn0.Q1, 16);
                sparseIntArray.append(jn0.U1, 2);
                sparseIntArray.append(jn0.W1, 3);
                sparseIntArray.append(jn0.V1, 4);
                sparseIntArray.append(jn0.D2, 49);
                sparseIntArray.append(jn0.E2, 50);
                sparseIntArray.append(jn0.a2, 5);
                sparseIntArray.append(jn0.b2, 6);
                sparseIntArray.append(jn0.c2, 7);
                sparseIntArray.append(jn0.b1, 1);
                sparseIntArray.append(jn0.q2, 17);
                sparseIntArray.append(jn0.r2, 18);
                sparseIntArray.append(jn0.Z1, 19);
                sparseIntArray.append(jn0.Y1, 20);
                sparseIntArray.append(jn0.H2, 21);
                sparseIntArray.append(jn0.K2, 22);
                sparseIntArray.append(jn0.I2, 23);
                sparseIntArray.append(jn0.F2, 24);
                sparseIntArray.append(jn0.J2, 25);
                sparseIntArray.append(jn0.G2, 26);
                sparseIntArray.append(jn0.h2, 29);
                sparseIntArray.append(jn0.w2, 30);
                sparseIntArray.append(jn0.X1, 44);
                sparseIntArray.append(jn0.j2, 45);
                sparseIntArray.append(jn0.y2, 46);
                sparseIntArray.append(jn0.i2, 47);
                sparseIntArray.append(jn0.x2, 48);
                sparseIntArray.append(jn0.O1, 27);
                sparseIntArray.append(jn0.N1, 28);
                sparseIntArray.append(jn0.z2, 31);
                sparseIntArray.append(jn0.d2, 32);
                sparseIntArray.append(jn0.B2, 33);
                sparseIntArray.append(jn0.A2, 34);
                sparseIntArray.append(jn0.C2, 35);
                sparseIntArray.append(jn0.f2, 36);
                sparseIntArray.append(jn0.e2, 37);
                sparseIntArray.append(jn0.g2, 38);
                sparseIntArray.append(jn0.k2, 39);
                sparseIntArray.append(jn0.t2, 40);
                sparseIntArray.append(jn0.n2, 41);
                sparseIntArray.append(jn0.R1, 42);
                sparseIntArray.append(jn0.P1, 43);
                sparseIntArray.append(jn0.s2, 51);
            }
        }

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            int i;
            this.a = -1;
            this.b = -1;
            this.c = -1.0f;
            this.d = -1;
            this.e = -1;
            this.f = -1;
            this.g = -1;
            this.h = -1;
            this.i = -1;
            this.j = -1;
            this.k = -1;
            this.l = -1;
            this.m = -1;
            this.n = 0;
            this.o = 0.0f;
            this.p = -1;
            this.q = -1;
            this.r = -1;
            this.s = -1;
            this.t = -1;
            this.u = -1;
            this.v = -1;
            this.w = -1;
            this.x = -1;
            this.y = -1;
            this.z = 0.5f;
            this.A = 0.5f;
            this.B = null;
            this.C = 0.0f;
            this.D = 1;
            this.E = -1.0f;
            this.F = -1.0f;
            this.G = 0;
            this.H = 0;
            this.I = 0;
            this.J = 0;
            this.K = 0;
            this.L = 0;
            this.M = 0;
            this.N = 0;
            this.O = 1.0f;
            this.P = 1.0f;
            this.Q = -1;
            this.R = -1;
            this.S = -1;
            this.T = false;
            this.U = false;
            this.V = null;
            this.W = true;
            this.X = true;
            this.Y = false;
            this.Z = false;
            this.a0 = false;
            this.b0 = false;
            this.c0 = false;
            this.d0 = -1;
            this.e0 = -1;
            this.f0 = -1;
            this.g0 = -1;
            this.h0 = -1;
            this.i0 = -1;
            this.j0 = 0.5f;
            this.n0 = new mf();
            this.o0 = false;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, jn0.a1);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                int i3 = a.a.get(index);
                switch (i3) {
                    case 1:
                        this.S = obtainStyledAttributes.getInt(index, this.S);
                        break;
                    case 2:
                        int resourceId = obtainStyledAttributes.getResourceId(index, this.m);
                        this.m = resourceId;
                        if (resourceId == -1) {
                            this.m = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case t02.c.c /* 3 */:
                        this.n = obtainStyledAttributes.getDimensionPixelSize(index, this.n);
                        break;
                    case 4:
                        float f = obtainStyledAttributes.getFloat(index, this.o) % 360.0f;
                        this.o = f;
                        if (f < 0.0f) {
                            this.o = (360.0f - f) % 360.0f;
                            break;
                        } else {
                            break;
                        }
                    case t02.c.e /* 5 */:
                        this.a = obtainStyledAttributes.getDimensionPixelOffset(index, this.a);
                        break;
                    case t02.c.f /* 6 */:
                        this.b = obtainStyledAttributes.getDimensionPixelOffset(index, this.b);
                        break;
                    case t02.c.g /* 7 */:
                        this.c = obtainStyledAttributes.getFloat(index, this.c);
                        break;
                    case PackageParser.PARSE_IGNORE_PROCESSES /* 8 */:
                        int resourceId2 = obtainStyledAttributes.getResourceId(index, this.d);
                        this.d = resourceId2;
                        if (resourceId2 == -1) {
                            this.d = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        int resourceId3 = obtainStyledAttributes.getResourceId(index, this.e);
                        this.e = resourceId3;
                        if (resourceId3 == -1) {
                            this.e = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        int resourceId4 = obtainStyledAttributes.getResourceId(index, this.f);
                        this.f = resourceId4;
                        if (resourceId4 == -1) {
                            this.f = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        int resourceId5 = obtainStyledAttributes.getResourceId(index, this.g);
                        this.g = resourceId5;
                        if (resourceId5 == -1) {
                            this.g = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        int resourceId6 = obtainStyledAttributes.getResourceId(index, this.h);
                        this.h = resourceId6;
                        if (resourceId6 == -1) {
                            this.h = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        int resourceId7 = obtainStyledAttributes.getResourceId(index, this.i);
                        this.i = resourceId7;
                        if (resourceId7 == -1) {
                            this.i = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        int resourceId8 = obtainStyledAttributes.getResourceId(index, this.j);
                        this.j = resourceId8;
                        if (resourceId8 == -1) {
                            this.j = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        int resourceId9 = obtainStyledAttributes.getResourceId(index, this.k);
                        this.k = resourceId9;
                        if (resourceId9 == -1) {
                            this.k = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case PackageParser.PARSE_FORWARD_LOCK /* 16 */:
                        int resourceId10 = obtainStyledAttributes.getResourceId(index, this.l);
                        this.l = resourceId10;
                        if (resourceId10 == -1) {
                            this.l = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        int resourceId11 = obtainStyledAttributes.getResourceId(index, this.p);
                        this.p = resourceId11;
                        if (resourceId11 == -1) {
                            this.p = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        int resourceId12 = obtainStyledAttributes.getResourceId(index, this.q);
                        this.q = resourceId12;
                        if (resourceId12 == -1) {
                            this.q = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 19:
                        int resourceId13 = obtainStyledAttributes.getResourceId(index, this.r);
                        this.r = resourceId13;
                        if (resourceId13 == -1) {
                            this.r = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 20:
                        int resourceId14 = obtainStyledAttributes.getResourceId(index, this.s);
                        this.s = resourceId14;
                        if (resourceId14 == -1) {
                            this.s = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 21:
                        this.t = obtainStyledAttributes.getDimensionPixelSize(index, this.t);
                        break;
                    case 22:
                        this.u = obtainStyledAttributes.getDimensionPixelSize(index, this.u);
                        break;
                    case 23:
                        this.v = obtainStyledAttributes.getDimensionPixelSize(index, this.v);
                        break;
                    case 24:
                        this.w = obtainStyledAttributes.getDimensionPixelSize(index, this.w);
                        break;
                    case 25:
                        this.x = obtainStyledAttributes.getDimensionPixelSize(index, this.x);
                        break;
                    case 26:
                        this.y = obtainStyledAttributes.getDimensionPixelSize(index, this.y);
                        break;
                    case 27:
                        this.T = obtainStyledAttributes.getBoolean(index, this.T);
                        break;
                    case 28:
                        this.U = obtainStyledAttributes.getBoolean(index, this.U);
                        break;
                    case 29:
                        this.z = obtainStyledAttributes.getFloat(index, this.z);
                        break;
                    case 30:
                        this.A = obtainStyledAttributes.getFloat(index, this.A);
                        break;
                    case 31:
                        this.I = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case PackageParser.PARSE_EXTERNAL_STORAGE /* 32 */:
                        this.J = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 33:
                        try {
                            this.K = obtainStyledAttributes.getDimensionPixelSize(index, this.K);
                            break;
                        } catch (Exception unused) {
                            if (obtainStyledAttributes.getInt(index, this.K) == -2) {
                                this.K = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 34:
                        try {
                            this.M = obtainStyledAttributes.getDimensionPixelSize(index, this.M);
                            break;
                        } catch (Exception unused2) {
                            if (obtainStyledAttributes.getInt(index, this.M) == -2) {
                                this.M = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 35:
                        this.O = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.O));
                        this.I = 2;
                        break;
                    case 36:
                        try {
                            this.L = obtainStyledAttributes.getDimensionPixelSize(index, this.L);
                            break;
                        } catch (Exception unused3) {
                            if (obtainStyledAttributes.getInt(index, this.L) == -2) {
                                this.L = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 37:
                        try {
                            this.N = obtainStyledAttributes.getDimensionPixelSize(index, this.N);
                            break;
                        } catch (Exception unused4) {
                            if (obtainStyledAttributes.getInt(index, this.N) == -2) {
                                this.N = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 38:
                        this.P = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.P));
                        this.J = 2;
                        break;
                    default:
                        switch (i3) {
                            case 44:
                                String string = obtainStyledAttributes.getString(index);
                                this.B = string;
                                this.C = Float.NaN;
                                this.D = -1;
                                if (string != null) {
                                    int length = string.length();
                                    int indexOf = this.B.indexOf(44);
                                    if (indexOf <= 0 || indexOf >= length - 1) {
                                        i = 0;
                                    } else {
                                        String substring = this.B.substring(0, indexOf);
                                        if (substring.equalsIgnoreCase("W")) {
                                            this.D = 0;
                                        } else if (substring.equalsIgnoreCase("H")) {
                                            this.D = 1;
                                        }
                                        i = indexOf + 1;
                                    }
                                    int indexOf2 = this.B.indexOf(58);
                                    if (indexOf2 >= 0 && indexOf2 < length - 1) {
                                        String substring2 = this.B.substring(i, indexOf2);
                                        String substring3 = this.B.substring(indexOf2 + 1);
                                        if (substring2.length() > 0 && substring3.length() > 0) {
                                            try {
                                                float parseFloat = Float.parseFloat(substring2);
                                                float parseFloat2 = Float.parseFloat(substring3);
                                                if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                                                    if (this.D == 1) {
                                                        this.C = Math.abs(parseFloat2 / parseFloat);
                                                        break;
                                                    } else {
                                                        this.C = Math.abs(parseFloat / parseFloat2);
                                                        break;
                                                    }
                                                }
                                            } catch (NumberFormatException unused5) {
                                                break;
                                            }
                                        }
                                    } else {
                                        String substring4 = this.B.substring(i);
                                        if (substring4.length() > 0) {
                                            this.C = Float.parseFloat(substring4);
                                            break;
                                        } else {
                                            break;
                                        }
                                    }
                                } else {
                                    continue;
                                }
                                break;
                            case 45:
                                this.E = obtainStyledAttributes.getFloat(index, this.E);
                                continue;
                            case 46:
                                this.F = obtainStyledAttributes.getFloat(index, this.F);
                                continue;
                            case 47:
                                this.G = obtainStyledAttributes.getInt(index, 0);
                                continue;
                            case 48:
                                this.H = obtainStyledAttributes.getInt(index, 0);
                                continue;
                            case 49:
                                this.Q = obtainStyledAttributes.getDimensionPixelOffset(index, this.Q);
                                continue;
                            case 50:
                                this.R = obtainStyledAttributes.getDimensionPixelOffset(index, this.R);
                                continue;
                            case 51:
                                this.V = obtainStyledAttributes.getString(index);
                                continue;
                        }
                }
            }
            obtainStyledAttributes.recycle();
            a();
        }

        public void a() {
            this.Z = false;
            this.W = true;
            this.X = true;
            int i = ((ViewGroup.MarginLayoutParams) this).width;
            if (i == -2 && this.T) {
                this.W = false;
                if (this.I == 0) {
                    this.I = 1;
                }
            }
            int i2 = ((ViewGroup.MarginLayoutParams) this).height;
            if (i2 == -2 && this.U) {
                this.X = false;
                if (this.J == 0) {
                    this.J = 1;
                }
            }
            if (i == 0 || i == -1) {
                this.W = false;
                if (i == 0 && this.I == 1) {
                    ((ViewGroup.MarginLayoutParams) this).width = -2;
                    this.T = true;
                }
            }
            if (i2 == 0 || i2 == -1) {
                this.X = false;
                if (i2 == 0 && this.J == 1) {
                    ((ViewGroup.MarginLayoutParams) this).height = -2;
                    this.U = true;
                }
            }
            if (this.c == -1.0f && this.a == -1 && this.b == -1) {
                return;
            }
            this.Z = true;
            this.W = true;
            this.X = true;
            if (!(this.n0 instanceof oy)) {
                this.n0 = new oy();
            }
            ((oy) this.n0).R0(this.S);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0048  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0056  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x005c  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0062  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0074  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x007c  */
        @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void resolveLayoutDirection(int r10) {
            /*
                Method dump skipped, instructions count: 253
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.b.resolveLayoutDirection(int):void");
        }

        public b(int i, int i2) {
            super(i, i2);
            this.a = -1;
            this.b = -1;
            this.c = -1.0f;
            this.d = -1;
            this.e = -1;
            this.f = -1;
            this.g = -1;
            this.h = -1;
            this.i = -1;
            this.j = -1;
            this.k = -1;
            this.l = -1;
            this.m = -1;
            this.n = 0;
            this.o = 0.0f;
            this.p = -1;
            this.q = -1;
            this.r = -1;
            this.s = -1;
            this.t = -1;
            this.u = -1;
            this.v = -1;
            this.w = -1;
            this.x = -1;
            this.y = -1;
            this.z = 0.5f;
            this.A = 0.5f;
            this.B = null;
            this.C = 0.0f;
            this.D = 1;
            this.E = -1.0f;
            this.F = -1.0f;
            this.G = 0;
            this.H = 0;
            this.I = 0;
            this.J = 0;
            this.K = 0;
            this.L = 0;
            this.M = 0;
            this.N = 0;
            this.O = 1.0f;
            this.P = 1.0f;
            this.Q = -1;
            this.R = -1;
            this.S = -1;
            this.T = false;
            this.U = false;
            this.V = null;
            this.W = true;
            this.X = true;
            this.Y = false;
            this.Z = false;
            this.a0 = false;
            this.b0 = false;
            this.c0 = false;
            this.d0 = -1;
            this.e0 = -1;
            this.f0 = -1;
            this.g0 = -1;
            this.h0 = -1;
            this.i0 = -1;
            this.j0 = 0.5f;
            this.n0 = new mf();
            this.o0 = false;
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.a = -1;
            this.b = -1;
            this.c = -1.0f;
            this.d = -1;
            this.e = -1;
            this.f = -1;
            this.g = -1;
            this.h = -1;
            this.i = -1;
            this.j = -1;
            this.k = -1;
            this.l = -1;
            this.m = -1;
            this.n = 0;
            this.o = 0.0f;
            this.p = -1;
            this.q = -1;
            this.r = -1;
            this.s = -1;
            this.t = -1;
            this.u = -1;
            this.v = -1;
            this.w = -1;
            this.x = -1;
            this.y = -1;
            this.z = 0.5f;
            this.A = 0.5f;
            this.B = null;
            this.C = 0.0f;
            this.D = 1;
            this.E = -1.0f;
            this.F = -1.0f;
            this.G = 0;
            this.H = 0;
            this.I = 0;
            this.J = 0;
            this.K = 0;
            this.L = 0;
            this.M = 0;
            this.N = 0;
            this.O = 1.0f;
            this.P = 1.0f;
            this.Q = -1;
            this.R = -1;
            this.S = -1;
            this.T = false;
            this.U = false;
            this.V = null;
            this.W = true;
            this.X = true;
            this.Y = false;
            this.Z = false;
            this.a0 = false;
            this.b0 = false;
            this.c0 = false;
            this.d0 = -1;
            this.e0 = -1;
            this.f0 = -1;
            this.g0 = -1;
            this.h0 = -1;
            this.i0 = -1;
            this.j0 = 0.5f;
            this.n0 = new mf();
            this.o0 = false;
        }
    }
}
