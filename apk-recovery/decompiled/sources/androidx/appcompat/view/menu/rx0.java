package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public abstract class rx0 {
    public static void a(Appendable appendable, Object obj, kw kwVar) {
        c60.e(appendable, "<this>");
        if (kwVar != null) {
            appendable.append((CharSequence) kwVar.i(obj));
        } else if (obj == null || (obj instanceof CharSequence)) {
            appendable.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            appendable.append(((Character) obj).charValue());
        } else {
            appendable.append(String.valueOf(obj));
        }
    }
}
