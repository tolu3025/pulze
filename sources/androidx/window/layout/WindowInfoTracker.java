package androidx.window.layout;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import androidx.window.extensions.WindowExtensionsProvider;
import androidx.window.extensions.layout.WindowLayoutComponent;
import kotlin.jvm.internal.z;

/* JADX INFO: loaded from: classes.dex */
public interface WindowInfoTracker {
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Companion {
        private static final boolean DEBUG = false;
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final String TAG = z.b(WindowInfoTracker.class).b();
        private static WindowInfoTrackerDecorator decorator = EmptyDecorator.INSTANCE;

        private Companion() {
        }

        public final WindowInfoTracker getOrCreate(Context context) {
            kotlin.jvm.internal.m.e(context, "context");
            return decorator.decorate(new WindowInfoTrackerImpl(WindowMetricsCalculatorCompat.INSTANCE, windowBackend$window_release(context)));
        }

        public final void overrideDecorator(WindowInfoTrackerDecorator overridingDecorator) {
            kotlin.jvm.internal.m.e(overridingDecorator, "overridingDecorator");
            decorator = overridingDecorator;
        }

        public final void reset() {
            decorator = EmptyDecorator.INSTANCE;
        }

        public final WindowBackend windowBackend$window_release(Context context) {
            kotlin.jvm.internal.m.e(context, "context");
            ExtensionWindowLayoutInfoBackend extensionWindowLayoutInfoBackend = null;
            try {
                WindowLayoutComponent windowLayoutComponent = WindowExtensionsProvider.getWindowExtensions().getWindowLayoutComponent();
                if (windowLayoutComponent != null) {
                    extensionWindowLayoutInfoBackend = new ExtensionWindowLayoutInfoBackend(windowLayoutComponent);
                }
            } catch (Throwable unused) {
                if (DEBUG) {
                    Log.d(TAG, "Failed to load WindowExtensions");
                }
            }
            return extensionWindowLayoutInfoBackend == null ? SidecarWindowBackend.Companion.getInstance(context) : extensionWindowLayoutInfoBackend;
        }
    }

    f2.b windowLayoutInfo(Activity activity);
}
