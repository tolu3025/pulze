package com.google.android.play.core.integrity;

import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes.dex */
final class aa implements IntegrityManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final aj f5731a;

    aa(aj ajVar) {
        this.f5731a = ajVar;
    }

    @Override // com.google.android.play.core.integrity.IntegrityManager
    public final Task<IntegrityTokenResponse> requestIntegrityToken(IntegrityTokenRequest integrityTokenRequest) {
        return this.f5731a.c(integrityTokenRequest);
    }
}
