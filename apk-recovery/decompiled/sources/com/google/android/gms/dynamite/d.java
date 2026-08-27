package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;
/* loaded from: classes.dex */
public final class d implements DynamiteModule.b {
    @Override // com.google.android.gms.dynamite.DynamiteModule.b
    public final DynamiteModule.b.C0058b a(Context context, String str, DynamiteModule.b.a aVar) {
        DynamiteModule.b.C0058b c0058b = new DynamiteModule.b.C0058b();
        int b = aVar.b(context, str, false);
        c0058b.b = b;
        if (b == 0) {
            c0058b.c = 0;
        } else {
            c0058b.c = 1;
        }
        return c0058b;
    }
}
