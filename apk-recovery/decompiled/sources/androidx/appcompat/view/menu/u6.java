package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.ConfigurationInfo;
import android.content.pm.FeatureInfo;
import android.content.pm.InstrumentationInfo;
import android.content.pm.PackageParser;
import android.content.pm.PermissionGroupInfo;
import android.content.pm.PermissionInfo;
import android.content.pm.ProviderInfo;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public class u6 implements Parcelable {
    public static final Parcelable.Creator<u6> CREATOR = new a();
    public final String A;
    public final ArrayList B;
    public final ArrayList C;
    public final int D;
    public ApplicationInfo E;
    public final String F;
    public String G;
    public final int H;
    public final ArrayList I;
    public final ArrayList J;
    public o50 K;
    public final ArrayList m;
    public final ArrayList n;
    public final ArrayList o;
    public final ArrayList p;
    public final ArrayList q;
    public final ArrayList r;
    public final ArrayList s;
    public ArrayList t;
    public final Signature[] u;
    public m v;
    public final Bundle w;
    public y6 x;
    public final String y;
    public final int z;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public u6 createFromParcel(Parcel parcel) {
            return new u6(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public u6[] newArray(int i) {
            return new u6[i];
        }
    }

    /* loaded from: classes.dex */
    public static class c extends f {
        public b t;

        public c(PackageParser.IntentInfo intentInfo) {
            super(intentInfo);
        }

        public c(f fVar) {
            super(fVar);
        }
    }

    /* loaded from: classes.dex */
    public static class j extends f {
        public i t;

        public j(PackageParser.IntentInfo intentInfo) {
            super(intentInfo);
        }

        public j(f fVar) {
            super(fVar);
        }
    }

    /* loaded from: classes.dex */
    public static class l extends f {
        public k t;

        public l(PackageParser.IntentInfo intentInfo) {
            super(intentInfo);
        }

        public l(f fVar) {
            super(fVar);
        }
    }

    /* loaded from: classes.dex */
    public static final class m implements Parcelable {
        public static final Parcelable.Creator<m> CREATOR = new a();
        public final Signature[] m;

        /* loaded from: classes.dex */
        public class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public m createFromParcel(Parcel parcel) {
                return new m(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public m[] newArray(int i) {
                return new m[i];
            }
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeTypedArray(this.m, i);
        }

        public m(PackageParser.SigningDetails signingDetails) {
            Signature[] signatureArr = signingDetails.pastSigningCertificates;
            if (signatureArr == null) {
                this.m = signingDetails.signatures;
            } else {
                this.m = signatureArr;
            }
        }

        public m(Parcel parcel) {
            this.m = (Signature[]) parcel.createTypedArray(Signature.CREATOR);
        }
    }

    public u6(PackageParser.Package r5) {
        this.t = new ArrayList();
        this.m = new ArrayList(r5.activities.size());
        Iterator<PackageParser.Activity> it = r5.activities.iterator();
        while (it.hasNext()) {
            b bVar = new b(it.next());
            Iterator it2 = bVar.b.iterator();
            while (it2.hasNext()) {
                ((c) it2.next()).t = bVar;
            }
            bVar.a = this;
            this.m.add(bVar);
        }
        this.n = new ArrayList(r5.receivers.size());
        Iterator<PackageParser.Activity> it3 = r5.receivers.iterator();
        while (it3.hasNext()) {
            b bVar2 = new b(it3.next());
            Iterator it4 = bVar2.b.iterator();
            while (it4.hasNext()) {
                ((c) it4.next()).t = bVar2;
            }
            bVar2.a = this;
            this.n.add(bVar2);
        }
        this.o = new ArrayList(r5.providers.size());
        Iterator<PackageParser.Provider> it5 = r5.providers.iterator();
        while (it5.hasNext()) {
            i iVar = new i(it5.next());
            Iterator it6 = iVar.b.iterator();
            while (it6.hasNext()) {
                ((j) it6.next()).t = iVar;
            }
            iVar.a = this;
            this.o.add(iVar);
        }
        this.p = new ArrayList(r5.services.size());
        Iterator<PackageParser.Service> it7 = r5.services.iterator();
        while (it7.hasNext()) {
            k kVar = new k(it7.next());
            Iterator it8 = kVar.b.iterator();
            while (it8.hasNext()) {
                ((l) it8.next()).t = kVar;
            }
            kVar.a = this;
            this.p.add(kVar);
        }
        this.q = new ArrayList(r5.instrumentation.size());
        Iterator<PackageParser.Instrumentation> it9 = r5.instrumentation.iterator();
        while (it9.hasNext()) {
            e eVar = new e(it9.next());
            eVar.a = this;
            this.q.add(eVar);
        }
        this.r = new ArrayList(r5.permissions.size());
        Iterator<PackageParser.Permission> it10 = r5.permissions.iterator();
        while (it10.hasNext()) {
            g gVar = new g(it10.next());
            gVar.a = this;
            this.r.add(gVar);
        }
        this.s = new ArrayList(r5.permissionGroups.size());
        Iterator<PackageParser.PermissionGroup> it11 = r5.permissionGroups.iterator();
        while (it11.hasNext()) {
            h hVar = new h(it11.next());
            hVar.a = this;
            this.s.add(hVar);
        }
        this.t = r5.requestedPermissions;
        if (y8.e()) {
            m mVar = new m(r5.mSigningDetails);
            this.v = mVar;
            this.u = mVar.m;
        } else {
            this.u = r5.mSignatures;
        }
        this.w = r5.mAppMetaData;
        this.y = r5.packageName;
        this.z = r5.mPreferredOrder;
        this.A = r5.mSharedUserId;
        this.B = r5.usesLibraries;
        this.C = r5.usesOptionalLibraries;
        this.D = r5.mVersionCode;
        this.E = r5.applicationInfo;
        this.F = r5.mVersionName;
        this.G = r5.baseCodePath;
        this.H = r5.mSharedUserLabel;
        this.I = r5.configPreferences;
        this.J = r5.reqFeatures;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.m.size());
        Iterator it = this.m.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            parcel.writeString(bVar.c);
            parcel.writeBundle(bVar.d);
            parcel.writeParcelable(bVar.f, i2);
            ArrayList arrayList = bVar.b;
            if (arrayList != null) {
                int size = arrayList.size();
                parcel.writeInt(size);
                while (true) {
                    int i3 = size - 1;
                    if (size > 0) {
                        parcel.writeParcelable((Parcelable) bVar.b.get(i3), i2);
                        size = i3;
                    }
                }
            } else {
                parcel.writeInt(0);
            }
        }
        parcel.writeInt(this.n.size());
        Iterator it2 = this.n.iterator();
        while (it2.hasNext()) {
            b bVar2 = (b) it2.next();
            parcel.writeString(bVar2.c);
            parcel.writeBundle(bVar2.d);
            parcel.writeParcelable(bVar2.f, i2);
            ArrayList arrayList2 = bVar2.b;
            if (arrayList2 != null) {
                int size2 = arrayList2.size();
                parcel.writeInt(size2);
                while (true) {
                    int i4 = size2 - 1;
                    if (size2 > 0) {
                        parcel.writeParcelable((Parcelable) bVar2.b.get(i4), i2);
                        size2 = i4;
                    }
                }
            } else {
                parcel.writeInt(0);
            }
        }
        parcel.writeInt(this.o.size());
        Iterator it3 = this.o.iterator();
        while (it3.hasNext()) {
            i iVar = (i) it3.next();
            parcel.writeString(iVar.c);
            parcel.writeBundle(iVar.d);
            parcel.writeParcelable(iVar.f, i2);
            ArrayList arrayList3 = iVar.b;
            if (arrayList3 != null) {
                int size3 = arrayList3.size();
                parcel.writeInt(size3);
                while (true) {
                    int i5 = size3 - 1;
                    if (size3 > 0) {
                        parcel.writeParcelable((Parcelable) iVar.b.get(i5), i2);
                        size3 = i5;
                    }
                }
            } else {
                parcel.writeInt(0);
            }
        }
        parcel.writeInt(this.p.size());
        Iterator it4 = this.p.iterator();
        while (it4.hasNext()) {
            k kVar = (k) it4.next();
            parcel.writeString(kVar.c);
            parcel.writeBundle(kVar.d);
            parcel.writeParcelable(kVar.f, i2);
            ArrayList arrayList4 = kVar.b;
            if (arrayList4 != null) {
                int size4 = arrayList4.size();
                parcel.writeInt(size4);
                while (true) {
                    int i6 = size4 - 1;
                    if (size4 > 0) {
                        parcel.writeParcelable((Parcelable) kVar.b.get(i6), i2);
                        size4 = i6;
                    }
                }
            } else {
                parcel.writeInt(0);
            }
        }
        parcel.writeInt(this.q.size());
        Iterator it5 = this.q.iterator();
        while (it5.hasNext()) {
            e eVar = (e) it5.next();
            parcel.writeString(eVar.c);
            parcel.writeBundle(eVar.d);
            parcel.writeParcelable(eVar.f, i2);
            ArrayList arrayList5 = eVar.b;
            if (arrayList5 != null) {
                int size5 = arrayList5.size();
                parcel.writeInt(size5);
                while (true) {
                    int i7 = size5 - 1;
                    if (size5 > 0) {
                        parcel.writeParcelable((Parcelable) eVar.b.get(i7), i2);
                        size5 = i7;
                    }
                }
            } else {
                parcel.writeInt(0);
            }
        }
        parcel.writeInt(this.r.size());
        Iterator it6 = this.r.iterator();
        while (it6.hasNext()) {
            g gVar = (g) it6.next();
            parcel.writeString(gVar.c);
            parcel.writeBundle(gVar.d);
            parcel.writeParcelable(gVar.f, i2);
            ArrayList arrayList6 = gVar.b;
            if (arrayList6 != null) {
                int size6 = arrayList6.size();
                parcel.writeInt(size6);
                while (true) {
                    int i8 = size6 - 1;
                    if (size6 > 0) {
                        parcel.writeParcelable((Parcelable) gVar.b.get(i8), i2);
                        size6 = i8;
                    }
                }
            } else {
                parcel.writeInt(0);
            }
        }
        parcel.writeInt(this.s.size());
        Iterator it7 = this.s.iterator();
        while (it7.hasNext()) {
            h hVar = (h) it7.next();
            parcel.writeString(hVar.c);
            parcel.writeBundle(hVar.d);
            parcel.writeParcelable(hVar.f, i2);
            ArrayList arrayList7 = hVar.b;
            if (arrayList7 != null) {
                int size7 = arrayList7.size();
                parcel.writeInt(size7);
                while (true) {
                    int i9 = size7 - 1;
                    if (size7 > 0) {
                        parcel.writeParcelable((Parcelable) hVar.b.get(i9), i2);
                        size7 = i9;
                    }
                }
            } else {
                parcel.writeInt(0);
            }
        }
        parcel.writeStringList(this.t);
        if (y8.e()) {
            parcel.writeParcelable(this.v, i2);
        }
        parcel.writeTypedArray(this.u, i2);
        parcel.writeBundle(this.w);
        parcel.writeString(this.y);
        parcel.writeInt(this.z);
        parcel.writeString(this.A);
        parcel.writeStringList(this.B);
        parcel.writeStringList(this.C);
        parcel.writeInt(this.D);
        parcel.writeParcelable(this.E, i2);
        parcel.writeString(this.F);
        parcel.writeString(this.G);
        parcel.writeInt(this.H);
        parcel.writeTypedList(this.I);
        parcel.writeTypedList(this.J);
        parcel.writeParcelable(this.K, i2);
    }

    /* loaded from: classes.dex */
    public static class d {
        public u6 a;
        public ArrayList b;
        public final String c;
        public final Bundle d;
        public ComponentName e;

        public d(Parcel parcel) {
            this.c = parcel.readString();
            this.d = parcel.readBundle(Bundle.class.getClassLoader());
        }

        public ComponentName a() {
            ComponentName componentName = this.e;
            if (componentName != null) {
                return componentName;
            }
            if (this.c != null) {
                this.e = new ComponentName(this.a.y, this.c);
            }
            return this.e;
        }

        public d(PackageParser.Component component) {
            this.c = component.className;
            this.d = component.metaData;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends d {
        public final ActivityInfo f;

        public b(PackageParser.Activity activity) {
            super(activity);
            this.f = activity.info;
            ArrayList<II> arrayList = activity.intents;
            if (arrayList != 0) {
                this.b = new ArrayList(arrayList.size());
                Iterator it = activity.intents.iterator();
                while (it.hasNext()) {
                    this.b.add(new c((PackageParser.ActivityIntentInfo) it.next()));
                }
            }
        }

        public b(Parcel parcel) {
            super(parcel);
            this.f = (ActivityInfo) parcel.readParcelable(ActivityInfo.class.getClassLoader());
            int readInt = parcel.readInt();
            this.b = new ArrayList(readInt);
            while (true) {
                int i = readInt - 1;
                if (readInt <= 0) {
                    return;
                }
                this.b.add(new c((f) parcel.readParcelable(u6.class.getClassLoader())));
                readInt = i;
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends d {
        public final InstrumentationInfo f;

        public e(PackageParser.Instrumentation instrumentation) {
            super(instrumentation);
            this.f = instrumentation.info;
            ArrayList<II> arrayList = instrumentation.intents;
            if (arrayList != 0) {
                this.b = new ArrayList(arrayList.size());
                Iterator it = instrumentation.intents.iterator();
                while (it.hasNext()) {
                    this.b.add(new f((PackageParser.IntentInfo) it.next()));
                }
            }
        }

        public e(Parcel parcel) {
            super(parcel);
            this.f = (InstrumentationInfo) parcel.readParcelable(InstrumentationInfo.class.getClassLoader());
            int readInt = parcel.readInt();
            this.b = new ArrayList(readInt);
            while (true) {
                int i = readInt - 1;
                if (readInt <= 0) {
                    return;
                }
                this.b.add((f) parcel.readParcelable(u6.class.getClassLoader()));
                readInt = i;
            }
        }
    }

    /* loaded from: classes.dex */
    public static class f implements Parcelable {
        public static final Parcelable.Creator<f> CREATOR = new a();
        public final IntentFilter m;
        public final boolean n;
        public final int o;
        public final String p;
        public final int q;
        public final int r;
        public final int s;

        /* loaded from: classes.dex */
        public class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public f createFromParcel(Parcel parcel) {
                return new f(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public f[] newArray(int i) {
                return new f[i];
            }
        }

        public f(PackageParser.IntentInfo intentInfo) {
            this.m = intentInfo;
            this.n = intentInfo.hasDefault;
            this.o = intentInfo.labelRes;
            CharSequence charSequence = intentInfo.nonLocalizedLabel;
            this.p = charSequence == null ? null : charSequence.toString();
            this.q = intentInfo.icon;
            this.r = intentInfo.logo;
            this.s = intentInfo.banner;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.m, i);
            parcel.writeByte(this.n ? (byte) 1 : (byte) 0);
            parcel.writeInt(this.o);
            parcel.writeString(this.p);
            parcel.writeInt(this.q);
            parcel.writeInt(this.r);
            parcel.writeInt(this.s);
        }

        public f(f fVar) {
            this.m = fVar.m;
            this.n = fVar.n;
            this.o = fVar.o;
            String str = fVar.p;
            this.p = str == null ? null : str;
            this.q = fVar.q;
            this.r = fVar.r;
            this.s = fVar.s;
        }

        public f(Parcel parcel) {
            this.m = (IntentFilter) parcel.readParcelable(u6.class.getClassLoader());
            this.n = parcel.readByte() != 0;
            this.o = parcel.readInt();
            this.p = parcel.readString();
            this.q = parcel.readInt();
            this.r = parcel.readInt();
            this.s = parcel.readInt();
        }
    }

    /* loaded from: classes.dex */
    public static final class g extends d {
        public final PermissionInfo f;

        public g(PackageParser.Permission permission) {
            super(permission);
            this.f = permission.info;
            ArrayList<II> arrayList = permission.intents;
            if (arrayList != 0) {
                this.b = new ArrayList(arrayList.size());
                Iterator it = permission.intents.iterator();
                while (it.hasNext()) {
                    this.b.add(new f((PackageParser.IntentInfo) it.next()));
                }
            }
        }

        public g(Parcel parcel) {
            super(parcel);
            this.f = (PermissionInfo) parcel.readParcelable(g.class.getClassLoader());
            int readInt = parcel.readInt();
            this.b = new ArrayList(readInt);
            while (true) {
                int i = readInt - 1;
                if (readInt <= 0) {
                    return;
                }
                this.b.add((f) parcel.readParcelable(u6.class.getClassLoader()));
                readInt = i;
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class h extends d {
        public final PermissionGroupInfo f;

        public h(PackageParser.PermissionGroup permissionGroup) {
            super(permissionGroup);
            this.f = permissionGroup.info;
            ArrayList<II> arrayList = permissionGroup.intents;
            if (arrayList != 0) {
                this.b = new ArrayList(arrayList.size());
                Iterator it = permissionGroup.intents.iterator();
                while (it.hasNext()) {
                    this.b.add(new f((PackageParser.IntentInfo) it.next()));
                }
            }
        }

        public h(Parcel parcel) {
            super(parcel);
            this.f = (PermissionGroupInfo) parcel.readParcelable(h.class.getClassLoader());
            int readInt = parcel.readInt();
            this.b = new ArrayList(readInt);
            while (true) {
                int i = readInt - 1;
                if (readInt <= 0) {
                    return;
                }
                this.b.add((f) parcel.readParcelable(u6.class.getClassLoader()));
                readInt = i;
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class i extends d {
        public final ProviderInfo f;

        public i(PackageParser.Provider provider) {
            super(provider);
            this.f = provider.info;
            ArrayList<II> arrayList = provider.intents;
            if (arrayList != 0) {
                this.b = new ArrayList(arrayList.size());
                Iterator it = provider.intents.iterator();
                while (it.hasNext()) {
                    this.b.add(new j((PackageParser.ProviderIntentInfo) it.next()));
                }
            }
        }

        public i(Parcel parcel) {
            super(parcel);
            this.f = (ProviderInfo) parcel.readParcelable(ProviderInfo.class.getClassLoader());
            int readInt = parcel.readInt();
            this.b = new ArrayList(readInt);
            while (true) {
                int i = readInt - 1;
                if (readInt <= 0) {
                    return;
                }
                this.b.add(new j((f) parcel.readParcelable(u6.class.getClassLoader())));
                readInt = i;
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class k extends d {
        public final ServiceInfo f;

        public k(PackageParser.Service service) {
            super(service);
            this.f = service.info;
            ArrayList<II> arrayList = service.intents;
            if (arrayList != 0) {
                this.b = new ArrayList(arrayList.size());
                Iterator it = service.intents.iterator();
                while (it.hasNext()) {
                    this.b.add(new l((PackageParser.ServiceIntentInfo) it.next()));
                }
            }
        }

        public k(Parcel parcel) {
            super(parcel);
            this.f = (ServiceInfo) parcel.readParcelable(ServiceInfo.class.getClassLoader());
            int readInt = parcel.readInt();
            this.b = new ArrayList(readInt);
            while (true) {
                int i = readInt - 1;
                if (readInt <= 0) {
                    return;
                }
                this.b.add(new l((f) parcel.readParcelable(u6.class.getClassLoader())));
                readInt = i;
            }
        }
    }

    public u6(Parcel parcel) {
        this.t = new ArrayList();
        int readInt = parcel.readInt();
        this.m = new ArrayList(readInt);
        while (true) {
            int i2 = readInt - 1;
            if (readInt <= 0) {
                break;
            }
            b bVar = new b(parcel);
            Iterator it = bVar.b.iterator();
            while (it.hasNext()) {
                ((c) it.next()).t = bVar;
            }
            bVar.a = this;
            this.m.add(bVar);
            readInt = i2;
        }
        int readInt2 = parcel.readInt();
        this.n = new ArrayList(readInt2);
        while (true) {
            int i3 = readInt2 - 1;
            if (readInt2 <= 0) {
                break;
            }
            b bVar2 = new b(parcel);
            Iterator it2 = bVar2.b.iterator();
            while (it2.hasNext()) {
                ((c) it2.next()).t = bVar2;
            }
            bVar2.a = this;
            this.n.add(bVar2);
            readInt2 = i3;
        }
        int readInt3 = parcel.readInt();
        this.o = new ArrayList(readInt3);
        while (true) {
            int i4 = readInt3 - 1;
            if (readInt3 <= 0) {
                break;
            }
            i iVar = new i(parcel);
            Iterator it3 = iVar.b.iterator();
            while (it3.hasNext()) {
                ((j) it3.next()).t = iVar;
            }
            iVar.a = this;
            this.o.add(iVar);
            readInt3 = i4;
        }
        int readInt4 = parcel.readInt();
        this.p = new ArrayList(readInt4);
        while (true) {
            int i5 = readInt4 - 1;
            if (readInt4 <= 0) {
                break;
            }
            k kVar = new k(parcel);
            Iterator it4 = kVar.b.iterator();
            while (it4.hasNext()) {
                ((l) it4.next()).t = kVar;
            }
            kVar.a = this;
            this.p.add(kVar);
            readInt4 = i5;
        }
        int readInt5 = parcel.readInt();
        this.q = new ArrayList(readInt5);
        while (true) {
            int i6 = readInt5 - 1;
            if (readInt5 <= 0) {
                break;
            }
            e eVar = new e(parcel);
            eVar.a = this;
            this.q.add(eVar);
            readInt5 = i6;
        }
        int readInt6 = parcel.readInt();
        this.r = new ArrayList(readInt6);
        while (true) {
            int i7 = readInt6 - 1;
            if (readInt6 <= 0) {
                break;
            }
            g gVar = new g(parcel);
            gVar.a = this;
            this.r.add(gVar);
            readInt6 = i7;
        }
        int readInt7 = parcel.readInt();
        this.s = new ArrayList(readInt7);
        while (true) {
            int i8 = readInt7 - 1;
            if (readInt7 <= 0) {
                break;
            }
            h hVar = new h(parcel);
            hVar.a = this;
            this.s.add(hVar);
            readInt7 = i8;
        }
        parcel.readStringList(this.t);
        if (y8.e()) {
            this.v = (m) parcel.readParcelable(m.class.getClassLoader());
        }
        this.u = (Signature[]) parcel.createTypedArray(Signature.CREATOR);
        this.w = parcel.readBundle(Bundle.class.getClassLoader());
        this.y = parcel.readString();
        this.z = parcel.readInt();
        this.A = parcel.readString();
        this.B = parcel.createStringArrayList();
        this.C = parcel.createStringArrayList();
        this.D = parcel.readInt();
        this.E = (ApplicationInfo) parcel.readParcelable(ApplicationInfo.class.getClassLoader());
        this.F = parcel.readString();
        this.G = parcel.readString();
        this.H = parcel.readInt();
        this.I = parcel.createTypedArrayList(ConfigurationInfo.CREATOR);
        this.J = parcel.createTypedArrayList(FeatureInfo.CREATOR);
        this.K = (o50) parcel.readParcelable(o50.class.getClassLoader());
    }
}
