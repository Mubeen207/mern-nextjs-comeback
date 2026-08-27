package androidx.appcompat.view.menu;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.appcompat.view.menu.lr0;
import androidx.appcompat.view.menu.ns1;
import androidx.appcompat.view.menu.oz1;
import androidx.appcompat.view.menu.ps1;
import androidx.appcompat.view.menu.ss1;
import androidx.appcompat.view.menu.ws1;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
/* loaded from: classes.dex */
public final class l92 extends p82 {
    public l92(r82 r82Var) {
        super(r82Var);
    }

    public static ps1 F(ns1 ns1Var, String str) {
        for (ps1 ps1Var : ns1Var.c0()) {
            if (ps1Var.c0().equals(str)) {
                return ps1Var;
            }
        }
        return null;
    }

    public static f42 G(f42 f42Var, byte[] bArr) {
        tz1 a = tz1.a();
        return a != null ? f42Var.m(bArr, a) : f42Var.l(bArr);
    }

    public static String L(boolean z, boolean z2, boolean z3) {
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append("Dynamic ");
        }
        if (z2) {
            sb.append("Sequence ");
        }
        if (z3) {
            sb.append("Session-Scoped ");
        }
        return sb.toString();
    }

    public static List M(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            long j = 0;
            for (int i2 = 0; i2 < 64; i2++) {
                int i3 = (i << 6) + i2;
                if (i3 < bitSet.length()) {
                    if (bitSet.get(i3)) {
                        j |= 1 << i2;
                    }
                }
            }
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    public static void P(Uri.Builder builder, String str, String str2, Set set) {
        if (set.contains(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        builder.appendQueryParameter(str, str2);
    }

    public static void Q(Uri.Builder builder, String[] strArr, Bundle bundle, Set set) {
        for (String str : strArr) {
            String[] split = str.split(",");
            String str2 = split[0];
            String str3 = split[split.length - 1];
            String string = bundle.getString(str2);
            if (string != null) {
                P(builder, str3, string, set);
            }
        }
    }

    public static void R(ns1.a aVar, String str, Object obj) {
        List G = aVar.G();
        int i = 0;
        while (true) {
            if (i >= G.size()) {
                i = -1;
                break;
            } else if (str.equals(((ps1) G.get(i)).c0())) {
                break;
            } else {
                i++;
            }
        }
        ps1.a w = ps1.Z().w(str);
        if (obj instanceof Long) {
            w.t(((Long) obj).longValue());
        } else if (obj instanceof String) {
            w.y((String) obj);
        } else if (obj instanceof Double) {
            w.s(((Double) obj).doubleValue());
        }
        if (i >= 0) {
            aVar.t(i, w);
        } else {
            aVar.w(w);
        }
    }

    public static void V(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
    }

    public static void X(StringBuilder sb, int i, String str, uq1 uq1Var) {
        if (uq1Var == null) {
            return;
        }
        V(sb, i);
        sb.append(str);
        sb.append(" {\n");
        if (uq1Var.N()) {
            Z(sb, i, "comparison_type", uq1Var.G().name());
        }
        if (uq1Var.P()) {
            Z(sb, i, "match_as_float", Boolean.valueOf(uq1Var.M()));
        }
        if (uq1Var.O()) {
            Z(sb, i, "comparison_value", uq1Var.J());
        }
        if (uq1Var.R()) {
            Z(sb, i, "min_comparison_value", uq1Var.L());
        }
        if (uq1Var.Q()) {
            Z(sb, i, "max_comparison_value", uq1Var.K());
        }
        V(sb, i);
        sb.append("}\n");
    }

    public static void Y(StringBuilder sb, int i, String str, us1 us1Var) {
        if (us1Var == null) {
            return;
        }
        V(sb, 3);
        sb.append(str);
        sb.append(" {\n");
        if (us1Var.J() != 0) {
            V(sb, 4);
            sb.append("results: ");
            int i2 = 0;
            for (Long l : us1Var.Z()) {
                int i3 = i2 + 1;
                if (i2 != 0) {
                    sb.append(", ");
                }
                sb.append(l);
                i2 = i3;
            }
            sb.append('\n');
        }
        if (us1Var.R() != 0) {
            V(sb, 4);
            sb.append("status: ");
            int i4 = 0;
            for (Long l2 : us1Var.b0()) {
                int i5 = i4 + 1;
                if (i4 != 0) {
                    sb.append(", ");
                }
                sb.append(l2);
                i4 = i5;
            }
            sb.append('\n');
        }
        if (us1Var.j() != 0) {
            V(sb, 4);
            sb.append("dynamic_filter_timestamps: {");
            int i6 = 0;
            for (ms1 ms1Var : us1Var.Y()) {
                int i7 = i6 + 1;
                if (i6 != 0) {
                    sb.append(", ");
                }
                sb.append(ms1Var.O() ? Integer.valueOf(ms1Var.j()) : null);
                sb.append(":");
                sb.append(ms1Var.N() ? Long.valueOf(ms1Var.K()) : null);
                i6 = i7;
            }
            sb.append("}\n");
        }
        if (us1Var.N() != 0) {
            V(sb, 4);
            sb.append("sequence_filter_timestamps: {");
            int i8 = 0;
            for (vs1 vs1Var : us1Var.a0()) {
                int i9 = i8 + 1;
                if (i8 != 0) {
                    sb.append(", ");
                }
                sb.append(vs1Var.P() ? Integer.valueOf(vs1Var.K()) : null);
                sb.append(": [");
                int i10 = 0;
                for (Long l3 : vs1Var.O()) {
                    long longValue = l3.longValue();
                    int i11 = i10 + 1;
                    if (i10 != 0) {
                        sb.append(", ");
                    }
                    sb.append(longValue);
                    i10 = i11;
                }
                sb.append("]");
                i8 = i9;
            }
            sb.append("}\n");
        }
        V(sb, 3);
        sb.append("}\n");
    }

    public static void Z(StringBuilder sb, int i, String str, Object obj) {
        if (obj == null) {
            return;
        }
        V(sb, i + 1);
        sb.append(str);
        sb.append(": ");
        sb.append(obj);
        sb.append('\n');
    }

    public static boolean c0(ri1 ri1Var, fb2 fb2Var) {
        pj0.i(ri1Var);
        pj0.i(fb2Var);
        return (TextUtils.isEmpty(fb2Var.n) && TextUtils.isEmpty(fb2Var.C)) ? false : true;
    }

    public static boolean d0(List list, int i) {
        if (i < (list.size() << 6)) {
            return ((1 << (i % 64)) & ((Long) list.get(i / 64)).longValue()) != 0;
        }
        return false;
    }

    public static Object e0(ns1 ns1Var, String str) {
        ps1 F = F(ns1Var, str);
        if (F != null) {
            if (F.j0()) {
                return F.d0();
            }
            if (F.h0()) {
                return Long.valueOf(F.X());
            }
            if (F.f0()) {
                return Double.valueOf(F.G());
            }
            if (F.V() > 0) {
                List<ps1> e0 = F.e0();
                ArrayList arrayList = new ArrayList();
                for (ps1 ps1Var : e0) {
                    if (ps1Var != null) {
                        Bundle bundle = new Bundle();
                        for (ps1 ps1Var2 : ps1Var.e0()) {
                            if (ps1Var2.j0()) {
                                bundle.putString(ps1Var2.c0(), ps1Var2.d0());
                            } else if (ps1Var2.h0()) {
                                bundle.putLong(ps1Var2.c0(), ps1Var2.X());
                            } else if (ps1Var2.f0()) {
                                bundle.putDouble(ps1Var2.c0(), ps1Var2.G());
                            }
                        }
                        if (!bundle.isEmpty()) {
                            arrayList.add(bundle);
                        }
                    }
                }
                return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
            }
            return null;
        }
        return null;
    }

    public static boolean f0(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    public static int y(ss1.a aVar, String str) {
        if (aVar == null) {
            return -1;
        }
        for (int i = 0; i < aVar.F(); i++) {
            if (str.equals(aVar.v0(i).Z())) {
                return i;
            }
        }
        return -1;
    }

    public final long A(byte[] bArr) {
        pj0.i(bArr);
        j().n();
        MessageDigest T0 = aa2.T0();
        if (T0 == null) {
            l().G().a("Failed to get MD5");
            return 0L;
        }
        return aa2.B(T0.digest(bArr));
    }

    public final Bundle B(Map map, boolean z) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (!(obj instanceof ArrayList)) {
                bundle.putString(str, obj.toString());
            } else if (z) {
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj2 = arrayList.get(i);
                    i++;
                    arrayList2.add(B((Map) obj2, false));
                }
                bundle.putParcelableArray(str, (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
            }
        }
        return bundle;
    }

    public final Parcelable C(byte[] bArr, Parcelable.Creator creator) {
        if (bArr == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            obtain.unmarshall(bArr, 0, bArr.length);
            obtain.setDataPosition(0);
            return (Parcelable) creator.createFromParcel(obtain);
        } catch (lr0.a unused) {
            l().G().a("Failed to load parcelable from buffer");
            return null;
        } finally {
            obtain.recycle();
        }
    }

    public final ri1 D(kf1 kf1Var) {
        Object obj;
        Bundle B = B(kf1Var.g(), true);
        String obj2 = (!B.containsKey("_o") || (obj = B.get("_o")) == null) ? "app" : obj.toString();
        String b = qz1.b(kf1Var.e());
        if (b == null) {
            b = kf1Var.e();
        }
        return new ri1(b, new hi1(B), obj2, kf1Var.a());
    }

    public final ns1 E(kh1 kh1Var) {
        ns1.a v = ns1.Z().v(kh1Var.e);
        Iterator it = kh1Var.f.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            ps1.a w = ps1.Z().w(str);
            Object p = kh1Var.f.p(str);
            pj0.i(p);
            S(w, p);
            v.w(w);
        }
        return (ns1) ((t02) v.j());
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.appcompat.view.menu.b82 H(java.lang.String r12, androidx.appcompat.view.menu.ss1 r13, androidx.appcompat.view.menu.ns1.a r14, java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 707
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.l92.H(java.lang.String, androidx.appcompat.view.menu.ss1, androidx.appcompat.view.menu.ns1$a, java.lang.String):androidx.appcompat.view.menu.b82");
    }

    public final String I(sq1 sq1Var) {
        if (sq1Var == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nevent_filter {\n");
        if (sq1Var.V()) {
            Z(sb, 0, "filter_id", Integer.valueOf(sq1Var.L()));
        }
        Z(sb, 0, "event_name", g().c(sq1Var.P()));
        String L = L(sq1Var.R(), sq1Var.S(), sq1Var.T());
        if (!L.isEmpty()) {
            Z(sb, 0, "filter_type", L);
        }
        if (sq1Var.U()) {
            X(sb, 1, "event_count_filter", sq1Var.O());
        }
        if (sq1Var.j() > 0) {
            sb.append("  filters {\n");
            for (tq1 tq1Var : sq1Var.Q()) {
                W(sb, 2, tq1Var);
            }
        }
        V(sb, 1);
        sb.append("}\n}\n");
        return sb.toString();
    }

    public final String J(vq1 vq1Var) {
        if (vq1Var == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nproperty_filter {\n");
        if (vq1Var.P()) {
            Z(sb, 0, "filter_id", Integer.valueOf(vq1Var.j()));
        }
        Z(sb, 0, "property_name", g().g(vq1Var.L()));
        String L = L(vq1Var.M(), vq1Var.N(), vq1Var.O());
        if (!L.isEmpty()) {
            Z(sb, 0, "filter_type", L);
        }
        W(sb, 1, vq1Var.I());
        sb.append("}\n");
        return sb.toString();
    }

    public final String K(rs1 rs1Var) {
        ks1 z3;
        if (rs1Var == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nbatch {\n");
        for (ss1 ss1Var : rs1Var.L()) {
            if (ss1Var != null) {
                V(sb, 1);
                sb.append("bundle {\n");
                if (ss1Var.Z0()) {
                    Z(sb, 1, "protocol_version", Integer.valueOf(ss1Var.U1()));
                }
                if (hd2.a() && e().B(ss1Var.D3(), vi1.y0) && ss1Var.c1()) {
                    Z(sb, 1, "session_stitching_token", ss1Var.p0());
                }
                Z(sb, 1, "platform", ss1Var.n0());
                if (ss1Var.U0()) {
                    Z(sb, 1, "gmp_version", Long.valueOf(ss1Var.d3()));
                }
                if (ss1Var.h1()) {
                    Z(sb, 1, "uploading_gmp_version", Long.valueOf(ss1Var.w3()));
                }
                if (ss1Var.S0()) {
                    Z(sb, 1, "dynamite_version", Long.valueOf(ss1Var.Q2()));
                }
                if (ss1Var.B0()) {
                    Z(sb, 1, "config_version", Long.valueOf(ss1Var.C2()));
                }
                Z(sb, 1, "gmp_app_id", ss1Var.k0());
                Z(sb, 1, "admob_app_id", ss1Var.C3());
                Z(sb, 1, "app_id", ss1Var.D3());
                Z(sb, 1, "app_version", ss1Var.d0());
                if (ss1Var.y0()) {
                    Z(sb, 1, "app_version_major", Integer.valueOf(ss1Var.D0()));
                }
                Z(sb, 1, "firebase_instance_id", ss1Var.j0());
                if (ss1Var.R0()) {
                    Z(sb, 1, "dev_cert_hash", Long.valueOf(ss1Var.J2()));
                }
                Z(sb, 1, "app_store", ss1Var.F3());
                if (ss1Var.g1()) {
                    Z(sb, 1, "upload_timestamp_millis", Long.valueOf(ss1Var.t3()));
                }
                if (ss1Var.d1()) {
                    Z(sb, 1, "start_timestamp_millis", Long.valueOf(ss1Var.n3()));
                }
                if (ss1Var.T0()) {
                    Z(sb, 1, "end_timestamp_millis", Long.valueOf(ss1Var.X2()));
                }
                if (ss1Var.Y0()) {
                    Z(sb, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(ss1Var.k3()));
                }
                if (ss1Var.X0()) {
                    Z(sb, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(ss1Var.h3()));
                }
                Z(sb, 1, "app_instance_id", ss1Var.E3());
                Z(sb, 1, "resettable_device_id", ss1Var.o0());
                Z(sb, 1, "ds_id", ss1Var.i0());
                if (ss1Var.W0()) {
                    Z(sb, 1, "limited_ad_tracking", Boolean.valueOf(ss1Var.w0()));
                }
                Z(sb, 1, "os_version", ss1Var.m0());
                Z(sb, 1, "device_model", ss1Var.h0());
                Z(sb, 1, "user_default_language", ss1Var.q0());
                if (ss1Var.f1()) {
                    Z(sb, 1, "time_zone_offset_minutes", Integer.valueOf(ss1Var.m2()));
                }
                if (ss1Var.A0()) {
                    Z(sb, 1, "bundle_sequential_index", Integer.valueOf(ss1Var.i1()));
                }
                if (ss1Var.b1()) {
                    Z(sb, 1, "service_upload", Boolean.valueOf(ss1Var.x0()));
                }
                Z(sb, 1, "health_monitor", ss1Var.l0());
                if (ss1Var.a1()) {
                    Z(sb, 1, "retry_counter", Integer.valueOf(ss1Var.e2()));
                }
                if (ss1Var.P0()) {
                    Z(sb, 1, "consent_signals", ss1Var.f0());
                }
                if (ss1Var.V0()) {
                    Z(sb, 1, "is_dma_region", Boolean.valueOf(ss1Var.v0()));
                }
                if (ss1Var.Q0()) {
                    Z(sb, 1, "core_platform_services", ss1Var.g0());
                }
                if (ss1Var.C0()) {
                    Z(sb, 1, "consent_diagnostics", ss1Var.e0());
                }
                if (ss1Var.e1()) {
                    Z(sb, 1, "target_os_version", Long.valueOf(ss1Var.q3()));
                }
                if (vc2.a() && e().B(ss1Var.D3(), vi1.L0)) {
                    Z(sb, 1, "ad_services_version", Integer.valueOf(ss1Var.j()));
                    if (ss1Var.z0() && (z3 = ss1Var.z3()) != null) {
                        V(sb, 2);
                        sb.append("attribution_eligibility_status {\n");
                        Z(sb, 2, "eligible", Boolean.valueOf(z3.X()));
                        Z(sb, 2, "no_access_adservices_attribution_permission", Boolean.valueOf(z3.b0()));
                        Z(sb, 2, "pre_r", Boolean.valueOf(z3.c0()));
                        Z(sb, 2, "r_extensions_too_old", Boolean.valueOf(z3.d0()));
                        Z(sb, 2, "adservices_extension_too_old", Boolean.valueOf(z3.U()));
                        Z(sb, 2, "ad_storage_not_allowed", Boolean.valueOf(z3.R()));
                        Z(sb, 2, "measurement_manager_disabled", Boolean.valueOf(z3.a0()));
                        V(sb, 2);
                        sb.append("}\n");
                    }
                }
                List<ws1> t0 = ss1Var.t0();
                if (t0 != null) {
                    for (ws1 ws1Var : t0) {
                        if (ws1Var != null) {
                            V(sb, 2);
                            sb.append("user_property {\n");
                            Z(sb, 2, "set_timestamp_millis", ws1Var.e0() ? Long.valueOf(ws1Var.W()) : null);
                            Z(sb, 2, "name", g().g(ws1Var.Z()));
                            Z(sb, 2, "string_value", ws1Var.a0());
                            Z(sb, 2, "int_value", ws1Var.d0() ? Long.valueOf(ws1Var.U()) : null);
                            Z(sb, 2, "double_value", ws1Var.b0() ? Double.valueOf(ws1Var.G()) : null);
                            V(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                List<ls1> r0 = ss1Var.r0();
                ss1Var.D3();
                if (r0 != null) {
                    for (ls1 ls1Var : r0) {
                        if (ls1Var != null) {
                            V(sb, 2);
                            sb.append("audience_membership {\n");
                            if (ls1Var.T()) {
                                Z(sb, 2, "audience_id", Integer.valueOf(ls1Var.j()));
                            }
                            if (ls1Var.U()) {
                                Z(sb, 2, "new_audience", Boolean.valueOf(ls1Var.S()));
                            }
                            Y(sb, 2, "current_data", ls1Var.Q());
                            if (ls1Var.V()) {
                                Y(sb, 2, "previous_data", ls1Var.R());
                            }
                            V(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                List<ns1> s0 = ss1Var.s0();
                if (s0 != null) {
                    for (ns1 ns1Var : s0) {
                        if (ns1Var != null) {
                            V(sb, 2);
                            sb.append("event {\n");
                            Z(sb, 2, "name", g().c(ns1Var.b0()));
                            if (ns1Var.f0()) {
                                Z(sb, 2, "timestamp_millis", Long.valueOf(ns1Var.Y()));
                            }
                            if (ns1Var.e0()) {
                                Z(sb, 2, "previous_timestamp_millis", Long.valueOf(ns1Var.X()));
                            }
                            if (ns1Var.d0()) {
                                Z(sb, 2, "count", Integer.valueOf(ns1Var.j()));
                            }
                            if (ns1Var.T() != 0) {
                                a0(sb, 2, ns1Var.c0());
                            }
                            V(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                V(sb, 1);
                sb.append("}\n");
            }
        }
        sb.append("}\n");
        return sb.toString();
    }

    public final List N(List list, List list2) {
        int i;
        ArrayList arrayList = new ArrayList(list);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (num.intValue() < 0) {
                l().L().b("Ignoring negative bit index to be cleared", num);
            } else {
                int intValue = num.intValue() / 64;
                if (intValue >= arrayList.size()) {
                    l().L().c("Ignoring bit index greater than bitSet size", num, Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(intValue, Long.valueOf(((Long) arrayList.get(intValue)).longValue() & (~(1 << (num.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i2 = size2;
            i = size;
            size = i2;
            if (size < 0 || ((Long) arrayList.get(size)).longValue() != 0) {
                break;
            }
            size2 = size - 1;
        }
        return arrayList.subList(0, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
        r5 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0038, code lost:
        if (r4 == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003a, code lost:
        r3 = (android.os.Parcelable[]) r3;
        r4 = r3.length;
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003e, code lost:
        if (r7 >= r4) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0040, code lost:
        r8 = r3[r7];
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0044, code lost:
        if ((r8 instanceof android.os.Bundle) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0046, code lost:
        r5.add(O((android.os.Bundle) r8, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004f, code lost:
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0054, code lost:
        if ((r3 instanceof java.util.ArrayList) == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0056, code lost:
        r3 = (java.util.ArrayList) r3;
        r4 = r3.size();
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005d, code lost:
        if (r7 >= r4) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005f, code lost:
        r8 = r3.get(r7);
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0067, code lost:
        if ((r8 instanceof android.os.Bundle) == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0069, code lost:
        r5.add(O((android.os.Bundle) r8, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0075, code lost:
        if ((r3 instanceof android.os.Bundle) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0077, code lost:
        r5.add(O((android.os.Bundle) r3, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0080, code lost:
        r0.put(r2, r5);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map O(android.os.Bundle r11, boolean r12) {
        /*
            r10 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Set r1 = r11.keySet()
            java.util.Iterator r1 = r1.iterator()
        Ld:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L84
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r11.get(r2)
            boolean r4 = r3 instanceof android.os.Parcelable[]
            if (r4 != 0) goto L30
            boolean r5 = r3 instanceof java.util.ArrayList
            if (r5 != 0) goto L30
            boolean r5 = r3 instanceof android.os.Bundle
            if (r5 == 0) goto L2a
            goto L30
        L2a:
            if (r3 == 0) goto Ld
            r0.put(r2, r3)
            goto Ld
        L30:
            if (r12 == 0) goto Ld
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r6 = 0
            if (r4 == 0) goto L52
            android.os.Parcelable[] r3 = (android.os.Parcelable[]) r3
            int r4 = r3.length
            r7 = r6
        L3e:
            if (r7 >= r4) goto L80
            r8 = r3[r7]
            boolean r9 = r8 instanceof android.os.Bundle
            if (r9 == 0) goto L4f
            android.os.Bundle r8 = (android.os.Bundle) r8
            java.util.Map r8 = r10.O(r8, r6)
            r5.add(r8)
        L4f:
            int r7 = r7 + 1
            goto L3e
        L52:
            boolean r4 = r3 instanceof java.util.ArrayList
            if (r4 == 0) goto L73
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            int r4 = r3.size()
            r7 = r6
        L5d:
            if (r7 >= r4) goto L80
            java.lang.Object r8 = r3.get(r7)
            int r7 = r7 + 1
            boolean r9 = r8 instanceof android.os.Bundle
            if (r9 == 0) goto L5d
            android.os.Bundle r8 = (android.os.Bundle) r8
            java.util.Map r8 = r10.O(r8, r6)
            r5.add(r8)
            goto L5d
        L73:
            boolean r4 = r3 instanceof android.os.Bundle
            if (r4 == 0) goto L80
            android.os.Bundle r3 = (android.os.Bundle) r3
            java.util.Map r3 = r10.O(r3, r6)
            r5.add(r3)
        L80:
            r0.put(r2, r5)
            goto Ld
        L84:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.l92.O(android.os.Bundle, boolean):java.util.Map");
    }

    public final void S(ps1.a aVar, Object obj) {
        Bundle[] bundleArr;
        pj0.i(obj);
        aVar.B().z().x().A();
        if (obj instanceof String) {
            aVar.y((String) obj);
        } else if (obj instanceof Long) {
            aVar.t(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            aVar.s(((Double) obj).doubleValue());
        } else if (!(obj instanceof Bundle[])) {
            l().G().b("Ignoring invalid (type) event param value", obj);
        } else {
            ArrayList arrayList = new ArrayList();
            for (Bundle bundle : (Bundle[]) obj) {
                if (bundle != null) {
                    ps1.a Z = ps1.Z();
                    for (String str : bundle.keySet()) {
                        ps1.a w = ps1.Z().w(str);
                        Object obj2 = bundle.get(str);
                        if (obj2 instanceof Long) {
                            w.t(((Long) obj2).longValue());
                        } else if (obj2 instanceof String) {
                            w.y((String) obj2);
                        } else if (obj2 instanceof Double) {
                            w.s(((Double) obj2).doubleValue());
                        }
                        Z.u(w);
                    }
                    if (Z.r() > 0) {
                        arrayList.add((ps1) ((t02) Z.j()));
                    }
                }
            }
            aVar.v(arrayList);
        }
    }

    public final void T(ss1.a aVar) {
        l().K().a("Checking account type status for ad personalization signals");
        if (h0(aVar.N0())) {
            l().F().a("Turning off ad personalization due to account type");
            ws1 ws1Var = (ws1) ((t02) ws1.X().u("_npa").w(f().u()).t(1L).j());
            int i = 0;
            while (true) {
                if (i >= aVar.F()) {
                    aVar.B(ws1Var);
                    break;
                } else if ("_npa".equals(aVar.v0(i).Z())) {
                    aVar.v(i, ws1Var);
                    break;
                } else {
                    i++;
                }
            }
            if (qa2.a() && e().s(vi1.T0)) {
                gg1 b = gg1.b(aVar.P0());
                b.d(oz1.a.AD_PERSONALIZATION, eg1.CHILD_ACCOUNT);
                aVar.f0(b.toString());
            }
        }
    }

    public final void U(ws1.a aVar, Object obj) {
        pj0.i(obj);
        aVar.y().v().r();
        if (obj instanceof String) {
            aVar.x((String) obj);
        } else if (obj instanceof Long) {
            aVar.t(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            aVar.s(((Double) obj).doubleValue());
        } else {
            l().G().b("Ignoring invalid (type) user attribute value", obj);
        }
    }

    public final void W(StringBuilder sb, int i, tq1 tq1Var) {
        if (tq1Var == null) {
            return;
        }
        V(sb, i);
        sb.append("filter {\n");
        if (tq1Var.O()) {
            Z(sb, i, "complement", Boolean.valueOf(tq1Var.N()));
        }
        if (tq1Var.Q()) {
            Z(sb, i, "param_name", g().f(tq1Var.M()));
        }
        if (tq1Var.R()) {
            int i2 = i + 1;
            wq1 L = tq1Var.L();
            if (L != null) {
                V(sb, i2);
                sb.append("string_filter");
                sb.append(" {\n");
                if (L.O()) {
                    Z(sb, i2, "match_type", L.G().name());
                }
                if (L.N()) {
                    Z(sb, i2, "expression", L.J());
                }
                if (L.M()) {
                    Z(sb, i2, "case_sensitive", Boolean.valueOf(L.L()));
                }
                if (L.j() > 0) {
                    V(sb, i + 2);
                    sb.append("expression_list {\n");
                    for (String str : L.K()) {
                        V(sb, i + 3);
                        sb.append(str);
                        sb.append("\n");
                    }
                    sb.append("}\n");
                }
                V(sb, i2);
                sb.append("}\n");
            }
        }
        if (tq1Var.P()) {
            X(sb, i + 1, "number_filter", tq1Var.K());
        }
        V(sb, i);
        sb.append("}\n");
    }

    @Override // androidx.appcompat.view.menu.iz1, androidx.appcompat.view.menu.lz1
    public final /* bridge */ /* synthetic */ Context a() {
        return super.a();
    }

    public final void a0(StringBuilder sb, int i, List list) {
        if (list == null) {
            return;
        }
        int i2 = i + 1;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ps1 ps1Var = (ps1) it.next();
            if (ps1Var != null) {
                V(sb, i2);
                sb.append("param {\n");
                Z(sb, i2, "name", ps1Var.i0() ? g().f(ps1Var.c0()) : null);
                Z(sb, i2, "string_value", ps1Var.j0() ? ps1Var.d0() : null);
                Z(sb, i2, "int_value", ps1Var.h0() ? Long.valueOf(ps1Var.X()) : null);
                Z(sb, i2, "double_value", ps1Var.f0() ? Double.valueOf(ps1Var.G()) : null);
                if (ps1Var.V() > 0) {
                    a0(sb, i2, ps1Var.e0());
                }
                V(sb, i2);
                sb.append("}\n");
            }
        }
    }

    @Override // androidx.appcompat.view.menu.iz1, androidx.appcompat.view.menu.lz1
    public final /* bridge */ /* synthetic */ cc b() {
        return super.b();
    }

    public final boolean b0(long j, long j2) {
        return j == 0 || j2 <= 0 || Math.abs(b().a() - j) > j2;
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

    public final byte[] g0(byte[] bArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            l().G().b("Failed to gzip content", e);
            throw e;
        }
    }

    @Override // androidx.appcompat.view.menu.iz1, androidx.appcompat.view.menu.lz1
    public final /* bridge */ /* synthetic */ mw1 h() {
        return super.h();
    }

    public final boolean h0(String str) {
        pj0.i(str);
        uw1 D0 = q().D0(str);
        return D0 != null && f().y() && D0.q() && r().V(str);
    }

    @Override // androidx.appcompat.view.menu.iz1
    public final /* bridge */ /* synthetic */ wu1 i() {
        return super.i();
    }

    public final byte[] i0(byte[] bArr) {
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr2 = new byte[1024];
            while (true) {
                int read = gZIPInputStream.read(bArr2);
                if (read <= 0) {
                    gZIPInputStream.close();
                    byteArrayInputStream.close();
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr2, 0, read);
            }
        } catch (IOException e) {
            l().G().b("Failed to ungzip content", e);
            throw e;
        }
    }

    @Override // androidx.appcompat.view.menu.iz1
    public final /* bridge */ /* synthetic */ aa2 j() {
        return super.j();
    }

    public final List j0() {
        Map c = vi1.c(this.b.a());
        if (c == null || c.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int intValue = ((Integer) vi1.R.a(null)).intValue();
        for (Map.Entry entry : c.entrySet()) {
            if (((String) entry.getKey()).startsWith("measurement.id.")) {
                try {
                    int parseInt = Integer.parseInt((String) entry.getValue());
                    if (parseInt != 0) {
                        arrayList.add(Integer.valueOf(parseInt));
                        if (arrayList.size() >= intValue) {
                            l().L().b("Too many experiment IDs. Number of IDs", Integer.valueOf(arrayList.size()));
                            break;
                        }
                        continue;
                    } else {
                        continue;
                    }
                } catch (NumberFormatException e) {
                    l().L().b("Experiment ID NumberFormatException", e);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    @Override // androidx.appcompat.view.menu.iz1
    public final /* bridge */ /* synthetic */ void k() {
        super.k();
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

    @Override // androidx.appcompat.view.menu.j82
    public final /* bridge */ /* synthetic */ l92 o() {
        return super.o();
    }

    @Override // androidx.appcompat.view.menu.j82
    public final /* bridge */ /* synthetic */ ze2 p() {
        return super.p();
    }

    @Override // androidx.appcompat.view.menu.j82
    public final /* bridge */ /* synthetic */ og1 q() {
        return super.q();
    }

    @Override // androidx.appcompat.view.menu.j82
    public final /* bridge */ /* synthetic */ uv1 r() {
        return super.r();
    }

    @Override // androidx.appcompat.view.menu.j82
    public final /* bridge */ /* synthetic */ s62 s() {
        return super.s();
    }

    @Override // androidx.appcompat.view.menu.j82
    public final /* bridge */ /* synthetic */ n82 t() {
        return super.t();
    }

    @Override // androidx.appcompat.view.menu.p82
    public final boolean x() {
        return false;
    }

    public final long z(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        return A(str.getBytes(Charset.forName("UTF-8")));
    }
}
