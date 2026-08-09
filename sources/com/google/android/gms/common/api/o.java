package com.google.android.gms.common.api;

import com.google.android.gms.common.api.internal.BasePendingResult;

/* JADX INFO: loaded from: classes.dex */
final class o extends BasePendingResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j f5480a;

    public o(f fVar, j jVar) {
        super(fVar);
        this.f5480a = jVar;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected final j createFailedResult(Status status) {
        return this.f5480a;
    }
}
