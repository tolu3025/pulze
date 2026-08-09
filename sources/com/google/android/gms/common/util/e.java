package com.google.android.gms.common.util;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.internal.AbstractC0643s;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String[] f5664a = {"android.", "com.android.", "dalvik.", "java.", "javax."};

    public static boolean a(Context context, Throwable th) {
        try {
            AbstractC0643s.k(context);
            AbstractC0643s.k(th);
            return false;
        } catch (Exception e3) {
            Log.e("CrashUtils", "Error adding exception to DropBox!", e3);
            return false;
        }
    }
}
