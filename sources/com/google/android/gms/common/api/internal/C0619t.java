package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0619t extends BasePendingResult {
    public C0619t(com.google.android.gms.common.api.f fVar) {
        super(fVar);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected final /* bridge */ /* synthetic */ com.google.android.gms.common.api.j createFailedResult(Status status) {
        return status;
    }
}
