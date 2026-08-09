package com.google.android.play.core.integrity;

import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.integrity.internal.B;
import com.google.android.play.integrity.internal.C0657g;
import com.google.android.play.integrity.internal.H;

/* JADX INFO: loaded from: classes.dex */
final class af extends H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ byte[] f5735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Long f5736b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f5737c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ IntegrityTokenRequest f5738d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ aj f5739e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    af(aj ajVar, TaskCompletionSource taskCompletionSource, byte[] bArr, Long l3, Parcelable parcelable, TaskCompletionSource taskCompletionSource2, IntegrityTokenRequest integrityTokenRequest) {
        super(taskCompletionSource);
        this.f5739e = ajVar;
        this.f5735a = bArr;
        this.f5736b = l3;
        this.f5737c = taskCompletionSource2;
        this.f5738d = integrityTokenRequest;
    }

    @Override // com.google.android.play.integrity.internal.H
    public final void a(Exception exc) {
        if (exc instanceof C0657g) {
            super.a(new IntegrityServiceException(-9, exc));
        } else {
            super.a(exc);
        }
    }

    @Override // com.google.android.play.integrity.internal.H
    protected final void b() {
        try {
            ((B) this.f5739e.f5749a.e()).h(aj.a(this.f5739e, this.f5735a, this.f5736b, null), new ai(this.f5739e, this.f5737c));
        } catch (RemoteException e3) {
            this.f5739e.f5750b.c(e3, "requestIntegrityToken(%s)", this.f5738d);
            this.f5737c.trySetException(new IntegrityServiceException(-100, e3));
        }
    }
}
