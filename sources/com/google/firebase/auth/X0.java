package com.google.firebase.auth;

import com.google.firebase.auth.FirebaseAuth;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
final class X0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ FirebaseAuth f6024a;

    X0(FirebaseAuth firebaseAuth) {
        this.f6024a = firebaseAuth;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator it = this.f6024a.f5921c.iterator();
        while (it.hasNext()) {
            ((FirebaseAuth.a) it.next()).a(this.f6024a);
        }
    }
}
