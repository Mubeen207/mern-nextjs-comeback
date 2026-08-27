package androidx.appcompat.view.menu;

import android.content.ContentProviderClient;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
/* loaded from: classes.dex */
public abstract class eg {
    public static ContentProviderClient a(Context context, Uri uri) {
        try {
            return context.getContentResolver().acquireContentProviderClient(uri);
        } catch (SecurityException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static ContentProviderClient b(Context context, Uri uri, int i) {
        ContentProviderClient a = a(context, uri);
        if (a == null) {
            int i2 = 0;
            while (i2 < i && a == null) {
                SystemClock.sleep(100L);
                i2++;
                a = a(context, uri);
            }
        }
        return a;
    }

    public static Bundle c(Context context, Uri uri, String str, String str2, Bundle bundle, int i) {
        ContentProviderClient b = b(context, uri, i);
        try {
            try {
                if (b != null) {
                    return b.call(str, str2, bundle);
                }
                throw new IllegalAccessException();
            } catch (Exception unused) {
                throw new IllegalAccessException();
            }
        } finally {
            d(b);
        }
    }

    public static void d(ContentProviderClient contentProviderClient) {
        if (contentProviderClient != null) {
            try {
                contentProviderClient.close();
            } catch (Exception unused) {
            }
        }
    }
}
