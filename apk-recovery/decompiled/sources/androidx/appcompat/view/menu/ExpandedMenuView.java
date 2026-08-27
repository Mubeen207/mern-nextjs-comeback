package androidx.appcompat.view.menu;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.appcompat.view.menu.pc0;
/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements pc0.b, zc0, AdapterView.OnItemClickListener {
    public static final int[] c = {16842964, 16843049};
    public pc0 a;
    public int b;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842868);
    }

    @Override // androidx.appcompat.view.menu.pc0.b
    public boolean a(tc0 tc0Var) {
        return this.a.I(tc0Var, 0);
    }

    public int getWindowAnimations() {
        return this.b;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        a((tc0) getAdapter().getItem(i));
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        b11 t = b11.t(context, attributeSet, c, i, 0);
        if (t.q(0)) {
            setBackgroundDrawable(t.g(0));
        }
        if (t.q(1)) {
            setDivider(t.g(1));
        }
        t.v();
    }
}
