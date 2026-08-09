package e2;

import I1.n;
import c.AbstractC0527b;
import c2.C0580p;
import c2.InterfaceC0576n;
import c2.c1;
import h2.A;
import h2.AbstractC0884a;
import h2.AbstractC0885b;
import h2.B;
import h2.C;
import h2.D;
import h2.P;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public class e implements g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f7127d = AtomicLongFieldUpdater.newUpdater(e.class, "sendersAndCloseStatus$volatile");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f7128e = AtomicLongFieldUpdater.newUpdater(e.class, "receivers$volatile");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f7129f = AtomicLongFieldUpdater.newUpdater(e.class, "bufferEnd$volatile");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f7130l = AtomicLongFieldUpdater.newUpdater(e.class, "completedExpandBuffersAndPauseFlag$volatile");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f7131m = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "sendSegment$volatile");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f7132n = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "receiveSegment$volatile");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f7133o = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "bufferEndSegment$volatile");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f7134p = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "_closeCause$volatile");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f7135q = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "closeHandler$volatile");
    private volatile /* synthetic */ Object _closeCause$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f7136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final U1.l f7137b;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final U1.q f7138c;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    private final class a implements i, c1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Object f7139a = f.f7157p;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private C0580p f7140b;

        public a() {
        }

        private final Object f(m mVar, int i3, long j3, M1.d dVar) {
            Boolean boolA;
            e eVar = e.this;
            C0580p c0580pB = c2.r.b(N1.c.c(dVar));
            try {
                this.f7140b = c0580pB;
                Object objU0 = eVar.U0(mVar, i3, j3, this);
                if (objU0 == f.f7154m) {
                    eVar.E0(this, mVar, i3);
                } else {
                    U1.q qVarZ = null;
                    if (objU0 == f.f7156o) {
                        if (j3 < eVar.c0()) {
                            mVar.c();
                        }
                        m mVar2 = (m) e.W().get(eVar);
                        while (true) {
                            if (eVar.k0()) {
                                h();
                                break;
                            }
                            long andIncrement = e.X().getAndIncrement(eVar);
                            int i4 = f.f7143b;
                            long j4 = andIncrement / ((long) i4);
                            int i5 = (int) (andIncrement % ((long) i4));
                            if (mVar2.f7422c != j4) {
                                m mVarN = eVar.N(j4, mVar2);
                                if (mVarN != null) {
                                    mVar2 = mVarN;
                                }
                            }
                            Object objU02 = eVar.U0(mVar2, i5, andIncrement, this);
                            if (objU02 == f.f7154m) {
                                eVar.E0(this, mVar2, i5);
                                break;
                            }
                            if (objU02 == f.f7156o) {
                                if (andIncrement < eVar.c0()) {
                                    mVar2.c();
                                }
                            } else {
                                if (objU02 == f.f7155n) {
                                    throw new IllegalStateException("unexpected".toString());
                                }
                                mVar2.c();
                                this.f7139a = objU02;
                                this.f7140b = null;
                                boolA = kotlin.coroutines.jvm.internal.b.a(true);
                                U1.l lVar = eVar.f7137b;
                                if (lVar != null) {
                                    qVarZ = eVar.z(lVar, objU02);
                                }
                            }
                        }
                    } else {
                        mVar.c();
                        this.f7139a = objU0;
                        this.f7140b = null;
                        boolA = kotlin.coroutines.jvm.internal.b.a(true);
                        U1.l lVar2 = eVar.f7137b;
                        if (lVar2 != null) {
                            qVarZ = eVar.z(lVar2, objU0);
                        }
                    }
                    c0580pB.g(boolA, qVarZ);
                }
                Object objZ = c0580pB.z();
                if (objZ == N1.d.e()) {
                    kotlin.coroutines.jvm.internal.h.c(dVar);
                }
                return objZ;
            } catch (Throwable th) {
                c0580pB.N();
                throw th;
            }
        }

        private final boolean g() throws Throwable {
            this.f7139a = f.z();
            Throwable thS = e.this.S();
            if (thS == null) {
                return false;
            }
            throw C.a(thS);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void h() {
            Object objA;
            C0580p c0580p = this.f7140b;
            kotlin.jvm.internal.m.b(c0580p);
            this.f7140b = null;
            this.f7139a = f.z();
            Throwable thS = e.this.S();
            if (thS == null) {
                n.a aVar = I1.n.f2411b;
                objA = Boolean.FALSE;
            } else {
                n.a aVar2 = I1.n.f2411b;
                objA = I1.o.a(thS);
            }
            c0580p.resumeWith(I1.n.b(objA));
        }

        @Override // c2.c1
        public void a(A a3, int i3) {
            C0580p c0580p = this.f7140b;
            if (c0580p != null) {
                c0580p.a(a3, i3);
            }
        }

        @Override // e2.i
        public Object b(M1.d dVar) throws Throwable {
            boolean zG = true;
            if (this.f7139a == f.f7157p || this.f7139a == f.z()) {
                e eVar = e.this;
                m mVar = (m) e.W().get(eVar);
                while (true) {
                    if (eVar.k0()) {
                        zG = g();
                        break;
                    }
                    long andIncrement = e.X().getAndIncrement(eVar);
                    int i3 = f.f7143b;
                    long j3 = andIncrement / ((long) i3);
                    int i4 = (int) (andIncrement % ((long) i3));
                    if (mVar.f7422c != j3) {
                        m mVarN = eVar.N(j3, mVar);
                        if (mVarN == null) {
                            continue;
                        } else {
                            mVar = mVarN;
                        }
                    }
                    Object objU0 = eVar.U0(mVar, i4, andIncrement, null);
                    if (objU0 == f.f7154m) {
                        throw new IllegalStateException("unreachable".toString());
                    }
                    if (objU0 == f.f7156o) {
                        if (andIncrement < eVar.c0()) {
                            mVar.c();
                        }
                    } else {
                        if (objU0 == f.f7155n) {
                            return f(mVar, i4, andIncrement, dVar);
                        }
                        mVar.c();
                        this.f7139a = objU0;
                    }
                }
            }
            return kotlin.coroutines.jvm.internal.b.a(zG);
        }

        public final boolean i(Object obj) {
            C0580p c0580p = this.f7140b;
            kotlin.jvm.internal.m.b(c0580p);
            this.f7140b = null;
            this.f7139a = obj;
            Boolean bool = Boolean.TRUE;
            e eVar = e.this;
            U1.l lVar = eVar.f7137b;
            return f.B(c0580p, bool, lVar != null ? eVar.z(lVar, obj) : null);
        }

        public final void j() {
            Object objA;
            C0580p c0580p = this.f7140b;
            kotlin.jvm.internal.m.b(c0580p);
            this.f7140b = null;
            this.f7139a = f.z();
            Throwable thS = e.this.S();
            if (thS == null) {
                n.a aVar = I1.n.f2411b;
                objA = Boolean.FALSE;
            } else {
                n.a aVar2 = I1.n.f2411b;
                objA = I1.o.a(thS);
            }
            c0580p.resumeWith(I1.n.b(objA));
        }

        @Override // e2.i
        public Object next() throws Throwable {
            Object obj = this.f7139a;
            if (obj == f.f7157p) {
                throw new IllegalStateException("`hasNext()` has not been invoked".toString());
            }
            this.f7139a = f.f7157p;
            if (obj != f.z()) {
                return obj;
            }
            throw C.a(e.this.V());
        }
    }

    /* synthetic */ class b extends kotlin.jvm.internal.k implements U1.q {
        b(Object obj) {
            super(3, obj, e.class, "onCancellationImplDoNotCall", "onCancellationImplDoNotCall(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0);
        }

        public final void c(Throwable th, Object obj, M1.g gVar) {
            ((e) this.receiver).v0(th, obj, gVar);
        }

        @Override // U1.q
        public /* bridge */ /* synthetic */ Object e(Object obj, Object obj2, Object obj3) {
            c((Throwable) obj, obj2, (M1.g) obj3);
            return I1.u.f2419a;
        }
    }

    public e(int i3, U1.l lVar) {
        this.f7136a = i3;
        this.f7137b = lVar;
        if (i3 < 0) {
            throw new IllegalArgumentException(("Invalid channel capacity: " + i3 + ", should be >=0").toString());
        }
        this.bufferEnd$volatile = f.A(i3);
        this.completedExpandBuffersAndPauseFlag$volatile = Q();
        m mVar = new m(0L, null, this, 3);
        this.sendSegment$volatile = mVar;
        this.receiveSegment$volatile = mVar;
        if (p0()) {
            mVar = f.f7142a;
            kotlin.jvm.internal.m.c(mVar, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
        }
        this.bufferEndSegment$volatile = mVar;
        this.f7138c = lVar != null ? new U1.q() { // from class: e2.b
            @Override // U1.q
            public final Object e(Object obj, Object obj2, Object obj3) {
                e eVar = this.f7122a;
                AbstractC0527b.a(obj);
                return e.C0(eVar, null, obj2, obj3);
            }
        } : null;
        this._closeCause$volatile = f.f7160s;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Z1.e A(U1.l lVar) {
        return new b(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final I1.u B(U1.l lVar, Object obj, Throwable th, Object obj2, M1.g gVar) {
        h2.w.a(lVar, obj, gVar);
        return I1.u.f2419a;
    }

    private final boolean C(long j3) {
        return j3 < Q() || j3 < Y() + ((long) this.f7136a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final U1.q C0(final e eVar, final k2.e eVar2, Object obj, final Object obj2) {
        return new U1.q(obj2, eVar, eVar2) { // from class: e2.d

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Object f7125a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f7126b;

            @Override // U1.q
            public final Object e(Object obj3, Object obj4, Object obj5) {
                return e.D0(this.f7125a, this.f7126b, null, (Throwable) obj3, obj4, (M1.g) obj5);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final I1.u D0(Object obj, e eVar, k2.e eVar2, Throwable th, Object obj2, M1.g gVar) {
        if (obj != f.z()) {
            h2.w.a(eVar.f7137b, obj, eVar2.getContext());
        }
        return I1.u.f2419a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0039, code lost:
    
        r0 = h2.AbstractC0893j.c(r0, r4);
        r9.C(r3, true);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void E(e2.m r9, long r10) {
        /*
            r8 = this;
            r0 = 0
            r1 = 1
            java.lang.Object r0 = h2.AbstractC0893j.b(r0, r1, r0)
        L6:
            r2 = -1
            if (r9 == 0) goto L67
            int r3 = e2.f.f7143b
            int r3 = r3 - r1
        Lc:
            if (r2 >= r3) goto L60
            long r4 = r9.f7422c
            int r6 = e2.f.f7143b
            long r6 = (long) r6
            long r4 = r4 * r6
            long r6 = (long) r3
            long r4 = r4 + r6
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 < 0) goto L67
        L1a:
            java.lang.Object r4 = r9.B(r3)
            if (r4 == 0) goto L50
            h2.D r5 = e2.f.k()
            if (r4 != r5) goto L27
            goto L50
        L27:
            boolean r5 = r4 instanceof e2.x
            if (r5 == 0) goto L41
            h2.D r5 = e2.f.z()
            boolean r5 = r9.v(r3, r4, r5)
            if (r5 == 0) goto L1a
            e2.x r4 = (e2.x) r4
            c2.c1 r4 = r4.f7173a
        L39:
            java.lang.Object r0 = h2.AbstractC0893j.c(r0, r4)
            r9.C(r3, r1)
            goto L5d
        L41:
            boolean r5 = r4 instanceof c2.c1
            if (r5 == 0) goto L5d
            h2.D r5 = e2.f.z()
            boolean r5 = r9.v(r3, r4, r5)
            if (r5 == 0) goto L1a
            goto L39
        L50:
            h2.D r5 = e2.f.z()
            boolean r4 = r9.v(r3, r4, r5)
            if (r4 == 0) goto L1a
            r9.t()
        L5d:
            int r3 = r3 + (-1)
            goto Lc
        L60:
            h2.b r9 = r9.h()
            e2.m r9 = (e2.m) r9
            goto L6
        L67:
            if (r0 == 0) goto L8d
            boolean r9 = r0 instanceof java.util.ArrayList
            if (r9 != 0) goto L73
            c2.c1 r0 = (c2.c1) r0
            r8.J0(r0)
            goto L8d
        L73:
            java.lang.String r9 = "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>"
            kotlin.jvm.internal.m.c(r0, r9)
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r9 = r0.size()
            int r9 = r9 - r1
        L7f:
            if (r2 >= r9) goto L8d
            java.lang.Object r10 = r0.get(r9)
            c2.c1 r10 = (c2.c1) r10
            r8.J0(r10)
            int r9 = r9 + (-1)
            goto L7f
        L8d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e2.e.E(e2.m, long):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E0(c1 c1Var, m mVar, int i3) {
        B0();
        c1Var.a(mVar, i3);
    }

    private final m F() {
        Object obj = f7133o.get(this);
        m mVar = (m) f7131m.get(this);
        if (mVar.f7422c > ((m) obj).f7422c) {
            obj = mVar;
        }
        m mVar2 = (m) f7132n.get(this);
        if (mVar2.f7422c > ((m) obj).f7422c) {
            obj = mVar2;
        }
        return (m) AbstractC0884a.b((AbstractC0885b) obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F0(c1 c1Var, m mVar, int i3) {
        c1Var.a(mVar, i3 + f.f7143b);
    }

    static /* synthetic */ Object G0(e eVar, M1.d dVar) throws Throwable {
        m mVar = (m) W().get(eVar);
        while (!eVar.k0()) {
            long andIncrement = X().getAndIncrement(eVar);
            int i3 = f.f7143b;
            long j3 = andIncrement / ((long) i3);
            int i4 = (int) (andIncrement % ((long) i3));
            if (mVar.f7422c != j3) {
                m mVarN = eVar.N(j3, mVar);
                if (mVarN == null) {
                    continue;
                } else {
                    mVar = mVarN;
                }
            }
            Object objU0 = eVar.U0(mVar, i4, andIncrement, null);
            if (objU0 == f.f7154m) {
                throw new IllegalStateException("unexpected".toString());
            }
            if (objU0 != f.f7156o) {
                if (objU0 == f.f7155n) {
                    return eVar.H0(mVar, i4, andIncrement, dVar);
                }
                mVar.c();
                return objU0;
            }
            if (andIncrement < eVar.c0()) {
                mVar.c();
            }
        }
        throw C.a(eVar.V());
    }

    private final void H(long j3) {
        I0(I(j3));
    }

    private final Object H0(m mVar, int i3, long j3, M1.d dVar) {
        U1.q qVar;
        C0580p c0580pB = c2.r.b(N1.c.c(dVar));
        try {
            Object objU0 = U0(mVar, i3, j3, c0580pB);
            if (objU0 == f.f7154m) {
                E0(c0580pB, mVar, i3);
            } else {
                if (objU0 == f.f7156o) {
                    if (j3 < c0()) {
                        mVar.c();
                    }
                    m mVar2 = (m) W().get(this);
                    while (true) {
                        if (k0()) {
                            x0(c0580pB);
                            break;
                        }
                        long andIncrement = X().getAndIncrement(this);
                        int i4 = f.f7143b;
                        long j4 = andIncrement / ((long) i4);
                        int i5 = (int) (andIncrement % ((long) i4));
                        if (mVar2.f7422c != j4) {
                            m mVarN = N(j4, mVar2);
                            if (mVarN != null) {
                                mVar2 = mVarN;
                            }
                        }
                        objU0 = U0(mVar2, i5, andIncrement, c0580pB);
                        if (objU0 == f.f7154m) {
                            C0580p c0580p = c0580pB instanceof c1 ? c0580pB : null;
                            if (c0580p != null) {
                                E0(c0580p, mVar2, i5);
                            }
                        } else if (objU0 == f.f7156o) {
                            if (andIncrement < c0()) {
                                mVar2.c();
                            }
                        } else {
                            if (objU0 == f.f7155n) {
                                throw new IllegalStateException("unexpected".toString());
                            }
                            mVar2.c();
                            U1.l lVar = this.f7137b;
                            qVar = (U1.q) (lVar != null ? A(lVar) : null);
                        }
                    }
                } else {
                    mVar.c();
                    U1.l lVar2 = this.f7137b;
                    qVar = (U1.q) (lVar2 != null ? A(lVar2) : null);
                }
                c0580pB.g(objU0, qVar);
            }
            Object objZ = c0580pB.z();
            if (objZ == N1.d.e()) {
                kotlin.coroutines.jvm.internal.h.c(dVar);
            }
            return objZ;
        } catch (Throwable th) {
            c0580pB.N();
            throw th;
        }
    }

    private final m I(long j3) {
        m mVarF = F();
        if (o0()) {
            long jQ0 = q0(mVarF);
            if (jQ0 != -1) {
                K(jQ0);
            }
        }
        E(mVarF, j3);
        return mVarF;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0040, code lost:
    
        r12.w(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00aa, code lost:
    
        r12 = (e2.m) r12.h();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void I0(e2.m r12) {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e2.e.I0(e2.m):void");
    }

    private final void J() {
        m0();
    }

    private final void J0(c1 c1Var) {
        L0(c1Var, true);
    }

    private final void K0(c1 c1Var) {
        L0(c1Var, false);
    }

    private final void L() {
        if (p0()) {
            return;
        }
        m mVar = (m) f7133o.get(this);
        while (true) {
            long andIncrement = f7129f.getAndIncrement(this);
            int i3 = f.f7143b;
            long j3 = andIncrement / ((long) i3);
            long jC0 = c0();
            long j4 = mVar.f7422c;
            if (jC0 <= andIncrement) {
                if (j4 < j3 && mVar.f() != null) {
                    u0(j3, mVar);
                }
                g0(this, 0L, 1, null);
                return;
            }
            if (j4 != j3) {
                m mVarM = M(j3, mVar, andIncrement);
                if (mVarM == null) {
                    continue;
                } else {
                    mVar = mVarM;
                }
            }
            boolean zS0 = S0(mVar, (int) (andIncrement % ((long) i3)), andIncrement);
            g0(this, 0L, 1, null);
            if (zS0) {
                return;
            }
        }
    }

    private final void L0(c1 c1Var, boolean z2) {
        if (c1Var instanceof InterfaceC0576n) {
            M1.d dVar = (M1.d) c1Var;
            n.a aVar = I1.n.f2411b;
            dVar.resumeWith(I1.n.b(I1.o.a(z2 ? V() : Z())));
        } else {
            if (c1Var instanceof a) {
                ((a) c1Var).j();
                return;
            }
            throw new IllegalStateException(("Unexpected waiter: " + c1Var).toString());
        }
    }

    private final m M(long j3, m mVar, long j4) {
        Object objC;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7133o;
        U1.p pVar = (U1.p) f.y();
        loop0: while (true) {
            objC = AbstractC0884a.c(mVar, j3, pVar);
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
        if (B.c(objC)) {
            J();
            u0(j3, mVar);
        } else {
            m mVar2 = (m) B.b(objC);
            if (mVar2.f7422c <= j3) {
                return mVar2;
            }
            long j5 = mVar2.f7422c;
            int i3 = f.f7143b;
            if (f7129f.compareAndSet(this, j4 + 1, j5 * ((long) i3))) {
                f0((mVar2.f7422c * ((long) i3)) - j4);
                return null;
            }
        }
        g0(this, 0L, 1, null);
        return null;
    }

    static /* synthetic */ Object M0(e eVar, Object obj, M1.d dVar) {
        m mVar = (m) a0().get(eVar);
        while (true) {
            long andIncrement = b0().getAndIncrement(eVar);
            long j3 = 1152921504606846975L & andIncrement;
            boolean zN0 = eVar.n0(andIncrement);
            int i3 = f.f7143b;
            long j4 = j3 / ((long) i3);
            int i4 = (int) (j3 % ((long) i3));
            if (mVar.f7422c != j4) {
                m mVarO = eVar.O(j4, mVar);
                if (mVarO != null) {
                    mVar = mVarO;
                } else if (zN0) {
                    Object objY0 = eVar.y0(obj, dVar);
                    if (objY0 == N1.d.e()) {
                        return objY0;
                    }
                }
            }
            int iW0 = eVar.W0(mVar, i4, obj, j3, null, zN0);
            if (iW0 == 0) {
                mVar.c();
                break;
            }
            if (iW0 == 1) {
                break;
            }
            if (iW0 != 2) {
                if (iW0 == 3) {
                    Object objN0 = eVar.N0(mVar, i4, obj, j3, dVar);
                    if (objN0 == N1.d.e()) {
                        return objN0;
                    }
                } else if (iW0 == 4) {
                    if (j3 < eVar.Y()) {
                        mVar.c();
                    }
                    Object objY02 = eVar.y0(obj, dVar);
                    if (objY02 == N1.d.e()) {
                        return objY02;
                    }
                } else if (iW0 == 5) {
                    mVar.c();
                }
            } else if (zN0) {
                mVar.t();
                Object objY03 = eVar.y0(obj, dVar);
                if (objY03 == N1.d.e()) {
                    return objY03;
                }
            }
        }
        return I1.u.f2419a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final m N(long j3, m mVar) {
        Object objC;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7132n;
        U1.p pVar = (U1.p) f.y();
        loop0: while (true) {
            objC = AbstractC0884a.c(mVar, j3, pVar);
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
        if (B.c(objC)) {
            J();
            if (mVar.f7422c * ((long) f.f7143b) >= c0()) {
                return null;
            }
        } else {
            mVar = (m) B.b(objC);
            if (!p0() && j3 <= Q() / ((long) f.f7143b)) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f7133o;
                while (true) {
                    A a4 = (A) atomicReferenceFieldUpdater2.get(this);
                    if (a4.f7422c >= mVar.f7422c || !mVar.u()) {
                        break;
                    }
                    if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater2, this, a4, mVar)) {
                        if (a4.p()) {
                            a4.n();
                        }
                    } else if (mVar.p()) {
                        mVar.n();
                    }
                }
            }
            long j4 = mVar.f7422c;
            if (j4 <= j3) {
                return mVar;
            }
            int i3 = f.f7143b;
            Y0(j4 * ((long) i3));
            if (mVar.f7422c * ((long) i3) >= c0()) {
                return null;
            }
        }
        mVar.c();
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0125 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0126  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object N0(e2.m r21, int r22, java.lang.Object r23, long r24, M1.d r26) {
        /*
            Method dump skipped, instruction units count: 301
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e2.e.N0(e2.m, int, java.lang.Object, long, M1.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final m O(long j3, m mVar) {
        Object objC;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7131m;
        U1.p pVar = (U1.p) f.y();
        loop0: while (true) {
            objC = AbstractC0884a.c(mVar, j3, pVar);
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
        if (B.c(objC)) {
            J();
            if (mVar.f7422c * ((long) f.f7143b) >= Y()) {
                return null;
            }
        } else {
            mVar = (m) B.b(objC);
            long j4 = mVar.f7422c;
            if (j4 <= j3) {
                return mVar;
            }
            int i3 = f.f7143b;
            Z0(j4 * ((long) i3));
            if (mVar.f7422c * ((long) i3) >= Y()) {
                return null;
            }
        }
        mVar.c();
        return null;
    }

    private final boolean O0(long j3) {
        if (n0(j3)) {
            return false;
        }
        return !C(j3 & 1152921504606846975L);
    }

    private final boolean P0(Object obj, Object obj2) {
        if (obj instanceof a) {
            kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
            return ((a) obj).i(obj2);
        }
        if (obj instanceof InterfaceC0576n) {
            kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
            InterfaceC0576n interfaceC0576n = (InterfaceC0576n) obj;
            U1.l lVar = this.f7137b;
            return f.B(interfaceC0576n, obj2, (U1.q) (lVar != null ? A(lVar) : null));
        }
        throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
    }

    private final long Q() {
        return f7129f.get(this);
    }

    private final boolean Q0(Object obj, m mVar, int i3) {
        if (obj instanceof InterfaceC0576n) {
            kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            return f.C((InterfaceC0576n) obj, I1.u.f2419a, null, 2, null);
        }
        throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
    }

    private final boolean S0(m mVar, int i3, long j3) {
        Object objB = mVar.B(i3);
        if (!(objB instanceof c1) || j3 < f7128e.get(this) || !mVar.v(i3, objB, f.f7148g)) {
            return T0(mVar, i3, j3);
        }
        if (Q0(objB, mVar, i3)) {
            mVar.F(i3, f.f7145d);
            return true;
        }
        mVar.F(i3, f.f7151j);
        mVar.C(i3, false);
        return false;
    }

    private final boolean T0(m mVar, int i3, long j3) {
        while (true) {
            Object objB = mVar.B(i3);
            if (objB instanceof c1) {
                if (j3 < f7128e.get(this)) {
                    if (mVar.v(i3, objB, new x((c1) objB))) {
                        return true;
                    }
                } else if (mVar.v(i3, objB, f.f7148g)) {
                    if (Q0(objB, mVar, i3)) {
                        mVar.F(i3, f.f7145d);
                        return true;
                    }
                    mVar.F(i3, f.f7151j);
                    mVar.C(i3, false);
                    return false;
                }
            } else {
                if (objB == f.f7151j) {
                    return false;
                }
                if (objB == null) {
                    if (mVar.v(i3, objB, f.f7146e)) {
                        return true;
                    }
                } else {
                    if (objB == f.f7145d || objB == f.f7149h || objB == f.f7150i || objB == f.f7152k || objB == f.z()) {
                        return true;
                    }
                    if (objB != f.f7147f) {
                        throw new IllegalStateException(("Unexpected cell state: " + objB).toString());
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object U0(m mVar, int i3, long j3, Object obj) {
        Object objB = mVar.B(i3);
        if (objB == null) {
            if (j3 >= (f7127d.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return f.f7155n;
                }
                if (mVar.v(i3, objB, obj)) {
                    L();
                    return f.f7154m;
                }
            }
        } else if (objB == f.f7145d && mVar.v(i3, objB, f.f7150i)) {
            L();
            return mVar.D(i3);
        }
        return V0(mVar, i3, j3, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Throwable V() {
        Throwable thS = S();
        return thS == null ? new p("Channel was closed") : thS;
    }

    private final Object V0(m mVar, int i3, long j3, Object obj) {
        while (true) {
            Object objB = mVar.B(i3);
            if (objB == null || objB == f.f7146e) {
                if (j3 < (f7127d.get(this) & 1152921504606846975L)) {
                    if (mVar.v(i3, objB, f.f7149h)) {
                        L();
                        return f.f7156o;
                    }
                } else {
                    if (obj == null) {
                        return f.f7155n;
                    }
                    if (mVar.v(i3, objB, obj)) {
                        L();
                        return f.f7154m;
                    }
                }
            } else {
                if (objB != f.f7145d) {
                    if (objB != f.f7151j && objB != f.f7149h) {
                        if (objB == f.z()) {
                            L();
                            return f.f7156o;
                        }
                        if (objB != f.f7148g && mVar.v(i3, objB, f.f7147f)) {
                            boolean z2 = objB instanceof x;
                            if (z2) {
                                objB = ((x) objB).f7173a;
                            }
                            if (Q0(objB, mVar, i3)) {
                                mVar.F(i3, f.f7150i);
                                L();
                                return mVar.D(i3);
                            }
                            mVar.F(i3, f.f7151j);
                            mVar.C(i3, false);
                            if (z2) {
                                L();
                            }
                            return f.f7156o;
                        }
                    }
                    return f.f7156o;
                }
                if (mVar.v(i3, objB, f.f7150i)) {
                    L();
                    return mVar.D(i3);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicReferenceFieldUpdater W() {
        return f7132n;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int W0(m mVar, int i3, Object obj, long j3, Object obj2, boolean z2) {
        mVar.G(i3, obj);
        if (z2) {
            return X0(mVar, i3, obj, j3, obj2, z2);
        }
        Object objB = mVar.B(i3);
        if (objB == null) {
            if (C(j3)) {
                if (mVar.v(i3, null, f.f7145d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (mVar.v(i3, null, obj2)) {
                    return 2;
                }
            }
        } else if (objB instanceof c1) {
            mVar.w(i3);
            if (P0(objB, obj)) {
                mVar.F(i3, f.f7150i);
                A0();
                return 0;
            }
            if (mVar.x(i3, f.f7152k) != f.f7152k) {
                mVar.C(i3, true);
            }
            return 5;
        }
        return X0(mVar, i3, obj, j3, obj2, z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicLongFieldUpdater X() {
        return f7128e;
    }

    private final int X0(m mVar, int i3, Object obj, long j3, Object obj2, boolean z2) {
        while (true) {
            Object objB = mVar.B(i3);
            if (objB == null) {
                if (!C(j3) || z2) {
                    if (z2) {
                        if (mVar.v(i3, null, f.f7151j)) {
                            mVar.C(i3, false);
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (mVar.v(i3, null, obj2)) {
                            return 2;
                        }
                    }
                } else if (mVar.v(i3, null, f.f7145d)) {
                    return 1;
                }
            } else {
                if (objB != f.f7146e) {
                    if (objB == f.f7152k) {
                        mVar.w(i3);
                        return 5;
                    }
                    if (objB == f.f7149h) {
                        mVar.w(i3);
                        return 5;
                    }
                    D dZ = f.z();
                    mVar.w(i3);
                    if (objB == dZ) {
                        J();
                        return 4;
                    }
                    if (objB instanceof x) {
                        objB = ((x) objB).f7173a;
                    }
                    if (P0(objB, obj)) {
                        mVar.F(i3, f.f7150i);
                        A0();
                        return 0;
                    }
                    if (mVar.x(i3, f.f7152k) != f.f7152k) {
                        mVar.C(i3, true);
                    }
                    return 5;
                }
                if (mVar.v(i3, objB, f.f7145d)) {
                    return 1;
                }
            }
        }
    }

    private final void Y0(long j3) {
        long j4;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f7128e;
        do {
            j4 = atomicLongFieldUpdater.get(this);
            if (j4 >= j3) {
                return;
            }
        } while (!f7128e.compareAndSet(this, j4, j3));
    }

    private final void Z0(long j3) {
        long j4;
        long j5;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f7127d;
        do {
            j4 = atomicLongFieldUpdater.get(this);
            j5 = 1152921504606846975L & j4;
            if (j5 >= j3) {
                return;
            }
        } while (!f7127d.compareAndSet(this, j4, f.w(j5, (int) (j4 >> 60))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicReferenceFieldUpdater a0() {
        return f7131m;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicLongFieldUpdater b0() {
        return f7127d;
    }

    private final void f0(long j3) {
        if ((f7130l.addAndGet(this, j3) & 4611686018427387904L) != 0) {
            while ((f7130l.get(this) & 4611686018427387904L) != 0) {
            }
        }
    }

    static /* synthetic */ void g0(e eVar, long j3, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incCompletedExpandBufferAttempts");
        }
        if ((i3 & 1) != 0) {
            j3 = 1;
        }
        eVar.f0(j3);
    }

    private final void h0() {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7135q;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
        } while (!androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, obj, obj == null ? f.f7158q : f.f7159r));
        if (obj == null) {
            return;
        }
        ((U1.l) obj).invoke(S());
    }

    private final boolean i0(m mVar, int i3, long j3) {
        Object objB;
        do {
            objB = mVar.B(i3);
            if (objB != null && objB != f.f7146e) {
                if (objB == f.f7145d) {
                    return true;
                }
                if (objB == f.f7151j || objB == f.z() || objB == f.f7150i || objB == f.f7149h) {
                    return false;
                }
                if (objB == f.f7148g) {
                    return true;
                }
                return objB != f.f7147f && j3 == Y();
            }
        } while (!mVar.v(i3, objB, f.f7149h));
        L();
        return false;
    }

    private final boolean j0(long j3, boolean z2) {
        int i3 = (int) (j3 >> 60);
        if (i3 == 0 || i3 == 1) {
            return false;
        }
        if (i3 == 2) {
            I(j3 & 1152921504606846975L);
            if (z2 && e0()) {
                return false;
            }
        } else {
            if (i3 != 3) {
                throw new IllegalStateException(("unexpected close status: " + i3).toString());
            }
            H(j3 & 1152921504606846975L);
        }
        return true;
    }

    private final boolean l0(long j3) {
        return j0(j3, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean n0(long j3) {
        return j0(j3, false);
    }

    private final boolean p0() {
        long jQ = Q();
        return jQ == 0 || jQ == Long.MAX_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003c, code lost:
    
        r8 = (e2.m) r8.h();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final long q0(e2.m r8) {
        /*
            r7 = this;
        L0:
            int r0 = e2.f.f7143b
            int r0 = r0 + (-1)
        L4:
            r1 = -1
            r3 = -1
            if (r3 >= r0) goto L3c
            long r3 = r8.f7422c
            int r5 = e2.f.f7143b
            long r5 = (long) r5
            long r3 = r3 * r5
            long r5 = (long) r0
            long r3 = r3 + r5
            long r5 = r7.Y()
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 >= 0) goto L1a
            return r1
        L1a:
            java.lang.Object r1 = r8.B(r0)
            if (r1 == 0) goto L2c
            h2.D r2 = e2.f.k()
            if (r1 != r2) goto L27
            goto L2c
        L27:
            h2.D r2 = e2.f.f7145d
            if (r1 != r2) goto L39
            return r3
        L2c:
            h2.D r2 = e2.f.z()
            boolean r1 = r8.v(r0, r1, r2)
            if (r1 == 0) goto L1a
            r8.t()
        L39:
            int r0 = r0 + (-1)
            goto L4
        L3c:
            h2.b r8 = r8.h()
            e2.m r8 = (e2.m) r8
            if (r8 != 0) goto L0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: e2.e.q0(e2.m):long");
    }

    private final void r0() {
        long j3;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f7127d;
        do {
            j3 = atomicLongFieldUpdater.get(this);
            if (((int) (j3 >> 60)) != 0) {
                return;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j3, f.w(1152921504606846975L & j3, 1)));
    }

    private final void s0() {
        long j3;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f7127d;
        do {
            j3 = atomicLongFieldUpdater.get(this);
        } while (!atomicLongFieldUpdater.compareAndSet(this, j3, f.w(1152921504606846975L & j3, 3)));
    }

    private final void t0() {
        long j3;
        long j4;
        int i3;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f7127d;
        do {
            j3 = atomicLongFieldUpdater.get(this);
            int i4 = (int) (j3 >> 60);
            if (i4 == 0) {
                j4 = j3 & 1152921504606846975L;
                i3 = 2;
            } else {
                if (i4 != 1) {
                    return;
                }
                j4 = j3 & 1152921504606846975L;
                i3 = 3;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j3, f.w(j4, i3)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0011, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void u0(long r5, e2.m r7) {
        /*
            r4 = this;
        L0:
            long r0 = r7.f7422c
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 >= 0) goto L11
            h2.b r0 = r7.f()
            e2.m r0 = (e2.m) r0
            if (r0 != 0) goto Lf
            goto L11
        Lf:
            r7 = r0
            goto L0
        L11:
            boolean r5 = r7.k()
            if (r5 == 0) goto L22
            h2.b r5 = r7.f()
            e2.m r5 = (e2.m) r5
            if (r5 != 0) goto L20
            goto L22
        L20:
            r7 = r5
            goto L11
        L22:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = R()
        L26:
            java.lang.Object r6 = r5.get(r4)
            h2.A r6 = (h2.A) r6
            long r0 = r6.f7422c
            long r2 = r7.f7422c
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L35
            goto L4b
        L35:
            boolean r0 = r7.u()
            if (r0 != 0) goto L3c
            goto L11
        L3c:
            boolean r0 = androidx.concurrent.futures.b.a(r5, r4, r6, r7)
            if (r0 == 0) goto L4c
            boolean r5 = r6.p()
            if (r5 == 0) goto L4b
            r6.n()
        L4b:
            return
        L4c:
            boolean r6 = r7.p()
            if (r6 == 0) goto L26
            r7.n()
            goto L26
        */
        throw new UnsupportedOperationException("Method not decompiled: e2.e.u0(long, e2.m):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v0(Throwable th, Object obj, M1.g gVar) {
        U1.l lVar = this.f7137b;
        kotlin.jvm.internal.m.b(lVar);
        h2.w.a(lVar, obj, gVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x0(InterfaceC0576n interfaceC0576n) {
        n.a aVar = I1.n.f2411b;
        interfaceC0576n.resumeWith(I1.n.b(I1.o.a(V())));
    }

    private final Object y0(Object obj, M1.d dVar) {
        Throwable thZ;
        C0580p c0580p = new C0580p(N1.c.c(dVar), 1);
        c0580p.F();
        U1.l lVar = this.f7137b;
        if (lVar == null || (thZ = h2.w.c(lVar, obj, null, 2, null)) == null) {
            thZ = Z();
        } else {
            I1.b.a(thZ, Z());
        }
        n.a aVar = I1.n.f2411b;
        c0580p.resumeWith(I1.n.b(I1.o.a(thZ)));
        Object objZ = c0580p.z();
        if (objZ == N1.d.e()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return objZ == N1.d.e() ? objZ : I1.u.f2419a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final U1.q z(final U1.l lVar, final Object obj) {
        return new U1.q() { // from class: e2.c
            @Override // U1.q
            public final Object e(Object obj2, Object obj3, Object obj4) {
                return e.B(lVar, obj, (Throwable) obj2, obj3, (M1.g) obj4);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z0(Object obj, InterfaceC0576n interfaceC0576n) {
        U1.l lVar = this.f7137b;
        if (lVar != null) {
            h2.w.a(lVar, obj, interfaceC0576n.getContext());
        }
        Throwable thZ = Z();
        n.a aVar = I1.n.f2411b;
        interfaceC0576n.resumeWith(I1.n.b(I1.o.a(thZ)));
    }

    public boolean D(Throwable th) {
        if (th == null) {
            th = new CancellationException("Channel was cancelled");
        }
        return G(th, true);
    }

    protected boolean G(Throwable th, boolean z2) {
        if (z2) {
            r0();
        }
        boolean zA = androidx.concurrent.futures.b.a(f7134p, this, f.f7160s, th);
        if (z2) {
            s0();
        } else {
            t0();
        }
        J();
        w0();
        if (zA) {
            h0();
        }
        return zA;
    }

    protected final void K(long j3) {
        P pC;
        m mVar = (m) f7132n.get(this);
        while (true) {
            long j4 = f7128e.get(this);
            if (j3 < Math.max(((long) this.f7136a) + j4, Q())) {
                return;
            }
            if (f7128e.compareAndSet(this, j4, j4 + 1)) {
                int i3 = f.f7143b;
                long j5 = j4 / ((long) i3);
                int i4 = (int) (j4 % ((long) i3));
                if (mVar.f7422c != j5) {
                    m mVarN = N(j5, mVar);
                    if (mVarN == null) {
                        continue;
                    } else {
                        mVar = mVarN;
                    }
                }
                Object objU0 = U0(mVar, i4, j4, null);
                if (objU0 != f.f7156o) {
                    mVar.c();
                    U1.l lVar = this.f7137b;
                    if (lVar != null && (pC = h2.w.c(lVar, objU0, null, 2, null)) != null) {
                        throw pC;
                    }
                } else if (j4 < c0()) {
                    mVar.c();
                }
            }
        }
    }

    protected final Object R0(Object obj) {
        m mVar;
        Object obj2 = f.f7145d;
        m mVar2 = (m) a0().get(this);
        while (true) {
            long andIncrement = b0().getAndIncrement(this);
            long j3 = andIncrement & 1152921504606846975L;
            boolean zN0 = n0(andIncrement);
            int i3 = f.f7143b;
            long j4 = j3 / ((long) i3);
            int i4 = (int) (j3 % ((long) i3));
            if (mVar2.f7422c != j4) {
                m mVarO = O(j4, mVar2);
                if (mVarO != null) {
                    mVar = mVarO;
                } else if (zN0) {
                    return k.f7166a.a(Z());
                }
            } else {
                mVar = mVar2;
            }
            int iW0 = W0(mVar, i4, obj, j3, obj2, zN0);
            if (iW0 == 0) {
                mVar.c();
                return k.f7166a.c(I1.u.f2419a);
            }
            if (iW0 == 1) {
                return k.f7166a.c(I1.u.f2419a);
            }
            if (iW0 == 2) {
                if (zN0) {
                    mVar.t();
                    return k.f7166a.a(Z());
                }
                c1 c1Var = obj2 instanceof c1 ? (c1) obj2 : null;
                if (c1Var != null) {
                    F0(c1Var, mVar, i4);
                }
                K((mVar.f7422c * ((long) i3)) + ((long) i4));
                return k.f7166a.c(I1.u.f2419a);
            }
            if (iW0 == 3) {
                throw new IllegalStateException("unexpected".toString());
            }
            if (iW0 == 4) {
                if (j3 < Y()) {
                    mVar.c();
                }
                return k.f7166a.a(Z());
            }
            if (iW0 == 5) {
                mVar.c();
            }
            mVar2 = mVar;
        }
    }

    protected final Throwable S() {
        return (Throwable) f7134p.get(this);
    }

    public final long Y() {
        return f7128e.get(this);
    }

    protected final Throwable Z() {
        Throwable thS = S();
        return thS == null ? new q("Channel was closed") : thS;
    }

    @Override // e2.w
    public boolean a(Throwable th) {
        return G(th, false);
    }

    public final void a1(long j3) {
        long j4;
        long j5;
        if (p0()) {
            return;
        }
        while (Q() <= j3) {
        }
        int i3 = f.f7144c;
        for (int i4 = 0; i4 < i3; i4++) {
            long jQ = Q();
            if (jQ == (f7130l.get(this) & 4611686018427387903L) && jQ == Q()) {
                return;
            }
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = f7130l;
        do {
            j4 = atomicLongFieldUpdater.get(this);
        } while (!atomicLongFieldUpdater.compareAndSet(this, j4, f.v(j4 & 4611686018427387903L, true)));
        while (true) {
            long jQ2 = Q();
            long j6 = f7130l.get(this);
            long j7 = j6 & 4611686018427387903L;
            boolean z2 = (4611686018427387904L & j6) != 0;
            if (jQ2 == j7 && jQ2 == Q()) {
                break;
            } else if (!z2) {
                f7130l.compareAndSet(this, j6, f.v(j7, true));
            }
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f7130l;
        do {
            j5 = atomicLongFieldUpdater2.get(this);
        } while (!atomicLongFieldUpdater2.compareAndSet(this, j5, f.v(j5 & 4611686018427387903L, false)));
    }

    public final long c0() {
        return f7127d.get(this) & 1152921504606846975L;
    }

    @Override // e2.v
    public final void cancel(CancellationException cancellationException) {
        D(cancellationException);
    }

    @Override // e2.v
    public Object d(M1.d dVar) {
        return G0(this, dVar);
    }

    public final boolean e0() {
        while (true) {
            m mVarN = (m) f7132n.get(this);
            long jY = Y();
            if (c0() <= jY) {
                return false;
            }
            int i3 = f.f7143b;
            long j3 = jY / ((long) i3);
            if (mVarN.f7422c == j3 || (mVarN = N(j3, mVarN)) != null) {
                mVarN.c();
                if (i0(mVarN, (int) (jY % ((long) i3)), jY)) {
                    return true;
                }
                f7128e.compareAndSet(this, jY, 1 + jY);
            } else if (((m) f7132n.get(this)).f7422c < j3) {
                return false;
            }
        }
    }

    @Override // e2.w
    public Object h(Object obj, M1.d dVar) {
        return M0(this, obj, dVar);
    }

    @Override // e2.v
    public Object i() {
        m mVar;
        long j3 = f7128e.get(this);
        long j4 = f7127d.get(this);
        if (l0(j4)) {
            return k.f7166a.a(S());
        }
        if (j3 >= (j4 & 1152921504606846975L)) {
            return k.f7166a.b();
        }
        Object obj = f.f7152k;
        m mVar2 = (m) W().get(this);
        while (!k0()) {
            long andIncrement = X().getAndIncrement(this);
            int i3 = f.f7143b;
            long j5 = andIncrement / ((long) i3);
            int i4 = (int) (andIncrement % ((long) i3));
            if (mVar2.f7422c != j5) {
                m mVarN = N(j5, mVar2);
                if (mVarN == null) {
                    continue;
                } else {
                    mVar = mVarN;
                }
            } else {
                mVar = mVar2;
            }
            Object objU0 = U0(mVar, i4, andIncrement, obj);
            if (objU0 == f.f7154m) {
                c1 c1Var = obj instanceof c1 ? (c1) obj : null;
                if (c1Var != null) {
                    E0(c1Var, mVar, i4);
                }
                a1(andIncrement);
                mVar.t();
                return k.f7166a.b();
            }
            if (objU0 != f.f7156o) {
                if (objU0 == f.f7155n) {
                    throw new IllegalStateException("unexpected".toString());
                }
                mVar.c();
                return k.f7166a.c(objU0);
            }
            if (andIncrement < c0()) {
                mVar.c();
            }
            mVar2 = mVar;
        }
        return k.f7166a.a(S());
    }

    @Override // e2.v
    public i iterator() {
        return new a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:?, code lost:
    
        return e2.k.f7166a.c(I1.u.f2419a);
     */
    @Override // e2.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object j(java.lang.Object r15) {
        /*
            r14 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = b0()
            long r0 = r0.get(r14)
            boolean r0 = r14.O0(r0)
            if (r0 == 0) goto L15
            e2.k$b r15 = e2.k.f7166a
            java.lang.Object r15 = r15.b()
            return r15
        L15:
            h2.D r8 = e2.f.j()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = p()
            java.lang.Object r0 = r0.get(r14)
            e2.m r0 = (e2.m) r0
        L23:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = q()
            long r1 = r1.getAndIncrement(r14)
            r3 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r9 = r1 & r3
            boolean r11 = r(r14, r1)
            int r1 = e2.f.f7143b
            long r2 = (long) r1
            long r2 = r9 / r2
            long r4 = (long) r1
            long r4 = r9 % r4
            int r12 = (int) r4
            long r4 = r0.f7422c
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 == 0) goto L5b
            e2.m r1 = l(r14, r2, r0)
            if (r1 != 0) goto L59
            if (r11 == 0) goto L23
        L4d:
            e2.k$b r15 = e2.k.f7166a
            java.lang.Throwable r0 = r14.Z()
            java.lang.Object r15 = r15.a(r0)
            goto Lc0
        L59:
            r13 = r1
            goto L5c
        L5b:
            r13 = r0
        L5c:
            r0 = r14
            r1 = r13
            r2 = r12
            r3 = r15
            r4 = r9
            r6 = r8
            r7 = r11
            int r0 = y(r0, r1, r2, r3, r4, r6, r7)
            if (r0 == 0) goto Lbc
            r1 = 1
            if (r0 == r1) goto Lb3
            r1 = 2
            if (r0 == r1) goto L96
            r1 = 3
            if (r0 == r1) goto L8a
            r1 = 4
            if (r0 == r1) goto L7e
            r1 = 5
            if (r0 == r1) goto L79
            goto L7c
        L79:
            r13.c()
        L7c:
            r0 = r13
            goto L23
        L7e:
            long r0 = r14.Y()
            int r15 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r15 >= 0) goto L4d
            r13.c()
            goto L4d
        L8a:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "unexpected"
            java.lang.String r0 = r0.toString()
            r15.<init>(r0)
            throw r15
        L96:
            if (r11 == 0) goto L9c
            r13.t()
            goto L4d
        L9c:
            boolean r15 = r8 instanceof c2.c1
            if (r15 == 0) goto La3
            c2.c1 r8 = (c2.c1) r8
            goto La4
        La3:
            r8 = 0
        La4:
            if (r8 == 0) goto La9
            w(r14, r8, r13, r12)
        La9:
            r13.t()
            e2.k$b r15 = e2.k.f7166a
            java.lang.Object r15 = r15.b()
            goto Lc0
        Lb3:
            e2.k$b r15 = e2.k.f7166a
            I1.u r0 = I1.u.f2419a
            java.lang.Object r15 = r15.c(r0)
            goto Lc0
        Lbc:
            r13.c()
            goto Lb3
        Lc0:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: e2.e.j(java.lang.Object):java.lang.Object");
    }

    public boolean k0() {
        return l0(f7127d.get(this));
    }

    public boolean m0() {
        return n0(f7127d.get(this));
    }

    protected boolean o0() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x01a7, code lost:
    
        r3 = (e2.m) r3.f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01ae, code lost:
    
        if (r3 != null) goto L79;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String toString() {
        /*
            Method dump skipped, instruction units count: 473
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e2.e.toString():java.lang.String");
    }

    protected void A0() {
    }

    protected void B0() {
    }

    protected void w0() {
    }
}
