package androidx.appcompat.view.menu;

import java.util.Map;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class ld0 {
    public final String a;
    public final Object b;

    public ld0(String str, Object obj) {
        this.a = str;
        this.b = obj;
    }

    public Object a(String str) {
        Object obj = this.b;
        if (obj == null) {
            return null;
        }
        if (obj instanceof Map) {
            return ((Map) obj).get(str);
        }
        if (obj instanceof JSONObject) {
            return ((JSONObject) obj).opt(str);
        }
        throw new ClassCastException();
    }

    public Object b() {
        return this.b;
    }
}
