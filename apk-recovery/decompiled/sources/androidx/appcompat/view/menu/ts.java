package androidx.appcompat.view.menu;

import android.content.Context;
import android.text.TextUtils;
/* loaded from: classes.dex */
public final class ts {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    public ts(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        pj0.m(!px0.a(str), "ApplicationId must be set.");
        this.b = str;
        this.a = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
    }

    public static ts a(Context context) {
        nx0 nx0Var = new nx0(context);
        String a = nx0Var.a("google_app_id");
        if (TextUtils.isEmpty(a)) {
            return null;
        }
        return new ts(a, nx0Var.a("google_api_key"), nx0Var.a("firebase_database_url"), nx0Var.a("ga_trackingId"), nx0Var.a("gcm_defaultSenderId"), nx0Var.a("google_storage_bucket"), nx0Var.a("project_id"));
    }

    public String b() {
        return this.a;
    }

    public String c() {
        return this.b;
    }

    public String d() {
        return this.e;
    }

    public String e() {
        return this.g;
    }

    public boolean equals(Object obj) {
        if (obj instanceof ts) {
            ts tsVar = (ts) obj;
            return zf0.a(this.b, tsVar.b) && zf0.a(this.a, tsVar.a) && zf0.a(this.c, tsVar.c) && zf0.a(this.d, tsVar.d) && zf0.a(this.e, tsVar.e) && zf0.a(this.f, tsVar.f) && zf0.a(this.g, tsVar.g);
        }
        return false;
    }

    public int hashCode() {
        return zf0.b(this.b, this.a, this.c, this.d, this.e, this.f, this.g);
    }

    public String toString() {
        return zf0.c(this).a("applicationId", this.b).a("apiKey", this.a).a("databaseUrl", this.c).a("gcmSenderId", this.e).a("storageBucket", this.f).a("projectId", this.g).toString();
    }
}
