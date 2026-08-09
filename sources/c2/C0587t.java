package c2;

/* JADX INFO: renamed from: c2.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C0587t extends E0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C0580p f5175e;

    public C0587t(C0580p c0580p) {
        this.f5175e = c0580p;
    }

    @Override // c2.E0
    public boolean v() {
        return true;
    }

    @Override // c2.E0
    public void w(Throwable th) {
        C0580p c0580p = this.f5175e;
        c0580p.M(c0580p.x(u()));
    }
}
