package com.google.firebase.firestore;

/* JADX INFO: renamed from: com.google.firebase.firestore.h0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0730h0 implements InterfaceC0728g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private InterfaceC0734j0 f6349a;

    /* JADX INFO: renamed from: com.google.firebase.firestore.h0$b */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private InterfaceC0734j0 f6350a;

        private b() {
            this.f6350a = C0732i0.a().a();
        }

        public C0730h0 a() {
            return new C0730h0(this.f6350a);
        }
    }

    private C0730h0(InterfaceC0734j0 interfaceC0734j0) {
        this.f6349a = interfaceC0734j0;
    }

    public static b b() {
        return new b();
    }

    public InterfaceC0734j0 a() {
        return this.f6349a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0730h0.class != obj.getClass()) {
            return false;
        }
        return a().equals(((C0730h0) obj).a());
    }

    public int hashCode() {
        return this.f6349a.hashCode();
    }

    public String toString() {
        return "MemoryCacheSettings{gcSettings=" + a() + "}";
    }
}
