package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.os.LocaleList;
import androidx.appcompat.view.menu.v90;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
/* loaded from: classes.dex */
public class w90 {
    public final v90 a;
    public final Context b;
    public final v90.b c;

    /* loaded from: classes.dex */
    public class a implements v90.b {
        public a() {
        }

        @Override // androidx.appcompat.view.menu.v90.b
        public String a(String str, String str2) {
            Context context = w90.this.b;
            if (str2 != null) {
                Locale b = w90.b(str2);
                Configuration configuration = new Configuration(w90.this.b.getResources().getConfiguration());
                configuration.setLocale(b);
                context = w90.this.b.createConfigurationContext(configuration);
            }
            int identifier = context.getResources().getIdentifier(str, "string", w90.this.b.getPackageName());
            if (identifier != 0) {
                return context.getResources().getString(identifier);
            }
            return null;
        }
    }

    public w90(Context context, v90 v90Var) {
        a aVar = new a();
        this.c = aVar;
        this.b = context;
        this.a = v90Var;
        v90Var.c(aVar);
    }

    public static Locale b(String str) {
        String str2;
        String[] split = str.replace('_', '-').split("-", -1);
        String str3 = split[0];
        String str4 = "";
        int i = 1;
        if (split.length <= 1 || split[1].length() != 4) {
            str2 = "";
        } else {
            str2 = split[1];
            i = 2;
        }
        if (split.length > i && split[i].length() >= 2 && split[i].length() <= 3) {
            str4 = split[i];
        }
        return new Locale(str3, str4, str2);
    }

    public Locale c(List list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        LocaleList locales = this.b.getResources().getConfiguration().getLocales();
        int size = locales.size();
        for (int i = 0; i < size; i++) {
            Locale locale = locales.get(i);
            String language = locale.getLanguage();
            if (!locale.getScript().isEmpty()) {
                language = language + "-" + locale.getScript();
            }
            if (!locale.getCountry().isEmpty()) {
                language = language + "-" + locale.getCountry();
            }
            arrayList.add(new Locale.LanguageRange(language));
            arrayList.add(new Locale.LanguageRange(locale.getLanguage()));
            arrayList.add(new Locale.LanguageRange(locale.getLanguage() + "-*"));
        }
        Locale lookup = Locale.lookup(arrayList, list);
        return lookup != null ? lookup : (Locale) list.get(0);
    }

    public void d(Configuration configuration) {
        ArrayList arrayList = new ArrayList();
        LocaleList locales = configuration.getLocales();
        int size = locales.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(locales.get(i));
        }
        this.a.b(arrayList);
    }
}
