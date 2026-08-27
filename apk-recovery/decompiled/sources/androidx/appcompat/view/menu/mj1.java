package androidx.appcompat.view.menu;

import java.util.List;
/* loaded from: classes.dex */
public final class mj1 extends jh1 {
    @Override // androidx.appcompat.view.menu.jh1
    public final tg1 b(String str, sw1 sw1Var, List list) {
        if (str == null || str.isEmpty() || !sw1Var.g(str)) {
            throw new IllegalArgumentException(String.format("Command not found: %s", str));
        }
        tg1 c = sw1Var.c(str);
        if (c instanceof jg1) {
            return ((jg1) c).a(sw1Var, list);
        }
        throw new IllegalArgumentException(String.format("Function %s is not defined", str));
    }
}
