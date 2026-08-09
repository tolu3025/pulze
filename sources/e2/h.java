package e2;

import c2.A0;
import c2.AbstractC0550a;
import c2.F0;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public abstract class h extends AbstractC0550a implements g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final g f7165d;

    public h(M1.g gVar, g gVar2, boolean z2, boolean z3) {
        super(gVar, z2, z3);
        this.f7165d = gVar2;
    }

    @Override // c2.F0
    public void D(Throwable th) {
        CancellationException cancellationExceptionB0 = F0.B0(this, th, null, 1, null);
        this.f7165d.cancel(cancellationExceptionB0);
        A(cancellationExceptionB0);
    }

    protected final g M0() {
        return this.f7165d;
    }

    @Override // e2.w
    public boolean a(Throwable th) {
        return this.f7165d.a(th);
    }

    @Override // c2.F0, c2.InterfaceC0600z0
    public /* synthetic */ void cancel() {
        D(new A0(G(), null, this));
    }

    @Override // e2.v
    public Object d(M1.d dVar) {
        return this.f7165d.d(dVar);
    }

    @Override // e2.w
    public Object h(Object obj, M1.d dVar) {
        return this.f7165d.h(obj, dVar);
    }

    @Override // e2.v
    public Object i() {
        return this.f7165d.i();
    }

    @Override // e2.v
    public i iterator() {
        return this.f7165d.iterator();
    }

    @Override // e2.w
    public Object j(Object obj) {
        return this.f7165d.j(obj);
    }

    @Override // c2.F0, c2.InterfaceC0600z0
    public final void cancel(CancellationException cancellationException) {
        if (isCancelled()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new A0(G(), null, this);
        }
        D(cancellationException);
    }

    @Override // c2.F0, c2.InterfaceC0600z0
    public final /* synthetic */ boolean cancel(Throwable th) {
        D(new A0(G(), null, this));
        return true;
    }
}
