package androidx.appcompat.view.menu;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public abstract class c implements Parcelable {
    public final Parcelable m;
    public static final c n = new a();
    public static final Parcelable.Creator<c> CREATOR = new b();

    /* loaded from: classes.dex */
    public class a extends c {
        public a() {
            super((a) null);
        }
    }

    /* loaded from: classes.dex */
    public class b implements Parcelable.ClassLoaderCreator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public c createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, null);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        /* renamed from: b */
        public c createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return c.n;
            }
            throw new IllegalStateException("superState must be null");
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: c */
        public c[] newArray(int i) {
            return new c[i];
        }
    }

    public /* synthetic */ c(a aVar) {
        this();
    }

    public final Parcelable a() {
        return this.m;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.m, i);
    }

    public c() {
        this.m = null;
    }

    public c(Parcelable parcelable) {
        if (parcelable == null) {
            throw new IllegalArgumentException("superState must not be null");
        }
        this.m = parcelable == n ? null : parcelable;
    }

    public c(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.m = readParcelable == null ? n : readParcelable;
    }
}
