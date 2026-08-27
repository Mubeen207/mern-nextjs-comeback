package androidx.appcompat.view.menu;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import androidx.appcompat.view.menu.fy;
import androidx.appcompat.view.menu.m2;
import com.google.android.gms.common.api.Scope;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public abstract class vx extends z7 implements m2.f {
    public final ac Q;
    public final Set R;
    public final Account S;

    public vx(Context context, Looper looper, int i, ac acVar, fy.a aVar, fy.b bVar) {
        this(context, looper, i, acVar, (df) aVar, (kg0) bVar);
    }

    @Override // androidx.appcompat.view.menu.z7
    public final Set C() {
        return this.R;
    }

    @Override // androidx.appcompat.view.menu.m2.f
    public Set b() {
        return o() ? this.R : Collections.emptySet();
    }

    public Set j0(Set set) {
        return set;
    }

    public final Set k0(Set set) {
        Set<Scope> j0 = j0(set);
        for (Scope scope : j0) {
            if (!set.contains(scope)) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        return j0;
    }

    @Override // androidx.appcompat.view.menu.z7
    public final Account u() {
        return this.S;
    }

    @Override // androidx.appcompat.view.menu.z7
    public final Executor w() {
        return null;
    }

    public vx(Context context, Looper looper, int i, ac acVar, df dfVar, kg0 kg0Var) {
        this(context, looper, wx.b(context), dy.m(), i, acVar, (df) pj0.i(dfVar), (kg0) pj0.i(kg0Var));
    }

    public vx(Context context, Looper looper, wx wxVar, dy dyVar, int i, ac acVar, df dfVar, kg0 kg0Var) {
        super(context, looper, wxVar, dyVar, i, dfVar == null ? null : new gd1(dfVar), kg0Var == null ? null : new jd1(kg0Var), acVar.h());
        this.Q = acVar;
        this.S = acVar.a();
        this.R = k0(acVar.c());
    }
}
