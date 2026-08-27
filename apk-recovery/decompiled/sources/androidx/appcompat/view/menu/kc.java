package androidx.appcompat.view.menu;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import java.lang.ref.SoftReference;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* loaded from: classes.dex */
public abstract class kc extends BroadcastReceiver {
    public static SoftReference a;

    public Executor a() {
        ExecutorService executorService;
        synchronized (kc.class) {
            try {
                SoftReference softReference = a;
                executorService = softReference != null ? (ExecutorService) softReference.get() : null;
                if (executorService == null) {
                    cp1.a();
                    executorService = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool(new oe0("firebase-iid-executor")));
                    a = new SoftReference(executorService);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return executorService;
    }

    public abstract int b(Context context, jc jcVar);

    public abstract void c(Context context, Bundle bundle);

    public final /* synthetic */ void d(Intent intent, Context context, boolean z, BroadcastReceiver.PendingResult pendingResult) {
        try {
            Parcelable parcelableExtra = intent.getParcelableExtra("wrapped_intent");
            Intent intent2 = parcelableExtra instanceof Intent ? (Intent) parcelableExtra : null;
            int f = intent2 != null ? f(context, intent2) : e(context, intent);
            if (z) {
                pendingResult.setResultCode(f);
            }
            pendingResult.finish();
        } catch (Throwable th) {
            pendingResult.finish();
            throw th;
        }
    }

    public final int e(Context context, Intent intent) {
        cz0 c;
        if (intent.getExtras() == null) {
            return 500;
        }
        jc jcVar = new jc(intent);
        if (TextUtils.isEmpty(jcVar.f())) {
            c = mz0.e(null);
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("google.message_id", jcVar.f());
            Integer i = jcVar.i();
            if (i != null) {
                bundle.putInt("google.product_id", i.intValue());
            }
            bundle.putBoolean("supports_message_handled", true);
            c = hf2.b(context).c(2, bundle);
        }
        int b = b(context, jcVar);
        try {
            mz0.b(c, TimeUnit.SECONDS.toMillis(1L), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            "Message ack failed: ".concat(e.toString());
        }
        return b;
    }

    public final int f(Context context, Intent intent) {
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("pending_intent");
        if (pendingIntent != null) {
            try {
                pendingIntent.send();
            } catch (PendingIntent.CanceledException unused) {
            }
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            extras.remove("pending_intent");
        } else {
            extras = new Bundle();
        }
        String action = intent.getAction();
        if (action == "com.google.firebase.messaging.NOTIFICATION_DISMISS" || (action != null && action.equals("com.google.firebase.messaging.NOTIFICATION_DISMISS"))) {
            c(context, extras);
            return -1;
        }
        return 500;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(final Context context, final Intent intent) {
        if (intent == null) {
            return;
        }
        final boolean isOrderedBroadcast = isOrderedBroadcast();
        final BroadcastReceiver.PendingResult goAsync = goAsync();
        a().execute(new Runnable() { // from class: androidx.appcompat.view.menu.mr1
            @Override // java.lang.Runnable
            public final void run() {
                kc.this.d(intent, context, isOrderedBroadcast, goAsync);
            }
        });
    }
}
