package j2;

import I1.u;
import c2.AbstractC0554c;
import c2.S;
import com.google.android.gms.common.api.a;
import h2.D;
import h2.y;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Executor, Closeable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final C0141a f9392m = new C0141a(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f9393n = AtomicLongFieldUpdater.newUpdater(a.class, "parkedWorkersStack$volatile");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f9394o = AtomicLongFieldUpdater.newUpdater(a.class, "controlState$volatile");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f9395p = AtomicIntegerFieldUpdater.newUpdater(a.class, "_isTerminated$volatile");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final D f9396q = new D("NOT_IN_STACK");
    private volatile /* synthetic */ int _isTerminated$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f9398b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f9399c;
    private volatile /* synthetic */ long controlState$volatile;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f9400d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final j2.d f9401e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final j2.d f9402f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final y f9403l;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    /* JADX INFO: renamed from: j2.a$a, reason: collision with other inner class name */
    public static final class C0141a {
        private C0141a() {
        }

        public /* synthetic */ C0141a(kotlin.jvm.internal.h hVar) {
            this();
        }
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9404a;

        static {
            int[] iArr = new int[d.values().length];
            try {
                iArr[d.f9416c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[d.f9415b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[d.f9414a.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[d.f9417d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[d.f9418e.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f9404a = iArr;
        }
    }

    public final class c extends Thread {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final /* synthetic */ AtomicIntegerFieldUpdater f9405n = AtomicIntegerFieldUpdater.newUpdater(c.class, "workerCtl$volatile");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final l f9406a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final kotlin.jvm.internal.y f9407b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public d f9408c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f9409d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f9410e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f9411f;
        private volatile int indexInArray;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public boolean f9412l;
        private volatile Object nextParkedWorker;
        private volatile /* synthetic */ int workerCtl$volatile;

        private c() {
            setDaemon(true);
            setContextClassLoader(a.this.getClass().getClassLoader());
            this.f9406a = new l();
            this.f9407b = new kotlin.jvm.internal.y();
            this.f9408c = d.f9417d;
            this.nextParkedWorker = a.f9396q;
            int iNanoTime = (int) System.nanoTime();
            this.f9411f = iNanoTime == 0 ? 42 : iNanoTime;
        }

        private final void b(h hVar) {
            this.f9409d = 0L;
            if (this.f9408c == d.f9416c) {
                this.f9408c = d.f9415b;
            }
            if (!hVar.f9431b) {
                a.this.X(hVar);
                return;
            }
            if (r(d.f9415b)) {
                a.this.a0();
            }
            a.this.X(hVar);
            a.K().addAndGet(a.this, -2097152L);
            if (this.f9408c != d.f9418e) {
                this.f9408c = d.f9417d;
            }
        }

        private final h c(boolean z2) {
            h hVarL;
            h hVarL2;
            if (z2) {
                boolean z3 = j(a.this.f9397a * 2) == 0;
                if (z3 && (hVarL2 = l()) != null) {
                    return hVarL2;
                }
                h hVarK = this.f9406a.k();
                if (hVarK != null) {
                    return hVarK;
                }
                if (!z3 && (hVarL = l()) != null) {
                    return hVarL;
                }
            } else {
                h hVarL3 = l();
                if (hVarL3 != null) {
                    return hVarL3;
                }
            }
            return s(3);
        }

        private final h d() {
            h hVarL = this.f9406a.l();
            if (hVarL != null) {
                return hVarL;
            }
            h hVar = (h) a.this.f9402f.e();
            return hVar == null ? s(1) : hVar;
        }

        private final boolean i() {
            return this.nextParkedWorker != a.f9396q;
        }

        private final void k() {
            if (this.f9409d == 0) {
                this.f9409d = System.nanoTime() + a.this.f9399c;
            }
            LockSupport.parkNanos(a.this.f9399c);
            if (System.nanoTime() - this.f9409d >= 0) {
                this.f9409d = 0L;
                t();
            }
        }

        private final h l() {
            j2.d dVar;
            if (j(2) == 0) {
                h hVar = (h) a.this.f9401e.e();
                if (hVar != null) {
                    return hVar;
                }
                dVar = a.this.f9402f;
            } else {
                h hVar2 = (h) a.this.f9402f.e();
                if (hVar2 != null) {
                    return hVar2;
                }
                dVar = a.this.f9401e;
            }
            return (h) dVar.e();
        }

        private final void m() {
            loop0: while (true) {
                boolean z2 = false;
                while (!a.this.isTerminated() && this.f9408c != d.f9418e) {
                    h hVarE = e(this.f9412l);
                    if (hVarE != null) {
                        this.f9410e = 0L;
                        b(hVarE);
                    } else {
                        this.f9412l = false;
                        if (this.f9410e == 0) {
                            q();
                        } else if (z2) {
                            r(d.f9416c);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.f9410e);
                            this.f9410e = 0L;
                        } else {
                            z2 = true;
                        }
                    }
                }
                break loop0;
            }
            r(d.f9418e);
        }

        private final boolean p() {
            long j3;
            if (this.f9408c == d.f9414a) {
                return true;
            }
            a aVar = a.this;
            AtomicLongFieldUpdater atomicLongFieldUpdaterK = a.K();
            do {
                j3 = atomicLongFieldUpdaterK.get(aVar);
                if (((int) ((9223367638808264704L & j3) >> 42)) == 0) {
                    return false;
                }
            } while (!a.K().compareAndSet(aVar, j3, j3 - 4398046511104L));
            this.f9408c = d.f9414a;
            return true;
        }

        private final void q() {
            if (!i()) {
                a.this.V(this);
                return;
            }
            f9405n.set(this, -1);
            while (i() && f9405n.get(this) == -1 && !a.this.isTerminated() && this.f9408c != d.f9418e) {
                r(d.f9416c);
                Thread.interrupted();
                k();
            }
        }

        private final h s(int i3) {
            int i4 = (int) (a.K().get(a.this) & 2097151);
            if (i4 < 2) {
                return null;
            }
            int iJ = j(i4);
            a aVar = a.this;
            long jMin = Long.MAX_VALUE;
            for (int i5 = 0; i5 < i4; i5++) {
                iJ++;
                if (iJ > i4) {
                    iJ = 1;
                }
                c cVar = (c) aVar.f9403l.b(iJ);
                if (cVar != null && cVar != this) {
                    long jR = cVar.f9406a.r(i3, this.f9407b);
                    if (jR == -1) {
                        kotlin.jvm.internal.y yVar = this.f9407b;
                        h hVar = (h) yVar.f9750a;
                        yVar.f9750a = null;
                        return hVar;
                    }
                    if (jR > 0) {
                        jMin = Math.min(jMin, jR);
                    }
                }
            }
            if (jMin == Long.MAX_VALUE) {
                jMin = 0;
            }
            this.f9410e = jMin;
            return null;
        }

        private final void t() {
            a aVar = a.this;
            synchronized (aVar.f9403l) {
                try {
                    if (aVar.isTerminated()) {
                        return;
                    }
                    if (((int) (a.K().get(aVar) & 2097151)) <= aVar.f9397a) {
                        return;
                    }
                    if (f9405n.compareAndSet(this, -1, 1)) {
                        int i3 = this.indexInArray;
                        n(0);
                        aVar.W(this, i3, 0);
                        int andDecrement = (int) (a.K().getAndDecrement(aVar) & 2097151);
                        if (andDecrement != i3) {
                            Object objB = aVar.f9403l.b(andDecrement);
                            m.b(objB);
                            c cVar = (c) objB;
                            aVar.f9403l.c(i3, cVar);
                            cVar.n(i3);
                            aVar.W(cVar, andDecrement, i3);
                        }
                        aVar.f9403l.c(andDecrement, null);
                        u uVar = u.f2419a;
                        this.f9408c = d.f9418e;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final h e(boolean z2) {
            return p() ? c(z2) : d();
        }

        public final int f() {
            return this.indexInArray;
        }

        public final Object g() {
            return this.nextParkedWorker;
        }

        public final int j(int i3) {
            int i4 = this.f9411f;
            int i5 = i4 ^ (i4 << 13);
            int i6 = i5 ^ (i5 >> 17);
            int i7 = i6 ^ (i6 << 5);
            this.f9411f = i7;
            int i8 = i3 - 1;
            return (i8 & i3) == 0 ? i7 & i8 : (i7 & a.e.API_PRIORITY_OTHER) % i3;
        }

        public final void n(int i3) {
            StringBuilder sb = new StringBuilder();
            sb.append(a.this.f9400d);
            sb.append("-worker-");
            sb.append(i3 == 0 ? "TERMINATED" : String.valueOf(i3));
            setName(sb.toString());
            this.indexInArray = i3;
        }

        public final void o(Object obj) {
            this.nextParkedWorker = obj;
        }

        public final boolean r(d dVar) {
            d dVar2 = this.f9408c;
            boolean z2 = dVar2 == d.f9414a;
            if (z2) {
                a.K().addAndGet(a.this, 4398046511104L);
            }
            if (dVar2 != dVar) {
                this.f9408c = dVar;
            }
            return z2;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            m();
        }

        public c(a aVar, int i3) {
            this();
            n(i3);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f9414a = new d("CPU_ACQUIRED", 0);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final d f9415b = new d("BLOCKING", 1);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d f9416c = new d("PARKING", 2);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final d f9417d = new d("DORMANT", 3);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final d f9418e = new d("TERMINATED", 4);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ d[] f9419f;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final /* synthetic */ O1.a f9420l;

        static {
            d[] dVarArrC = c();
            f9419f = dVarArrC;
            f9420l = O1.b.a(dVarArrC);
        }

        private d(String str, int i3) {
        }

        private static final /* synthetic */ d[] c() {
            return new d[]{f9414a, f9415b, f9416c, f9417d, f9418e};
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) f9419f.clone();
        }
    }

    public a(int i3, int i4, long j3, String str) {
        this.f9397a = i3;
        this.f9398b = i4;
        this.f9399c = j3;
        this.f9400d = str;
        if (i3 < 1) {
            throw new IllegalArgumentException(("Core pool size " + i3 + " should be at least 1").toString());
        }
        if (i4 < i3) {
            throw new IllegalArgumentException(("Max pool size " + i4 + " should be greater than or equals to core pool size " + i3).toString());
        }
        if (i4 > 2097150) {
            throw new IllegalArgumentException(("Max pool size " + i4 + " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j3 <= 0) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j3 + " must be positive").toString());
        }
        this.f9401e = new j2.d();
        this.f9402f = new j2.d();
        this.f9403l = new y((i3 + 1) * 2);
        this.controlState$volatile = ((long) i3) << 42;
        this._isTerminated$volatile = 0;
    }

    public static /* synthetic */ void B(a aVar, Runnable runnable, boolean z2, boolean z3, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            z2 = false;
        }
        if ((i3 & 4) != 0) {
            z3 = false;
        }
        aVar.z(runnable, z2, z3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicLongFieldUpdater K() {
        return f9394o;
    }

    private final int R(c cVar) {
        int iF;
        do {
            Object objG = cVar.g();
            if (objG == f9396q) {
                return -1;
            }
            if (objG == null) {
                return 0;
            }
            cVar = (c) objG;
            iF = cVar.f();
        } while (iF == 0);
        return iF;
    }

    private final c U() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f9393n;
        while (true) {
            long j3 = atomicLongFieldUpdater.get(this);
            c cVar = (c) this.f9403l.b((int) (2097151 & j3));
            if (cVar == null) {
                return null;
            }
            long j4 = (2097152 + j3) & (-2097152);
            int iR = R(cVar);
            if (iR >= 0 && f9393n.compareAndSet(this, j3, ((long) iR) | j4)) {
                cVar.o(f9396q);
                return cVar;
            }
        }
    }

    private final void Z(long j3, boolean z2) {
        if (z2 || e0() || c0(j3)) {
            return;
        }
        e0();
    }

    private final h b0(c cVar, h hVar, boolean z2) {
        d dVar;
        if (cVar == null || (dVar = cVar.f9408c) == d.f9418e) {
            return hVar;
        }
        if (!hVar.f9431b && dVar == d.f9415b) {
            return hVar;
        }
        cVar.f9412l = true;
        return cVar.f9406a.a(hVar, z2);
    }

    private final boolean c0(long j3) {
        if (Y1.i.a(((int) (2097151 & j3)) - ((int) ((j3 & 4398044413952L) >> 21)), 0) < this.f9397a) {
            int iL = l();
            if (iL == 1 && this.f9397a > 1) {
                l();
            }
            if (iL > 0) {
                return true;
            }
        }
        return false;
    }

    static /* synthetic */ boolean d0(a aVar, long j3, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            j3 = f9394o.get(aVar);
        }
        return aVar.c0(j3);
    }

    private final boolean e0() {
        c cVarU;
        do {
            cVarU = U();
            if (cVarU == null) {
                return false;
            }
        } while (!c.f9405n.compareAndSet(cVarU, -1, 0));
        LockSupport.unpark(cVarU);
        return true;
    }

    private final boolean f(h hVar) {
        return (hVar.f9431b ? this.f9402f : this.f9401e).a(hVar);
    }

    private final int l() {
        synchronized (this.f9403l) {
            try {
                if (isTerminated()) {
                    return -1;
                }
                long j3 = f9394o.get(this);
                int i3 = (int) (j3 & 2097151);
                int iA = Y1.i.a(i3 - ((int) ((j3 & 4398044413952L) >> 21)), 0);
                if (iA >= this.f9397a) {
                    return 0;
                }
                if (i3 >= this.f9398b) {
                    return 0;
                }
                int i4 = ((int) (K().get(this) & 2097151)) + 1;
                if (i4 <= 0 || this.f9403l.b(i4) != null) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                c cVar = new c(this, i4);
                this.f9403l.c(i4, cVar);
                if (i4 != ((int) (2097151 & f9394o.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                int i5 = iA + 1;
                cVar.start();
                return i5;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final c u() {
        Thread threadCurrentThread = Thread.currentThread();
        c cVar = threadCurrentThread instanceof c ? (c) threadCurrentThread : null;
        if (cVar == null || !m.a(a.this, this)) {
            return null;
        }
        return cVar;
    }

    public final boolean V(c cVar) {
        long j3;
        int iF;
        if (cVar.g() != f9396q) {
            return false;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = f9393n;
        do {
            j3 = atomicLongFieldUpdater.get(this);
            iF = cVar.f();
            cVar.o(this.f9403l.b((int) (2097151 & j3)));
        } while (!f9393n.compareAndSet(this, j3, ((2097152 + j3) & (-2097152)) | ((long) iF)));
        return true;
    }

    public final void W(c cVar, int i3, int i4) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f9393n;
        while (true) {
            long j3 = atomicLongFieldUpdater.get(this);
            int iR = (int) (2097151 & j3);
            long j4 = (2097152 + j3) & (-2097152);
            if (iR == i3) {
                iR = i4 == 0 ? R(cVar) : i4;
            }
            if (iR >= 0 && f9393n.compareAndSet(this, j3, j4 | ((long) iR))) {
                return;
            }
        }
    }

    public final void X(h hVar) {
        try {
            hVar.run();
        } finally {
            try {
            } finally {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void Y(long r8) throws java.lang.InterruptedException {
        /*
            r7 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = P()
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r7, r1, r2)
            if (r0 != 0) goto Ld
            return
        Ld:
            j2.a$c r0 = r7.u()
            h2.y r1 = r7.f9403l
            monitor-enter(r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = b()     // Catch: java.lang.Throwable -> L8f
            long r3 = r3.get(r7)     // Catch: java.lang.Throwable -> L8f
            r5 = 2097151(0x1fffff, double:1.0361303E-317)
            long r3 = r3 & r5
            int r3 = (int) r3
            monitor-exit(r1)
            if (r2 > r3) goto L4d
            r1 = r2
        L25:
            h2.y r4 = r7.f9403l
            java.lang.Object r4 = r4.b(r1)
            kotlin.jvm.internal.m.b(r4)
            j2.a$c r4 = (j2.a.c) r4
            if (r4 == r0) goto L48
        L32:
            java.lang.Thread$State r5 = r4.getState()
            java.lang.Thread$State r6 = java.lang.Thread.State.TERMINATED
            if (r5 == r6) goto L41
            java.util.concurrent.locks.LockSupport.unpark(r4)
            r4.join(r8)
            goto L32
        L41:
            j2.l r4 = r4.f9406a
            j2.d r5 = r7.f9402f
            r4.j(r5)
        L48:
            if (r1 == r3) goto L4d
            int r1 = r1 + 1
            goto L25
        L4d:
            j2.d r8 = r7.f9402f
            r8.b()
            j2.d r8 = r7.f9401e
            r8.b()
        L57:
            if (r0 == 0) goto L5f
            j2.h r8 = r0.e(r2)
            if (r8 != 0) goto L8b
        L5f:
            j2.d r8 = r7.f9401e
            java.lang.Object r8 = r8.e()
            j2.h r8 = (j2.h) r8
            if (r8 != 0) goto L8b
            j2.d r8 = r7.f9402f
            java.lang.Object r8 = r8.e()
            j2.h r8 = (j2.h) r8
            if (r8 != 0) goto L8b
            if (r0 == 0) goto L7a
            j2.a$d r8 = j2.a.d.f9418e
            r0.r(r8)
        L7a:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r8 = L()
            r0 = 0
            r8.set(r7, r0)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r8 = K()
            r8.set(r7, r0)
            return
        L8b:
            r7.X(r8)
            goto L57
        L8f:
            r8 = move-exception
            monitor-exit(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: j2.a.Y(long):void");
    }

    public final void a0() {
        if (e0() || d0(this, 0L, 1, null)) {
            return;
        }
        e0();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws InterruptedException {
        Y(10000L);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        B(this, runnable, false, false, 6, null);
    }

    public final boolean isTerminated() {
        return f9395p.get(this) != 0;
    }

    public final h r(Runnable runnable, boolean z2) {
        long jA = j.f9438f.a();
        if (!(runnable instanceof h)) {
            return j.b(runnable, jA, z2);
        }
        h hVar = (h) runnable;
        hVar.f9430a = jA;
        hVar.f9431b = z2;
        return hVar;
    }

    public String toString() {
        StringBuilder sb;
        char c3;
        ArrayList arrayList = new ArrayList();
        int iA = this.f9403l.a();
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 1; i8 < iA; i8++) {
            c cVar = (c) this.f9403l.b(i8);
            if (cVar != null) {
                int i9 = cVar.f9406a.i();
                int i10 = b.f9404a[cVar.f9408c.ordinal()];
                if (i10 != 1) {
                    if (i10 == 2) {
                        i4++;
                        sb = new StringBuilder();
                        sb.append(i9);
                        c3 = 'b';
                    } else if (i10 == 3) {
                        i3++;
                        sb = new StringBuilder();
                        sb.append(i9);
                        c3 = 'c';
                    } else if (i10 == 4) {
                        i6++;
                        if (i9 > 0) {
                            sb = new StringBuilder();
                            sb.append(i9);
                            c3 = 'd';
                        }
                    } else {
                        if (i10 != 5) {
                            throw new I1.k();
                        }
                        i7++;
                    }
                    sb.append(c3);
                    arrayList.add(sb.toString());
                } else {
                    i5++;
                }
            }
        }
        long j3 = f9394o.get(this);
        return this.f9400d + '@' + S.b(this) + "[Pool Size {core = " + this.f9397a + ", max = " + this.f9398b + "}, Worker States {CPU = " + i3 + ", blocking = " + i4 + ", parked = " + i5 + ", dormant = " + i6 + ", terminated = " + i7 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.f9401e.c() + ", global blocking queue size = " + this.f9402f.c() + ", Control State {created workers= " + ((int) (2097151 & j3)) + ", blocking tasks = " + ((int) ((4398044413952L & j3) >> 21)) + ", CPUs acquired = " + (this.f9397a - ((int) ((9223367638808264704L & j3) >> 42))) + "}]";
    }

    public final void z(Runnable runnable, boolean z2, boolean z3) {
        AbstractC0554c.a();
        h hVarR = r(runnable, z2);
        boolean z4 = hVarR.f9431b;
        long jAddAndGet = z4 ? f9394o.addAndGet(this, 2097152L) : 0L;
        c cVarU = u();
        h hVarB0 = b0(cVarU, hVarR, z3);
        if (hVarB0 != null && !f(hVarB0)) {
            throw new RejectedExecutionException(this.f9400d + " was terminated");
        }
        boolean z5 = z3 && cVarU != null;
        if (z4) {
            Z(jAddAndGet, z5);
        } else {
            if (z5) {
                return;
            }
            a0();
        }
    }
}
