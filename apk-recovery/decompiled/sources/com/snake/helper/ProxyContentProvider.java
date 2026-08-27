package com.snake.helper;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import androidx.appcompat.view.menu.e9;
import androidx.appcompat.view.menu.mv0;
import androidx.appcompat.view.menu.p3;
/* loaded from: classes.dex */
public abstract class ProxyContentProvider extends ContentProvider {

    /* loaded from: classes.dex */
    public static class P0 extends ProxyContentProvider {
    }

    /* loaded from: classes.dex */
    public static class P1 extends ProxyContentProvider {
    }

    /* loaded from: classes.dex */
    public static class P2 extends ProxyContentProvider {
    }

    /* loaded from: classes.dex */
    public static class P3 extends ProxyContentProvider {
    }

    @Override // android.content.ContentProvider
    public Bundle call(String str, String str2, Bundle bundle) {
        if (str.equals("_Engine_|_init_process_")) {
            bundle.setClassLoader(p3.class.getClassLoader());
            mv0.B2().P2((p3) bundle.getParcelable("SnakeEngine_client_config"));
            Bundle bundle2 = new Bundle();
            e9.d(bundle2, "_Engine_|_client_", mv0.B2());
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
        return false;
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
