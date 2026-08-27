package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import com.snake.helper.FileProvider;
import java.io.File;
/* loaded from: classes.dex */
public abstract class or {
    public static File a(Context context, Uri uri) {
        for (ProviderInfo providerInfo : mv0.M2()) {
            try {
                File d = FileProvider.d(context, providerInfo.authority, uri);
                if (d != null && d.exists()) {
                    return d;
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public static Uri b(Context context, Uri uri) {
        if (y8.c()) {
            File a = a(context, uri);
            if (a == null) {
                return null;
            }
            return bv0.l().g(a.getAbsolutePath());
        }
        return uri;
    }
}
