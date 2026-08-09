package androidx.window.layout;

import android.app.Activity;
import android.graphics.Rect;

/* JADX INFO: loaded from: classes.dex */
public final class ActivityCompatHelperApi30 {
    public static final ActivityCompatHelperApi30 INSTANCE = new ActivityCompatHelperApi30();

    private ActivityCompatHelperApi30() {
    }

    public final Rect currentWindowBounds(Activity activity) {
        kotlin.jvm.internal.m.e(activity, "activity");
        Rect bounds = activity.getWindowManager().getCurrentWindowMetrics().getBounds();
        kotlin.jvm.internal.m.d(bounds, "activity.windowManager.currentWindowMetrics.bounds");
        return bounds;
    }

    public final Rect maximumWindowBounds(Activity activity) {
        kotlin.jvm.internal.m.e(activity, "activity");
        Rect bounds = activity.getWindowManager().getMaximumWindowMetrics().getBounds();
        kotlin.jvm.internal.m.d(bounds, "activity.windowManager.maximumWindowMetrics.bounds");
        return bounds;
    }
}
