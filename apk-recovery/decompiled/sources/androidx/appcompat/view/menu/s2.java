package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import java.security.MessageDigest;
/* loaded from: classes.dex */
public class s2 {
    public String a = "";
    public boolean b = false;
    public int c = 0;
    public String d = "";
    public String e = "";

    public static s2 a(Context context, String str) {
        s2 s2Var = new s2();
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 64);
            s2Var.c = packageInfo.versionCode;
            String str2 = packageInfo.versionName;
            if (str2 == null) {
                str2 = "";
            }
            s2Var.d = str2;
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            s2Var.a = applicationInfo.sourceDir;
            s2Var.b = (applicationInfo.flags & 2) != 0;
            Signature[] signatureArr = packageInfo.signatures;
            if (signatureArr != null && signatureArr.length > 0) {
                byte[] digest = MessageDigest.getInstance("SHA-256").digest(signatureArr[0].toByteArray());
                StringBuilder sb = new StringBuilder();
                int length = digest.length;
                for (int i = 0; i < length; i++) {
                    sb.append(String.format("%02x", Byte.valueOf(digest[i])));
                }
                s2Var.e = sb.toString();
            }
        } catch (Exception unused) {
        }
        return s2Var;
    }

    public byte[] b() {
        byte[] bytes = this.a.getBytes();
        byte[] bytes2 = this.d.getBytes();
        byte[] bytes3 = this.e.getBytes();
        byte[] bArr = new byte[bytes.length + 7 + bytes2.length + 1 + bytes3.length];
        bArr[0] = this.b ? (byte) 1 : (byte) 0;
        bArr[1] = (byte) (bytes.length & 255);
        System.arraycopy(bytes, 0, bArr, 2, bytes.length);
        int length = bytes.length;
        c(bArr, 2 + length, this.c);
        int i = length + 6;
        int i2 = length + 7;
        bArr[i] = (byte) (bytes2.length & 255);
        System.arraycopy(bytes2, 0, bArr, i2, bytes2.length);
        int length2 = i2 + bytes2.length;
        bArr[length2] = (byte) (bytes3.length & 255);
        System.arraycopy(bytes3, 0, bArr, length2 + 1, bytes3.length);
        return bArr;
    }

    public final void c(byte[] bArr, int i, int i2) {
        bArr[i] = (byte) i2;
        bArr[i + 1] = (byte) (i2 >> 8);
        bArr[i + 2] = (byte) (i2 >> 16);
        bArr[i + 3] = (byte) (i2 >> 24);
    }
}
