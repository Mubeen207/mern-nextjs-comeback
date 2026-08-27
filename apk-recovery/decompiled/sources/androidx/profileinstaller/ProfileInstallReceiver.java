package androidx.profileinstaller;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Process;
import androidx.appcompat.view.menu.lc0;
import androidx.profileinstaller.c;
/* loaded from: classes.dex */
public class ProfileInstallReceiver extends BroadcastReceiver {

    /* loaded from: classes.dex */
    public class a implements c.InterfaceC0050c {
        public a() {
        }

        @Override // androidx.profileinstaller.c.InterfaceC0050c
        public void a(int i, Object obj) {
            c.b.a(i, obj);
        }

        @Override // androidx.profileinstaller.c.InterfaceC0050c
        public void b(int i, Object obj) {
            c.b.b(i, obj);
            ProfileInstallReceiver.this.setResultCode(i);
        }
    }

    public static void a(c.InterfaceC0050c interfaceC0050c) {
        Process.sendSignal(Process.myPid(), 10);
        interfaceC0050c.b(12, null);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Bundle extras;
        if (intent == null) {
            return;
        }
        String action = intent.getAction();
        if ("androidx.profileinstaller.action.INSTALL_PROFILE".equals(action)) {
            c.k(context, new lc0(), new a(), true);
        } else if ("androidx.profileinstaller.action.SKIP_FILE".equals(action)) {
            Bundle extras2 = intent.getExtras();
            if (extras2 != null) {
                String string = extras2.getString("EXTRA_SKIP_FILE_OPERATION");
                if ("WRITE_SKIP_FILE".equals(string)) {
                    c.l(context, new lc0(), new a());
                } else if ("DELETE_SKIP_FILE".equals(string)) {
                    c.c(context, new lc0(), new a());
                }
            }
        } else if ("androidx.profileinstaller.action.SAVE_PROFILE".equals(action)) {
            a(new a());
        } else if (!"androidx.profileinstaller.action.BENCHMARK_OPERATION".equals(action) || (extras = intent.getExtras()) == null) {
        } else {
            String string2 = extras.getString("EXTRA_BENCHMARK_OPERATION");
            a aVar = new a();
            if ("DROP_SHADER_CACHE".equals(string2)) {
                androidx.profileinstaller.a.b(context, aVar);
            } else {
                aVar.b(16, null);
            }
        }
    }
}
