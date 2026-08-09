package com.google.android.gms.internal.p000authapi;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.j;

/* JADX INFO: loaded from: classes.dex */
final class zbj extends zbm {
    zbj(zbl zblVar, f fVar) {
        super(fVar);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected final /* bridge */ /* synthetic */ j createFailedResult(Status status) {
        return status;
    }

    @Override // com.google.android.gms.internal.p000authapi.zbm
    protected final void zba(Context context, zbt zbtVar) {
        zbtVar.zbf(new zbk(this));
    }
}
