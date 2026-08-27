package androidx.appcompat.view.menu;

import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public abstract class jh1 {
    public final List a = new ArrayList();

    public final tg1 a(String str) {
        if (this.a.contains(lu1.c(str))) {
            throw new UnsupportedOperationException("Command not implemented: " + str);
        }
        throw new IllegalArgumentException("Command not supported");
    }

    public abstract tg1 b(String str, sw1 sw1Var, List list);
}
