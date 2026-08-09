package c2;

/* JADX INFO: renamed from: c2.y0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C0598y0 extends E0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final U1.l f5182e;

    public C0598y0(U1.l lVar) {
        this.f5182e = lVar;
    }

    @Override // c2.E0
    public boolean v() {
        return false;
    }

    @Override // c2.E0
    public void w(Throwable th) {
        this.f5182e.invoke(th);
    }
}
