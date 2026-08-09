package c2;

/* JADX INFO: renamed from: c2.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C0597y extends F0 implements InterfaceC0595x {
    public C0597y(InterfaceC0600z0 interfaceC0600z0) {
        super(true);
        c0(interfaceC0600z0);
    }

    @Override // c2.F0
    public boolean U() {
        return true;
    }

    @Override // c2.V
    public Object await(M1.d dVar) throws Throwable {
        Object objX = x(dVar);
        N1.d.e();
        return objX;
    }

    @Override // c2.V
    public Object getCompleted() {
        return N();
    }

    @Override // c2.V
    public k2.c getOnAwait() {
        k2.c cVarT = T();
        kotlin.jvm.internal.m.c(cVarT, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectClause1<T of kotlinx.coroutines.CompletableDeferredImpl>");
        return cVarT;
    }

    @Override // c2.InterfaceC0595x
    public boolean r(Throwable th) {
        return i0(new C(th, false, 2, null));
    }

    @Override // c2.InterfaceC0595x
    public boolean u(Object obj) {
        return i0(obj);
    }
}
