package com.google.android.play.core.integrity;

/* JADX INFO: loaded from: classes.dex */
final class b extends bq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f5782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private y f5783b;

    b() {
    }

    @Override // com.google.android.play.core.integrity.bq
    final bq a(y yVar) {
        this.f5783b = yVar;
        return this;
    }

    @Override // com.google.android.play.core.integrity.bq
    final bq b(String str) {
        if (str == null) {
            throw new NullPointerException("Null token");
        }
        this.f5782a = str;
        return this;
    }

    @Override // com.google.android.play.core.integrity.bq
    final br c() {
        y yVar;
        String str = this.f5782a;
        if (str != null && (yVar = this.f5783b) != null) {
            return new br(str, yVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f5782a == null) {
            sb.append(" token");
        }
        if (this.f5783b == null) {
            sb.append(" integrityDialogWrapper");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
