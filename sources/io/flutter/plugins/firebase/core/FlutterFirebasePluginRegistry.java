package io.flutter.plugins.firebase.core;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import k0.C0992f;

/* JADX INFO: loaded from: classes.dex */
public class FlutterFirebasePluginRegistry {
    private static final Map<String, FlutterFirebasePlugin> registeredPlugins = new WeakHashMap();

    static Task<Void> didReinitializeFirebaseCore() {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.core.k
            @Override // java.lang.Runnable
            public final void run() {
                FlutterFirebasePluginRegistry.lambda$didReinitializeFirebaseCore$1(taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    static Task<Map<String, Object>> getPluginConstantsForFirebaseApp(final C0992f c0992f) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.core.l
            @Override // java.lang.Runnable
            public final void run() {
                FlutterFirebasePluginRegistry.lambda$getPluginConstantsForFirebaseApp$0(c0992f, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$didReinitializeFirebaseCore$1(TaskCompletionSource taskCompletionSource) {
        try {
            Iterator<Map.Entry<String, FlutterFirebasePlugin>> it = registeredPlugins.entrySet().iterator();
            while (it.hasNext()) {
                Tasks.await(it.next().getValue().didReinitializeFirebaseCore());
            }
            taskCompletionSource.setResult(null);
        } catch (Exception e3) {
            taskCompletionSource.setException(e3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$getPluginConstantsForFirebaseApp$0(C0992f c0992f, TaskCompletionSource taskCompletionSource) {
        try {
            Map<String, FlutterFirebasePlugin> map = registeredPlugins;
            HashMap map2 = new HashMap(map.size());
            for (Map.Entry<String, FlutterFirebasePlugin> entry : map.entrySet()) {
                map2.put(entry.getKey(), Tasks.await(entry.getValue().getPluginConstantsForFirebaseApp(c0992f)));
            }
            taskCompletionSource.setResult(map2);
        } catch (Exception e3) {
            taskCompletionSource.setException(e3);
        }
    }

    public static void registerPlugin(String str, FlutterFirebasePlugin flutterFirebasePlugin) {
        registeredPlugins.put(str, flutterFirebasePlugin);
    }
}
