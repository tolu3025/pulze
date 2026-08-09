package com.google.android.gms.internal.p000authapi;

import android.content.Context;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.j;

/* JADX INFO: loaded from: classes.dex */
final class zbi extends zbm {
    final /* synthetic */ Credential zba;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zbi(zbl zblVar, f fVar, Credential credential) {
        super(fVar);
        this.zba = credential;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected final /* bridge */ /* synthetic */ j createFailedResult(Status status) {
        return status;
    }

    @Override // com.google.android.gms.internal.p000authapi.zbm
    protected final void zba(Context context, zbt zbtVar) {
        zbtVar.zbc(new zbk(this), new zbp(this.zba));
    }
}
