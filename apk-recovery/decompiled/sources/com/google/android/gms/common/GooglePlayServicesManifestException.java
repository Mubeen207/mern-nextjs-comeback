package com.google.android.gms.common;

import com.google.android.gms.common.annotation.KeepName;
@KeepName
/* loaded from: classes.dex */
public abstract class GooglePlayServicesManifestException extends IllegalStateException {
    public final int m;

    public GooglePlayServicesManifestException(int i, String str) {
        super(str);
        this.m = i;
    }
}
