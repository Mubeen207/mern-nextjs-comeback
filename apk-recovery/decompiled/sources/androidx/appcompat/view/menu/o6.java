package androidx.appcompat.view.menu;

import android.app.job.JobInfo;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageParser;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Binder;
import androidx.appcompat.view.menu.n00;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class o6 extends n00.a implements n30 {
    public static final o6 m = new o6();
    public final Map l = new HashMap();

    public static o6 k() {
        return m;
    }

    @Override // androidx.appcompat.view.menu.n00
    public int B0(String str, int i, int i2) {
        return i;
    }

    @Override // androidx.appcompat.view.menu.n00
    public d70 E(String str, int i, int i2) {
        return (d70) this.l.get(h(str, i));
    }

    @Override // androidx.appcompat.view.menu.n00
    public void O(String str, int i) {
    }

    public final String h(String str, int i) {
        return str + "_" + i;
    }

    @Override // androidx.appcompat.view.menu.n00
    public JobInfo i0(JobInfo jobInfo, int i) {
        ComponentName service = jobInfo.getService();
        Intent intent = new Intent();
        intent.setComponent(service);
        ResolveInfo W = x6.w2().W(intent, PackageParser.PARSE_IS_PRIVILEGED, null, i);
        if (W == null) {
            return jobInfo;
        }
        ServiceInfo serviceInfo = W.serviceInfo;
        bk0 d = a7.e().d(serviceInfo.packageName, serviceInfo.processName, i);
        if (d == null && (d = a7.e().u(serviceInfo.packageName, serviceInfo.processName, i, -1, Binder.getCallingPid())) == null) {
            throw new RuntimeException("Unable to create Process " + serviceInfo.processName);
        }
        return u2(d, jobInfo, serviceInfo);
    }

    @Override // androidx.appcompat.view.menu.n30
    public void j() {
    }

    public JobInfo u2(bk0 bk0Var, JobInfo jobInfo, ServiceInfo serviceInfo) {
        d70 d70Var = new d70();
        d70Var.m = jobInfo;
        d70Var.n = serviceInfo;
        this.l.put(h(bk0Var.m, jobInfo.getId()), d70Var);
        x60.b.e(jobInfo, new ComponentName(bv0.o(), nl0.g(bk0Var.s)));
        return jobInfo;
    }
}
