package androidx.appcompat.view.menu;

import android.accounts.Account;
import android.accounts.AuthenticatorDescription;
import android.accounts.IAccountAuthenticator;
import android.accounts.IAccountAuthenticatorResponse;
import android.accounts.IAccountManagerResponse;
import android.content.ClipData;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageParser;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import androidx.appcompat.view.menu.k00;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
/* loaded from: classes.dex */
public class ev0 extends k00.a implements n30, eh0 {
    public static final ev0 s = new ev0();
    public static final Account[] t = new Account[0];
    public final Map m = new HashMap();
    public final i n = new i();
    public final LinkedList o = new LinkedList();
    public final LinkedHashMap p = new LinkedHashMap();
    public final Handler q = new Handler(Looper.getMainLooper());
    public final Context r = bv0.m();
    public final x6 l = x6.w2();

    /* loaded from: classes.dex */
    public class a extends IAccountManagerResponse.Stub {
        public final /* synthetic */ IAccountManagerResponse l;
        public final /* synthetic */ String m;
        public final /* synthetic */ int n;

        public a(IAccountManagerResponse iAccountManagerResponse, String str, int i) {
            this.l = iAccountManagerResponse;
            this.m = str;
            this.n = i;
        }

        @Override // android.accounts.IAccountManagerResponse
        public void onError(int i, String str) {
        }

        @Override // android.accounts.IAccountManagerResponse
        public void onResult(Bundle bundle) {
            Parcelable[] parcelableArray = bundle.getParcelableArray("accounts");
            Account[] accountArr = new Account[parcelableArray.length];
            for (int i = 0; i < parcelableArray.length; i++) {
                accountArr[i] = (Account) parcelableArray[i];
            }
            ev0.this.Q2(this.l, accountArr, this.m, this.n);
        }
    }

    /* loaded from: classes.dex */
    public class b extends m {
        public final /* synthetic */ IAccountManagerResponse A;
        public final /* synthetic */ c7 B;
        public final /* synthetic */ int C;
        public final /* synthetic */ Account z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(c7 c7Var, IAccountManagerResponse iAccountManagerResponse, String str, boolean z, boolean z2, String str2, boolean z3, Account account, IAccountManagerResponse iAccountManagerResponse2, c7 c7Var2, int i) {
            super(ev0.this, c7Var, iAccountManagerResponse, str, z, z2, str2, z3);
            this.z = account;
            this.A = iAccountManagerResponse2;
            this.B = c7Var2;
            this.C = i;
        }

        @Override // androidx.appcompat.view.menu.ev0.m, android.accounts.IAccountAuthenticatorResponse
        public void onResult(Bundle bundle) {
            if (bundle != null && bundle.getBoolean("booleanResult", false)) {
                ev0.this.F2(this.A, bundle, this.z, this.B, this.C);
            }
            super.onResult(bundle);
        }

        @Override // androidx.appcompat.view.menu.ev0.m
        public void w2() {
            this.v.getAccountCredentialsForCloning(this, this.z);
        }

        @Override // androidx.appcompat.view.menu.ev0.m
        public String y2(long j) {
            return super.y2(j) + ", getAccountCredentialsForClone, " + this.z.type;
        }
    }

    /* loaded from: classes.dex */
    public class c extends m {
        public final /* synthetic */ Account A;
        public final /* synthetic */ String B;
        public final /* synthetic */ boolean C;
        public final /* synthetic */ boolean D;
        public final /* synthetic */ String E;
        public final /* synthetic */ Bundle z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(c7 c7Var, IAccountManagerResponse iAccountManagerResponse, String str, boolean z, boolean z2, String str2, boolean z3, Bundle bundle, Account account, String str3, boolean z4, boolean z5, String str4) {
            super(ev0.this, c7Var, iAccountManagerResponse, str, z, z2, str2, z3);
            this.z = bundle;
            this.A = account;
            this.B = str3;
            this.C = z4;
            this.D = z5;
            this.E = str4;
        }

        @Override // androidx.appcompat.view.menu.ev0.m, android.accounts.IAccountAuthenticatorResponse
        public void onResult(Bundle bundle) {
            String string;
            if (bundle != null && (string = bundle.getString("authtoken")) != null) {
                String string2 = bundle.getString("authAccount");
                String string3 = bundle.getString("accountType");
                if (TextUtils.isEmpty(string3) || TextUtils.isEmpty(string2)) {
                    onError(5, "the type and name should not be empty");
                    return;
                }
                Account account = new Account(string2, string3);
                if (!this.D) {
                    ev0.this.e3(this.x, account, this.B, string);
                }
                long j = bundle.getLong("android.accounts.expiry", 0L);
                if (this.D && j > System.currentTimeMillis()) {
                    ev0.this.f3(this.x, this.A, this.E, this.B, string, j);
                }
            }
            super.onResult(bundle);
        }

        @Override // androidx.appcompat.view.menu.ev0.m
        public void w2() {
            this.v.getAuthToken(this, this.A, this.B, this.z);
        }

        @Override // androidx.appcompat.view.menu.ev0.m
        public String y2(long j) {
            this.z.keySet();
            return super.y2(j) + ", getAuthToken, " + this.A + ", authTokenType " + this.B + ", loginOptions " + this.z + ", notifyOnAuthFailure " + this.C;
        }
    }

    /* loaded from: classes.dex */
    public class d extends m {
        public final /* synthetic */ String[] A;
        public final /* synthetic */ Bundle B;
        public final /* synthetic */ String C;
        public final /* synthetic */ String z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(c7 c7Var, IAccountManagerResponse iAccountManagerResponse, String str, boolean z, boolean z2, String str2, boolean z3, boolean z4, String str3, String[] strArr, Bundle bundle, String str4) {
            super(c7Var, iAccountManagerResponse, str, z, z2, str2, z3, z4);
            this.z = str3;
            this.A = strArr;
            this.B = bundle;
            this.C = str4;
        }

        @Override // androidx.appcompat.view.menu.ev0.m
        public void w2() {
            this.v.addAccount(this, this.m, this.z, this.A, this.B);
        }

        @Override // androidx.appcompat.view.menu.ev0.m
        public String y2(long j) {
            return super.y2(j) + ", addAccount, accountType " + this.C + ", requiredFeatures " + Arrays.toString(this.A);
        }
    }

