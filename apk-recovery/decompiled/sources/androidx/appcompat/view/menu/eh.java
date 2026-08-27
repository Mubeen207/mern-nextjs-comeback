package androidx.appcompat.view.menu;

import java.io.File;
import java.io.IOException;
/* loaded from: classes.dex */
public class eh implements tp {
    @Override // androidx.appcompat.view.menu.tp
    public int a(y6 y6Var, o50 o50Var, int i) {
        try {
            if (!o50Var.b(1)) {
                re0.a(new File(y6Var.m.G), ov0.c(y6Var.m.y));
            }
            if (o50Var.b(2)) {
                File file = new File(y6Var.m.G);
                File e = ov0.e(y6Var.m.y);
                try {
                    if (!o50Var.b(8)) {
                        qr.b(file, e);
                    } else if (!qr.i(file, e)) {
                        qr.b(file, e);
                    }
                    y6Var.m.G = e.getAbsolutePath();
                    return 0;
                } catch (IOException e2) {
                    e2.printStackTrace();
                    return -1;
                }
            }
            return 0;
        } catch (Exception e3) {
            e3.printStackTrace();
            return -1;
        }
    }
}
