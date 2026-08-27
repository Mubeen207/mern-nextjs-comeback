package androidx.appcompat.view.menu;

import android.content.pm.PackageParser;
import android.os.Bundle;
import androidx.appcompat.view.menu.nd0;
import androidx.appcompat.view.menu.t02;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class a01 {
    public final nd0 a;
    public f b;
    public final nd0.c c;

    /* loaded from: classes.dex */
    public class a implements nd0.c {
        public a() {
        }

        @Override // androidx.appcompat.view.menu.nd0.c
        public void C(ld0 ld0Var, nd0.d dVar) {
            Bundle bundle;
            if (a01.this.b == null) {
                return;
            }
            String str = ld0Var.a;
            Object obj = ld0Var.b;
            ha0.f("TextInputChannel", "Received '" + str + "' message.");
            str.hashCode();
            char c = 65535;
            switch (str.hashCode()) {
                case -1779068172:
                    if (str.equals("TextInput.setPlatformViewClient")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1015421462:
                    if (str.equals("TextInput.setEditingState")) {
                        c = 1;
                        break;
                    }
                    break;
                case -37561188:
                    if (str.equals("TextInput.setClient")) {
                        c = 2;
                        break;
                    }
                    break;
                case 270476819:
                    if (str.equals("TextInput.hide")) {
                        c = 3;
                        break;
                    }
                    break;
                case 270803918:
                    if (str.equals("TextInput.show")) {
                        c = 4;
                        break;
                    }
                    break;
                case 649192816:
                    if (str.equals("TextInput.sendAppPrivateCommand")) {
                        c = 5;
                        break;
                    }
                    break;
                case 1204752139:
                    if (str.equals("TextInput.setEditableSizeAndTransform")) {
                        c = 6;
                        break;
                    }
                    break;
                case 1727570905:
                    if (str.equals("TextInput.finishAutofillContext")) {
                        c = 7;
                        break;
                    }
                    break;
                case 1904427655:
                    if (str.equals("TextInput.clearClient")) {
                        c = '\b';
                        break;
                    }
                    break;
                case 2113369584:
                    if (str.equals("TextInput.requestAutofill")) {
                        c = '\t';
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    try {
                        JSONObject jSONObject = (JSONObject) obj;
                        a01.this.b.e(jSONObject.getInt("platformViewId"), jSONObject.optBoolean("usesVirtualDisplay", false));
                        dVar.c(null);
                        return;
                    } catch (JSONException e) {
                        dVar.b("error", e.getMessage(), null);
                        return;
                    }
                case 1:
                    try {
                        a01.this.b.g(e.a((JSONObject) obj));
                        dVar.c(null);
                        return;
                    } catch (JSONException e2) {
                        dVar.b("error", e2.getMessage(), null);
                        return;
                    }
                case 2:
                    try {
                        JSONArray jSONArray = (JSONArray) obj;
                        a01.this.b.c(jSONArray.getInt(0), b.a(jSONArray.getJSONObject(1)));
                        dVar.c(null);
                        return;
                    } catch (NoSuchFieldException | JSONException e3) {
                        dVar.b("error", e3.getMessage(), null);
                        return;
                    }
                case t02.c.c /* 3 */:
                    a01.this.b.j();
                    dVar.c(null);
                    return;
                case 4:
                    a01.this.b.a();
                    dVar.c(null);
                    return;
                case t02.c.e /* 5 */:
                    try {
                        JSONObject jSONObject2 = (JSONObject) obj;
                        String string = jSONObject2.getString("action");
                        String string2 = jSONObject2.getString("data");
                        if (string2 == null || string2.isEmpty()) {
                            bundle = null;
                        } else {
                            bundle = new Bundle();
                            bundle.putString("data", string2);
                        }
                        a01.this.b.d(string, bundle);
                        dVar.c(null);
                        return;
                    } catch (JSONException e4) {
                        dVar.b("error", e4.getMessage(), null);
                        return;
                    }
                case t02.c.f /* 6 */:
                    try {
                        JSONObject jSONObject3 = (JSONObject) obj;
                        double d = jSONObject3.getDouble("width");
                        double d2 = jSONObject3.getDouble("height");
                        JSONArray jSONArray2 = jSONObject3.getJSONArray("transform");
                        double[] dArr = new double[16];
                        for (int i = 0; i < 16; i++) {
                            dArr[i] = jSONArray2.getDouble(i);
                        }
                        a01.this.b.f(d, d2, dArr);
                        dVar.c(null);
                        return;
                    } catch (JSONException e5) {
                        dVar.b("error", e5.getMessage(), null);
                        return;
                    }
                case t02.c.g /* 7 */:
                    a01.this.b.i(((Boolean) obj).booleanValue());
                    dVar.c(null);
                    return;
                case PackageParser.PARSE_IGNORE_PROCESSES /* 8 */:
                    a01.this.b.b();
                    dVar.c(null);
                    return;
                case '\t':
                    a01.this.b.h();
                    dVar.c(null);
                    return;
                default:
                    dVar.a();
                    return;
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public final boolean a;
        public final boolean b;
        public final boolean c;
        public final boolean d;
        public final boolean e;
        public final d f;
        public final c g;
        public final Integer h;
        public final String i;
        public final a j;
        public final String[] k;
        public final b[] l;

        /* loaded from: classes.dex */
        public static class a {
            public final String a;
            public final String[] b;
            public final e c;
            public final String d;

            public a(String str, String[] strArr, String str2, e eVar) {
                this.a = str;
                this.b = strArr;
                this.d = str2;
                this.c = eVar;
            }

            public static a a(JSONObject jSONObject) {
                String string = jSONObject.getString("uniqueIdentifier");
                JSONArray jSONArray = jSONObject.getJSONArray("hints");
                String string2 = jSONObject.isNull("hintText") ? null : jSONObject.getString("hintText");
                JSONObject jSONObject2 = jSONObject.getJSONObject("editingValue");
                String[] strArr = new String[jSONArray.length()];
                for (int i = 0; i < jSONArray.length(); i++) {
                    strArr[i] = b(jSONArray.getString(i));
                }
                return new a(string, strArr, string2, e.a(jSONObject2));
            }

            public static String b(String str) {
                str.hashCode();
                char c = 65535;
                switch (str.hashCode()) {
                    case -2058889126:
                        if (str.equals("birthdayYear")) {
                            c = 0;
                            break;
                        }
                        break;
                    case -1917283616:
                        if (str.equals("oneTimeCode")) {
                            c = 1;
                            break;
                        }
                        break;
                    case -1844815832:
                        if (str.equals("creditCardExpirationMonth")) {
                            c = 2;
                            break;
                        }
                        break;
                    case -1825589953:
                        if (str.equals("telephoneNumberNational")) {
                            c = 3;
                            break;
                        }
                        break;
                    case -1821235109:
                        if (str.equals("newPassword")) {
                            c = 4;
                            break;
                        }
                        break;
                    case -1757573738:
                        if (str.equals("creditCardSecurityCode")) {
                            c = 5;
                            break;
                        }
                        break;
                    case -1682373820:
                        if (str.equals("creditCardExpirationDay")) {
                            c = 6;
                            break;
                        }
                        break;
                    case -1658955742:
                        if (str.equals("fullStreetAddress")) {
                            c = 7;
                            break;
                        }
                        break;
                    case -1567118045:
                        if (str.equals("telephoneNumberDevice")) {
                            c = '\b';
                            break;
                        }
                        break;
                    case -1476752575:
                        if (str.equals("countryName")) {
                            c = '\t';
                            break;
                        }
                        break;
                    case -1413737489:
                        if (str.equals("middleInitial")) {
                            c = '\n';
                            break;
                        }
                        break;
                    case -1377792129:
                        if (str.equals("addressCity")) {
                            c = 11;
                            break;
                        }
                        break;
                    case -1249512767:
                        if (str.equals("gender")) {
                            c = '\f';
                            break;
                        }
                        break;
                    case -1186060294:
                        if (str.equals("postalAddressExtendedPostalCode")) {
                            c = '\r';
                            break;
                        }
                        break;
                    case -1151034798:
                        if (str.equals("creditCardNumber")) {
                            c = 14;
                            break;
                        }
                        break;
                    case -835992323:
                        if (str.equals("namePrefix")) {
                            c = 15;
                            break;
                        }
                        break;
                    case -818219584:
                        if (str.equals("middleName")) {
                            c = 16;
                            break;
                        }
                        break;
                    case -747304516:
                        if (str.equals("nameSuffix")) {
                            c = 17;
                            break;
                        }
                        break;
                    case -613980922:
                        if (str.equals("creditCardExpirationDate")) {
                            c = 18;
                            break;
                        }
                        break;
                    case -613352043:
                        if (str.equals("creditCardExpirationYear")) {
                            c = 19;
                            break;
                        }
                        break;
                    case -549230602:
                        if (str.equals("telephoneNumberCountryCode")) {
                            c = 20;
                            break;
                        }
                        break;
                    case -265713450:
                        if (str.equals("username")) {
                            c = 21;
                            break;
                        }
                        break;
                    case 3373707:
                        if (str.equals("name")) {
                            c = 22;
                            break;
                        }
                        break;
                    case 96619420:
                        if (str.equals("email")) {
                            c = 23;
                            break;
                        }
                        break;
                    case 253202685:
                        if (str.equals("addressState")) {
                            c = 24;
                            break;
                        }
                        break;
                    case 588174851:
                        if (str.equals("birthdayMonth")) {
                            c = 25;
                            break;
                        }
                        break;
                    case 798554127:
                        if (str.equals("familyName")) {
                            c = 26;
                            break;
                        }
                        break;
                    case 892233837:
                        if (str.equals("telephoneNumber")) {
                            c = 27;
                            break;
                        }
                        break;
                    case 991032982:
                        if (str.equals("newUsername")) {
                            c = 28;
                            break;
                        }
                        break;
                    case 1069376125:
                        if (str.equals("birthday")) {
                            c = 29;
                            break;
                        }
                        break;
                    case 1216985755:
                        if (str.equals("password")) {
                            c = 30;
                            break;
                        }
                        break;
                    case 1469046696:
                        if (str.equals("givenName")) {
                            c = 31;
                            break;
                        }
                        break;
                    case 1662667945:
                        if (str.equals("postalAddress")) {
                            c = ' ';
                            break;
                        }
                        break;
                    case 1921869058:
                        if (str.equals("postalAddressExtended")) {
                            c = '!';
                            break;
                        }
                        break;
                    case 2011152728:
                        if (str.equals("postalCode")) {
                            c = '\"';
                            break;
                        }
                        break;
                    case 2011773919:
                        if (str.equals("birthdayDay")) {
                            c = '#';
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        return "birthDateYear";
                    case 1:
                        return "smsOTPCode";
                    case 2:
                        return "creditCardExpirationMonth";
                    case t02.c.c /* 3 */:
                        return "phoneNational";
                    case 4:
                        return "newPassword";
                    case t02.c.e /* 5 */:
                        return "creditCardSecurityCode";
                    case t02.c.f /* 6 */:
                        return "creditCardExpirationDay";
                    case t02.c.g /* 7 */:
                        return "streetAddress";
                    case PackageParser.PARSE_IGNORE_PROCESSES /* 8 */:
                        return "phoneNumberDevice";
                    case '\t':
                        return "addressCountry";
                    case '\n':
                        return "personMiddleInitial";
                    case 11:
                        return "addressLocality";
                    case '\f':
                        return "gender";
                    case '\r':
                        return "extendedPostalCode";
                    case 14:
                        return "creditCardNumber";
                    case 15:
                        return "personNamePrefix";
                    case PackageParser.PARSE_FORWARD_LOCK /* 16 */:
                        return "personMiddleName";
                    case 17:
                        return "personNameSuffix";
                    case 18:
                        return "creditCardExpirationDate";
                    case 19:
                        return "creditCardExpirationYear";
                    case 20:
                        return "phoneCountryCode";
                    case 21:
                        return "username";
                    case 22:
                        return "personName";
                    case 23:
                        return "emailAddress";
                    case 24:
                        return "addressRegion";
                    case 25:
                        return "birthDateMonth";
                    case 26:
                        return "personFamilyName";
                    case 27:
                        return "phoneNumber";
                    case 28:
                        return "newUsername";
                    case 29:
                        return "birthDateFull";
                    case 30:
                        return "password";
                    case 31:
                        return "personGivenName";
                    case PackageParser.PARSE_EXTERNAL_STORAGE /* 32 */:
                        return "postalAddress";
                    case '!':
                        return "extendedAddress";
                    case '\"':
                        return "postalCode";
                    case '#':
                        return "birthDateDay";
                    default:
                        return str;
                }
            }
        }

        public b(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, d dVar, c cVar, Integer num, String str, a aVar, String[] strArr, b[] bVarArr) {
            this.a = z;
            this.b = z2;
            this.c = z3;
            this.d = z4;
            this.e = z5;
            this.f = dVar;
            this.g = cVar;
            this.h = num;
            this.i = str;
            this.j = aVar;
            this.k = strArr;
            this.l = bVarArr;
        }

        public static b a(JSONObject jSONObject) {
            b[] bVarArr;
            String string = jSONObject.getString("inputAction");
            if (string != null) {
                if (jSONObject.isNull("fields")) {
                    bVarArr = null;
                } else {
                    JSONArray jSONArray = jSONObject.getJSONArray("fields");
                    int length = jSONArray.length();
                    b[] bVarArr2 = new b[length];
                    for (int i = 0; i < length; i++) {
                        bVarArr2[i] = a(jSONArray.getJSONObject(i));
                    }
                    bVarArr = bVarArr2;
                }
                Integer b = b(string);
                ArrayList arrayList = new ArrayList();
                JSONArray jSONArray2 = jSONObject.isNull("contentCommitMimeTypes") ? null : jSONObject.getJSONArray("contentCommitMimeTypes");
                if (jSONArray2 != null) {
                    for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                        arrayList.add(jSONArray2.optString(i2));
                    }
                }
                return new b(jSONObject.optBoolean("obscureText"), jSONObject.optBoolean("autocorrect", true), jSONObject.optBoolean("enableSuggestions"), jSONObject.optBoolean("enableIMEPersonalizedLearning"), jSONObject.optBoolean("enableDeltaModel"), d.e(jSONObject.getString("textCapitalization")), c.a(jSONObject.getJSONObject("inputType")), b, jSONObject.isNull("actionLabel") ? null : jSONObject.getString("actionLabel"), jSONObject.isNull("autofill") ? null : a.a(jSONObject.getJSONObject("autofill")), (String[]) arrayList.toArray(new String[arrayList.size()]), bVarArr);
            }
            throw new JSONException("Configuration JSON missing 'inputAction' property.");
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x0073, code lost:
            if (r12.equals("TextInputAction.done") == false) goto L3;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static java.lang.Integer b(java.lang.String r12) {
            /*
                r12.hashCode()
                int r0 = r12.hashCode()
                r1 = 7
                r2 = 6
                r3 = 5
                r4 = 4
                r5 = 3
                r6 = 2
                r7 = 1
                java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
                r9 = 0
                java.lang.Integer r10 = java.lang.Integer.valueOf(r9)
                r11 = -1
                switch(r0) {
                    case -810971940: goto L76;
                    case -737377923: goto L6d;
                    case -737089298: goto L62;
                    case -737080013: goto L57;
                    case -736940669: goto L4c;
                    case 469250275: goto L41;
                    case 1241689507: goto L36;
                    case 1539450297: goto L2b;
                    case 2110497650: goto L1e;
                    default: goto L1b;
                }
            L1b:
                r7 = r11
                goto L80
            L1e:
                java.lang.String r0 = "TextInputAction.previous"
                boolean r12 = r12.equals(r0)
                if (r12 != 0) goto L27
                goto L1b
            L27:
                r7 = 8
                goto L80
            L2b:
                java.lang.String r0 = "TextInputAction.newline"
                boolean r12 = r12.equals(r0)
                if (r12 != 0) goto L34
                goto L1b
            L34:
                r7 = r1
                goto L80
            L36:
                java.lang.String r0 = "TextInputAction.go"
                boolean r12 = r12.equals(r0)
                if (r12 != 0) goto L3f
                goto L1b
            L3f:
                r7 = r2
                goto L80
            L41:
                java.lang.String r0 = "TextInputAction.search"
                boolean r12 = r12.equals(r0)
                if (r12 != 0) goto L4a
                goto L1b
            L4a:
                r7 = r3
                goto L80
            L4c:
                java.lang.String r0 = "TextInputAction.send"
                boolean r12 = r12.equals(r0)
                if (r12 != 0) goto L55
                goto L1b
            L55:
                r7 = r4
                goto L80
            L57:
                java.lang.String r0 = "TextInputAction.none"
                boolean r12 = r12.equals(r0)
                if (r12 != 0) goto L60
                goto L1b
            L60:
                r7 = r5
                goto L80
            L62:
                java.lang.String r0 = "TextInputAction.next"
                boolean r12 = r12.equals(r0)
                if (r12 != 0) goto L6b
                goto L1b
            L6b:
                r7 = r6
                goto L80
            L6d:
                java.lang.String r0 = "TextInputAction.done"
                boolean r12 = r12.equals(r0)
                if (r12 != 0) goto L80
                goto L1b
            L76:
                java.lang.String r0 = "TextInputAction.unspecified"
                boolean r12 = r12.equals(r0)
                if (r12 != 0) goto L7f
                goto L1b
            L7f:
                r7 = r9
            L80:
                switch(r7) {
                    case 0: goto La4;
                    case 1: goto L9f;
                    case 2: goto L9a;
                    case 3: goto L99;
                    case 4: goto L94;
                    case 5: goto L8f;
                    case 6: goto L8a;
                    case 7: goto L89;
                    case 8: goto L84;
                    default: goto L83;
                }
            L83:
                return r10
            L84:
                java.lang.Integer r12 = java.lang.Integer.valueOf(r1)
                return r12
            L89:
                return r8
            L8a:
                java.lang.Integer r12 = java.lang.Integer.valueOf(r6)
                return r12
            L8f:
                java.lang.Integer r12 = java.lang.Integer.valueOf(r5)
                return r12
            L94:
                java.lang.Integer r12 = java.lang.Integer.valueOf(r4)
                return r12
            L99:
                return r8
            L9a:
                java.lang.Integer r12 = java.lang.Integer.valueOf(r3)
                return r12
            L9f:
                java.lang.Integer r12 = java.lang.Integer.valueOf(r2)
                return r12
            La4:
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.a01.b.b(java.lang.String):java.lang.Integer");
        }
    }

    /* loaded from: classes.dex */
    public static class c {
        public final g a;
        public final boolean b;
        public final boolean c;

        public c(g gVar, boolean z, boolean z2) {
            this.a = gVar;
            this.b = z;
            this.c = z2;
        }

        public static c a(JSONObject jSONObject) {
            return new c(g.e(jSONObject.getString("name")), jSONObject.optBoolean("signed", false), jSONObject.optBoolean("decimal", false));
        }
    }

    /* loaded from: classes.dex */
    public enum d {
        CHARACTERS("TextCapitalization.characters"),
        WORDS("TextCapitalization.words"),
        SENTENCES("TextCapitalization.sentences"),
        NONE("TextCapitalization.none");
        
        public final String m;

        d(String str) {
            this.m = str;
        }

        public static d e(String str) {
            d[] values;
            for (d dVar : values()) {
                if (dVar.m.equals(str)) {
                    return dVar;
                }
            }
            throw new NoSuchFieldException("No such TextCapitalization: " + str);
        }
    }

    /* loaded from: classes.dex */
    public static class e {
        public final String a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;

        public e(String str, int i, int i2, int i3, int i4) {
            if (!(i == -1 && i2 == -1) && (i < 0 || i2 < 0)) {
                throw new IndexOutOfBoundsException("invalid selection: (" + String.valueOf(i) + ", " + String.valueOf(i2) + ")");
            } else if (!(i3 == -1 && i4 == -1) && (i3 < 0 || i3 > i4)) {
                throw new IndexOutOfBoundsException("invalid composing range: (" + String.valueOf(i3) + ", " + String.valueOf(i4) + ")");
            } else if (i4 > str.length()) {
                throw new IndexOutOfBoundsException("invalid composing start: " + String.valueOf(i3));
            } else if (i > str.length()) {
                throw new IndexOutOfBoundsException("invalid selection start: " + String.valueOf(i));
            } else if (i2 > str.length()) {
                throw new IndexOutOfBoundsException("invalid selection end: " + String.valueOf(i2));
            } else {
                this.a = str;
                this.b = i;
                this.c = i2;
                this.d = i3;
                this.e = i4;
            }
        }

        public static e a(JSONObject jSONObject) {
            return new e(jSONObject.getString("text"), jSONObject.getInt("selectionBase"), jSONObject.getInt("selectionExtent"), jSONObject.getInt("composingBase"), jSONObject.getInt("composingExtent"));
        }

        public boolean b() {
            int i = this.d;
            return i >= 0 && this.e > i;
        }

        public boolean c() {
            return this.b >= 0;
        }
    }

    /* loaded from: classes.dex */
    public interface f {
        void a();

        void b();

        void c(int i, b bVar);

        void d(String str, Bundle bundle);

        void e(int i, boolean z);

        void f(double d, double d2, double[] dArr);

        void g(e eVar);

        void h();

        void i(boolean z);

        void j();
    }

    /* loaded from: classes.dex */
    public enum g {
        TEXT("TextInputType.text"),
        DATETIME("TextInputType.datetime"),
        NAME("TextInputType.name"),
        POSTAL_ADDRESS("TextInputType.address"),
        NUMBER("TextInputType.number"),
        PHONE("TextInputType.phone"),
        MULTILINE("TextInputType.multiline"),
        EMAIL_ADDRESS("TextInputType.emailAddress"),
        URL("TextInputType.url"),
        VISIBLE_PASSWORD("TextInputType.visiblePassword"),
        NONE("TextInputType.none");
        
        public final String m;

        g(String str) {
            this.m = str;
        }

        public static g e(String str) {
            g[] values;
            for (g gVar : values()) {
                if (gVar.m.equals(str)) {
                    return gVar;
                }
            }
            throw new NoSuchFieldException("No such TextInputType: " + str);
        }
    }

    public a01(si siVar) {
        a aVar = new a();
        this.c = aVar;
        nd0 nd0Var = new nd0(siVar, "flutter/textinput", q60.a);
        this.a = nd0Var;
        nd0Var.e(aVar);
    }

    public static HashMap c(ArrayList arrayList) {
        HashMap hashMap = new HashMap();
        JSONArray jSONArray = new JSONArray();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            jSONArray.put(((zz0) it.next()).b());
        }
        hashMap.put("deltas", jSONArray);
        return hashMap;
    }

    public static HashMap d(String str, int i, int i2, int i3, int i4) {
        HashMap hashMap = new HashMap();
        hashMap.put("text", str);
        hashMap.put("selectionBase", Integer.valueOf(i));
        hashMap.put("selectionExtent", Integer.valueOf(i2));
        hashMap.put("composingBase", Integer.valueOf(i3));
        hashMap.put("composingExtent", Integer.valueOf(i4));
        return hashMap;
    }

    public void b(int i, Map map) {
        ha0.f("TextInputChannel", "Sending 'commitContent' message.");
        this.a.c("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i), "TextInputAction.commitContent", map));
    }

    public void e(int i) {
        ha0.f("TextInputChannel", "Sending 'done' message.");
        this.a.c("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i), "TextInputAction.done"));
    }

    public void f(int i) {
        ha0.f("TextInputChannel", "Sending 'go' message.");
        this.a.c("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i), "TextInputAction.go"));
    }

    public void g(int i) {
        ha0.f("TextInputChannel", "Sending 'newline' message.");
        this.a.c("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i), "TextInputAction.newline"));
    }

    public void h(int i) {
        ha0.f("TextInputChannel", "Sending 'next' message.");
        this.a.c("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i), "TextInputAction.next"));
    }

    public void i(int i, String str, Bundle bundle) {
        HashMap hashMap = new HashMap();
        hashMap.put("action", str);
        if (bundle != null) {
            HashMap hashMap2 = new HashMap();
            for (String str2 : bundle.keySet()) {
                Object obj = bundle.get(str2);
                if (obj instanceof byte[]) {
                    hashMap2.put(str2, bundle.getByteArray(str2));
                } else if (obj instanceof Byte) {
                    hashMap2.put(str2, Byte.valueOf(bundle.getByte(str2)));
                } else if (obj instanceof char[]) {
                    hashMap2.put(str2, bundle.getCharArray(str2));
                } else if (obj instanceof Character) {
                    hashMap2.put(str2, Character.valueOf(bundle.getChar(str2)));
                } else if (obj instanceof CharSequence[]) {
                    hashMap2.put(str2, bundle.getCharSequenceArray(str2));
                } else if (obj instanceof CharSequence) {
                    hashMap2.put(str2, bundle.getCharSequence(str2));
                } else if (obj instanceof float[]) {
                    hashMap2.put(str2, bundle.getFloatArray(str2));
                } else if (obj instanceof Float) {
                    hashMap2.put(str2, Float.valueOf(bundle.getFloat(str2)));
                }
            }
            hashMap.put("data", hashMap2);
        }
        this.a.c("TextInputClient.performPrivateCommand", Arrays.asList(Integer.valueOf(i), hashMap));
    }

    public void j(int i) {
        ha0.f("TextInputChannel", "Sending 'previous' message.");
        this.a.c("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i), "TextInputAction.previous"));
    }

    public void k() {
        this.a.c("TextInputClient.requestExistingInputState", null);
    }

    public void l(int i) {
        ha0.f("TextInputChannel", "Sending 'search' message.");
        this.a.c("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i), "TextInputAction.search"));
    }

    public void m(int i) {
        ha0.f("TextInputChannel", "Sending 'send' message.");
        this.a.c("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i), "TextInputAction.send"));
    }

    public void n(f fVar) {
        this.b = fVar;
    }

    public void o(int i) {
        ha0.f("TextInputChannel", "Sending 'unspecified' message.");
        this.a.c("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i), "TextInputAction.unspecified"));
    }

    public void p(int i, String str, int i2, int i3, int i4, int i5) {
        ha0.f("TextInputChannel", "Sending message to update editing state: \nText: " + str + "\nSelection start: " + i2 + "\nSelection end: " + i3 + "\nComposing start: " + i4 + "\nComposing end: " + i5);
        this.a.c("TextInputClient.updateEditingState", Arrays.asList(Integer.valueOf(i), d(str, i2, i3, i4, i5)));
    }

    public void q(int i, ArrayList arrayList) {
        ha0.f("TextInputChannel", "Sending message to update editing state with deltas: \nNumber of deltas: " + arrayList.size());
        this.a.c("TextInputClient.updateEditingStateWithDeltas", Arrays.asList(Integer.valueOf(i), c(arrayList)));
    }

    public void r(int i, HashMap hashMap) {
        ha0.f("TextInputChannel", "Sending message to update editing state for " + String.valueOf(hashMap.size()) + " field(s).");
        HashMap hashMap2 = new HashMap();
        for (Map.Entry entry : hashMap.entrySet()) {
            e eVar = (e) entry.getValue();
            hashMap2.put((String) entry.getKey(), d(eVar.a, eVar.b, eVar.c, -1, -1));
        }
        this.a.c("TextInputClient.updateEditingStateWithTag", Arrays.asList(Integer.valueOf(i), hashMap2));
    }
}
