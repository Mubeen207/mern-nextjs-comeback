package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public final class zv1 extends rv1 {
    public zv1(hw1 hw1Var, String str, Long l, boolean z) {
        super(hw1Var, str, l);
    }

    @Override // androidx.appcompat.view.menu.rv1
    /* renamed from: o */
    public final Long h(Object obj) {
        if (obj instanceof Long) {
            return (Long) obj;
        }
        if (obj instanceof String) {
            try {
                return Long.valueOf(Long.parseLong((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        String k = super.k();
        String valueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder("Invalid long value for ");
        sb.append(k);
        sb.append(": ");
        sb.append(valueOf);
        return null;
    }
}
