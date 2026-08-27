package androidx.appcompat.view.menu;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import androidx.appcompat.view.menu.fy;
import androidx.appcompat.view.menu.z7;
/* loaded from: classes.dex */
public class nu0 extends vx implements xc1 {
    public static final /* synthetic */ int X = 0;
    public final boolean T;
    public final ac U;
    public final Bundle V;
    public final Integer W;

    public nu0(Context context, Looper looper, boolean z, ac acVar, Bundle bundle, fy.a aVar, fy.b bVar) {
        super(context, looper, 44, acVar, aVar, bVar);
        this.T = true;
        this.U = acVar;
        this.V = bundle;
        this.W = acVar.g();
    }

    public static Bundle l0(ac acVar) {
        acVar.f();
        Integer g = acVar.g();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", acVar.a());
        if (g != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", g.intValue());
        }
        bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
        bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
        bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
        bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
        bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
        bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
        return bundle;
    }

    @Override // androidx.appcompat.view.menu.z7
    public final Bundle A() {
        if (!y().getPackageName().equals(this.U.d())) {
            this.V.putString("com.google.android.gms.signin.internal.realClientPackageName", this.U.d());
        }
        return this.V;
    }

    @Override // androidx.appcompat.view.menu.z7
    public final String E() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // androidx.appcompat.view.menu.z7
    public final String F() {
        return "com.google.android.gms.signin.service.START";
    }

    @Override // androidx.appcompat.view.menu.z7, androidx.appcompat.view.menu.m2.f
    public final int e() {
        return ky.a;
    }

    @Override // androidx.appcompat.view.menu.xc1
    public final void i(yc1 yc1Var) {
        pj0.j(yc1Var, "Expecting a valid ISignInCallbacks");
        try {
            try {
                Account b = this.U.b();
                ((bd1) D()).u2(new ld1(1, new de1(b, ((Integer) pj0.i(this.W)).intValue(), "<<default account>>".equals(b.name) ? fx0.a(y()).b() : null)), yc1Var);
            } catch (RemoteException unused) {
                yc1Var.v(new od1(1, new ef(8, null), null));
            }
        } catch (RemoteException unused2) {
        }
    }

    @Override // androidx.appcompat.view.menu.z7, androidx.appcompat.view.menu.m2.f
    public final boolean o() {
        return this.T;
    }

    @Override // androidx.appcompat.view.menu.xc1
    public final void p() {
        m(new z7.d());
    }

    @Override // androidx.appcompat.view.menu.z7
    public final /* synthetic */ IInterface s(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return queryLocalInterface instanceof bd1 ? (bd1) queryLocalInterface : new bd1(iBinder);
    }
}
