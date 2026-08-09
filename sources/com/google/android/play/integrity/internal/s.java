package com.google.android.play.integrity.internal;

/* JADX INFO: loaded from: classes.dex */
final class s extends t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f5899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f5900b;

    s(int i3, long j3) {
        this.f5899a = i3;
        this.f5900b = j3;
    }

    @Override // com.google.android.play.integrity.internal.t
    public final int a() {
        return this.f5899a;
    }

    @Override // com.google.android.play.integrity.internal.t
    public final long b() {
        return this.f5900b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof t) {
            t tVar = (t) obj;
            if (this.f5899a == tVar.a() && this.f5900b == tVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f5900b;
        return ((int) (j3 ^ (j3 >>> 32))) ^ ((this.f5899a ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "EventRecord{eventType=" + this.f5899a + ", eventTimestamp=" + this.f5900b + "}";
    }
}
