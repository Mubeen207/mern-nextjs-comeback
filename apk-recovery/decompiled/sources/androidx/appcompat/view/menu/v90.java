package androidx.appcompat.view.menu;

import androidx.appcompat.view.menu.nd0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class v90 {
    public final nd0 a;
    public b b;
    public final nd0.c c;

    /* loaded from: classes.dex */
    public class a implements nd0.c {
        public a() {
        }

        @Override // androidx.appcompat.view.menu.nd0.c
        public void C(ld0 ld0Var, nd0.d dVar) {
            if (v90.this.b == null) {
                return;
            }
            String str = ld0Var.a;
            str.hashCode();
            if (!str.equals("Localization.getStringResource")) {
                dVar.a();
                return;
            }
            JSONObject jSONObject = (JSONObject) ld0Var.b();
            try {
                dVar.c(v90.this.b.a(jSONObject.getString("key"), jSONObject.has("locale") ? jSONObject.getString("locale") : null));
            } catch (JSONException e) {
                dVar.b("error", e.getMessage(), null);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        String a(String str, String str2);
    }

    public v90(si siVar) {
        a aVar = new a();
        this.c = aVar;
        nd0 nd0Var = new nd0(siVar, "flutter/localization", q60.a);
        this.a = nd0Var;
        nd0Var.e(aVar);
    }

    public void b(List list) {
        ha0.f("LocalizationChannel", "Sending Locales to Flutter.");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Locale locale = (Locale) it.next();
            ha0.f("LocalizationChannel", "Locale (Language: " + locale.getLanguage() + ", Country: " + locale.getCountry() + ", Variant: " + locale.getVariant() + ")");
            arrayList.add(locale.getLanguage());
            arrayList.add(locale.getCountry());
            arrayList.add(locale.getScript());
            arrayList.add(locale.getVariant());
        }
        this.a.c("setLocale", arrayList);
    }

    public void c(b bVar) {
        this.b = bVar;
    }
}
