package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;
/* loaded from: classes.dex */
public final class h implements DynamiteModule.b {
    @Override // com.google.android.gms.dynamite.DynamiteModule.b
    public final DynamiteModule.b.C0058b a(Context context, String str, DynamiteModule.b.a aVar) {
        int b;
        DynamiteModule.b.C0058b c0058b = new DynamiteModule.b.C0058b();
        int a = aVar.a(context, str);
        c0058b.a = a;
        int i = 0;
        if (a != 0) {
            b = aVar.b(context, str, false);
            c0058b.b = b;
        } else {
            b = aVar.b(context, str, true);
            c0058b.b = b;
        }
        int i2 = c0058b.a;
        if (i2 != 0) {
            i = i2;
        } else if (b == 0) {
            c0058b.c = 0;
            return c0058b;
        }
        if (b >= i) {
            c0058b.c = 1;
        } else {
            c0058b.c = -1;
        }
        return c0058b;
    }
}
