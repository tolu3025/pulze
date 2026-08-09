package io.grpc.internal;

import e0.AbstractC0829j;
import io.grpc.internal.InterfaceC0949j;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class F implements InterfaceC0949j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Random f8591a = new Random();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f8592b = TimeUnit.SECONDS.toNanos(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f8593c = TimeUnit.MINUTES.toNanos(2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private double f8594d = 1.6d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private double f8595e = 0.2d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f8596f = this.f8592b;

    public static final class a implements InterfaceC0949j.a {
        @Override // io.grpc.internal.InterfaceC0949j.a
        public InterfaceC0949j get() {
            return new F();
        }
    }

    private long b(double d3, double d4) {
        AbstractC0829j.d(d4 >= d3);
        return (long) ((this.f8591a.nextDouble() * (d4 - d3)) + d3);
    }

    @Override // io.grpc.internal.InterfaceC0949j
    public long a() {
        long j3 = this.f8596f;
        double d3 = j3;
        this.f8596f = Math.min((long) (this.f8594d * d3), this.f8593c);
        double d4 = this.f8595e;
        return j3 + b((-d4) * d3, d4 * d3);
    }
}
