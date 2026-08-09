package c2;

import c2.X;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: c2.k0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0571k0 extends AbstractC0573l0 implements X {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f5152f = AtomicReferenceFieldUpdater.newUpdater(AbstractC0571k0.class, Object.class, "_queue$volatile");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f5153l = AtomicReferenceFieldUpdater.newUpdater(AbstractC0571k0.class, Object.class, "_delayed$volatile");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f5154m = AtomicIntegerFieldUpdater.newUpdater(AbstractC0571k0.class, "_isCompleted$volatile");
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile = 0;
    private volatile /* synthetic */ Object _queue$volatile;

    /* JADX INFO: renamed from: c2.k0$a */
    private final class a extends c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final InterfaceC0576n f5155c;

        public a(long j3, InterfaceC0576n interfaceC0576n) {
            super(j3);
            this.f5155c = interfaceC0576n;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f5155c.k(AbstractC0571k0.this, I1.u.f2419a);
        }

        @Override // c2.AbstractC0571k0.c
        public String toString() {
            return super.toString() + this.f5155c;
        }
    }

    /* JADX INFO: renamed from: c2.k0$b */
    private static final class b extends c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Runnable f5157c;

        public b(long j3, Runnable runnable) {
            super(j3);
            this.f5157c = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f5157c.run();
        }

        @Override // c2.AbstractC0571k0.c
        public String toString() {
            return super.toString() + this.f5157c;
        }
    }

    /* JADX INFO: renamed from: c2.k0$c */
    public static abstract class c implements Runnable, Comparable, InterfaceC0561f0, h2.N {
        private volatile Object _heap;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f5158a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f5159b = -1;

        public c(long j3) {
            this.f5158a = j3;
        }

        @Override // h2.N
        public void c(int i3) {
            this.f5159b = i3;
        }

        @Override // c2.InterfaceC0561f0
        public final void e() {
            synchronized (this) {
                try {
                    Object obj = this._heap;
                    if (obj == AbstractC0577n0.f5163a) {
                        return;
                    }
                    d dVar = obj instanceof d ? (d) obj : null;
                    if (dVar != null) {
                        dVar.h(this);
                    }
                    this._heap = AbstractC0577n0.f5163a;
                    I1.u uVar = I1.u.f2419a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // h2.N
        public int g() {
            return this.f5159b;
        }

        @Override // h2.N
        public h2.M i() {
            Object obj = this._heap;
            if (obj instanceof h2.M) {
                return (h2.M) obj;
            }
            return null;
        }

        @Override // h2.N
        public void j(h2.M m3) {
            if (this._heap == AbstractC0577n0.f5163a) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            this._heap = m3;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public int compareTo(c cVar) {
            long j3 = this.f5158a - cVar.f5158a;
            if (j3 > 0) {
                return 1;
            }
            return j3 < 0 ? -1 : 0;
        }

        /* JADX WARN: Removed duplicated region for block: B:31:0x0044 A[Catch: all -> 0x0026, TryCatch #0 {all -> 0x0026, blocks: (B:9:0x000d, B:19:0x0023, B:29:0x003b, B:31:0x0044, B:32:0x0046, B:22:0x0028, B:26:0x0032), top: B:41:0x000d, outer: #1 }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final int l(long r8, c2.AbstractC0571k0.d r10, c2.AbstractC0571k0 r11) {
            /*
                r7 = this;
                monitor-enter(r7)
                java.lang.Object r0 = r7._heap     // Catch: java.lang.Throwable -> L1d
                h2.D r1 = c2.AbstractC0577n0.b()     // Catch: java.lang.Throwable -> L1d
                if (r0 != r1) goto Lc
                monitor-exit(r7)
                r8 = 2
                return r8
            Lc:
                monitor-enter(r10)     // Catch: java.lang.Throwable -> L1d
                h2.N r0 = r10.b()     // Catch: java.lang.Throwable -> L26
                c2.k0$c r0 = (c2.AbstractC0571k0.c) r0     // Catch: java.lang.Throwable -> L26
                boolean r11 = c2.AbstractC0571k0.n0(r11)     // Catch: java.lang.Throwable -> L26
                if (r11 == 0) goto L1f
                monitor-exit(r10)     // Catch: java.lang.Throwable -> L1d
                monitor-exit(r7)
                r8 = 1
                return r8
            L1d:
                r8 = move-exception
                goto L4f
            L1f:
                r1 = 0
                if (r0 != 0) goto L28
            L23:
                r10.f5160c = r8     // Catch: java.lang.Throwable -> L26
                goto L3b
            L26:
                r8 = move-exception
                goto L4d
            L28:
                long r3 = r0.f5158a     // Catch: java.lang.Throwable -> L26
                long r5 = r3 - r8
                int r11 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
                if (r11 < 0) goto L31
                goto L32
            L31:
                r8 = r3
            L32:
                long r3 = r10.f5160c     // Catch: java.lang.Throwable -> L26
                long r3 = r8 - r3
                int r11 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                if (r11 <= 0) goto L3b
                goto L23
            L3b:
                long r8 = r7.f5158a     // Catch: java.lang.Throwable -> L26
                long r3 = r10.f5160c     // Catch: java.lang.Throwable -> L26
                long r8 = r8 - r3
                int r8 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
                if (r8 >= 0) goto L46
                r7.f5158a = r3     // Catch: java.lang.Throwable -> L26
            L46:
                r10.a(r7)     // Catch: java.lang.Throwable -> L26
                monitor-exit(r10)     // Catch: java.lang.Throwable -> L1d
                monitor-exit(r7)
                r8 = 0
                return r8
            L4d:
                monitor-exit(r10)     // Catch: java.lang.Throwable -> L1d
                throw r8     // Catch: java.lang.Throwable -> L1d
            L4f:
                monitor-exit(r7)
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: c2.AbstractC0571k0.c.l(long, c2.k0$d, c2.k0):int");
        }

        public final boolean m(long j3) {
            return j3 - this.f5158a >= 0;
        }

        public String toString() {
            return "Delayed[nanos=" + this.f5158a + ']';
        }
    }

    /* JADX INFO: renamed from: c2.k0$d */
    public static final class d extends h2.M {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f5160c;

        public d(long j3) {
            this.f5160c = j3;
        }
    }

    private final int A0(long j3, c cVar) {
        if (isCompleted()) {
            return 1;
        }
        d dVar = (d) f5153l.get(this);
        if (dVar == null) {
            androidx.concurrent.futures.b.a(f5153l, this, null, new d(j3));
            Object obj = f5153l.get(this);
            kotlin.jvm.internal.m.b(obj);
            dVar = (d) obj;
        }
        return cVar.l(j3, dVar, this);
    }

    private final void C0(boolean z2) {
        f5154m.set(this, z2 ? 1 : 0);
    }

    private final boolean D0(c cVar) {
        d dVar = (d) f5153l.get(this);
        return (dVar != null ? (c) dVar.f() : null) == cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isCompleted() {
        return f5154m.get(this) != 0;
    }

    private final void o0() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5152f;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                if (androidx.concurrent.futures.b.a(f5152f, this, null, AbstractC0577n0.f5164b)) {
                    return;
                }
            } else if (obj instanceof h2.q) {
                ((h2.q) obj).d();
                return;
            } else {
                if (obj == AbstractC0577n0.f5164b) {
                    return;
                }
                h2.q qVar = new h2.q(8, true);
                kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type java.lang.Runnable");
                qVar.a((Runnable) obj);
                if (androidx.concurrent.futures.b.a(f5152f, this, obj, qVar)) {
                    return;
                }
            }
        }
    }

    private final Runnable p0() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5152f;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                return null;
            }
            if (obj instanceof h2.q) {
                kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable>");
                h2.q qVar = (h2.q) obj;
                Object objM = qVar.m();
                if (objM != h2.q.f7468h) {
                    return (Runnable) objM;
                }
                androidx.concurrent.futures.b.a(f5152f, this, obj, qVar.l());
            } else {
                if (obj == AbstractC0577n0.f5164b) {
                    return null;
                }
                if (androidx.concurrent.futures.b.a(f5152f, this, obj, null)) {
                    kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type java.lang.Runnable");
                    return (Runnable) obj;
                }
            }
        }
    }

    private final void r0() {
        h2.N nI;
        d dVar = (d) f5153l.get(this);
        if (dVar == null || dVar.e()) {
            return;
        }
        AbstractC0554c.a();
        long jNanoTime = System.nanoTime();
        do {
            synchronized (dVar) {
                h2.N nB = dVar.b();
                nI = null;
                if (nB != null) {
                    c cVar = (c) nB;
                    if (cVar.m(jNanoTime) && s0(cVar)) {
                        nI = dVar.i(0);
                    }
                }
            }
        } while (((c) nI) != null);
    }

    private final boolean s0(Runnable runnable) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5152f;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (isCompleted()) {
                return false;
            }
            if (obj == null) {
                if (androidx.concurrent.futures.b.a(f5152f, this, null, runnable)) {
                    return true;
                }
            } else if (obj instanceof h2.q) {
                kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable>");
                h2.q qVar = (h2.q) obj;
                int iA = qVar.a(runnable);
                if (iA == 0) {
                    return true;
                }
                if (iA == 1) {
                    androidx.concurrent.futures.b.a(f5152f, this, obj, qVar.l());
                } else if (iA == 2) {
                    return false;
                }
            } else {
                if (obj == AbstractC0577n0.f5164b) {
                    return false;
                }
                h2.q qVar2 = new h2.q(8, true);
                kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type java.lang.Runnable");
                qVar2.a((Runnable) obj);
                qVar2.a(runnable);
                if (androidx.concurrent.futures.b.a(f5152f, this, obj, qVar2)) {
                    return true;
                }
            }
        }
    }

    private final void x0() {
        c cVar;
        AbstractC0554c.a();
        long jNanoTime = System.nanoTime();
        while (true) {
            d dVar = (d) f5153l.get(this);
            if (dVar == null || (cVar = (c) dVar.j()) == null) {
                return;
            } else {
                l0(jNanoTime, cVar);
            }
        }
    }

    protected final InterfaceC0561f0 B0(long j3, Runnable runnable) {
        long jC = AbstractC0577n0.c(j3);
        if (jC >= 4611686018427387903L) {
            return L0.f5094a;
        }
        AbstractC0554c.a();
        long jNanoTime = System.nanoTime();
        b bVar = new b(jC + jNanoTime, runnable);
        z0(jNanoTime, bVar);
        return bVar;
    }

    @Override // c2.X
    public void L(long j3, InterfaceC0576n interfaceC0576n) {
        long jC = AbstractC0577n0.c(j3);
        if (jC < 4611686018427387903L) {
            AbstractC0554c.a();
            long jNanoTime = System.nanoTime();
            a aVar = new a(jC + jNanoTime, interfaceC0576n);
            z0(jNanoTime, aVar);
            r.a(interfaceC0576n, aVar);
        }
    }

    @Override // c2.K
    public final void U(M1.g gVar, Runnable runnable) {
        q0(runnable);
    }

    public InterfaceC0561f0 b(long j3, Runnable runnable, M1.g gVar) {
        return X.a.a(this, j3, runnable, gVar);
    }

    @Override // c2.AbstractC0569j0
    protected long c0() {
        c cVar;
        if (super.c0() == 0) {
            return 0L;
        }
        Object obj = f5152f.get(this);
        if (obj != null) {
            if (!(obj instanceof h2.q)) {
                return obj == AbstractC0577n0.f5164b ? Long.MAX_VALUE : 0L;
            }
            if (!((h2.q) obj).j()) {
                return 0L;
            }
        }
        d dVar = (d) f5153l.get(this);
        if (dVar == null || (cVar = (c) dVar.f()) == null) {
            return Long.MAX_VALUE;
        }
        long j3 = cVar.f5158a;
        AbstractC0554c.a();
        return Y1.i.b(j3 - System.nanoTime(), 0L);
    }

    @Override // c2.AbstractC0569j0
    public long h0() {
        if (i0()) {
            return 0L;
        }
        r0();
        Runnable runnableP0 = p0();
        if (runnableP0 == null) {
            return c0();
        }
        runnableP0.run();
        return 0L;
    }

    public void q0(Runnable runnable) {
        r0();
        if (s0(runnable)) {
            m0();
        } else {
            T.f5106n.q0(runnable);
        }
    }

    @Override // c2.AbstractC0569j0
    public void shutdown() {
        V0.f5110a.c();
        C0(true);
        o0();
        while (h0() <= 0) {
        }
        x0();
    }

    protected boolean w0() {
        if (!g0()) {
            return false;
        }
        d dVar = (d) f5153l.get(this);
        if (dVar != null && !dVar.e()) {
            return false;
        }
        Object obj = f5152f.get(this);
        if (obj != null) {
            if (obj instanceof h2.q) {
                return ((h2.q) obj).j();
            }
            if (obj != AbstractC0577n0.f5164b) {
                return false;
            }
        }
        return true;
    }

    protected final void y0() {
        f5152f.set(this, null);
        f5153l.set(this, null);
    }

    public final void z0(long j3, c cVar) {
        int iA0 = A0(j3, cVar);
        if (iA0 == 0) {
            if (D0(cVar)) {
                m0();
            }
        } else if (iA0 == 1) {
            l0(j3, cVar);
        } else if (iA0 != 2) {
            throw new IllegalStateException("unexpected result".toString());
        }
    }
}
