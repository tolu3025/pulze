package com.google.firebase.firestore;

import com.google.protobuf.AbstractC0791i;

/* JADX INFO: renamed from: com.google.firebase.firestore.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0727g implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AbstractC0791i f6348a;

    private C0727g(AbstractC0791i abstractC0791i) {
        this.f6348a = abstractC0791i;
    }

    public static C0727g e(AbstractC0791i abstractC0791i) {
        J0.C.c(abstractC0791i, "Provided ByteString must not be null.");
        return new C0727g(abstractC0791i);
    }

    public static C0727g g(byte[] bArr) {
        J0.C.c(bArr, "Provided bytes array must not be null.");
        return new C0727g(AbstractC0791i.p(bArr));
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public int compareTo(C0727g c0727g) {
        return J0.L.h(this.f6348a, c0727g.f6348a);
    }

    public boolean equals(Object obj) {
        return (obj instanceof C0727g) && this.f6348a.equals(((C0727g) obj).f6348a);
    }

    public AbstractC0791i h() {
        return this.f6348a;
    }

    public int hashCode() {
        return this.f6348a.hashCode();
    }

    public byte[] i() {
        return this.f6348a.F();
    }

    public String toString() {
        return "Blob { bytes=" + J0.L.v(this.f6348a) + " }";
    }
}
