package com.snake.helper;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Bundle;
import androidx.appcompat.view.menu.bv0;
import androidx.appcompat.view.menu.dt0;
import androidx.appcompat.view.menu.e9;
import androidx.appcompat.view.menu.vv0;
/* loaded from: classes.dex */
public class SystemCallProvider extends ContentProvider {
    public final boolean a() {
        vv0.a().b();
        return true;
    }

    public final void b(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        try {
            bundle.setClassLoader(getClass().getClassLoader());
            for (String str : bundle.keySet()) {
                bundle.get(str);
            }
        } catch (BadParcelableException unused) {
        }
    }

    @Override // android.content.ContentProvider
    public Bundle call(String str, String str2, Bundle bundle) {
        b(bundle);
        if ("VM".equals(str)) {
            Bundle bundle2 = new Bundle();
            if (bundle != null) {
                e9.d(bundle2, "_S_|_server_", dt0.b(bundle.getString("_S_|_server_name_")));
            }
            return bundle2;
        }
        return super.call(str, str2, bundle);
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        bv0.h().w();
        return a();
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
