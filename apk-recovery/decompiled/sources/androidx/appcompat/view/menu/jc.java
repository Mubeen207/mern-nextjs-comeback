package androidx.appcompat.view.menu;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class jc extends r {
    public static final Parcelable.Creator<jc> CREATOR = new vh1();
    public final Intent m;

    public jc(Intent intent) {
        this.m = intent;
    }

    public Intent d() {
        return this.m;
    }

    public String f() {
        String stringExtra = this.m.getStringExtra("google.message_id");
        return stringExtra == null ? this.m.getStringExtra("message_id") : stringExtra;
    }

    public final Integer i() {
        if (this.m.hasExtra("google.product_id")) {
            return Integer.valueOf(this.m.getIntExtra("google.product_id", 0));
        }
        return null;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int a = mr0.a(parcel);
        mr0.m(parcel, 1, this.m, i, false);
        mr0.b(parcel, a);
    }
}
