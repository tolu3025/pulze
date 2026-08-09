package com.google.firebase.auth;

import com.google.android.gms.common.api.Status;
import java.util.Objects;
import q0.InterfaceC1165y;

/* JADX INFO: loaded from: classes.dex */
final class R0 implements InterfaceC1165y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ A f6010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ FirebaseAuth f6011b;

    R0(FirebaseAuth firebaseAuth, A a3) {
        this.f6010a = a3;
        Objects.requireNonNull(firebaseAuth);
        this.f6011b = firebaseAuth;
    }

    @Override // q0.InterfaceC1165y
    public final void zza() {
        if (this.f6011b.f5924f == null || !this.f6011b.f5924f.a().equalsIgnoreCase(this.f6010a.a())) {
            return;
        }
        this.f6011b.E0();
    }

    @Override // q0.InterfaceC1164x
    public final void zza(Status status) {
        if (status.t() == 17011 || status.t() == 17021 || status.t() == 17005) {
            this.f6011b.F();
        }
    }
}
