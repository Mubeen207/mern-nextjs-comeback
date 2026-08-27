package androidx.appcompat.view.menu;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.AtomicFile;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public class y6 implements Parcelable {
    public static final Parcelable.Creator<y6> CREATOR = new a();
    public u6 m;
    public int n;
    public o50 o;
    public Map p;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public y6 createFromParcel(Parcel parcel) {
            return new y6(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public y6[] newArray(int i) {
            return new y6[i];
        }
    }

    public y6() {
        this.p = new HashMap();
    }

    public boolean a(int i) {
        return e(i).m;
    }

    public List b() {
        return new ArrayList(this.p.keySet());
    }

    public List c() {
        return new ArrayList(this.p.values());
    }

    public final z6 d(int i) {
        z6 z6Var = (z6) this.p.get(Integer.valueOf(i));
        if (z6Var == null) {
            z6 z6Var2 = new z6();
            this.p.put(Integer.valueOf(i), z6Var2);
            return z6Var2;
        }
        return z6Var;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public z6 e(int i) {
        z6 z6Var = (z6) this.p.get(Integer.valueOf(i));
        if (z6Var == null) {
            z6Var = new z6();
        }
        z6 z6Var2 = new z6(z6Var);
        if (i == -1) {
            z6Var2.m = true;
        }
        return z6Var2;
    }

    public void f(int i) {
        this.p.remove(Integer.valueOf(i));
    }

    public void i() {
        synchronized (this) {
            Parcel obtain = Parcel.obtain();
            AtomicFile atomicFile = new AtomicFile(ov0.p(this.m.y));
            writeToParcel(obtain, 0);
            obtain.setDataPosition(0);
            FileOutputStream startWrite = atomicFile.startWrite();
            qr.l(obtain, startWrite);
            atomicFile.finishWrite(startWrite);
            obtain.recycle();
            fc.a(startWrite);
        }
    }

    public void j(boolean z, int i) {
        d(i).m = z;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.m, i);
        parcel.writeInt(this.n);
        parcel.writeParcelable(this.o, i);
        parcel.writeInt(this.p.size());
        for (Map.Entry entry : this.p.entrySet()) {
            parcel.writeValue(entry.getKey());
            parcel.writeParcelable((Parcelable) entry.getValue(), i);
        }
    }

    public y6(Parcel parcel) {
        this.p = new HashMap();
        this.m = (u6) parcel.readParcelable(u6.class.getClassLoader());
        this.n = parcel.readInt();
        this.o = (o50) parcel.readParcelable(o50.class.getClassLoader());
        int readInt = parcel.readInt();
        this.p = new HashMap(readInt);
        for (int i = 0; i < readInt; i++) {
            this.p.put((Integer) parcel.readValue(Integer.class.getClassLoader()), (z6) parcel.readParcelable(z6.class.getClassLoader()));
        }
    }
}
