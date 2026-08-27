package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageParser;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import java.io.IOException;
import org.json.JSONArray;
import org.xmlpull.v1.XmlPullParserException;
/* loaded from: classes.dex */
public abstract class a4 {
    public static final String a = xt.class.getName() + ".aot-shared-library-name";
    public static final String b = xt.class.getName() + ".vm-snapshot-data";
    public static final String c = xt.class.getName() + ".isolate-snapshot-data";
    public static final String d = xt.class.getName() + ".flutter-assets-dir";

    public static ApplicationInfo a(Context context) {
        try {
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), PackageParser.PARSE_IS_PRIVILEGED);
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static boolean b(Bundle bundle, String str, boolean z) {
        return bundle == null ? z : bundle.getBoolean(str, z);
    }

    public static String c(ApplicationInfo applicationInfo, Context context) {
        int i;
        Bundle bundle = applicationInfo.metaData;
        if (bundle != null && (i = bundle.getInt("io.flutter.network-policy", 0)) > 0) {
            JSONArray jSONArray = new JSONArray();
            try {
                XmlResourceParser xml = context.getResources().getXml(i);
                xml.next();
                for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                    if (eventType == 2) {
                        if (xml.getName().equals("domain-config")) {
                            g(xml, jSONArray, false);
                        }
                    }
                }
                return jSONArray.toString();
            } catch (IOException | XmlPullParserException unused) {
                return null;
            }
        }
        return null;
    }

    public static String d(Bundle bundle, String str) {
        if (bundle == null) {
            return null;
        }
        return bundle.getString(str, null);
    }

    public static mt e(Context context) {
        ApplicationInfo a2 = a(context);
        return new mt(d(a2.metaData, a), d(a2.metaData, b), d(a2.metaData, c), d(a2.metaData, d), c(a2, context), a2.nativeLibraryDir, b(a2.metaData, "io.flutter.automatically-register-plugins", true));
    }

    public static void f(XmlResourceParser xmlResourceParser, JSONArray jSONArray, boolean z) {
        boolean attributeBooleanValue = xmlResourceParser.getAttributeBooleanValue(null, "includeSubdomains", false);
        xmlResourceParser.next();
        if (xmlResourceParser.getEventType() != 4) {
            throw new IllegalStateException("Expected text");
        }
        String trim = xmlResourceParser.getText().trim();
        JSONArray jSONArray2 = new JSONArray();
        jSONArray2.put(trim);
        jSONArray2.put(attributeBooleanValue);
        jSONArray2.put(z);
        jSONArray.put(jSONArray2);
        xmlResourceParser.next();
        if (xmlResourceParser.getEventType() != 3) {
            throw new IllegalStateException("Expected end of domain tag");
        }
    }

    public static void g(XmlResourceParser xmlResourceParser, JSONArray jSONArray, boolean z) {
        boolean attributeBooleanValue = xmlResourceParser.getAttributeBooleanValue(null, "cleartextTrafficPermitted", z);
        while (true) {
            int next = xmlResourceParser.next();
            if (next == 2) {
                if (xmlResourceParser.getName().equals("domain")) {
                    f(xmlResourceParser, jSONArray, attributeBooleanValue);
                } else if (xmlResourceParser.getName().equals("domain-config")) {
                    g(xmlResourceParser, jSONArray, attributeBooleanValue);
                } else {
                    h(xmlResourceParser);
                }
            } else if (next == 3) {
                return;
            }
        }
    }

    public static void h(XmlResourceParser xmlResourceParser) {
        String name = xmlResourceParser.getName();
        int eventType = xmlResourceParser.getEventType();
        while (true) {
            if (eventType == 3 && xmlResourceParser.getName() == name) {
                return;
            }
            eventType = xmlResourceParser.next();
        }
    }
}
