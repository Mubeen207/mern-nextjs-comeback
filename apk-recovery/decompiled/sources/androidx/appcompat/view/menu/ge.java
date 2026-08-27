package androidx.appcompat.view.menu;

import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class ge implements ie {
    public static /* synthetic */ Object c(String str, ud udVar, xd xdVar) {
        try {
            us.b(str);
            return udVar.h().a(xdVar);
        } finally {
            us.a();
        }
    }

    @Override // androidx.appcompat.view.menu.ie
    public List a(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (final ud udVar : componentRegistrar.getComponents()) {
            final String i = udVar.i();
            if (i != null) {
                udVar = udVar.t(new de() { // from class: androidx.appcompat.view.menu.fe
                    @Override // androidx.appcompat.view.menu.de
                    public final Object a(xd xdVar) {
                        Object c;
                        c = ge.c(i, udVar, xdVar);
                        return c;
                    }
                });
            }
            arrayList.add(udVar);
        }
        return arrayList;
    }
}
