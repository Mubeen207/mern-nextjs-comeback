package com.google.firebase.messaging;

import androidx.annotation.Keep;
import androidx.appcompat.view.menu.de;
import androidx.appcompat.view.menu.ey0;
import androidx.appcompat.view.menu.ez;
import androidx.appcompat.view.menu.gs;
import androidx.appcompat.view.menu.h21;
import androidx.appcompat.view.menu.il;
import androidx.appcompat.view.menu.js;
import androidx.appcompat.view.menu.my0;
import androidx.appcompat.view.menu.o41;
import androidx.appcompat.view.menu.tr;
import androidx.appcompat.view.menu.ud;
import androidx.appcompat.view.menu.xd;
import androidx.appcompat.view.menu.y80;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.FirebaseMessagingRegistrar;
import java.util.Arrays;
import java.util.List;
@Keep
/* loaded from: classes.dex */
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ FirebaseMessaging lambda$getComponents$0(xd xdVar) {
        tr trVar = (tr) xdVar.a(tr.class);
        my0.a(xdVar.a(js.class));
        return new FirebaseMessaging(trVar, null, xdVar.d(o41.class), xdVar.d(ez.class), (gs) xdVar.a(gs.class), (h21) xdVar.a(h21.class), (ey0) xdVar.a(ey0.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<ud> getComponents() {
        return Arrays.asList(ud.e(FirebaseMessaging.class).h(LIBRARY_NAME).b(il.j(tr.class)).b(il.g(js.class)).b(il.h(o41.class)).b(il.h(ez.class)).b(il.g(h21.class)).b(il.j(gs.class)).b(il.j(ey0.class)).f(new de() { // from class: androidx.appcompat.view.menu.ss
            @Override // androidx.appcompat.view.menu.de
            public final Object a(xd xdVar) {
                FirebaseMessaging lambda$getComponents$0;
                lambda$getComponents$0 = FirebaseMessagingRegistrar.lambda$getComponents$0(xdVar);
                return lambda$getComponents$0;
            }
        }).c().d(), y80.b(LIBRARY_NAME, "23.4.0"));
    }
}
