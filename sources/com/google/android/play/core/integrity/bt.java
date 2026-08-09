package com.google.android.play.core.integrity;

import com.google.android.gms.tasks.Task;
import com.google.android.play.core.integrity.StandardIntegrityManager;

/* JADX INFO: loaded from: classes.dex */
final class bt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final bn f5828a;

    bt(bn bnVar) {
        this.f5828a = bnVar;
    }

    final /* synthetic */ Task a(long j3, long j4, int i3, StandardIntegrityManager.StandardIntegrityTokenRequest standardIntegrityTokenRequest) {
        return this.f5828a.d(standardIntegrityTokenRequest.a(), j3, j4, 0);
    }
}
