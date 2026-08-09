package p;

/* JADX INFO: loaded from: classes.dex */
public final class C implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f9981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l2.a f9982b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C1048b f9983c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final f2.b f9984d;

    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f9985a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f9986b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f9987c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f9989e;

        a(M1.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f9987c = obj;
            this.f9989e |= Integer.MIN_VALUE;
            return C.this.e(null, this);
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f9990a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f9991b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f9992c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f9994e;

        b(M1.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f9992c = obj;
            this.f9994e |= Integer.MIN_VALUE;
            return C.this.a(null, this);
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.l implements U1.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f9995a;

        c(M1.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final M1.d create(Object obj, M1.d dVar) {
            return new c(dVar);
        }

        @Override // U1.p
        public final Object invoke(f2.c cVar, M1.d dVar) {
            return ((c) create(cVar, dVar)).invokeSuspend(I1.u.f2419a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            N1.d.e();
            if (this.f9995a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            I1.o.b(obj);
            return I1.u.f2419a;
        }
    }

    public C(String filePath) {
        kotlin.jvm.internal.m.e(filePath, "filePath");
        this.f9981a = filePath;
        this.f9982b = l2.g.b(false, 1, null);
        this.f9983c = new C1048b(0);
        this.f9984d = f2.d.i(new c(null));
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // p.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(U1.p r7, M1.d r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof p.C.b
            if (r0 == 0) goto L13
            r0 = r8
            p.C$b r0 = (p.C.b) r0
            int r1 = r0.f9994e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9994e = r1
            goto L18
        L13:
            p.C$b r0 = new p.C$b
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f9992c
            java.lang.Object r1 = N1.b.e()
            int r2 = r0.f9994e
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            boolean r7 = r0.f9991b
            java.lang.Object r0 = r0.f9990a
            l2.a r0 = (l2.a) r0
            I1.o.b(r8)     // Catch: java.lang.Throwable -> L30
            goto L57
        L30:
            r8 = move-exception
            goto L61
        L32:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3a:
            I1.o.b(r8)
            l2.a r8 = r6.f9982b
            boolean r2 = r8.b(r4)
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.b.a(r2)     // Catch: java.lang.Throwable -> L5d
            r0.f9990a = r8     // Catch: java.lang.Throwable -> L5d
            r0.f9991b = r2     // Catch: java.lang.Throwable -> L5d
            r0.f9994e = r3     // Catch: java.lang.Throwable -> L5d
            java.lang.Object r7 = r7.invoke(r5, r0)     // Catch: java.lang.Throwable -> L5d
            if (r7 != r1) goto L54
            return r1
        L54:
            r0 = r8
            r8 = r7
            r7 = r2
        L57:
            if (r7 == 0) goto L5c
            r0.a(r4)
        L5c:
            return r8
        L5d:
            r7 = move-exception
            r0 = r8
            r8 = r7
            r7 = r2
        L61:
            if (r7 == 0) goto L66
            r0.a(r4)
        L66:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p.C.a(U1.p, M1.d):java.lang.Object");
    }

    @Override // p.t
    public Object b(M1.d dVar) {
        return kotlin.coroutines.jvm.internal.b.c(this.f9983c.d());
    }

    @Override // p.t
    public Object c(M1.d dVar) {
        return kotlin.coroutines.jvm.internal.b.c(this.f9983c.b());
    }

    @Override // p.t
    public f2.b d() {
        return this.f9984d;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // p.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object e(U1.l r8, M1.d r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof p.C.a
            if (r0 == 0) goto L13
            r0 = r9
            p.C$a r0 = (p.C.a) r0
            int r1 = r0.f9989e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9989e = r1
            goto L18
        L13:
            p.C$a r0 = new p.C$a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f9987c
            java.lang.Object r1 = N1.b.e()
            int r2 = r0.f9989e
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L49
            if (r2 == r4) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r8 = r0.f9985a
            l2.a r8 = (l2.a) r8
            I1.o.b(r9)     // Catch: java.lang.Throwable -> L31
            goto L6b
        L31:
            r9 = move-exception
            goto L73
        L33:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3b:
            java.lang.Object r8 = r0.f9986b
            l2.a r8 = (l2.a) r8
            java.lang.Object r2 = r0.f9985a
            U1.l r2 = (U1.l) r2
            I1.o.b(r9)
            r9 = r8
            r8 = r2
            goto L5b
        L49:
            I1.o.b(r9)
            l2.a r9 = r7.f9982b
            r0.f9985a = r8
            r0.f9986b = r9
            r0.f9989e = r4
            java.lang.Object r2 = r9.c(r5, r0)
            if (r2 != r1) goto L5b
            return r1
        L5b:
            r0.f9985a = r9     // Catch: java.lang.Throwable -> L6f
            r0.f9986b = r5     // Catch: java.lang.Throwable -> L6f
            r0.f9989e = r3     // Catch: java.lang.Throwable -> L6f
            java.lang.Object r8 = r8.invoke(r0)     // Catch: java.lang.Throwable -> L6f
            if (r8 != r1) goto L68
            return r1
        L68:
            r6 = r9
            r9 = r8
            r8 = r6
        L6b:
            r8.a(r5)
            return r9
        L6f:
            r8 = move-exception
            r6 = r9
            r9 = r8
            r8 = r6
        L73:
            r8.a(r5)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p.C.e(U1.l, M1.d):java.lang.Object");
    }
}
