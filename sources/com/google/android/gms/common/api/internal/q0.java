package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.g;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
final class q0 implements g.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ BasePendingResult f5452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ C0623x f5453b;

    q0(C0623x c0623x, BasePendingResult basePendingResult) {
        this.f5452a = basePendingResult;
        Objects.requireNonNull(c0623x);
        this.f5453b = c0623x;
    }

    @Override // com.google.android.gms.common.api.g.a
    public final void a(Status status) {
        this.f5453b.f().remove(this.f5452a);
    }
}
