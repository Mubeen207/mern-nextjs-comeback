package androidx.appcompat.view.menu;

import java.util.Map;
/* loaded from: classes.dex */
public final class kw1 implements eb2 {
    public final /* synthetic */ String a;
    public final /* synthetic */ uv1 b;

    public kw1(uv1 uv1Var, String str) {
        this.b = uv1Var;
        this.a = str;
    }

    @Override // androidx.appcompat.view.menu.eb2
    public final String h(String str) {
        Map map;
        map = this.b.d;
        Map map2 = (Map) map.get(this.a);
        if (map2 == null || !map2.containsKey(str)) {
            return null;
        }
        return (String) map2.get(str);
    }
}
