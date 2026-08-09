package com.google.android.play.core.integrity;

/* JADX INFO: loaded from: classes.dex */
final class ao extends IntegrityTokenRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f5761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Long f5762b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f5763c = null;

    /* synthetic */ ao(String str, Long l3, Object obj, an anVar) {
        this.f5761a = str;
        this.f5762b = l3;
    }

    private static boolean a() {
        return true;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest
    public final Long cloudProjectNumber() {
        return this.f5762b;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 1
            if (r6 != r5) goto L4
            return r0
        L4:
            boolean r1 = r6 instanceof com.google.android.play.core.integrity.IntegrityTokenRequest
            r2 = 0
            if (r1 == 0) goto L24
            r1 = r6
            com.google.android.play.core.integrity.IntegrityTokenRequest r1 = (com.google.android.play.core.integrity.IntegrityTokenRequest) r1
            java.lang.String r3 = r5.f5761a
            java.lang.String r4 = r1.nonce()
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L24
            java.lang.Long r3 = r5.f5762b
            java.lang.Long r1 = r1.cloudProjectNumber()
            if (r3 != 0) goto L26
            if (r1 != 0) goto L24
        L22:
            r1 = r0
            goto L2d
        L24:
            r1 = r2
            goto L2d
        L26:
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L24
            goto L22
        L2d:
            boolean r3 = r6 instanceof com.google.android.play.core.integrity.ao
            if (r3 == 0) goto L40
            boolean r3 = a()
            if (r3 == 0) goto L40
            com.google.android.play.core.integrity.ao r6 = (com.google.android.play.core.integrity.ao) r6
            if (r1 == 0) goto L3e
            java.lang.Object r6 = r6.f5763c
            goto L41
        L3e:
            r0 = r2
            goto L41
        L40:
            r0 = r1
        L41:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.integrity.ao.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int iHashCode = this.f5761a.hashCode() ^ 1000003;
        Long l3 = this.f5762b;
        int iHashCode2 = (iHashCode * 1000003) ^ (l3 == null ? 0 : l3.hashCode());
        return a() ? iHashCode2 * 1000003 : iHashCode2;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest
    public final String nonce() {
        return this.f5761a;
    }

    public final String toString() {
        String strConcat = "IntegrityTokenRequest{nonce=" + this.f5761a + ", cloudProjectNumber=" + this.f5762b;
        if (a()) {
            strConcat = strConcat.concat(", network=null");
        }
        return strConcat.concat("}");
    }
}
