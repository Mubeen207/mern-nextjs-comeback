package androidx.appcompat.view.menu;

import android.view.View;
/* loaded from: classes.dex */
public abstract class dj {
    public static String a(View view) {
        try {
            return view.getContext().getResources().getResourceEntryName(view.getId());
        } catch (Exception unused) {
            return "UNKNOWN";
        }
    }
}
