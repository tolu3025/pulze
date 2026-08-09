package com.google.firebase.firestore;

/* JADX INFO: renamed from: com.google.firebase.firestore.q0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0748q0 implements InterfaceC0728g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f6374a;

    /* JADX INFO: renamed from: com.google.firebase.firestore.q0$b */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f6375a;

        private b() {
            this.f6375a = 104857600L;
        }

        public C0748q0 a() {
            return new C0748q0(this.f6375a);
        }

        public b b(long j3) {
            this.f6375a = j3;
            return this;
        }
    }

    private C0748q0(long j3) {
        this.f6374a = j3;
    }

    public static b b() {
        return new b();
    }

    public long a() {
        return this.f6374a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C0748q0.class == obj.getClass() && this.f6374a == ((C0748q0) obj).f6374a;
    }

    public int hashCode() {
        long j3 = this.f6374a;
        return (int) (j3 ^ (j3 >>> 32));
    }

    public String toString() {
        return "PersistentCacheSettings{sizeBytes=" + this.f6374a + '}';
    }
}
