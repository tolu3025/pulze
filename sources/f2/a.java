package f2;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements b {

    /* JADX INFO: renamed from: f2.a$a, reason: collision with other inner class name */
    static final class C0125a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f7245a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f7246b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f7248d;

        C0125a(M1.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f7246b = obj;
            this.f7248d |= Integer.MIN_VALUE;
            return a.this.a(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // f2.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(f2.c r6, M1.d r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof f2.a.C0125a
            if (r0 == 0) goto L13
            r0 = r7
            f2.a$a r0 = (f2.a.C0125a) r0
            int r1 = r0.f7248d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f7248d = r1
            goto L18
        L13:
            f2.a$a r0 = new f2.a$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f7246b
            java.lang.Object r1 = N1.b.e()
            int r2 = r0.f7248d
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r6 = r0.f7245a
            g2.o r6 = (g2.o) r6
            I1.o.b(r7)     // Catch: java.lang.Throwable -> L2d
            goto L4f
        L2d:
            r7 = move-exception
            goto L59
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            I1.o.b(r7)
            g2.o r7 = new g2.o
            M1.g r2 = r0.getContext()
            r7.<init>(r6, r2)
            r0.f7245a = r7     // Catch: java.lang.Throwable -> L55
            r0.f7248d = r3     // Catch: java.lang.Throwable -> L55
            java.lang.Object r6 = r5.c(r7, r0)     // Catch: java.lang.Throwable -> L55
            if (r6 != r1) goto L4e
            return r1
        L4e:
            r6 = r7
        L4f:
            r6.releaseIntercepted()
            I1.u r6 = I1.u.f2419a
            return r6
        L55:
            r6 = move-exception
            r4 = r7
            r7 = r6
            r6 = r4
        L59:
            r6.releaseIntercepted()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: f2.a.a(f2.c, M1.d):java.lang.Object");
    }

    public abstract Object c(c cVar, M1.d dVar);
}
