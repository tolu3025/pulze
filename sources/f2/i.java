package f2;

/* JADX INFO: loaded from: classes.dex */
abstract /* synthetic */ class i {

    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f7255a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f7256b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f7257c;

        a(M1.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f7256b = obj;
            this.f7257c |= Integer.MIN_VALUE;
            return i.c(null, null, null, this);
        }
    }

    public static final class b implements f2.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ f2.b f7258a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ U1.q f7259b;

        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            /* synthetic */ Object f7260a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            int f7261b;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f7263d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f7264e;

            public a(M1.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f7260a = obj;
                this.f7261b |= Integer.MIN_VALUE;
                return b.this.a(null, this);
            }
        }

        public b(f2.b bVar, U1.q qVar) {
            this.f7258a = bVar;
            this.f7259b = qVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:34:0x0086 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0087  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x00ab A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // f2.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object a(f2.c r9, M1.d r10) throws java.lang.Throwable {
            /*
                r8 = this;
                boolean r0 = r10 instanceof f2.i.b.a
                if (r0 == 0) goto L13
                r0 = r10
                f2.i$b$a r0 = (f2.i.b.a) r0
                int r1 = r0.f7261b
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f7261b = r1
                goto L18
            L13:
                f2.i$b$a r0 = new f2.i$b$a
                r0.<init>(r10)
            L18:
                java.lang.Object r10 = r0.f7260a
                java.lang.Object r1 = N1.b.e()
                int r2 = r0.f7261b
                r3 = 3
                r4 = 2
                r5 = 1
                r6 = 0
                if (r2 == 0) goto L54
                if (r2 == r5) goto L46
                if (r2 == r4) goto L3e
                if (r2 != r3) goto L36
                java.lang.Object r9 = r0.f7263d
                g2.o r9 = (g2.o) r9
                I1.o.b(r10)     // Catch: java.lang.Throwable -> L34
                goto L88
            L34:
                r10 = move-exception
                goto L92
            L36:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r10)
                throw r9
            L3e:
                java.lang.Object r9 = r0.f7263d
                java.lang.Throwable r9 = (java.lang.Throwable) r9
                I1.o.b(r10)
                goto Lac
            L46:
                java.lang.Object r9 = r0.f7264e
                f2.c r9 = (f2.c) r9
                java.lang.Object r2 = r0.f7263d
                f2.i$b r2 = (f2.i.b) r2
                I1.o.b(r10)     // Catch: java.lang.Throwable -> L52
                goto L67
            L52:
                r9 = move-exception
                goto L98
            L54:
                I1.o.b(r10)
                f2.b r10 = r8.f7258a     // Catch: java.lang.Throwable -> L96
                r0.f7263d = r8     // Catch: java.lang.Throwable -> L96
                r0.f7264e = r9     // Catch: java.lang.Throwable -> L96
                r0.f7261b = r5     // Catch: java.lang.Throwable -> L96
                java.lang.Object r10 = r10.a(r9, r0)     // Catch: java.lang.Throwable -> L96
                if (r10 != r1) goto L66
                return r1
            L66:
                r2 = r8
            L67:
                g2.o r10 = new g2.o
                M1.g r4 = r0.getContext()
                r10.<init>(r9, r4)
                U1.q r9 = r2.f7259b     // Catch: java.lang.Throwable -> L8e
                r0.f7263d = r10     // Catch: java.lang.Throwable -> L8e
                r0.f7264e = r6     // Catch: java.lang.Throwable -> L8e
                r0.f7261b = r3     // Catch: java.lang.Throwable -> L8e
                r2 = 6
                kotlin.jvm.internal.l.a(r2)     // Catch: java.lang.Throwable -> L8e
                java.lang.Object r9 = r9.e(r10, r6, r0)     // Catch: java.lang.Throwable -> L8e
                r0 = 7
                kotlin.jvm.internal.l.a(r0)     // Catch: java.lang.Throwable -> L8e
                if (r9 != r1) goto L87
                return r1
            L87:
                r9 = r10
            L88:
                r9.releaseIntercepted()
                I1.u r9 = I1.u.f2419a
                return r9
            L8e:
                r9 = move-exception
                r7 = r10
                r10 = r9
                r9 = r7
            L92:
                r9.releaseIntercepted()
                throw r10
            L96:
                r9 = move-exception
                r2 = r8
            L98:
                f2.t r10 = new f2.t
                r10.<init>(r9)
                U1.q r2 = r2.f7259b
                r0.f7263d = r9
                r0.f7264e = r6
                r0.f7261b = r4
                java.lang.Object r10 = f2.i.a(r10, r2, r9, r0)
                if (r10 != r1) goto Lac
                return r1
            Lac:
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: f2.i.b.a(f2.c, M1.d):java.lang.Object");
        }
    }

    public static final class c implements f2.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ U1.p f7265a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ f2.b f7266b;

        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            /* synthetic */ Object f7267a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            int f7268b;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f7270d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f7271e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f7272f;

            public a(M1.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f7267a = obj;
                this.f7268b |= Integer.MIN_VALUE;
                return c.this.a(null, this);
            }
        }

        public c(U1.p pVar, f2.b bVar) {
            this.f7265a = pVar;
            this.f7266b = bVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x0082 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // f2.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object a(f2.c r7, M1.d r8) throws java.lang.Throwable {
            /*
                r6 = this;
                boolean r0 = r8 instanceof f2.i.c.a
                if (r0 == 0) goto L13
                r0 = r8
                f2.i$c$a r0 = (f2.i.c.a) r0
                int r1 = r0.f7268b
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f7268b = r1
                goto L18
            L13:
                f2.i$c$a r0 = new f2.i$c$a
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.f7267a
                java.lang.Object r1 = N1.b.e()
                int r2 = r0.f7268b
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L46
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                I1.o.b(r8)
                goto L83
            L2c:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L34:
                java.lang.Object r7 = r0.f7272f
                g2.o r7 = (g2.o) r7
                java.lang.Object r2 = r0.f7271e
                f2.c r2 = (f2.c) r2
                java.lang.Object r4 = r0.f7270d
                f2.i$c r4 = (f2.i.c) r4
                I1.o.b(r8)     // Catch: java.lang.Throwable -> L44
                goto L6e
            L44:
                r8 = move-exception
                goto L8a
            L46:
                I1.o.b(r8)
                g2.o r8 = new g2.o
                M1.g r2 = r0.getContext()
                r8.<init>(r7, r2)
                U1.p r2 = r6.f7265a     // Catch: java.lang.Throwable -> L86
                r0.f7270d = r6     // Catch: java.lang.Throwable -> L86
                r0.f7271e = r7     // Catch: java.lang.Throwable -> L86
                r0.f7272f = r8     // Catch: java.lang.Throwable -> L86
                r0.f7268b = r4     // Catch: java.lang.Throwable -> L86
                r4 = 6
                kotlin.jvm.internal.l.a(r4)     // Catch: java.lang.Throwable -> L86
                java.lang.Object r2 = r2.invoke(r8, r0)     // Catch: java.lang.Throwable -> L86
                r4 = 7
                kotlin.jvm.internal.l.a(r4)     // Catch: java.lang.Throwable -> L86
                if (r2 != r1) goto L6b
                return r1
            L6b:
                r4 = r6
                r2 = r7
                r7 = r8
            L6e:
                r7.releaseIntercepted()
                f2.b r7 = r4.f7266b
                r8 = 0
                r0.f7270d = r8
                r0.f7271e = r8
                r0.f7272f = r8
                r0.f7268b = r3
                java.lang.Object r7 = r7.a(r2, r0)
                if (r7 != r1) goto L83
                return r1
            L83:
                I1.u r7 = I1.u.f2419a
                return r7
            L86:
                r7 = move-exception
                r5 = r8
                r8 = r7
                r7 = r5
            L8a:
                r7.releaseIntercepted()
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: f2.i.c.a(f2.c, M1.d):java.lang.Object");
        }
    }

    public static final void b(f2.c cVar) throws Throwable {
        if (cVar instanceof t) {
            throw ((t) cVar).f7316a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(f2.c r4, U1.q r5, java.lang.Throwable r6, M1.d r7) throws java.lang.Throwable {
        /*
            boolean r0 = r7 instanceof f2.i.a
            if (r0 == 0) goto L13
            r0 = r7
            f2.i$a r0 = (f2.i.a) r0
            int r1 = r0.f7257c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f7257c = r1
            goto L18
        L13:
            f2.i$a r0 = new f2.i$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f7256b
            java.lang.Object r1 = N1.b.e()
            int r2 = r0.f7257c
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r4 = r0.f7255a
            r6 = r4
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            I1.o.b(r7)     // Catch: java.lang.Throwable -> L2e
            goto L46
        L2e:
            r4 = move-exception
            goto L49
        L30:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L38:
            I1.o.b(r7)
            r0.f7255a = r6     // Catch: java.lang.Throwable -> L2e
            r0.f7257c = r3     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r4 = r5.e(r4, r6, r0)     // Catch: java.lang.Throwable -> L2e
            if (r4 != r1) goto L46
            return r1
        L46:
            I1.u r4 = I1.u.f2419a
            return r4
        L49:
            if (r6 == 0) goto L50
            if (r6 == r4) goto L50
            I1.a.a(r4, r6)
        L50:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: f2.i.c(f2.c, U1.q, java.lang.Throwable, M1.d):java.lang.Object");
    }

    public static final f2.b d(f2.b bVar, U1.q qVar) {
        return new b(bVar, qVar);
    }

    public static final f2.b e(f2.b bVar, U1.p pVar) {
        return new c(pVar, bVar);
    }
}
