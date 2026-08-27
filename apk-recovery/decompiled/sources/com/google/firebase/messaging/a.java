package com.google.firebase.messaging;

import android.util.Log;
import androidx.appcompat.view.menu.cz0;
import androidx.appcompat.view.menu.o4;
import androidx.appcompat.view.menu.yg;
import java.util.Map;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public class a {
    public final Executor a;
    public final Map b = new o4();

    /* renamed from: com.google.firebase.messaging.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0066a {
        cz0 a();
    }

    public a(Executor executor) {
        this.a = executor;
    }

    public synchronized cz0 b(final String str, InterfaceC0066a interfaceC0066a) {
        cz0 cz0Var = (cz0) this.b.get(str);
        if (cz0Var != null) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Joining ongoing request for: ");
                sb.append(str);
            }
            return cz0Var;
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Making new request for: ");
            sb2.append(str);
        }
        cz0 g = interfaceC0066a.a().g(this.a, new yg() { // from class: androidx.appcompat.view.menu.ap0
            @Override // androidx.appcompat.view.menu.yg
            public final Object a(cz0 cz0Var2) {
                cz0 c;
                c = com.google.firebase.messaging.a.this.c(str, cz0Var2);
                return c;
            }
        });
        this.b.put(str, g);
        return g;
    }

    public final /* synthetic */ cz0 c(String str, cz0 cz0Var) {
        synchronized (this) {
            this.b.remove(str);
        }
        return cz0Var;
    }
}
