package com.google.android.gms.common.util;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public abstract class q {
    public static boolean a(Context context, int i3) {
        if (!b(context, i3, "com.google.android.gms")) {
            return false;
        }
        try {
            return M.r.a(context).b(context.getPackageManager().getPackageInfo("com.google.android.gms", 64));
        } catch (PackageManager.NameNotFoundException unused) {
            if (!Log.isLoggable("UidVerifier", 3)) {
                return false;
            }
            Log.d("UidVerifier", "Package manager can't find google play services package, defaulting to false");
            return false;
        }
    }

    public static boolean b(Context context, int i3, String str) {
        return T.e.a(context).d(i3, str);
    }
}
