package com.google.firebase.auth;

import com.google.firebase.auth.FirebaseAuth;
import java.util.Iterator;
import q0.InterfaceC1134a;

/* JADX INFO: loaded from: classes.dex */
final class V0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ FirebaseAuth f6021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ M0.b f6022b;

    V0(FirebaseAuth firebaseAuth, M0.b bVar) {
        this.f6021a = firebaseAuth;
        this.f6022b = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator it = this.f6021a.f5922d.iterator();
        while (it.hasNext()) {
            ((InterfaceC1134a) it.next()).a(this.f6022b);
        }
        Iterator it2 = this.f6021a.f5920b.iterator();
        while (it2.hasNext()) {
            ((FirebaseAuth.b) it2.next()).a(this.f6021a);
        }
    }
}
