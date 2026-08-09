package com.google.android.play.core.integrity;

import com.google.android.play.core.integrity.StandardIntegrityManager;

/* JADX INFO: loaded from: classes.dex */
final class h extends StandardIntegrityManager.StandardIntegrityTokenRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f5834a;

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenRequest
    public final String a() {
        return this.f5834a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StandardIntegrityManager.StandardIntegrityTokenRequest)) {
            return false;
        }
        String str = this.f5834a;
        String strA = ((StandardIntegrityManager.StandardIntegrityTokenRequest) obj).a();
        return str == null ? strA == null : str.equals(strA);
    }

    public final int hashCode() {
        String str = this.f5834a;
        return (str == null ? 0 : str.hashCode()) ^ 1000003;
    }

    public final String toString() {
        return "StandardIntegrityTokenRequest{requestHash=" + this.f5834a + "}";
    }
}
