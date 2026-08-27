package androidx.appcompat.view.menu;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
/* loaded from: classes.dex */
public class l51 extends k51 {
    public final SparseIntArray d;
    public final Parcel e;
    public final int f;
    public final int g;
    public final String h;
    public int i;
    public int j;
    public int k;

    public l51(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new o4(), new o4(), new o4());
    }

    @Override // androidx.appcompat.view.menu.k51
    public void A(byte[] bArr) {
        if (bArr == null) {
            this.e.writeInt(-1);
            return;
        }
        this.e.writeInt(bArr.length);
        this.e.writeByteArray(bArr);
    }

    @Override // androidx.appcompat.view.menu.k51
    public void C(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.e, 0);
    }

    @Override // androidx.appcompat.view.menu.k51
    public void E(int i) {
        this.e.writeInt(i);
    }

    @Override // androidx.appcompat.view.menu.k51
    public void G(Parcelable parcelable) {
        this.e.writeParcelable(parcelable, 0);
    }

    @Override // androidx.appcompat.view.menu.k51
    public void I(String str) {
        this.e.writeString(str);
    }

    @Override // androidx.appcompat.view.menu.k51
    public void a() {
        int i = this.i;
        if (i >= 0) {
            int i2 = this.d.get(i);
            int dataPosition = this.e.dataPosition();
            this.e.setDataPosition(i2);
            this.e.writeInt(dataPosition - i2);
            this.e.setDataPosition(dataPosition);
        }
    }

    @Override // androidx.appcompat.view.menu.k51
    public k51 b() {
        Parcel parcel = this.e;
        int dataPosition = parcel.dataPosition();
        int i = this.j;
        if (i == this.f) {
            i = this.g;
        }
        int i2 = i;
        return new l51(parcel, dataPosition, i2, this.h + "  ", this.a, this.b, this.c);
    }

    @Override // androidx.appcompat.view.menu.k51
    public boolean g() {
        return this.e.readInt() != 0;
    }

    @Override // androidx.appcompat.view.menu.k51
    public byte[] i() {
        int readInt = this.e.readInt();
        if (readInt < 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        this.e.readByteArray(bArr);
        return bArr;
    }

    @Override // androidx.appcompat.view.menu.k51
    public CharSequence k() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.e);
    }

    @Override // androidx.appcompat.view.menu.k51
    public boolean m(int i) {
        while (this.j < this.g) {
            int i2 = this.k;
            if (i2 == i) {
                return true;
            }
            if (String.valueOf(i2).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            this.e.setDataPosition(this.j);
            int readInt = this.e.readInt();
            this.k = this.e.readInt();
            this.j += readInt;
        }
        return this.k == i;
    }

    @Override // androidx.appcompat.view.menu.k51
    public int o() {
        return this.e.readInt();
    }

    @Override // androidx.appcompat.view.menu.k51
    public Parcelable q() {
        return this.e.readParcelable(getClass().getClassLoader());
    }

    @Override // androidx.appcompat.view.menu.k51
    public String s() {
        return this.e.readString();
    }

    @Override // androidx.appcompat.view.menu.k51
    public void w(int i) {
        a();
        this.i = i;
        this.d.put(i, this.e.dataPosition());
        E(0);
        E(i);
    }

    @Override // androidx.appcompat.view.menu.k51
    public void y(boolean z) {
        this.e.writeInt(z ? 1 : 0);
    }

    public l51(Parcel parcel, int i, int i2, String str, o4 o4Var, o4 o4Var2, o4 o4Var3) {
        super(o4Var, o4Var2, o4Var3);
        this.d = new SparseIntArray();
        this.i = -1;
        this.k = -1;
        this.e = parcel;
        this.f = i;
        this.g = i2;
        this.j = i;
        this.h = str;
    }
}
