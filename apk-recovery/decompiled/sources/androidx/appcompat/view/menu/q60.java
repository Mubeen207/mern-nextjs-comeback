package androidx.appcompat.view.menu;

import java.nio.ByteBuffer;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class q60 implements od0 {
    public static final q60 a = new q60();

    @Override // androidx.appcompat.view.menu.od0
    public ByteBuffer a(Object obj) {
        return p60.a.a(new JSONArray().put(r60.a(obj)));
    }

    @Override // androidx.appcompat.view.menu.od0
    public ByteBuffer b(String str, String str2, Object obj, String str3) {
        return p60.a.a(new JSONArray().put(str).put(r60.a(str2)).put(r60.a(obj)).put(r60.a(str3)));
    }

    @Override // androidx.appcompat.view.menu.od0
    public ByteBuffer c(String str, String str2, Object obj) {
        return p60.a.a(new JSONArray().put(str).put(r60.a(str2)).put(r60.a(obj)));
    }

    @Override // androidx.appcompat.view.menu.od0
    public ld0 d(ByteBuffer byteBuffer) {
        try {
            Object b = p60.a.b(byteBuffer);
            if (b instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) b;
                Object obj = jSONObject.get("method");
                Object g = g(jSONObject.opt("args"));
                if (obj instanceof String) {
                    return new ld0((String) obj, g);
                }
            }
            throw new IllegalArgumentException("Invalid method call: " + b);
        } catch (JSONException e) {
            throw new IllegalArgumentException("Invalid JSON", e);
        }
    }

    @Override // androidx.appcompat.view.menu.od0
    public Object e(ByteBuffer byteBuffer) {
        try {
            Object b = p60.a.b(byteBuffer);
            if (b instanceof JSONArray) {
                JSONArray jSONArray = (JSONArray) b;
                if (jSONArray.length() == 1) {
                    return g(jSONArray.opt(0));
                }
                if (jSONArray.length() == 3) {
                    Object obj = jSONArray.get(0);
                    Object g = g(jSONArray.opt(1));
                    Object g2 = g(jSONArray.opt(2));
                    if ((obj instanceof String) && (g == null || (g instanceof String))) {
                        throw new qt((String) obj, (String) g, g2);
                    }
                }
            }
            throw new IllegalArgumentException("Invalid envelope: " + b);
        } catch (JSONException e) {
            throw new IllegalArgumentException("Invalid JSON", e);
        }
    }

    @Override // androidx.appcompat.view.menu.od0
    public ByteBuffer f(ld0 ld0Var) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("method", ld0Var.a);
            jSONObject.put("args", r60.a(ld0Var.b));
            return p60.a.a(jSONObject);
        } catch (JSONException e) {
            throw new IllegalArgumentException("Invalid JSON", e);
        }
    }

    public Object g(Object obj) {
        if (obj == JSONObject.NULL) {
            return null;
        }
        return obj;
    }
}
