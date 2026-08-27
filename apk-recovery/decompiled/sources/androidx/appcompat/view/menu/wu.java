package androidx.appcompat.view.menu;

import android.content.ContentProviderClient;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.RemoteException;
import androidx.appcompat.view.menu.bv;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/* loaded from: classes.dex */
public abstract class wu {
    public static final Comparator a = new Comparator() { // from class: androidx.appcompat.view.menu.vu
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int g;
            g = wu.g((byte[]) obj, (byte[]) obj2);
            return g;
        }
    };

    /* loaded from: classes.dex */
    public interface a {
        static a a(Context context, Uri uri) {
            return new b(context, uri);
        }

        Cursor b(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal);

        void close();
    }

    /* loaded from: classes.dex */
    public static class b implements a {
        public final ContentProviderClient a;

        public b(Context context, Uri uri) {
            this.a = context.getContentResolver().acquireUnstableContentProviderClient(uri);
        }

        @Override // androidx.appcompat.view.menu.wu.a
        public Cursor b(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal) {
            ContentProviderClient contentProviderClient = this.a;
            if (contentProviderClient == null) {
                return null;
            }
            try {
                return contentProviderClient.query(uri, strArr, str, strArr2, str2, cancellationSignal);
            } catch (RemoteException unused) {
                return null;
            }
        }

        @Override // androidx.appcompat.view.menu.wu.a
        public void close() {
            ContentProviderClient contentProviderClient = this.a;
            if (contentProviderClient != null) {
                contentProviderClient.close();
            }
        }
    }

    public static List b(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            arrayList.add(signature.toByteArray());
        }
        return arrayList;
    }

    public static boolean c(List list, List list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!Arrays.equals((byte[]) list.get(i), (byte[]) list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    public static List d(xu xuVar, Resources resources) {
        return xuVar.b() != null ? xuVar.b() : av.c(resources, xuVar.c());
    }

    public static bv.a e(Context context, xu xuVar, CancellationSignal cancellationSignal) {
        ProviderInfo f = f(context.getPackageManager(), xuVar, context.getResources());
        return f == null ? bv.a.a(1, null) : bv.a.a(0, h(context, xuVar, f.authority, cancellationSignal));
    }

    public static ProviderInfo f(PackageManager packageManager, xu xuVar, Resources resources) {
        String e = xuVar.e();
        ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(e, 0);
        if (resolveContentProvider == null) {
            throw new PackageManager.NameNotFoundException("No package found for authority: " + e);
        } else if (!resolveContentProvider.packageName.equals(xuVar.f())) {
            throw new PackageManager.NameNotFoundException("Found content provider " + e + ", but package was not " + xuVar.f());
        } else {
            List b2 = b(packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures);
            Collections.sort(b2, a);
            List d = d(xuVar, resources);
            for (int i = 0; i < d.size(); i++) {
                ArrayList arrayList = new ArrayList((Collection) d.get(i));
                Collections.sort(arrayList, a);
                if (c(b2, arrayList)) {
                    return resolveContentProvider;
                }
            }
            return null;
        }
    }

    public static /* synthetic */ int g(byte[] bArr, byte[] bArr2) {
        if (bArr.length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        for (int i = 0; i < bArr.length; i++) {
            byte b2 = bArr[i];
            byte b3 = bArr2[i];
            if (b2 != b3) {
                return b2 - b3;
            }
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static androidx.appcompat.view.menu.bv.b[] h(android.content.Context r21, androidx.appcompat.view.menu.xu r22, java.lang.String r23, android.os.CancellationSignal r24) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.wu.h(android.content.Context, androidx.appcompat.view.menu.xu, java.lang.String, android.os.CancellationSignal):androidx.appcompat.view.menu.bv$b[]");
    }
}
