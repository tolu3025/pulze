package io.flutter.plugins.firebase.auth;

import O0.h;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Collections;
import java.util.List;
import r0.C1200c;

/* JADX INFO: loaded from: classes.dex */
public class FlutterFirebaseAuthRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C1200c> getComponents() {
        return Collections.singletonList(h.b("flutter-fire-auth", "6.4.0"));
    }
}
