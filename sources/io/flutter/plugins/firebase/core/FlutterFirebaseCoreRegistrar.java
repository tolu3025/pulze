package io.flutter.plugins.firebase.core;

import com.google.firebase.components.ComponentRegistrar;
import java.util.Collections;
import java.util.List;
import r0.C1200c;

/* JADX INFO: loaded from: classes.dex */
public class FlutterFirebaseCoreRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C1200c> getComponents() {
        return Collections.singletonList(O0.h.b("flutter-fire-core", "4.7.0"));
    }
}
