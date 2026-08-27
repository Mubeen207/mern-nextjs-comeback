package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ServiceInfo;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
/* loaded from: classes.dex */
public class ko0 {
    public XmlResourceParser a(Context context, ServiceInfo serviceInfo, String str) {
        int i;
        Bundle bundle = serviceInfo.metaData;
        if (bundle != null && (i = bundle.getInt(str)) != 0) {
            try {
                Resources b = b(context, serviceInfo.applicationInfo);
                if (b == null) {
                    return null;
                }
                return b.getXml(i);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public Resources b(Context context, ApplicationInfo applicationInfo) {
        return ch0.k(context, applicationInfo);
    }
}
