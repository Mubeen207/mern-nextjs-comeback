package com.google.firebase.datatransport;

import android.content.Context;
import androidx.annotation.Keep;
import androidx.appcompat.view.menu.de;
import androidx.appcompat.view.menu.h21;
import androidx.appcompat.view.menu.h9;
import androidx.appcompat.view.menu.il;
import androidx.appcompat.view.menu.n21;
import androidx.appcompat.view.menu.ud;
import androidx.appcompat.view.menu.xd;
import androidx.appcompat.view.menu.y80;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.datatransport.TransportRegistrar;
import java.util.Arrays;
import java.util.List;
@Keep
/* loaded from: classes.dex */
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ h21 lambda$getComponents$0(xd xdVar) {
        n21.f((Context) xdVar.a(Context.class));
        return n21.c().g(h9.h);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<ud> getComponents() {
        return Arrays.asList(ud.e(h21.class).h(LIBRARY_NAME).b(il.j(Context.class)).f(new de() { // from class: androidx.appcompat.view.menu.m21
            @Override // androidx.appcompat.view.menu.de
            public final Object a(xd xdVar) {
                h21 lambda$getComponents$0;
                lambda$getComponents$0 = TransportRegistrar.lambda$getComponents$0(xdVar);
                return lambda$getComponents$0;
            }
        }).d(), y80.b(LIBRARY_NAME, "18.1.7"));
    }
}
