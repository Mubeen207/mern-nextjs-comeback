package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
/* loaded from: classes.dex */
public abstract class uc0 implements hu0, xc0, AdapterView.OnItemClickListener {
    public Rect a;

    public static int o(ListAdapter listAdapter, ViewGroup viewGroup, Context context, int i) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        int i2 = 0;
        int i3 = 0;
        View view = null;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = listAdapter.getItemViewType(i4);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            if (viewGroup == null) {
                viewGroup = new FrameLayout(context);
            }
            view = listAdapter.getView(i4, view, viewGroup);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i) {
                return i;
            }
            if (measuredWidth > i2) {
                i2 = measuredWidth;
            }
        }
        return i2;
    }

    public static boolean x(pc0 pc0Var) {
        int size = pc0Var.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = pc0Var.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    public static oc0 y(ListAdapter listAdapter) {
        return listAdapter instanceof HeaderViewListAdapter ? (oc0) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (oc0) listAdapter;
    }

    @Override // androidx.appcompat.view.menu.xc0
    public void c(Context context, pc0 pc0Var) {
    }

    @Override // androidx.appcompat.view.menu.xc0
    public boolean h(pc0 pc0Var, tc0 tc0Var) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.xc0
    public boolean j(pc0 pc0Var, tc0 tc0Var) {
        return false;
    }

    public abstract void l(pc0 pc0Var);

    public boolean m() {
        return true;
    }

    public Rect n() {
        return this.a;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        y(listAdapter).a.J((MenuItem) listAdapter.getItem(i), this, m() ? 0 : 4);
    }

    public abstract void p(View view);

    public void q(Rect rect) {
        this.a = rect;
    }

    public abstract void r(boolean z);

    public abstract void s(int i);

    public abstract void t(int i);

    public abstract void u(PopupWindow.OnDismissListener onDismissListener);

    public abstract void v(boolean z);

    public abstract void w(int i);
}
