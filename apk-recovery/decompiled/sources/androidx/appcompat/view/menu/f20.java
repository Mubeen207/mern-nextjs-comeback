package androidx.appcompat.view.menu;

import java.io.Closeable;
import java.io.IOException;
/* loaded from: classes.dex */
public abstract class f20 {
    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }
}
