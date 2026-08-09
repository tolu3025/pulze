package l2;

import I1.u;
import U1.p;
import U1.q;
import c2.InterfaceC0576n;
import c2.c1;
import e2.l;
import h2.A;
import h2.AbstractC0884a;
import h2.B;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public class i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f9812c = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "head$volatile");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f9813d = AtomicLongFieldUpdater.newUpdater(i.class, "deqIdx$volatile");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f9814e = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "tail$volatile");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f9815f = AtomicLongFieldUpdater.newUpdater(i.class, "enqIdx$volatile");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f9816g = AtomicIntegerFieldUpdater.newUpdater(i.class, "_availablePermits$volatile");
    private volatile /* synthetic */ int _availablePermits$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f9817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final q f9818b;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    /* synthetic */ class a extends kotlin.jvm.internal.k implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f9819a = new a();

        a() {
            super(2, j.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);
        }

        public final k c(long j3, k kVar) {
            return j.h(j3, kVar);
        }

        @Override // U1.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return c(((Number) obj).longValue(), (k) obj2);
        }
    }

    /* synthetic */ class b extends kotlin.jvm.internal.k implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f9820a = new b();

        b() {
            super(2, j.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);
        }

        public final k c(long j3, k kVar) {
            return j.h(j3, kVar);
        }

        @Override // U1.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return c(((Number) obj).longValue(), (k) obj2);
        }
    }

    public i(int i3, int i4) {
        this.f9817a = i3;
        if (i3 <= 0) {
            throw new IllegalArgumentException(("Semaphore should have at least 1 permit, but had " + i3).toString());
        }
        if (i4 < 0 || i4 > i3) {
            throw new IllegalArgumentException(("The number of acquired permits should be in 0.." + i3).toString());
        }
        k kVar = new k(0L, null, 2);
        this.head$volatile = kVar;
        this.tail$volatile = kVar;
        this._availablePermits$volatile = i3 - i4;
        this.f9818b = new q() { // from class: l2.h
            @Override // U1.q
            public final Object e(Object obj, Object obj2, Object obj3) {
                return i.o(this.f9811a, (Throwable) obj, (u) obj2, (M1.g) obj3);
            }
        };
    }

    private final boolean f(c1 c1Var) {
        Object objC;
        k kVar = (k) f9814e.get(this);
        long andIncrement = f9815f.getAndIncrement(this);
        a aVar = a.f9819a;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9814e;
        long j3 = andIncrement / ((long) j.f9826f);
        loop0: while (true) {
            objC = AbstractC0884a.c(kVar, j3, aVar);
            if (!B.c(objC)) {
                A aB = B.b(objC);
                while (true) {
                    A a3 = (A) atomicReferenceFieldUpdater.get(this);
                    if (a3.f7422c >= aB.f7422c) {
                        break loop0;
                    }
                    if (!aB.u()) {
                        break;
                    }
                    if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, a3, aB)) {
                        if (a3.p()) {
                            a3.n();
                        }
                    } else if (aB.p()) {
                        aB.n();
                    }
                }
            } else {
                break;
            }
        }
        k kVar2 = (k) B.b(objC);
        int i3 = (int) (andIncrement % ((long) j.f9826f));
        if (l.a(kVar2.v(), i3, null, c1Var)) {
            c1Var.a(kVar2, i3);
            return true;
        }
        if (!l.a(kVar2.v(), i3, j.f9822b, j.f9823c)) {
            return false;
        }
        if (c1Var instanceof InterfaceC0576n) {
            m.c(c1Var, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            ((InterfaceC0576n) c1Var).g(u.f2419a, this.f9818b);
            return true;
        }
        throw new IllegalStateException(("unexpected: " + c1Var).toString());
    }

    private final void g() {
        int i3;
        do {
            i3 = f9816g.get(this);
            if (i3 <= this.f9817a) {
                return;
            }
        } while (!f9816g.compareAndSet(this, i3, this.f9817a));
    }

    private final int h() {
        int andDecrement;
        do {
            andDecrement = f9816g.getAndDecrement(this);
        } while (andDecrement > this.f9817a);
        return andDecrement;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u o(i iVar, Throwable th, u uVar, M1.g gVar) {
        iVar.p();
        return u.f2419a;
    }

    private final boolean r(Object obj) {
        if (!(obj instanceof InterfaceC0576n)) {
            throw new IllegalStateException(("unexpected: " + obj).toString());
        }
        m.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
        InterfaceC0576n interfaceC0576n = (InterfaceC0576n) obj;
        Object objB = interfaceC0576n.b(u.f2419a, null, this.f9818b);
        if (objB == null) {
            return false;
        }
        interfaceC0576n.n(objB);
        return true;
    }

    private final boolean s() {
        Object objC;
        k kVar = (k) f9812c.get(this);
        long andIncrement = f9813d.getAndIncrement(this);
        long j3 = andIncrement / ((long) j.f9826f);
        b bVar = b.f9820a;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9812c;
        loop0: while (true) {
            objC = AbstractC0884a.c(kVar, j3, bVar);
            if (B.c(objC)) {
                break;
            }
            A aB = B.b(objC);
            while (true) {
                A a3 = (A) atomicReferenceFieldUpdater.get(this);
                if (a3.f7422c >= aB.f7422c) {
                    break loop0;
                }
                if (!aB.u()) {
                    break;
                }
                if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, a3, aB)) {
                    if (a3.p()) {
                        a3.n();
                    }
                } else if (aB.p()) {
                    aB.n();
                }
            }
        }
        k kVar2 = (k) B.b(objC);
        kVar2.c();
        if (kVar2.f7422c > j3) {
            return false;
        }
        int i3 = (int) (andIncrement % ((long) j.f9826f));
        Object andSet = kVar2.v().getAndSet(i3, j.f9822b);
        if (andSet != null) {
            if (andSet == j.f9825e) {
                return false;
            }
            return r(andSet);
        }
        int i4 = j.f9821a;
        for (int i5 = 0; i5 < i4; i5++) {
            if (kVar2.v().get(i3) == j.f9823c) {
                return true;
            }
        }
        return !l.a(kVar2.v(), i3, j.f9822b, j.f9824d);
    }

    protected final void e(InterfaceC0576n interfaceC0576n) {
        while (h() <= 0) {
            m.c(interfaceC0576n, "null cannot be cast to non-null type kotlinx.coroutines.Waiter");
            if (f((c1) interfaceC0576n)) {
                return;
            }
        }
        interfaceC0576n.g(u.f2419a, this.f9818b);
    }

    public final int i() {
        return Math.max(f9816g.get(this), 0);
    }

    public final void p() {
        do {
            int andIncrement = f9816g.getAndIncrement(this);
            if (andIncrement >= this.f9817a) {
                g();
                throw new IllegalStateException(("The number of released permits cannot be greater than " + this.f9817a).toString());
            }
            if (andIncrement >= 0) {
                return;
            }
        } while (!s());
    }

    public final boolean q() {
        while (true) {
            int i3 = f9816g.get(this);
            if (i3 > this.f9817a) {
                g();
            } else {
                if (i3 <= 0) {
                    return false;
                }
                if (f9816g.compareAndSet(this, i3, i3 - 1)) {
                    return true;
                }
            }
        }
    }
}
