package c2;

/* JADX INFO: loaded from: classes.dex */
public final class a1 extends h2.z {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ThreadLocal f5118e;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    public a1(M1.g gVar, M1.d dVar) {
        b1 b1Var = b1.f5119a;
        super(gVar.get(b1Var) == null ? gVar.plus(b1Var) : gVar, dVar);
        this.f5118e = new ThreadLocal();
        if (dVar.getContext().get(M1.e.f2704g) instanceof K) {
            return;
        }
        Object objI = h2.K.i(gVar, null);
        h2.K.f(gVar, objI);
        N0(gVar, objI);
    }

    @Override // h2.z, c2.AbstractC0550a
    protected void I0(Object obj) {
        if (this.threadLocalIsSet) {
            I1.m mVar = (I1.m) this.f5118e.get();
            if (mVar != null) {
                h2.K.f((M1.g) mVar.a(), mVar.b());
            }
            this.f5118e.remove();
        }
        Object objA = E.a(obj, this.f7480d);
        M1.d dVar = this.f7480d;
        M1.g context = dVar.getContext();
        Object objI = h2.K.i(context, null);
        a1 a1VarM = objI != h2.K.f7428a ? I.m(dVar, context, objI) : null;
        try {
            this.f7480d.resumeWith(objA);
            I1.u uVar = I1.u.f2419a;
        } finally {
            if (a1VarM == null || a1VarM.M0()) {
                h2.K.f(context, objI);
            }
        }
    }

    public final boolean M0() {
        boolean z2 = this.threadLocalIsSet && this.f5118e.get() == null;
        this.f5118e.remove();
        return !z2;
    }

    public final void N0(M1.g gVar, Object obj) {
        this.threadLocalIsSet = true;
        this.f5118e.set(I1.q.a(gVar, obj));
    }
}
