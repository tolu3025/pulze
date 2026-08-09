package com.google.firebase.firestore;

/* JADX INFO: loaded from: classes.dex */
public final class T0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final T0 f6277b = new b().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f6278a;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f6279a = 5;

        public T0 a() {
            return new T0(this.f6279a);
        }

        public b b(int i3) {
            if (i3 < 1) {
                throw new IllegalArgumentException("Max attempts must be at least 1");
            }
            this.f6279a = i3;
            return this;
        }
    }

    private T0(int i3) {
        this.f6278a = i3;
    }

    public int a() {
        return this.f6278a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && T0.class == obj.getClass() && this.f6278a == ((T0) obj).f6278a;
    }

    public int hashCode() {
        return this.f6278a;
    }

    public String toString() {
        return "TransactionOptions{maxAttempts=" + this.f6278a + '}';
    }
}
