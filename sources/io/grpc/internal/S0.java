package io.grpc.internal;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public interface S0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final S0 f8694a = new a();

    class a implements S0 {
        a() {
        }

        @Override // io.grpc.internal.S0
        public long a() {
            return TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
        }
    }

    long a();
}
