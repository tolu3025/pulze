package com.google.firebase.auth;

import com.google.firebase.auth.FirebaseAuth;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
final class H0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ FirebaseAuth.b f5947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ FirebaseAuth f5948b;

    H0(FirebaseAuth firebaseAuth, FirebaseAuth.b bVar) {
        this.f5947a = bVar;
        Objects.requireNonNull(firebaseAuth);
        this.f5948b = firebaseAuth;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f5947a.a(this.f5948b);
    }
}
