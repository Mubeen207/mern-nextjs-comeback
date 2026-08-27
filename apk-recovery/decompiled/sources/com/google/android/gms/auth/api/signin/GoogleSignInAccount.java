package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.appcompat.view.menu.cc;
import androidx.appcompat.view.menu.kj;
import androidx.appcompat.view.menu.mr0;
import androidx.appcompat.view.menu.pb1;
import androidx.appcompat.view.menu.pj0;
import androidx.appcompat.view.menu.r;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class GoogleSignInAccount extends r implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new pb1();
    public static cc z = kj.d();
    public final int m;
    public String n;
    public String o;
    public String p;
    public String q;
    public Uri r;
    public String s;
    public long t;
    public String u;
    public List v;
    public String w;
    public String x;
    public Set y = new HashSet();

    public GoogleSignInAccount(int i, String str, String str2, String str3, String str4, Uri uri, String str5, long j, String str6, List list, String str7, String str8) {
        this.m = i;
        this.n = str;
        this.o = str2;
        this.p = str3;
        this.q = str4;
        this.r = uri;
        this.s = str5;
        this.t = j;
        this.u = str6;
        this.v = list;
        this.w = str7;
        this.x = str8;
    }

    public static GoogleSignInAccount u(String str, String str2, String str3, String str4, String str5, String str6, Uri uri, Long l, String str7, Set set) {
        return new GoogleSignInAccount(3, str, str2, str3, str4, uri, null, l.longValue(), pj0.e(str7), new ArrayList((Collection) pj0.i(set)), str5, str6);
    }

    public static GoogleSignInAccount v(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String optString = jSONObject.optString("photoUrl");
        Uri parse = !TextUtils.isEmpty(optString) ? Uri.parse(optString) : null;
        long parseLong = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(jSONArray.getString(i)));
        }
        GoogleSignInAccount u = u(jSONObject.optString("id"), jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null, jSONObject.has("email") ? jSONObject.optString("email") : null, jSONObject.has("displayName") ? jSONObject.optString("displayName") : null, jSONObject.has("givenName") ? jSONObject.optString("givenName") : null, jSONObject.has("familyName") ? jSONObject.optString("familyName") : null, parse, Long.valueOf(parseLong), jSONObject.getString("obfuscatedIdentifier"), hashSet);
        u.s = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
        return u;
    }

    public String d() {
        return this.q;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof GoogleSignInAccount) {
            GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
            return googleSignInAccount.u.equals(this.u) && googleSignInAccount.s().equals(s());
        }
        return false;
    }

    public String f() {
        return this.p;
    }

    public int hashCode() {
        return ((this.u.hashCode() + 527) * 31) + s().hashCode();
    }

    public String i() {
        return this.x;
    }

    public String k() {
        return this.w;
    }

    public String n() {
        return this.n;
    }

    public String p() {
        return this.o;
    }

    public Uri r() {
        return this.r;
    }

    public Set s() {
        HashSet hashSet = new HashSet(this.v);
        hashSet.addAll(this.y);
        return hashSet;
    }

    public String t() {
        return this.s;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int a = mr0.a(parcel);
        mr0.i(parcel, 1, this.m);
        mr0.n(parcel, 2, n(), false);
        mr0.n(parcel, 3, p(), false);
        mr0.n(parcel, 4, f(), false);
        mr0.n(parcel, 5, d(), false);
        mr0.m(parcel, 6, r(), i, false);
        mr0.n(parcel, 7, t(), false);
        mr0.k(parcel, 8, this.t);
        mr0.n(parcel, 9, this.u, false);
        mr0.q(parcel, 10, this.v, false);
        mr0.n(parcel, 11, k(), false);
        mr0.n(parcel, 12, i(), false);
        mr0.b(parcel, a);
    }
}
