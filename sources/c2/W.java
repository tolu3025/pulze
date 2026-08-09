package c2;

/* JADX INFO: loaded from: classes.dex */
class W extends AbstractC0550a implements V {
    public W(M1.g gVar, boolean z2) {
        super(gVar, true, z2);
    }

    static /* synthetic */ Object M0(W w2, M1.d dVar) throws Throwable {
        Object objX = w2.x(dVar);
        N1.d.e();
        return objX;
    }

    @Override // c2.V
    public Object await(M1.d dVar) {
        return M0(this, dVar);
    }

    @Override // c2.V
    public Object getCompleted() {
        return N();
    }
}
