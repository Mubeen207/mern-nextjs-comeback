package androidx.appcompat.view.menu;

import io.flutter.plugins.GeneratedPluginRegistrant;
/* loaded from: classes.dex */
public abstract class ox {
    public static void a(io.flutter.embedding.engine.a aVar) {
        try {
            GeneratedPluginRegistrant.class.getDeclaredMethod("registerWith", io.flutter.embedding.engine.a.class).invoke(null, aVar);
        } catch (Exception e) {
            ha0.b("GeneratedPluginsRegister", "Tried to automatically register plugins with FlutterEngine (" + aVar + ") but could not find or invoke the GeneratedPluginRegistrant.");
            ha0.c("GeneratedPluginsRegister", "Received exception while registering", e);
        }
    }
}
