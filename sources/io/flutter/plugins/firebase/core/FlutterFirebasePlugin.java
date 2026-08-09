package io.flutter.plugins.firebase.core;

import com.google.android.gms.tasks.Task;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import k0.C0992f;

/* JADX INFO: loaded from: classes.dex */
public interface FlutterFirebasePlugin {
    public static final ExecutorService cachedThreadPool = Executors.newCachedThreadPool();

    Task<Void> didReinitializeFirebaseCore();

    Task<Map<String, Object>> getPluginConstantsForFirebaseApp(C0992f c0992f);
}
