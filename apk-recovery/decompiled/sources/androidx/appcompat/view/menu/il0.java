package androidx.appcompat.view.menu;

import android.content.pm.ProviderInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public abstract class il0 {
    public static List a;

    static {
        ArrayList arrayList = new ArrayList();
        a = arrayList;
        arrayList.add("io.adjoe.sdk.internal.SharedPreferencesProvider");
        a.add("io.adjoe.sdk.internal.DatabaseContentProvider");
        a.add("com.miniclip.madsandroidsdk.utils.MAdsContentProvider");
        a.add("io.bidmachine.BidMachineInitProvider");
        a.add("com.google.android.gms.ads.MobileAdsInitProvider");
        a.add("com.vungle.ads.VungleProvider");
        a.add("com.ironsource.lifecycle.IronsourceLifecycleProvider");
        a.add("com.ironsource.lifecycle.LevelPlayActivityLifecycleProvider");
        a.add("com.squareup.picasso.PicassoProvider");
        a.add("com.applovin.sdk.AppLovinInitProvider");
        a.add("com.mobilefuse.sdk.MobileFuseSdkInitProvider");
        a.add("com.smaato.sdk.core.lifecycle.ProcessLifecycleOwnerInitialize");
        a.add("com.smaato.sdk.core.lifecycle.ProcessLifecycleOwnerInitializer");
        a.add("com.facebook.ads.AudienceNetworkContentProvider");
        a.add("com.miniclip.madsandroidsdk.config.MAdsContentProvider");
    }

    public static int a(List list) {
        int i = 0;
        if (list != null && !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (b((ProviderInfo) it.next())) {
                    it.remove();
                    i++;
                }
            }
        }
        return i;
    }

    public static boolean b(ProviderInfo providerInfo) {
        return a.contains(providerInfo.name);
    }
}
