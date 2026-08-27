package androidx.appcompat.view.menu;

import java.io.Closeable;
import java.io.IOException;
/* loaded from: classes.dex */
public abstract class fc {
    public static void a(Closeable... closeableArr) {
        if (closeableArr == null) {
            return;
        }
        for (Closeable closeable : closeableArr) {
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (IOException unused) {
                }
            }
        }
    }
}
