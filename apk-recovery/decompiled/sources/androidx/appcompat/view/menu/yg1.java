package androidx.appcompat.view.menu;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import java.io.File;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
/* loaded from: classes.dex */
public abstract class yg1 {
    public static Set a(SQLiteDatabase sQLiteDatabase, String str) {
        HashSet hashSet = new HashSet();
        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT * FROM " + str + " LIMIT 0", null);
        try {
            Collections.addAll(hashSet, rawQuery.getColumnNames());
            return hashSet;
        } finally {
            rawQuery.close();
        }
    }

    public static void b(st1 st1Var, SQLiteDatabase sQLiteDatabase) {
        if (st1Var == null) {
            throw new IllegalArgumentException("Monitor must not be null");
        }
        File file = new File(sQLiteDatabase.getPath());
        if (!file.setReadable(false, false)) {
            st1Var.L().a("Failed to turn off database read permission");
        }
        if (!file.setWritable(false, false)) {
            st1Var.L().a("Failed to turn off database write permission");
        }
        if (!file.setReadable(true, true)) {
            st1Var.L().a("Failed to turn on database read permission for owner");
        }
        if (file.setWritable(true, true)) {
            return;
        }
        st1Var.L().a("Failed to turn on database write permission for owner");
    }

    public static void c(st1 st1Var, SQLiteDatabase sQLiteDatabase, String str, String str2, String str3, String[] strArr) {
        String[] split;
        if (st1Var == null) {
            throw new IllegalArgumentException("Monitor must not be null");
        }
        if (!d(st1Var, sQLiteDatabase, str)) {
            sQLiteDatabase.execSQL(str2);
        }
        try {
            Set a = a(sQLiteDatabase, str);
            for (String str4 : str3.split(",")) {
                if (!a.remove(str4)) {
                    throw new SQLiteException("Table " + str + " is missing required column: " + str4);
                }
            }
            if (strArr != null) {
                for (int i = 0; i < strArr.length; i += 2) {
                    if (!a.remove(strArr[i])) {
                        sQLiteDatabase.execSQL(strArr[i + 1]);
                    }
                }
            }
            if (a.isEmpty()) {
                return;
            }
            st1Var.L().c("Table has extra columns. table, columns", str, TextUtils.join(", ", a));
        } catch (SQLiteException e) {
            st1Var.G().b("Failed to verify columns on table that was just created", str);
            throw e;
        }
    }

    public static boolean d(st1 st1Var, SQLiteDatabase sQLiteDatabase, String str) {
        if (st1Var != null) {
            Cursor cursor = null;
            try {
                try {
                    cursor = sQLiteDatabase.query("SQLITE_MASTER", new String[]{"name"}, "name=?", new String[]{str}, null, null, null);
                    boolean moveToFirst = cursor.moveToFirst();
                    cursor.close();
                    return moveToFirst;
                } catch (SQLiteException e) {
                    st1Var.L().c("Error querying for table", str, e);
                    if (cursor != null) {
                        cursor.close();
                    }
                    return false;
                }
            } catch (Throwable th) {
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        }
        throw new IllegalArgumentException("Monitor must not be null");
    }
}
