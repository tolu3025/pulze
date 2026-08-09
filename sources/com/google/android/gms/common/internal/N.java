package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
final class N implements g.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.common.api.g f5497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f5498b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ r.a f5499c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ P f5500d;

    N(com.google.android.gms.common.api.g gVar, TaskCompletionSource taskCompletionSource, r.a aVar, P p2) {
        this.f5497a = gVar;
        this.f5498b = taskCompletionSource;
        this.f5499c = aVar;
        this.f5500d = p2;
    }

    @Override // com.google.android.gms.common.api.g.a
    public final void a(Status status) {
        if (!status.x()) {
            this.f5498b.setException(AbstractC0627b.a(status));
        } else {
            this.f5498b.setResult(this.f5499c.a(this.f5497a.await(0L, TimeUnit.MILLISECONDS)));
        }
    }
}
