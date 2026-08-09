package m2;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public class c extends u {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f9848i = new a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final ReentrantLock f9849j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Condition f9850k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final long f9851l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final long f9852m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static c f9853n;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f9854f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private c f9855g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f9856h;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.h hVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean d(c cVar) {
            ReentrantLock reentrantLockF = c.f9848i.f();
            reentrantLockF.lock();
            try {
                if (!cVar.f9854f) {
                    return false;
                }
                cVar.f9854f = false;
                for (c cVar2 = c.f9853n; cVar2 != null; cVar2 = cVar2.f9855g) {
                    if (cVar2.f9855g == cVar) {
                        cVar2.f9855g = cVar.f9855g;
                        cVar.f9855g = null;
                        return false;
                    }
                }
                reentrantLockF.unlock();
                return true;
            } finally {
                reentrantLockF.unlock();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0065 A[Catch: all -> 0x002b, TryCatch #0 {all -> 0x002b, blocks: (B:3:0x0009, B:5:0x0011, B:7:0x001a, B:10:0x002e, B:13:0x003a, B:14:0x0043, B:19:0x0054, B:20:0x005c, B:22:0x0065, B:25:0x0075, B:26:0x007a, B:28:0x008a, B:29:0x0093, B:18:0x004d, B:32:0x0099, B:33:0x009e, B:34:0x009f, B:35:0x00aa), top: B:38:0x0009 }] */
        /* JADX WARN: Removed duplicated region for block: B:28:0x008a A[Catch: all -> 0x002b, TryCatch #0 {all -> 0x002b, blocks: (B:3:0x0009, B:5:0x0011, B:7:0x001a, B:10:0x002e, B:13:0x003a, B:14:0x0043, B:19:0x0054, B:20:0x005c, B:22:0x0065, B:25:0x0075, B:26:0x007a, B:28:0x008a, B:29:0x0093, B:18:0x004d, B:32:0x0099, B:33:0x009e, B:34:0x009f, B:35:0x00aa), top: B:38:0x0009 }] */
        /* JADX WARN: Removed duplicated region for block: B:39:0x007a A[EDGE_INSN: B:39:0x007a->B:26:0x007a BREAK  A[LOOP:0: B:20:0x005c->B:25:0x0075], SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void g(m2.c r6, long r7, boolean r9) {
            /*
                r5 = this;
                m2.c$a r0 = m2.c.f9848i
                java.util.concurrent.locks.ReentrantLock r0 = r0.f()
                r0.lock()
                boolean r1 = m2.c.i(r6)     // Catch: java.lang.Throwable -> L2b
                r2 = 1
                r1 = r1 ^ r2
                if (r1 == 0) goto L9f
                m2.c.o(r6, r2)     // Catch: java.lang.Throwable -> L2b
                m2.c r1 = m2.c.f()     // Catch: java.lang.Throwable -> L2b
                if (r1 != 0) goto L2e
                m2.c r1 = new m2.c     // Catch: java.lang.Throwable -> L2b
                r1.<init>()     // Catch: java.lang.Throwable -> L2b
                m2.c.n(r1)     // Catch: java.lang.Throwable -> L2b
                m2.c$b r1 = new m2.c$b     // Catch: java.lang.Throwable -> L2b
                r1.<init>()     // Catch: java.lang.Throwable -> L2b
                r1.start()     // Catch: java.lang.Throwable -> L2b
                goto L2e
            L2b:
                r6 = move-exception
                goto Lab
            L2e:
                long r1 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L2b
                r3 = 0
                int r3 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
                if (r3 == 0) goto L48
                if (r9 == 0) goto L48
                long r3 = r6.a()     // Catch: java.lang.Throwable -> L2b
                long r3 = r3 - r1
                long r7 = java.lang.Math.min(r7, r3)     // Catch: java.lang.Throwable -> L2b
            L43:
                long r7 = r7 + r1
                m2.c.q(r6, r7)     // Catch: java.lang.Throwable -> L2b
                goto L54
            L48:
                if (r3 == 0) goto L4b
                goto L43
            L4b:
                if (r9 == 0) goto L99
                long r7 = r6.a()     // Catch: java.lang.Throwable -> L2b
                m2.c.q(r6, r7)     // Catch: java.lang.Throwable -> L2b
            L54:
                long r7 = m2.c.m(r6, r1)     // Catch: java.lang.Throwable -> L2b
                m2.c r9 = m2.c.f()     // Catch: java.lang.Throwable -> L2b
            L5c:
                kotlin.jvm.internal.m.b(r9)     // Catch: java.lang.Throwable -> L2b
                m2.c r3 = m2.c.k(r9)     // Catch: java.lang.Throwable -> L2b
                if (r3 == 0) goto L7a
                m2.c r3 = m2.c.k(r9)     // Catch: java.lang.Throwable -> L2b
                kotlin.jvm.internal.m.b(r3)     // Catch: java.lang.Throwable -> L2b
                long r3 = m2.c.m(r3, r1)     // Catch: java.lang.Throwable -> L2b
                int r3 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
                if (r3 >= 0) goto L75
                goto L7a
            L75:
                m2.c r9 = m2.c.k(r9)     // Catch: java.lang.Throwable -> L2b
                goto L5c
            L7a:
                m2.c r7 = m2.c.k(r9)     // Catch: java.lang.Throwable -> L2b
                m2.c.p(r6, r7)     // Catch: java.lang.Throwable -> L2b
                m2.c.p(r9, r6)     // Catch: java.lang.Throwable -> L2b
                m2.c r6 = m2.c.f()     // Catch: java.lang.Throwable -> L2b
                if (r9 != r6) goto L93
                m2.c$a r6 = m2.c.f9848i     // Catch: java.lang.Throwable -> L2b
                java.util.concurrent.locks.Condition r6 = r6.e()     // Catch: java.lang.Throwable -> L2b
                r6.signal()     // Catch: java.lang.Throwable -> L2b
            L93:
                I1.u r6 = I1.u.f2419a     // Catch: java.lang.Throwable -> L2b
                r0.unlock()
                return
            L99:
                java.lang.AssertionError r6 = new java.lang.AssertionError     // Catch: java.lang.Throwable -> L2b
                r6.<init>()     // Catch: java.lang.Throwable -> L2b
                throw r6     // Catch: java.lang.Throwable -> L2b
            L9f:
                java.lang.String r6 = "Unbalanced enter/exit"
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2b
                java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L2b
                r7.<init>(r6)     // Catch: java.lang.Throwable -> L2b
                throw r7     // Catch: java.lang.Throwable -> L2b
            Lab:
                r0.unlock()
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: m2.c.a.g(m2.c, long, boolean):void");
        }

        public final c c() throws InterruptedException {
            c cVar = c.f9853n;
            kotlin.jvm.internal.m.b(cVar);
            c cVar2 = cVar.f9855g;
            long jNanoTime = System.nanoTime();
            if (cVar2 == null) {
                e().await(c.f9851l, TimeUnit.MILLISECONDS);
                c cVar3 = c.f9853n;
                kotlin.jvm.internal.m.b(cVar3);
                if (cVar3.f9855g != null || System.nanoTime() - jNanoTime < c.f9852m) {
                    return null;
                }
                return c.f9853n;
            }
            long jU = cVar2.u(jNanoTime);
            if (jU > 0) {
                e().await(jU, TimeUnit.NANOSECONDS);
                return null;
            }
            c cVar4 = c.f9853n;
            kotlin.jvm.internal.m.b(cVar4);
            cVar4.f9855g = cVar2.f9855g;
            cVar2.f9855g = null;
            return cVar2;
        }

        public final Condition e() {
            return c.f9850k;
        }

        public final ReentrantLock f() {
            return c.f9849j;
        }
    }

    private static final class b extends Thread {
        public b() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            ReentrantLock reentrantLockF;
            c cVarC;
            while (true) {
                try {
                    a aVar = c.f9848i;
                    reentrantLockF = aVar.f();
                    reentrantLockF.lock();
                    try {
                        cVarC = aVar.c();
                    } finally {
                        reentrantLockF.unlock();
                    }
                } catch (InterruptedException unused) {
                }
                if (cVarC == c.f9853n) {
                    c.f9853n = null;
                    return;
                }
                I1.u uVar = I1.u.f2419a;
                reentrantLockF.unlock();
                if (cVarC != null) {
                    cVarC.x();
                }
            }
        }
    }

    /* JADX INFO: renamed from: m2.c$c, reason: collision with other inner class name */
    public static final class C0150c implements r {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ r f9858b;

        C0150c(r rVar) {
            this.f9858b = rVar;
        }

        @Override // m2.r
        public void T(m2.d source, long j3) throws IOException {
            kotlin.jvm.internal.m.e(source, "source");
            m2.b.b(source.b0(), 0L, j3);
            while (true) {
                long j4 = 0;
                if (j3 <= 0) {
                    return;
                }
                o oVar = source.f9861a;
                while (true) {
                    kotlin.jvm.internal.m.b(oVar);
                    if (j4 >= 65536) {
                        break;
                    }
                    j4 += (long) (oVar.f9889c - oVar.f9888b);
                    if (j4 >= j3) {
                        j4 = j3;
                        break;
                    }
                    oVar = oVar.f9892f;
                }
                c cVar = c.this;
                r rVar = this.f9858b;
                cVar.r();
                try {
                    rVar.T(source, j4);
                    I1.u uVar = I1.u.f2419a;
                    if (cVar.s()) {
                        throw cVar.l(null);
                    }
                    j3 -= j4;
                } catch (IOException e3) {
                    if (!cVar.s()) {
                        throw e3;
                    }
                    throw cVar.l(e3);
                } finally {
                    cVar.s();
                }
            }
        }

        @Override // m2.r, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            c cVar = c.this;
            r rVar = this.f9858b;
            cVar.r();
            try {
                rVar.close();
                I1.u uVar = I1.u.f2419a;
                if (cVar.s()) {
                    throw cVar.l(null);
                }
            } catch (IOException e3) {
                if (!cVar.s()) {
                    throw e3;
                }
                throw cVar.l(e3);
            } finally {
                cVar.s();
            }
        }

        @Override // m2.r, java.io.Flushable
        public void flush() throws IOException {
            c cVar = c.this;
            r rVar = this.f9858b;
            cVar.r();
            try {
                rVar.flush();
                I1.u uVar = I1.u.f2419a;
                if (cVar.s()) {
                    throw cVar.l(null);
                }
            } catch (IOException e3) {
                if (!cVar.s()) {
                    throw e3;
                }
                throw cVar.l(e3);
            } finally {
                cVar.s();
            }
        }

        public String toString() {
            return "AsyncTimeout.sink(" + this.f9858b + ')';
        }
    }

    public static final class d implements t {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ t f9860b;

        d(t tVar) {
            this.f9860b = tVar;
        }

        @Override // m2.t
        public long A(m2.d sink, long j3) throws IOException {
            kotlin.jvm.internal.m.e(sink, "sink");
            c cVar = c.this;
            t tVar = this.f9860b;
            cVar.r();
            try {
                long jA = tVar.A(sink, j3);
                if (cVar.s()) {
                    throw cVar.l(null);
                }
                return jA;
            } catch (IOException e3) {
                if (cVar.s()) {
                    throw cVar.l(e3);
                }
                throw e3;
            } finally {
                cVar.s();
            }
        }

        @Override // m2.t, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            c cVar = c.this;
            t tVar = this.f9860b;
            cVar.r();
            try {
                tVar.close();
                I1.u uVar = I1.u.f2419a;
                if (cVar.s()) {
                    throw cVar.l(null);
                }
            } catch (IOException e3) {
                if (!cVar.s()) {
                    throw e3;
                }
                throw cVar.l(e3);
            } finally {
                cVar.s();
            }
        }

        public String toString() {
            return "AsyncTimeout.source(" + this.f9860b + ')';
        }
    }

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        f9849j = reentrantLock;
        Condition conditionNewCondition = reentrantLock.newCondition();
        kotlin.jvm.internal.m.d(conditionNewCondition, "lock.newCondition()");
        f9850k = conditionNewCondition;
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f9851l = millis;
        f9852m = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long u(long j3) {
        return this.f9856h - j3;
    }

    public final IOException l(IOException iOException) {
        return t(iOException);
    }

    public final void r() {
        long jD = d();
        boolean zB = b();
        if (jD != 0 || zB) {
            f9848i.g(this, jD, zB);
        }
    }

    public final boolean s() {
        return f9848i.d(this);
    }

    protected IOException t(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public final r v(r sink) {
        kotlin.jvm.internal.m.e(sink, "sink");
        return new C0150c(sink);
    }

    public final t w(t source) {
        kotlin.jvm.internal.m.e(source, "source");
        return new d(source);
    }

    protected void x() {
    }
}
