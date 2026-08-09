package com.google.firebase.firestore;

/* JADX INFO: renamed from: com.google.firebase.firestore.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0731i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f6351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final E0 f6352b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f6353c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f6354d;

    /* JADX INFO: renamed from: com.google.firebase.firestore.i$a */
    public enum a {
        ADDED,
        MODIFIED,
        REMOVED
    }

    C0731i(E0 e02, a aVar, int i3, int i4) {
        this.f6351a = aVar;
        this.f6352b = e02;
        this.f6353c = i3;
        this.f6354d = i4;
    }

    public E0 a() {
        return this.f6352b;
    }

    public int b() {
        return this.f6354d;
    }

    public int c() {
        return this.f6353c;
    }

    public a d() {
        return this.f6351a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0731i)) {
            return false;
        }
        C0731i c0731i = (C0731i) obj;
        return this.f6351a.equals(c0731i.f6351a) && this.f6352b.equals(c0731i.f6352b) && this.f6353c == c0731i.f6353c && this.f6354d == c0731i.f6354d;
    }

    public int hashCode() {
        return (((((this.f6351a.hashCode() * 31) + this.f6352b.hashCode()) * 31) + this.f6353c) * 31) + this.f6354d;
    }
}