    /* loaded from: classes.dex */
    public class e extends m {
        public final /* synthetic */ String A;
        public final /* synthetic */ Bundle B;
        public final /* synthetic */ Account z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(c7 c7Var, IAccountManagerResponse iAccountManagerResponse, String str, boolean z, boolean z2, String str2, boolean z3, boolean z4, Account account, String str3, Bundle bundle) {
            super(c7Var, iAccountManagerResponse, str, z, z2, str2, z3, z4);
            this.z = account;
            this.A = str3;
            this.B = bundle;
        }

        @Override // androidx.appcompat.view.menu.ev0.m
        public void w2() {
            this.v.updateCredentials(this, this.z, this.A, this.B);
        }

        @Override // androidx.appcompat.view.menu.ev0.m
        public String y2(long j) {
            Bundle bundle = this.B;
            if (bundle != null) {
                bundle.keySet();
            }
            return super.y2(j) + ", updateCredentials, " + this.z + ", authTokenType " + this.A + ", loginOptions " + this.B;
        }
    }

    /* loaded from: classes.dex */
    public class f extends m {
        public final /* synthetic */ String z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(c7 c7Var, IAccountManagerResponse iAccountManagerResponse, String str, boolean z, boolean z2, String str2, boolean z3, String str3) {
            super(ev0.this, c7Var, iAccountManagerResponse, str, z, z2, str2, z3);
            this.z = str3;
        }

        @Override // androidx.appcompat.view.menu.ev0.m
        public void w2() {
            this.v.editProperties(this, this.m);
        }

        @Override // androidx.appcompat.view.menu.ev0.m
        public String y2(long j) {
            return super.y2(j) + ", editProperties, accountType " + this.z;
        }
    }

    /* loaded from: classes.dex */
    public class g extends m {
        public final /* synthetic */ String A;
        public final /* synthetic */ String z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(c7 c7Var, IAccountManagerResponse iAccountManagerResponse, String str, boolean z, boolean z2, String str2, boolean z3, String str3, String str4) {
            super(ev0.this, c7Var, iAccountManagerResponse, str, z, z2, str2, z3);
            this.z = str3;
            this.A = str4;
        }

        @Override // androidx.appcompat.view.menu.ev0.m, android.accounts.IAccountAuthenticatorResponse
        public void onResult(Bundle bundle) {
            if (bundle != null) {
                String string = bundle.getString("authTokenLabelKey");
                Bundle bundle2 = new Bundle();
                bundle2.putString("authTokenLabelKey", string);
                super.onResult(bundle2);
            }
            super.onResult(null);
        }

        @Override // androidx.appcompat.view.menu.ev0.m
        public void w2() {
            this.v.getAuthTokenLabel(this, this.A);
        }

        @Override // androidx.appcompat.view.menu.ev0.m
        public String y2(long j) {
            return super.y2(j) + ", getAuthTokenLabel, " + this.z + ", authTokenType " + this.A;
        }
    }

    /* loaded from: classes.dex */
    public class h extends m {
        public final /* synthetic */ int A;
        public final /* synthetic */ Bundle B;
        public final /* synthetic */ Account z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(c7 c7Var, IAccountManagerResponse iAccountManagerResponse, String str, boolean z, boolean z2, String str2, boolean z3, Account account, int i, Bundle bundle) {
            super(ev0.this, c7Var, iAccountManagerResponse, str, z, z2, str2, z3);
            this.z = account;
            this.A = i;
            this.B = bundle;
        }

        @Override // androidx.appcompat.view.menu.ev0.m, android.accounts.IAccountAuthenticatorResponse
        public void onError(int i, String str) {
            super.onError(i, str);
        }

        @Override // androidx.appcompat.view.menu.ev0.m, android.accounts.IAccountAuthenticatorResponse
        public void onResult(Bundle bundle) {
            super.onResult(bundle);
        }

        @Override // androidx.appcompat.view.menu.ev0.m
        public void w2() {
            ev0 ev0Var = ev0.this;
            for (Account account : ev0Var.K2(this.A, ev0Var.r.getPackageName())) {
                if (account.equals(this.z)) {
                    this.v.addAccountFromCredentials(this, this.z, this.B);
                    return;
                }
            }
        }

        @Override // androidx.appcompat.view.menu.ev0.m
        public String y2(long j) {
            return super.y2(j) + ", getAccountCredentialsForClone, " + this.z.type;
        }
    }

    /* loaded from: classes.dex */
    public static final class i {
        public final Map a;

        public i() {
            this.a = new HashMap();
        }
    }

    /* loaded from: classes.dex */
    public static final class j {
        public final AuthenticatorDescription a;
        public final ServiceInfo b;

        public j(AuthenticatorDescription authenticatorDescription, ServiceInfo serviceInfo) {
            this.a = authenticatorDescription;
            this.b = serviceInfo;
        }
    }

    /* loaded from: classes.dex */
    public class k extends m {
        public volatile Account[] A;
        public volatile ArrayList B;
        public volatile int C;
        public final String D;
        public final boolean E;
        public final String[] z;

        public k(c7 c7Var, IAccountManagerResponse iAccountManagerResponse, String str, String[] strArr, int i, String str2, boolean z) {
            super(ev0.this, c7Var, iAccountManagerResponse, str, false, true, null, false);
            this.A = null;
            this.B = null;
            this.C = 0;
            this.z = strArr;
            this.D = str2;
            this.E = z;
        }

