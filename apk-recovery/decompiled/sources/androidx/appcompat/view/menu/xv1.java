package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public final class xv1 extends rv1 {
    public xv1(hw1 hw1Var, String str, Boolean bool, boolean z) {
        super(hw1Var, str, bool);
    }

    @Override // androidx.appcompat.view.menu.rv1
    public final /* synthetic */ Object h(Object obj) {
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (rt1.c.matcher(str).matches()) {
                return Boolean.TRUE;
            }
            if (rt1.d.matcher(str).matches()) {
                return Boolean.FALSE;
            }
        }
        String k = super.k();
        String valueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder("Invalid boolean value for ");
        sb.append(k);
        sb.append(": ");
        sb.append(valueOf);
        return null;
    }
}
