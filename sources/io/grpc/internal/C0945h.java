package io.grpc.internal;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: io.grpc.internal.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C0945h implements InterfaceC0942f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicLong f8914a = new AtomicLong();

    C0945h() {
    }

    @Override // io.grpc.internal.InterfaceC0942f0
    public void a(long j3) {
        this.f8914a.getAndAdd(j3);
    }
}
