package com.google.android.play.core.integrity;

import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.integrity.StandardIntegrityManager;

/* JADX INFO: loaded from: classes.dex */
final class az implements StandardIntegrityManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final bn f5780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final bt f5781b;

    az(bn bnVar, bt btVar) {
        this.f5780a = bnVar;
        this.f5781b = btVar;
    }

    final /* synthetic */ Task a(StandardIntegrityManager.PrepareIntegrityTokenRequest prepareIntegrityTokenRequest, Long l3) {
        final long jB = prepareIntegrityTokenRequest.b();
        final long jLongValue = l3.longValue();
        prepareIntegrityTokenRequest.a();
        final bt btVar = this.f5781b;
        final int i3 = 0;
        return Tasks.forResult(new StandardIntegrityManager.StandardIntegrityTokenProvider(jB, jLongValue, i3) { // from class: com.google.android.play.core.integrity.bs

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ long f5826b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ long f5827c;

            @Override // com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenProvider
            public final Task request(StandardIntegrityManager.StandardIntegrityTokenRequest standardIntegrityTokenRequest) {
                return this.f5825a.a(this.f5826b, this.f5827c, 0, standardIntegrityTokenRequest);
            }
        });
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager
    public final Task<StandardIntegrityManager.StandardIntegrityTokenProvider> prepareIntegrityToken(final StandardIntegrityManager.PrepareIntegrityTokenRequest prepareIntegrityTokenRequest) {
        long jB = prepareIntegrityTokenRequest.b();
        prepareIntegrityTokenRequest.a();
        return this.f5780a.e(jB, 0).onSuccessTask(new SuccessContinuation() { // from class: com.google.android.play.core.integrity.ay
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                return this.f5778a.a(prepareIntegrityTokenRequest, (Long) obj);
            }
        });
    }
}
