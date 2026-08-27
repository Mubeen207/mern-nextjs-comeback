package com.snake;

import android.app.Application;
import android.content.Context;
import androidx.appcompat.view.menu.bv0;
import androidx.appcompat.view.menu.wb;
import androidx.appcompat.view.menu.zh;
/* loaded from: classes.dex */
public class App extends Application {
    public static Context a;

    /* loaded from: classes.dex */
    public class a extends wb {
        public a() {
        }

        @Override // androidx.appcompat.view.menu.wb
        public String a() {
            return App.a.getPackageName();
        }
    }

    static {
        System.loadLibrary("engine");
    }

    @Override // android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        zh.a(this);
        a = context;
        bv0.h().f(a, new a());
    }

    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        bv0.h().g();
    }
}
