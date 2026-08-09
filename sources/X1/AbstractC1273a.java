package x1;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: renamed from: x1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1273a {
    public static Handler a(Looper looper) {
        return Build.VERSION.SDK_INT >= 28 ? Handler.createAsync(looper) : new Handler(looper);
    }
}
