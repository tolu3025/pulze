package com.google.android.gms.common.api.internal;

import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C0625z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C0602b f5477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TaskCompletionSource f5478b = new TaskCompletionSource();

    public C0625z(C0602b c0602b) {
        this.f5477a = c0602b;
    }

    public final C0602b a() {
        return this.f5477a;
    }

    public final TaskCompletionSource b() {
        return this.f5478b;
    }
}
