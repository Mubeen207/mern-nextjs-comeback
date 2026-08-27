package androidx.appcompat.view.menu;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
/* loaded from: classes.dex */
public final class u22 implements Application.ActivityLifecycleCallbacks {
    public final /* synthetic */ g02 a;

    public u22(g02 g02Var) {
        this.a = g02Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00c8 A[Catch: RuntimeException -> 0x0028, TRY_ENTER, TryCatch #0 {RuntimeException -> 0x0028, blocks: (B:3:0x000b, B:5:0x0018, B:11:0x002c, B:13:0x0032, B:17:0x0043, B:47:0x00c8, B:49:0x00d4, B:53:0x00e5, B:55:0x00eb, B:59:0x0100, B:61:0x0106, B:64:0x0113, B:66:0x0119, B:67:0x012e, B:68:0x013a, B:71:0x0141, B:75:0x0164, B:77:0x0180, B:76:0x0171, B:79:0x0187, B:81:0x018d, B:83:0x0193, B:85:0x0199, B:87:0x019f, B:89:0x01a7, B:91:0x01af, B:93:0x01b5, B:95:0x01bb, B:21:0x0057, B:24:0x005f, B:26:0x0067, B:28:0x006d, B:30:0x0073, B:32:0x0079, B:34:0x0081, B:36:0x0089, B:39:0x0093, B:41:0x009b, B:42:0x00a7, B:44:0x00bf), top: B:99:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0140 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0141 A[Catch: RuntimeException -> 0x0028, TRY_LEAVE, TryCatch #0 {RuntimeException -> 0x0028, blocks: (B:3:0x000b, B:5:0x0018, B:11:0x002c, B:13:0x0032, B:17:0x0043, B:47:0x00c8, B:49:0x00d4, B:53:0x00e5, B:55:0x00eb, B:59:0x0100, B:61:0x0106, B:64:0x0113, B:66:0x0119, B:67:0x012e, B:68:0x013a, B:71:0x0141, B:75:0x0164, B:77:0x0180, B:76:0x0171, B:79:0x0187, B:81:0x018d, B:83:0x0193, B:85:0x0199, B:87:0x019f, B:89:0x01a7, B:91:0x01af, B:93:0x01b5, B:95:0x01bb, B:21:0x0057, B:24:0x005f, B:26:0x0067, B:28:0x006d, B:30:0x0073, B:32:0x0079, B:34:0x0081, B:36:0x0089, B:39:0x0093, B:41:0x009b, B:42:0x00a7, B:44:0x00bf), top: B:99:0x000b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void a(androidx.appcompat.view.menu.u22 r17, boolean r18, android.net.Uri r19, java.lang.String r20, java.lang.String r21) {
        /*
            Method dump skipped, instructions count: 473
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.u22.a(androidx.appcompat.view.menu.u22, boolean, android.net.Uri, java.lang.String, java.lang.String):void");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        try {
            try {
                this.a.l().K().a("onActivityCreated");
                Intent intent = activity.getIntent();
                if (intent == null) {
                    this.a.s().F(activity, bundle);
                    return;
                }
                Uri data = intent.getData();
                if (data == null || !data.isHierarchical()) {
                    Bundle extras = intent.getExtras();
                    if (extras != null) {
                        String string = extras.getString("com.android.vending.referral_url");
                        if (!TextUtils.isEmpty(string)) {
                            data = Uri.parse(string);
                        }
                    }
                    data = null;
                }
                Uri uri = data;
                if (uri != null && uri.isHierarchical()) {
                    this.a.j();
                    this.a.h().D(new g32(this, bundle == null, uri, aa2.e0(intent) ? "gs" : "auto", uri.getQueryParameter("referrer")));
                    this.a.s().F(activity, bundle);
                }
            } catch (RuntimeException e) {
                this.a.l().G().b("Throwable caught in onActivityCreated", e);
                this.a.s().F(activity, bundle);
            }
        } finally {
            this.a.s().F(activity, bundle);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.a.s().E(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        this.a.s().Q(activity);
        b72 u = this.a.u();
        u.h().D(new f72(u, u.b().b()));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        b72 u = this.a.u();
        u.h().D(new n72(u, u.b().b()));
        this.a.s().S(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        this.a.s().R(activity, bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
