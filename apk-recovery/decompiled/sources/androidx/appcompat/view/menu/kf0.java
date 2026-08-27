package androidx.appcompat.view.menu;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.app.RemoteInput;
import android.content.Context;
import android.content.LocusId;
import android.content.pm.PackageParser;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.appcompat.view.menu.jf0;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public class kf0 implements gf0 {
    public final Context a;
    public final Notification.Builder b;
    public final jf0.e c;
    public RemoteViews d;
    public RemoteViews e;
    public final List f = new ArrayList();
    public final Bundle g = new Bundle();
    public int h;
    public RemoteViews i;

    /* loaded from: classes.dex */
    public static class a {
        public static Notification.Builder a(Notification.Builder builder, Notification.Action action) {
            return builder.addAction(action);
        }

        public static Notification.Action.Builder b(Notification.Action.Builder builder, Bundle bundle) {
            return builder.addExtras(bundle);
        }

        public static Notification.Action.Builder c(Notification.Action.Builder builder, RemoteInput remoteInput) {
            return builder.addRemoteInput(remoteInput);
        }

        public static Notification.Action d(Notification.Action.Builder builder) {
            return builder.build();
        }

        public static Notification.Action.Builder e(int i, CharSequence charSequence, PendingIntent pendingIntent) {
            return new Notification.Action.Builder(i, charSequence, pendingIntent);
        }

        public static String f(Notification notification) {
            return notification.getGroup();
        }

        public static Notification.Builder g(Notification.Builder builder, String str) {
            return builder.setGroup(str);
        }

        public static Notification.Builder h(Notification.Builder builder, boolean z) {
            return builder.setGroupSummary(z);
        }

        public static Notification.Builder i(Notification.Builder builder, boolean z) {
            return builder.setLocalOnly(z);
        }

        public static Notification.Builder j(Notification.Builder builder, String str) {
            return builder.setSortKey(str);
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public static Notification.Builder a(Notification.Builder builder, String str) {
            return builder.addPerson(str);
        }

        public static Notification.Builder b(Notification.Builder builder, String str) {
            return builder.setCategory(str);
        }

        public static Notification.Builder c(Notification.Builder builder, int i) {
            return builder.setColor(i);
        }

        public static Notification.Builder d(Notification.Builder builder, Notification notification) {
            return builder.setPublicVersion(notification);
        }

        public static Notification.Builder e(Notification.Builder builder, Uri uri, Object obj) {
            return builder.setSound(uri, (AudioAttributes) obj);
        }

        public static Notification.Builder f(Notification.Builder builder, int i) {
            return builder.setVisibility(i);
        }
    }

    /* loaded from: classes.dex */
    public static class c {
        public static Notification.Action.Builder a(Icon icon, CharSequence charSequence, PendingIntent pendingIntent) {
            return new Notification.Action.Builder(icon, charSequence, pendingIntent);
        }

        public static Notification.Builder b(Notification.Builder builder, Icon icon) {
            return builder.setLargeIcon(icon);
        }

        public static Notification.Builder c(Notification.Builder builder, Object obj) {
            return builder.setSmallIcon((Icon) obj);
        }
    }

    /* loaded from: classes.dex */
    public static class d {
        public static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z) {
            return builder.setAllowGeneratedReplies(z);
        }

        public static Notification.Builder b(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomBigContentView(remoteViews);
        }

        public static Notification.Builder c(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomContentView(remoteViews);
        }

        public static Notification.Builder d(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomHeadsUpContentView(remoteViews);
        }

        public static Notification.Builder e(Notification.Builder builder, CharSequence[] charSequenceArr) {
            return builder.setRemoteInputHistory(charSequenceArr);
        }
    }

    /* loaded from: classes.dex */
    public static class e {
        public static Notification.Builder a(Context context, String str) {
            return new Notification.Builder(context, str);
        }

        public static Notification.Builder b(Notification.Builder builder, int i) {
            return builder.setBadgeIconType(i);
        }

        public static Notification.Builder c(Notification.Builder builder, boolean z) {
            return builder.setColorized(z);
        }

        public static Notification.Builder d(Notification.Builder builder, int i) {
            return builder.setGroupAlertBehavior(i);
        }

        public static Notification.Builder e(Notification.Builder builder, CharSequence charSequence) {
            return builder.setSettingsText(charSequence);
        }

        public static Notification.Builder f(Notification.Builder builder, String str) {
            return builder.setShortcutId(str);
        }

        public static Notification.Builder g(Notification.Builder builder, long j) {
            return builder.setTimeoutAfter(j);
        }
    }

    /* loaded from: classes.dex */
    public static class f {
        public static Notification.Builder a(Notification.Builder builder, Person person) {
            return builder.addPerson(person);
        }

        public static Notification.Action.Builder b(Notification.Action.Builder builder, int i) {
            return builder.setSemanticAction(i);
        }
    }

    /* loaded from: classes.dex */
    public static class g {
        public static Notification.Builder a(Notification.Builder builder, boolean z) {
            return builder.setAllowSystemGeneratedContextualActions(z);
        }

        public static Notification.Builder b(Notification.Builder builder, Notification.BubbleMetadata bubbleMetadata) {
            return builder.setBubbleMetadata(bubbleMetadata);
        }

        public static Notification.Action.Builder c(Notification.Action.Builder builder, boolean z) {
            return builder.setContextual(z);
        }

        public static Notification.Builder d(Notification.Builder builder, Object obj) {
            return builder.setLocusId((LocusId) obj);
        }
    }

    /* loaded from: classes.dex */
    public static class h {
        public static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z) {
            return builder.setAuthenticationRequired(z);
        }

        public static Notification.Builder b(Notification.Builder builder, int i) {
            return builder.setForegroundServiceBehavior(i);
        }
    }

    public kf0(jf0.e eVar) {
        int i;
        this.c = eVar;
        Context context = eVar.a;
        this.a = context;
        Notification.Builder a2 = e.a(context, eVar.K);
        this.b = a2;
        Notification notification = eVar.R;
        a2.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, eVar.i).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(eVar.e).setContentText(eVar.f).setContentInfo(eVar.k).setContentIntent(eVar.g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(eVar.h, (notification.flags & PackageParser.PARSE_IS_PRIVILEGED) != 0).setNumber(eVar.l).setProgress(eVar.t, eVar.u, eVar.v);
        IconCompat iconCompat = eVar.j;
        c.b(a2, iconCompat == null ? null : iconCompat.m(context));
        a2.setSubText(eVar.q).setUsesChronometer(eVar.o).setPriority(eVar.m);
        Iterator it = eVar.b.iterator();
        while (it.hasNext()) {
            b((jf0.a) it.next());
        }
        Bundle bundle = eVar.D;
        if (bundle != null) {
            this.g.putAll(bundle);
        }
        this.d = eVar.H;
        this.e = eVar.I;
        this.b.setShowWhen(eVar.n);
        a.i(this.b, eVar.z);
        a.g(this.b, eVar.w);
        a.j(this.b, eVar.y);
        a.h(this.b, eVar.x);
        this.h = eVar.O;
        b.b(this.b, eVar.C);
        b.c(this.b, eVar.E);
        b.f(this.b, eVar.F);
        b.d(this.b, eVar.G);
        b.e(this.b, notification.sound, notification.audioAttributes);
        ArrayList<String> arrayList = eVar.U;
        if (arrayList != null && !arrayList.isEmpty()) {
            for (String str : arrayList) {
                b.a(this.b, str);
            }
        }
        this.i = eVar.J;
        if (eVar.d.size() > 0) {
            Bundle bundle2 = eVar.c().getBundle("android.car.EXTENSIONS");
            bundle2 = bundle2 == null ? new Bundle() : bundle2;
            Bundle bundle3 = new Bundle(bundle2);
            Bundle bundle4 = new Bundle();
            for (int i2 = 0; i2 < eVar.d.size(); i2++) {
                bundle4.putBundle(Integer.toString(i2), lf0.a((jf0.a) eVar.d.get(i2)));
            }
            bundle2.putBundle("invisible_actions", bundle4);
            bundle3.putBundle("invisible_actions", bundle4);
            eVar.c().putBundle("android.car.EXTENSIONS", bundle2);
            this.g.putBundle("android.car.EXTENSIONS", bundle3);
        }
        int i3 = Build.VERSION.SDK_INT;
        Object obj = eVar.T;
        if (obj != null) {
            c.c(this.b, obj);
        }
        this.b.setExtras(eVar.D);
        d.e(this.b, eVar.s);
        RemoteViews remoteViews = eVar.H;
        if (remoteViews != null) {
            d.c(this.b, remoteViews);
        }
        RemoteViews remoteViews2 = eVar.I;
        if (remoteViews2 != null) {
            d.b(this.b, remoteViews2);
        }
        RemoteViews remoteViews3 = eVar.J;
        if (remoteViews3 != null) {
            d.d(this.b, remoteViews3);
        }
        e.b(this.b, eVar.L);
        e.e(this.b, eVar.r);
        e.f(this.b, eVar.M);
        e.g(this.b, eVar.N);
        e.d(this.b, eVar.O);
        if (eVar.B) {
            e.c(this.b, eVar.A);
        }
        if (!TextUtils.isEmpty(eVar.K)) {
            this.b.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
        }
        Iterator it2 = eVar.c.iterator();
        if (it2.hasNext()) {
            my0.a(it2.next());
            throw null;
        }
        if (i3 >= 29) {
            g.a(this.b, eVar.Q);
            g.b(this.b, jf0.d.a(null));
        }
        if (i3 >= 31 && (i = eVar.P) != 0) {
            h.b(this.b, i);
        }
        if (eVar.S) {
            if (this.c.x) {
                this.h = 2;
            } else {
                this.h = 1;
            }
            this.b.setVibrate(null);
            this.b.setSound(null);
            int i4 = notification.defaults & (-4);
            notification.defaults = i4;
            this.b.setDefaults(i4);
            if (TextUtils.isEmpty(this.c.w)) {
                a.g(this.b, "silent");
            }
            e.d(this.b, this.h);
        }
    }

    @Override // androidx.appcompat.view.menu.gf0
    public Notification.Builder a() {
        return this.b;
    }

    public final void b(jf0.a aVar) {
        IconCompat d2 = aVar.d();
        Notification.Action.Builder a2 = c.a(d2 != null ? d2.l() : null, aVar.h(), aVar.a());
        if (aVar.e() != null) {
            for (RemoteInput remoteInput : ro0.b(aVar.e())) {
                a.c(a2, remoteInput);
            }
        }
        Bundle bundle = aVar.c() != null ? new Bundle(aVar.c()) : new Bundle();
        bundle.putBoolean("android.support.allowGeneratedReplies", aVar.b());
        int i = Build.VERSION.SDK_INT;
        d.a(a2, aVar.b());
        bundle.putInt("android.support.action.semanticAction", aVar.f());
        f.b(a2, aVar.f());
        if (i >= 29) {
            g.c(a2, aVar.j());
        }
        if (i >= 31) {
            h.a(a2, aVar.i());
        }
        bundle.putBoolean("android.support.action.showsUserInterface", aVar.g());
        a.b(a2, bundle);
        a.a(this.b, a.d(a2));
    }

    public Notification c() {
        Bundle a2;
        RemoteViews f2;
        RemoteViews d2;
        jf0.f fVar = this.c.p;
        if (fVar != null) {
            fVar.b(this);
        }
        RemoteViews e2 = fVar != null ? fVar.e(this) : null;
        Notification d3 = d();
        if (e2 != null) {
            d3.contentView = e2;
        } else {
            RemoteViews remoteViews = this.c.H;
            if (remoteViews != null) {
                d3.contentView = remoteViews;
            }
        }
        if (fVar != null && (d2 = fVar.d(this)) != null) {
            d3.bigContentView = d2;
        }
        if (fVar != null && (f2 = this.c.p.f(this)) != null) {
            d3.headsUpContentView = f2;
        }
        if (fVar != null && (a2 = jf0.a(d3)) != null) {
            fVar.a(a2);
        }
        return d3;
    }

    public Notification d() {
        return this.b.build();
    }

    public Context e() {
        return this.a;
    }
}
