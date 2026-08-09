package com.google.protobuf;

/* JADX INFO: renamed from: com.google.protobuf.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC0786d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f6750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Class f6751b = a("libcore.io.Memory");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final boolean f6752c;

    static {
        f6752c = (f6750a || a("org.robolectric.Robolectric") == null) ? false : true;
    }

    private static Class a(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    static Class b() {
        return f6751b;
    }

    static boolean c() {
        return f6750a || !(f6751b == null || f6752c);
    }
}
