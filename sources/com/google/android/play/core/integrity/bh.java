package com.google.android.play.core.integrity;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.integrity.internal.C0656f;

/* JADX INFO: loaded from: classes.dex */
final class bh extends bm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Bundle f5798a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Activity f5799b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f5800c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ int f5801d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ bn f5802e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bh(bn bnVar, TaskCompletionSource taskCompletionSource, Bundle bundle, Activity activity, TaskCompletionSource taskCompletionSource2, int i3) {
        super(bnVar, taskCompletionSource);
        this.f5802e = bnVar;
        this.f5798a = bundle;
        this.f5799b = activity;
        this.f5800c = taskCompletionSource2;
        this.f5801d = i3;
    }

    @Override // com.google.android.play.integrity.internal.H
    protected final void b() {
        if (bn.k(this.f5802e)) {
            super.a(new StandardIntegrityException(-2, null));
            return;
        }
        try {
            bn bnVar = this.f5802e;
            C0656f c0656f = bnVar.f5812a;
            ((com.google.android.play.integrity.internal.w) c0656f.e()).c(this.f5798a, bnVar.f5816e.a(this.f5799b, this.f5800c, c0656f));
        } catch (RemoteException e3) {
            this.f5802e.f5813b.c(e3, "requestAndShowDialog(%s)", Integer.valueOf(this.f5801d));
            this.f5800c.trySetException(new StandardIntegrityException(-100, e3));
        }
    }
}
