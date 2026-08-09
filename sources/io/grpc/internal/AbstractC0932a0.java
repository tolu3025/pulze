package io.grpc.internal;

import io.grpc.internal.D;

/* JADX INFO: renamed from: io.grpc.internal.a0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC0932a0 implements D.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Throwable f8843a = a();

    private static Throwable a() {
        try {
            Class.forName("javax.naming.directory.InitialDirContext");
            Class.forName("com.sun.jndi.dns.DnsContextFactory");
            return null;
        } catch (ClassNotFoundException | Error | RuntimeException e3) {
            return e3;
        }
    }
}
