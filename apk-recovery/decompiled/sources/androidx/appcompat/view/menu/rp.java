package androidx.appcompat.view.menu;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
/* loaded from: classes.dex */
public abstract class rp {
    public static Executor a() {
        return new kr0(Executors.newSingleThreadExecutor());
    }
}
