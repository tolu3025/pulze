package com.google.android.gms.internal.auth;

import android.accounts.Account;
import com.google.android.gms.auth.account.g;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.internal.AbstractC0604d;
import com.google.android.gms.common.api.j;

/* JADX INFO: loaded from: classes.dex */
final class zzag extends AbstractC0604d {
    final /* synthetic */ Account zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzag(zzal zzalVar, com.google.android.gms.common.api.a aVar, f fVar, Account account) {
        super(aVar, fVar);
        this.zza = account;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected final j createFailedResult(Status status) {
        return new zzak(status);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC0604d
    protected final /* bridge */ /* synthetic */ void doExecute(a.b bVar) {
        ((g) ((zzam) bVar).getService()).p(new zzaf(this), this.zza);
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0605e
    public final /* bridge */ /* synthetic */ void setResult(Object obj) {
        super.setResult((j) obj);
    }
}
