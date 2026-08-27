package androidx.appcompat.view.menu;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import androidx.appcompat.view.menu.rq1;
import androidx.appcompat.view.menu.sq1;
import androidx.appcompat.view.menu.ss1;
import androidx.appcompat.view.menu.t02;
import androidx.appcompat.view.menu.tq1;
import androidx.appcompat.view.menu.us1;
import androidx.appcompat.view.menu.vq1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public final class og1 extends p82 {
    public static final String[] f = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};
    public static final String[] g = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};
    public static final String[] h = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;", "e_tag", "ALTER TABLE apps ADD COLUMN e_tag TEXT;", "session_stitching_token", "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;", "sgtm_upload_enabled", "ALTER TABLE apps ADD COLUMN sgtm_upload_enabled INTEGER;", "target_os_version", "ALTER TABLE apps ADD COLUMN target_os_version INTEGER;", "session_stitching_token_hash", "ALTER TABLE apps ADD COLUMN session_stitching_token_hash INTEGER;", "ad_services_version", "ALTER TABLE apps ADD COLUMN ad_services_version INTEGER;", "unmatched_first_open_without_ad_id", "ALTER TABLE apps ADD COLUMN unmatched_first_open_without_ad_id INTEGER;", "npa_metadata_value", "ALTER TABLE apps ADD COLUMN npa_metadata_value INTEGER;", "attribution_eligibility_status", "ALTER TABLE apps ADD COLUMN attribution_eligibility_status INTEGER;"};
    public static final String[] i = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};
    public static final String[] j = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};
    public static final String[] k = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};
    public static final String[] l = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};
    public static final String[] m = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};
    public static final String[] n = {"consent_source", "ALTER TABLE consent_settings ADD COLUMN consent_source INTEGER;", "dma_consent_settings", "ALTER TABLE consent_settings ADD COLUMN dma_consent_settings TEXT;"};
    public static final String[] o = {"idempotent", "CREATE INDEX IF NOT EXISTS trigger_uris_index ON trigger_uris (app_id);"};
    public final ah1 d;
    public final d82 e;

    public og1(r82 r82Var) {
        super(r82Var);
        this.e = new d82(b());
        this.d = new ah1(this, a(), "google_app_measurement.db");
    }

    public static void T(ContentValues contentValues, String str, Object obj) {
        pj0.e(str);
        pj0.i(obj);
        if (obj instanceof String) {
            contentValues.put(str, (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put(str, (Long) obj);
        } else if (!(obj instanceof Double)) {
            throw new IllegalArgumentException("Invalid value type");
        } else {
            contentValues.put(str, (Double) obj);
        }
    }

    public final long A() {
        return G("select max(timestamp) from raw_events", null, 0L);
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x002d: MOVE  (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:10:0x002d */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.os.Bundle A0(java.lang.String r8) {
        /*
            r7 = this;
            r7.n()
            r7.u()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r7.B()     // Catch: java.lang.Throwable -> Lbc android.database.sqlite.SQLiteException -> Lbe
            java.lang.String r2 = "select parameters from default_event_params where app_id=?"
            java.lang.String[] r3 = new java.lang.String[]{r8}     // Catch: java.lang.Throwable -> Lbc android.database.sqlite.SQLiteException -> Lbe
            android.database.Cursor r1 = r1.rawQuery(r2, r3)     // Catch: java.lang.Throwable -> Lbc android.database.sqlite.SQLiteException -> Lbe
            boolean r2 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L30
            if (r2 != 0) goto L33
            androidx.appcompat.view.menu.st1 r8 = r7.l()     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L30
            androidx.appcompat.view.menu.vt1 r8 = r8.K()     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L30
            java.lang.String r2 = "Default event parameters not found"
            r8.a(r2)     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L30
            r1.close()
            return r0
        L2c:
            r8 = move-exception
            r0 = r1
            goto Ld3
        L30:
            r8 = move-exception
            goto Lc0
        L33:
            r2 = 0
            byte[] r2 = r1.getBlob(r2)     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L30
            androidx.appcompat.view.menu.ns1$a r3 = androidx.appcompat.view.menu.ns1.Z()     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L30 java.io.IOException -> La6
            androidx.appcompat.view.menu.f42 r2 = androidx.appcompat.view.menu.l92.G(r3, r2)     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L30 java.io.IOException -> La6
            androidx.appcompat.view.menu.ns1$a r2 = (androidx.appcompat.view.menu.ns1.a) r2     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L30 java.io.IOException -> La6
            androidx.appcompat.view.menu.z32 r2 = r2.j()     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L30 java.io.IOException -> La6
            androidx.appcompat.view.menu.t02 r2 = (androidx.appcompat.view.menu.t02) r2     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L30 java.io.IOException -> La6
            androidx.appcompat.view.menu.ns1 r2 = (androidx.appcompat.view.menu.ns1) r2     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L30 java.io.IOException -> La6
            r7.o()     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L30
            java.util.List r8 = r2.c0()     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L30
            android.os.Bundle r2 = new android.os.Bundle     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L30
            r2.<init>()     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L30
            java.util.Iterator r8 = r8.iterator()     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L30
        L5a:
            boolean r3 = r8.hasNext()     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L30
            if (r3 == 0) goto La2
            java.lang.Object r3 = r8.next()     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L30
            androidx.appcompat.view.menu.ps1 r3 = (androidx.appcompat.view.menu.ps1) r3     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L30
            java.lang.String r4 = r3.c0()     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L30
            boolean r5 = r3.f0()     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L30
            if (r5 == 0) goto L78
            double r5 = r3.G()     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L30
            r2.putDouble(r4, r5)     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L30
            goto L5a
        L78:
            boolean r5 = r3.g0()     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L30
            if (r5 == 0) goto L86
            float r3 = r3.R()     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L30
            r2.putFloat(r4, r3)     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L30
            goto L5a
        L86:
            boolean r5 = r3.j0()     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L30
            if (r5 == 0) goto L94
            java.lang.String r3 = r3.d0()     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L30
            r2.putString(r4, r3)     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L30
            goto L5a
        L94:
            boolean r5 = r3.h0()     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L30
            if (r5 == 0) goto L5a
            long r5 = r3.X()     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L30
            r2.putLong(r4, r5)     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L30
            goto L5a
        La2:
            r1.close()
            return r2
        La6:
            r2 = move-exception
            androidx.appcompat.view.menu.st1 r3 = r7.l()     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L30
            androidx.appcompat.view.menu.vt1 r3 = r3.G()     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L30
            java.lang.String r4 = "Failed to retrieve default event parameters. appId"
            java.lang.Object r8 = androidx.appcompat.view.menu.st1.v(r8)     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L30
            r3.c(r4, r8, r2)     // Catch: java.lang.Throwable -> L2c android.database.sqlite.SQLiteException -> L30
            r1.close()
            return r0
        Lbc:
            r8 = move-exception
            goto Ld3
        Lbe:
            r8 = move-exception
            r1 = r0
        Lc0:
            androidx.appcompat.view.menu.st1 r2 = r7.l()     // Catch: java.lang.Throwable -> L2c
            androidx.appcompat.view.menu.vt1 r2 = r2.G()     // Catch: java.lang.Throwable -> L2c
            java.lang.String r3 = "Error selecting default event parameters"
            r2.b(r3, r8)     // Catch: java.lang.Throwable -> L2c
            if (r1 == 0) goto Ld2
            r1.close()
        Ld2:
            return r0
        Ld3:
            if (r0 == 0) goto Ld8
            r0.close()
        Ld8:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.og1.A0(java.lang.String):android.os.Bundle");
    }

    public final SQLiteDatabase B() {
        n();
        try {
            return this.d.getWritableDatabase();
        } catch (SQLiteException e) {
            l().L().b("Error opening database", e);
            throw e;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0156  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.appcompat.view.menu.lf1 B0(java.lang.String r36, java.lang.String r37) {
        /*
            Method dump skipped, instructions count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.og1.B0(java.lang.String, java.lang.String):androidx.appcompat.view.menu.lf1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003e  */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.database.Cursor] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String C() {
        /*
            r6 = this;
            android.database.sqlite.SQLiteDatabase r0 = r6.B()
            r1 = 0
            java.lang.String r2 = "select app_id from queue order by has_realtime desc, rowid asc limit 1;"
            android.database.Cursor r0 = r0.rawQuery(r2, r1)     // Catch: java.lang.Throwable -> L22 android.database.sqlite.SQLiteException -> L27
            boolean r2 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L1a android.database.sqlite.SQLiteException -> L1c
            if (r2 == 0) goto L1e
            r2 = 0
            java.lang.String r1 = r0.getString(r2)     // Catch: java.lang.Throwable -> L1a android.database.sqlite.SQLiteException -> L1c
            r0.close()
            return r1
        L1a:
            r1 = move-exception
            goto L3c
        L1c:
            r2 = move-exception
            goto L29
        L1e:
            r0.close()
            return r1
        L22:
            r0 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
            goto L3c
        L27:
            r2 = move-exception
            r0 = r1
        L29:
            androidx.appcompat.view.menu.st1 r3 = r6.l()     // Catch: java.lang.Throwable -> L1a
            androidx.appcompat.view.menu.vt1 r3 = r3.G()     // Catch: java.lang.Throwable -> L1a
            java.lang.String r4 = "Database error getting next bundle app id"
            r3.b(r4, r2)     // Catch: java.lang.Throwable -> L1a
            if (r0 == 0) goto L3b
            r0.close()
        L3b:
            return r1
        L3c:
            if (r0 == 0) goto L41
            r0.close()
        L41:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.og1.C():java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x012c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.appcompat.view.menu.ji1 C0(java.lang.String r29, java.lang.String r30) {
        /*
            Method dump skipped, instructions count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.og1.C0(java.lang.String, java.lang.String):androidx.appcompat.view.menu.ji1");
    }

    public final int D(String str, String str2) {
        pj0.e(str);
        pj0.e(str2);
        n();
        u();
        try {
            return B().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            l().G().d("Error deleting conditional property", st1.v(str), g().g(str2), e);
            return 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01c5 A[Catch: all -> 0x0178, SQLiteException -> 0x017c, TryCatch #2 {all -> 0x0178, blocks: (B:10:0x0112, B:12:0x016f, B:21:0x0180, B:25:0x01ca, B:27:0x01f9, B:32:0x0203, B:36:0x021e, B:38:0x0229, B:39:0x023b, B:41:0x0241, B:43:0x024d, B:45:0x0259, B:46:0x0262, B:48:0x0268, B:50:0x0274, B:52:0x027c, B:56:0x0285, B:57:0x0288, B:59:0x02a0, B:61:0x02ac, B:62:0x02be, B:64:0x02c4, B:66:0x02d0, B:68:0x02d8, B:72:0x02e1, B:73:0x02e4, B:75:0x02ea, B:77:0x02f6, B:84:0x030b, B:80:0x0300, B:83:0x0307, B:85:0x030e, B:87:0x0317, B:35:0x021a, B:24:0x01c5, B:98:0x033d), top: B:105:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x021a A[Catch: all -> 0x0178, SQLiteException -> 0x017c, TryCatch #2 {all -> 0x0178, blocks: (B:10:0x0112, B:12:0x016f, B:21:0x0180, B:25:0x01ca, B:27:0x01f9, B:32:0x0203, B:36:0x021e, B:38:0x0229, B:39:0x023b, B:41:0x0241, B:43:0x024d, B:45:0x0259, B:46:0x0262, B:48:0x0268, B:50:0x0274, B:52:0x027c, B:56:0x0285, B:57:0x0288, B:59:0x02a0, B:61:0x02ac, B:62:0x02be, B:64:0x02c4, B:66:0x02d0, B:68:0x02d8, B:72:0x02e1, B:73:0x02e4, B:75:0x02ea, B:77:0x02f6, B:84:0x030b, B:80:0x0300, B:83:0x0307, B:85:0x030e, B:87:0x0317, B:35:0x021a, B:24:0x01c5, B:98:0x033d), top: B:105:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0229 A[Catch: all -> 0x0178, SQLiteException -> 0x017c, TryCatch #2 {all -> 0x0178, blocks: (B:10:0x0112, B:12:0x016f, B:21:0x0180, B:25:0x01ca, B:27:0x01f9, B:32:0x0203, B:36:0x021e, B:38:0x0229, B:39:0x023b, B:41:0x0241, B:43:0x024d, B:45:0x0259, B:46:0x0262, B:48:0x0268, B:50:0x0274, B:52:0x027c, B:56:0x0285, B:57:0x0288, B:59:0x02a0, B:61:0x02ac, B:62:0x02be, B:64:0x02c4, B:66:0x02d0, B:68:0x02d8, B:72:0x02e1, B:73:0x02e4, B:75:0x02ea, B:77:0x02f6, B:84:0x030b, B:80:0x0300, B:83:0x0307, B:85:0x030e, B:87:0x0317, B:35:0x021a, B:24:0x01c5, B:98:0x033d), top: B:105:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0241 A[Catch: all -> 0x0178, SQLiteException -> 0x017c, TryCatch #2 {all -> 0x0178, blocks: (B:10:0x0112, B:12:0x016f, B:21:0x0180, B:25:0x01ca, B:27:0x01f9, B:32:0x0203, B:36:0x021e, B:38:0x0229, B:39:0x023b, B:41:0x0241, B:43:0x024d, B:45:0x0259, B:46:0x0262, B:48:0x0268, B:50:0x0274, B:52:0x027c, B:56:0x0285, B:57:0x0288, B:59:0x02a0, B:61:0x02ac, B:62:0x02be, B:64:0x02c4, B:66:0x02d0, B:68:0x02d8, B:72:0x02e1, B:73:0x02e4, B:75:0x02ea, B:77:0x02f6, B:84:0x030b, B:80:0x0300, B:83:0x0307, B:85:0x030e, B:87:0x0317, B:35:0x021a, B:24:0x01c5, B:98:0x033d), top: B:105:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0268 A[Catch: all -> 0x0178, SQLiteException -> 0x017c, TryCatch #2 {all -> 0x0178, blocks: (B:10:0x0112, B:12:0x016f, B:21:0x0180, B:25:0x01ca, B:27:0x01f9, B:32:0x0203, B:36:0x021e, B:38:0x0229, B:39:0x023b, B:41:0x0241, B:43:0x024d, B:45:0x0259, B:46:0x0262, B:48:0x0268, B:50:0x0274, B:52:0x027c, B:56:0x0285, B:57:0x0288, B:59:0x02a0, B:61:0x02ac, B:62:0x02be, B:64:0x02c4, B:66:0x02d0, B:68:0x02d8, B:72:0x02e1, B:73:0x02e4, B:75:0x02ea, B:77:0x02f6, B:84:0x030b, B:80:0x0300, B:83:0x0307, B:85:0x030e, B:87:0x0317, B:35:0x021a, B:24:0x01c5, B:98:0x033d), top: B:105:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x02a0 A[Catch: all -> 0x0178, SQLiteException -> 0x017c, TryCatch #2 {all -> 0x0178, blocks: (B:10:0x0112, B:12:0x016f, B:21:0x0180, B:25:0x01ca, B:27:0x01f9, B:32:0x0203, B:36:0x021e, B:38:0x0229, B:39:0x023b, B:41:0x0241, B:43:0x024d, B:45:0x0259, B:46:0x0262, B:48:0x0268, B:50:0x0274, B:52:0x027c, B:56:0x0285, B:57:0x0288, B:59:0x02a0, B:61:0x02ac, B:62:0x02be, B:64:0x02c4, B:66:0x02d0, B:68:0x02d8, B:72:0x02e1, B:73:0x02e4, B:75:0x02ea, B:77:0x02f6, B:84:0x030b, B:80:0x0300, B:83:0x0307, B:85:0x030e, B:87:0x0317, B:35:0x021a, B:24:0x01c5, B:98:0x033d), top: B:105:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x02c4 A[Catch: all -> 0x0178, SQLiteException -> 0x017c, TryCatch #2 {all -> 0x0178, blocks: (B:10:0x0112, B:12:0x016f, B:21:0x0180, B:25:0x01ca, B:27:0x01f9, B:32:0x0203, B:36:0x021e, B:38:0x0229, B:39:0x023b, B:41:0x0241, B:43:0x024d, B:45:0x0259, B:46:0x0262, B:48:0x0268, B:50:0x0274, B:52:0x027c, B:56:0x0285, B:57:0x0288, B:59:0x02a0, B:61:0x02ac, B:62:0x02be, B:64:0x02c4, B:66:0x02d0, B:68:0x02d8, B:72:0x02e1, B:73:0x02e4, B:75:0x02ea, B:77:0x02f6, B:84:0x030b, B:80:0x0300, B:83:0x0307, B:85:0x030e, B:87:0x0317, B:35:0x021a, B:24:0x01c5, B:98:0x033d), top: B:105:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02ea A[Catch: all -> 0x0178, SQLiteException -> 0x017c, TryCatch #2 {all -> 0x0178, blocks: (B:10:0x0112, B:12:0x016f, B:21:0x0180, B:25:0x01ca, B:27:0x01f9, B:32:0x0203, B:36:0x021e, B:38:0x0229, B:39:0x023b, B:41:0x0241, B:43:0x024d, B:45:0x0259, B:46:0x0262, B:48:0x0268, B:50:0x0274, B:52:0x027c, B:56:0x0285, B:57:0x0288, B:59:0x02a0, B:61:0x02ac, B:62:0x02be, B:64:0x02c4, B:66:0x02d0, B:68:0x02d8, B:72:0x02e1, B:73:0x02e4, B:75:0x02ea, B:77:0x02f6, B:84:0x030b, B:80:0x0300, B:83:0x0307, B:85:0x030e, B:87:0x0317, B:35:0x021a, B:24:0x01c5, B:98:0x033d), top: B:105:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0300 A[Catch: all -> 0x0178, SQLiteException -> 0x017c, TryCatch #2 {all -> 0x0178, blocks: (B:10:0x0112, B:12:0x016f, B:21:0x0180, B:25:0x01ca, B:27:0x01f9, B:32:0x0203, B:36:0x021e, B:38:0x0229, B:39:0x023b, B:41:0x0241, B:43:0x024d, B:45:0x0259, B:46:0x0262, B:48:0x0268, B:50:0x0274, B:52:0x027c, B:56:0x0285, B:57:0x0288, B:59:0x02a0, B:61:0x02ac, B:62:0x02be, B:64:0x02c4, B:66:0x02d0, B:68:0x02d8, B:72:0x02e1, B:73:0x02e4, B:75:0x02ea, B:77:0x02f6, B:84:0x030b, B:80:0x0300, B:83:0x0307, B:85:0x030e, B:87:0x0317, B:35:0x021a, B:24:0x01c5, B:98:0x033d), top: B:105:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0317 A[Catch: all -> 0x0178, SQLiteException -> 0x017c, TRY_LEAVE, TryCatch #2 {all -> 0x0178, blocks: (B:10:0x0112, B:12:0x016f, B:21:0x0180, B:25:0x01ca, B:27:0x01f9, B:32:0x0203, B:36:0x021e, B:38:0x0229, B:39:0x023b, B:41:0x0241, B:43:0x024d, B:45:0x0259, B:46:0x0262, B:48:0x0268, B:50:0x0274, B:52:0x027c, B:56:0x0285, B:57:0x0288, B:59:0x02a0, B:61:0x02ac, B:62:0x02be, B:64:0x02c4, B:66:0x02d0, B:68:0x02d8, B:72:0x02e1, B:73:0x02e4, B:75:0x02ea, B:77:0x02f6, B:84:0x030b, B:80:0x0300, B:83:0x0307, B:85:0x030e, B:87:0x0317, B:35:0x021a, B:24:0x01c5, B:98:0x033d), top: B:105:0x000c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.appcompat.view.menu.uw1 D0(java.lang.String r26) {
        /*
            Method dump skipped, instructions count: 858
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.og1.D0(java.lang.String):androidx.appcompat.view.menu.uw1");
    }

    public final long E(ss1 ss1Var) {
        n();
        u();
        pj0.i(ss1Var);
        pj0.e(ss1Var.D3());
        byte[] h2 = ss1Var.h();
        long A = o().A(h2);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", ss1Var.D3());
        contentValues.put("metadata_fingerprint", Long.valueOf(A));
        contentValues.put("metadata", h2);
        try {
            B().insertWithOnConflict("raw_events_metadata", null, contentValues, 4);
            return A;
        } catch (SQLiteException e) {
            l().G().c("Error storing raw event metadata. appId", st1.v(ss1Var.D3()), e);
            throw e;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.appcompat.view.menu.sg1 E0(java.lang.String r13) {
        /*
            r12 = this;
            androidx.appcompat.view.menu.pj0.e(r13)
            r12.n()
            r12.u()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r12.B()     // Catch: java.lang.Throwable -> L71 android.database.sqlite.SQLiteException -> L73
            java.lang.String r2 = "apps"
            r3 = 3
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L71 android.database.sqlite.SQLiteException -> L73
            java.lang.String r4 = "remote_config"
            r9 = 0
            r3[r9] = r4     // Catch: java.lang.Throwable -> L71 android.database.sqlite.SQLiteException -> L73
            java.lang.String r4 = "config_last_modified_time"
            r10 = 1
            r3[r10] = r4     // Catch: java.lang.Throwable -> L71 android.database.sqlite.SQLiteException -> L73
            java.lang.String r4 = "e_tag"
            r11 = 2
            r3[r11] = r4     // Catch: java.lang.Throwable -> L71 android.database.sqlite.SQLiteException -> L73
            java.lang.String r4 = "app_id=?"
            java.lang.String[] r5 = new java.lang.String[]{r13}     // Catch: java.lang.Throwable -> L71 android.database.sqlite.SQLiteException -> L73
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r1 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L71 android.database.sqlite.SQLiteException -> L73
            boolean r2 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L5d android.database.sqlite.SQLiteException -> L60
            if (r2 != 0) goto L39
            r1.close()
            return r0
        L39:
            byte[] r2 = r1.getBlob(r9)     // Catch: java.lang.Throwable -> L5d android.database.sqlite.SQLiteException -> L60
            java.lang.String r3 = r1.getString(r10)     // Catch: java.lang.Throwable -> L5d android.database.sqlite.SQLiteException -> L60
            java.lang.String r4 = r1.getString(r11)     // Catch: java.lang.Throwable -> L5d android.database.sqlite.SQLiteException -> L60
            boolean r5 = r1.moveToNext()     // Catch: java.lang.Throwable -> L5d android.database.sqlite.SQLiteException -> L60
            if (r5 == 0) goto L62
            androidx.appcompat.view.menu.st1 r5 = r12.l()     // Catch: java.lang.Throwable -> L5d android.database.sqlite.SQLiteException -> L60
            androidx.appcompat.view.menu.vt1 r5 = r5.G()     // Catch: java.lang.Throwable -> L5d android.database.sqlite.SQLiteException -> L60
            java.lang.String r6 = "Got multiple records for app config, expected one. appId"
            java.lang.Object r7 = androidx.appcompat.view.menu.st1.v(r13)     // Catch: java.lang.Throwable -> L5d android.database.sqlite.SQLiteException -> L60
            r5.b(r6, r7)     // Catch: java.lang.Throwable -> L5d android.database.sqlite.SQLiteException -> L60
            goto L62
        L5d:
            r13 = move-exception
            r0 = r1
            goto L8c
        L60:
            r2 = move-exception
            goto L75
        L62:
            if (r2 != 0) goto L68
            r1.close()
            return r0
        L68:
            androidx.appcompat.view.menu.sg1 r5 = new androidx.appcompat.view.menu.sg1     // Catch: java.lang.Throwable -> L5d android.database.sqlite.SQLiteException -> L60
            r5.<init>(r2, r3, r4)     // Catch: java.lang.Throwable -> L5d android.database.sqlite.SQLiteException -> L60
            r1.close()
            return r5
        L71:
            r13 = move-exception
            goto L8c
        L73:
            r2 = move-exception
            r1 = r0
        L75:
            androidx.appcompat.view.menu.st1 r3 = r12.l()     // Catch: java.lang.Throwable -> L5d
            androidx.appcompat.view.menu.vt1 r3 = r3.G()     // Catch: java.lang.Throwable -> L5d
            java.lang.String r4 = "Error querying remote config. appId"
            java.lang.Object r13 = androidx.appcompat.view.menu.st1.v(r13)     // Catch: java.lang.Throwable -> L5d
            r3.c(r4, r13, r2)     // Catch: java.lang.Throwable -> L5d
            if (r1 == 0) goto L8b
            r1.close()
        L8b:
            return r0
        L8c:
            if (r0 == 0) goto L91
            r0.close()
        L91:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.og1.E0(java.lang.String):androidx.appcompat.view.menu.sg1");
    }

    public final long F(String str) {
        pj0.e(str);
        n();
        u();
        try {
            return B().delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str, String.valueOf(Math.max(0, Math.min(1000000, e().u(str, vi1.r))))});
        } catch (SQLiteException e) {
            l().G().c("Error deleting over the limit events. appId", st1.v(str), e);
            return 0L;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.appcompat.view.menu.ca2 F0(java.lang.String r14, java.lang.String r15) {
        /*
            r13 = this;
            androidx.appcompat.view.menu.pj0.e(r14)
            androidx.appcompat.view.menu.pj0.e(r15)
            r13.n()
            r13.u()
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r13.B()     // Catch: java.lang.Throwable -> L77 android.database.sqlite.SQLiteException -> L79
            java.lang.String r3 = "user_attributes"
            r0 = 3
            java.lang.String[] r4 = new java.lang.String[r0]     // Catch: java.lang.Throwable -> L77 android.database.sqlite.SQLiteException -> L79
            java.lang.String r0 = "set_timestamp"
            r10 = 0
            r4[r10] = r0     // Catch: java.lang.Throwable -> L77 android.database.sqlite.SQLiteException -> L79
            java.lang.String r0 = "value"
            r11 = 1
            r4[r11] = r0     // Catch: java.lang.Throwable -> L77 android.database.sqlite.SQLiteException -> L79
            java.lang.String r0 = "origin"
            r12 = 2
            r4[r12] = r0     // Catch: java.lang.Throwable -> L77 android.database.sqlite.SQLiteException -> L79
            java.lang.String r5 = "app_id=? and name=?"
            java.lang.String[] r6 = new java.lang.String[]{r14, r15}     // Catch: java.lang.Throwable -> L77 android.database.sqlite.SQLiteException -> L79
            r7 = 0
            r8 = 0
            r9 = 0
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L77 android.database.sqlite.SQLiteException -> L79
            boolean r0 = r2.moveToFirst()     // Catch: java.lang.Throwable -> L6e android.database.sqlite.SQLiteException -> L71
            if (r0 != 0) goto L3c
            r2.close()
            return r1
        L3c:
            long r7 = r2.getLong(r10)     // Catch: java.lang.Throwable -> L6e android.database.sqlite.SQLiteException -> L71
            java.lang.Object r9 = r13.M(r2, r11)     // Catch: java.lang.Throwable -> L6e android.database.sqlite.SQLiteException -> L71
            if (r9 != 0) goto L4a
            r2.close()
            return r1
        L4a:
            java.lang.String r5 = r2.getString(r12)     // Catch: java.lang.Throwable -> L6e android.database.sqlite.SQLiteException -> L71
            androidx.appcompat.view.menu.ca2 r0 = new androidx.appcompat.view.menu.ca2     // Catch: java.lang.Throwable -> L6e android.database.sqlite.SQLiteException -> L71
            r3 = r0
            r4 = r14
            r6 = r15
            r3.<init>(r4, r5, r6, r7, r9)     // Catch: java.lang.Throwable -> L6e android.database.sqlite.SQLiteException -> L71
            boolean r3 = r2.moveToNext()     // Catch: java.lang.Throwable -> L6e android.database.sqlite.SQLiteException -> L71
            if (r3 == 0) goto L73
            androidx.appcompat.view.menu.st1 r3 = r13.l()     // Catch: java.lang.Throwable -> L6e android.database.sqlite.SQLiteException -> L71
            androidx.appcompat.view.menu.vt1 r3 = r3.G()     // Catch: java.lang.Throwable -> L6e android.database.sqlite.SQLiteException -> L71
            java.lang.String r4 = "Got multiple records for user property, expected one. appId"
            java.lang.Object r5 = androidx.appcompat.view.menu.st1.v(r14)     // Catch: java.lang.Throwable -> L6e android.database.sqlite.SQLiteException -> L71
            r3.b(r4, r5)     // Catch: java.lang.Throwable -> L6e android.database.sqlite.SQLiteException -> L71
            goto L73
        L6e:
            r0 = move-exception
            r1 = r2
            goto L9a
        L71:
            r0 = move-exception
            goto L7b
        L73:
            r2.close()
            return r0
        L77:
            r0 = move-exception
            goto L9a
        L79:
            r0 = move-exception
            r2 = r1
        L7b:
            androidx.appcompat.view.menu.st1 r3 = r13.l()     // Catch: java.lang.Throwable -> L6e
            androidx.appcompat.view.menu.vt1 r3 = r3.G()     // Catch: java.lang.Throwable -> L6e
            java.lang.String r4 = "Error querying user property. appId"
            java.lang.Object r5 = androidx.appcompat.view.menu.st1.v(r14)     // Catch: java.lang.Throwable -> L6e
            androidx.appcompat.view.menu.pt1 r6 = r13.g()     // Catch: java.lang.Throwable -> L6e
            java.lang.String r6 = r6.g(r15)     // Catch: java.lang.Throwable -> L6e
            r3.d(r4, r5, r6, r0)     // Catch: java.lang.Throwable -> L6e
            if (r2 == 0) goto L99
            r2.close()
        L99:
            return r1
        L9a:
            if (r1 == 0) goto L9f
            r1.close()
        L9f:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.og1.F0(java.lang.String, java.lang.String):androidx.appcompat.view.menu.ca2");
    }

    public final long G(String str, String[] strArr, long j2) {
        Cursor cursor = null;
        try {
            try {
                cursor = B().rawQuery(str, strArr);
                if (!cursor.moveToFirst()) {
                    cursor.close();
                    return j2;
                }
                long j3 = cursor.getLong(0);
                cursor.close();
                return j3;
            } catch (SQLiteException e) {
                l().G().c("Database error", str, e);
                throw e;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final ih1 G0(String str) {
        if (qa2.a() && e().s(vi1.T0)) {
            pj0.i(str);
            n();
            u();
            return ih1.c(P("select dma_consent_settings from consent_settings where app_id=? limit 1;", new String[]{str}, ""));
        }
        return ih1.f;
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x0036: MOVE  (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:10:0x0036 */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.util.Pair H(java.lang.String r8, java.lang.Long r9) {
        /*
            r7 = this;
            r7.n()
            r7.u()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r7.B()     // Catch: java.lang.Throwable -> L76 android.database.sqlite.SQLiteException -> L78
            java.lang.String r2 = "select main_event, children_to_process from main_event_params where app_id=? and event_id=?"
            r3 = 2
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L76 android.database.sqlite.SQLiteException -> L78
            r4 = 0
            r3[r4] = r8     // Catch: java.lang.Throwable -> L76 android.database.sqlite.SQLiteException -> L78
            java.lang.String r5 = java.lang.String.valueOf(r9)     // Catch: java.lang.Throwable -> L76 android.database.sqlite.SQLiteException -> L78
            r6 = 1
            r3[r6] = r5     // Catch: java.lang.Throwable -> L76 android.database.sqlite.SQLiteException -> L78
            android.database.Cursor r1 = r1.rawQuery(r2, r3)     // Catch: java.lang.Throwable -> L76 android.database.sqlite.SQLiteException -> L78
            boolean r2 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L35 android.database.sqlite.SQLiteException -> L38
            if (r2 != 0) goto L3a
            androidx.appcompat.view.menu.st1 r8 = r7.l()     // Catch: java.lang.Throwable -> L35 android.database.sqlite.SQLiteException -> L38
            androidx.appcompat.view.menu.vt1 r8 = r8.K()     // Catch: java.lang.Throwable -> L35 android.database.sqlite.SQLiteException -> L38
            java.lang.String r9 = "Main event not found"
            r8.a(r9)     // Catch: java.lang.Throwable -> L35 android.database.sqlite.SQLiteException -> L38
            r1.close()
            return r0
        L35:
            r8 = move-exception
            r0 = r1
            goto L8d
        L38:
            r8 = move-exception
            goto L7a
        L3a:
            byte[] r2 = r1.getBlob(r4)     // Catch: java.lang.Throwable -> L35 android.database.sqlite.SQLiteException -> L38
            long r3 = r1.getLong(r6)     // Catch: java.lang.Throwable -> L35 android.database.sqlite.SQLiteException -> L38
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch: java.lang.Throwable -> L35 android.database.sqlite.SQLiteException -> L38
            androidx.appcompat.view.menu.ns1$a r4 = androidx.appcompat.view.menu.ns1.Z()     // Catch: java.lang.Throwable -> L35 android.database.sqlite.SQLiteException -> L38 java.io.IOException -> L60
            androidx.appcompat.view.menu.f42 r2 = androidx.appcompat.view.menu.l92.G(r4, r2)     // Catch: java.lang.Throwable -> L35 android.database.sqlite.SQLiteException -> L38 java.io.IOException -> L60
            androidx.appcompat.view.menu.ns1$a r2 = (androidx.appcompat.view.menu.ns1.a) r2     // Catch: java.lang.Throwable -> L35 android.database.sqlite.SQLiteException -> L38 java.io.IOException -> L60
            androidx.appcompat.view.menu.z32 r2 = r2.j()     // Catch: java.lang.Throwable -> L35 android.database.sqlite.SQLiteException -> L38 java.io.IOException -> L60
            androidx.appcompat.view.menu.t02 r2 = (androidx.appcompat.view.menu.t02) r2     // Catch: java.lang.Throwable -> L35 android.database.sqlite.SQLiteException -> L38 java.io.IOException -> L60
            androidx.appcompat.view.menu.ns1 r2 = (androidx.appcompat.view.menu.ns1) r2     // Catch: java.lang.Throwable -> L35 android.database.sqlite.SQLiteException -> L38 java.io.IOException -> L60
            android.util.Pair r8 = android.util.Pair.create(r2, r3)     // Catch: java.lang.Throwable -> L35 android.database.sqlite.SQLiteException -> L38
            r1.close()
            return r8
        L60:
            r2 = move-exception
            androidx.appcompat.view.menu.st1 r3 = r7.l()     // Catch: java.lang.Throwable -> L35 android.database.sqlite.SQLiteException -> L38
            androidx.appcompat.view.menu.vt1 r3 = r3.G()     // Catch: java.lang.Throwable -> L35 android.database.sqlite.SQLiteException -> L38
            java.lang.String r4 = "Failed to merge main event. appId, eventId"
            java.lang.Object r8 = androidx.appcompat.view.menu.st1.v(r8)     // Catch: java.lang.Throwable -> L35 android.database.sqlite.SQLiteException -> L38
            r3.d(r4, r8, r9, r2)     // Catch: java.lang.Throwable -> L35 android.database.sqlite.SQLiteException -> L38
            r1.close()
            return r0
        L76:
            r8 = move-exception
            goto L8d
        L78:
            r8 = move-exception
            r1 = r0
        L7a:
            androidx.appcompat.view.menu.st1 r9 = r7.l()     // Catch: java.lang.Throwable -> L35
            androidx.appcompat.view.menu.vt1 r9 = r9.G()     // Catch: java.lang.Throwable -> L35
            java.lang.String r2 = "Error selecting main event"
            r9.b(r2, r8)     // Catch: java.lang.Throwable -> L35
            if (r1 == 0) goto L8c
            r1.close()
        L8c:
            return r0
        L8d:
            if (r0 == 0) goto L92
            r0.close()
        L92:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.og1.H(java.lang.String, java.lang.Long):android.util.Pair");
    }

    public final Map H0(String str, String str2) {
        u();
        n();
        pj0.e(str);
        pj0.e(str2);
        o4 o4Var = new o4();
        Cursor cursor = null;
        try {
            try {
                Cursor query = B().query("event_filters", new String[]{"audience_id", "data"}, "app_id=? AND event_name=?", new String[]{str, str2}, null, null, null);
                if (!query.moveToFirst()) {
                    Map emptyMap = Collections.emptyMap();
                    query.close();
                    return emptyMap;
                }
                do {
                    try {
                        sq1 sq1Var = (sq1) ((t02) ((sq1.a) l92.G(sq1.M(), query.getBlob(1))).j());
                        int i2 = query.getInt(0);
                        List list = (List) o4Var.get(Integer.valueOf(i2));
                        if (list == null) {
                            list = new ArrayList();
                            o4Var.put(Integer.valueOf(i2), list);
                        }
                        list.add(sq1Var);
                    } catch (IOException e) {
                        l().G().c("Failed to merge filter. appId", st1.v(str), e);
                    }
                } while (query.moveToNext());
                query.close();
                return o4Var;
            } catch (Throwable th) {
                if (0 != 0) {
                    cursor.close();
                }
                throw th;
            }
        } catch (SQLiteException e2) {
            l().G().c("Database error querying filters. appId", st1.v(str), e2);
            Map emptyMap2 = Collections.emptyMap();
            if (0 != 0) {
                cursor.close();
            }
            return emptyMap2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0135  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.appcompat.view.menu.qg1 I(long r23, java.lang.String r25, long r26, boolean r28, boolean r29, boolean r30, boolean r31, boolean r32) {
        /*
            Method dump skipped, instructions count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.og1.I(long, java.lang.String, long, boolean, boolean, boolean, boolean, boolean):androidx.appcompat.view.menu.qg1");
    }

    public final oz1 I0(String str) {
        pj0.i(str);
        n();
        u();
        if (qa2.a() && e().s(vi1.T0)) {
            oz1 oz1Var = (oz1) N("select consent_state, consent_source from consent_settings where app_id=? limit 1;", new String[]{str}, new ug1() { // from class: androidx.appcompat.view.menu.mg1
                @Override // androidx.appcompat.view.menu.ug1
                public final Object a(Cursor cursor) {
                    oz1 f2;
                    f2 = oz1.f(cursor.getString(0), cursor.getInt(1));
                    return f2;
                }
            });
            return oz1Var == null ? oz1.c : oz1Var;
        }
        return oz1.e(P("select consent_state from consent_settings where app_id=? limit 1;", new String[]{str}, "G1"));
    }

    public final qg1 J(long j2, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        return I(j2, str, 1L, false, false, z3, false, z5);
    }

    public final Map J0(String str, String str2) {
        u();
        n();
        pj0.e(str);
        pj0.e(str2);
        o4 o4Var = new o4();
        Cursor cursor = null;
        try {
            try {
                Cursor query = B().query("property_filters", new String[]{"audience_id", "data"}, "app_id=? AND property_name=?", new String[]{str, str2}, null, null, null);
                if (!query.moveToFirst()) {
                    Map emptyMap = Collections.emptyMap();
                    query.close();
                    return emptyMap;
                }
                do {
                    try {
                        vq1 vq1Var = (vq1) ((t02) ((vq1.a) l92.G(vq1.J(), query.getBlob(1))).j());
                        int i2 = query.getInt(0);
                        List list = (List) o4Var.get(Integer.valueOf(i2));
                        if (list == null) {
                            list = new ArrayList();
                            o4Var.put(Integer.valueOf(i2), list);
                        }
                        list.add(vq1Var);
                    } catch (IOException e) {
                        l().G().c("Failed to merge filter", st1.v(str), e);
                    }
                } while (query.moveToNext());
                query.close();
                return o4Var;
            } catch (Throwable th) {
                if (0 != 0) {
                    cursor.close();
                }
                throw th;
            }
        } catch (SQLiteException e2) {
            l().G().c("Database error querying filters. appId", st1.v(str), e2);
            Map emptyMap2 = Collections.emptyMap();
            if (0 != 0) {
                cursor.close();
            }
            return emptyMap2;
        }
    }

    public final List K0(String str) {
        pj0.e(str);
        n();
        u();
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                cursor = B().query("trigger_uris", new String[]{"trigger_uri", "timestamp_millis", "source"}, "app_id=?", new String[]{str}, null, null, "rowid", null);
                if (!cursor.moveToFirst()) {
                    cursor.close();
                    return arrayList;
                }
                do {
                    String string = cursor.getString(0);
                    if (string == null) {
                        string = "";
                    }
                    arrayList.add(new b82(string, cursor.getLong(1), cursor.getInt(2)));
                } while (cursor.moveToNext());
                cursor.close();
                return arrayList;
            } catch (SQLiteException e) {
                l().G().c("Error querying trigger uris. appId", st1.v(str), e);
                List emptyList = Collections.emptyList();
                if (cursor != null) {
                    cursor.close();
                }
                return emptyList;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final void L0(String str, String str2) {
        pj0.e(str);
        pj0.e(str2);
        n();
        u();
        try {
            B().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            l().G().d("Error deleting user property. appId", st1.v(str), g().g(str2), e);
        }
    }

    public final Object M(Cursor cursor, int i2) {
        int type = cursor.getType(i2);
        if (type == 0) {
            l().G().a("Loaded invalid null value from database");
            return null;
        } else if (type != 1) {
            if (type != 2) {
                if (type != 3) {
                    if (type != 4) {
                        l().G().b("Loaded invalid unknown value type, ignoring it", Integer.valueOf(type));
                        return null;
                    }
                    l().G().a("Loaded invalid blob type value, ignoring it");
                    return null;
                }
                return cursor.getString(i2);
            }
            return Double.valueOf(cursor.getDouble(i2));
        } else {
            return Long.valueOf(cursor.getLong(i2));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List M0(java.lang.String r16) {
        /*
            r15 = this;
            androidx.appcompat.view.menu.pj0.e(r16)
            r15.n()
            r15.u()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r15.B()     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteException -> L57
            java.lang.String r3 = "user_attributes"
            r4 = 4
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteException -> L57
            java.lang.String r5 = "name"
            r11 = 0
            r4[r11] = r5     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteException -> L57
            java.lang.String r5 = "origin"
            r12 = 1
            r4[r12] = r5     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteException -> L57
            java.lang.String r5 = "set_timestamp"
            r13 = 2
            r4[r13] = r5     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteException -> L57
            java.lang.String r5 = "value"
            r14 = 3
            r4[r14] = r5     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteException -> L57
            java.lang.String r5 = "app_id=?"
            java.lang.String[] r6 = new java.lang.String[]{r16}     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteException -> L57
            r7 = 0
            r8 = 0
            java.lang.String r9 = "rowid"
            java.lang.String r10 = "1000"
            android.database.Cursor r1 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteException -> L57
            boolean r2 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteException -> L57
            if (r2 != 0) goto L46
            r1.close()
            return r0
        L46:
            java.lang.String r6 = r1.getString(r11)     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteException -> L57
            java.lang.String r2 = r1.getString(r12)     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteException -> L57
            if (r2 != 0) goto L52
            java.lang.String r2 = ""
        L52:
            r5 = r2
            goto L5a
        L54:
            r0 = move-exception
            r2 = r15
            goto Lab
        L57:
            r0 = move-exception
            r2 = r15
            goto L90
        L5a:
            long r7 = r1.getLong(r13)     // Catch: java.lang.Throwable -> L54 android.database.sqlite.SQLiteException -> L57
            r2 = r15
            java.lang.Object r9 = r15.M(r1, r14)     // Catch: java.lang.Throwable -> L77 android.database.sqlite.SQLiteException -> L79
            if (r9 != 0) goto L7b
            androidx.appcompat.view.menu.st1 r3 = r15.l()     // Catch: java.lang.Throwable -> L77 android.database.sqlite.SQLiteException -> L79
            androidx.appcompat.view.menu.vt1 r3 = r3.G()     // Catch: java.lang.Throwable -> L77 android.database.sqlite.SQLiteException -> L79
            java.lang.String r4 = "Read invalid user property value, ignoring it. appId"
            java.lang.Object r5 = androidx.appcompat.view.menu.st1.v(r16)     // Catch: java.lang.Throwable -> L77 android.database.sqlite.SQLiteException -> L79
            r3.b(r4, r5)     // Catch: java.lang.Throwable -> L77 android.database.sqlite.SQLiteException -> L79
            goto L86
        L77:
            r0 = move-exception
            goto Lab
        L79:
            r0 = move-exception
            goto L90
        L7b:
            androidx.appcompat.view.menu.ca2 r10 = new androidx.appcompat.view.menu.ca2     // Catch: java.lang.Throwable -> L77 android.database.sqlite.SQLiteException -> L79
            r3 = r10
            r4 = r16
            r3.<init>(r4, r5, r6, r7, r9)     // Catch: java.lang.Throwable -> L77 android.database.sqlite.SQLiteException -> L79
            r0.add(r10)     // Catch: java.lang.Throwable -> L77 android.database.sqlite.SQLiteException -> L79
        L86:
            boolean r3 = r1.moveToNext()     // Catch: java.lang.Throwable -> L77 android.database.sqlite.SQLiteException -> L79
            if (r3 != 0) goto L46
            r1.close()
            return r0
        L90:
            androidx.appcompat.view.menu.st1 r3 = r15.l()     // Catch: java.lang.Throwable -> L77
            androidx.appcompat.view.menu.vt1 r3 = r3.G()     // Catch: java.lang.Throwable -> L77
            java.lang.String r4 = "Error querying user properties. appId"
            java.lang.Object r5 = androidx.appcompat.view.menu.st1.v(r16)     // Catch: java.lang.Throwable -> L77
            r3.c(r4, r5, r0)     // Catch: java.lang.Throwable -> L77
            java.util.List r0 = java.util.Collections.emptyList()     // Catch: java.lang.Throwable -> L77
            if (r1 == 0) goto Laa
            r1.close()
        Laa:
            return r0
        Lab:
            if (r1 == 0) goto Lb0
            r1.close()
        Lb0:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.og1.M0(java.lang.String):java.util.List");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0046  */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object N(java.lang.String r3, java.lang.String[] r4, androidx.appcompat.view.menu.ug1 r5) {
        /*
            r2 = this;
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r2.B()     // Catch: java.lang.Throwable -> L2d android.database.sqlite.SQLiteException -> L2f
            android.database.Cursor r3 = r1.rawQuery(r3, r4)     // Catch: java.lang.Throwable -> L2d android.database.sqlite.SQLiteException -> L2f
            boolean r4 = r3.moveToFirst()     // Catch: java.lang.Throwable -> L20 android.database.sqlite.SQLiteException -> L23
            if (r4 != 0) goto L25
            androidx.appcompat.view.menu.st1 r4 = r2.l()     // Catch: java.lang.Throwable -> L20 android.database.sqlite.SQLiteException -> L23
            androidx.appcompat.view.menu.vt1 r4 = r4.K()     // Catch: java.lang.Throwable -> L20 android.database.sqlite.SQLiteException -> L23
            java.lang.String r5 = "No data found"
            r4.a(r5)     // Catch: java.lang.Throwable -> L20 android.database.sqlite.SQLiteException -> L23
            r3.close()
            return r0
        L20:
            r4 = move-exception
            r0 = r3
            goto L44
        L23:
            r4 = move-exception
            goto L31
        L25:
            java.lang.Object r4 = r5.a(r3)     // Catch: java.lang.Throwable -> L20 android.database.sqlite.SQLiteException -> L23
            r3.close()
            return r4
        L2d:
            r4 = move-exception
            goto L44
        L2f:
            r4 = move-exception
            r3 = r0
        L31:
            androidx.appcompat.view.menu.st1 r5 = r2.l()     // Catch: java.lang.Throwable -> L20
            androidx.appcompat.view.menu.vt1 r5 = r5.G()     // Catch: java.lang.Throwable -> L20
            java.lang.String r1 = "Error querying database."
            r5.b(r1, r4)     // Catch: java.lang.Throwable -> L20
            if (r3 == 0) goto L43
            r3.close()
        L43:
            return r0
        L44:
            if (r0 == 0) goto L49
            r0.close()
        L49:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.og1.N(java.lang.String, java.lang.String[], androidx.appcompat.view.menu.ug1):java.lang.Object");
    }

    public final Map N0(String str) {
        u();
        n();
        pj0.e(str);
        Cursor cursor = null;
        try {
            try {
                Cursor query = B().query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{str}, null, null, null);
                if (!query.moveToFirst()) {
                    Map emptyMap = Collections.emptyMap();
                    query.close();
                    return emptyMap;
                }
                o4 o4Var = new o4();
                do {
                    int i2 = query.getInt(0);
                    try {
                        o4Var.put(Integer.valueOf(i2), (us1) ((t02) ((us1.a) l92.G(us1.V(), query.getBlob(1))).j()));
                    } catch (IOException e) {
                        l().G().d("Failed to merge filter results. appId, audienceId, error", st1.v(str), Integer.valueOf(i2), e);
                    }
                } while (query.moveToNext());
                query.close();
                return o4Var;
            } catch (SQLiteException e2) {
                l().G().c("Database error querying filter results. appId", st1.v(str), e2);
                Map emptyMap2 = Collections.emptyMap();
                if (0 != 0) {
                    cursor.close();
                }
                return emptyMap2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String O(long r5) {
        /*
            r4 = this;
            r4.n()
            r4.u()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r4.B()     // Catch: java.lang.Throwable -> L3f android.database.sqlite.SQLiteException -> L41
            java.lang.String r2 = "select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;"
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L3f android.database.sqlite.SQLiteException -> L41
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch: java.lang.Throwable -> L3f android.database.sqlite.SQLiteException -> L41
            r6 = 0
            r3[r6] = r5     // Catch: java.lang.Throwable -> L3f android.database.sqlite.SQLiteException -> L41
            android.database.Cursor r5 = r1.rawQuery(r2, r3)     // Catch: java.lang.Throwable -> L3f android.database.sqlite.SQLiteException -> L41
            boolean r1 = r5.moveToFirst()     // Catch: java.lang.Throwable -> L32 android.database.sqlite.SQLiteException -> L35
            if (r1 != 0) goto L37
            androidx.appcompat.view.menu.st1 r6 = r4.l()     // Catch: java.lang.Throwable -> L32 android.database.sqlite.SQLiteException -> L35
            androidx.appcompat.view.menu.vt1 r6 = r6.K()     // Catch: java.lang.Throwable -> L32 android.database.sqlite.SQLiteException -> L35
            java.lang.String r1 = "No expired configs for apps with pending events"
            r6.a(r1)     // Catch: java.lang.Throwable -> L32 android.database.sqlite.SQLiteException -> L35
            r5.close()
            return r0
        L32:
            r6 = move-exception
            r0 = r5
            goto L56
        L35:
            r6 = move-exception
            goto L43
        L37:
            java.lang.String r6 = r5.getString(r6)     // Catch: java.lang.Throwable -> L32 android.database.sqlite.SQLiteException -> L35
            r5.close()
            return r6
        L3f:
            r6 = move-exception
            goto L56
        L41:
            r6 = move-exception
            r5 = r0
        L43:
            androidx.appcompat.view.menu.st1 r1 = r4.l()     // Catch: java.lang.Throwable -> L32
            androidx.appcompat.view.menu.vt1 r1 = r1.G()     // Catch: java.lang.Throwable -> L32
            java.lang.String r2 = "Error selecting expired configs"
            r1.b(r2, r6)     // Catch: java.lang.Throwable -> L32
            if (r5 == 0) goto L55
            r5.close()
        L55:
            return r0
        L56:
            if (r0 == 0) goto L5b
            r0.close()
        L5b:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.og1.O(long):java.lang.String");
    }

    public final Map O0(String str) {
        pj0.e(str);
        o4 o4Var = new o4();
        Cursor cursor = null;
        try {
            try {
                Cursor query = B().query("event_filters", new String[]{"audience_id", "data"}, "app_id=?", new String[]{str}, null, null, null);
                if (!query.moveToFirst()) {
                    Map emptyMap = Collections.emptyMap();
                    query.close();
                    return emptyMap;
                }
                do {
                    try {
                        sq1 sq1Var = (sq1) ((t02) ((sq1.a) l92.G(sq1.M(), query.getBlob(1))).j());
                        if (sq1Var.U()) {
                            int i2 = query.getInt(0);
                            List list = (List) o4Var.get(Integer.valueOf(i2));
                            if (list == null) {
                                list = new ArrayList();
                                o4Var.put(Integer.valueOf(i2), list);
                            }
                            list.add(sq1Var);
                        }
                    } catch (IOException e) {
                        l().G().c("Failed to merge filter. appId", st1.v(str), e);
                    }
                } while (query.moveToNext());
                query.close();
                return o4Var;
            } catch (SQLiteException e2) {
                l().G().c("Database error querying filters. appId", st1.v(str), e2);
                Map emptyMap2 = Collections.emptyMap();
                if (0 != 0) {
                    cursor.close();
                }
                return emptyMap2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    public final String P(String str, String[] strArr, String str2) {
        Cursor cursor = null;
        try {
            try {
                cursor = B().rawQuery(str, strArr);
                if (!cursor.moveToFirst()) {
                    cursor.close();
                    return str2;
                }
                String string = cursor.getString(0);
                cursor.close();
                return string;
            } catch (SQLiteException e) {
                l().G().c("Database error", str, e);
                throw e;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final Map P0(String str) {
        u();
        n();
        pj0.e(str);
        o4 o4Var = new o4();
        Cursor cursor = null;
        try {
            try {
                Cursor rawQuery = B().rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str, str});
                if (!rawQuery.moveToFirst()) {
                    Map emptyMap = Collections.emptyMap();
                    rawQuery.close();
                    return emptyMap;
                }
                do {
                    int i2 = rawQuery.getInt(0);
                    List list = (List) o4Var.get(Integer.valueOf(i2));
                    if (list == null) {
                        list = new ArrayList();
                        o4Var.put(Integer.valueOf(i2), list);
                    }
                    list.add(Integer.valueOf(rawQuery.getInt(1)));
                } while (rawQuery.moveToNext());
                rawQuery.close();
                return o4Var;
            } catch (SQLiteException e) {
                l().G().c("Database error querying scoped filters. appId", st1.v(str), e);
                Map emptyMap2 = Collections.emptyMap();
                if (0 != 0) {
                    cursor.close();
                }
                return emptyMap2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    public final List Q(String str, int i2, int i3) {
        byte[] i0;
        long j2;
        long j3;
        n();
        u();
        int i4 = 1;
        pj0.a(i2 > 0);
        pj0.a(i3 > 0);
        pj0.e(str);
        Cursor cursor = null;
        try {
            try {
                Cursor query = B().query("queue", new String[]{"rowid", "data", "retry_count"}, "app_id=?", new String[]{str}, null, null, "rowid", String.valueOf(i2));
                if (!query.moveToFirst()) {
                    List emptyList = Collections.emptyList();
                    query.close();
                    return emptyList;
                }
                ArrayList arrayList = new ArrayList();
                int i5 = 0;
                while (true) {
                    long j4 = query.getLong(0);
                    try {
                        i0 = o().i0(query.getBlob(i4));
                    } catch (IOException e) {
                        l().G().c("Failed to unzip queued bundle. appId", st1.v(str), e);
                    }
                    if (!arrayList.isEmpty() && i0.length + i5 > i3) {
                        break;
                    }
                    try {
                        ss1.a aVar = (ss1.a) l92.G(ss1.A3(), i0);
                        if (qa2.a() && e().s(vi1.X0) && !arrayList.isEmpty()) {
                            ss1 ss1Var = (ss1) ((Pair) arrayList.get(0)).first;
                            ss1 ss1Var2 = (ss1) ((t02) aVar.j());
                            if (!ss1Var.f0().equals(ss1Var2.f0()) || !ss1Var.e0().equals(ss1Var2.e0()) || ss1Var.v0() != ss1Var2.v0() || !ss1Var.g0().equals(ss1Var2.g0())) {
                                break;
                            }
                            Iterator it = ss1Var.t0().iterator();
                            while (true) {
                                j2 = -1;
                                if (!it.hasNext()) {
                                    j3 = -1;
                                    break;
                                }
                                ws1 ws1Var = (ws1) it.next();
                                if ("_npa".equals(ws1Var.Z())) {
                                    j3 = ws1Var.U();
                                    break;
                                }
                            }
                            Iterator it2 = ss1Var2.t0().iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                ws1 ws1Var2 = (ws1) it2.next();
                                if ("_npa".equals(ws1Var2.Z())) {
                                    j2 = ws1Var2.U();
                                    break;
                                }
                            }
                            if (j3 != j2) {
                                break;
                            }
                        }
                        if (!query.isNull(2)) {
                            aVar.l0(query.getInt(2));
                        }
                        i5 += i0.length;
                        arrayList.add(Pair.create((ss1) ((t02) aVar.j()), Long.valueOf(j4)));
                    } catch (IOException e2) {
                        l().G().c("Failed to merge queued bundle. appId", st1.v(str), e2);
                    }
                    if (!query.moveToNext() || i5 > i3) {
                        break;
                    }
                    i4 = 1;
                }
                query.close();
                return arrayList;
            } catch (SQLiteException e3) {
                l().G().c("Error querying bundles. appId", st1.v(str), e3);
                List emptyList2 = Collections.emptyList();
                if (0 != 0) {
                    cursor.close();
                }
                return emptyList2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    public final void Q0() {
        u();
        B().beginTransaction();
    }

    public final List R(String str, String str2, String str3) {
        pj0.e(str);
        n();
        u();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(str3 + "*");
            sb.append(" and name glob ?");
        }
        return S(sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    public final void R0() {
        u();
        B().endTransaction();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x008a, code lost:
        l().G().b("Read more than the max allowed conditional properties, ignoring extra", 1000);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x016d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List S(java.lang.String r40, java.lang.String[] r41) {
        /*
            Method dump skipped, instructions count: 369
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.og1.S(java.lang.String, java.lang.String[]):java.util.List");
    }

    public final void S0() {
        int delete;
        n();
        u();
        if (u0()) {
            long a = s().e.a();
            long b = b().b();
            if (Math.abs(b - a) > ((Long) vi1.A.a(null)).longValue()) {
                s().e.b(b);
                n();
                u();
                if (!u0() || (delete = B().delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(b().a()), String.valueOf(tf1.M())})) <= 0) {
                    return;
                }
                l().K().b("Deleted stale rows. rowsDeleted", Integer.valueOf(delete));
            }
        }
    }

    public final void T0() {
        u();
        B().setTransactionSuccessful();
    }

    public final void U(ji1 ji1Var) {
        pj0.i(ji1Var);
        n();
        u();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", ji1Var.a);
        contentValues.put("name", ji1Var.b);
        contentValues.put("lifetime_count", Long.valueOf(ji1Var.c));
        contentValues.put("current_bundle_count", Long.valueOf(ji1Var.d));
        contentValues.put("last_fire_timestamp", Long.valueOf(ji1Var.f));
        contentValues.put("last_bundled_timestamp", Long.valueOf(ji1Var.g));
        contentValues.put("last_bundled_day", ji1Var.h);
        contentValues.put("last_sampled_complex_event_id", ji1Var.i);
        contentValues.put("last_sampling_rate", ji1Var.j);
        contentValues.put("current_session_count", Long.valueOf(ji1Var.e));
        Boolean bool = ji1Var.k;
        contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : 1L);
        try {
            if (B().insertWithOnConflict("events", null, contentValues, 5) == -1) {
                l().G().b("Failed to insert/update event aggregates (got -1). appId", st1.v(ji1Var.a));
            }
        } catch (SQLiteException e) {
            l().G().c("Error storing event aggregates. appId", st1.v(ji1Var.a), e);
        }
    }

    public final boolean U0() {
        return x0("select count(1) > 0 from raw_events", null) != 0;
    }

    public final void V(uw1 uw1Var) {
        pj0.i(uw1Var);
        n();
        u();
        String t0 = uw1Var.t0();
        pj0.i(t0);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", t0);
        contentValues.put("app_instance_id", uw1Var.u0());
        contentValues.put("gmp_app_id", uw1Var.j());
        contentValues.put("resettable_device_id_hash", uw1Var.l());
        contentValues.put("last_bundle_index", Long.valueOf(uw1Var.k0()));
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(uw1Var.m0()));
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(uw1Var.i0()));
        contentValues.put("app_version", uw1Var.h());
        contentValues.put("app_store", uw1Var.v0());
        contentValues.put("gmp_version", Long.valueOf(uw1Var.g0()));
        contentValues.put("dev_cert_hash", Long.valueOf(uw1Var.a0()));
        contentValues.put("measurement_enabled", Boolean.valueOf(uw1Var.r()));
        contentValues.put("day", Long.valueOf(uw1Var.Y()));
        contentValues.put("daily_public_events_count", Long.valueOf(uw1Var.T()));
        contentValues.put("daily_events_count", Long.valueOf(uw1Var.Q()));
        contentValues.put("daily_conversions_count", Long.valueOf(uw1Var.K()));
        contentValues.put("config_fetched_time", Long.valueOf(uw1Var.H()));
        contentValues.put("failed_config_fetch_time", Long.valueOf(uw1Var.e0()));
        contentValues.put("app_version_int", Long.valueOf(uw1Var.z()));
        contentValues.put("firebase_instance_id", uw1Var.i());
        contentValues.put("daily_error_events_count", Long.valueOf(uw1Var.N()));
        contentValues.put("daily_realtime_events_count", Long.valueOf(uw1Var.W()));
        contentValues.put("health_monitor_sample", uw1Var.k());
        contentValues.put("android_id", Long.valueOf(uw1Var.v()));
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(uw1Var.q()));
        contentValues.put("admob_app_id", uw1Var.r0());
        contentValues.put("dynamite_version", Long.valueOf(uw1Var.c0()));
        contentValues.put("session_stitching_token", uw1Var.m());
        contentValues.put("sgtm_upload_enabled", Boolean.valueOf(uw1Var.t()));
        contentValues.put("target_os_version", Long.valueOf(uw1Var.p0()));
        contentValues.put("session_stitching_token_hash", Long.valueOf(uw1Var.o0()));
        if (vc2.a() && e().B(t0, vi1.L0)) {
            contentValues.put("ad_services_version", Integer.valueOf(uw1Var.a()));
            contentValues.put("attribution_eligibility_status", Long.valueOf(uw1Var.D()));
        }
        if (la2.a() && e().B(t0, vi1.Y0)) {
            contentValues.put("unmatched_first_open_without_ad_id", Boolean.valueOf(uw1Var.u()));
        }
        List n2 = uw1Var.n();
        if (n2 != null) {
            if (n2.isEmpty()) {
                l().L().b("Safelisted events should not be an empty list. appId", t0);
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", n2));
            }
        }
        if (ra2.a() && e().s(vi1.u0) && !contentValues.containsKey("safelisted_events")) {
            contentValues.put("safelisted_events", (String) null);
        }
        if (qa2.a() && e().B(t0, vi1.T0)) {
            contentValues.put("npa_metadata_value", uw1Var.q0());
        }
        try {
            SQLiteDatabase B = B();
            if (B.update("apps", contentValues, "app_id = ?", new String[]{t0}) == 0 && B.insertWithOnConflict("apps", null, contentValues, 5) == -1) {
                l().G().b("Failed to insert/update app (got -1). appId", st1.v(t0));
            }
        } catch (SQLiteException e) {
            l().G().c("Error storing app. appId", st1.v(t0), e);
        }
    }

    public final boolean V0() {
        return x0("select count(1) > 0 from queue where has_realtime = 1", null) != 0;
    }

    public final void W(String str, ih1 ih1Var) {
        if (qa2.a() && e().s(vi1.T0)) {
            pj0.i(str);
            pj0.i(ih1Var);
            n();
            u();
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", str);
            contentValues.put("dma_consent_settings", ih1Var.i());
            Y("consent_settings", "app_id", contentValues);
        }
    }

    public final boolean W0() {
        return x0("select count(1) > 0 from raw_events where realtime = 1", null) != 0;
    }

    public final void X(String str, oz1 oz1Var) {
        pj0.i(str);
        pj0.i(oz1Var);
        n();
        u();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("consent_state", oz1Var.v());
        if (qa2.a() && e().s(vi1.T0)) {
            contentValues.put("consent_source", Integer.valueOf(oz1Var.b()));
            Y("consent_settings", "app_id", contentValues);
            return;
        }
        try {
            if (B().insertWithOnConflict("consent_settings", null, contentValues, 5) == -1) {
                l().G().b("Failed to insert/update consent setting (got -1). appId", st1.v(str));
            }
        } catch (SQLiteException e) {
            l().G().c("Error storing consent setting. appId, error", st1.v(str), e);
        }
    }

    public final void Y(String str, String str2, ContentValues contentValues) {
        try {
            SQLiteDatabase B = B();
            String asString = contentValues.getAsString(str2);
            if (asString == null) {
                l().H().b("Value of the primary key is not set.", st1.v(str2));
                return;
            }
            if (B.update(str, contentValues, str2 + " = ?", new String[]{asString}) == 0 && B.insertWithOnConflict(str, null, contentValues, 5) == -1) {
                l().G().c("Failed to insert/update table (got -1). key", st1.v(str), st1.v(str2));
            }
        } catch (SQLiteException e) {
            l().G().d("Error storing into table. key", st1.v(str), st1.v(str2), e);
        }
    }

    public final void Z(String str, List list) {
        boolean z;
        boolean z2;
        pj0.i(list);
        for (int i2 = 0; i2 < list.size(); i2++) {
            rq1.a aVar = (rq1.a) ((rq1) list.get(i2)).x();
            if (aVar.r() != 0) {
                for (int i3 = 0; i3 < aVar.r(); i3++) {
                    sq1.a aVar2 = (sq1.a) aVar.u(i3).x();
                    sq1.a aVar3 = (sq1.a) ((t02.b) aVar2.clone());
                    String b = qz1.b(aVar2.v());
                    if (b != null) {
                        aVar3.t(b);
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    for (int i4 = 0; i4 < aVar2.r(); i4++) {
                        tq1 u = aVar2.u(i4);
                        String a = uz1.a(u.M());
                        if (a != null) {
                            aVar3.s(i4, (tq1) ((t02) ((tq1.a) u.x()).r(a).j()));
                            z2 = true;
                        }
                    }
                    if (z2) {
                        rq1.a s = aVar.s(i3, aVar3);
                        list.set(i2, (rq1) ((t02) s.j()));
                        aVar = s;
                    }
                }
            }
            if (aVar.v() != 0) {
                for (int i5 = 0; i5 < aVar.v(); i5++) {
                    vq1 w = aVar.w(i5);
                    String a2 = rz1.a(w.L());
                    if (a2 != null) {
                        aVar = aVar.t(i5, ((vq1.a) w.x()).r(a2));
                        list.set(i2, (rq1) ((t02) aVar.j()));
                    }
                }
            }
        }
        u();
        n();
        pj0.e(str);
        pj0.i(list);
        SQLiteDatabase B = B();
        B.beginTransaction();
        try {
            u();
            n();
            pj0.e(str);
            SQLiteDatabase B2 = B();
            B2.delete("property_filters", "app_id=?", new String[]{str});
            B2.delete("event_filters", "app_id=?", new String[]{str});
            Iterator it = list.iterator();
            while (it.hasNext()) {
                rq1 rq1Var = (rq1) it.next();
                u();
                n();
                pj0.e(str);
                pj0.i(rq1Var);
                if (rq1Var.R()) {
                    int j2 = rq1Var.j();
                    Iterator it2 = rq1Var.P().iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (!((sq1) it2.next()).V()) {
                                l().L().c("Event filter with no ID. Audience definition ignored. appId, audienceId", st1.v(str), Integer.valueOf(j2));
                                break;
                            }
                        } else {
                            Iterator it3 = rq1Var.Q().iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    if (!((vq1) it3.next()).P()) {
                                        l().L().c("Property filter with no ID. Audience definition ignored. appId, audienceId", st1.v(str), Integer.valueOf(j2));
                                        break;
                                    }
                                } else {
                                    Iterator it4 = rq1Var.P().iterator();
                                    while (true) {
                                        if (it4.hasNext()) {
                                            if (!f0(str, j2, (sq1) it4.next())) {
                                                z = false;
                                                break;
                                            }
                                        } else {
                                            z = true;
                                            break;
                                        }
                                    }
                                    if (z) {
                                        for (vq1 vq1Var : rq1Var.Q()) {
                                            if (!g0(str, j2, vq1Var)) {
                                                break;
                                            }
                                        }
                                    }
                                    if (!z) {
                                        u();
                                        n();
                                        pj0.e(str);
                                        SQLiteDatabase B3 = B();
                                        B3.delete("property_filters", "app_id=? and audience_id=?", new String[]{str, String.valueOf(j2)});
                                        B3.delete("event_filters", "app_id=? and audience_id=?", new String[]{str, String.valueOf(j2)});
                                    }
                                }
                            }
                        }
                    }
                } else {
                    l().L().b("Audience with no ID. appId", st1.v(str));
                }
            }
            ArrayList arrayList = new ArrayList();
            Iterator it5 = list.iterator();
            while (it5.hasNext()) {
                rq1 rq1Var2 = (rq1) it5.next();
                arrayList.add(rq1Var2.R() ? Integer.valueOf(rq1Var2.j()) : null);
            }
            z0(str, arrayList);
            B.setTransactionSuccessful();
            B.endTransaction();
        } catch (Throwable th) {
            B.endTransaction();
            throw th;
        }
    }

    public final void a0(List list) {
        n();
        u();
        pj0.i(list);
        pj0.k(list.size());
        if (u0()) {
            String str = "(" + TextUtils.join(",", list) + ")";
            if (x0("SELECT COUNT(1) FROM queue WHERE rowid IN " + str + " AND retry_count =  2147483647 LIMIT 1", null) > 0) {
                l().L().a("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                B().execSQL("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN " + str + " AND (retry_count IS NULL OR retry_count < 2147483647)");
            } catch (SQLiteException e) {
                l().G().b("Error incrementing retry count. error", e);
            }
        }
    }

    public final boolean b0(lf1 lf1Var) {
        pj0.i(lf1Var);
        n();
        u();
        String str = lf1Var.m;
        pj0.i(str);
        if (F0(str, lf1Var.o.n) != null || x0("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str}) < 1000) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", str);
            contentValues.put("origin", lf1Var.n);
            contentValues.put("name", lf1Var.o.n);
            T(contentValues, "value", pj0.i(lf1Var.o.d()));
            contentValues.put("active", Boolean.valueOf(lf1Var.q));
            contentValues.put("trigger_event_name", lf1Var.r);
            contentValues.put("trigger_timeout", Long.valueOf(lf1Var.t));
            j();
            contentValues.put("timed_out_event", aa2.p0(lf1Var.s));
            contentValues.put("creation_timestamp", Long.valueOf(lf1Var.p));
            j();
            contentValues.put("triggered_event", aa2.p0(lf1Var.u));
            contentValues.put("triggered_timestamp", Long.valueOf(lf1Var.o.o));
            contentValues.put("time_to_live", Long.valueOf(lf1Var.v));
            j();
            contentValues.put("expired_event", aa2.p0(lf1Var.w));
            try {
                if (B().insertWithOnConflict("conditional_properties", null, contentValues, 5) == -1) {
                    l().G().b("Failed to insert/update conditional user property (got -1)", st1.v(str));
                    return true;
                }
                return true;
            } catch (SQLiteException e) {
                l().G().c("Error storing conditional user property", st1.v(str), e);
                return true;
            }
        }
        return false;
    }

    public final boolean c0(kh1 kh1Var, long j2, boolean z) {
        n();
        u();
        pj0.i(kh1Var);
        pj0.e(kh1Var.a);
        byte[] h2 = o().E(kh1Var).h();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", kh1Var.a);
        contentValues.put("name", kh1Var.b);
        contentValues.put("timestamp", Long.valueOf(kh1Var.d));
        contentValues.put("metadata_fingerprint", Long.valueOf(j2));
        contentValues.put("data", h2);
        contentValues.put("realtime", Integer.valueOf(z ? 1 : 0));
        try {
            if (B().insert("raw_events", null, contentValues) == -1) {
                l().G().b("Failed to insert raw event (got -1). appId", st1.v(kh1Var.a));
                return false;
            }
            return true;
        } catch (SQLiteException e) {
            l().G().c("Error storing raw event. appId", st1.v(kh1Var.a), e);
            return false;
        }
    }

    public final boolean d0(ss1 ss1Var, boolean z) {
        n();
        u();
        pj0.i(ss1Var);
        pj0.e(ss1Var.D3());
        pj0.l(ss1Var.T0());
        S0();
        long a = b().a();
        if (ss1Var.X2() < a - tf1.M() || ss1Var.X2() > tf1.M() + a) {
            l().L().d("Storing bundle outside of the max uploading time span. appId, now, timestamp", st1.v(ss1Var.D3()), Long.valueOf(a), Long.valueOf(ss1Var.X2()));
        }
        try {
            byte[] g0 = o().g0(ss1Var.h());
            l().K().b("Saving bundle, size", Integer.valueOf(g0.length));
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", ss1Var.D3());
            contentValues.put("bundle_end_timestamp", Long.valueOf(ss1Var.X2()));
            contentValues.put("data", g0);
            contentValues.put("has_realtime", Integer.valueOf(z ? 1 : 0));
            if (ss1Var.a1()) {
                contentValues.put("retry_count", Integer.valueOf(ss1Var.e2()));
            }
            try {
                if (B().insert("queue", null, contentValues) == -1) {
                    l().G().b("Failed to insert bundle (got -1). appId", st1.v(ss1Var.D3()));
                    return false;
                }
                return true;
            } catch (SQLiteException e) {
                l().G().c("Error storing bundle. appId", st1.v(ss1Var.D3()), e);
                return false;
            }
        } catch (IOException e2) {
            l().G().c("Data loss. Failed to serialize bundle. appId", st1.v(ss1Var.D3()), e2);
            return false;
        }
    }

    public final boolean e0(ca2 ca2Var) {
        pj0.i(ca2Var);
        n();
        u();
        if (F0(ca2Var.a, ca2Var.c) == null) {
            if (aa2.J0(ca2Var.c)) {
                if (x0("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{ca2Var.a}) >= e().q(ca2Var.a, vi1.I, 25, 100)) {
                    return false;
                }
            } else if (!"_npa".equals(ca2Var.c) && x0("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{ca2Var.a, ca2Var.b}) >= 25) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", ca2Var.a);
        contentValues.put("origin", ca2Var.b);
        contentValues.put("name", ca2Var.c);
        contentValues.put("set_timestamp", Long.valueOf(ca2Var.d));
        T(contentValues, "value", ca2Var.e);
        try {
            if (B().insertWithOnConflict("user_attributes", null, contentValues, 5) == -1) {
                l().G().b("Failed to insert/update user property (got -1). appId", st1.v(ca2Var.a));
                return true;
            }
            return true;
        } catch (SQLiteException e) {
            l().G().c("Error storing user property. appId", st1.v(ca2Var.a), e);
            return true;
        }
    }

    public final boolean f0(String str, int i2, sq1 sq1Var) {
        u();
        n();
        pj0.e(str);
        pj0.i(sq1Var);
        if (sq1Var.P().isEmpty()) {
            l().L().d("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", st1.v(str), Integer.valueOf(i2), String.valueOf(sq1Var.V() ? Integer.valueOf(sq1Var.L()) : null));
            return false;
        }
        byte[] h2 = sq1Var.h();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("audience_id", Integer.valueOf(i2));
        contentValues.put("filter_id", sq1Var.V() ? Integer.valueOf(sq1Var.L()) : null);
        contentValues.put("event_name", sq1Var.P());
        contentValues.put("session_scoped", sq1Var.W() ? Boolean.valueOf(sq1Var.T()) : null);
        contentValues.put("data", h2);
        try {
            if (B().insertWithOnConflict("event_filters", null, contentValues, 5) == -1) {
                l().G().b("Failed to insert event filter (got -1). appId", st1.v(str));
                return true;
            }
            return true;
        } catch (SQLiteException e) {
            l().G().c("Error storing event filter. appId", st1.v(str), e);
            return false;
        }
    }

    public final boolean g0(String str, int i2, vq1 vq1Var) {
        u();
        n();
        pj0.e(str);
        pj0.i(vq1Var);
        if (vq1Var.L().isEmpty()) {
            l().L().d("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", st1.v(str), Integer.valueOf(i2), String.valueOf(vq1Var.P() ? Integer.valueOf(vq1Var.j()) : null));
            return false;
        }
        byte[] h2 = vq1Var.h();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("audience_id", Integer.valueOf(i2));
        contentValues.put("filter_id", vq1Var.P() ? Integer.valueOf(vq1Var.j()) : null);
        contentValues.put("property_name", vq1Var.L());
        contentValues.put("session_scoped", vq1Var.Q() ? Boolean.valueOf(vq1Var.O()) : null);
        contentValues.put("data", h2);
        try {
            if (B().insertWithOnConflict("property_filters", null, contentValues, 5) == -1) {
                l().G().b("Failed to insert property filter (got -1). appId", st1.v(str));
                return false;
            }
            return true;
        } catch (SQLiteException e) {
            l().G().c("Error storing property filter. appId", st1.v(str), e);
            return false;
        }
    }

    public final boolean h0(String str, Bundle bundle) {
        n();
        u();
        byte[] h2 = o().E(new kh1(this.a, "", str, "dep", 0L, 0L, bundle)).h();
        l().K().c("Saving default event parameters, appId, data size", g().c(str), Integer.valueOf(h2.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("parameters", h2);
        try {
            if (B().insertWithOnConflict("default_event_params", null, contentValues, 5) == -1) {
                l().G().b("Failed to insert default event parameters (got -1). appId", st1.v(str));
                return false;
            }
            return true;
        } catch (SQLiteException e) {
            l().G().c("Error storing default event parameters. appId", st1.v(str), e);
            return false;
        }
    }

    public final boolean i0(String str, b82 b82Var) {
        n();
        u();
        pj0.i(b82Var);
        pj0.e(str);
        long a = b().a();
        if (b82Var.n < a - tf1.M() || b82Var.n > tf1.M() + a) {
            l().L().d("Storing trigger URI outside of the max retention time span. appId, now, timestamp", st1.v(str), Long.valueOf(a), Long.valueOf(b82Var.n));
        }
        l().K().a("Saving trigger URI");
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("trigger_uri", b82Var.m);
        contentValues.put("source", Integer.valueOf(b82Var.o));
        contentValues.put("timestamp_millis", Long.valueOf(b82Var.n));
        try {
            if (B().insert("trigger_uris", null, contentValues) == -1) {
                l().G().b("Failed to insert trigger URI (got -1). appId", st1.v(str));
                return false;
            }
            return true;
        } catch (SQLiteException e) {
            l().G().c("Error storing trigger URI. appId", st1.v(str), e);
            return false;
        }
    }

    public final boolean j0(String str, Long l2, long j2, ns1 ns1Var) {
        n();
        u();
        pj0.i(ns1Var);
        pj0.e(str);
        pj0.i(l2);
        byte[] h2 = ns1Var.h();
        l().K().c("Saving complex main event, appId, data size", g().c(str), Integer.valueOf(h2.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l2);
        contentValues.put("children_to_process", Long.valueOf(j2));
        contentValues.put("main_event", h2);
        try {
            if (B().insertWithOnConflict("main_event_params", null, contentValues, 5) == -1) {
                l().G().b("Failed to insert complex main event (got -1). appId", st1.v(str));
                return false;
            }
            return true;
        } catch (SQLiteException e) {
            l().G().c("Error storing complex main event. appId", st1.v(str), e);
            return false;
        }
    }

    public final boolean u0() {
        return a().getDatabasePath("google_app_measurement.db").exists();
    }

    public final long v0(String str) {
        pj0.e(str);
        return G("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0L);
    }

    public final long w0(String str, String str2) {
        long G;
        pj0.e(str);
        pj0.e(str2);
        n();
        u();
        SQLiteDatabase B = B();
        B.beginTransaction();
        long j2 = 0;
        try {
            try {
                G = G("select " + str2 + " from app2 where app_id=?", new String[]{str}, -1L);
                if (G == -1) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("app_id", str);
                    contentValues.put("first_open_count", (Integer) 0);
                    contentValues.put("previous_install_count", (Integer) 0);
                    if (B.insertWithOnConflict("app2", null, contentValues, 5) == -1) {
                        l().G().c("Failed to insert column (got -1). appId", st1.v(str), str2);
                        return -1L;
                    }
                    G = 0;
                }
            } finally {
                B.endTransaction();
            }
        } catch (SQLiteException e) {
            e = e;
        }
        try {
            ContentValues contentValues2 = new ContentValues();
            contentValues2.put("app_id", str);
            contentValues2.put(str2, Long.valueOf(1 + G));
            if (B.update("app2", contentValues2, "app_id = ?", new String[]{str}) == 0) {
                l().G().c("Failed to update column (got 0). appId", st1.v(str), str2);
                return -1L;
            }
            B.setTransactionSuccessful();
            return G;
        } catch (SQLiteException e2) {
            long j3 = G;
            e = e2;
            j2 = j3;
            l().G().d("Error inserting column. appId", st1.v(str), str2, e);
            B.endTransaction();
            return j2;
        }
    }

    @Override // androidx.appcompat.view.menu.p82
    public final boolean x() {
        return false;
    }

    public final long x0(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                Cursor rawQuery = B().rawQuery(str, strArr);
                if (rawQuery.moveToFirst()) {
                    long j2 = rawQuery.getLong(0);
                    rawQuery.close();
                    return j2;
                }
                throw new SQLiteException("Database returned empty set");
            } catch (SQLiteException e) {
                l().G().c("Database error", str, e);
                throw e;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    public final long y() {
        Cursor cursor = null;
        try {
            try {
                cursor = B().rawQuery("select rowid from raw_events order by rowid desc limit 1;", null);
                if (!cursor.moveToFirst()) {
                    cursor.close();
                    return -1L;
                }
                long j2 = cursor.getLong(0);
                cursor.close();
                return j2;
            } catch (SQLiteException e) {
                l().G().b("Error querying raw events", e);
                if (cursor != null) {
                    cursor.close();
                }
                return -1L;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ab, code lost:
        l().G().b("Read more than the max allowed user properties, ignoring excess", 1000);
     */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x014d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List y0(java.lang.String r23, java.lang.String r24, java.lang.String r25) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.og1.y0(java.lang.String, java.lang.String, java.lang.String):java.util.List");
    }

    public final long z() {
        return G("select max(bundle_end_timestamp) from queue", null, 0L);
    }

    public final boolean z0(String str, List list) {
        pj0.e(str);
        u();
        n();
        SQLiteDatabase B = B();
        try {
            long x0 = x0("select count(1) from audience_filter_values where app_id=?", new String[]{str});
            int max = Math.max(0, Math.min(2000, e().u(str, vi1.H)));
            if (x0 <= max) {
                return false;
            }
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < list.size(); i2++) {
                Integer num = (Integer) list.get(i2);
                if (num == null) {
                    return false;
                }
                arrayList.add(Integer.toString(num.intValue()));
            }
            StringBuilder sb = new StringBuilder("audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in ");
            sb.append("(" + TextUtils.join(",", arrayList) + ")");
            sb.append(" order by rowid desc limit -1 offset ?)");
            return B.delete("audience_filter_values", sb.toString(), new String[]{str, Integer.toString(max)}) > 0;
        } catch (SQLiteException e) {
            l().G().c("Database error querying filters. appId", st1.v(str), e);
            return false;
        }
    }
}
