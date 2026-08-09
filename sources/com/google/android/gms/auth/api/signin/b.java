package com.google.android.gms.auth.api.signin;

import K.o;
import M.C0421i;
import android.content.Context;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.internal.C0601a;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes.dex */
public class b extends com.google.android.gms.common.api.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final g f5295a = new g(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static int f5296b = 1;

    b(Context context, GoogleSignInOptions googleSignInOptions) {
        super(context, D.a.f1226c, googleSignInOptions, new e.a.C0108a().c(new C0601a()).a());
    }

    private final synchronized int f() {
        int i3;
        try {
            i3 = f5296b;
            if (i3 == 1) {
                Context applicationContext = getApplicationContext();
                C0421i c0421iM = C0421i.m();
                int iG = c0421iM.g(applicationContext, 12451000);
                if (iG == 0) {
                    i3 = 4;
                    f5296b = 4;
                } else if (c0421iM.a(applicationContext, iG, null) != null || DynamiteModule.a(applicationContext, "com.google.android.gms.auth.api.fallback") == 0) {
                    i3 = 2;
                    f5296b = 2;
                } else {
                    i3 = 3;
                    f5296b = 3;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return i3;
    }

    public Task e() {
        return r.b(o.b(asGoogleApiClient(), getApplicationContext(), f() == 3));
    }

    public Task signOut() {
        return r.b(o.c(asGoogleApiClient(), getApplicationContext(), f() == 3));
    }
}
