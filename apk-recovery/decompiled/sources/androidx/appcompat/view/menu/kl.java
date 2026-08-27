package androidx.appcompat.view.menu;

import java.util.Arrays;
import java.util.List;
/* loaded from: classes.dex */
public class kl extends ll {
    public final List m;

    public kl(List list) {
        super("Dependency cycle detected: " + Arrays.toString(list.toArray()));
        this.m = list;
    }
}
