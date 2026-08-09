package com.google.android.play.core.integrity;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.integrity.internal.B;
import com.google.android.play.integrity.internal.H;

/* JADX INFO: loaded from: classes.dex */
final class ag extends H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Bundle f5740a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Activity f5741b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f5742c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ int f5743d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ aj f5744e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ag(aj ajVar, TaskCompletionSource taskCompletionSource, Bundle bundle, Activity activity, TaskCompletionSource taskCompletionSource2, int i3) {
        super(taskCompletionSource);
        this.f5744e = ajVar;
        this.f5740a = bundle;
        this.f5741b = activity;
        this.f5742c = taskCompletionSource2;
        this.f5743d = i3;
    }

    @Override // com.google.android.play.integrity.internal.H
    protected final void b() {
        try {
            B b3 = (B) this.f5744e.f5749a.e();
            Bundle bundle = this.f5740a;
            aj ajVar = this.f5744e;
            b3.c(bundle, ajVar.f5752d.a(this.f5741b, this.f5742c, ajVar.f5749a));
        } catch (RemoteException e3) {
            this.f5744e.f5750b.c(e3, "requestAndShowDialog(%s)", Integer.valueOf(this.f5743d));
            this.f5742c.trySetException(new IntegrityServiceException(-100, e3));
        }
    }
}
