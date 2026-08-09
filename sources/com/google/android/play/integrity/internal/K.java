package com.google.android.play.integrity.internal;

import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes.dex */
final class K extends H {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f5867l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final /* synthetic */ H f5868m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ C0656f f5869n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    K(C0656f c0656f, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, H h3) {
        super(taskCompletionSource);
        this.f5869n = c0656f;
        this.f5867l = taskCompletionSource2;
        this.f5868m = h3;
    }

    @Override // com.google.android.play.integrity.internal.H
    public final void b() {
        synchronized (this.f5869n.f5883f) {
            try {
                C0656f.o(this.f5869n, this.f5867l);
                if (this.f5869n.f5889l.getAndIncrement() > 0) {
                    this.f5869n.f5879b.d("Already connected to the service.", new Object[0]);
                }
                C0656f.q(this.f5869n, this.f5868m);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
