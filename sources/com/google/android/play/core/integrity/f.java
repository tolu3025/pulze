package com.google.android.play.core.integrity;

import com.google.android.play.core.integrity.StandardIntegrityManager;

/* JADX INFO: loaded from: classes.dex */
final class f extends StandardIntegrityManager.StandardIntegrityTokenRequest.Builder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f5833a;

    f() {
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenRequest.Builder
    public final StandardIntegrityManager.StandardIntegrityTokenRequest build() {
        return new h(this.f5833a, null);
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenRequest.Builder
    public final StandardIntegrityManager.StandardIntegrityTokenRequest.Builder setRequestHash(String str) {
        this.f5833a = str;
        return this;
    }
}
