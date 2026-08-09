package com.google.android.gms.internal.p000authapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.AbstractC0621v;
import com.google.android.gms.common.api.internal.InterfaceC0608h;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes.dex */
final class zbbd extends InterfaceC0608h.a {
    final /* synthetic */ TaskCompletionSource zba;

    zbbd(zbbg zbbgVar, TaskCompletionSource taskCompletionSource) {
        this.zba = taskCompletionSource;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0608h
    public final void onResult(Status status) {
        AbstractC0621v.a(status, this.zba);
    }
}
