package com.google.android.gms.internal.auth;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.internal.AbstractC0604d;
import com.google.android.gms.common.api.j;

/* JADX INFO: loaded from: classes.dex */
abstract class zzbi extends AbstractC0604d {
    public zzbi(f fVar) {
        super(D.b.f1240a, fVar);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected final /* synthetic */ j createFailedResult(Status status) {
        return new zzbu(status);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC0604d
    protected final /* bridge */ /* synthetic */ void doExecute(a.b bVar) {
        zzbe zzbeVar = (zzbe) bVar;
        zza(zzbeVar.getContext(), (zzbh) zzbeVar.getService());
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0605e
    public final /* bridge */ /* synthetic */ void setResult(Object obj) {
        super.setResult((j) obj);
    }

    protected abstract void zza(Context context, zzbh zzbhVar);
}
