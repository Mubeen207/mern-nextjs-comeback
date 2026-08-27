package androidx.appcompat.view.menu;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.AtomicFile;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public final class eu0 implements Parcelable {
    public String m;
    public int n;
    public int o;
    public static final Map p = new HashMap();
    public static final Parcelable.Creator<eu0> CREATOR = new a();

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public eu0 createFromParcel(Parcel parcel) {
            return new eu0(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public eu0[] newArray(int i) {
            return new eu0[i];
        }
    }

    public eu0(String str) {
        this.m = str;
    }

    public static void a() {
        Parcel obtain = Parcel.obtain();
        try {
            byte[] j = qr.j(ov0.s());
            obtain.unmarshall(j, 0, j.length);
            obtain.setDataPosition(0);
            HashMap readHashMap = obtain.readHashMap(eu0.class.getClassLoader());
            Map map = p;
            synchronized (map) {
                map.clear();
                map.putAll(readHashMap);
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            obtain.recycle();
            throw th;
        }
        obtain.recycle();
    }

    public static void b() {
        Parcel obtain = Parcel.obtain();
        AtomicFile atomicFile = new AtomicFile(ov0.s());
        FileOutputStream fileOutputStream = null;
        try {
            try {
                obtain.writeMap(p);
                fileOutputStream = atomicFile.startWrite();
                qr.l(obtain, fileOutputStream);
                atomicFile.finishWrite(fileOutputStream);
            } catch (Exception e) {
                e.printStackTrace();
                atomicFile.failWrite(fileOutputStream);
            }
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "SharedUserSetting{" + Integer.toHexString(System.identityHashCode(this)) + " " + this.m + "/" + this.n + "}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.m);
        parcel.writeInt(this.n);
        parcel.writeInt(this.o);
    }

    public eu0(Parcel parcel) {
        this.m = parcel.readString();
        this.n = parcel.readInt();
    }
}
