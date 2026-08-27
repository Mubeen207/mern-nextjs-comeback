package androidx.profileinstaller;

import android.content.Context;
import androidx.profileinstaller.ProfileInstallReceiver;
import java.io.File;
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: androidx.profileinstaller.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0049a {
        public static File a(Context context) {
            return context.createDeviceProtectedStorageContext().getCodeCacheDir();
        }
    }

    public static boolean a(File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return false;
        }
        boolean z = true;
        for (File file2 : listFiles) {
            z = a(file2) && z;
        }
        return z;
    }

    public static void b(Context context, ProfileInstallReceiver.a aVar) {
        if (a(C0049a.a(context))) {
            aVar.b(14, null);
        } else {
            aVar.b(15, null);
        }
    }
}
