package com.google.android.datatransport.cct;

import androidx.annotation.Keep;
import androidx.appcompat.view.menu.di;
import androidx.appcompat.view.menu.f21;
import androidx.appcompat.view.menu.na;
import androidx.appcompat.view.menu.q7;
@Keep
/* loaded from: classes.dex */
public class CctBackendFactory implements q7 {
    @Override // androidx.appcompat.view.menu.q7
    public f21 create(di diVar) {
        return new na(diVar.b(), diVar.e(), diVar.d());
    }
}
