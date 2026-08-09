package h2;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f7465e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f7466f = AtomicReferenceFieldUpdater.newUpdater(q.class, Object.class, "_next$volatile");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f7467g = AtomicLongFieldUpdater.newUpdater(q.class, "_state$volatile");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final D f7468h = new D("REMOVE_FROZEN");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f7469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f7470b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f7471c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final /* synthetic */ AtomicReferenceArray f7472d;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.h hVar) {
            this();
        }

        public final int a(long j3) {
            return (j3 & 2305843009213693952L) != 0 ? 2 : 1;
        }

        public final long b(long j3, int i3) {
            return d(j3, 1073741823L) | ((long) i3);
        }

        public final long c(long j3, int i3) {
            return d(j3, 1152921503533105152L) | (((long) i3) << 30);
        }

        public final long d(long j3, long j4) {
            return j3 & (~j4);
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f7473a;

        public b(int i3) {
            this.f7473a = i3;
        }
    }

    public q(int i3, boolean z2) {
        this.f7469a = i3;
        this.f7470b = z2;
        int i4 = i3 - 1;
        this.f7471c = i4;
        this.f7472d = new AtomicReferenceArray(i3);
        if (i4 > 1073741823) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if ((i3 & i4) != 0) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    private final q b(long j3) {
        q qVar = new q(this.f7469a * 2, this.f7470b);
        int i3 = (int) (1073741823 & j3);
        int i4 = (int) ((1152921503533105152L & j3) >> 30);
        while (true) {
            int i5 = this.f7471c;
            if ((i3 & i5) == (i5 & i4)) {
                f7467g.set(qVar, f7465e.d(j3, 1152921504606846976L));
                return qVar;
            }
            Object bVar = f().get(this.f7471c & i3);
            if (bVar == null) {
                bVar = new b(i3);
            }
            qVar.f().set(qVar.f7471c & i3, bVar);
            i3++;
        }
    }

    private final q c(long j3) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7466f;
        while (true) {
            q qVar = (q) atomicReferenceFieldUpdater.get(this);
            if (qVar != null) {
                return qVar;
            }
            androidx.concurrent.futures.b.a(f7466f, this, null, b(j3));
        }
    }

    private final q e(int i3, Object obj) {
        Object obj2 = f().get(this.f7471c & i3);
        if (!(obj2 instanceof b) || ((b) obj2).f7473a != i3) {
            return null;
        }
        f().set(i3 & this.f7471c, obj);
        return this;
    }

    private final /* synthetic */ AtomicReferenceArray f() {
        return this.f7472d;
    }

    private final long k() {
        long j3;
        long j4;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f7467g;
        do {
            j3 = atomicLongFieldUpdater.get(this);
            if ((j3 & 1152921504606846976L) != 0) {
                return j3;
            }
            j4 = j3 | 1152921504606846976L;
        } while (!atomicLongFieldUpdater.compareAndSet(this, j3, j4));
        return j4;
    }

    private final q n(int i3, int i4) {
        long j3;
        int i5;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f7467g;
        do {
            j3 = atomicLongFieldUpdater.get(this);
            i5 = (int) (1073741823 & j3);
            if ((1152921504606846976L & j3) != 0) {
                return l();
            }
        } while (!f7467g.compareAndSet(this, j3, f7465e.b(j3, i4)));
        f().set(this.f7471c & i5, null);
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0052, code lost:
    
        return 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(java.lang.Object r13) {
        /*
            r12 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = i()
        L4:
            long r3 = r0.get(r12)
            r1 = 3458764513820540928(0x3000000000000000, double:1.727233711018889E-77)
            long r1 = r1 & r3
            r7 = 0
            int r1 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r1 == 0) goto L18
            h2.q$a r13 = h2.q.f7465e
            int r13 = r13.a(r3)
            return r13
        L18:
            r1 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r1 = r1 & r3
            int r1 = (int) r1
            r5 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r5 = r5 & r3
            r2 = 30
            long r5 = r5 >> r2
            int r9 = (int) r5
            int r10 = r12.f7471c
            int r2 = r9 + 2
            r2 = r2 & r10
            r5 = r1 & r10
            r6 = 1
            if (r2 != r5) goto L32
            return r6
        L32:
            boolean r2 = r12.f7470b
            r5 = 1073741823(0x3fffffff, float:1.9999999)
            if (r2 != 0) goto L53
            java.util.concurrent.atomic.AtomicReferenceArray r2 = r12.f()
            r11 = r9 & r10
            java.lang.Object r2 = r2.get(r11)
            if (r2 == 0) goto L53
            int r2 = r12.f7469a
            r3 = 1024(0x400, float:1.435E-42)
            if (r2 < r3) goto L52
            int r9 = r9 - r1
            r1 = r9 & r5
            int r2 = r2 >> 1
            if (r1 <= r2) goto L4
        L52:
            return r6
        L53:
            int r1 = r9 + 1
            r1 = r1 & r5
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = i()
            h2.q$a r5 = h2.q.f7465e
            long r5 = r5.c(r3, r1)
            r1 = r2
            r2 = r12
            boolean r1 = r1.compareAndSet(r2, r3, r5)
            if (r1 == 0) goto L4
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r12.f()
            r1 = r9 & r10
            r0.set(r1, r13)
            r0 = r12
        L72:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = i()
            long r1 = r1.get(r0)
            r3 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r1 = r1 & r3
            int r1 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r1 == 0) goto L8b
            h2.q r0 = r0.l()
            h2.q r0 = r0.e(r9, r13)
            if (r0 != 0) goto L72
        L8b:
            r13 = 0
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: h2.q.a(java.lang.Object):int");
    }

    public final boolean d() {
        long j3;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f7467g;
        do {
            j3 = atomicLongFieldUpdater.get(this);
            if ((j3 & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j3) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j3, j3 | 2305843009213693952L));
        return true;
    }

    public final int g() {
        long j3 = f7467g.get(this);
        return (((int) ((j3 & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j3))) & 1073741823;
    }

    public final boolean j() {
        long j3 = f7467g.get(this);
        return ((int) (1073741823 & j3)) == ((int) ((j3 & 1152921503533105152L) >> 30));
    }

    public final q l() {
        return c(k());
    }

    public final Object m() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f7467g;
        while (true) {
            long j3 = atomicLongFieldUpdater.get(this);
            if ((1152921504606846976L & j3) != 0) {
                return f7468h;
            }
            int i3 = (int) (1073741823 & j3);
            int i4 = this.f7471c;
            if ((((int) ((1152921503533105152L & j3) >> 30)) & i4) == (i4 & i3)) {
                return null;
            }
            Object obj = f().get(this.f7471c & i3);
            if (obj == null) {
                if (this.f7470b) {
                    return null;
                }
            } else {
                if (obj instanceof b) {
                    return null;
                }
                int i5 = (i3 + 1) & 1073741823;
                if (f7467g.compareAndSet(this, j3, f7465e.b(j3, i5))) {
                    f().set(this.f7471c & i3, null);
                    return obj;
                }
                if (this.f7470b) {
                    q qVarN = this;
                    do {
                        qVarN = qVarN.n(i3, i5);
                    } while (qVarN != null);
                    return obj;
                }
            }
        }
    }
}
