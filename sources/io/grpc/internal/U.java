package io.grpc.internal;

import e0.AbstractC0825f;
import e0.AbstractC0826g;
import f0.AbstractC0853l;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
final class U {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f8725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final long f8726b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Set f8727c;

    U(int i3, long j3, Set set) {
        this.f8725a = i3;
        this.f8726b = j3;
        this.f8727c = AbstractC0853l.p(set);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || U.class != obj.getClass()) {
            return false;
        }
        U u2 = (U) obj;
        return this.f8725a == u2.f8725a && this.f8726b == u2.f8726b && AbstractC0826g.a(this.f8727c, u2.f8727c);
    }

    public int hashCode() {
        return AbstractC0826g.b(Integer.valueOf(this.f8725a), Long.valueOf(this.f8726b), this.f8727c);
    }

    public String toString() {
        return AbstractC0825f.b(this).b("maxAttempts", this.f8725a).c("hedgingDelayNanos", this.f8726b).d("nonFatalStatusCodes", this.f8727c).toString();
    }
}
