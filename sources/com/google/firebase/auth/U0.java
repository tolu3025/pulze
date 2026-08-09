package com.google.firebase.auth;

import com.google.firebase.auth.FirebaseAuth;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
final class U0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ FirebaseAuth.a f6018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ FirebaseAuth f6019b;

    U0(FirebaseAuth firebaseAuth, FirebaseAuth.a aVar) {
        this.f6018a = aVar;
        Objects.requireNonNull(firebaseAuth);
        this.f6019b = firebaseAuth;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f6018a.a(this.f6019b);
    }
}
