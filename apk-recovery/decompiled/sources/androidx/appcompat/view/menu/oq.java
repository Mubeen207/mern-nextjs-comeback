package androidx.appcompat.view.menu;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import androidx.appcompat.view.menu.uu;
import androidx.appcompat.view.menu.xy;
import androidx.window.extensions.layout.FoldingFeature;
import androidx.window.extensions.layout.WindowLayoutInfo;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class oq {
    public static final oq a = new oq();

    public final uu a(ea1 ea1Var, FoldingFeature foldingFeature) {
        xy.b a2;
        uu.b bVar;
        c60.e(ea1Var, "windowMetrics");
        c60.e(foldingFeature, "oemFeature");
        int type = foldingFeature.getType();
        if (type == 1) {
            a2 = xy.b.b.a();
        } else if (type != 2) {
            return null;
        } else {
            a2 = xy.b.b.b();
        }
        int state = foldingFeature.getState();
        if (state == 1) {
            bVar = uu.b.c;
        } else if (state != 2) {
            return null;
        } else {
            bVar = uu.b.d;
        }
        Rect bounds = foldingFeature.getBounds();
        c60.d(bounds, "oemFeature.bounds");
        if (d(ea1Var, new q8(bounds))) {
            Rect bounds2 = foldingFeature.getBounds();
            c60.d(bounds2, "oemFeature.bounds");
            return new xy(new q8(bounds2), a2, bVar);
        }
        return null;
    }

    public final ba1 b(Context context, WindowLayoutInfo windowLayoutInfo) {
        c60.e(context, "context");
        c60.e(windowLayoutInfo, "info");
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            return c(ga1.b.d(context), windowLayoutInfo);
        }
        if (i < 29 || !(context instanceof Activity)) {
            throw new UnsupportedOperationException("Display Features are only supported after Q. Display features for non-Activity contexts are not expected to be reported on devices running Q.");
        }
        return c(ga1.b.c((Activity) context), windowLayoutInfo);
    }

    public final ba1 c(ea1 ea1Var, WindowLayoutInfo windowLayoutInfo) {
        uu uuVar;
        c60.e(ea1Var, "windowMetrics");
        c60.e(windowLayoutInfo, "info");
        List<FoldingFeature> displayFeatures = windowLayoutInfo.getDisplayFeatures();
        c60.d(displayFeatures, "info.displayFeatures");
        ArrayList arrayList = new ArrayList();
        for (FoldingFeature foldingFeature : displayFeatures) {
            if (foldingFeature instanceof FoldingFeature) {
                oq oqVar = a;
                c60.d(foldingFeature, "feature");
                uuVar = oqVar.a(ea1Var, foldingFeature);
            } else {
                uuVar = null;
            }
            if (uuVar != null) {
                arrayList.add(uuVar);
            }
        }
        return new ba1(arrayList);
    }

    public final boolean d(ea1 ea1Var, q8 q8Var) {
        Rect a2 = ea1Var.a();
        if (q8Var.e()) {
            return false;
        }
        if (q8Var.d() == a2.width() || q8Var.a() == a2.height()) {
            if (q8Var.d() >= a2.width() || q8Var.a() >= a2.height()) {
                return (q8Var.d() == a2.width() && q8Var.a() == a2.height()) ? false : true;
            }
            return false;
        }
        return false;
    }
}
