package p;

import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class q extends n implements K {

    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f10215a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f10216b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f10217c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f10219e;

        a(M1.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f10217c = obj;
            this.f10219e |= Integer.MIN_VALUE;
            return q.this.d(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(File file, InterfaceC1046A serializer) {
        super(file, serializer);
        kotlin.jvm.internal.m.e(file, "file");
        kotlin.jvm.internal.m.e(serializer, "serializer");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // p.K
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object d(java.lang.Object r6, M1.d r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof p.q.a
            if (r0 == 0) goto L13
            r0 = r7
            p.q$a r0 = (p.q.a) r0
            int r1 = r0.f10219e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10219e = r1
            goto L18
        L13:
            p.q$a r0 = new p.q$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f10217c
            java.lang.Object r1 = N1.b.e()
            int r2 = r0.f10219e
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r6 = r0.f10216b
            java.io.FileOutputStream r6 = (java.io.FileOutputStream) r6
            java.lang.Object r0 = r0.f10215a
            java.io.Closeable r0 = (java.io.Closeable) r0
            I1.o.b(r7)     // Catch: java.lang.Throwable -> L31
            goto L62
        L31:
            r6 = move-exception
            goto L74
        L33:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3b:
            I1.o.b(r7)
            r5.f()
            java.io.FileOutputStream r7 = new java.io.FileOutputStream
            java.io.File r2 = r5.g()
            r7.<init>(r2)
            p.A r2 = r5.h()     // Catch: java.lang.Throwable -> L72
            p.I r4 = new p.I     // Catch: java.lang.Throwable -> L72
            r4.<init>(r7)     // Catch: java.lang.Throwable -> L72
            r0.f10215a = r7     // Catch: java.lang.Throwable -> L72
            r0.f10216b = r7     // Catch: java.lang.Throwable -> L72
            r0.f10219e = r3     // Catch: java.lang.Throwable -> L72
            java.lang.Object r6 = r2.c(r6, r4, r0)     // Catch: java.lang.Throwable -> L72
            if (r6 != r1) goto L60
            return r1
        L60:
            r6 = r7
            r0 = r6
        L62:
            java.io.FileDescriptor r6 = r6.getFD()     // Catch: java.lang.Throwable -> L31
            r6.sync()     // Catch: java.lang.Throwable -> L31
            I1.u r6 = I1.u.f2419a     // Catch: java.lang.Throwable -> L31
            r6 = 0
            S1.b.a(r0, r6)
            I1.u r6 = I1.u.f2419a
            return r6
        L72:
            r6 = move-exception
            r0 = r7
        L74:
            throw r6     // Catch: java.lang.Throwable -> L75
        L75:
            r7 = move-exception
            S1.b.a(r0, r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p.q.d(java.lang.Object, M1.d):java.lang.Object");
    }
}
