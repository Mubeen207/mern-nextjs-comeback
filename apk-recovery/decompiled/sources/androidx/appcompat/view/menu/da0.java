package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public abstract class da0 {
    public static final Object a = new py0("CONDITION_FALSE");

    public static final Object a() {
        return a;
    }

    public static final ea0 b(Object obj) {
        ea0 ea0Var;
        wo0 wo0Var = obj instanceof wo0 ? (wo0) obj : null;
        if (wo0Var == null || (ea0Var = wo0Var.a) == null) {
            c60.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            return (ea0) obj;
        }
        return ea0Var;
    }
}
