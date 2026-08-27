package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageParser;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.ext.SdkExtensions;
import android.text.TextUtils;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;
/* loaded from: classes.dex */
public final class aa2 extends gz1 {
    public static final String[] i = {"firebase_", "google_", "ga_"};
    public static final String[] j = {"_err"};
    public SecureRandom c;
    public final AtomicLong d;
    public int e;
    public nc0 f;
    public Boolean g;
    public Integer h;

    public aa2(fx1 fx1Var) {
        super(fx1Var);
        this.h = null;
        this.d = new AtomicLong(0L);
    }

    public static long A(hi1 hi1Var) {
        long j2 = 0;
        if (hi1Var == null) {
            return 0L;
        }
        Iterator it = hi1Var.iterator();
        while (it.hasNext()) {
            Object p = hi1Var.p((String) it.next());
            if (p instanceof Parcelable[]) {
                j2 += ((Parcelable[]) p).length;
            }
        }
        return j2;
    }

    public static long B(byte[] bArr) {
        pj0.i(bArr);
        int i2 = 0;
        pj0.l(bArr.length > 0);
        long j2 = 0;
        for (int length = bArr.length - 1; length >= 0 && length >= bArr.length - 8; length--) {
            j2 += (bArr[length] & 255) << i2;
            i2 += 8;
        }
        return j2;
    }

