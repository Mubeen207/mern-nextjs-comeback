package androidx.appcompat.view.menu;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.Parcel;
import android.os.SystemClock;
/* loaded from: classes.dex */
public final class it1 extends fp1 {
    public final gt1 c;
    public boolean d;

    public it1(fx1 fx1Var) {
        super(fx1Var);
        this.c = new gt1(this, a(), "google_app_measurement_local.db");
    }

    public static long B(SQLiteDatabase sQLiteDatabase) {
        Cursor cursor = null;
        try {
            cursor = sQLiteDatabase.query("messages", new String[]{"rowid"}, "type=?", new String[]{"3"}, null, null, "rowid desc", "1");
            if (!cursor.moveToFirst()) {
                cursor.close();
                return -1L;
            }
            long j = cursor.getLong(0);
            cursor.close();
            return j;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    private final boolean L() {
        return a().getDatabasePath("google_app_measurement_local.db").exists();
    }

    @Override // androidx.appcompat.view.menu.fp1
    public final boolean A() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01ba A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x020c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x020c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x020c A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List C(int r23) {
        /*
            Method dump skipped, instructions count: 556
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.it1.C(int):java.util.List");
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x006b A[Catch: all -> 0x0056, SQLiteException -> 0x005a, SQLiteFullException -> 0x005c, SQLiteDatabaseLockedException -> 0x00bc, TRY_ENTER, TryCatch #6 {SQLiteDatabaseLockedException -> 0x00bc, SQLiteFullException -> 0x005c, SQLiteException -> 0x005a, all -> 0x0056, blocks: (B:23:0x004b, B:25:0x0051, B:36:0x006b, B:38:0x008f, B:39:0x00a9), top: B:90:0x004b }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0128  */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean D(int r17, byte[] r18) {
        /*
            Method dump skipped, instructions count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.it1.D(int, byte[]):boolean");
    }

    public final boolean E(lf1 lf1Var) {
        j();
        byte[] p0 = aa2.p0(lf1Var);
        if (p0.length > 131072) {
            l().I().a("Conditional user property too long for local database. Sending directly to service");
            return false;
        }
        return D(2, p0);
    }

    public final boolean F(ri1 ri1Var) {
        Parcel obtain = Parcel.obtain();
        ri1Var.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length > 131072) {
            l().I().a("Event is too long for local database. Sending event directly to service");
            return false;
        }
        return D(0, marshall);
    }

    public final boolean G(y92 y92Var) {
        Parcel obtain = Parcel.obtain();
        y92Var.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length > 131072) {
            l().I().a("User property too long for local database. Sending directly to service");
            return false;
        }
        return D(1, marshall);
    }

    public final void H() {
        int delete;
        n();
        try {
            SQLiteDatabase K = K();
            if (K == null || (delete = K.delete("messages", null, null)) <= 0) {
                return;
            }
            l().K().b("Reset local analytics data. records", Integer.valueOf(delete));
        } catch (SQLiteException e) {
            l().G().b("Error resetting local analytics data. error", e);
        }
    }

    public final boolean I() {
        return D(3, new byte[0]);
    }

    public final boolean J() {
        n();
        if (!this.d && L()) {
            int i = 5;
            for (int i2 = 0; i2 < 5; i2++) {
                SQLiteDatabase sQLiteDatabase = null;
                try {
                    try {
                        SQLiteDatabase K = K();
                        if (K == null) {
                            this.d = true;
                            if (K != null) {
                                K.close();
                            }
                            return false;
                        }
                        K.beginTransaction();
                        K.delete("messages", "type == ?", new String[]{Integer.toString(3)});
                        K.setTransactionSuccessful();
                        K.endTransaction();
                        K.close();
                        return true;
                    } catch (SQLiteFullException e) {
                        l().G().b("Error deleting app launch break from local database", e);
                        this.d = true;
                        if (0 != 0) {
                            sQLiteDatabase.close();
                        }
                    }
                } catch (SQLiteDatabaseLockedException unused) {
                    SystemClock.sleep(i);
                    i += 20;
                    if (0 != 0) {
                        sQLiteDatabase.close();
                    }
                } catch (SQLiteException e2) {
                    if (0 != 0) {
                        try {
                            if (sQLiteDatabase.inTransaction()) {
                                sQLiteDatabase.endTransaction();
                            }
                        } catch (Throwable th) {
                            if (0 != 0) {
                                sQLiteDatabase.close();
                            }
                            throw th;
                        }
                    }
                    l().G().b("Error deleting app launch break from local database", e2);
                    this.d = true;
                    if (0 != 0) {
                        sQLiteDatabase.close();
                    }
                }
            }
            l().L().a("Error deleting app launch break from local database in reasonable time");
            return false;
        }
        return false;
    }

    public final SQLiteDatabase K() {
        if (this.d) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.c.getWritableDatabase();
        if (writableDatabase == null) {
            this.d = true;
            return null;
        }
        return writableDatabase;
    }

    @Override // androidx.appcompat.view.menu.iz1, androidx.appcompat.view.menu.lz1
    public final /* bridge */ /* synthetic */ Context a() {
        return super.a();
    }

    @Override // androidx.appcompat.view.menu.iz1, androidx.appcompat.view.menu.lz1
    public final /* bridge */ /* synthetic */ cc b() {
        return super.b();
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

    @Override // androidx.appcompat.view.menu.iz1
    public final /* bridge */ /* synthetic */ wu1 i() {
        return super.i();
    }

    @Override // androidx.appcompat.view.menu.iz1
    public final /* bridge */ /* synthetic */ aa2 j() {
        return super.j();
    }

    @Override // androidx.appcompat.view.menu.kr1, androidx.appcompat.view.menu.iz1
    public final /* bridge */ /* synthetic */ void k() {
        super.k();
    }

    @Override // androidx.appcompat.view.menu.iz1, androidx.appcompat.view.menu.lz1
    public final /* bridge */ /* synthetic */ st1 l() {
        return super.l();
    }

    @Override // androidx.appcompat.view.menu.kr1, androidx.appcompat.view.menu.iz1
    public final /* bridge */ /* synthetic */ void m() {
        super.m();
    }

    @Override // androidx.appcompat.view.menu.kr1, androidx.appcompat.view.menu.iz1
    public final /* bridge */ /* synthetic */ void n() {
        super.n();
    }

    @Override // androidx.appcompat.view.menu.kr1
    public final /* bridge */ /* synthetic */ rh1 o() {
        return super.o();
    }

    @Override // androidx.appcompat.view.menu.kr1
    public final /* bridge */ /* synthetic */ ct1 p() {
        return super.p();
    }

    @Override // androidx.appcompat.view.menu.kr1
    public final /* bridge */ /* synthetic */ it1 q() {
        return super.q();
    }

    @Override // androidx.appcompat.view.menu.kr1
    public final /* bridge */ /* synthetic */ g02 r() {
        return super.r();
    }

    @Override // androidx.appcompat.view.menu.kr1
    public final /* bridge */ /* synthetic */ u32 s() {
        return super.s();
    }

    @Override // androidx.appcompat.view.menu.kr1
    public final /* bridge */ /* synthetic */ k42 t() {
        return super.t();
    }

    @Override // androidx.appcompat.view.menu.kr1
    public final /* bridge */ /* synthetic */ b72 u() {
        return super.u();
    }
}
