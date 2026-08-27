package com.google.firebase.analytics.connector.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import androidx.appcompat.view.menu.a2;
import androidx.appcompat.view.menu.de;
import androidx.appcompat.view.menu.ey0;
import androidx.appcompat.view.menu.il;
import androidx.appcompat.view.menu.tr;
import androidx.appcompat.view.menu.ud;
import androidx.appcompat.view.menu.y80;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
@Keep
/* loaded from: classes.dex */
public class AnalyticsConnectorRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    @SuppressLint({"MissingPermission"})
    public List<ud> getComponents() {
        return Arrays.asList(ud.e(a2.class).b(il.j(tr.class)).b(il.j(Context.class)).b(il.j(ey0.class)).f(new de() { // from class: androidx.appcompat.view.menu.jk1
            @Override // androidx.appcompat.view.menu.de
            public final Object a(xd xdVar) {
                a2 c;
                c = b2.c((tr) xdVar.a(tr.class), (Context) xdVar.a(Context.class), (ey0) xdVar.a(ey0.class));
                return c;
            }
        }).e().d(), y80.b("fire-analytics", "21.5.0"));
    }
}
