package androidx.core.app;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public abstract class k {
    private static int a(boolean z2, int i3) {
        int i4;
        if (!z2) {
            i4 = 67108864;
        } else {
            if (Build.VERSION.SDK_INT < 31) {
                return i3;
            }
            i4 = 33554432;
        }
        return i3 | i4;
    }

    public static PendingIntent b(Context context, int i3, Intent intent, int i4, boolean z2) {
        return PendingIntent.getActivity(context, i3, intent, a(z2, i4));
    }
}
