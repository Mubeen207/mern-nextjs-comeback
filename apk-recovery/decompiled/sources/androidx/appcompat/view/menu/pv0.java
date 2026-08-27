package androidx.appcompat.view.menu;

import android.app.job.JobInfo;
import android.os.RemoteException;
/* loaded from: classes.dex */
public class pv0 extends nv0 {
    public static final pv0 d = new pv0(n00.class);

    public pv0(Class cls) {
        super(cls);
    }

    public static pv0 h() {
        return d;
    }

    @Override // androidx.appcompat.view.menu.nv0
    public String d() {
        return "job_manager";
    }

    public int f(String str, int i) {
        try {
            return ((n00) c()).B0(str, i, mv0.N2());
        } catch (RemoteException e) {
            e.printStackTrace();
            return -1;
        }
    }

    public void g(String str) {
        try {
            ((n00) c()).O(str, mv0.N2());
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public d70 i(String str, int i) {
        try {
            return ((n00) c()).E(str, i, mv0.N2());
        } catch (RemoteException e) {
            e.printStackTrace();
            return null;
        }
    }

    public JobInfo j(JobInfo jobInfo) {
        try {
            return ((n00) c()).i0(jobInfo, mv0.N2());
        } catch (RemoteException e) {
            e.printStackTrace();
            return null;
        }
    }
}
