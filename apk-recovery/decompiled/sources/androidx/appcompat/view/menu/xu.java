package androidx.appcompat.view.menu;

import android.util.Base64;
import java.util.List;
/* loaded from: classes.dex */
public final class xu {
    public final String a;
    public final String b;
    public final String c;
    public final List d;
    public final int e = 0;
    public final String f;

    public xu(String str, String str2, String str3, List list) {
        this.a = (String) tj0.g(str);
        this.b = (String) tj0.g(str2);
        this.c = (String) tj0.g(str3);
        this.d = (List) tj0.g(list);
        this.f = a(str, str2, str3);
    }

    public final String a(String str, String str2, String str3) {
        return str + "-" + str2 + "-" + str3;
    }

    public List b() {
        return this.d;
    }

    public int c() {
        return this.e;
    }

    public String d() {
        return this.f;
    }

    public String e() {
        return this.a;
    }

    public String f() {
        return this.b;
    }

    public String g() {
        return this.c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.a + ", mProviderPackage: " + this.b + ", mQuery: " + this.c + ", mCertificates:");
        for (int i = 0; i < this.d.size(); i++) {
            sb.append(" [");
            List list = (List) this.d.get(i);
            for (int i2 = 0; i2 < list.size(); i2++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString((byte[]) list.get(i2), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        sb.append("}");
        sb.append("mCertificatesArray: " + this.e);
        return sb.toString();
    }
}
