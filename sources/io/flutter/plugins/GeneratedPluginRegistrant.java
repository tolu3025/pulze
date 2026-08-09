package io.flutter.plugins;

import b1.AbstractC0525b;
import io.flutter.embedding.engine.a;
import io.flutter.plugins.firebase.core.j;
import io.flutter.plugins.imagepicker.ImagePickerPlugin;
import p1.C1111v;
import q1.C1192y;
import t1.G;
import u1.C1251a;
import w1.D;

/* JADX INFO: loaded from: classes.dex */
public final class GeneratedPluginRegistrant {
    private static final String TAG = "GeneratedPluginRegistrant";

    public static void registerWith(a aVar) {
        try {
            aVar.r().c(new C1192y());
        } catch (Exception e3) {
            AbstractC0525b.c(TAG, "Error registering plugin cloud_firestore, io.flutter.plugins.firebase.firestore.FlutterFirebaseFirestorePlugin", e3);
        }
        try {
            aVar.r().c(new C1111v());
        } catch (Exception e4) {
            AbstractC0525b.c(TAG, "Error registering plugin firebase_auth, io.flutter.plugins.firebase.auth.FlutterFirebaseAuthPlugin", e4);
        }
        try {
            aVar.r().c(new j());
        } catch (Exception e5) {
            AbstractC0525b.c(TAG, "Error registering plugin firebase_core, io.flutter.plugins.firebase.core.FlutterFirebaseCorePlugin", e5);
        }
        try {
            aVar.r().c(new G());
        } catch (Exception e6) {
            AbstractC0525b.c(TAG, "Error registering plugin firebase_storage, io.flutter.plugins.firebase.storage.FlutterFirebaseStoragePlugin", e6);
        }
        try {
            aVar.r().c(new C1251a());
        } catch (Exception e7) {
            AbstractC0525b.c(TAG, "Error registering plugin flutter_plugin_android_lifecycle, io.flutter.plugins.flutter_plugin_android_lifecycle.FlutterAndroidLifecyclePlugin", e7);
        }
        try {
            aVar.r().c(new ImagePickerPlugin());
        } catch (Exception e8) {
            AbstractC0525b.c(TAG, "Error registering plugin image_picker_android, io.flutter.plugins.imagepicker.ImagePickerPlugin", e8);
        }
        try {
            aVar.r().c(new v1.j());
        } catch (Exception e9) {
            AbstractC0525b.c(TAG, "Error registering plugin path_provider_android, io.flutter.plugins.pathprovider.PathProviderPlugin", e9);
        }
        try {
            aVar.r().c(new D());
        } catch (Exception e10) {
            AbstractC0525b.c(TAG, "Error registering plugin shared_preferences_android, io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin", e10);
        }
    }
}
