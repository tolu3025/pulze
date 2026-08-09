package com.google.android.gms.internal.base;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class zak {
    public static final int zaa;
    private static volatile boolean zab = false;

    static {
        zaa = Build.VERSION.SDK_INT >= 31 ? 33554432 : 0;
    }

    public static PendingIntent zaa(Context context, int i3, Intent intent, int i4) {
        return PendingIntent.getActivity(context, i3, intent, i4);
    }
}
