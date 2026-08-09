package J0;

import J0.C0391g;
import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
public class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C0391g f2504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C0391g.d f2505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f2506c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final double f2507d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f2508e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f2509f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f2510g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f2511h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private C0391g.b f2512i;

    public u(C0391g c0391g, C0391g.d dVar) {
        this(c0391g, dVar, 1000L, 1.5d, 60000L);
    }

    private long d() {
        return (long) ((Math.random() - 0.5d) * this.f2510g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(Runnable runnable) {
        this.f2511h = new Date().getTime();
        runnable.run();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0074 A[PHI: r2
      0x0074: PHI (r2v9 long) = (r2v7 long), (r2v8 long) binds: [B:6:0x0072, B:9:0x007b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b(final java.lang.Runnable r11) {
        /*
            r10 = this;
            r10.c()
            long r0 = r10.f2510g
            long r2 = r10.d()
            long r0 = r0 + r2
            java.util.Date r2 = new java.util.Date
            r2.<init>()
            long r2 = r2.getTime()
            long r4 = r10.f2511h
            long r2 = r2 - r4
            r4 = 0
            long r2 = java.lang.Math.max(r4, r2)
            long r6 = r0 - r2
            long r6 = java.lang.Math.max(r4, r6)
            long r8 = r10.f2510g
            int r4 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r4 <= 0) goto L56
            java.lang.Class r4 = r10.getClass()
            java.lang.String r4 = r4.getSimpleName()
            java.lang.Long r5 = java.lang.Long.valueOf(r6)
            long r8 = r10.f2510g
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.Long r1 = java.lang.Long.valueOf(r2)
            r2 = 4
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r5
            r3 = 1
            r2[r3] = r8
            r3 = 2
            r2[r3] = r0
            r0 = 3
            r2[r0] = r1
            java.lang.String r0 = "Backing off for %d ms (base delay: %d ms, delay with jitter: %d ms, last attempt: %d ms ago)"
            J0.A.a(r4, r0, r2)
        L56:
            J0.g r0 = r10.f2504a
            J0.g$d r1 = r10.f2505b
            J0.t r2 = new J0.t
            r2.<init>()
            J0.g$b r11 = r0.k(r1, r6, r2)
            r10.f2512i = r11
            long r0 = r10.f2510g
            double r0 = (double) r0
            double r2 = r10.f2507d
            double r0 = r0 * r2
            long r0 = (long) r0
            r10.f2510g = r0
            long r2 = r10.f2506c
            int r11 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r11 >= 0) goto L77
        L74:
            r10.f2510g = r2
            goto L7e
        L77:
            long r2 = r10.f2509f
            int r11 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r11 <= 0) goto L7e
            goto L74
        L7e:
            long r0 = r10.f2508e
            r10.f2509f = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: J0.u.b(java.lang.Runnable):void");
    }

    public void c() {
        C0391g.b bVar = this.f2512i;
        if (bVar != null) {
            bVar.c();
            this.f2512i = null;
        }
    }

    public void f() {
        this.f2510g = 0L;
    }

    public void g() {
        this.f2510g = this.f2509f;
    }

    public void h(long j3) {
        this.f2509f = j3;
    }

    public u(C0391g c0391g, C0391g.d dVar, long j3, double d3, long j4) {
        this.f2504a = c0391g;
        this.f2505b = dVar;
        this.f2506c = j3;
        this.f2507d = d3;
        this.f2508e = j4;
        this.f2509f = j4;
        this.f2511h = new Date().getTime();
        f();
    }
}
