package com.google.android.play.core.integrity;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes.dex */
class bi extends com.google.android.play.integrity.internal.x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final TaskCompletionSource f5803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ bn f5804b;

    bi(bn bnVar, TaskCompletionSource taskCompletionSource) {
        this.f5804b = bnVar;
        this.f5803a = taskCompletionSource;
    }

    @Override // com.google.android.play.integrity.internal.y
    public final void b(Bundle bundle) {
        this.f5804b.f5812a.v(this.f5803a);
    }

    @Override // com.google.android.play.integrity.internal.y
    public void c(Bundle bundle) {
        this.f5804b.f5812a.v(this.f5803a);
    }

    @Override // com.google.android.play.integrity.internal.y
    public final void d(Bundle bundle) {
        this.f5804b.f5812a.v(this.f5803a);
    }

    @Override // com.google.android.play.integrity.internal.y
    public void e(Bundle bundle) {
        this.f5804b.f5812a.v(this.f5803a);
    }
}
