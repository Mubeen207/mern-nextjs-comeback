package androidx.appcompat.view.menu;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.appcompat.view.menu.cw;
import androidx.lifecycle.f;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class o7 implements Parcelable {
    public static final Parcelable.Creator<o7> CREATOR = new a();
    public final int[] m;
    public final ArrayList n;
    public final int[] o;
    public final int[] p;
    public final int q;
    public final String r;
    public final int s;
    public final int t;
    public final CharSequence u;
    public final int v;
    public final CharSequence w;
    public final ArrayList x;
    public final ArrayList y;
    public final boolean z;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public o7 createFromParcel(Parcel parcel) {
            return new o7(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public o7[] newArray(int i) {
            return new o7[i];
        }
    }

    public o7(n7 n7Var) {
        int size = n7Var.c.size();
        this.m = new int[size * 6];
        if (n7Var.i) {
            this.n = new ArrayList(size);
            this.o = new int[size];
            this.p = new int[size];
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                cw.a aVar = (cw.a) n7Var.c.get(i2);
                int i3 = i + 1;
                this.m[i] = aVar.a;
                ArrayList arrayList = this.n;
                fv fvVar = aVar.b;
                arrayList.add(fvVar != null ? fvVar.e : null);
                int[] iArr = this.m;
                iArr[i3] = aVar.c ? 1 : 0;
                iArr[i + 2] = aVar.d;
                iArr[i + 3] = aVar.e;
                int i4 = i + 5;
                iArr[i + 4] = aVar.f;
                i += 6;
                iArr[i4] = aVar.g;
                this.o[i2] = aVar.h.ordinal();
                this.p[i2] = aVar.i.ordinal();
            }
            this.q = n7Var.h;
            this.r = n7Var.k;
            this.s = n7Var.v;
            this.t = n7Var.l;
            this.u = n7Var.m;
            this.v = n7Var.n;
            this.w = n7Var.o;
            this.x = n7Var.p;
            this.y = n7Var.q;
            this.z = n7Var.r;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    public final void a(n7 n7Var) {
        int i = 0;
        int i2 = 0;
        while (true) {
            boolean z = true;
            if (i >= this.m.length) {
                n7Var.h = this.q;
                n7Var.k = this.r;
                n7Var.i = true;
                n7Var.l = this.t;
                n7Var.m = this.u;
                n7Var.n = this.v;
                n7Var.o = this.w;
                n7Var.p = this.x;
                n7Var.q = this.y;
                n7Var.r = this.z;
                return;
            }
            cw.a aVar = new cw.a();
            int i3 = i + 1;
            aVar.a = this.m[i];
            if (rv.v0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Instantiate ");
                sb.append(n7Var);
                sb.append(" op #");
                sb.append(i2);
                sb.append(" base fragment #");
                sb.append(this.m[i3]);
            }
            aVar.h = f.b.values()[this.o[i2]];
            aVar.i = f.b.values()[this.p[i2]];
            int[] iArr = this.m;
            int i4 = i + 2;
            if (iArr[i3] == 0) {
                z = false;
            }
            aVar.c = z;
            int i5 = iArr[i4];
            aVar.d = i5;
            int i6 = iArr[i + 3];
            aVar.e = i6;
            int i7 = i + 5;
            int i8 = iArr[i + 4];
            aVar.f = i8;
            i += 6;
            int i9 = iArr[i7];
            aVar.g = i9;
            n7Var.d = i5;
            n7Var.e = i6;
            n7Var.f = i8;
            n7Var.g = i9;
            n7Var.d(aVar);
            i2++;
        }
    }

    public n7 b(rv rvVar) {
        n7 n7Var = new n7(rvVar);
        a(n7Var);
        n7Var.v = this.s;
        for (int i = 0; i < this.n.size(); i++) {
            String str = (String) this.n.get(i);
            if (str != null) {
                ((cw.a) n7Var.c.get(i)).b = rvVar.V(str);
            }
        }
        n7Var.o(1);
        return n7Var;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.m);
        parcel.writeStringList(this.n);
        parcel.writeIntArray(this.o);
        parcel.writeIntArray(this.p);
        parcel.writeInt(this.q);
        parcel.writeString(this.r);
        parcel.writeInt(this.s);
        parcel.writeInt(this.t);
        TextUtils.writeToParcel(this.u, parcel, 0);
        parcel.writeInt(this.v);
        TextUtils.writeToParcel(this.w, parcel, 0);
        parcel.writeStringList(this.x);
        parcel.writeStringList(this.y);
        parcel.writeInt(this.z ? 1 : 0);
    }

    public o7(Parcel parcel) {
        this.m = parcel.createIntArray();
        this.n = parcel.createStringArrayList();
        this.o = parcel.createIntArray();
        this.p = parcel.createIntArray();
        this.q = parcel.readInt();
        this.r = parcel.readString();
        this.s = parcel.readInt();
        this.t = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.u = (CharSequence) creator.createFromParcel(parcel);
        this.v = parcel.readInt();
        this.w = (CharSequence) creator.createFromParcel(parcel);
        this.x = parcel.createStringArrayList();
        this.y = parcel.createStringArrayList();
        this.z = parcel.readInt() != 0;
    }
}
