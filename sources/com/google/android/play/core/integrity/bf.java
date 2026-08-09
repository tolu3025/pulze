package com.google.android.play.core.integrity;

import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes.dex */
final class bf extends bm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ long f5790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f5791b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ bn f5792c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bf(bn bnVar, TaskCompletionSource taskCompletionSource, int i3, long j3, TaskCompletionSource taskCompletionSource2) {
        super(bnVar, taskCompletionSource);
        this.f5792c = bnVar;
        this.f5790a = j3;
        this.f5791b = taskCompletionSource2;
    }

    @Override // com.google.android.play.integrity.internal.H
    protected final void b() {
        if (bn.k(this.f5792c)) {
            super.a(new StandardIntegrityException(-2, null));
            return;
        }
        try {
            bn bnVar = this.f5792c;
            ((com.google.android.play.integrity.internal.w) bnVar.f5812a.e()).d(bn.b(bnVar, this.f5790a, 0), new bl(this.f5792c, this.f5791b));
        } catch (RemoteException e3) {
            this.f5792c.f5813b.c(e3, "warmUpIntegrityToken(%s)", Long.valueOf(this.f5790a));
            this.f5791b.trySetException(new StandardIntegrityException(-100, e3));
        }
    }
}
