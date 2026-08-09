package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public abstract class X {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f5514a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f5515b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static String f5516c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f5517d;

    public static int a(Context context) {
        b(context);
        return f5517d;
    }

    private static void b(Context context) {
        synchronized (f5514a) {
            try {
                if (f5515b) {
                    return;
                }
                f5515b = true;
                try {
                    Bundle bundle = T.e.a(context).a(context.getPackageName(), 128).metaData;
                    if (bundle == null) {
                        return;
                    }
                    f5516c = bundle.getString("com.google.app.id");
                    f5517d = bundle.getInt("com.google.android.gms.version");
                } catch (PackageManager.NameNotFoundException e3) {
                    Log.wtf("MetadataValueReader", "This should never happen.", e3);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
