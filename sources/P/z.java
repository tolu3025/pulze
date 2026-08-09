package p;

import c2.AbstractC0599z;
import c2.InterfaceC0595x;

/* JADX INFO: loaded from: classes.dex */
public abstract class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l2.a f10226a = l2.g.b(false, 1, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC0595x f10227b = AbstractC0599z.b(null, 1, null);

    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f10228a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f10229b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f10230c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f10232e;

        a(M1.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f10230c = obj;
            this.f10232e |= Integer.MIN_VALUE;
            return z.this.c(this);
        }
    }

    public final Object a(M1.d dVar) {
        Object objAwait = this.f10227b.await(dVar);
        return objAwait == N1.d.e() ? objAwait : I1.u.f2419a;
    }

    protected abstract Object b(M1.d dVar);

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(M1.d r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof p.z.a
            if (r0 == 0) goto L13
            r0 = r7
            p.z$a r0 = (p.z.a) r0
            int r1 = r0.f10232e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10232e = r1
            goto L18
        L13:
            p.z$a r0 = new p.z$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f10230c
            java.lang.Object r1 = N1.b.e()
            int r2 = r0.f10232e
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L4c
            if (r2 == r4) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r1 = r0.f10229b
            l2.a r1 = (l2.a) r1
            java.lang.Object r0 = r0.f10228a
            p.z r0 = (p.z) r0
            I1.o.b(r7)     // Catch: java.lang.Throwable -> L35
            goto L8b
        L35:
            r7 = move-exception
            goto L96
        L37:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L3f:
            java.lang.Object r2 = r0.f10229b
            l2.a r2 = (l2.a) r2
            java.lang.Object r4 = r0.f10228a
            p.z r4 = (p.z) r4
            I1.o.b(r7)
            r7 = r2
            goto L6a
        L4c:
            I1.o.b(r7)
            c2.x r7 = r6.f10227b
            boolean r7 = r7.isCompleted()
            if (r7 == 0) goto L5a
            I1.u r7 = I1.u.f2419a
            return r7
        L5a:
            l2.a r7 = r6.f10226a
            r0.f10228a = r6
            r0.f10229b = r7
            r0.f10232e = r4
            java.lang.Object r2 = r7.c(r5, r0)
            if (r2 != r1) goto L69
            return r1
        L69:
            r4 = r6
        L6a:
            c2.x r2 = r4.f10227b     // Catch: java.lang.Throwable -> L78
            boolean r2 = r2.isCompleted()     // Catch: java.lang.Throwable -> L78
            if (r2 == 0) goto L7c
            I1.u r0 = I1.u.f2419a     // Catch: java.lang.Throwable -> L78
            r7.a(r5)
            return r0
        L78:
            r0 = move-exception
            r1 = r7
            r7 = r0
            goto L96
        L7c:
            r0.f10228a = r4     // Catch: java.lang.Throwable -> L78
            r0.f10229b = r7     // Catch: java.lang.Throwable -> L78
            r0.f10232e = r3     // Catch: java.lang.Throwable -> L78
            java.lang.Object r0 = r4.b(r0)     // Catch: java.lang.Throwable -> L78
            if (r0 != r1) goto L89
            return r1
        L89:
            r1 = r7
            r0 = r4
        L8b:
            c2.x r7 = r0.f10227b     // Catch: java.lang.Throwable -> L35
            I1.u r0 = I1.u.f2419a     // Catch: java.lang.Throwable -> L35
            r7.u(r0)     // Catch: java.lang.Throwable -> L35
            r1.a(r5)
            return r0
        L96:
            r1.a(r5)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p.z.c(M1.d):java.lang.Object");
    }
}
