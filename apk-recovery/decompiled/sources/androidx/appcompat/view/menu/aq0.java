package androidx.appcompat.view.menu;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public class aq0 {
    public static int h;
    public static PendingIntent i;
    public static final Executor j = new Executor() { // from class: androidx.appcompat.view.menu.bg2
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            runnable.run();
        }
    };
    public static final Pattern k = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");
    public final Context b;
    public final mf2 c;
    public final ScheduledExecutorService d;
    public Messenger f;
    public hp1 g;
    public final qu0 a = new qu0();
    public final Messenger e = new Messenger(new nf1(this, Looper.getMainLooper()));

    public aq0(Context context) {
        this.b = context;
        this.c = new mf2(context);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.d = scheduledThreadPoolExecutor;
    }

    public static /* synthetic */ cz0 c(Bundle bundle) {
        return k(bundle) ? mz0.e(null) : mz0.e(bundle);
    }

    public static /* bridge */ /* synthetic */ void e(aq0 aq0Var, Message message) {
        if (message != null) {
            Object obj = message.obj;
            if (obj instanceof Intent) {
                Intent intent = (Intent) obj;
                intent.setExtrasClassLoader(new en1());
                if (intent.hasExtra("google.messenger")) {
                    Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                    if (parcelableExtra instanceof hp1) {
                        aq0Var.g = (hp1) parcelableExtra;
                    }
                    if (parcelableExtra instanceof Messenger) {
                        aq0Var.f = (Messenger) parcelableExtra;
                    }
                }
                Intent intent2 = (Intent) message.obj;
                String action = intent2.getAction();
                if (!rf2.a(action, "com.google.android.c2dm.intent.REGISTRATION")) {
                    if (Log.isLoggable("Rpc", 3)) {
                        "Unexpected response action: ".concat(String.valueOf(action));
                        return;
                    }
                    return;
                }
                String stringExtra = intent2.getStringExtra("registration_id");
                if (stringExtra == null) {
                    stringExtra = intent2.getStringExtra("unregistered");
                }
                if (stringExtra != null) {
                    Matcher matcher = k.matcher(stringExtra);
                    if (!matcher.matches()) {
                        if (Log.isLoggable("Rpc", 3)) {
                            "Unexpected response string: ".concat(stringExtra);
                            return;
                        }
                        return;
                    }
                    String group = matcher.group(1);
                    String group2 = matcher.group(2);
                    if (group != null) {
                        Bundle extras = intent2.getExtras();
                        extras.putString("registration_id", group2);
                        aq0Var.j(group, extras);
                        return;
                    }
                    return;
                }
                String stringExtra2 = intent2.getStringExtra("error");
                if (stringExtra2 == null) {
                    "Unexpected response, no error or registration id ".concat(String.valueOf(intent2.getExtras()));
                    return;
                }
                if (Log.isLoggable("Rpc", 3)) {
                    "Received InstanceID error ".concat(stringExtra2);
                }
                if (!stringExtra2.startsWith("|")) {
                    synchronized (aq0Var.a) {
                        for (int i2 = 0; i2 < aq0Var.a.size(); i2++) {
                            try {
                                aq0Var.j((String) aq0Var.a.i(i2), intent2.getExtras());
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    return;
                }
                String[] split = stringExtra2.split("\\|");
                if (split.length <= 2 || !rf2.a(split[1], "ID")) {
                    "Unexpected structured response ".concat(stringExtra2);
                    return;
                }
                String str = split[2];
                String str2 = split[3];
                if (str2.startsWith(":")) {
                    str2 = str2.substring(1);
                }
                aq0Var.j(str, intent2.putExtra("error", str2).getExtras());
            }
        }
    }

    public static synchronized String h() {
        String num;
        synchronized (aq0.class) {
            int i2 = h;
            h = i2 + 1;
            num = Integer.toString(i2);
        }
        return num;
    }

    public static synchronized void i(Context context, Intent intent) {
        synchronized (aq0.class) {
            try {
                if (i == null) {
                    Intent intent2 = new Intent();
                    intent2.setPackage("com.google.example.invalidpackage");
                    i = PendingIntent.getBroadcast(context, 0, intent2, ue1.a);
                }
                intent.putExtra("app", i);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static boolean k(Bundle bundle) {
        return bundle != null && bundle.containsKey("google.messenger");
    }

    public cz0 a(jc jcVar) {
        if (this.c.a() >= 233700000) {
            Bundle bundle = new Bundle();
            bundle.putString("google.message_id", jcVar.f());
            Integer i2 = jcVar.i();
            if (i2 != null) {
                bundle.putInt("google.product_id", i2.intValue());
            }
            return hf2.b(this.b).c(3, bundle);
        }
        return mz0.d(new IOException("SERVICE_NOT_AVAILABLE"));
    }

    public cz0 b(final Bundle bundle) {
        return this.c.a() < 12000000 ? this.c.b() != 0 ? g(bundle).g(j, new yg() { // from class: androidx.appcompat.view.menu.gg2
            @Override // androidx.appcompat.view.menu.yg
            public final Object a(cz0 cz0Var) {
                return aq0.this.d(bundle, cz0Var);
            }
        }) : mz0.d(new IOException("MISSING_INSTANCEID_SERVICE")) : hf2.b(this.b).d(1, bundle).f(j, new yg() { // from class: androidx.appcompat.view.menu.ze1
            @Override // androidx.appcompat.view.menu.yg
            public final Object a(cz0 cz0Var) {
                if (cz0Var.m()) {
                    return (Bundle) cz0Var.i();
                }
                if (Log.isLoggable("Rpc", 3)) {
                    "Error making request: ".concat(String.valueOf(cz0Var.h()));
                }
                throw new IOException("SERVICE_NOT_AVAILABLE", cz0Var.h());
            }
        });
    }

    public final /* synthetic */ cz0 d(Bundle bundle, cz0 cz0Var) {
        return (cz0Var.m() && k((Bundle) cz0Var.i())) ? g(bundle).n(j, new fy0() { // from class: androidx.appcompat.view.menu.wf2
            @Override // androidx.appcompat.view.menu.fy0
            public final cz0 a(Object obj) {
                return aq0.c((Bundle) obj);
            }
        }) : cz0Var;
    }

    public final /* synthetic */ void f(String str, ScheduledFuture scheduledFuture, cz0 cz0Var) {
        synchronized (this.a) {
            this.a.remove(str);
        }
        scheduledFuture.cancel(false);
    }

    public final cz0 g(Bundle bundle) {
        final String h2 = h();
        final ez0 ez0Var = new ez0();
        synchronized (this.a) {
            this.a.put(h2, ez0Var);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        if (this.c.b() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        i(this.b, intent);
        intent.putExtra("kid", "|ID|" + h2 + "|");
        if (Log.isLoggable("Rpc", 3)) {
            "Sending ".concat(String.valueOf(intent.getExtras()));
        }
        intent.putExtra("google.messenger", this.e);
        if (this.f != null || this.g != null) {
            Message obtain = Message.obtain();
            obtain.obj = intent;
            try {
                Messenger messenger = this.f;
                if (messenger != null) {
                    messenger.send(obtain);
                } else {
                    this.g.b(obtain);
                }
            } catch (RemoteException unused) {
                Log.isLoggable("Rpc", 3);
            }
            final ScheduledFuture<?> schedule = this.d.schedule(new Runnable() { // from class: androidx.appcompat.view.menu.df1
                @Override // java.lang.Runnable
                public final void run() {
                    ez0.this.d(new IOException("TIMEOUT"));
                }
            }, 30L, TimeUnit.SECONDS);
            ez0Var.a().c(j, new jg0() { // from class: androidx.appcompat.view.menu.if1
                @Override // androidx.appcompat.view.menu.jg0
                public final void a(cz0 cz0Var) {
                    aq0.this.f(h2, schedule, cz0Var);
                }
            });
            return ez0Var.a();
        }
        if (this.c.b() == 2) {
            this.b.sendBroadcast(intent);
        } else {
            this.b.startService(intent);
        }
        final ScheduledFuture schedule2 = this.d.schedule(new Runnable() { // from class: androidx.appcompat.view.menu.df1
            @Override // java.lang.Runnable
            public final void run() {
                ez0.this.d(new IOException("TIMEOUT"));
            }
        }, 30L, TimeUnit.SECONDS);
        ez0Var.a().c(j, new jg0() { // from class: androidx.appcompat.view.menu.if1
            @Override // androidx.appcompat.view.menu.jg0
            public final void a(cz0 cz0Var) {
                aq0.this.f(h2, schedule2, cz0Var);
            }
        });
        return ez0Var.a();
    }

    public final void j(String str, Bundle bundle) {
        synchronized (this.a) {
            try {
                ez0 ez0Var = (ez0) this.a.remove(str);
                if (ez0Var != null) {
                    ez0Var.c(bundle);
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Missing callback for ");
                sb.append(str);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
