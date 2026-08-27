package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public final class dw1 extends rv1 {
    public dw1(hw1 hw1Var, String str, Double d, boolean z) {
        super(hw1Var, str, d);
    }

    @Override // androidx.appcompat.view.menu.rv1
    /* renamed from: o */
    public final Double h(Object obj) {
        if (obj instanceof Double) {
            return (Double) obj;
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if (obj instanceof String) {
            try {
                return Double.valueOf(Double.parseDouble((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        String k = super.k();
        String valueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder("Invalid double value for ");
        sb.append(k);
        sb.append(": ");
        sb.append(valueOf);
        return null;
    }
}
