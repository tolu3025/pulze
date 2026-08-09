package com.google.android.gms.common.util;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Boolean f5666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Boolean f5667b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Boolean f5668c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static Boolean f5669d;

    public static boolean a(Context context) {
        return h(context.getPackageManager());
    }

    public static boolean b() {
        int i3 = M.n.f2679a;
        return "user".equals(Build.TYPE);
    }

    public static boolean c(Context context) {
        return e(context.getPackageManager());
    }

    public static boolean d(Context context) {
        if (c(context) && !l.b()) {
            return true;
        }
        if (f(context)) {
            return !l.c() || l.f();
        }
        return false;
    }

    public static boolean e(PackageManager packageManager) {
        if (f5666a == null) {
            f5666a = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        return f5666a.booleanValue();
    }

    public static boolean f(Context context) {
        if (f5667b == null) {
            f5667b = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
        }
        return f5667b.booleanValue();
    }

    public static boolean g(Context context) {
        if (f5668c == null) {
            f5668c = Boolean.valueOf(context.getPackageManager().hasSystemFeature(l.c() ? "android.hardware.type.embedded" : "android.hardware.type.iot"));
        }
        return f5668c.booleanValue();
    }

    public static boolean h(PackageManager packageManager) {
        if (f5669d == null) {
            boolean z2 = false;
            if (l.c() && packageManager.hasSystemFeature("android.hardware.type.automotive")) {
                z2 = true;
            }
            f5669d = Boolean.valueOf(z2);
        }
        return f5669d.booleanValue();
    }
}