    public static boolean B0(Context context, String str) {
        ServiceInfo serviceInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, str), 0)) != null) {
                if (serviceInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    public static Bundle D(Bundle bundle) {
        if (bundle == null) {
            return new Bundle();
        }
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle2.keySet()) {
            Object obj = bundle2.get(str);
            if (obj instanceof Bundle) {
                bundle2.putBundle(str, new Bundle((Bundle) obj));
            } else {
                int i2 = 0;
                if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    while (i2 < parcelableArr.length) {
                        if (parcelableArr[i2] instanceof Bundle) {
                            parcelableArr[i2] = new Bundle((Bundle) parcelableArr[i2]);
                        }
                        i2++;
                    }
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    while (i2 < list.size()) {
                        Object obj2 = list.get(i2);
                        if (obj2 instanceof Bundle) {
                            list.set(i2, new Bundle((Bundle) obj2));
                        }
                        i2++;
                    }
                }
            }
        }
        return bundle2;
    }

    public static boolean D0(String str) {
        String str2 = (String) vi1.b0.a(null);
        return str2.equals("*") || Arrays.asList(str2.split(",")).contains(str);
    }

    public static Bundle F(List list) {
        Bundle bundle = new Bundle();
        if (list == null) {
            return bundle;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            y92 y92Var = (y92) it.next();
            String str = y92Var.r;
            if (str != null) {
                bundle.putString(y92Var.n, str);
            } else {
                Long l = y92Var.p;
                if (l != null) {
                    bundle.putLong(y92Var.n, l.longValue());
                } else {
                    Double d = y92Var.t;
                    if (d != null) {
                        bundle.putDouble(y92Var.n, d.doubleValue());
                    }
                }
            }
        }
        return bundle;
    }

    public static boolean H0(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("_");
    }

    public static String I(String str, int i2, boolean z) {
        if (str == null) {
            return null;
        }
        if (str.codePointCount(0, str.length()) > i2) {
            if (z) {
                String substring = str.substring(0, str.offsetByCodePoints(0, i2));
                return substring + "...";
            }
            return null;
        }
        return str;
    }

    public static boolean J0(String str) {
        pj0.e(str);
        return str.charAt(0) != '_' || str.equals("_ep");
    }

    public static void K(Bundle bundle, int i2, String str, String str2, Object obj) {
        if (v0(bundle, i2)) {
            bundle.putString("_ev", I(str, 40, true));
            if (obj != null) {
                pj0.i(bundle);
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    bundle.putLong("_el", String.valueOf(obj).length());
                }
            }
        }
    }

    public static boolean L0(String str) {
        for (String str2 : j) {
            if (str2.equals(str)) {
                return false;
            }
        }
        return true;
    }

    public static int O0(String str) {
        if ("_ldl".equals(str)) {
            return 2048;
        }
        return "_id".equals(str) ? PackageParser.PARSE_COLLECT_CERTIFICATES : ("_lgclid".equals(str) || "_gbraid".equals(str)) ? 100 : 36;
    }

    private static boolean R0(String str) {
        pj0.i(str);
        return str.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$");
    }

    public static MessageDigest T0() {
        MessageDigest messageDigest;
        for (int i2 = 0; i2 < 2; i2++) {
            try {
                messageDigest = MessageDigest.getInstance("MD5");
            } catch (NoSuchAlgorithmException unused) {
            }
            if (messageDigest != null) {
                return messageDigest;
            }
        }
        return null;
    }

    public static void W(w32 w32Var, Bundle bundle, boolean z) {
        if (bundle == null || w32Var == null || (bundle.containsKey("_sc") && !z)) {
            if (bundle != null && w32Var == null && z) {
                bundle.remove("_sn");
                bundle.remove("_sc");
                bundle.remove("_si");
                return;
            }
            return;
        }
        String str = w32Var.a;
        if (str != null) {
            bundle.putString("_sn", str);
        } else {
            bundle.remove("_sn");
        }
        String str2 = w32Var.b;
        if (str2 != null) {
            bundle.putString("_sc", str2);
        } else {
            bundle.remove("_sc");
        }
        bundle.putLong("_si", w32Var.c);
    }

    public static void X(ea2 ea2Var, int i2, String str, String str2, int i3) {
        Y(ea2Var, null, i2, str, str2, i3);
    }

    private final boolean X0() {
        Integer num;
        if (this.g == null) {
            nc0 Q0 = Q0();
            boolean z = false;
            if (Q0 == null) {
                return false;
            }
            Integer num2 = null;
            try {
                num = (Integer) Q0.b().get(10000L, TimeUnit.MILLISECONDS);
                if (num != null) {
                    try {
                        if (num.intValue() == 1) {
                            z = true;
                        }
                    } catch (InterruptedException e) {
                        e = e;
                        num2 = num;
                        l().L().b("Measurement manager api exception", e);
                        this.g = Boolean.FALSE;
                        num = num2;
                        l().K().b("Measurement manager api status result", num);
                        return this.g.booleanValue();
                    } catch (CancellationException e2) {
                        e = e2;
                        num2 = num;
                        l().L().b("Measurement manager api exception", e);
                        this.g = Boolean.FALSE;
                        num = num2;
                        l().K().b("Measurement manager api status result", num);
                        return this.g.booleanValue();
                    } catch (ExecutionException e3) {
                        e = e3;
                        num2 = num;
                        l().L().b("Measurement manager api exception", e);
                        this.g = Boolean.FALSE;
                        num = num2;
                        l().K().b("Measurement manager api status result", num);
                        return this.g.booleanValue();
                    } catch (TimeoutException e4) {
                        e = e4;
                        num2 = num;
                        l().L().b("Measurement manager api exception", e);
                        this.g = Boolean.FALSE;
                        num = num2;
                        l().K().b("Measurement manager api status result", num);
                        return this.g.booleanValue();
                    }
                }
                this.g = Boolean.valueOf(z);
            } catch (InterruptedException e5) {
                e = e5;
            } catch (CancellationException e6) {
                e = e6;
            } catch (ExecutionException e7) {
                e = e7;
            } catch (TimeoutException e8) {
                e = e8;
            }
            l().K().b("Measurement manager api status result", num);
        }
        return this.g.booleanValue();
    }

    public static void Y(ea2 ea2Var, String str, int i2, String str2, String str3, int i3) {
        Bundle bundle = new Bundle();
        v0(bundle, i2);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i2 == 6 || i2 == 7 || i2 == 2) {
            bundle.putLong("_el", i3);
        }
        ea2Var.l(str, "_err", bundle);
    }

    public static boolean c0(Context context) {
        ActivityInfo receiverInfo;
        pj0.i(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0)) != null) {
                if (receiverInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    public static boolean d0(Context context, boolean z) {
        pj0.i(context);
        return B0(context, "com.google.android.gms.measurement.AppMeasurementJobService");
    }

    public static boolean e0(Intent intent) {
        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
        return "android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) || "https://www.google.com".equals(stringExtra) || "android-app://com.google.appcrawler".equals(stringExtra);
    }

    public static boolean f0(Bundle bundle, int i2) {
        int i3 = 0;
        if (bundle.size() <= i2) {
            return false;
        }
        for (String str : new TreeSet(bundle.keySet())) {
            i3++;
            if (i3 > i2) {
                bundle.remove(str);
            }
        }
        return true;
    }

    public static boolean g0(Object obj) {
        return (obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle);
    }

    public static boolean l0(String str, String str2, String str3, String str4) {
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean isEmpty2 = TextUtils.isEmpty(str2);
        if (!isEmpty && !isEmpty2) {
            pj0.i(str);
            return !str.equals(str2);
        } else if (isEmpty && isEmpty2) {
            return (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) ? !TextUtils.isEmpty(str4) : !str3.equals(str4);
        } else if (isEmpty || !isEmpty2) {
            return TextUtils.isEmpty(str3) || !str3.equals(str4);
        } else if (TextUtils.isEmpty(str4)) {
            return false;
        } else {
            return TextUtils.isEmpty(str3) || !str3.equals(str4);
        }
    }

    public static boolean m0(String str, String[] strArr) {
        pj0.i(strArr);
        for (String str2 : strArr) {
            if (ga2.a(str, str2)) {
                return true;
            }
        }
        return false;
    }

    public static byte[] p0(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(obtain, 0);
            return obtain.marshall();
        } finally {
            obtain.recycle();
        }
    }

    public static ArrayList t0(List list) {
        if (list == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            lf1 lf1Var = (lf1) it.next();
            Bundle bundle = new Bundle();
            bundle.putString("app_id", lf1Var.m);
            bundle.putString("origin", lf1Var.n);
            bundle.putLong("creation_timestamp", lf1Var.p);
            bundle.putString("name", lf1Var.o.n);
            kz1.b(bundle, pj0.i(lf1Var.o.d()));
            bundle.putBoolean("active", lf1Var.q);
            String str = lf1Var.r;
            if (str != null) {
                bundle.putString("trigger_event_name", str);
            }
            ri1 ri1Var = lf1Var.s;
            if (ri1Var != null) {
                bundle.putString("timed_out_event_name", ri1Var.m);
                hi1 hi1Var = ri1Var.n;
                if (hi1Var != null) {
                    bundle.putBundle("timed_out_event_params", hi1Var.k());
                }
            }
            bundle.putLong("trigger_timeout", lf1Var.t);
            ri1 ri1Var2 = lf1Var.u;
            if (ri1Var2 != null) {
                bundle.putString("triggered_event_name", ri1Var2.m);
                hi1 hi1Var2 = ri1Var2.n;
                if (hi1Var2 != null) {
                    bundle.putBundle("triggered_event_params", hi1Var2.k());
                }
            }
            bundle.putLong("triggered_timestamp", lf1Var.o.o);
            bundle.putLong("time_to_live", lf1Var.v);
            ri1 ri1Var3 = lf1Var.w;
            if (ri1Var3 != null) {
                bundle.putString("expired_event_name", ri1Var3.m);
                hi1 hi1Var3 = ri1Var3.n;
                if (hi1Var3 != null) {
                    bundle.putBundle("expired_event_params", hi1Var3.k());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    public static boolean v0(Bundle bundle, int i2) {
        if (bundle != null && bundle.getLong("_err") == 0) {
            bundle.putLong("_err", i2);
            return true;
        }
        return false;
    }

    public static Bundle[] x0(Object obj) {
        if (obj instanceof Bundle) {
            return new Bundle[]{(Bundle) obj};
        }
        if (obj instanceof Parcelable[]) {
            Parcelable[] parcelableArr = (Parcelable[]) obj;
            return (Bundle[]) Arrays.copyOf(parcelableArr, parcelableArr.length, Bundle[].class);
        } else if (obj instanceof ArrayList) {
            ArrayList arrayList = (ArrayList) obj;
            return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
        } else {
            return null;
        }
    }

    public static long y(long j2, long j3) {
        return (j2 + (j3 * 60000)) / 86400000;
    }

    public static int y0() {
        int extensionVersion;
        int extensionVersion2;
        if (Build.VERSION.SDK_INT >= 30) {
            extensionVersion = SdkExtensions.getExtensionVersion(30);
            if (extensionVersion > 3) {
                extensionVersion2 = SdkExtensions.getExtensionVersion(1000000);
                return extensionVersion2;
            }
            return 0;
        }
        return 0;
    }

    public final Object A0(String str, Object obj) {
        return "_ldl".equals(str) ? H(O0(str), obj, true, false) : H(O0(str), obj, false, false);
    }

    public final Bundle C(Uri uri, boolean z, boolean z2) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        if (uri == null) {
            return null;
        }
        try {
            if (uri.isHierarchical()) {
                str = uri.getQueryParameter("utm_campaign");
                str2 = uri.getQueryParameter("utm_source");
                str3 = uri.getQueryParameter("utm_medium");
                str4 = uri.getQueryParameter("gclid");
                str5 = z2 ? uri.getQueryParameter("gbraid") : null;
                str6 = uri.getQueryParameter("utm_id");
                str7 = uri.getQueryParameter("dclid");
                str8 = uri.getQueryParameter("srsltid");
                str9 = z ? uri.getQueryParameter("sfmc_id") : null;
            } else {
                str = null;
                str2 = null;
                str3 = null;
                str4 = null;
                str5 = null;
                str6 = null;
                str7 = null;
                str8 = null;
                str9 = null;
            }
            if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3) && TextUtils.isEmpty(str4) && ((!z2 || TextUtils.isEmpty(str5)) && TextUtils.isEmpty(str6) && TextUtils.isEmpty(str7) && TextUtils.isEmpty(str8) && (!z || TextUtils.isEmpty(str9)))) {
                return null;
            }
            Bundle bundle = new Bundle();
            if (TextUtils.isEmpty(str)) {
                str10 = "sfmc_id";
            } else {
                str10 = "sfmc_id";
                bundle.putString("campaign", str);
            }
            if (!TextUtils.isEmpty(str2)) {
                bundle.putString("source", str2);
            }
            if (!TextUtils.isEmpty(str3)) {
                bundle.putString("medium", str3);
            }
            if (!TextUtils.isEmpty(str4)) {
                bundle.putString("gclid", str4);
            }
            if (z2 && !TextUtils.isEmpty(str5)) {
                bundle.putString("gbraid", str5);
            }
            String queryParameter = uri.getQueryParameter("utm_term");
            if (!TextUtils.isEmpty(queryParameter)) {
                bundle.putString("term", queryParameter);
            }
            String queryParameter2 = uri.getQueryParameter("utm_content");
            if (!TextUtils.isEmpty(queryParameter2)) {
                bundle.putString("content", queryParameter2);
            }
            String queryParameter3 = uri.getQueryParameter("aclid");
            if (!TextUtils.isEmpty(queryParameter3)) {
                bundle.putString("aclid", queryParameter3);
            }
            String queryParameter4 = uri.getQueryParameter("cp1");
            if (!TextUtils.isEmpty(queryParameter4)) {
                bundle.putString("cp1", queryParameter4);
            }
            String queryParameter5 = uri.getQueryParameter("anid");
            if (!TextUtils.isEmpty(queryParameter5)) {
                bundle.putString("anid", queryParameter5);
            }
            if (!TextUtils.isEmpty(str6)) {
                bundle.putString("campaign_id", str6);
            }
            if (!TextUtils.isEmpty(str7)) {
                bundle.putString("dclid", str7);
            }
            String queryParameter6 = uri.getQueryParameter("utm_source_platform");
            if (!TextUtils.isEmpty(queryParameter6)) {
                bundle.putString("source_platform", queryParameter6);
            }
            String queryParameter7 = uri.getQueryParameter("utm_creative_format");
            if (!TextUtils.isEmpty(queryParameter7)) {
                bundle.putString("creative_format", queryParameter7);
            }
            String queryParameter8 = uri.getQueryParameter("utm_marketing_tactic");
            if (!TextUtils.isEmpty(queryParameter8)) {
                bundle.putString("marketing_tactic", queryParameter8);
            }
            if (!TextUtils.isEmpty(str8)) {
                bundle.putString("srsltid", str8);
            }
            if (z && !TextUtils.isEmpty(str9)) {
                bundle.putString(str10, str9);
            }
            return bundle;
        } catch (UnsupportedOperationException e) {
            l().L().b("Install referrer url isn't a hierarchical URI", e);
            return null;
        }
    }

    public final boolean C0(String str, String str2) {
        if (str2 == null) {
            l().H().b("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.length() == 0) {
            l().H().b("Name is required and can't be empty. Type", str);
            return false;
        } else {
            int codePointAt = str2.codePointAt(0);
            if (!Character.isLetter(codePointAt)) {
                l().H().c("Name must start with a letter. Type, name", str, str2);
                return false;
            }
            int length = str2.length();
            int charCount = Character.charCount(codePointAt);
            while (charCount < length) {
                int codePointAt2 = str2.codePointAt(charCount);
                if (codePointAt2 != 95 && !Character.isLetterOrDigit(codePointAt2)) {
                    l().H().c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                    return false;
                }
                charCount += Character.charCount(codePointAt2);
            }
            return true;
        }
    }

    public final Bundle E(String str, String str2, Bundle bundle, List list, boolean z) {
        int N0;
        int i2;
        aa2 aa2Var = this;
        boolean m0 = m0(str2, qz1.d);
        if (bundle != null) {
            Bundle bundle2 = new Bundle(bundle);
            int E = e().E();
            int i3 = 0;
            for (String str3 : new TreeSet(bundle.keySet())) {
                if (list == null || !list.contains(str3)) {
                    N0 = !z ? aa2Var.N0(str3) : 0;
                    if (N0 == 0) {
                        N0 = aa2Var.M0(str3);
                    }
                } else {
                    N0 = 0;
                }
                if (N0 != 0) {
                    K(bundle2, N0, str3, str3, N0 == 3 ? str3 : null);
                    bundle2.remove(str3);
                    i2 = E;
                } else {
                    i2 = E;
                    int x = x(str, str2, str3, bundle.get(str3), bundle2, list, z, m0);
                    if (x == 17) {
                        K(bundle2, x, str3, str3, Boolean.FALSE);
                    } else if (x != 0 && !"_ev".equals(str3)) {
                        K(bundle2, x, x == 21 ? str2 : str3, str3, bundle.get(str3));
                        bundle2.remove(str3);
                    }
                    if (J0(str3)) {
                        int i4 = i3 + 1;
                        if (i4 > i2) {
                            l().H().c("Event can't contain more than " + i2 + " params", g().c(str2), g().a(bundle));
                            v0(bundle2, 5);
                            bundle2.remove(str3);
                        }
                        i3 = i4;
                    }
                }
                E = i2;
                aa2Var = this;
            }
            return bundle2;
        }
        return null;
    }

    public final boolean E0(String str) {
        n();
        if (va1.a(a()).a(str) == 0) {
            return true;
        }
        l().F().b("Permission not granted", str);
        return false;
    }

    public final boolean F0(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return e().N().equals(str);
    }

    public final ri1 G(String str, String str2, Bundle bundle, String str3, long j2, boolean z, boolean z2) {
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        if (v(str2) != 0) {
            l().G().b("Invalid conditional property event name", g().g(str2));
            throw new IllegalArgumentException();
        }
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        bundle2.putString("_o", str3);
        Bundle E = E(str, str2, bundle2, oc.b("_o"), true);
        if (z) {
            E = r0(E);
        }
        pj0.i(E);
        return new ri1(str2, new hi1(E), str3, j2);
    }

    public final int G0() {
        if (this.h == null) {
            this.h = Integer.valueOf(ey.f().a(a()) / 1000);
        }
        return this.h.intValue();
    }

    public final Object H(int i2, Object obj, boolean z, boolean z2) {
        Parcelable[] parcelableArr;
        Bundle r0;
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf(((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf(((Short) obj).shortValue());
        }
        if (obj instanceof Boolean) {
            return Long.valueOf(((Boolean) obj).booleanValue() ? 1L : 0L);
        } else if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        } else {
            if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
                return I(String.valueOf(obj), i2, z);
            }
            if (z2 && ((obj instanceof Bundle[]) || (obj instanceof Parcelable[]))) {
                ArrayList arrayList = new ArrayList();
                for (Parcelable parcelable : (Parcelable[]) obj) {
                    if ((parcelable instanceof Bundle) && (r0 = r0((Bundle) parcelable)) != null && !r0.isEmpty()) {
                        arrayList.add(r0);
                    }
                }
                return arrayList.toArray(new Bundle[arrayList.size()]);
            }
            return null;
        }
    }

    public final long I0() {
        int extensionVersion;
        long j2;
        n();
        if (D0(this.a.B().F())) {
            if (Build.VERSION.SDK_INT < 30) {
                j2 = 4;
            } else {
                extensionVersion = SdkExtensions.getExtensionVersion(30);
                j2 = extensionVersion < 4 ? 8L : y0() < ((Integer) vi1.X.a(null)).intValue() ? 16L : 0L;
            }
            if (!E0("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")) {
                j2 |= 2;
            }
            if (j2 == 0 && !X0()) {
                j2 |= 64;
            }
            if (j2 == 0) {
                return 1L;
            }
            return j2;
        }
        return 0L;
    }

    public final URL J(long j2, String str, String str2, long j3, String str3) {
        try {
            pj0.e(str2);
            pj0.e(str);
            String format = String.format("https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=%s&rdid=%s&bundleid=%s&retry=%s", String.format("v%s.%s", Long.valueOf(j2), Integer.valueOf(G0())), str2, str, Long.valueOf(j3));
            if (str.equals(e().O())) {
                format = format.concat("&ddl_test=1");
            }
            if (!str3.isEmpty()) {
                if (str3.charAt(0) != '&') {
                    format = format.concat("&");
                }
                format = format.concat(str3);
            }
            return new URL(format);
        } catch (IllegalArgumentException e) {
            e = e;
            l().G().b("Failed to create BOW URL for Deferred Deep Link. exception", e.getMessage());
            return null;
        } catch (MalformedURLException e2) {
            e = e2;
            l().G().b("Failed to create BOW URL for Deferred Deep Link. exception", e.getMessage());
            return null;
        }
    }

    public final boolean K0(String str) {
        List<ResolveInfo> queryIntentActivities;
        return (TextUtils.isEmpty(str) || (queryIntentActivities = a().getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(str)), 0)) == null || queryIntentActivities.isEmpty()) ? false : true;
    }

    public final void L(Bundle bundle, long j2) {
        long j3 = bundle.getLong("_et");
        if (j3 != 0) {
            l().L().b("Params already contained engagement", Long.valueOf(j3));
        }
        bundle.putLong("_et", j2 + j3);
    }

    public final void M(Bundle bundle, Bundle bundle2) {
        if (bundle2 == null) {
            return;
        }
        for (String str : bundle2.keySet()) {
            if (!bundle.containsKey(str)) {
                j().N(bundle, str, bundle2.get(str));
            }
        }
    }

    public final int M0(String str) {
        if (w0("event param", str)) {
            if (n0("event param", null, str)) {
                return !i0("event param", 40, str) ? 3 : 0;
            }
            return 14;
        }
        return 3;
    }

    public final void N(Bundle bundle, String str, Object obj) {
        if (bundle == null) {
            return;
        }
        if (obj instanceof Long) {
            bundle.putLong(str, ((Long) obj).longValue());
        } else if (obj instanceof String) {
            bundle.putString(str, String.valueOf(obj));
        } else if (obj instanceof Double) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
        } else if (obj instanceof Bundle[]) {
            bundle.putParcelableArray(str, (Bundle[]) obj);
        } else if (str != null) {
            l().M().c("Not putting event parameter. Invalid value type. name, type", g().f(str), obj != null ? obj.getClass().getSimpleName() : null);
        }
    }

    public final int N0(String str) {
        if (C0("event param", str)) {
            if (n0("event param", null, str)) {
                return !i0("event param", 40, str) ? 3 : 0;
            }
            return 14;
        }
        return 3;
    }

    public final void O(km1 km1Var, int i2) {
        Bundle bundle = new Bundle();
        bundle.putInt("r", i2);
        try {
            km1Var.f(bundle);
        } catch (RemoteException e) {
            this.a.l().L().b("Error returning int value to wrapper", e);
        }
    }

    public final void P(km1 km1Var, long j2) {
        Bundle bundle = new Bundle();
        bundle.putLong("r", j2);
        try {
            km1Var.f(bundle);
        } catch (RemoteException e) {
            this.a.l().L().b("Error returning long value to wrapper", e);
        }
    }

    public final long P0() {
        long andIncrement;
        long j2;
        if (this.d.get() != 0) {
            synchronized (this.d) {
                this.d.compareAndSet(-1L, 1L);
                andIncrement = this.d.getAndIncrement();
            }
            return andIncrement;
        }
        synchronized (this.d) {
            long nextLong = new Random(System.nanoTime() ^ b().a()).nextLong();
            int i2 = this.e + 1;
            this.e = i2;
            j2 = nextLong + i2;
        }
        return j2;
    }

    public final void Q(km1 km1Var, Bundle bundle) {
        try {
            km1Var.f(bundle);
        } catch (RemoteException e) {
            this.a.l().L().b("Error returning bundle value to wrapper", e);
        }
    }

    public final nc0 Q0() {
        if (this.f == null) {
            this.f = nc0.a(a());
        }
        return this.f;
    }

    public final void R(km1 km1Var, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("r", str);
        try {
            km1Var.f(bundle);
        } catch (RemoteException e) {
            this.a.l().L().b("Error returning string value to wrapper", e);
        }
    }

    public final void S(km1 km1Var, ArrayList arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", arrayList);
        try {
            km1Var.f(bundle);
        } catch (RemoteException e) {
            this.a.l().L().b("Error returning bundle list to wrapper", e);
        }
    }

    public final String S0() {
        byte[] bArr = new byte[16];
        U0().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    public final void T(km1 km1Var, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("r", z);
        try {
            km1Var.f(bundle);
        } catch (RemoteException e) {
            this.a.l().L().b("Error returning boolean value to wrapper", e);
        }
    }

    public final void U(km1 km1Var, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("r", bArr);
        try {
            km1Var.f(bundle);
        } catch (RemoteException e) {
            this.a.l().L().b("Error returning byte array to wrapper", e);
        }
    }

    public final SecureRandom U0() {
        n();
        if (this.c == null) {
            this.c = new SecureRandom();
        }
        return this.c;
    }

    public final void V(zt1 zt1Var, int i2) {
        int i3 = 0;
        for (String str : new TreeSet(zt1Var.d.keySet())) {
            if (J0(str) && (i3 = i3 + 1) > i2) {
                l().H().c("Event can't contain more than " + i2 + " params", g().c(zt1Var.a), g().a(zt1Var.d));
                v0(zt1Var.d, 5);
                zt1Var.d.remove(str);
            }
        }
    }

    public final boolean V0() {
        n();
        return I0() == 1;
    }

    public final boolean W0() {
        try {
            a().getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public final void Z(String str, String str2, String str3, Bundle bundle, List list, boolean z) {
        int N0;
        String str4;
        int x;
        if (bundle == null) {
            return;
        }
        int v = e().v();
        int i2 = 0;
        for (String str5 : new TreeSet(bundle.keySet())) {
            if (list == null || !list.contains(str5)) {
                N0 = !z ? N0(str5) : 0;
                if (N0 == 0) {
                    N0 = M0(str5);
                }
            } else {
                N0 = 0;
            }
            if (N0 != 0) {
                K(bundle, N0, str5, str5, N0 == 3 ? str5 : null);
                bundle.remove(str5);
            } else {
                if (g0(bundle.get(str5))) {
                    l().M().d("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", str2, str3, str5);
                    x = 22;
                    str4 = str5;
                } else {
                    str4 = str5;
                    x = x(str, str2, str5, bundle.get(str5), bundle, list, z, false);
                }
                if (x != 0 && !"_ev".equals(str4)) {
                    K(bundle, x, str4, str4, bundle.get(str4));
                    bundle.remove(str4);
                } else if (J0(str4) && !m0(str4, uz1.d)) {
                    int i3 = i2 + 1;
                    if (!b0(231100000, true)) {
                        l().H().c("Item array not supported on client's version of Google Play Services (Android Only)", g().c(str2), g().a(bundle));
                        v0(bundle, 23);
                        bundle.remove(str4);
                    } else if (i3 > v) {
                        if (bc2.a() && e().s(vi1.I0)) {
                            vt1 H = l().H();
                            H.c("Item can't contain more than " + v + " item-scoped custom params", g().c(str2), g().a(bundle));
                            v0(bundle, 28);
                            bundle.remove(str4);
                        } else {
                            l().H().c("Item cannot contain custom parameters", g().c(str2), g().a(bundle));
                            v0(bundle, 23);
                            bundle.remove(str4);
                        }
                    }
                    i2 = i3;
                }
            }
        }
    }

    @Override // androidx.appcompat.view.menu.iz1, androidx.appcompat.view.menu.lz1
    public final /* bridge */ /* synthetic */ Context a() {
        return super.a();
    }

    public final void a0(Parcelable[] parcelableArr, int i2, boolean z) {
        pj0.i(parcelableArr);
        for (Parcelable parcelable : parcelableArr) {
            Bundle bundle = (Bundle) parcelable;
            int i3 = 0;
            for (String str : new TreeSet(bundle.keySet())) {
                if (J0(str) && !m0(str, uz1.d) && (i3 = i3 + 1) > i2) {
                    if (z) {
                        l().H().c("Param can't contain more than " + i2 + " item-scoped custom parameters", g().f(str), g().a(bundle));
                        v0(bundle, 28);
                    } else {
                        l().H().c("Param cannot contain item-scoped custom parameters", g().f(str), g().a(bundle));
                        v0(bundle, 23);
                    }
                    bundle.remove(str);
                }
            }
        }
    }

    @Override // androidx.appcompat.view.menu.iz1, androidx.appcompat.view.menu.lz1
    public final /* bridge */ /* synthetic */ cc b() {
        return super.b();
    }

    public final boolean b0(int i2, boolean z) {
        Boolean W = this.a.J().W();
        if (G0() < i2 / 1000) {
            return (W == null || W.booleanValue()) ? false : true;
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.iz1, androidx.appcompat.view.menu.lz1
    public final /* bridge */ /* synthetic */ pf1 d() {
        return super.d();
    }

    @Override // androidx.appcompat.view.menu.iz1
    public final /* bridge */ /* synthetic */ tf1 e() {
        return super.e();
    }

    @Override // androidx.appcompat.view.menu.iz1
    public final /* bridge */ /* synthetic */ fi1 f() {
        return super.f();
    }

    @Override // androidx.appcompat.view.menu.iz1
    public final /* bridge */ /* synthetic */ pt1 g() {
        return super.g();
    }

    @Override // androidx.appcompat.view.menu.iz1, androidx.appcompat.view.menu.lz1
    public final /* bridge */ /* synthetic */ mw1 h() {
        return super.h();
    }

    public final boolean h0(String str, double d) {
        try {
            SharedPreferences.Editor edit = a().getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
            edit.putString("deeplink", str);
            edit.putLong("timestamp", Double.doubleToRawLongBits(d));
            return edit.commit();
        } catch (RuntimeException e) {
            l().G().b("Failed to persist Deferred Deep Link. exception", e);
            return false;
        }
    }

    @Override // androidx.appcompat.view.menu.iz1
    public final /* bridge */ /* synthetic */ wu1 i() {
        return super.i();
    }

    public final boolean i0(String str, int i2, String str2) {
        if (str2 == null) {
            l().H().b("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.codePointCount(0, str2.length()) > i2) {
            l().H().d("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i2), str2);
            return false;
        } else {
            return true;
        }
    }

    @Override // androidx.appcompat.view.menu.iz1
    public final /* bridge */ /* synthetic */ aa2 j() {
        return super.j();
    }

    public final boolean j0(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            if (R0(str)) {
                return true;
            }
            if (this.a.r()) {
                l().H().b("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", st1.v(str));
            }
            return false;
        } else if (TextUtils.isEmpty(str2)) {
            if (this.a.r()) {
                l().H().a("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
            }
            return false;
        } else if (R0(str2)) {
            return true;
        } else {
            l().H().b("Invalid admob_app_id. Analytics disabled.", st1.v(str2));
            return false;
        }
    }

    @Override // androidx.appcompat.view.menu.iz1
    public final /* bridge */ /* synthetic */ void k() {
        super.k();
    }

    public final boolean k0(String str, String str2, int i2, Object obj) {
        if (obj != null && !(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Byte) && !(obj instanceof Short) && !(obj instanceof Boolean) && !(obj instanceof Double)) {
            if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
                return false;
            }
            String valueOf = String.valueOf(obj);
            if (valueOf.codePointCount(0, valueOf.length()) > i2) {
                l().M().d("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(valueOf.length()));
                return false;
            }
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.iz1, androidx.appcompat.view.menu.lz1
    public final /* bridge */ /* synthetic */ st1 l() {
        return super.l();
    }

    @Override // androidx.appcompat.view.menu.iz1
    public final /* bridge */ /* synthetic */ void m() {
        super.m();
    }

    @Override // androidx.appcompat.view.menu.iz1
    public final /* bridge */ /* synthetic */ void n() {
        super.n();
    }

    public final boolean n0(String str, String[] strArr, String str2) {
        return o0(str, strArr, null, str2);
    }

    public final boolean o0(String str, String[] strArr, String[] strArr2, String str2) {
        if (str2 == null) {
            l().H().b("Name is required and can't be null. Type", str);
            return false;
        }
        pj0.i(str2);
        for (String str3 : i) {
            if (str2.startsWith(str3)) {
                l().H().c("Name starts with reserved prefix. Type, name", str, str2);
                return false;
            }
        }
        if (strArr == null || !m0(str2, strArr)) {
            return true;
        }
        if (strArr2 == null || !m0(str2, strArr2)) {
            l().H().c("Name is reserved. Type, name", str, str2);
            return false;
        }
        return true;
    }

    public final int q0(String str) {
        if (w0("user property", str)) {
            if (n0("user property", rz1.a, str)) {
                return !i0("user property", 24, str) ? 6 : 0;
            }
            return 15;
        }
        return 6;
    }

    public final Bundle r0(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object s0 = s0(str, bundle.get(str));
                if (s0 == null) {
                    l().M().b("Param value can't be null", g().f(str));
                } else {
                    N(bundle2, str, s0);
                }
            }
        }
        return bundle2;
    }

    @Override // androidx.appcompat.view.menu.gz1
    public final boolean s() {
        return true;
    }

    public final Object s0(String str, Object obj) {
        if ("_ev".equals(str)) {
            return H(e().w(this.a.B().F()), obj, true, true);
        }
        return H(H0(str) ? e().w(this.a.B().F()) : e().t(this.a.B().F()), obj, false, true);
    }

    @Override // androidx.appcompat.view.menu.gz1
    public final void t() {
        n();
        SecureRandom secureRandom = new SecureRandom();
        long nextLong = secureRandom.nextLong();
        if (nextLong == 0) {
            nextLong = secureRandom.nextLong();
            if (nextLong == 0) {
                l().L().a("Utils falling back to Random for random id");
            }
        }
        this.d.set(nextLong);
    }

    public final int u(int i2) {
        return ey.f().h(a(), ky.a);
    }

    public final boolean u0(Context context, String str) {
        Signature[] signatureArr;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo e = va1.a(context).e(str, 64);
            if (e == null || (signatureArr = e.signatures) == null || signatureArr.length <= 0) {
                return true;
            }
            return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
        } catch (PackageManager.NameNotFoundException e2) {
            l().G().b("Package name not found", e2);
            return true;
        } catch (CertificateException e3) {
            l().G().b("Error obtaining certificate", e3);
            return true;
        }
    }

    public final int v(String str) {
        if (w0("event", str)) {
            if (o0("event", qz1.a, qz1.b, str)) {
                return !i0("event", 40, str) ? 2 : 0;
            }
            return 13;
        }
        return 2;
    }

    public final int w(String str, Object obj) {
        return "_ldl".equals(str) ? k0("user property referrer", str, O0(str), obj) : k0("user property", str, O0(str), obj) ? 0 : 7;
    }

    public final boolean w0(String str, String str2) {
        if (str2 == null) {
            l().H().b("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.length() == 0) {
            l().H().b("Name is required and can't be empty. Type", str);
            return false;
        } else {
            int codePointAt = str2.codePointAt(0);
            if (!Character.isLetter(codePointAt) && codePointAt != 95) {
                l().H().c("Name must start with a letter or _ (underscore). Type, name", str, str2);
                return false;
            }
            int length = str2.length();
            int charCount = Character.charCount(codePointAt);
            while (charCount < length) {
                int codePointAt2 = str2.codePointAt(charCount);
                if (codePointAt2 != 95 && !Character.isLetterOrDigit(codePointAt2)) {
                    l().H().c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                    return false;
                }
                charCount += Character.charCount(codePointAt2);
            }
            return true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00c3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int x(java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.Object r17, android.os.Bundle r18, java.util.List r19, boolean r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.aa2.x(java.lang.String, java.lang.String, java.lang.String, java.lang.Object, android.os.Bundle, java.util.List, boolean, boolean):int");
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0066 -> B:19:0x0073). Please submit an issue!!! */
    public final long z(Context context, String str) {
        n();
        pj0.i(context);
        pj0.e(str);
        PackageManager packageManager = context.getPackageManager();
        MessageDigest T0 = T0();
        long j2 = -1;
        if (T0 == null) {
            l().G().a("Could not get MD5 instance");
        } else {
            if (packageManager != null) {
                try {
                } catch (PackageManager.NameNotFoundException e) {
                    l().G().b("Package name not found", e);
                }
                if (!u0(context, str)) {
                    Signature[] signatureArr = va1.a(context).e(a().getPackageName(), 64).signatures;
                    if (signatureArr == null || signatureArr.length <= 0) {
                        l().L().a("Could not get signatures");
                    } else {
                        j2 = B(T0.digest(signatureArr[0].toByteArray()));
                    }
                }
            }
            j2 = 0;
        }
        return j2;
    }

    public final long z0(String str) {
        if (a().getPackageManager() == null) {
            return 0L;
        }
        int i2 = 0;
        try {
            ApplicationInfo c = va1.a(a()).c(str, 0);
            if (c != null) {
                i2 = c.targetSdkVersion;
            }
        } catch (PackageManager.NameNotFoundException unused) {
            l().J().b("PackageManager failed to find running app: app_id", str);
        }
        return i2;
    }
}
