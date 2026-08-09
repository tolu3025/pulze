package com.google.firebase.firestore;

import J0.AbstractC0386b;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class U {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f6280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f6281b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f6282c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f6283d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private InterfaceC0728g0 f6284e;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f6285a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f6286b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f6287c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f6288d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private InterfaceC0728g0 f6289e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f6290f;

        public b() {
            this.f6290f = false;
            this.f6285a = "firestore.googleapis.com";
            this.f6286b = true;
            this.f6287c = true;
            this.f6288d = 104857600L;
        }

        public U f() {
            if (this.f6286b || !this.f6285a.equals("firestore.googleapis.com")) {
                return new U(this);
            }
            throw new IllegalStateException("You can't set the 'sslEnabled' setting unless you also set a non-default 'host'.");
        }

        public b g(String str) {
            this.f6285a = (String) J0.C.c(str, "Provided host must not be null.");
            return this;
        }

        public b h(InterfaceC0728g0 interfaceC0728g0) {
            if (this.f6290f) {
                throw new IllegalStateException("Deprecated setPersistenceEnabled() or setCacheSizeBytes() is already used, remove those first.");
            }
            if (!(interfaceC0728g0 instanceof C0730h0) && !(interfaceC0728g0 instanceof C0748q0)) {
                throw new IllegalArgumentException("Only MemoryCacheSettings and PersistentCacheSettings are accepted");
            }
            this.f6289e = interfaceC0728g0;
            return this;
        }

        public b i(boolean z2) {
            this.f6286b = z2;
            return this;
        }

        public b(U u2) {
            this.f6290f = false;
            J0.C.c(u2, "Provided settings must not be null.");
            this.f6285a = u2.f6280a;
            this.f6286b = u2.f6281b;
            this.f6287c = u2.f6282c;
            long j3 = u2.f6283d;
            this.f6288d = j3;
            if (!this.f6287c || j3 != 104857600) {
                this.f6290f = true;
            }
            boolean z2 = this.f6290f;
            InterfaceC0728g0 interfaceC0728g0 = u2.f6284e;
            if (z2) {
                AbstractC0386b.d(interfaceC0728g0 == null, "Given settings object mixes both cache config APIs, which is impossible.", new Object[0]);
            } else {
                this.f6289e = interfaceC0728g0;
            }
        }
    }

    private U(b bVar) {
        this.f6280a = bVar.f6285a;
        this.f6281b = bVar.f6286b;
        this.f6282c = bVar.f6287c;
        this.f6283d = bVar.f6288d;
        this.f6284e = bVar.f6289e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || U.class != obj.getClass()) {
            return false;
        }
        U u2 = (U) obj;
        if (this.f6281b == u2.f6281b && this.f6282c == u2.f6282c && this.f6283d == u2.f6283d && this.f6280a.equals(u2.f6280a)) {
            return Objects.equals(this.f6284e, u2.f6284e);
        }
        return false;
    }

    public InterfaceC0728g0 f() {
        return this.f6284e;
    }

    public long g() {
        InterfaceC0728g0 interfaceC0728g0 = this.f6284e;
        if (interfaceC0728g0 == null) {
            return this.f6283d;
        }
        if (interfaceC0728g0 instanceof C0748q0) {
            return ((C0748q0) interfaceC0728g0).a();
        }
        ((C0730h0) interfaceC0728g0).a();
        return -1L;
    }

    public String h() {
        return this.f6280a;
    }

    public int hashCode() {
        int iHashCode = ((((this.f6280a.hashCode() * 31) + (this.f6281b ? 1 : 0)) * 31) + (this.f6282c ? 1 : 0)) * 31;
        long j3 = this.f6283d;
        int i3 = (iHashCode + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        InterfaceC0728g0 interfaceC0728g0 = this.f6284e;
        return i3 + (interfaceC0728g0 != null ? interfaceC0728g0.hashCode() : 0);
    }

    public boolean i() {
        InterfaceC0728g0 interfaceC0728g0 = this.f6284e;
        return interfaceC0728g0 != null ? interfaceC0728g0 instanceof C0748q0 : this.f6282c;
    }

    public boolean j() {
        return this.f6281b;
    }

    public String toString() {
        if (("FirebaseFirestoreSettings{host=" + this.f6280a + ", sslEnabled=" + this.f6281b + ", persistenceEnabled=" + this.f6282c + ", cacheSizeBytes=" + this.f6283d + ", cacheSettings=" + this.f6284e) == null) {
            return "null";
        }
        return this.f6284e.toString() + "}";
    }
}
