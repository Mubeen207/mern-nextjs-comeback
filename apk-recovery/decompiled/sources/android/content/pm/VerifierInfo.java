package android.content.pm;

import android.os.Parcel;
import android.os.Parcelable;
import java.security.PublicKey;
/* loaded from: classes.dex */
public class VerifierInfo implements Parcelable {
    public static final Parcelable.Creator<VerifierInfo> CREATOR = new Parcelable.Creator<VerifierInfo>() { // from class: android.content.pm.VerifierInfo.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public VerifierInfo createFromParcel(Parcel parcel) {
            return new VerifierInfo(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public VerifierInfo[] newArray(int i) {
            return new VerifierInfo[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        throw new RuntimeException("Stub!");
    }

    public VerifierInfo(String str, PublicKey publicKey) {
        throw new RuntimeException("Stub!");
    }

    private VerifierInfo(Parcel parcel) {
        throw new RuntimeException("Stub!");
    }
}
