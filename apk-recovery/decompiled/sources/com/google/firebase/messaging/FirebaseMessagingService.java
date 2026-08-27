package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.appcompat.view.menu.aq0;
import androidx.appcompat.view.menu.cd0;
import androidx.appcompat.view.menu.gt0;
import androidx.appcompat.view.menu.jc;
import androidx.appcompat.view.menu.kr;
import androidx.appcompat.view.menu.lm;
import androidx.appcompat.view.menu.pf0;
import androidx.appcompat.view.menu.ps0;
import androidx.appcompat.view.menu.ro;
import androidx.appcompat.view.menu.so0;
import androidx.appcompat.view.menu.t02;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
/* loaded from: classes.dex */
public class FirebaseMessagingService extends ro {
    public static final Queue g = new ArrayDeque(10);
    public aq0 f;

    @Override // androidx.appcompat.view.menu.ro
    public Intent e(Intent intent) {
        return gt0.b().c();
    }

    @Override // androidx.appcompat.view.menu.ro
    public void f(Intent intent) {
        String action = intent.getAction();
        if ("com.google.android.c2dm.intent.RECEIVE".equals(action) || "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(action)) {
            p(intent);
        } else if ("com.google.firebase.messaging.NEW_TOKEN".equals(action)) {
            t(intent.getStringExtra("token"));
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Unknown intent action: ");
            sb.append(intent.getAction());
        }
    }

    public final boolean l(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Queue queue = g;
        if (!queue.contains(str)) {
            if (queue.size() >= 10) {
                queue.remove();
            }
            queue.add(str);
            return false;
        } else if (Log.isLoggable("FirebaseMessaging", 3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Received duplicate message: ");
            sb.append(str);
            return true;
        } else {
            return true;
        }
    }

    public final void m(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            extras = new Bundle();
        }
        extras.remove("androidx.content.wakelockid");
        if (pf0.t(extras)) {
            pf0 pf0Var = new pf0(extras);
            ExecutorService e = kr.e();
            try {
                if (new lm(this, pf0Var, e).a()) {
                    return;
                }
                e.shutdown();
                if (cd0.A(intent)) {
                    cd0.t(intent);
                }
            } finally {
                e.shutdown();
            }
        }
        r(new so0(extras));
    }

    public final String n(Intent intent) {
        String stringExtra = intent.getStringExtra("google.message_id");
        return stringExtra == null ? intent.getStringExtra("message_id") : stringExtra;
    }

    public final aq0 o(Context context) {
        if (this.f == null) {
            this.f = new aq0(context.getApplicationContext());
        }
        return this.f;
    }

    public final void p(Intent intent) {
        if (!l(intent.getStringExtra("google.message_id"))) {
            v(intent);
        }
        o(this).a(new jc(intent));
    }

    public void q() {
    }

    public void r(so0 so0Var) {
    }

    public void s(String str) {
    }

    public void t(String str) {
    }

    public void u(String str, Exception exc) {
    }

    public final void v(Intent intent) {
        String stringExtra = intent.getStringExtra("message_type");
        if (stringExtra == null) {
            stringExtra = "gcm";
        }
        char c = 65535;
        switch (stringExtra.hashCode()) {
            case -2062414158:
                if (stringExtra.equals("deleted_messages")) {
                    c = 0;
                    break;
                }
                break;
            case 102161:
                if (stringExtra.equals("gcm")) {
                    c = 1;
                    break;
                }
                break;
            case 814694033:
                if (stringExtra.equals("send_error")) {
                    c = 2;
                    break;
                }
                break;
            case 814800675:
                if (stringExtra.equals("send_event")) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                q();
                return;
            case 1:
                cd0.v(intent);
                m(intent);
                return;
            case 2:
                u(n(intent), new ps0(intent.getStringExtra("error")));
                return;
            case t02.c.c /* 3 */:
                s(intent.getStringExtra("google.message_id"));
                return;
            default:
                StringBuilder sb = new StringBuilder();
                sb.append("Received message with unknown type: ");
                sb.append(stringExtra);
                return;
        }
    }
}
