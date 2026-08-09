package io.flutter.plugins.firebase.firestore;

import O0.h;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Collections;
import java.util.List;
import r0.C1200c;

/* JADX INFO: loaded from: classes.dex */
public class FlutterFirebaseFirestoreRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C1200c> getComponents() {
        return Collections.singletonList(h.b("flutter-fire-fst", "6.3.0"));
    }
}
