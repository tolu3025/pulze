package com.google.firebase.firestore;

/* JADX INFO: loaded from: classes.dex */
public class O0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f6243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f6244b;

    O0(boolean z2, boolean z3) {
        this.f6243a = z2;
        this.f6244b = z3;
    }

    public boolean a() {
        return this.f6243a;
    }

    public boolean b() {
        return this.f6244b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof O0)) {
            return false;
        }
        O0 o02 = (O0) obj;
        return this.f6243a == o02.f6243a && this.f6244b == o02.f6244b;
    }

    public int hashCode() {
        return ((this.f6243a ? 1 : 0) * 31) + (this.f6244b ? 1 : 0);
    }

    public String toString() {
        return "SnapshotMetadata{hasPendingWrites=" + this.f6243a + ", isFromCache=" + this.f6244b + '}';
    }
}
