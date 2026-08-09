package io.grpc.internal;

/* JADX INFO: renamed from: io.grpc.internal.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0966s extends R0 {

    /* JADX INFO: renamed from: io.grpc.internal.s$a */
    public enum a {
        PROCESSED,
        REFUSED,
        DROPPED,
        MISCARRIED
    }

    void c(y1.l0 l0Var, a aVar, y1.Z z2);

    void d(y1.Z z2);
}
