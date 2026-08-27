package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.appcompat.view.menu.my0;
/* loaded from: classes.dex */
public class a {
    public static a c;
    public final Object a = new Object();
    public final Handler b = new Handler(Looper.getMainLooper(), new C0064a());

    /* renamed from: com.google.android.material.snackbar.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0064a implements Handler.Callback {
        public C0064a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            a aVar = a.this;
            my0.a(message.obj);
            aVar.c(null);
            return true;
        }
    }

    /* loaded from: classes.dex */
    public interface b {
    }

    /* loaded from: classes.dex */
    public static class c {
    }

    public static a b() {
        if (c == null) {
            c = new a();
        }
        return c;
    }

    public final boolean a(c cVar, int i) {
        throw null;
    }

    public void c(c cVar) {
        synchronized (this.a) {
            a(cVar, 2);
        }
    }

    public final boolean d(b bVar) {
        return false;
    }

    public void e(b bVar) {
        synchronized (this.a) {
            try {
                if (d(bVar)) {
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void f(b bVar) {
        synchronized (this.a) {
            try {
                if (d(bVar)) {
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
