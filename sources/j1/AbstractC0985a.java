package j1;

import b1.AbstractC0525b;
import io.flutter.plugins.GeneratedPluginRegistrant;

/* JADX INFO: renamed from: j1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0985a {
    public static void a(io.flutter.embedding.engine.a aVar) {
        try {
            GeneratedPluginRegistrant.class.getDeclaredMethod("registerWith", io.flutter.embedding.engine.a.class).invoke(null, aVar);
        } catch (Exception e3) {
            AbstractC0525b.b("GeneratedPluginsRegister", "Tried to automatically register plugins with FlutterEngine (" + aVar + ") but could not find or invoke the GeneratedPluginRegistrant.");
            AbstractC0525b.c("GeneratedPluginsRegister", "Received exception while registering", e3);
        }
    }
}
