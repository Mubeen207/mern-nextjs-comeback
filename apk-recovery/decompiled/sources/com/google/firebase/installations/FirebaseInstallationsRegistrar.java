package com.google.firebase.installations;

import androidx.annotation.Keep;
import androidx.appcompat.view.menu.cz;
import androidx.appcompat.view.menu.de;
import androidx.appcompat.view.menu.dz;
import androidx.appcompat.view.menu.fs;
import androidx.appcompat.view.menu.gs;
import androidx.appcompat.view.menu.il;
import androidx.appcompat.view.menu.k8;
import androidx.appcompat.view.menu.tr;
import androidx.appcompat.view.menu.u7;
import androidx.appcompat.view.menu.ud;
import androidx.appcompat.view.menu.xd;
import androidx.appcompat.view.menu.xl0;
import androidx.appcompat.view.menu.y80;
import androidx.appcompat.view.menu.zr;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
@Keep
/* loaded from: classes.dex */
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ gs lambda$getComponents$0(xd xdVar) {
        return new fs((tr) xdVar.a(tr.class), xdVar.d(dz.class), (ExecutorService) xdVar.e(xl0.a(u7.class, ExecutorService.class)), zr.a((Executor) xdVar.e(xl0.a(k8.class, Executor.class))));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<ud> getComponents() {
        return Arrays.asList(ud.e(gs.class).h(LIBRARY_NAME).b(il.j(tr.class)).b(il.h(dz.class)).b(il.i(xl0.a(u7.class, ExecutorService.class))).b(il.i(xl0.a(k8.class, Executor.class))).f(new de() { // from class: androidx.appcompat.view.menu.is
            @Override // androidx.appcompat.view.menu.de
            public final Object a(xd xdVar) {
                gs lambda$getComponents$0;
                lambda$getComponents$0 = FirebaseInstallationsRegistrar.lambda$getComponents$0(xdVar);
                return lambda$getComponents$0;
            }
        }).d(), cz.a(), y80.b(LIBRARY_NAME, "17.2.0"));
    }
}
