package D0;

import V0.I;

/* JADX INFO: loaded from: classes.dex */
public final class s implements i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l f1281b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private b f1282c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private w f1283d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private w f1284e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private w f1285f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private t f1286g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private a f1287h;

    private enum a {
        HAS_LOCAL_MUTATIONS,
        HAS_COMMITTED_MUTATIONS,
        SYNCED
    }

    private enum b {
        INVALID,
        FOUND_DOCUMENT,
        NO_DOCUMENT,
        UNKNOWN_DOCUMENT
    }

    private s(l lVar) {
        this.f1281b = lVar;
        this.f1284e = w.f1302b;
    }

    public static s q(l lVar, w wVar, t tVar) {
        return new s(lVar).a(wVar, tVar);
    }

    public static s r(l lVar) {
        b bVar = b.INVALID;
        w wVar = w.f1302b;
        return new s(lVar, bVar, wVar, wVar, new t(), a.SYNCED);
    }

    public static s s(l lVar, w wVar) {
        return new s(lVar).m(wVar);
    }

    public static s t(l lVar, w wVar) {
        return new s(lVar).n(wVar);
    }

    public s a(w wVar, t tVar) {
        this.f1283d = wVar;
        this.f1282c = b.FOUND_DOCUMENT;
        this.f1286g = tVar;
        this.f1287h = a.SYNCED;
        return this;
    }

    @Override // D0.i
    public t b() {
        return this.f1286g;
    }

    @Override // D0.i
    public s c() {
        return new s(this.f1281b, this.f1282c, this.f1283d, this.f1284e, this.f1286g.clone(), this.f1287h);
    }

    @Override // D0.i
    public boolean d() {
        return this.f1282c.equals(b.FOUND_DOCUMENT);
    }

    @Override // D0.i
    public I e(r rVar) {
        return b().i(rVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || s.class != obj.getClass()) {
            return false;
        }
        s sVar = (s) obj;
        if (this.f1281b.equals(sVar.f1281b) && this.f1283d.equals(sVar.f1283d) && this.f1282c.equals(sVar.f1282c) && this.f1287h.equals(sVar.f1287h)) {
            return this.f1286g.equals(sVar.f1286g);
        }
        return false;
    }

    @Override // D0.i
    public boolean f() {
        return this.f1287h.equals(a.HAS_COMMITTED_MUTATIONS);
    }

    @Override // D0.i
    public boolean g() {
        return this.f1287h.equals(a.HAS_LOCAL_MUTATIONS);
    }

    @Override // D0.i
    public l getKey() {
        return this.f1281b;
    }

    @Override // D0.i
    public boolean h() {
        return g() || f();
    }

    public int hashCode() {
        return this.f1281b.hashCode();
    }

    @Override // D0.i
    public w i() {
        return this.f1284e;
    }

    @Override // D0.i
    public boolean j() {
        return this.f1282c.equals(b.NO_DOCUMENT);
    }

    @Override // D0.i
    public boolean k() {
        return this.f1282c.equals(b.UNKNOWN_DOCUMENT);
    }

    @Override // D0.i
    public w l() {
        return this.f1283d;
    }

    public s m(w wVar) {
        this.f1283d = wVar;
        this.f1282c = b.NO_DOCUMENT;
        this.f1286g = new t();
        this.f1287h = a.SYNCED;
        return this;
    }

    public s n(w wVar) {
        this.f1283d = wVar;
        this.f1282c = b.UNKNOWN_DOCUMENT;
        this.f1286g = new t();
        this.f1287h = a.HAS_COMMITTED_MUTATIONS;
        return this;
    }

    public w o() {
        return this.f1285f;
    }

    public boolean p() {
        return !this.f1282c.equals(b.INVALID);
    }

    public String toString() {
        return "Document{key=" + this.f1281b + ", version=" + this.f1283d + ", readTime=" + this.f1284e + ", type=" + this.f1282c + ", documentState=" + this.f1287h + ", value=" + this.f1286g + '}';
    }

    public s u() {
        this.f1287h = a.HAS_COMMITTED_MUTATIONS;
        return this;
    }

    public s v() {
        this.f1287h = a.HAS_LOCAL_MUTATIONS;
        this.f1283d = w.f1302b;
        return this;
    }

    public s w(w wVar) {
        this.f1284e = wVar;
        return this;
    }

    private s(l lVar, b bVar, w wVar, w wVar2, t tVar, a aVar) {
        this.f1281b = lVar;
        this.f1283d = wVar;
        this.f1284e = wVar2;
        this.f1282c = bVar;
        this.f1287h = aVar;
        this.f1286g = tVar;
    }
}
