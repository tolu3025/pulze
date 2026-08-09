package com.google.android.play.core.integrity;

/* JADX INFO: loaded from: classes.dex */
final class a extends ap {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f5729a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private y f5730b;

    a() {
    }

    @Override // com.google.android.play.core.integrity.ap
    final ap a(y yVar) {
        this.f5730b = yVar;
        return this;
    }

    @Override // com.google.android.play.core.integrity.ap
    final ap b(String str) {
        this.f5729a = str;
        return this;
    }

    @Override // com.google.android.play.core.integrity.ap
    final aq c() {
        y yVar;
        String str = this.f5729a;
        if (str != null && (yVar = this.f5730b) != null) {
            return new aq(str, yVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f5729a == null) {
            sb.append(" token");
        }
        if (this.f5730b == null) {
            sb.append(" integrityDialogWrapper");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
