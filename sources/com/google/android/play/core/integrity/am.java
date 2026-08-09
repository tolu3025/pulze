package com.google.android.play.core.integrity;

import com.google.android.play.core.integrity.IntegrityTokenRequest;

/* JADX INFO: loaded from: classes.dex */
final class am extends IntegrityTokenRequest.Builder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f5759a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Long f5760b;

    am() {
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest.Builder
    public final IntegrityTokenRequest build() {
        String str = this.f5759a;
        if (str == null) {
            throw new IllegalStateException("Missing required properties: nonce");
        }
        an anVar = null;
        return new ao(str, this.f5760b, anVar, anVar);
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest.Builder
    public final IntegrityTokenRequest.Builder setCloudProjectNumber(long j3) {
        this.f5760b = Long.valueOf(j3);
        return this;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest.Builder
    public final IntegrityTokenRequest.Builder setNonce(String str) {
        if (str == null) {
            throw new NullPointerException("Null nonce");
        }
        this.f5759a = str;
        return this;
    }
}
