package com.google.android.play.core.integrity;

import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes.dex */
final class bg extends bm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f5793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ long f5794b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ long f5795c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f5796d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ bn f5797e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bg(bn bnVar, TaskCompletionSource taskCompletionSource, int i3, String str, long j3, long j4, TaskCompletionSource taskCompletionSource2) {
        super(bnVar, taskCompletionSource);
        this.f5797e = bnVar;
        this.f5793a = str;
        this.f5794b = j3;
        this.f5795c = j4;
        this.f5796d = taskCompletionSource2;
    }

    @Override // com.google.android.play.integrity.internal.H
    protected final void b() {
        if (bn.k(this.f5797e)) {
            super.a(new StandardIntegrityException(-2, null));
            return;
        }
        try {
            bn bnVar = this.f5797e;
            ((com.google.android.play.integrity.internal.w) bnVar.f5812a.e()).j(bn.a(bnVar, this.f5793a, this.f5794b, this.f5795c, 0), new bk(this.f5797e, this.f5796d, this.f5794b));
        } catch (RemoteException e3) {
            this.f5797e.f5813b.c(e3, "requestExpressIntegrityToken(%s, %s)", this.f5793a, Long.valueOf(this.f5794b));
            this.f5796d.trySetException(new StandardIntegrityException(-100, e3));
        }
    }
}
