package io.grpc.internal;

import e0.AbstractC0825f;
import e0.AbstractC0826g;
import f0.AbstractC0853l;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
final class E0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f8585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final long f8586b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final long f8587c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final double f8588d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final Long f8589e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final Set f8590f;

    E0(int i3, long j3, long j4, double d3, Long l3, Set set) {
        this.f8585a = i3;
        this.f8586b = j3;
        this.f8587c = j4;
        this.f8588d = d3;
        this.f8589e = l3;
        this.f8590f = AbstractC0853l.p(set);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof E0)) {
            return false;
        }
        E0 e02 = (E0) obj;
        return this.f8585a == e02.f8585a && this.f8586b == e02.f8586b && this.f8587c == e02.f8587c && Double.compare(this.f8588d, e02.f8588d) == 0 && AbstractC0826g.a(this.f8589e, e02.f8589e) && AbstractC0826g.a(this.f8590f, e02.f8590f);
    }

    public int hashCode() {
        return AbstractC0826g.b(Integer.valueOf(this.f8585a), Long.valueOf(this.f8586b), Long.valueOf(this.f8587c), Double.valueOf(this.f8588d), this.f8589e, this.f8590f);
    }

    public String toString() {
        return AbstractC0825f.b(this).b("maxAttempts", this.f8585a).c("initialBackoffNanos", this.f8586b).c("maxBackoffNanos", this.f8587c).a("backoffMultiplier", this.f8588d).d("perAttemptRecvTimeoutNanos", this.f8589e).d("retryableStatusCodes", this.f8590f).toString();
    }
}
