package c2;

/* JADX INFO: loaded from: classes.dex */
final class X0 extends h2.z implements Runnable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f5113e;

    public X0(long j3, M1.d dVar) {
        super(dVar.getContext(), dVar);
        this.f5113e = j3;
    }

    @Override // c2.AbstractC0550a, c2.F0
    public String k0() {
        return super.k0() + "(timeMillis=" + this.f5113e + ')';
    }

    @Override // java.lang.Runnable
    public void run() {
        A(Y0.a(this.f5113e, Y.b(getContext()), this));
    }
}
