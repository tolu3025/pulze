package io.grpc.internal;

import e0.AbstractC0826g;
import e0.AbstractC0829j;
import y1.C1300c;
import y1.S;

/* JADX INFO: renamed from: io.grpc.internal.w0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0975w0 extends S.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1300c f9359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final y1.Z f9360b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final y1.a0 f9361c;

    public C0975w0(y1.a0 a0Var, y1.Z z2, C1300c c1300c) {
        this.f9361c = (y1.a0) AbstractC0829j.o(a0Var, "method");
        this.f9360b = (y1.Z) AbstractC0829j.o(z2, "headers");
        this.f9359a = (C1300c) AbstractC0829j.o(c1300c, "callOptions");
    }

    @Override // y1.S.g
    public C1300c a() {
        return this.f9359a;
    }

    @Override // y1.S.g
    public y1.Z b() {
        return this.f9360b;
    }

    @Override // y1.S.g
    public y1.a0 c() {
        return this.f9361c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0975w0.class != obj.getClass()) {
            return false;
        }
        C0975w0 c0975w0 = (C0975w0) obj;
        return AbstractC0826g.a(this.f9359a, c0975w0.f9359a) && AbstractC0826g.a(this.f9360b, c0975w0.f9360b) && AbstractC0826g.a(this.f9361c, c0975w0.f9361c);
    }

    public int hashCode() {
        return AbstractC0826g.b(this.f9359a, this.f9360b, this.f9361c);
    }

    public final String toString() {
        return "[method=" + this.f9361c + " headers=" + this.f9360b + " callOptions=" + this.f9359a + "]";
    }
}
