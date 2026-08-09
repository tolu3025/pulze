package com.google.android.gms.internal.p001authapiphone;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.AbstractC0621v;
import com.google.android.gms.common.api.internal.InterfaceC0608h;
import com.google.android.gms.common.internal.AbstractC0627b;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes.dex */
final class zzu extends InterfaceC0608h.a {
    final /* synthetic */ TaskCompletionSource zza;

    zzu(zzv zzvVar, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0608h
    public final void onResult(Status status) {
        if (status.t() == 6) {
            this.zza.trySetException(AbstractC0627b.a(status));
        } else {
            AbstractC0621v.a(status, this.zza);
        }
    }
}
