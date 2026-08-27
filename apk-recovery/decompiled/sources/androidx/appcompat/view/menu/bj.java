package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Calendar;
import java.util.Locale;
/* loaded from: classes.dex */
public class bj extends BaseAdapter {
    public static final int d = 4;
    public final Calendar a;
    public final int b;
    public final int c;

    public bj() {
        Calendar i = t41.i();
        this.a = i;
        this.b = i.getMaximum(7);
        this.c = i.getFirstDayOfWeek();
    }

    @Override // android.widget.Adapter
    /* renamed from: a */
    public Integer getItem(int i) {
        if (i >= this.b) {
            return null;
        }
        return Integer.valueOf(b(i));
    }

    public final int b(int i) {
        int i2 = i + this.c;
        int i3 = this.b;
        return i2 > i3 ? i2 - i3 : i2;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.b;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(ym0.k, viewGroup, false);
        }
        this.a.set(7, b(i));
        textView.setText(this.a.getDisplayName(7, d, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(dn0.i), this.a.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }

    public bj(int i) {
        Calendar i2 = t41.i();
        this.a = i2;
        this.b = i2.getMaximum(7);
        this.c = i;
    }
}
