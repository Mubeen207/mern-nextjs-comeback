package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;
/* loaded from: classes.dex */
public final class c implements DynamiteModule.b {
    @Override // com.google.android.gms.dynamite.DynamiteModule.b
    public final DynamiteModule.b.C0058b a(Context context, String str, DynamiteModule.b.a aVar) {
        DynamiteModule.b.C0058b c0058b = new DynamiteModule.b.C0058b();
        int a = aVar.a(context, str);
        c0058b.a = a;
        if (a != 0) {
            c0058b.c = -1;
        } else {
            int b = aVar.b(context, str, true);
            c0058b.b = b;
            if (b != 0) {
                c0058b.c = 1;
            }
        }
        return c0058b;
    }
}
