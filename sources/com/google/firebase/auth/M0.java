package com.google.firebase.auth;

import com.google.android.gms.common.internal.AbstractC0643s;
import com.google.firebase.auth.Q;
import java.util.Objects;
import k0.C0999m;

/* JADX INFO: loaded from: classes.dex */
final class M0 extends Q.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ Q.b f5961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ FirebaseAuth f5962b;

    M0(FirebaseAuth firebaseAuth, Q.b bVar) {
        this.f5961a = bVar;
        Objects.requireNonNull(firebaseAuth);
        this.f5962b = firebaseAuth;
    }

    @Override // com.google.firebase.auth.Q.b
    public final void onCodeAutoRetrievalTimeOut(String str) {
    }

    @Override // com.google.firebase.auth.Q.b
    public final void onCodeSent(String str, Q.a aVar) {
        this.f5961a.onVerificationCompleted(Q.a(str, (String) AbstractC0643s.k(this.f5962b.f5925g.e())));
    }

    @Override // com.google.firebase.auth.Q.b
    public final void onVerificationCompleted(O o2) {
        this.f5961a.onVerificationCompleted(o2);
    }

    @Override // com.google.firebase.auth.Q.b
    public final void onVerificationFailed(C0999m c0999m) {
        this.f5961a.onVerificationFailed(c0999m);
    }
}
