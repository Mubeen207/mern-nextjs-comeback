package androidx.appcompat.view.menu;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class du0 {
    public final SharedPreferences a;
    public final String b;
    public final String c;
    public final Executor e;
    public final ArrayDeque d = new ArrayDeque();
    public boolean f = false;

    public du0(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        this.a = sharedPreferences;
        this.b = str;
        this.c = str2;
        this.e = executor;
    }

    public static du0 c(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        du0 du0Var = new du0(sharedPreferences, str, str2, executor);
        du0Var.d();
        return du0Var;
    }

    public final boolean b(boolean z) {
        if (z && !this.f) {
            i();
        }
        return z;
    }

    public final void d() {
        synchronized (this.d) {
            try {
                this.d.clear();
                String string = this.a.getString(this.b, "");
                if (!TextUtils.isEmpty(string) && string.contains(this.c)) {
                    String[] split = string.split(this.c, -1);
                    int length = split.length;
                    for (String str : split) {
                        if (!TextUtils.isEmpty(str)) {
                            this.d.add(str);
                        }
                    }
                }
            } finally {
            }
        }
    }

    public String e() {
        String str;
        synchronized (this.d) {
            str = (String) this.d.peek();
        }
        return str;
    }

    public boolean f(Object obj) {
        boolean b;
        synchronized (this.d) {
            b = b(this.d.remove(obj));
        }
        return b;
    }

    public String g() {
        StringBuilder sb = new StringBuilder();
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
            sb.append(this.c);
        }
        return sb.toString();
    }

    public final void h() {
        synchronized (this.d) {
            this.a.edit().putString(this.b, g()).commit();
        }
    }

    public final void i() {
        this.e.execute(new Runnable() { // from class: androidx.appcompat.view.menu.cu0
            @Override // java.lang.Runnable
            public final void run() {
                du0.this.h();
            }
        });
    }
}
