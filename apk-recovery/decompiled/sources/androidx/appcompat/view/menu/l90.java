package androidx.appcompat.view.menu;

import android.widget.ListView;
/* loaded from: classes.dex */
public class l90 extends k5 {
    public final ListView s;

    public l90(ListView listView) {
        super(listView);
        this.s = listView;
    }

    @Override // androidx.appcompat.view.menu.k5
    public boolean a(int i) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.k5
    public boolean b(int i) {
        ListView listView = this.s;
        int count = listView.getCount();
        if (count == 0) {
            return false;
        }
        int childCount = listView.getChildCount();
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        int i2 = firstVisiblePosition + childCount;
        if (i > 0) {
            if (i2 >= count && listView.getChildAt(childCount - 1).getBottom() <= listView.getHeight()) {
                return false;
            }
        } else if (i >= 0) {
            return false;
        } else {
            if (firstVisiblePosition <= 0 && listView.getChildAt(0).getTop() >= 0) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.k5
    public void j(int i, int i2) {
        this.s.scrollListBy(i2);
    }
}
