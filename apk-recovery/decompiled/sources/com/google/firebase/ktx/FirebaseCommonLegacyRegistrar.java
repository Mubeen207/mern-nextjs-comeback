package com.google.firebase.ktx;

import androidx.annotation.Keep;
import androidx.appcompat.view.menu.rc;
import androidx.appcompat.view.menu.ud;
import androidx.appcompat.view.menu.y80;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
@Keep
/* loaded from: classes.dex */
public final class FirebaseCommonLegacyRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<ud> getComponents() {
        List<ud> b;
        b = rc.b(y80.b("fire-core-ktx", "20.4.2"));
        return b;
    }
}
