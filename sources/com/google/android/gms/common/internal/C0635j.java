package com.google.android.gms.common.internal;

import android.util.Log;

/* JADX INFO: renamed from: com.google.android.gms.common.internal.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0635j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f5579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f5580b;

    public C0635j(String str) {
        this(str, null);
    }

    private final String f(String str) {
        String str2 = this.f5580b;
        return str2 == null ? str : str2.concat(str);
    }

    public boolean a(int i3) {
        return Log.isLoggable(this.f5579a, i3);
    }

    public void b(String str, String str2) {
        if (a(3)) {
            Log.d(str, f(str2));
        }
    }

    public void c(String str, String str2, Throwable th) {
        if (a(6)) {
            Log.e(str, f(str2), th);
        }
    }

    public void d(String str, String str2) {
        if (a(2)) {
            Log.v(str, f(str2));
        }
    }

    public void e(String str, String str2) {
        if (a(5)) {
            Log.w(str, f(str2));
        }
    }

    public C0635j(String str, String str2) {
        AbstractC0643s.l(str, "log tag cannot be null");
        AbstractC0643s.c(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        this.f5579a = str;
        this.f5580b = (str2 == null || str2.length() <= 0) ? null : str2;
    }
}
