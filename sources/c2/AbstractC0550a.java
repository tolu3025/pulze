package c2;

/* JADX INFO: renamed from: c2.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0550a extends F0 implements InterfaceC0600z0, M1.d, N {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final M1.g f5116c;

    public AbstractC0550a(M1.g gVar, boolean z2, boolean z3) {
        super(z3);
        if (z2) {
            c0((InterfaceC0600z0) gVar.get(InterfaceC0600z0.f5183i));
        }
        this.f5116c = gVar.plus(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // c2.F0
    public String G() {
        return S.a(this) + " was cancelled";
    }

    protected void I0(Object obj) {
        w(obj);
    }

    public final void L0(P p2, Object obj, U1.p pVar) {
        p2.e(pVar, obj, this);
    }

    @Override // c2.F0
    public final void b0(Throwable th) {
        M.a(this.f5116c, th);
    }

    @Override // c2.N
    public M1.g e() {
        return this.f5116c;
    }

    @Override // M1.d
    public final M1.g getContext() {
        return this.f5116c;
    }

    @Override // c2.F0, c2.InterfaceC0600z0
    public boolean isActive() {
        return super.isActive();
    }

    @Override // c2.F0
    public String k0() {
        String strG = I.g(this.f5116c);
        if (strG == null) {
            return super.k0();
        }
        return '\"' + strG + "\":" + super.k0();
    }

    @Override // c2.F0
    protected final void r0(Object obj) {
        if (!(obj instanceof C)) {
            K0(obj);
        } else {
            C c3 = (C) obj;
            J0(c3.f5057a, c3.a());
        }
    }

    @Override // M1.d
    public final void resumeWith(Object obj) {
        Object objJ0 = j0(E.b(obj));
        if (objJ0 == G0.f5083b) {
            return;
        }
        I0(objJ0);
    }

    protected void K0(Object obj) {
    }

    protected void J0(Throwable th, boolean z2) {
    }
}
