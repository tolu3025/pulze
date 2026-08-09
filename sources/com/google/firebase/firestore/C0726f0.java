package com.google.firebase.firestore;

/* JADX INFO: renamed from: com.google.firebase.firestore.f0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0726f0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final C0726f0 f6337g = new C0726f0(0, 0, 0, 0, null, a.SUCCESS);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f6338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f6339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f6340c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f6341d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final a f6342e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Exception f6343f;

    /* JADX INFO: renamed from: com.google.firebase.firestore.f0$a */
    public enum a {
        ERROR,
        RUNNING,
        SUCCESS
    }

    public C0726f0(int i3, int i4, long j3, long j4, Exception exc, a aVar) {
        this.f6338a = i3;
        this.f6339b = i4;
        this.f6340c = j3;
        this.f6341d = j4;
        this.f6342e = aVar;
        this.f6343f = exc;
    }

    public static C0726f0 a(z0.e eVar) {
        return new C0726f0(0, eVar.e(), 0L, eVar.d(), null, a.RUNNING);
    }

    public static C0726f0 b(z0.e eVar) {
        return new C0726f0(eVar.e(), eVar.e(), eVar.d(), eVar.d(), null, a.SUCCESS);
    }

    public long c() {
        return this.f6340c;
    }

    public int d() {
        return this.f6338a;
    }

    public a e() {
        return this.f6342e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0726f0.class != obj.getClass()) {
            return false;
        }
        C0726f0 c0726f0 = (C0726f0) obj;
        if (this.f6338a != c0726f0.f6338a || this.f6339b != c0726f0.f6339b || this.f6340c != c0726f0.f6340c || this.f6341d != c0726f0.f6341d || this.f6342e != c0726f0.f6342e) {
            return false;
        }
        Exception exc = this.f6343f;
        Exception exc2 = c0726f0.f6343f;
        return exc != null ? exc.equals(exc2) : exc2 == null;
    }

    public long f() {
        return this.f6341d;
    }

    public int g() {
        return this.f6339b;
    }

    public int hashCode() {
        int i3 = ((this.f6338a * 31) + this.f6339b) * 31;
        long j3 = this.f6340c;
        int i4 = (i3 + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        long j4 = this.f6341d;
        int iHashCode = (((i4 + ((int) (j4 ^ (j4 >>> 32)))) * 31) + this.f6342e.hashCode()) * 31;
        Exception exc = this.f6343f;
        return iHashCode + (exc != null ? exc.hashCode() : 0);
    }
}
