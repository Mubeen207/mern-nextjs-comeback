package androidx.appcompat.view.menu;

import java.nio.ByteBuffer;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;
/* loaded from: classes.dex */
public final class p60 implements ad0 {
    public static final p60 a = new p60();

    @Override // androidx.appcompat.view.menu.ad0
    public ByteBuffer a(Object obj) {
        if (obj == null) {
            return null;
        }
        Object a2 = r60.a(obj);
        return a2 instanceof String ? lx0.b.a(JSONObject.quote((String) a2)) : lx0.b.a(a2.toString());
    }

    @Override // androidx.appcompat.view.menu.ad0
    public Object b(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return null;
        }
        try {
            JSONTokener jSONTokener = new JSONTokener(lx0.b.b(byteBuffer));
            Object nextValue = jSONTokener.nextValue();
            if (jSONTokener.more()) {
                throw new IllegalArgumentException("Invalid JSON");
            }
            return nextValue;
        } catch (JSONException e) {
            throw new IllegalArgumentException("Invalid JSON", e);
        }
    }
}
