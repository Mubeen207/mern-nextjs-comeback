package androidx.appcompat.view.menu;

import android.content.SharedPreferences;
import android.os.Bundle;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class av1 {
    public final String a;
    public final Bundle b;
    public Bundle c;
    public final /* synthetic */ wu1 d;

    public av1(wu1 wu1Var, String str, Bundle bundle) {
        this.d = wu1Var;
        pj0.e(str);
        this.a = str;
        this.b = new Bundle();
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0120 A[Catch: NumberFormatException | JSONException -> 0x0128, TRY_LEAVE, TryCatch #1 {NumberFormatException | JSONException -> 0x0128, blocks: (B:9:0x0025, B:42:0x0091, B:43:0x00a2, B:45:0x00a8, B:47:0x00b6, B:49:0x00c8, B:50:0x00d1, B:51:0x00d5, B:53:0x00db, B:55:0x00e9, B:57:0x00fb, B:58:0x0104, B:59:0x0108, B:60:0x0114, B:61:0x0120, B:20:0x0052, B:23:0x005c, B:26:0x0066, B:29:0x0070, B:32:0x007a), top: B:75:0x0025, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.os.Bundle a() {
        /*
            Method dump skipped, instructions count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.av1.a():android.os.Bundle");
    }

    public final void b(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        SharedPreferences.Editor edit = this.d.F().edit();
        if (bundle.size() == 0) {
            edit.remove(this.a);
        } else {
            edit.putString(this.a, c(bundle));
        }
        edit.apply();
        this.c = bundle;
    }

    public final String c(Bundle bundle) {
        JSONArray jSONArray = new JSONArray();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj != null) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("n", str);
                    if (!vc2.a() || !this.d.e().s(vi1.M0)) {
                        jSONObject.put("v", String.valueOf(obj));
                        if (obj instanceof String) {
                            jSONObject.put("t", "s");
                        } else if (obj instanceof Long) {
                            jSONObject.put("t", "l");
                        } else if (obj instanceof Double) {
                            jSONObject.put("t", "d");
                        } else {
                            this.d.l().G().b("Cannot serialize bundle value to SharedPreferences. Type", obj.getClass());
                        }
                    } else if (obj instanceof String) {
                        jSONObject.put("v", String.valueOf(obj));
                        jSONObject.put("t", "s");
                    } else if (obj instanceof Long) {
                        jSONObject.put("v", String.valueOf(obj));
                        jSONObject.put("t", "l");
                    } else if (obj instanceof int[]) {
                        jSONObject.put("v", Arrays.toString((int[]) obj));
                        jSONObject.put("t", "ia");
                    } else if (obj instanceof long[]) {
                        jSONObject.put("v", Arrays.toString((long[]) obj));
                        jSONObject.put("t", "la");
                    } else if (obj instanceof Double) {
                        jSONObject.put("v", String.valueOf(obj));
                        jSONObject.put("t", "d");
                    } else {
                        this.d.l().G().b("Cannot serialize bundle value to SharedPreferences. Type", obj.getClass());
                    }
                    jSONArray.put(jSONObject);
                } catch (JSONException e) {
                    this.d.l().G().b("Cannot serialize bundle value to SharedPreferences", e);
                }
            }
        }
        return jSONArray.toString();
    }
}
