package androidx.appcompat.view.menu;

import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
/* loaded from: classes.dex */
public interface ie {
    public static final ie a = new ie() { // from class: androidx.appcompat.view.menu.he
        @Override // androidx.appcompat.view.menu.ie
        public final List a(ComponentRegistrar componentRegistrar) {
            return componentRegistrar.getComponents();
        }
    };

    List a(ComponentRegistrar componentRegistrar);
}
