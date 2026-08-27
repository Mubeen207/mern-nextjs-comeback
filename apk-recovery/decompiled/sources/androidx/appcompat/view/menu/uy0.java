package androidx.appcompat.view.menu;

import java.util.HashMap;
/* loaded from: classes.dex */
public class uy0 {
    public final f8 a;

    public uy0(si siVar) {
        this.a = new f8(siVar, "flutter/system", p60.a);
    }

    public void a() {
        ha0.f("SystemChannel", "Sending memory pressure warning to Flutter.");
        HashMap hashMap = new HashMap(1);
        hashMap.put("type", "memoryPressure");
        this.a.c(hashMap);
    }
}
