package I0;

import A0.AbstractC0212j;
import J0.AbstractC0386b;

/* JADX INFO: loaded from: classes.dex */
public class N {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private I f2178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private P f2179b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private C0384z f2180c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private r f2181d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private InterfaceC0374o f2182e;

    protected InterfaceC0374o a(AbstractC0212j.a aVar) {
        return new C0370k(aVar.f171a);
    }

    protected r b(AbstractC0212j.a aVar) {
        return new r(aVar.f172b, j(), h());
    }

    protected C0384z c(AbstractC0212j.a aVar) {
        return new C0384z(aVar.f172b, aVar.f176f, aVar.f177g, aVar.f173c.a(), aVar.f178h, i());
    }

    protected I d(AbstractC0212j.a aVar) {
        return new I(aVar.f172b, aVar.f171a, aVar.f173c, new C0380v(aVar.f176f, aVar.f177g));
    }

    protected P e(AbstractC0212j.a aVar) {
        return new P(aVar.f173c.a());
    }

    public InterfaceC0374o f() {
        return (InterfaceC0374o) AbstractC0386b.e(this.f2182e, "connectivityMonitor not initialized yet", new Object[0]);
    }

    public r g() {
        return (r) AbstractC0386b.e(this.f2181d, "datastore not initialized yet", new Object[0]);
    }

    public C0384z h() {
        return (C0384z) AbstractC0386b.e(this.f2180c, "firestoreChannel not initialized yet", new Object[0]);
    }

    public I i() {
        return (I) AbstractC0386b.e(this.f2178a, "grpcCallProvider not initialized yet", new Object[0]);
    }

    public P j() {
        return (P) AbstractC0386b.e(this.f2179b, "remoteSerializer not initialized yet", new Object[0]);
    }

    public void k(AbstractC0212j.a aVar) {
        this.f2179b = e(aVar);
        this.f2178a = d(aVar);
        this.f2180c = c(aVar);
        this.f2181d = b(aVar);
        this.f2182e = a(aVar);
    }
}
