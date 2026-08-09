package io.flutter.plugins.firebase.storage;

import J1.AbstractC0411o;
import O0.h;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import r0.C1200c;

/* JADX INFO: loaded from: classes.dex */
public final class FlutterFirebaseAppRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C1200c> getComponents() {
        return AbstractC0411o.d(h.b("flutter-fire-gcs", "13.3.0"));
    }
}