        public void A2() {
            if (this.C >= this.A.length) {
                B2();
                return;
            }
            IAccountAuthenticator iAccountAuthenticator = this.v;
            if (iAccountAuthenticator != null) {
                try {
                    iAccountAuthenticator.hasFeatures(this, this.A[this.C], this.z);
                } catch (RemoteException unused) {
                    onError(1, "remote exception");
                }
            } else if (Log.isLoggable("AccountManagerService", 2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("checkAccount: aborting session since we are no longer connected to the authenticator, ");
                sb.append(x2());
            }
        }

        public void B2() {
            IAccountManagerResponse v2 = v2();
            if (v2 != null) {
                try {
                    int size = this.B.size();
                    Account[] accountArr = new Account[size];
                    for (int i = 0; i < size; i++) {
                        accountArr[i] = (Account) this.B.get(i);
                    }
                    if (Log.isLoggable("AccountManagerService", 2)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(getClass().getSimpleName());
                        sb.append(" calling onResult() on response ");
                        sb.append(v2);
                    }
                    Bundle bundle = new Bundle();
                    bundle.putParcelableArray("accounts", accountArr);
                    v2.onResult(bundle);
                } catch (RemoteException unused) {
                    Log.isLoggable("AccountManagerService", 2);
                }
            }
        }

        @Override // androidx.appcompat.view.menu.ev0.m, android.accounts.IAccountAuthenticatorResponse
        public void onResult(Bundle bundle) {
            this.s++;
            if (bundle == null) {
                onError(5, "null bundle");
                return;
            }
            if (bundle.getBoolean("booleanResult", false)) {
                this.B.add(this.A[this.C]);
            }
            this.C++;
            A2();
        }

        @Override // androidx.appcompat.view.menu.ev0.m
        public void w2() {
            this.A = ev0.this.L2(this.x, this.m, this.D, this.E);
            this.B = new ArrayList(this.A.length);
            this.C = 0;
            A2();
        }

        @Override // androidx.appcompat.view.menu.ev0.m
        public String y2(long j) {
            StringBuilder sb = new StringBuilder();
            sb.append(super.y2(j));
            sb.append(", getAccountsByTypeAndFeatures, ");
            String[] strArr = this.z;
            sb.append(strArr != null ? TextUtils.join(",", strArr) : null);
            return sb.toString();
        }
    }

    /* loaded from: classes.dex */
    public class l extends m {
        public final Account z;

        public l(c7 c7Var, IAccountManagerResponse iAccountManagerResponse, Account account, boolean z) {
            super(ev0.this, c7Var, iAccountManagerResponse, account.type, z, true, account.name, false);
            this.z = account;
        }

        @Override // androidx.appcompat.view.menu.ev0.m, android.accounts.IAccountAuthenticatorResponse
        public void onResult(Bundle bundle) {
            if (bundle != null && bundle.containsKey("booleanResult") && !bundle.containsKey("intent")) {
                if (bundle.getBoolean("booleanResult")) {
                    ev0.this.b3(this.x, this.z);
                }
                IAccountManagerResponse v2 = v2();
                if (v2 != null) {
                    if (Log.isLoggable("AccountManagerService", 2)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(getClass().getSimpleName());
                        sb.append(" calling onResult() on response ");
                        sb.append(v2);
                    }
                    try {
                        v2.onResult(bundle);
                    } catch (RemoteException unused) {
                    }
                }
            }
            super.onResult(bundle);
        }

        @Override // androidx.appcompat.view.menu.ev0.m
        public void w2() {
            this.v.getAccountRemovalAllowed(this, this.z);
        }

        @Override // androidx.appcompat.view.menu.ev0.m
        public String y2(long j) {
            return super.y2(j) + ", removeAccount, account " + this.z;
        }
    }

    /* loaded from: classes.dex */
    public abstract class m extends IAccountAuthenticatorResponse.Stub implements IBinder.DeathRecipient, ServiceConnection {
        public IAccountManagerResponse l;
        public final String m;
        public final boolean n;
        public final long o;
        public final String p;
        public final boolean q;
        public final boolean r;
        public int s;
        public int t;
        public int u;
        public IAccountAuthenticator v;
        public final boolean w;
        public final c7 x;

        public m(ev0 ev0Var, c7 c7Var, IAccountManagerResponse iAccountManagerResponse, String str, boolean z, boolean z2, String str2, boolean z3) {
            this(c7Var, iAccountManagerResponse, str, z, z2, str2, z3, false);
        }

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            this.l = null;
            close();
        }

