package io.grpc.internal;

import e0.AbstractC0829j;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: io.grpc.internal.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0943g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Logger f8909c = Logger.getLogger(C0943g.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f8910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicLong f8911b;

    /* JADX INFO: renamed from: io.grpc.internal.g$b */
    public final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f8912a;

        private b(long j3) {
            this.f8912a = j3;
        }

        public void a() {
            long j3 = this.f8912a;
            long jMax = Math.max(2 * j3, j3);
            if (C0943g.this.f8911b.compareAndSet(this.f8912a, jMax)) {
                C0943g.f8909c.log(Level.WARNING, "Increased {0} to {1}", new Object[]{C0943g.this.f8910a, Long.valueOf(jMax)});
            }
        }

        public long b() {
            return this.f8912a;
        }
    }

    public C0943g(String str, long j3) {
        AtomicLong atomicLong = new AtomicLong();
        this.f8911b = atomicLong;
        AbstractC0829j.e(j3 > 0, "value must be positive");
        this.f8910a = str;
        atomicLong.set(j3);
    }

    public b d() {
        return new b(this.f8911b.get());
    }
}
