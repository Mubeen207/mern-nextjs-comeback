package androidx.appcompat.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ListView;
import androidx.appcompat.view.menu.pn0;
/* loaded from: classes.dex */
public class AlertController$RecycleListView extends ListView {
    public final int a;
    public final int b;

    public AlertController$RecycleListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, pn0.x1);
        this.b = obtainStyledAttributes.getDimensionPixelOffset(pn0.y1, -1);
        this.a = obtainStyledAttributes.getDimensionPixelOffset(pn0.z1, -1);
    }
}
