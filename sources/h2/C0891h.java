package h2;

import c2.AbstractC0551a0;
import c2.AbstractC0569j0;
import c2.C0580p;
import c2.InterfaceC0576n;
import c2.S;
import c2.V0;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: h2.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0891h extends AbstractC0551a0 implements kotlin.coroutines.jvm.internal.e, M1.d {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f7444m = AtomicReferenceFieldUpdater.newUpdater(C0891h.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c2.K f7445d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final M1.d f7446e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f7447f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Object f7448l;

    public C0891h(c2.K k3, M1.d dVar) {
        super(-1);
        this.f7445d = k3;
        this.f7446e = dVar;
        this.f7447f = AbstractC0892i.f7449a;
        this.f7448l = K.g(getContext());
    }

    private final C0580p p() {
        Object obj = f7444m.get(this);
        if (obj instanceof C0580p) {
            return (C0580p) obj;
        }
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.e
    public kotlin.coroutines.jvm.internal.e getCallerFrame() {
        M1.d dVar = this.f7446e;
        if (dVar instanceof kotlin.coroutines.jvm.internal.e) {
            return (kotlin.coroutines.jvm.internal.e) dVar;
        }
        return null;
    }

    @Override // M1.d
    public M1.g getContext() {
        return this.f7446e.getContext();
    }

    @Override // c2.AbstractC0551a0
    public Object j() {
        Object obj = this.f7447f;
        this.f7447f = AbstractC0892i.f7449a;
        return obj;
    }

    public final void l() {
        while (f7444m.get(this) == AbstractC0892i.f7450b) {
        }
    }

    public final C0580p o() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7444m;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                f7444m.set(this, AbstractC0892i.f7450b);
                return null;
            }
            if (obj instanceof C0580p) {
                if (androidx.concurrent.futures.b.a(f7444m, this, obj, AbstractC0892i.f7450b)) {
                    return (C0580p) obj;
                }
            } else if (obj != AbstractC0892i.f7450b && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
    }

    public final boolean r() {
        return f7444m.get(this) != null;
    }

    @Override // M1.d
    public void resumeWith(Object obj) {
        Object objB = c2.E.b(obj);
        if (this.f7445d.V(getContext())) {
            this.f7447f = objB;
            this.f5117c = 0;
            this.f7445d.U(getContext(), this);
            return;
        }
        AbstractC0569j0 abstractC0569j0B = V0.f5110a.b();
        if (abstractC0569j0B.f0()) {
            this.f7447f = objB;
            this.f5117c = 0;
            abstractC0569j0B.b0(this);
            return;
        }
        abstractC0569j0B.d0(true);
        try {
            M1.g context = getContext();
            Object objI = K.i(context, this.f7448l);
            try {
                this.f7446e.resumeWith(obj);
                I1.u uVar = I1.u.f2419a;
                while (abstractC0569j0B.i0()) {
                }
            } finally {
                K.f(context, objI);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public final boolean s(Throwable th) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7444m;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            D d3 = AbstractC0892i.f7450b;
            if (kotlin.jvm.internal.m.a(obj, d3)) {
                if (androidx.concurrent.futures.b.a(f7444m, this, d3, th)) {
                    return true;
                }
            } else {
                if (obj instanceof Throwable) {
                    return true;
                }
                if (androidx.concurrent.futures.b.a(f7444m, this, obj, null)) {
                    return false;
                }
            }
        }
    }

    public final void t() {
        l();
        C0580p c0580pP = p();
        if (c0580pP != null) {
            c0580pP.u();
        }
    }

    public String toString() {
        return "DispatchedContinuation[" + this.f7445d + ", " + S.c(this.f7446e) + ']';
    }

    public final Throwable u(InterfaceC0576n interfaceC0576n) {
        D d3;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7444m;
        do {
            Object obj = atomicReferenceFieldUpdater.get(this);
            d3 = AbstractC0892i.f7450b;
            if (obj != d3) {
                if (obj instanceof Throwable) {
                    if (androidx.concurrent.futures.b.a(f7444m, this, obj, null)) {
                        return (Throwable) obj;
                    }
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        } while (!androidx.concurrent.futures.b.a(f7444m, this, d3, interfaceC0576n));
        return null;
    }

    @Override // c2.AbstractC0551a0
    public M1.d e() {
        return this;
    }
}
