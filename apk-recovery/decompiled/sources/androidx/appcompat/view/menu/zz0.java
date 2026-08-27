package androidx.appcompat.view.menu;

import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class zz0 {
    public CharSequence a;
    public CharSequence b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;

    public zz0(CharSequence charSequence, int i, int i2, CharSequence charSequence2, int i3, int i4, int i5, int i6) {
        this.e = i3;
        this.f = i4;
        this.g = i5;
        this.h = i6;
        a(charSequence, charSequence2.toString(), i, i2);
    }

    public final void a(CharSequence charSequence, CharSequence charSequence2, int i, int i2) {
        this.a = charSequence;
        this.b = charSequence2;
        this.c = i;
        this.d = i2;
    }

    public JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("oldText", this.a.toString());
            jSONObject.put("deltaText", this.b.toString());
            jSONObject.put("deltaStart", this.c);
            jSONObject.put("deltaEnd", this.d);
            jSONObject.put("selectionBase", this.e);
            jSONObject.put("selectionExtent", this.f);
            jSONObject.put("composingBase", this.g);
            jSONObject.put("composingExtent", this.h);
        } catch (JSONException e) {
            ha0.b("TextEditingDelta", "unable to create JSONObject: " + e);
        }
        return jSONObject;
    }

    public zz0(CharSequence charSequence, int i, int i2, int i3, int i4) {
        this.e = i;
        this.f = i2;
        this.g = i3;
        this.h = i4;
        a(charSequence, "", -1, -1);
    }
}
