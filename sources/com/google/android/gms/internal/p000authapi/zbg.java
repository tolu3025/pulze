package com.google.android.gms.internal.p000authapi;

import android.content.Context;
import com.google.android.gms.auth.api.credentials.a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.j;

/* JADX INFO: loaded from: classes.dex */
final class zbg extends zbm {
    final /* synthetic */ a zba;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zbg(zbl zblVar, f fVar, a aVar) {
        super(fVar);
        this.zba = aVar;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected final /* synthetic */ j createFailedResult(Status status) {
        return new zbe(status, null);
    }

    @Override // com.google.android.gms.internal.p000authapi.zbm
    protected final void zba(Context context, zbt zbtVar) {
        zbtVar.zbd(new zbf(this), this.zba);
    }
}
