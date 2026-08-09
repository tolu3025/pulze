package com.google.android.play.core.integrity;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.integrity.internal.C0657g;
import com.google.android.play.integrity.internal.H;

/* JADX INFO: loaded from: classes.dex */
abstract class bm extends H {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ bn f5811f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bm(bn bnVar, TaskCompletionSource taskCompletionSource) {
        super(taskCompletionSource);
        this.f5811f = bnVar;
    }

    @Override // com.google.android.play.integrity.internal.H
    public final void a(Exception exc) {
        if (exc instanceof C0657g) {
            super.a(bn.k(this.f5811f) ? new StandardIntegrityException(-2, exc) : new StandardIntegrityException(-9, exc));
        } else {
            super.a(exc);
        }
    }
}