        public final void close() {
            synchronized (ev0.this.p) {
                try {
                    if (ev0.this.p.remove(toString()) == null) {
                        return;
                    }
                    IAccountManagerResponse iAccountManagerResponse = this.l;
                    if (iAccountManagerResponse != null) {
                        iAccountManagerResponse.asBinder().unlinkToDeath(this, 0);
                        this.l = null;
                    }
                    k();
                    z2();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public void h() {
            if (j(this.m)) {
                return;
            }
            onError(1, "bind failure");
        }

        public final boolean j(String str) {
            j jVar = (j) ev0.this.n.a.get(str);
            if (jVar == null) {
                if (Log.isLoggable("AccountManagerService", 2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("there is no authenticator for ");
                    sb.append(str);
                    sb.append(", bailing out");
                }
                return false;
            }
            Intent intent = new Intent();
            intent.setAction("android.accounts.AccountAuthenticator");
            ServiceInfo serviceInfo = jVar.b;
            ComponentName componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
            intent.setComponent(componentName);
            intent.putExtra("_S_|_UserId", this.x.n);
            if (Log.isLoggable("AccountManagerService", 2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("performing bindService to ");
                sb2.append(componentName);
            }
            if (ev0.this.r.bindService(intent, this, 1)) {
                return true;
            }
            if (Log.isLoggable("AccountManagerService", 2)) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("bindService to ");
                sb3.append(componentName);
                sb3.append(" failed");
            }
            return false;
        }

        public void k() {
            ev0.this.q.removeMessages(3, this);
        }

        public void onError(int i, String str) {
            this.u++;
            IAccountManagerResponse v2 = v2();
            if (v2 == null) {
                Log.isLoggable("AccountManagerService", 2);
                return;
            }
            if (Log.isLoggable("AccountManagerService", 2)) {
                StringBuilder sb = new StringBuilder();
                sb.append(getClass().getSimpleName());
                sb.append(" calling onError() on response ");
                sb.append(v2);
            }
            try {
                v2.onError(i, str);
            } catch (RemoteException unused) {
                Log.isLoggable("AccountManagerService", 2);
            }
        }

        @Override // android.accounts.IAccountAuthenticatorResponse
        public void onRequestContinued() {
            this.t++;
        }

        public void onResult(Bundle bundle) {
            Intent intent;
            boolean z = true;
            this.s++;
            if (bundle != null) {
                boolean z2 = bundle.getBoolean("booleanResult", false);
                boolean z3 = bundle.containsKey("authAccount") && bundle.containsKey("accountType");
                if (!this.r || (!z2 && !z3)) {
                    z = false;
                }
                if (z || this.q) {
                    boolean R2 = ev0.this.R2(this.p, this.m, this.x.n);
                    if (z && R2) {
                        ev0.this.h3(this.x, new Account(this.p, this.m));
                    }
                    if (this.q) {
                        bundle.putLong("lastAuthenticatedTime", R2 ? this.x.c(new Account(this.p, this.m)) : -1L);
                    }
                }
            }
            if (bundle != null) {
                intent = (Intent) bundle.getParcelable("intent");
                if (intent != null && !u2(Binder.getCallingUid(), intent)) {
                    onError(5, "invalid intent in bundle returned");
                    return;
                }
            } else {
                intent = null;
            }
            IAccountManagerResponse v2 = (this.n && bundle != null && bundle.containsKey("intent")) ? this.l : v2();
            if (v2 != null) {
                try {
                    if (bundle == null) {
                        if (Log.isLoggable("AccountManagerService", 2)) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(getClass().getSimpleName());
                            sb.append(" calling onError() on response ");
                            sb.append(v2);
                        }
                        v2.onError(5, "null bundle returned");
                        return;
                    }
                    if (this.w) {
                        bundle.remove("authtoken");
                    }
                    if (Log.isLoggable("AccountManagerService", 2)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(getClass().getSimpleName());
                        sb2.append(" calling onResult() on response ");
                        sb2.append(v2);
                    }
                    if (bundle.getInt("errorCode", -1) <= 0 || intent != null) {
                        v2.onResult(bundle);
                    } else {
                        v2.onError(bundle.getInt("errorCode"), bundle.getString("errorMessage"));
                    }
                } catch (RemoteException unused) {
                    Log.isLoggable("AccountManagerService", 2);
                }
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            this.v = IAccountAuthenticator.Stub.asInterface(iBinder);
            try {
                w2();
            } catch (RemoteException unused) {
                onError(1, "remote exception");
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            this.v = null;
            IAccountManagerResponse v2 = v2();
            if (v2 != null) {
                try {
                    v2.onError(1, "disconnected");
                } catch (RemoteException unused) {
                    Log.isLoggable("AccountManagerService", 2);
                }
            }
        }

        public boolean u2(int i, Intent intent) {
            if (intent.getClipData() == null) {
                intent.setClipData(ClipData.newPlainText(null, null));
            }
            intent.setFlags(intent.getFlags() & (-196));
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                return ev0.this.l.n(intent, 0, null, this.x.n) != null;
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }

        public IAccountManagerResponse v2() {
            IAccountManagerResponse iAccountManagerResponse = this.l;
            if (iAccountManagerResponse == null) {
                return null;
            }
            close();
            return iAccountManagerResponse;
        }

        public abstract void w2();

        public String x2() {
            return y2(SystemClock.elapsedRealtime());
        }

        public String y2(long j) {
            StringBuilder sb = new StringBuilder();
            sb.append("Session: expectLaunch ");
            sb.append(this.n);
            sb.append(", connected ");
            sb.append(this.v != null);
            sb.append(", stats (");
            sb.append(this.s);
            sb.append("/");
            sb.append(this.t);
            sb.append("/");
            sb.append(this.u);
            sb.append("), lifetime ");
            sb.append((j - this.o) / 1000.0d);
            return sb.toString();
        }

        public final void z2() {
            if (this.v != null) {
                this.v = null;
                ev0.this.r.unbindService(this);
            }
        }

        public m(c7 c7Var, IAccountManagerResponse iAccountManagerResponse, String str, boolean z, boolean z2, String str2, boolean z3, boolean z4) {
            this.s = 0;
            this.t = 0;
            this.u = 0;
            this.v = null;
            if (str != null) {
                this.x = c7Var;
                this.w = z2;
                this.l = iAccountManagerResponse;
                this.m = str;
                this.n = z;
                this.o = SystemClock.elapsedRealtime();
                this.p = str2;
                this.q = z3;
                this.r = z4;
                synchronized (ev0.this.p) {
                    ev0.this.p.put(toString(), this);
                }
                if (iAccountManagerResponse != null) {
                    try {
                        iAccountManagerResponse.asBinder().linkToDeath(this, 0);
                        return;
                    } catch (RemoteException unused) {
                        this.l = null;
                        binderDied();
                        return;
                    }
                }
                return;
            }
            throw new IllegalArgumentException("accountType is null");
        }
    }

    public static ev0 I2() {
        return s;
    }

    public static AuthenticatorDescription W2(Resources resources, String str, AttributeSet attributeSet) {
        TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, r4.e((Integer[]) qn0.b.b()));
        try {
            String string = obtainAttributes.getString(((Integer) qn0.d.b()).intValue());
            int resourceId = obtainAttributes.getResourceId(((Integer) qn0.g.b()).intValue(), 0);
            int resourceId2 = obtainAttributes.getResourceId(((Integer) qn0.f.b()).intValue(), 0);
            int resourceId3 = obtainAttributes.getResourceId(((Integer) qn0.h.b()).intValue(), 0);
            int resourceId4 = obtainAttributes.getResourceId(((Integer) qn0.c.b()).intValue(), 0);
            boolean z = obtainAttributes.getBoolean(((Integer) qn0.e.b()).intValue(), false);
            if (TextUtils.isEmpty(string)) {
                obtainAttributes.recycle();
                return null;
            }
            return new AuthenticatorDescription(string, str, resourceId, resourceId2, resourceId3, resourceId4, z);
        } finally {
            obtainAttributes.recycle();
        }
    }

    @Override // androidx.appcompat.view.menu.k00
    public void A1(IAccountManagerResponse iAccountManagerResponse, String str, String[] strArr, int i2) {
        if (iAccountManagerResponse == null) {
            throw new IllegalArgumentException("response is null");
        }
        if (str == null) {
            throw new IllegalArgumentException("accountType is null");
        }
        String M2 = M2();
        c7 P2 = P2(i2);
        if (strArr != null && strArr.length != 0) {
            new k(P2, iAccountManagerResponse, str, strArr, i2, M2, false).h();
            return;
        }
        Account[] L2 = L2(P2, str, M2, false);
        Bundle bundle = new Bundle();
        bundle.putParcelableArray("accounts", L2);
        V2(iAccountManagerResponse, bundle);
    }

    @Override // androidx.appcompat.view.menu.k00
    public int E0(Account account, String str, int i2) {
        Objects.requireNonNull(account, "account cannot be null");
        Objects.requireNonNull(str, "packageName cannot be null");
        c7 P2 = P2(i2);
        if ("android:accounts:key_legacy_visible".equals(str)) {
            int J2 = J2(account, str, P2);
            if (J2 != 0) {
                return J2;
            }
            return 2;
        } else if ("android:accounts:key_legacy_not_visible".equals(str)) {
            int J22 = J2(account, str, P2);
            if (J22 != 0) {
                return J22;
            }
            return 4;
        } else {
            return c3(account, str, P2).intValue();
        }
    }

    public final boolean E2(c7 c7Var, Account account, String str, Bundle bundle, Map map) {
        if (c7Var == null) {
            c7Var = new c7();
        }
        synchronized (c7Var.m) {
            try {
                if (c7Var.d(account) != null) {
                    return false;
                }
                cv0 a2 = c7Var.a(account);
                a2.n = str;
                if (bundle != null) {
                    for (String str2 : bundle.keySet()) {
                        a2.a(str2, bundle.getString(str2));
                    }
                }
                if (map != null) {
                    for (Map.Entry entry : map.entrySet()) {
                        g3(account, (String) entry.getKey(), ((Integer) entry.getValue()).intValue(), c7Var);
                    }
                }
                d3();
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void F2(IAccountManagerResponse iAccountManagerResponse, Bundle bundle, Account account, c7 c7Var, int i2) {
        new h(c7Var, iAccountManagerResponse, account.type, false, false, account.name, false, account, i2, bundle).h();
    }

    @Override // androidx.appcompat.view.menu.k00
    public void G(Account account, String str, String str2, int i2) {
        Objects.requireNonNull(account, "Account cannot be null");
        Objects.requireNonNull(str, "AuthTokenType cannot be null");
        c7 P2 = P2(i2);
        if (P2 == null) {
            return;
        }
        synchronized (P2.m) {
            P2.i(account).put(str, str2);
            d3();
        }
    }

    public final Account[] G2(c7 c7Var, Account[] accountArr, String str, boolean z) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Account account : accountArr) {
            int intValue = c3(account, str, c7Var).intValue();
            if (intValue == 1 || intValue == 2 || (z && intValue == 4)) {
                linkedHashMap.put(account, Integer.valueOf(intValue));
            }
        }
        return (Account[]) linkedHashMap.keySet().toArray(new Account[0]);
    }

    public final void H2(List list, Map map, ko0 ko0Var) {
        AuthenticatorDescription W2;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ResolveInfo resolveInfo = (ResolveInfo) it.next();
            XmlResourceParser a2 = ko0Var.a(this.r, resolveInfo.serviceInfo, "android.accounts.AccountAuthenticator");
            if (a2 != null) {
                try {
                    AttributeSet asAttributeSet = Xml.asAttributeSet(a2);
                    if ("account-authenticator".equals(a2.getName()) && (W2 = W2(ko0Var.b(this.r, resolveInfo.serviceInfo.applicationInfo), resolveInfo.serviceInfo.packageName, asAttributeSet)) != null) {
                        map.put(W2.type, new j(W2, resolveInfo.serviceInfo));
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    @Override // androidx.appcompat.view.menu.k00
    public Account[] I1(String str, int i2) {
        c7 P2 = P2(i2);
        ArrayList arrayList = new ArrayList();
        synchronized (P2.m) {
            try {
                for (cv0 cv0Var : P2.o) {
                    if (cv0Var.m.type.equals(str)) {
                        arrayList.add(cv0Var.m);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return (Account[]) arrayList.toArray(new Account[0]);
    }

    @Override // androidx.appcompat.view.menu.k00
    public void J1(Account account, int i2) {
        y1(account, null, i2);
    }

    public final int J2(Account account, String str, c7 c7Var) {
        int intValue;
        synchronized (c7Var.m) {
            try {
                Integer num = (Integer) O2(account, c7Var).get(str);
                intValue = num != null ? num.intValue() : 0;
            } catch (Throwable th) {
                throw th;
            }
        }
        return intValue;
    }

    @Override // androidx.appcompat.view.menu.k00
    public void K1(IAccountManagerResponse iAccountManagerResponse, String str, String str2, String[] strArr, boolean z, Bundle bundle, int i2) {
    }

    public Account[] K2(int i2, String str) {
        return (Account[]) P2(i2).o.toArray(new Account[0]);
    }

    public Account[] L2(c7 c7Var, String str, String str2, boolean z) {
        Account[] f2;
        if (str != null) {
            synchronized (c7Var.m) {
                f2 = c7Var.f(str);
            }
            return f2 == null ? t : G2(c7Var, (Account[]) Arrays.copyOf(f2, f2.length), str2, z);
        }
        synchronized (this.m) {
            try {
                int i2 = 0;
                for (c7 c7Var2 : this.m.values()) {
                    i2 += c7Var2.k().length;
                }
                if (i2 == 0) {
                    return t;
                }
                Account[] accountArr = new Account[i2];
                int i3 = 0;
                for (c7 c7Var3 : this.m.values()) {
                    Account[] k2 = c7Var3.k();
                    System.arraycopy(k2, 0, accountArr, i3, k2.length);
                    i3 += k2.length;
                }
                return G2(c7Var, accountArr, str2, z);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.appcompat.view.menu.k00
    public void M0(IAccountManagerResponse iAccountManagerResponse, String str, String str2, String[] strArr, boolean z, Bundle bundle, int i2) {
        ev0 ev0Var;
        Bundle bundle2;
        if (iAccountManagerResponse == null) {
            throw new IllegalArgumentException("response is null");
        }
        if (str == null) {
            throw new IllegalArgumentException("accountType is null");
        }
        if (bundle == null) {
            ev0Var = this;
            bundle2 = new Bundle();
        } else {
            ev0Var = this;
            bundle2 = bundle;
        }
        new d(ev0Var.P2(i2), iAccountManagerResponse, str, z, true, null, false, true, str2, strArr, bundle2, str).h();
    }

    @Override // androidx.appcompat.view.menu.k00
    public void M1(IAccountManagerResponse iAccountManagerResponse, String str, String[] strArr, int i2) {
        if (iAccountManagerResponse == null) {
            throw new IllegalArgumentException("response is null");
        }
        if (str == null) {
            throw new IllegalArgumentException("accountType is null");
        }
        String M2 = M2();
        c7 P2 = P2(i2);
        if (r4.d(strArr)) {
            Q2(iAccountManagerResponse, L2(P2, str, M2, true), M2, i2);
        } else {
            new k(P2, new a(iAccountManagerResponse, M2, i2), str, strArr, i2, M2, true).h();
        }
    }

    public final String M2() {
        int callingPid = Binder.getCallingPid();
        bk0 c2 = a7.e().c(callingPid);
        if (c2 != null) {
            return c2.b();
        }
        throw new IllegalArgumentException("ProcessRecord is null, PID: " + callingPid);
    }

    @Override // androidx.appcompat.view.menu.k00
    public String N1(Account account, int i2) {
        if (Log.isLoggable("AccountManagerService", 2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("getPassword: ");
            sb.append(account);
            sb.append(", caller's uid ");
            sb.append(Binder.getCallingUid());
            sb.append(", pid ");
            sb.append(Binder.getCallingPid());
        }
        if (account != null) {
            return Z2(P2(i2), account);
        }
        throw new IllegalArgumentException("account is null");
    }

    @Override // androidx.appcompat.view.menu.k00
    /* renamed from: N2 */
    public HashMap b2(Account account, int i2) {
        return new HashMap();
    }

    public final Map O2(Account account, c7 c7Var) {
        return c7Var.j(account);
    }

    public c7 P2(int i2) {
        c7 c7Var;
        synchronized (this.m) {
            try {
                if (((c7) this.m.get(Integer.valueOf(i2))) == null) {
                    this.m.put(Integer.valueOf(i2), new c7());
                }
                c7Var = (c7) this.m.get(Integer.valueOf(i2));
            } catch (Throwable th) {
                throw th;
            }
        }
        return c7Var;
    }

    public final void Q2(IAccountManagerResponse iAccountManagerResponse, Account[] accountArr, String str, int i2) {
        if (U2(accountArr, str, i2)) {
            return;
        }
        if (accountArr.length != 1) {
            V2(iAccountManagerResponse, new Bundle());
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("authAccount", accountArr[0].name);
        bundle.putString("accountType", accountArr[0].type);
        V2(iAccountManagerResponse, bundle);
    }

    @Override // androidx.appcompat.view.menu.k00
    public boolean R0(Account account, String str, Bundle bundle, int i2) {
        return s1(account, str, bundle, null, i2);
    }

    public final boolean R2(String str, String str2, int i2) {
        c7 P2 = P2(i2);
        return (P2 == null || P2.d(new Account(str, str2)) == null) ? false : true;
    }

    @Override // androidx.appcompat.view.menu.k00
    public Account[] S1(String str, int i2, int i3) {
        c7 P2 = P2(i3);
        ArrayList arrayList = new ArrayList();
        synchronized (P2.m) {
            try {
                for (cv0 cv0Var : P2.o) {
                    Integer num = (Integer) cv0Var.p.get(str);
                    if (num != null && num.intValue() == 1) {
                        arrayList.add(cv0Var.m);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return (Account[]) arrayList.toArray(new Account[0]);
    }

    public final void S2() {
        FileInputStream fileInputStream;
        Throwable th;
        Exception e2;
        Parcel obtain = Parcel.obtain();
        try {
            if (!ov0.a().exists()) {
                obtain.recycle();
                fc.a(null);
                return;
            }
            fileInputStream = new FileInputStream(ov0.a());
            try {
                try {
                    byte[] k2 = qr.k(fileInputStream);
                    obtain.unmarshall(k2, 0, k2.length);
                    obtain.setDataPosition(0);
                    HashMap readHashMap = obtain.readHashMap(c7.class.getClassLoader());
                    if (readHashMap == null) {
                        obtain.recycle();
                        fc.a(fileInputStream);
                        return;
                    }
                    synchronized (this.m) {
                        try {
                            this.m.clear();
                            for (Integer num : readHashMap.keySet()) {
                                this.m.put(num, (c7) readHashMap.get(num));
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    obtain.recycle();
                    fc.a(fileInputStream);
                } catch (Exception e3) {
                    e2 = e3;
                    e2.printStackTrace();
                    obtain.recycle();
                    fc.a(fileInputStream);
                }
            } catch (Throwable th3) {
                th = th3;
                obtain.recycle();
                fc.a(fileInputStream);
                throw th;
            }
        } catch (Exception e4) {
            fileInputStream = null;
            e2 = e4;
        } catch (Throwable th4) {
            fileInputStream = null;
            th = th4;
            obtain.recycle();
            fc.a(fileInputStream);
            throw th;
        }
    }

    @Override // androidx.appcompat.view.menu.k00
    public void T0(IAccountManagerResponse iAccountManagerResponse, String str, boolean z, int i2) {
        if (iAccountManagerResponse == null) {
            throw new IllegalArgumentException("response is null");
        }
        if (str == null) {
            throw new IllegalArgumentException("accountType is null");
        }
        new f(P2(i2), iAccountManagerResponse, str, z, true, null, false, str).h();
    }

    public void T2(String str) {
        this.n.a.clear();
        Intent intent = new Intent("android.accounts.AccountAuthenticator");
        if (str != null) {
            intent.setPackage(str);
        }
        H2(this.l.O0(intent, PackageParser.PARSE_IS_PRIVILEGED, -1), this.n.a, new ko0());
    }

    public final boolean U2(Account[] accountArr, String str, int i2) {
        if (accountArr.length < 1) {
            return false;
        }
        return accountArr.length > 1 || c3(accountArr[0], str, P2(i2)).intValue() == 4;
    }

    public final void V2(IAccountManagerResponse iAccountManagerResponse, Bundle bundle) {
        if (Log.isLoggable("AccountManagerService", 2)) {
            StringBuilder sb = new StringBuilder();
            sb.append(getClass().getSimpleName());
            sb.append(" calling onResult() on response ");
            sb.append(iAccountManagerResponse);
        }
        try {
            iAccountManagerResponse.onResult(bundle);
        } catch (RemoteException unused) {
            Log.isLoggable("AccountManagerService", 2);
        }
    }

    @Override // androidx.appcompat.view.menu.k00
    public void X0(String str, String str2, int i2) {
        c7 P2 = P2(i2);
        synchronized (P2.m) {
            try {
                boolean z = false;
                for (cv0 cv0Var : P2.o) {
                    if (cv0Var.m.type.equals(str)) {
                        cv0Var.o.values().remove(str2);
                        z = true;
                    }
                }
                if (z) {
                    d3();
                }
            } finally {
            }
        }
        synchronized (this.o) {
            try {
                Iterator it = this.o.iterator();
                while (it.hasNext()) {
                    c11 c11Var = (c11) it.next();
                    if (c11Var.b.type.equals(str) && c11Var.a == i2 && c11Var.d.equals(str2)) {
                        it.remove();
                    }
                }
            } finally {
            }
        }
    }

    public String X2(c7 c7Var, Account account, String str) {
        String str2;
        if (c7Var == null) {
            return null;
        }
        synchronized (c7Var.m) {
            str2 = (String) c7Var.i(account).get(str);
        }
        return str2;
    }

    @Override // androidx.appcompat.view.menu.k00
    public void Y(IAccountManagerResponse iAccountManagerResponse, Account account, Bundle bundle, boolean z, int i2) {
    }

    public String Y2(c7 c7Var, Account account, String str, String str2) {
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (this.o) {
            try {
                Iterator it = this.o.iterator();
                while (it.hasNext()) {
                    c11 c11Var = (c11) it.next();
                    if (c11Var.a == c7Var.n && c11Var.b.equals(account) && c11Var.e.equals(str) && c11Var.f.equals(str2)) {
                        if (c11Var.c > currentTimeMillis) {
                            return c11Var.d;
                        }
                        it.remove();
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.appcompat.view.menu.k00
    public void Z(String[] strArr, String str, int i2) {
    }

    public String Z2(c7 c7Var, Account account) {
        if (c7Var == null) {
            return null;
        }
        synchronized (c7Var.m) {
            try {
                cv0 d2 = c7Var.d(account);
                if (d2 == null) {
                    return null;
                }
                return d2.n;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.appcompat.view.menu.k00
    public void a1(IAccountManagerResponse iAccountManagerResponse, Account account, boolean z, int i2) {
        tj0.b(account != null, "Account cannot be null");
        tj0.b(iAccountManagerResponse != null, "Response cannot be null");
        new l(P2(i2), iAccountManagerResponse, account, z).h();
    }

    public final String a3(c7 c7Var, Account account, String str) {
        String str2;
        if (c7Var == null) {
            return null;
        }
        synchronized (c7Var.m) {
            str2 = (String) c7Var.e(account).get(str);
        }
        return str2;
    }

    public final boolean b3(c7 c7Var, Account account) {
        boolean b2;
        synchronized (c7Var.m) {
            try {
                b2 = c7Var.b(account);
                if (b2) {
                    d3();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return b2;
    }

    @Override // androidx.appcompat.view.menu.k00
    public void c1(Account account, String str, String str2, int i2) {
        if (str == null) {
            throw new IllegalArgumentException("key is null");
        }
        if (account == null) {
            throw new IllegalArgumentException("account is null");
        }
        c7 P2 = P2(i2);
        if (P2 == null) {
            return;
        }
        synchronized (P2.m) {
            P2.e(account).put(str, str2);
            d3();
        }
    }

    public final Integer c3(Account account, String str, c7 c7Var) {
        int J2;
        if (c7Var == null || c7Var.d(account) == null || (J2 = J2(account, str, c7Var)) == 0) {
            return 3;
        }
        return Integer.valueOf(J2);
    }

    @Override // androidx.appcompat.view.menu.k00
    public Account[] d1(String str, String str2, int i2) {
        Integer num;
        c7 P2 = P2(i2);
        ArrayList arrayList = new ArrayList();
        synchronized (P2.m) {
            try {
                for (cv0 cv0Var : P2.o) {
                    if (cv0Var.m.type.equals(str) && (num = (Integer) cv0Var.p.get(str2)) != null && num.intValue() == 1) {
                        arrayList.add(cv0Var.m);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return (Account[]) arrayList.toArray(new Account[0]);
    }

    @Override // androidx.appcompat.view.menu.k00
    public void d2(IAccountManagerResponse iAccountManagerResponse, Account account, int i2, int i3) {
        c7 P2 = P2(i2);
        c7 P22 = P2(i3);
        if (P2 != null && P22 != null) {
            new b(P2, iAccountManagerResponse, account.type, false, false, account.name, false, account, iAccountManagerResponse, P22, i2).h();
        } else if (iAccountManagerResponse != null) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("booleanResult", false);
            try {
                iAccountManagerResponse.onResult(bundle);
            } catch (RemoteException unused) {
            }
        }
    }

    public final void d3() {
        synchronized (this.m) {
            Parcel obtain = Parcel.obtain();
            c5 c5Var = new c5(ov0.a());
            obtain.writeMap(this.m);
            FileOutputStream fileOutputStream = null;
            try {
                try {
                    fileOutputStream = c5Var.d();
                    qr.l(obtain, fileOutputStream);
                    c5Var.b(fileOutputStream);
                    fc.a(fileOutputStream);
                } catch (IOException e2) {
                    e2.printStackTrace();
                    c5Var.a(fileOutputStream);
                    fc.a(fileOutputStream);
                }
                obtain.recycle();
            } catch (Throwable th) {
                fc.a(fileOutputStream);
                throw th;
            }
        }
    }

    public void e3(c7 c7Var, Account account, String str, String str2) {
        if (c7Var == null) {
            return;
        }
        synchronized (c7Var.m) {
            c7Var.i(account).put(str, str2);
            d3();
        }
    }

    @Override // androidx.appcompat.view.menu.k00
    public Map f0(String str, String str2, int i2) {
        Integer num;
        HashMap hashMap = new HashMap();
        c7 P2 = P2(i2);
        synchronized (P2.m) {
            try {
                for (cv0 cv0Var : P2.o) {
                    if (cv0Var.m.type.equals(str2) && (num = (Integer) P2.j(cv0Var.m).get(str)) != null) {
                        hashMap.put(cv0Var.m, num);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return hashMap;
    }

    @Override // androidx.appcompat.view.menu.k00
    public void f1(IAccountManagerResponse iAccountManagerResponse, Account account, String str, boolean z, Bundle bundle, int i2) {
        if (iAccountManagerResponse == null) {
            throw new IllegalArgumentException("response is null");
        }
        if (account == null) {
            throw new IllegalArgumentException("account is null");
        }
        new e(P2(i2), iAccountManagerResponse, account.type, z, true, account.name, false, true, account, str, bundle).h();
    }

    public void f3(c7 c7Var, Account account, String str, String str2, String str3, long j2) {
        if (account == null || str2 == null || str == null) {
            return;
        }
        c11 c11Var = new c11(c7Var.n, account, str, str2, str3, j2);
        synchronized (this.o) {
            this.o.add(c11Var);
        }
    }

    public final boolean g3(Account account, String str, int i2, c7 c7Var) {
        synchronized (c7Var.m) {
            try {
                cv0 d2 = c7Var.d(account);
                if (d2 == null) {
                    return false;
                }
                d2.p.put(str, Integer.valueOf(i2));
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.appcompat.view.menu.eh0
    public void h(String str, boolean z, int i2) {
        T2(null);
    }

    public final boolean h3(c7 c7Var, Account account) {
        c7Var.l(account);
        return true;
    }

    @Override // androidx.appcompat.view.menu.k00
    public boolean i1(Account account, int i2) {
        int callingUid = Binder.getCallingUid();
        if (Log.isLoggable("AccountManagerService", 2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("removeAccountExplicitly: ");
            sb.append(account);
            sb.append(", caller's uid ");
            sb.append(callingUid);
            sb.append(", pid ");
            sb.append(Binder.getCallingPid());
        }
        if (account == null) {
            return false;
        }
        return b3(P2(i2), account);
    }

    @Override // androidx.appcompat.view.menu.n30
    public void j() {
        S2();
        T2(null);
        this.l.k(this);
    }

    @Override // androidx.appcompat.view.menu.eh0
    public void k(String str, int i2) {
        T2(str);
    }

    @Override // androidx.appcompat.view.menu.k00
    public void k1(IAccountManagerResponse iAccountManagerResponse, Account account, String str, boolean z, boolean z2, Bundle bundle, int i2) {
        String Y2;
        String X2;
        tj0.b(iAccountManagerResponse != null, "response cannot be null");
        try {
            if (account == null) {
                iAccountManagerResponse.onError(7, "account is null");
            } else if (str == null) {
                iAccountManagerResponse.onError(7, "authTokenType is null");
            } else {
                c7 P2 = P2(i2);
                j jVar = (j) this.n.a.get(account.type);
                boolean z3 = jVar != null && jVar.a.customTokens;
                String string = bundle.getString("androidPackageName");
                bundle.putInt("callerUid", Binder.getCallingUid());
                bundle.putInt("callerPid", Binder.getCallingPid());
                if (z) {
                    bundle.putBoolean("notifyOnAuthFailure", true);
                }
                if (!z3 && (X2 = X2(P2, account, str)) != null) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("authtoken", X2);
                    bundle2.putString("authAccount", account.name);
                    bundle2.putString("accountType", account.type);
                    V2(iAccountManagerResponse, bundle2);
                } else if (!z3 || (Y2 = Y2(P2, account, str, string)) == null) {
                    new c(P2, iAccountManagerResponse, account.type, z2, false, account.name, false, bundle, account, str, z, z3, string).h();
                } else {
                    Log.isLoggable("AccountManagerService", 2);
                    Bundle bundle3 = new Bundle();
                    bundle3.putString("authtoken", Y2);
                    bundle3.putString("authAccount", account.name);
                    bundle3.putString("accountType", account.type);
                    V2(iAccountManagerResponse, bundle3);
                }
            }
        } catch (RemoteException unused) {
        }
    }

    @Override // androidx.appcompat.view.menu.k00
    public AuthenticatorDescription[] k2(int i2) {
        c7 P2 = P2(i2);
        ArrayList arrayList = new ArrayList();
        synchronized (P2.m) {
            try {
                for (cv0 cv0Var : P2.o) {
                    j jVar = (j) this.n.a.get(cv0Var.m.type);
                    if (jVar != null) {
                        arrayList.add(jVar.a);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return (AuthenticatorDescription[]) arrayList.toArray(new AuthenticatorDescription[0]);
    }

    @Override // androidx.appcompat.view.menu.k00
    public String l2(Account account, String str, int i2) {
        String str2;
        Objects.requireNonNull(account, "Account cannot be null");
        Objects.requireNonNull(str, "AuthTokenType cannot be null");
        c7 P2 = P2(i2);
        if (P2 == null) {
            return null;
        }
        synchronized (P2.m) {
            str2 = (String) P2.i(account).get(str);
        }
        return str2;
    }

    @Override // androidx.appcompat.view.menu.k00
    public boolean m0(Account account, String str, int i2, int i3) {
        Objects.requireNonNull(account, "account cannot be null");
        Objects.requireNonNull(str, "packageName cannot be null");
        c7 P2 = P2(i3);
        if (P2 == null) {
            return false;
        }
        return g3(account, str, i2, P2);
    }

    @Override // androidx.appcompat.view.menu.k00
    public boolean p0(Account account, int i2) {
        Objects.requireNonNull(account, "account cannot be null");
        c7 P2 = P2(i2);
        if (P2 == null) {
            return false;
        }
        return h3(P2, account);
    }

    @Override // androidx.appcompat.view.menu.k00
    public String r(Account account, String str, int i2) {
        if (Log.isLoggable("AccountManagerService", 2)) {
            String.format("getUserData( account: %s, key: %s, callerUid: %s, pid: %s", account, str, Integer.valueOf(Binder.getCallingUid()), Integer.valueOf(Binder.getCallingPid()));
        }
        Objects.requireNonNull(account, "account cannot be null");
        Objects.requireNonNull(str, "key cannot be null");
        return a3(P2(i2), account, str);
    }

    @Override // androidx.appcompat.view.menu.k00
    public void r2(Account account, String str, int i2, boolean z) {
    }

    @Override // androidx.appcompat.view.menu.k00
    public boolean s1(Account account, String str, Bundle bundle, Map map, int i2) {
        return E2(P2(i2), account, str, bundle, map);
    }

    @Override // androidx.appcompat.view.menu.k00
    public void w1(String[] strArr, String str, int i2) {
    }

    @Override // androidx.appcompat.view.menu.k00
    public void y0(IAccountManagerResponse iAccountManagerResponse, String str, String str2, int i2) {
        tj0.b(str != null, "accountType cannot be null");
        tj0.b(str2 != null, "authTokenType cannot be null");
        new g(P2(i2), iAccountManagerResponse, str, false, false, null, false, str, str2).h();
    }

    @Override // androidx.appcompat.view.menu.k00
    public void y1(Account account, String str, int i2) {
        Objects.requireNonNull(account, "Account cannot be null");
        c7 P2 = P2(i2);
        if (P2 == null) {
            return;
        }
        synchronized (P2.m) {
            cv0 d2 = P2.d(account);
            d2.n = str;
            d2.q.clear();
            d3();
        }
        synchronized (this.o) {
            try {
                Iterator it = this.o.iterator();
                while (it.hasNext()) {
                    c11 c11Var = (c11) it.next();
                    if (c11Var.b.equals(account) && c11Var.a == i2) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
