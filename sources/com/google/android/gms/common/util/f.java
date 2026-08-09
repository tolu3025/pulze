package com.google.android.gms.common.util;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes.dex */
public class f implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final f f5665a = new f();

    private f() {
    }

    public static d c() {
        return f5665a;
    }

    @Override // com.google.android.gms.common.util.d
    public final long a() {
        return System.currentTimeMillis();
    }

    @Override // com.google.android.gms.common.util.d
    public final long b() {
        return SystemClock.elapsedRealtime();
    }
}
