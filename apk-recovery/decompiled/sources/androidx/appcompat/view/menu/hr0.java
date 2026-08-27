package androidx.appcompat.view.menu;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import androidx.appcompat.view.menu.ap;
import androidx.appcompat.view.menu.ja0;
import androidx.appcompat.view.menu.sy0;
import androidx.appcompat.view.menu.zb;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
/* loaded from: classes.dex */
public class hr0 implements gp, sy0, xb {
    public static final lo r = lo.b("proto");
    public final js0 m;
    public final ec n;
    public final ec o;
    public final hp p;
    public final gl0 q;

    /* loaded from: classes.dex */
    public interface b {
        Object apply(Object obj);
    }

    /* loaded from: classes.dex */
    public static class c {
        public final String a;
        public final String b;

        public c(String str, String str2) {
            this.a = str;
            this.b = str2;
        }
    }

    /* loaded from: classes.dex */
    public interface d {
        Object a();
    }

    public hr0(ec ecVar, ec ecVar2, hp hpVar, js0 js0Var, gl0 gl0Var) {
        this.m = js0Var;
        this.n = ecVar;
        this.o = ecVar2;
        this.p = hpVar;
        this.q = gl0Var;
    }

    public static byte[] A0(String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 0);
    }

    public static lo E0(String str) {
        return str == null ? r : lo.b(str);
    }

    public static String F0(Iterable iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(((bi0) it.next()).c());
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public static Object G0(Cursor cursor, b bVar) {
        try {
            return bVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    public static /* synthetic */ Object b0(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.beginTransaction();
        return null;
    }

    public static /* synthetic */ Object c0(Throwable th) {
        throw new ry0("Timed out while trying to acquire the lock.", th);
    }

    public static /* synthetic */ SQLiteDatabase d0(Throwable th) {
        throw new ry0("Timed out while trying to open db.", th);
    }

    public static /* synthetic */ Long e0(Cursor cursor) {
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return 0L;
    }

    public static /* synthetic */ x01 f0(long j, Cursor cursor) {
        cursor.moveToNext();
        return x01.c().c(cursor.getLong(0)).b(j).a();
    }

    public static /* synthetic */ x01 g0(final long j, SQLiteDatabase sQLiteDatabase) {
        return (x01) G0(sQLiteDatabase.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]), new b() { // from class: androidx.appcompat.view.menu.yq0
            @Override // androidx.appcompat.view.menu.hr0.b
            public final Object apply(Object obj) {
                x01 f0;
                f0 = hr0.f0(j, (Cursor) obj);
                return f0;
            }
        });
    }

    public static /* synthetic */ Long h0(Cursor cursor) {
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return null;
    }

    public static /* synthetic */ List j0(SQLiteDatabase sQLiteDatabase) {
        return (List) G0(sQLiteDatabase.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), new b() { // from class: androidx.appcompat.view.menu.er0
            @Override // androidx.appcompat.view.menu.hr0.b
            public final Object apply(Object obj) {
                List k0;
                k0 = hr0.k0((Cursor) obj);
                return k0;
            }
        });
    }

    public static /* synthetic */ List k0(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            arrayList.add(g21.a().b(cursor.getString(1)).d(yj0.b(cursor.getInt(2))).c(A0(cursor.getString(3))).a());
        }
        return arrayList;
    }

    public static /* synthetic */ Object p0(Map map, Cursor cursor) {
        while (cursor.moveToNext()) {
            long j = cursor.getLong(0);
            Set set = (Set) map.get(Long.valueOf(j));
            if (set == null) {
                set = new HashSet();
                map.put(Long.valueOf(j), set);
            }
            set.add(new c(cursor.getString(1), cursor.getString(2)));
        }
        return null;
    }

    public static /* synthetic */ byte[] r0(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (cursor.moveToNext()) {
            byte[] blob = cursor.getBlob(0);
            arrayList.add(blob);
            i += blob.length;
        }
        byte[] bArr = new byte[i];
        int i2 = 0;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            byte[] bArr2 = (byte[]) arrayList.get(i3);
            System.arraycopy(bArr2, 0, bArr, i2, bArr2.length);
            i2 += bArr2.length;
        }
        return bArr;
    }

    public static /* synthetic */ Boolean u0(Cursor cursor) {
        return Boolean.valueOf(cursor.getCount() > 0);
    }

    public static /* synthetic */ Object v0(String str, ja0.b bVar, long j, SQLiteDatabase sQLiteDatabase) {
        if (((Boolean) G0(sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(bVar.c())}), new b() { // from class: androidx.appcompat.view.menu.oq0
            @Override // androidx.appcompat.view.menu.hr0.b
            public final Object apply(Object obj) {
                Boolean u0;
                u0 = hr0.u0((Cursor) obj);
                return u0;
            }
        })).booleanValue()) {
            sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j + " WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(bVar.c())});
        } else {
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put("reason", Integer.valueOf(bVar.c()));
            contentValues.put("events_dropped_count", Long.valueOf(j));
            sQLiteDatabase.insert("log_event_dropped", null, contentValues);
        }
        return null;
    }

    public static /* synthetic */ Object w0(long j, g21 g21Var, SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(j));
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{g21Var.b(), String.valueOf(yj0.a(g21Var.d()))}) < 1) {
            contentValues.put("backend_name", g21Var.b());
            contentValues.put("priority", Integer.valueOf(yj0.a(g21Var.d())));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    public final void B0(zb.a aVar, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            aVar.a(ma0.c().c((String) entry.getKey()).b((List) entry.getValue()).a());
        }
    }

    public final byte[] C0(long j) {
        return (byte[]) G0(Q().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j)}, null, null, "sequence_num"), new b() { // from class: androidx.appcompat.view.menu.tq0
            @Override // androidx.appcompat.view.menu.hr0.b
            public final Object apply(Object obj) {
                byte[] r0;
                r0 = hr0.r0((Cursor) obj);
                return r0;
            }
        });
    }

    public final Object D0(d dVar, b bVar) {
        long a2 = this.o.a();
        while (true) {
            try {
                return dVar.a();
            } catch (SQLiteDatabaseLockedException e) {
                if (this.o.a() >= this.p.b() + a2) {
                    return bVar.apply(e);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    public final ja0.b M(int i) {
        ja0.b bVar = ja0.b.REASON_UNKNOWN;
        if (i == bVar.c()) {
            return bVar;
        }
        ja0.b bVar2 = ja0.b.MESSAGE_TOO_OLD;
        if (i == bVar2.c()) {
            return bVar2;
        }
        ja0.b bVar3 = ja0.b.CACHE_FULL;
        if (i == bVar3.c()) {
            return bVar3;
        }
        ja0.b bVar4 = ja0.b.PAYLOAD_TOO_BIG;
        if (i == bVar4.c()) {
            return bVar4;
        }
        ja0.b bVar5 = ja0.b.MAX_RETRIES_REACHED;
        if (i == bVar5.c()) {
            return bVar5;
        }
        ja0.b bVar6 = ja0.b.INVALID_PAYLOD;
        if (i == bVar6.c()) {
            return bVar6;
        }
        ja0.b bVar7 = ja0.b.SERVER_ERROR;
        if (i == bVar7.c()) {
            return bVar7;
        }
        pa0.a("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i));
        return bVar;
    }

    public final void N(final SQLiteDatabase sQLiteDatabase) {
        D0(new d() { // from class: androidx.appcompat.view.menu.br0
            @Override // androidx.appcompat.view.menu.hr0.d
            public final Object a() {
                Object b0;
                b0 = hr0.b0(sQLiteDatabase);
                return b0;
            }
        }, new b() { // from class: androidx.appcompat.view.menu.cr0
            @Override // androidx.appcompat.view.menu.hr0.b
            public final Object apply(Object obj) {
                Object c0;
                c0 = hr0.c0((Throwable) obj);
                return c0;
            }
        });
    }

    public final long O(SQLiteDatabase sQLiteDatabase, g21 g21Var) {
        Long V = V(sQLiteDatabase, g21Var);
        if (V != null) {
            return V.longValue();
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("backend_name", g21Var.b());
        contentValues.put("priority", Integer.valueOf(yj0.a(g21Var.d())));
        contentValues.put("next_request_ms", (Integer) 0);
        if (g21Var.c() != null) {
            contentValues.put("extras", Base64.encodeToString(g21Var.c(), 0));
        }
        return sQLiteDatabase.insert("transport_contexts", null, contentValues);
    }

    public long P() {
        return S() * T();
    }

    public SQLiteDatabase Q() {
        final js0 js0Var = this.m;
        Objects.requireNonNull(js0Var);
        return (SQLiteDatabase) D0(new d() { // from class: androidx.appcompat.view.menu.rq0
            @Override // androidx.appcompat.view.menu.hr0.d
            public final Object a() {
                return js0.this.getWritableDatabase();
            }
        }, new b() { // from class: androidx.appcompat.view.menu.zq0
            @Override // androidx.appcompat.view.menu.hr0.b
            public final Object apply(Object obj) {
                SQLiteDatabase d0;
                d0 = hr0.d0((Throwable) obj);
                return d0;
            }
        });
    }

    public final tx R() {
        return tx.b().b(hx0.c().b(P()).c(hp.a.f()).a()).a();
    }

    public final long S() {
        return Q().compileStatement("PRAGMA page_count").simpleQueryForLong();
    }

    public final long T() {
        return Q().compileStatement("PRAGMA page_size").simpleQueryForLong();
    }

    public final x01 U() {
        final long a2 = this.n.a();
        return (x01) W(new b() { // from class: androidx.appcompat.view.menu.xq0
            @Override // androidx.appcompat.view.menu.hr0.b
            public final Object apply(Object obj) {
                x01 g0;
                g0 = hr0.g0(a2, (SQLiteDatabase) obj);
                return g0;
            }
        });
    }

    public final Long V(SQLiteDatabase sQLiteDatabase, g21 g21Var) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(g21Var.b(), String.valueOf(yj0.a(g21Var.d()))));
        if (g21Var.c() != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(g21Var.c(), 0));
        } else {
            sb.append(" and extras is null");
        }
        return (Long) G0(sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null), new b() { // from class: androidx.appcompat.view.menu.wq0
            @Override // androidx.appcompat.view.menu.hr0.b
            public final Object apply(Object obj) {
                Long h0;
                h0 = hr0.h0((Cursor) obj);
                return h0;
            }
        });
    }

    public Object W(b bVar) {
        SQLiteDatabase Q = Q();
        Q.beginTransaction();
        try {
            Object apply = bVar.apply(Q);
            Q.setTransactionSuccessful();
            return apply;
        } finally {
            Q.endTransaction();
        }
    }

    public final boolean X() {
        return S() * T() >= this.p.f();
    }

    public final List Y(List list, Map map) {
        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            bi0 bi0Var = (bi0) listIterator.next();
            if (map.containsKey(Long.valueOf(bi0Var.c()))) {
                ap.a l = bi0Var.b().l();
                for (c cVar : (Set) map.get(Long.valueOf(bi0Var.c()))) {
                    l.c(cVar.a, cVar.b);
                }
                listIterator.set(bi0.a(bi0Var.c(), bi0Var.d(), l.d()));
            }
        }
        return list;
    }

    public final /* synthetic */ Object Z(Cursor cursor) {
        while (cursor.moveToNext()) {
            int i = cursor.getInt(0);
            a(i, ja0.b.MESSAGE_TOO_OLD, cursor.getString(1));
        }
        return null;
    }

    @Override // androidx.appcompat.view.menu.xb
    public void a(final long j, final ja0.b bVar, final String str) {
        W(new b() { // from class: androidx.appcompat.view.menu.gr0
            @Override // androidx.appcompat.view.menu.hr0.b
            public final Object apply(Object obj) {
                Object v0;
                v0 = hr0.v0(str, bVar, j, (SQLiteDatabase) obj);
                return v0;
            }
        });
    }

    public final /* synthetic */ Integer a0(long j, SQLiteDatabase sQLiteDatabase) {
        String[] strArr = {String.valueOf(j)};
        G0(sQLiteDatabase.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr), new b() { // from class: androidx.appcompat.view.menu.lq0
            @Override // androidx.appcompat.view.menu.hr0.b
            public final Object apply(Object obj) {
                Object Z;
                Z = hr0.this.Z((Cursor) obj);
                return Z;
            }
        });
        return Integer.valueOf(sQLiteDatabase.delete("events", "timestamp_ms < ?", strArr));
    }

    @Override // androidx.appcompat.view.menu.gp
    public int b() {
        final long a2 = this.n.a() - this.p.c();
        return ((Integer) W(new b() { // from class: androidx.appcompat.view.menu.dr0
            @Override // androidx.appcompat.view.menu.hr0.b
            public final Object apply(Object obj) {
                Integer a0;
                a0 = hr0.this.a0(a2, (SQLiteDatabase) obj);
                return a0;
            }
        })).intValue();
    }

    @Override // androidx.appcompat.view.menu.xb
    public zb c() {
        final zb.a e = zb.e();
        final HashMap hashMap = new HashMap();
        return (zb) W(new b() { // from class: androidx.appcompat.view.menu.nq0
            @Override // androidx.appcompat.view.menu.hr0.b
            public final Object apply(Object obj) {
                zb n0;
                n0 = hr0.this.n0(r2, hashMap, e, (SQLiteDatabase) obj);
                return n0;
            }
        });
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.m.close();
    }

    @Override // androidx.appcompat.view.menu.sy0
    public Object d(sy0.a aVar) {
        SQLiteDatabase Q = Q();
        N(Q);
        try {
            Object a2 = aVar.a();
            Q.setTransactionSuccessful();
            return a2;
        } finally {
            Q.endTransaction();
        }
    }

    @Override // androidx.appcompat.view.menu.xb
    public void e() {
        W(new b() { // from class: androidx.appcompat.view.menu.iq0
            @Override // androidx.appcompat.view.menu.hr0.b
            public final Object apply(Object obj) {
                Object x0;
                x0 = hr0.this.x0((SQLiteDatabase) obj);
                return x0;
            }
        });
    }

    @Override // androidx.appcompat.view.menu.gp
    public void f(Iterable iterable) {
        if (iterable.iterator().hasNext()) {
            Q().compileStatement("DELETE FROM events WHERE _id in " + F0(iterable)).execute();
        }
    }

    @Override // androidx.appcompat.view.menu.gp
    public long g(g21 g21Var) {
        return ((Long) G0(Q().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{g21Var.b(), String.valueOf(yj0.a(g21Var.d()))}), new b() { // from class: androidx.appcompat.view.menu.ar0
            @Override // androidx.appcompat.view.menu.hr0.b
            public final Object apply(Object obj) {
                Long e0;
                e0 = hr0.e0((Cursor) obj);
                return e0;
            }
        })).longValue();
    }

    public final /* synthetic */ Boolean i0(g21 g21Var, SQLiteDatabase sQLiteDatabase) {
        Long V = V(sQLiteDatabase, g21Var);
        return V == null ? Boolean.FALSE : (Boolean) G0(Q().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{V.toString()}), new b() { // from class: androidx.appcompat.view.menu.sq0
            @Override // androidx.appcompat.view.menu.hr0.b
            public final Object apply(Object obj) {
                return Boolean.valueOf(((Cursor) obj).moveToNext());
            }
        });
    }

    @Override // androidx.appcompat.view.menu.gp
    public bi0 k(final g21 g21Var, final ap apVar) {
        pa0.b("SQLiteEventStore", "Storing event with priority=%s, name=%s for destination %s", g21Var.d(), apVar.j(), g21Var.b());
        long longValue = ((Long) W(new b() { // from class: androidx.appcompat.view.menu.vq0
            @Override // androidx.appcompat.view.menu.hr0.b
            public final Object apply(Object obj) {
                Long q0;
                q0 = hr0.this.q0(apVar, g21Var, (SQLiteDatabase) obj);
                return q0;
            }
        })).longValue();
        if (longValue < 1) {
            return null;
        }
        return bi0.a(longValue, g21Var, apVar);
    }

    @Override // androidx.appcompat.view.menu.gp
    public Iterable l(final g21 g21Var) {
        return (Iterable) W(new b() { // from class: androidx.appcompat.view.menu.jq0
            @Override // androidx.appcompat.view.menu.hr0.b
            public final Object apply(Object obj) {
                List l0;
                l0 = hr0.this.l0(g21Var, (SQLiteDatabase) obj);
                return l0;
            }
        });
    }

    public final /* synthetic */ List l0(g21 g21Var, SQLiteDatabase sQLiteDatabase) {
        wj0[] values;
        List y0 = y0(sQLiteDatabase, g21Var, this.p.d());
        for (wj0 wj0Var : wj0.values()) {
            if (wj0Var != g21Var.d()) {
                int d2 = this.p.d() - y0.size();
                if (d2 <= 0) {
                    break;
                }
                y0.addAll(y0(sQLiteDatabase, g21Var.f(wj0Var), d2));
            }
        }
        return Y(y0, z0(sQLiteDatabase, y0));
    }

    public final /* synthetic */ zb m0(Map map, zb.a aVar, Cursor cursor) {
        while (cursor.moveToNext()) {
            String string = cursor.getString(0);
            ja0.b M = M(cursor.getInt(1));
            long j = cursor.getLong(2);
            if (!map.containsKey(string)) {
                map.put(string, new ArrayList());
            }
            ((List) map.get(string)).add(ja0.c().c(M).b(j).a());
        }
        B0(aVar, map);
        aVar.e(U());
        aVar.d(R());
        aVar.c((String) this.q.get());
        return aVar.b();
    }

    @Override // androidx.appcompat.view.menu.gp
    public void n(final g21 g21Var, final long j) {
        W(new b() { // from class: androidx.appcompat.view.menu.hq0
            @Override // androidx.appcompat.view.menu.hr0.b
            public final Object apply(Object obj) {
                Object w0;
                w0 = hr0.w0(j, g21Var, (SQLiteDatabase) obj);
                return w0;
            }
        });
    }

    public final /* synthetic */ zb n0(String str, final Map map, final zb.a aVar, SQLiteDatabase sQLiteDatabase) {
        return (zb) G0(sQLiteDatabase.rawQuery(str, new String[0]), new b() { // from class: androidx.appcompat.view.menu.uq0
            @Override // androidx.appcompat.view.menu.hr0.b
            public final Object apply(Object obj) {
                zb m0;
                m0 = hr0.this.m0(map, aVar, (Cursor) obj);
                return m0;
            }
        });
    }

    public final /* synthetic */ Object o0(List list, g21 g21Var, Cursor cursor) {
        while (cursor.moveToNext()) {
            long j = cursor.getLong(0);
            boolean z = cursor.getInt(7) != 0;
            ap.a k = ap.a().j(cursor.getString(1)).i(cursor.getLong(2)).k(cursor.getLong(3));
            if (z) {
                k.h(new jo(E0(cursor.getString(4)), cursor.getBlob(5)));
            } else {
                k.h(new jo(E0(cursor.getString(4)), C0(j)));
            }
            if (!cursor.isNull(6)) {
                k.g(Integer.valueOf(cursor.getInt(6)));
            }
            list.add(bi0.a(j, g21Var, k.d()));
        }
        return null;
    }

    @Override // androidx.appcompat.view.menu.gp
    public Iterable q() {
        return (Iterable) W(new b() { // from class: androidx.appcompat.view.menu.gq0
            @Override // androidx.appcompat.view.menu.hr0.b
            public final Object apply(Object obj) {
                List j0;
                j0 = hr0.j0((SQLiteDatabase) obj);
                return j0;
            }
        });
    }

    public final /* synthetic */ Long q0(ap apVar, g21 g21Var, SQLiteDatabase sQLiteDatabase) {
        if (X()) {
            a(1L, ja0.b.CACHE_FULL, apVar.j());
            return -1L;
        }
        long O = O(sQLiteDatabase, g21Var);
        int e = this.p.e();
        byte[] a2 = apVar.e().a();
        boolean z = a2.length <= e;
        ContentValues contentValues = new ContentValues();
        contentValues.put("context_id", Long.valueOf(O));
        contentValues.put("transport_name", apVar.j());
        contentValues.put("timestamp_ms", Long.valueOf(apVar.f()));
        contentValues.put("uptime_ms", Long.valueOf(apVar.k()));
        contentValues.put("payload_encoding", apVar.e().b().a());
        contentValues.put("code", apVar.d());
        contentValues.put("num_attempts", (Integer) 0);
        contentValues.put("inline", Boolean.valueOf(z));
        contentValues.put("payload", z ? a2 : new byte[0]);
        long insert = sQLiteDatabase.insert("events", null, contentValues);
        if (!z) {
            int ceil = (int) Math.ceil(a2.length / e);
            for (int i = 1; i <= ceil; i++) {
                byte[] copyOfRange = Arrays.copyOfRange(a2, (i - 1) * e, Math.min(i * e, a2.length));
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("event_id", Long.valueOf(insert));
                contentValues2.put("sequence_num", Integer.valueOf(i));
                contentValues2.put("bytes", copyOfRange);
                sQLiteDatabase.insert("event_payloads", null, contentValues2);
            }
        }
        for (Map.Entry entry : apVar.i().entrySet()) {
            ContentValues contentValues3 = new ContentValues();
            contentValues3.put("event_id", Long.valueOf(insert));
            contentValues3.put("name", (String) entry.getKey());
            contentValues3.put("value", (String) entry.getValue());
            sQLiteDatabase.insert("event_metadata", null, contentValues3);
        }
        return Long.valueOf(insert);
    }

    public final /* synthetic */ Object s0(Cursor cursor) {
        while (cursor.moveToNext()) {
            int i = cursor.getInt(0);
            a(i, ja0.b.MAX_RETRIES_REACHED, cursor.getString(1));
        }
        return null;
    }

    public final /* synthetic */ Object t0(String str, String str2, SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement(str).execute();
        G0(sQLiteDatabase.rawQuery(str2, null), new b() { // from class: androidx.appcompat.view.menu.pq0
            @Override // androidx.appcompat.view.menu.hr0.b
            public final Object apply(Object obj) {
                Object s0;
                s0 = hr0.this.s0((Cursor) obj);
                return s0;
            }
        });
        sQLiteDatabase.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
        return null;
    }

    @Override // androidx.appcompat.view.menu.gp
    public boolean v(final g21 g21Var) {
        return ((Boolean) W(new b() { // from class: androidx.appcompat.view.menu.fr0
            @Override // androidx.appcompat.view.menu.hr0.b
            public final Object apply(Object obj) {
                Boolean i0;
                i0 = hr0.this.i0(g21Var, (SQLiteDatabase) obj);
                return i0;
            }
        })).booleanValue();
    }

    public final /* synthetic */ Object x0(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement("DELETE FROM log_event_dropped").execute();
        sQLiteDatabase.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + this.n.a()).execute();
        return null;
    }

    @Override // androidx.appcompat.view.menu.gp
    public void y(Iterable iterable) {
        if (iterable.iterator().hasNext()) {
            final String str = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + F0(iterable);
            W(new b() { // from class: androidx.appcompat.view.menu.kq0
                @Override // androidx.appcompat.view.menu.hr0.b
                public final Object apply(Object obj) {
                    Object t0;
                    t0 = hr0.this.t0(str, r3, (SQLiteDatabase) obj);
                    return t0;
                }
            });
        }
    }

    public final List y0(SQLiteDatabase sQLiteDatabase, final g21 g21Var, int i) {
        final ArrayList arrayList = new ArrayList();
        Long V = V(sQLiteDatabase, g21Var);
        if (V == null) {
            return arrayList;
        }
        G0(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{V.toString()}, null, null, null, String.valueOf(i)), new b() { // from class: androidx.appcompat.view.menu.qq0
            @Override // androidx.appcompat.view.menu.hr0.b
            public final Object apply(Object obj) {
                Object o0;
                o0 = hr0.this.o0(arrayList, g21Var, (Cursor) obj);
                return o0;
            }
        });
        return arrayList;
    }

    public final Map z0(SQLiteDatabase sQLiteDatabase, List list) {
        final HashMap hashMap = new HashMap();
        StringBuilder sb = new StringBuilder("event_id IN (");
        for (int i = 0; i < list.size(); i++) {
            sb.append(((bi0) list.get(i)).c());
            if (i < list.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(')');
        G0(sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb.toString(), null, null, null, null), new b() { // from class: androidx.appcompat.view.menu.mq0
            @Override // androidx.appcompat.view.menu.hr0.b
            public final Object apply(Object obj) {
                Object p0;
                p0 = hr0.p0(hashMap, (Cursor) obj);
                return p0;
            }
        });
        return hashMap;
    }
}
