package com.google.firebase.auth;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p002firebaseauthapi.zzahv;
import java.util.Objects;
import q0.InterfaceC1164x;

/* JADX INFO: loaded from: classes.dex */
final class W0 implements InterfaceC1164x, q0.t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ FirebaseAuth f6023a;

    W0(FirebaseAuth firebaseAuth) {
        Objects.requireNonNull(firebaseAuth);
        this.f6023a = firebaseAuth;
    }

    @Override // q0.t0
    public final void a(zzahv zzahvVar, A a3) {
        this.f6023a.i0(a3, zzahvVar, true, true);
    }

    @Override // q0.InterfaceC1164x
    public final void zza(Status status) {
        int iT = status.t();
        if (iT == 17011 || iT == 17021 || iT == 17005) {
            this.f6023a.F();
        }
    }
}
