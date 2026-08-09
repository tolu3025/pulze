package com.google.android.gms.internal.p000authapi;

import G.C0320c;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.AbstractC0621v;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes.dex */
final class zbbc extends zbab {
    final /* synthetic */ TaskCompletionSource zba;

    zbbc(zbbg zbbgVar, TaskCompletionSource taskCompletionSource) {
        this.zba = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.p000authapi.zbac
    public final void zbb(Status status, C0320c c0320c) {
        AbstractC0621v.b(status, c0320c, this.zba);
    }
}
