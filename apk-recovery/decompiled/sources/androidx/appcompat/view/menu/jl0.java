package androidx.appcompat.view.menu;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
/* loaded from: classes.dex */
public abstract class jl0 {
    public static Bundle a(String str, Context context, String str2, String str3, Bundle bundle, int i) {
        return eg.c(context, Uri.parse("content://" + str), str2, str3, bundle, i);
    }

    public static Bundle b(String str, String str2, String str3, Bundle bundle) {
        try {
            return a(str, bv0.m(), str2, str3, bundle, 5);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            return null;
        }
    }
}
