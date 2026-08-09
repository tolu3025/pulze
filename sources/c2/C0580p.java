package c2;

import c2.InterfaceC0574m;
import h2.C0891h;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: c2.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0580p extends AbstractC0551a0 implements InterfaceC0576n, kotlin.coroutines.jvm.internal.e, c1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f5166f = AtomicIntegerFieldUpdater.newUpdater(C0580p.class, "_decisionAndIndex$volatile");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f5167l = AtomicReferenceFieldUpdater.newUpdater(C0580p.class, Object.class, "_state$volatile");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f5168m = AtomicReferenceFieldUpdater.newUpdater(C0580p.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final M1.d f5169d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final M1.g f5170e;

    public C0580p(M1.d dVar, int i3) {
        super(i3);
        this.f5169d = dVar;
        this.f5170e = dVar.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = C0556d.f5121a;
    }

    private final String B() {
        Object objA = A();
        return objA instanceof M0 ? "Active" : objA instanceof C0585s ? "Cancelled" : "Completed";
    }

    private final InterfaceC0561f0 G() {
        InterfaceC0600z0 interfaceC0600z0 = (InterfaceC0600z0) getContext().get(InterfaceC0600z0.f5183i);
        if (interfaceC0600z0 == null) {
            return null;
        }
        InterfaceC0561f0 interfaceC0561f0L = D0.l(interfaceC0600z0, false, new C0587t(this), 1, null);
        androidx.concurrent.futures.b.a(f5168m, this, null, interfaceC0561f0L);
        return interfaceC0561f0L;
    }

    private final void H(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5167l;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof C0556d) {
                if (androidx.concurrent.futures.b.a(f5167l, this, obj2, obj)) {
                    return;
                }
            } else if ((obj2 instanceof InterfaceC0574m) || (obj2 instanceof h2.A)) {
                K(obj, obj2);
            } else {
                boolean z2 = obj2 instanceof C;
                if (z2) {
                    C c3 = (C) obj2;
                    if (!c3.c()) {
                        K(obj, obj2);
                    }
                    if (obj2 instanceof C0585s) {
                        if (!z2) {
                            c3 = null;
                        }
                        Throwable th = c3 != null ? c3.f5057a : null;
                        if (obj instanceof InterfaceC0574m) {
                            p((InterfaceC0574m) obj, th);
                            return;
                        } else {
                            kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                            r((h2.A) obj, th);
                            return;
                        }
                    }
                    return;
                }
                if (obj2 instanceof B) {
                    B b3 = (B) obj2;
                    if (b3.f5051b != null) {
                        K(obj, obj2);
                    }
                    if (obj instanceof h2.A) {
                        return;
                    }
                    kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                    InterfaceC0574m interfaceC0574m = (InterfaceC0574m) obj;
                    if (b3.c()) {
                        p(interfaceC0574m, b3.f5054e);
                        return;
                    } else {
                        if (androidx.concurrent.futures.b.a(f5167l, this, obj2, B.b(b3, null, interfaceC0574m, null, null, null, 29, null))) {
                            return;
                        }
                    }
                } else {
                    if (obj instanceof h2.A) {
                        return;
                    }
                    kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                    if (androidx.concurrent.futures.b.a(f5167l, this, obj2, new B(obj2, (InterfaceC0574m) obj, null, null, null, 28, null))) {
                        return;
                    }
                }
            }
        }
    }

    private final boolean J() {
        if (AbstractC0553b0.c(this.f5117c)) {
            M1.d dVar = this.f5169d;
            kotlin.jvm.internal.m.c(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            if (((C0891h) dVar).r()) {
                return true;
            }
        }
        return false;
    }

    private final void K(Object obj, Object obj2) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + obj + ", already has " + obj2).toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final I1.u Q(U1.l lVar, Throwable th, Object obj, M1.g gVar) {
        lVar.invoke(th);
        return I1.u.f2419a;
    }

    public static /* synthetic */ void S(C0580p c0580p, Object obj, int i3, U1.q qVar, int i4, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resumeImpl");
        }
        if ((i4 & 4) != 0) {
            qVar = null;
        }
        c0580p.R(obj, i3, qVar);
    }

    private final Object T(M0 m02, Object obj, int i3, U1.q qVar, Object obj2) {
        if (obj instanceof C) {
            return obj;
        }
        if (!AbstractC0553b0.b(i3) && obj2 == null) {
            return obj;
        }
        if (qVar == null && !(m02 instanceof InterfaceC0574m) && obj2 == null) {
            return obj;
        }
        return new B(obj, m02 instanceof InterfaceC0574m ? (InterfaceC0574m) m02 : null, qVar, obj2, null, 16, null);
    }

    private final boolean U() {
        int i3;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f5166f;
        do {
            i3 = atomicIntegerFieldUpdater.get(this);
            int i4 = i3 >> 29;
            if (i4 != 0) {
                if (i4 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!f5166f.compareAndSet(this, i3, 1073741824 + (536870911 & i3)));
        return true;
    }

    private final h2.D V(Object obj, Object obj2, U1.q qVar) {
        Object obj3;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5167l;
        do {
            obj3 = atomicReferenceFieldUpdater.get(this);
            if (!(obj3 instanceof M0)) {
                if ((obj3 instanceof B) && obj2 != null && ((B) obj3).f5053d == obj2) {
                    return AbstractC0582q.f5171a;
                }
                return null;
            }
        } while (!androidx.concurrent.futures.b.a(f5167l, this, obj3, T((M0) obj3, obj, this.f5117c, qVar, obj2)));
        v();
        return AbstractC0582q.f5171a;
    }

    private final boolean W() {
        int i3;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f5166f;
        do {
            i3 = atomicIntegerFieldUpdater.get(this);
            int i4 = i3 >> 29;
            if (i4 != 0) {
                if (i4 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!f5166f.compareAndSet(this, i3, 536870912 + (536870911 & i3)));
        return true;
    }

    private final Void o(Object obj) {
        throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
    }

    private final void r(h2.A a3, Throwable th) {
        int i3 = f5166f.get(this) & 536870911;
        if (i3 == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken".toString());
        }
        try {
            a3.s(i3, th, getContext());
        } catch (Throwable th2) {
            M.a(getContext(), new D("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    private final boolean t(Throwable th) {
        if (!J()) {
            return false;
        }
        M1.d dVar = this.f5169d;
        kotlin.jvm.internal.m.c(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return ((C0891h) dVar).s(th);
    }

    private final void v() {
        if (J()) {
            return;
        }
        u();
    }

    private final void w(int i3) {
        if (U()) {
            return;
        }
        AbstractC0553b0.a(this, i3);
    }

    private final InterfaceC0561f0 y() {
        return (InterfaceC0561f0) f5168m.get(this);
    }

    public final Object A() {
        return f5167l.get(this);
    }

    public void F() {
        InterfaceC0561f0 interfaceC0561f0G = G();
        if (interfaceC0561f0G != null && isCompleted()) {
            interfaceC0561f0G.e();
            f5168m.set(this, L0.f5094a);
        }
    }

    public final void I(InterfaceC0574m interfaceC0574m) {
        H(interfaceC0574m);
    }

    protected String L() {
        return "CancellableContinuation";
    }

    public final void M(Throwable th) {
        if (t(th)) {
            return;
        }
        s(th);
        v();
    }

    public final void N() {
        Throwable thU;
        M1.d dVar = this.f5169d;
        C0891h c0891h = dVar instanceof C0891h ? (C0891h) dVar : null;
        if (c0891h == null || (thU = c0891h.u(this)) == null) {
            return;
        }
        u();
        s(thU);
    }

    public final boolean O() {
        Object obj = f5167l.get(this);
        if ((obj instanceof B) && ((B) obj).f5053d != null) {
            u();
            return false;
        }
        f5166f.set(this, 536870911);
        f5167l.set(this, C0556d.f5121a);
        return true;
    }

    public void P(Object obj, final U1.l lVar) {
        R(obj, this.f5117c, lVar != null ? new U1.q() { // from class: c2.o
            @Override // U1.q
            public final Object e(Object obj2, Object obj3, Object obj4) {
                return C0580p.Q(lVar, (Throwable) obj2, obj3, (M1.g) obj4);
            }
        } : null);
    }

    public final void R(Object obj, int i3, U1.q qVar) {
        Object obj2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5167l;
        do {
            obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof M0)) {
                if (obj2 instanceof C0585s) {
                    C0585s c0585s = (C0585s) obj2;
                    if (c0585s.e()) {
                        if (qVar != null) {
                            q(qVar, c0585s.f5057a, obj);
                            return;
                        }
                        return;
                    }
                }
                o(obj);
                throw new I1.d();
            }
        } while (!androidx.concurrent.futures.b.a(f5167l, this, obj2, T((M0) obj2, obj, i3, qVar, null)));
        v();
        w(i3);
    }

    @Override // c2.c1
    public void a(h2.A a3, int i3) {
        int i4;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f5166f;
        do {
            i4 = atomicIntegerFieldUpdater.get(this);
            if ((i4 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once".toString());
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i4, ((i4 >> 29) << 29) + i3));
        H(a3);
    }

    @Override // c2.InterfaceC0576n
    public Object b(Object obj, Object obj2, U1.q qVar) {
        return V(obj, obj2, qVar);
    }

    @Override // c2.InterfaceC0576n
    public void c(U1.l lVar) {
        r.c(this, new InterfaceC0574m.a(lVar));
    }

    @Override // c2.AbstractC0551a0
    public void d(Object obj, Throwable th) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5167l;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof M0) {
                throw new IllegalStateException("Not completed".toString());
            }
            if (obj2 instanceof C) {
                return;
            }
            if (obj2 instanceof B) {
                B b3 = (B) obj2;
                if (!(!b3.c())) {
                    throw new IllegalStateException("Must be called at most once".toString());
                }
                if (androidx.concurrent.futures.b.a(f5167l, this, obj2, B.b(b3, null, null, null, null, th, 15, null))) {
                    b3.d(this, th);
                    return;
                }
            } else if (androidx.concurrent.futures.b.a(f5167l, this, obj2, new B(obj2, null, null, null, th, 14, null))) {
                return;
            }
        }
    }

    @Override // c2.AbstractC0551a0
    public final M1.d e() {
        return this.f5169d;
    }

    @Override // c2.AbstractC0551a0
    public Throwable f(Object obj) {
        Throwable thF = super.f(obj);
        if (thF != null) {
            return thF;
        }
        return null;
    }

    @Override // c2.InterfaceC0576n
    public void g(Object obj, U1.q qVar) {
        R(obj, this.f5117c, qVar);
    }

    @Override // kotlin.coroutines.jvm.internal.e
    public kotlin.coroutines.jvm.internal.e getCallerFrame() {
        M1.d dVar = this.f5169d;
        if (dVar instanceof kotlin.coroutines.jvm.internal.e) {
            return (kotlin.coroutines.jvm.internal.e) dVar;
        }
        return null;
    }

    @Override // M1.d
    public M1.g getContext() {
        return this.f5170e;
    }

    @Override // c2.AbstractC0551a0
    public Object h(Object obj) {
        return obj instanceof B ? ((B) obj).f5050a : obj;
    }

    @Override // c2.InterfaceC0576n
    public boolean isCompleted() {
        return !(A() instanceof M0);
    }

    @Override // c2.AbstractC0551a0
    public Object j() {
        return A();
    }

    @Override // c2.InterfaceC0576n
    public void k(K k3, Object obj) {
        M1.d dVar = this.f5169d;
        C0891h c0891h = dVar instanceof C0891h ? (C0891h) dVar : null;
        S(this, obj, (c0891h != null ? c0891h.f7445d : null) == k3 ? 4 : this.f5117c, null, 4, null);
    }

    @Override // c2.InterfaceC0576n
    public Object m(Throwable th) {
        return V(new C(th, false, 2, null), null, null);
    }

    @Override // c2.InterfaceC0576n
    public void n(Object obj) {
        w(this.f5117c);
    }

    public final void p(InterfaceC0574m interfaceC0574m, Throwable th) {
        try {
            interfaceC0574m.a(th);
        } catch (Throwable th2) {
            M.a(getContext(), new D("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void q(U1.q qVar, Throwable th, Object obj) {
        try {
            qVar.e(th, obj, getContext());
        } catch (Throwable th2) {
            M.a(getContext(), new D("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    @Override // M1.d
    public void resumeWith(Object obj) {
        S(this, E.c(obj, this), this.f5117c, null, 4, null);
    }

    public boolean s(Throwable th) {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5167l;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof M0)) {
                return false;
            }
        } while (!androidx.concurrent.futures.b.a(f5167l, this, obj, new C0585s(this, th, (obj instanceof InterfaceC0574m) || (obj instanceof h2.A))));
        M0 m02 = (M0) obj;
        if (m02 instanceof InterfaceC0574m) {
            p((InterfaceC0574m) obj, th);
        } else if (m02 instanceof h2.A) {
            r((h2.A) obj, th);
        }
        v();
        w(this.f5117c);
        return true;
    }

    public String toString() {
        return L() + '(' + S.c(this.f5169d) + "){" + B() + "}@" + S.b(this);
    }

    public final void u() {
        InterfaceC0561f0 interfaceC0561f0Y = y();
        if (interfaceC0561f0Y == null) {
            return;
        }
        interfaceC0561f0Y.e();
        f5168m.set(this, L0.f5094a);
    }

    public Throwable x(InterfaceC0600z0 interfaceC0600z0) {
        return interfaceC0600z0.getCancellationException();
    }

    public final Object z() {
        InterfaceC0600z0 interfaceC0600z0;
        boolean zJ = J();
        if (W()) {
            if (y() == null) {
                G();
            }
            if (zJ) {
                N();
            }
            return N1.d.e();
        }
        if (zJ) {
            N();
        }
        Object objA = A();
        if (objA instanceof C) {
            throw ((C) objA).f5057a;
        }
        if (!AbstractC0553b0.b(this.f5117c) || (interfaceC0600z0 = (InterfaceC0600z0) getContext().get(InterfaceC0600z0.f5183i)) == null || interfaceC0600z0.isActive()) {
            return h(objA);
        }
        CancellationException cancellationException = interfaceC0600z0.getCancellationException();
        d(objA, cancellationException);
        throw cancellationException;
    }
}
