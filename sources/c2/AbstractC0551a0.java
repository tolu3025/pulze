package c2;

import I1.n;
import h2.C0891h;
import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: c2.a0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0551a0 extends j2.h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f5117c;

    public AbstractC0551a0(int i3) {
        this.f5117c = i3;
    }

    public abstract M1.d e();

    public Throwable f(Object obj) {
        C c3 = obj instanceof C ? (C) obj : null;
        if (c3 != null) {
            return c3.f5057a;
        }
        return null;
    }

    public final void i(Throwable th) {
        M.a(e().getContext(), new Q("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public abstract Object j();

    @Override // java.lang.Runnable
    public final void run() {
        Object objB;
        try {
            M1.d dVarE = e();
            kotlin.jvm.internal.m.c(dVarE, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            C0891h c0891h = (C0891h) dVarE;
            M1.d dVar = c0891h.f7446e;
            Object obj = c0891h.f7448l;
            M1.g context = dVar.getContext();
            Object objI = h2.K.i(context, obj);
            InterfaceC0600z0 interfaceC0600z0 = null;
            a1 a1VarM = objI != h2.K.f7428a ? I.m(dVar, context, objI) : null;
            try {
                M1.g context2 = dVar.getContext();
                Object objJ = j();
                Throwable thF = f(objJ);
                if (thF == null && AbstractC0553b0.b(this.f5117c)) {
                    interfaceC0600z0 = (InterfaceC0600z0) context2.get(InterfaceC0600z0.f5183i);
                }
                if (interfaceC0600z0 != null && !interfaceC0600z0.isActive()) {
                    CancellationException cancellationException = interfaceC0600z0.getCancellationException();
                    d(objJ, cancellationException);
                    n.a aVar = I1.n.f2411b;
                    objB = I1.n.b(I1.o.a(cancellationException));
                } else if (thF != null) {
                    n.a aVar2 = I1.n.f2411b;
                    objB = I1.n.b(I1.o.a(thF));
                } else {
                    n.a aVar3 = I1.n.f2411b;
                    objB = I1.n.b(h(objJ));
                }
                dVar.resumeWith(objB);
                I1.u uVar = I1.u.f2419a;
                if (a1VarM == null || a1VarM.M0()) {
                    h2.K.f(context, objI);
                }
            } catch (Throwable th) {
                if (a1VarM == null || a1VarM.M0()) {
                    h2.K.f(context, objI);
                }
                throw th;
            }
        } catch (Throwable th2) {
            i(th2);
        }
    }

    public Object h(Object obj) {
        return obj;
    }

    public void d(Object obj, Throwable th) {
    }
}
