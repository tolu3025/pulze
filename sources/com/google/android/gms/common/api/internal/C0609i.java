package com.google.android.gms.common.api.internal;

import android.app.Activity;
import com.google.android.gms.common.internal.AbstractC0643s;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0609i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f5436a;

    public C0609i(Activity activity) {
        AbstractC0643s.l(activity, "Activity must not be null");
        this.f5436a = activity;
    }

    public final boolean a() {
        return this.f5436a instanceof androidx.fragment.app.d;
    }

    public final boolean b() {
        return this.f5436a instanceof Activity;
    }

    public final Activity c() {
        return (Activity) this.f5436a;
    }

    public final androidx.fragment.app.d d() {
        return (androidx.fragment.app.d) this.f5436a;
    }
}
