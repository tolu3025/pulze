package x1;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.window.layout.WindowMetrics;
import androidx.window.layout.l;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    public interface a {
        void a(float f3, float f4, float f5);
    }

    public static void a(Context context, a aVar) {
        Activity activityB = b(context);
        if (activityB != null) {
            WindowMetrics windowMetricsComputeMaximumWindowMetrics = l.a().computeMaximumWindowMetrics(activityB);
            aVar.a(windowMetricsComputeMaximumWindowMetrics.getBounds().width(), windowMetricsComputeMaximumWindowMetrics.getBounds().height(), context.getResources().getDisplayMetrics().density);
        }
    }

    public static Activity b(Context context) {
        if (context == null) {
            return null;
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return b(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }
}
