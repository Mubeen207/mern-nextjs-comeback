package androidx.appcompat.view.menu;

import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Pair;
import androidx.appcompat.view.menu.ns1;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class vf2 {
    public ns1 a;
    public Long b;
    public long c;
    public final /* synthetic */ ze2 d;

    public final ns1 a(String str, ns1 ns1Var) {
        Object obj;
        String b0 = ns1Var.b0();
        List c0 = ns1Var.c0();
        this.d.o();
        Long l = (Long) l92.e0(ns1Var, "_eid");
        boolean z = l != null;
        if (z && b0.equals("_ep")) {
            pj0.i(l);
            this.d.o();
            b0 = (String) l92.e0(ns1Var, "_en");
            if (TextUtils.isEmpty(b0)) {
                this.d.l().I().b("Extra parameter without an event name. eventId", l);
                return null;
            }
            if (this.a == null || this.b == null || l.longValue() != this.b.longValue()) {
                Pair H = this.d.q().H(str, l);
                if (H == null || (obj = H.first) == null) {
                    this.d.l().I().c("Extra parameter without existing main event. eventName, eventId", b0, l);
                    return null;
                }
                this.a = (ns1) obj;
                this.c = ((Long) H.second).longValue();
                this.d.o();
                this.b = (Long) l92.e0(this.a, "_eid");
            }
            long j = this.c - 1;
            this.c = j;
            if (j <= 0) {
                og1 q = this.d.q();
                q.n();
                q.l().K().b("Clearing complex main event info. appId", str);
                try {
                    q.B().execSQL("delete from main_event_params where app_id=?", new String[]{str});
                } catch (SQLiteException e) {
                    q.l().G().b("Error clearing complex main event", e);
                }
            } else {
                this.d.q().j0(str, l, this.c, this.a);
            }
            ArrayList arrayList = new ArrayList();
            for (ps1 ps1Var : this.a.c0()) {
                this.d.o();
                if (l92.F(ns1Var, ps1Var.c0()) == null) {
                    arrayList.add(ps1Var);
                }
            }
            if (arrayList.isEmpty()) {
                this.d.l().I().b("No unique parameters in main event. eventName", b0);
            } else {
                arrayList.addAll(c0);
                c0 = arrayList;
            }
        } else if (z) {
            this.b = l;
            this.a = ns1Var;
            this.d.o();
            Object e0 = l92.e0(ns1Var, "_epc");
            long longValue = ((Long) (e0 != null ? e0 : 0L)).longValue();
            this.c = longValue;
            if (longValue <= 0) {
                this.d.l().I().b("Complex event with zero extra param count. eventName", b0);
            } else {
                this.d.q().j0(str, (Long) pj0.i(l), this.c, ns1Var);
            }
        }
        return (ns1) ((t02) ((ns1.a) ns1Var.x()).z(b0).E().y(c0).j());
    }

    public vf2(ze2 ze2Var) {
        this.d = ze2Var;
    }
}
