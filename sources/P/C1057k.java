package p;

import c2.AbstractC0566i;
import c2.AbstractC0599z;
import c2.InterfaceC0595x;
import c2.InterfaceC0600z0;
import c2.N;
import java.util.List;
import java.util.concurrent.CancellationException;
import p.J;
import p.w;

/* JADX INFO: renamed from: p.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1057k implements InterfaceC1055i {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final a f10029m = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final E f10030a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC1051e f10031b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final N f10032c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final f2.b f10033d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final l2.a f10034e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f10035f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private InterfaceC0600z0 f10036g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final p.l f10037h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final b f10038i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final I1.g f10039j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final I1.g f10040k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final B f10041l;

    /* JADX INFO: renamed from: p.k$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.h hVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: p.k$b */
    private final class b extends z {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private List f10042c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ C1057k f10043d;

        /* JADX INFO: renamed from: p.k$b$a */
        static final class a extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            Object f10044a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f10045b;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            int f10047d;

            a(M1.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f10045b = obj;
                this.f10047d |= Integer.MIN_VALUE;
                return b.this.b(this);
            }
        }

        /* JADX INFO: renamed from: p.k$b$b, reason: collision with other inner class name */
        static final class C0157b extends kotlin.coroutines.jvm.internal.l implements U1.l {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            Object f10048a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            Object f10049b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            Object f10050c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f10051d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f10052e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            int f10053f;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            int f10054l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            final /* synthetic */ C1057k f10055m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ b f10056n;

            /* JADX INFO: renamed from: p.k$b$b$a */
            public static final class a implements p.s {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ l2.a f10057a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ kotlin.jvm.internal.w f10058b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ kotlin.jvm.internal.y f10059c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ C1057k f10060d;

                /* JADX INFO: renamed from: p.k$b$b$a$a, reason: collision with other inner class name */
                static final class C0158a extends kotlin.coroutines.jvm.internal.d {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    Object f10061a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    Object f10062b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    Object f10063c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    Object f10064d;

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    Object f10065e;

                    /* JADX INFO: renamed from: f, reason: collision with root package name */
                    /* synthetic */ Object f10066f;

                    /* JADX INFO: renamed from: m, reason: collision with root package name */
                    int f10068m;

                    C0158a(M1.d dVar) {
                        super(dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.f10066f = obj;
                        this.f10068m |= Integer.MIN_VALUE;
                        return a.this.a(null, this);
                    }
                }

                a(l2.a aVar, kotlin.jvm.internal.w wVar, kotlin.jvm.internal.y yVar, C1057k c1057k) {
                    this.f10057a = aVar;
                    this.f10058b = wVar;
                    this.f10059c = yVar;
                    this.f10060d = c1057k;
                }

                /* JADX WARN: Removed duplicated region for block: B:37:0x00b8 A[Catch: all -> 0x0056, TRY_LEAVE, TryCatch #1 {all -> 0x0056, blocks: (B:21:0x0052, B:35:0x00b0, B:37:0x00b8), top: B:53:0x0052 }] */
                /* JADX WARN: Removed duplicated region for block: B:42:0x00cf  */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // p.s
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public java.lang.Object a(U1.p r11, M1.d r12) throws java.lang.Throwable {
                    /*
                        Method dump skipped, instruction units count: 233
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: p.C1057k.b.C0157b.a.a(U1.p, M1.d):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0157b(C1057k c1057k, b bVar, M1.d dVar) {
                super(1, dVar);
                this.f10055m = c1057k;
                this.f10056n = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final M1.d create(M1.d dVar) {
                return new C0157b(this.f10055m, this.f10056n, dVar);
            }

            @Override // U1.l
            /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
            public final Object invoke(M1.d dVar) {
                return ((C0157b) create(dVar)).invokeSuspend(I1.u.f2419a);
            }

            /* JADX WARN: Removed duplicated region for block: B:23:0x00ae  */
            /* JADX WARN: Removed duplicated region for block: B:30:0x00e4 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:31:0x00e5  */
            /* JADX WARN: Removed duplicated region for block: B:35:0x00f1  */
            /* JADX WARN: Removed duplicated region for block: B:38:0x010b A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:39:0x010c  */
            @Override // kotlin.coroutines.jvm.internal.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r13) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 286
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: p.C1057k.b.C0157b.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public b(C1057k c1057k, List initTasksList) {
            kotlin.jvm.internal.m.e(initTasksList, "initTasksList");
            this.f10043d = c1057k;
            this.f10042c = J1.x.V(initTasksList);
        }

        /* JADX WARN: Removed duplicated region for block: B:25:0x0066  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // p.z
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        protected java.lang.Object b(M1.d r7) throws java.lang.Throwable {
            /*
                r6 = this;
                boolean r0 = r7 instanceof p.C1057k.b.a
                if (r0 == 0) goto L13
                r0 = r7
                p.k$b$a r0 = (p.C1057k.b.a) r0
                int r1 = r0.f10047d
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f10047d = r1
                goto L18
            L13:
                p.k$b$a r0 = new p.k$b$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.f10045b
                java.lang.Object r1 = N1.b.e()
                int r2 = r0.f10047d
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L38
                if (r2 == r4) goto L28
                if (r2 != r3) goto L30
            L28:
                java.lang.Object r0 = r0.f10044a
                p.k$b r0 = (p.C1057k.b) r0
                I1.o.b(r7)
                goto L63
            L30:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L38:
                I1.o.b(r7)
                java.util.List r7 = r6.f10042c
                if (r7 == 0) goto L66
                kotlin.jvm.internal.m.b(r7)
                boolean r7 = r7.isEmpty()
                if (r7 == 0) goto L49
                goto L66
            L49:
                p.k r7 = r6.f10043d
                p.t r7 = p.C1057k.d(r7)
                p.k$b$b r2 = new p.k$b$b
                p.k r4 = r6.f10043d
                r5 = 0
                r2.<init>(r4, r6, r5)
                r0.f10044a = r6
                r0.f10047d = r3
                java.lang.Object r7 = r7.e(r2, r0)
                if (r7 != r1) goto L62
                return r1
            L62:
                r0 = r6
            L63:
                p.f r7 = (p.C1052f) r7
                goto L74
            L66:
                p.k r7 = r6.f10043d
                r0.f10044a = r6
                r0.f10047d = r4
                r2 = 0
                java.lang.Object r7 = p.C1057k.o(r7, r2, r0)
                if (r7 != r1) goto L62
                return r1
            L74:
                p.k r0 = r0.f10043d
                p.l r0 = p.C1057k.e(r0)
                r0.c(r7)
                I1.u r7 = I1.u.f2419a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: p.C1057k.b.b(M1.d):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: p.k$c */
    static final class c extends kotlin.jvm.internal.n implements U1.a {
        c() {
            super(0);
        }

        @Override // U1.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final p.t invoke() {
            return C1057k.this.t().a();
        }
    }

    /* JADX INFO: renamed from: p.k$d */
    static final class d extends kotlin.coroutines.jvm.internal.l implements U1.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f10070a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f10071b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f10072c;

        /* JADX INFO: renamed from: p.k$d$a */
        static final class a extends kotlin.coroutines.jvm.internal.l implements U1.p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f10074a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ C1057k f10075b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C1057k c1057k, M1.d dVar) {
                super(2, dVar);
                this.f10075b = c1057k;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final M1.d create(Object obj, M1.d dVar) {
                return new a(this.f10075b, dVar);
            }

            @Override // U1.p
            public final Object invoke(f2.c cVar, M1.d dVar) {
                return ((a) create(cVar, dVar)).invokeSuspend(I1.u.f2419a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objE = N1.d.e();
                int i3 = this.f10074a;
                if (i3 == 0) {
                    I1.o.b(obj);
                    C1057k c1057k = this.f10075b;
                    this.f10074a = 1;
                    if (c1057k.v(this) == objE) {
                        return objE;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    I1.o.b(obj);
                }
                return I1.u.f2419a;
            }
        }

        /* JADX INFO: renamed from: p.k$d$b */
        static final class b extends kotlin.coroutines.jvm.internal.l implements U1.p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f10076a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f10077b;

            b(M1.d dVar) {
                super(2, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final M1.d create(Object obj, M1.d dVar) {
                b bVar = new b(dVar);
                bVar.f10077b = obj;
                return bVar;
            }

            @Override // U1.p
            /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
            public final Object invoke(D d3, M1.d dVar) {
                return ((b) create(d3, dVar)).invokeSuspend(I1.u.f2419a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                N1.d.e();
                if (this.f10076a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                I1.o.b(obj);
                return kotlin.coroutines.jvm.internal.b.a(!(((D) this.f10077b) instanceof p.r));
            }
        }

        /* JADX INFO: renamed from: p.k$d$c */
        static final class c extends kotlin.coroutines.jvm.internal.l implements U1.p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f10078a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f10079b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ D f10080c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(D d3, M1.d dVar) {
                super(2, dVar);
                this.f10080c = d3;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final M1.d create(Object obj, M1.d dVar) {
                c cVar = new c(this.f10080c, dVar);
                cVar.f10079b = obj;
                return cVar;
            }

            @Override // U1.p
            /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
            public final Object invoke(D d3, M1.d dVar) {
                return ((c) create(d3, dVar)).invokeSuspend(I1.u.f2419a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                N1.d.e();
                if (this.f10078a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                I1.o.b(obj);
                D d3 = (D) this.f10079b;
                return kotlin.coroutines.jvm.internal.b.a((d3 instanceof C1052f) && d3.a() <= this.f10080c.a());
            }
        }

        /* JADX INFO: renamed from: p.k$d$d, reason: collision with other inner class name */
        static final class C0159d extends kotlin.coroutines.jvm.internal.l implements U1.q {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f10081a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ C1057k f10082b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0159d(C1057k c1057k, M1.d dVar) {
                super(3, dVar);
                this.f10082b = c1057k;
            }

            @Override // U1.q
            /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
            public final Object e(f2.c cVar, Throwable th, M1.d dVar) {
                return new C0159d(this.f10082b, dVar).invokeSuspend(I1.u.f2419a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objE = N1.d.e();
                int i3 = this.f10081a;
                if (i3 == 0) {
                    I1.o.b(obj);
                    C1057k c1057k = this.f10082b;
                    this.f10081a = 1;
                    if (c1057k.q(this) == objE) {
                        return objE;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    I1.o.b(obj);
                }
                return I1.u.f2419a;
            }
        }

        /* JADX INFO: renamed from: p.k$d$e */
        public static final class e implements f2.b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ f2.b f10083a;

            /* JADX INFO: renamed from: p.k$d$e$a */
            public static final class a implements f2.c {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ f2.c f10084a;

                /* JADX INFO: renamed from: p.k$d$e$a$a, reason: collision with other inner class name */
                public static final class C0160a extends kotlin.coroutines.jvm.internal.d {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    /* synthetic */ Object f10085a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    int f10086b;

                    public C0160a(M1.d dVar) {
                        super(dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.f10085a = obj;
                        this.f10086b |= Integer.MIN_VALUE;
                        return a.this.emit(null, this);
                    }
                }

                public a(f2.c cVar) {
                    this.f10084a = cVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // f2.c
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r5, M1.d r6) throws java.lang.Throwable {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof p.C1057k.d.e.a.C0160a
                        if (r0 == 0) goto L13
                        r0 = r6
                        p.k$d$e$a$a r0 = (p.C1057k.d.e.a.C0160a) r0
                        int r1 = r0.f10086b
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f10086b = r1
                        goto L18
                    L13:
                        p.k$d$e$a$a r0 = new p.k$d$e$a$a
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.f10085a
                        java.lang.Object r1 = N1.b.e()
                        int r2 = r0.f10086b
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        I1.o.b(r6)
                        goto L4f
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        I1.o.b(r6)
                        f2.c r6 = r4.f10084a
                        p.D r5 = (p.D) r5
                        boolean r2 = r5 instanceof p.x
                        if (r2 != 0) goto L6d
                        boolean r2 = r5 instanceof p.C1052f
                        if (r2 == 0) goto L52
                        p.f r5 = (p.C1052f) r5
                        java.lang.Object r5 = r5.c()
                        r0.f10086b = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L4f
                        return r1
                    L4f:
                        I1.u r5 = I1.u.f2419a
                        return r5
                    L52:
                        boolean r6 = r5 instanceof p.r
                        if (r6 != 0) goto L61
                        boolean r5 = r5 instanceof p.H
                        if (r5 == 0) goto L5b
                        goto L61
                    L5b:
                        I1.k r5 = new I1.k
                        r5.<init>()
                        throw r5
                    L61:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542"
                        java.lang.String r6 = r6.toString()
                        r5.<init>(r6)
                        throw r5
                    L6d:
                        p.x r5 = (p.x) r5
                        java.lang.Throwable r5 = r5.b()
                        throw r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: p.C1057k.d.e.a.emit(java.lang.Object, M1.d):java.lang.Object");
                }
            }

            public e(f2.b bVar) {
                this.f10083a = bVar;
            }

            @Override // f2.b
            public Object a(f2.c cVar, M1.d dVar) {
                Object objA = this.f10083a.a(new a(cVar), dVar);
                return objA == N1.d.e() ? objA : I1.u.f2419a;
            }
        }

        d(M1.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final M1.d create(Object obj, M1.d dVar) {
            d dVar2 = C1057k.this.new d(dVar);
            dVar2.f10072c = obj;
            return dVar2;
        }

        @Override // U1.p
        public final Object invoke(f2.c cVar, M1.d dVar) {
            return ((d) create(cVar, dVar)).invokeSuspend(I1.u.f2419a);
        }

        /* JADX WARN: Removed duplicated region for block: B:33:0x00bc A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 211
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p.C1057k.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: p.k$e */
    static final class e extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f10088a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f10089b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f10090c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f10092e;

        e(M1.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f10090c = obj;
            this.f10092e |= Integer.MIN_VALUE;
            return C1057k.this.q(this);
        }
    }

    /* JADX INFO: renamed from: p.k$f */
    static final class f extends kotlin.coroutines.jvm.internal.l implements U1.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f10093a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ U1.l f10094b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(U1.l lVar, M1.d dVar) {
            super(1, dVar);
            this.f10094b = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final M1.d create(M1.d dVar) {
            return new f(this.f10094b, dVar);
        }

        @Override // U1.l
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(M1.d dVar) {
            return ((f) create(dVar)).invokeSuspend(I1.u.f2419a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objE = N1.d.e();
            int i3 = this.f10093a;
            if (i3 == 0) {
                I1.o.b(obj);
                U1.l lVar = this.f10094b;
                this.f10093a = 1;
                obj = lVar.invoke(this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                I1.o.b(obj);
            }
            return obj;
        }
    }

    /* JADX INFO: renamed from: p.k$g */
    static final class g extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f10095a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f10096b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f10097c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f10098d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f10100f;

        g(M1.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f10098d = obj;
            this.f10100f |= Integer.MIN_VALUE;
            return C1057k.this.u(null, this);
        }
    }

    /* JADX INFO: renamed from: p.k$h */
    static final class h extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f10101a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f10102b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f10103c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f10105e;

        h(M1.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f10103c = obj;
            this.f10105e |= Integer.MIN_VALUE;
            return C1057k.this.v(this);
        }
    }

    /* JADX INFO: renamed from: p.k$i */
    static final class i extends kotlin.coroutines.jvm.internal.l implements U1.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f10106a;

        /* JADX INFO: renamed from: p.k$i$a */
        static final class a implements f2.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ C1057k f10108a;

            a(C1057k c1057k) {
                this.f10108a = c1057k;
            }

            @Override // f2.c
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(I1.u uVar, M1.d dVar) throws Throwable {
                if (this.f10108a.f10037h.a() instanceof p.r) {
                    return I1.u.f2419a;
                }
                Object objX = this.f10108a.x(true, dVar);
                return objX == N1.d.e() ? objX : I1.u.f2419a;
            }
        }

        i(M1.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final M1.d create(Object obj, M1.d dVar) {
            return C1057k.this.new i(dVar);
        }

        @Override // U1.p
        public final Object invoke(N n3, M1.d dVar) {
            return ((i) create(n3, dVar)).invokeSuspend(I1.u.f2419a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objE = N1.d.e();
            int i3 = this.f10106a;
            if (i3 == 0) {
                I1.o.b(obj);
                b bVar = C1057k.this.f10038i;
                this.f10106a = 1;
                if (bVar.a(this) == objE) {
                    return objE;
                }
            } else {
                if (i3 != 1) {
                    if (i3 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    I1.o.b(obj);
                    return I1.u.f2419a;
                }
                I1.o.b(obj);
            }
            f2.b bVarC = f2.d.c(C1057k.this.s().d());
            a aVar = new a(C1057k.this);
            this.f10106a = 2;
            if (bVarC.a(aVar, this) == objE) {
                return objE;
            }
            return I1.u.f2419a;
        }
    }

    /* JADX INFO: renamed from: p.k$j */
    static final class j extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f10109a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f10110b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f10111c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f10113e;

        j(M1.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f10111c = obj;
            this.f10113e |= Integer.MIN_VALUE;
            return C1057k.this.w(this);
        }
    }

    /* JADX INFO: renamed from: p.k$k, reason: collision with other inner class name */
    static final class C0161k extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f10114a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f10115b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f10116c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f10117d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f10119f;

        C0161k(M1.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f10117d = obj;
            this.f10119f |= Integer.MIN_VALUE;
            return C1057k.this.x(false, this);
        }
    }

    /* JADX INFO: renamed from: p.k$l */
    static final class l extends kotlin.coroutines.jvm.internal.l implements U1.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f10120a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f10121b;

        l(M1.d dVar) {
            super(1, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final M1.d create(M1.d dVar) {
            return C1057k.this.new l(dVar);
        }

        @Override // U1.l
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(M1.d dVar) {
            return ((l) create(dVar)).invokeSuspend(I1.u.f2419a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Throwable th;
            D xVar;
            Object objE = N1.d.e();
            int i3 = this.f10121b;
            try {
            } catch (Throwable th2) {
                p.t tVarS = C1057k.this.s();
                this.f10120a = th2;
                this.f10121b = 2;
                Object objC = tVarS.c(this);
                if (objC == objE) {
                    return objE;
                }
                th = th2;
                obj = objC;
            }
            if (i3 == 0) {
                I1.o.b(obj);
                C1057k c1057k = C1057k.this;
                this.f10121b = 1;
                obj = c1057k.z(true, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i3 != 1) {
                    if (i3 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    th = (Throwable) this.f10120a;
                    I1.o.b(obj);
                    xVar = new p.x(th, ((Number) obj).intValue());
                    return I1.q.a(xVar, kotlin.coroutines.jvm.internal.b.a(true));
                }
                I1.o.b(obj);
            }
            xVar = (D) obj;
            return I1.q.a(xVar, kotlin.coroutines.jvm.internal.b.a(true));
        }
    }

    /* JADX INFO: renamed from: p.k$m */
    static final class m extends kotlin.coroutines.jvm.internal.l implements U1.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f10123a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f10124b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ boolean f10125c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f10127e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(int i3, M1.d dVar) {
            super(2, dVar);
            this.f10127e = i3;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final M1.d create(Object obj, M1.d dVar) {
            m mVar = C1057k.this.new m(this.f10127e, dVar);
            mVar.f10125c = ((Boolean) obj).booleanValue();
            return mVar;
        }

        public final Object i(boolean z2, M1.d dVar) {
            return ((m) create(Boolean.valueOf(z2), dVar)).invokeSuspend(I1.u.f2419a);
        }

        @Override // U1.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return i(((Boolean) obj).booleanValue(), (M1.d) obj2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v10 */
        /* JADX WARN: Type inference failed for: r0v2 */
        /* JADX WARN: Type inference failed for: r0v3 */
        /* JADX WARN: Type inference failed for: r0v5 */
        /* JADX WARN: Type inference failed for: r0v6 */
        /* JADX WARN: Type inference failed for: r0v9 */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
        /* JADX WARN: Type inference failed for: r1v13 */
        /* JADX WARN: Type inference failed for: r1v14 */
        /* JADX WARN: Type inference failed for: r1v15 */
        /* JADX WARN: Type inference failed for: r1v4, types: [boolean] */
        /* JADX WARN: Type inference failed for: r1v6 */
        /* JADX WARN: Type inference failed for: r1v9 */
        /* JADX WARN: Type inference failed for: r4v0 */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Throwable th;
            int iIntValue;
            ?? r02;
            ?? r03;
            D d3;
            ?? r12;
            Object objE = N1.d.e();
            ?? r13 = this.f10124b;
            try {
            } catch (Throwable th2) {
                if (r13 == 0) {
                    ?? r4 = r13;
                    th = th2;
                    iIntValue = this.f10127e;
                    r02 = r4 == true ? 1 : 0;
                    p.x xVar = new p.x(th, iIntValue);
                    r12 = r02;
                    d3 = xVar;
                    return I1.q.a(d3, kotlin.coroutines.jvm.internal.b.a(r12));
                }
                p.t tVarS = C1057k.this.s();
                this.f10123a = th2;
                this.f10125c = r13;
                this.f10124b = 2;
                Object objC = tVarS.c(this);
                if (objC == objE) {
                    return objE;
                }
                r03 = r13;
                th = th2;
                obj = objC;
            }
            if (r13 == 0) {
                I1.o.b(obj);
                boolean z2 = this.f10125c;
                C1057k c1057k = C1057k.this;
                this.f10125c = z2;
                this.f10124b = 1;
                obj = c1057k.z(z2, this);
                r13 = z2;
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (r13 != 1) {
                    if (r13 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    boolean z3 = this.f10125c;
                    th = (Throwable) this.f10123a;
                    I1.o.b(obj);
                    r03 = z3;
                    iIntValue = ((Number) obj).intValue();
                    r02 = r03;
                    p.x xVar2 = new p.x(th, iIntValue);
                    r12 = r02;
                    d3 = xVar2;
                    return I1.q.a(d3, kotlin.coroutines.jvm.internal.b.a(r12));
                }
                boolean z4 = this.f10125c;
                I1.o.b(obj);
                r13 = z4;
            }
            d3 = (D) obj;
            r12 = r13;
            return I1.q.a(d3, kotlin.coroutines.jvm.internal.b.a(r12));
        }
    }

    /* JADX INFO: renamed from: p.k$n */
    static final class n extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f10128a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f10129b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f10130c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f10131d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f10132e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f10133f;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        /* synthetic */ Object f10134l;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f10136n;

        n(M1.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f10134l = obj;
            this.f10136n |= Integer.MIN_VALUE;
            return C1057k.this.z(false, this);
        }
    }

    /* JADX INFO: renamed from: p.k$o */
    static final class o extends kotlin.coroutines.jvm.internal.l implements U1.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f10137a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f10138b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ boolean f10139c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f10141e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(int i3, M1.d dVar) {
            super(2, dVar);
            this.f10141e = i3;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final M1.d create(Object obj, M1.d dVar) {
            o oVar = C1057k.this.new o(this.f10141e, dVar);
            oVar.f10139c = ((Boolean) obj).booleanValue();
            return oVar;
        }

        public final Object i(boolean z2, M1.d dVar) {
            return ((o) create(Boolean.valueOf(z2), dVar)).invokeSuspend(I1.u.f2419a);
        }

        @Override // U1.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return i(((Boolean) obj).booleanValue(), (M1.d) obj2);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0059  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x005e  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) throws java.lang.Throwable {
            /*
                r5 = this;
                java.lang.Object r0 = N1.b.e()
                int r1 = r5.f10138b
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1c
                if (r1 != r2) goto L14
                java.lang.Object r0 = r5.f10137a
                I1.o.b(r6)
                goto L49
            L14:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1c:
                boolean r1 = r5.f10139c
                I1.o.b(r6)
                goto L34
            L22:
                I1.o.b(r6)
                boolean r1 = r5.f10139c
                p.k r6 = p.C1057k.this
                r5.f10139c = r1
                r5.f10138b = r3
                java.lang.Object r6 = p.C1057k.n(r6, r5)
                if (r6 != r0) goto L34
                return r0
            L34:
                if (r1 == 0) goto L50
                p.k r1 = p.C1057k.this
                p.t r1 = p.C1057k.d(r1)
                r5.f10137a = r6
                r5.f10138b = r2
                java.lang.Object r1 = r1.c(r5)
                if (r1 != r0) goto L47
                return r0
            L47:
                r0 = r6
                r6 = r1
            L49:
                java.lang.Number r6 = (java.lang.Number) r6
                int r6 = r6.intValue()
                goto L55
            L50:
                int r0 = r5.f10141e
                r4 = r0
                r0 = r6
                r6 = r4
            L55:
                p.f r1 = new p.f
                if (r0 == 0) goto L5e
                int r2 = r0.hashCode()
                goto L5f
            L5e:
                r2 = 0
            L5f:
                r1.<init>(r0, r2, r6)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p.C1057k.o.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: p.k$p */
    static final class p extends kotlin.coroutines.jvm.internal.l implements U1.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f10142a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f10143b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.y f10144c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ C1057k f10145d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.x f10146e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(kotlin.jvm.internal.y yVar, C1057k c1057k, kotlin.jvm.internal.x xVar, M1.d dVar) {
            super(1, dVar);
            this.f10144c = yVar;
            this.f10145d = c1057k;
            this.f10146e = xVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final M1.d create(M1.d dVar) {
            return new p(this.f10144c, this.f10145d, this.f10146e, dVar);
        }

        @Override // U1.l
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(M1.d dVar) {
            return ((p) create(dVar)).invokeSuspend(I1.u.f2419a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            kotlin.jvm.internal.x xVar;
            kotlin.jvm.internal.y yVar;
            kotlin.jvm.internal.x xVar2;
            Object objE = N1.d.e();
            int i3 = this.f10143b;
            try {
            } catch (C1050d unused) {
                kotlin.jvm.internal.x xVar3 = this.f10146e;
                C1057k c1057k = this.f10145d;
                Object obj2 = this.f10144c.f9750a;
                this.f10142a = xVar3;
                this.f10143b = 3;
                Object objC = c1057k.C(obj2, true, this);
                if (objC == objE) {
                    return objE;
                }
                xVar = xVar3;
                obj = objC;
            }
            if (i3 == 0) {
                I1.o.b(obj);
                yVar = this.f10144c;
                C1057k c1057k2 = this.f10145d;
                this.f10142a = yVar;
                this.f10143b = 1;
                obj = c1057k2.y(this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i3 != 1) {
                    if (i3 == 2) {
                        xVar2 = (kotlin.jvm.internal.x) this.f10142a;
                        I1.o.b(obj);
                        xVar2.f9749a = ((Number) obj).intValue();
                        return I1.u.f2419a;
                    }
                    if (i3 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    xVar = (kotlin.jvm.internal.x) this.f10142a;
                    I1.o.b(obj);
                    xVar.f9749a = ((Number) obj).intValue();
                    return I1.u.f2419a;
                }
                yVar = (kotlin.jvm.internal.y) this.f10142a;
                I1.o.b(obj);
            }
            yVar.f9750a = obj;
            xVar2 = this.f10146e;
            p.t tVarS = this.f10145d.s();
            this.f10142a = xVar2;
            this.f10143b = 2;
            obj = tVarS.c(this);
            if (obj == objE) {
                return objE;
            }
            xVar2.f9749a = ((Number) obj).intValue();
            return I1.u.f2419a;
        }
    }

    /* JADX INFO: renamed from: p.k$q */
    static final class q extends kotlin.coroutines.jvm.internal.l implements U1.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f10147a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f10149c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(boolean z2, M1.d dVar) {
            super(2, dVar);
            this.f10149c = z2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final M1.d create(Object obj, M1.d dVar) {
            return C1057k.this.new q(this.f10149c, dVar);
        }

        @Override // U1.p
        public final Object invoke(N n3, M1.d dVar) {
            return ((q) create(n3, dVar)).invokeSuspend(I1.u.f2419a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objE = N1.d.e();
            int i3 = this.f10147a;
            try {
                if (i3 == 0) {
                    I1.o.b(obj);
                    if (C1057k.this.f10037h.a() instanceof p.r) {
                        return C1057k.this.f10037h.a();
                    }
                    C1057k c1057k = C1057k.this;
                    this.f10147a = 1;
                    if (c1057k.w(this) == objE) {
                        return objE;
                    }
                } else {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        I1.o.b(obj);
                        return (D) obj;
                    }
                    I1.o.b(obj);
                }
                C1057k c1057k2 = C1057k.this;
                boolean z2 = this.f10149c;
                this.f10147a = 2;
                obj = c1057k2.x(z2, this);
                if (obj == objE) {
                    return objE;
                }
                return (D) obj;
            } catch (Throwable th) {
                return new p.x(th, -1);
            }
        }
    }

    /* JADX INFO: renamed from: p.k$r */
    static final class r extends kotlin.jvm.internal.n implements U1.a {
        r() {
            super(0);
        }

        @Override // U1.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final F invoke() {
            return C1057k.this.f10030a.a();
        }
    }

    /* JADX INFO: renamed from: p.k$s */
    static final class s extends kotlin.coroutines.jvm.internal.l implements U1.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f10151a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f10152b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ M1.g f10154d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ U1.p f10155e;

        /* JADX INFO: renamed from: p.k$s$a */
        static final class a extends kotlin.coroutines.jvm.internal.l implements U1.p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f10156a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ U1.p f10157b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ C1052f f10158c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(U1.p pVar, C1052f c1052f, M1.d dVar) {
                super(2, dVar);
                this.f10157b = pVar;
                this.f10158c = c1052f;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final M1.d create(Object obj, M1.d dVar) {
                return new a(this.f10157b, this.f10158c, dVar);
            }

            @Override // U1.p
            public final Object invoke(N n3, M1.d dVar) {
                return ((a) create(n3, dVar)).invokeSuspend(I1.u.f2419a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objE = N1.d.e();
                int i3 = this.f10156a;
                if (i3 == 0) {
                    I1.o.b(obj);
                    U1.p pVar = this.f10157b;
                    Object objC = this.f10158c.c();
                    this.f10156a = 1;
                    obj = pVar.invoke(objC, this);
                    if (obj == objE) {
                        return objE;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    I1.o.b(obj);
                }
                return obj;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        s(M1.g gVar, U1.p pVar, M1.d dVar) {
            super(1, dVar);
            this.f10154d = gVar;
            this.f10155e = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final M1.d create(M1.d dVar) {
            return C1057k.this.new s(this.f10154d, this.f10155e, dVar);
        }

        @Override // U1.l
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(M1.d dVar) {
            return ((s) create(dVar)).invokeSuspend(I1.u.f2419a);
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x005e  */
        /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Throwable {
            /*
                r8 = this;
                java.lang.Object r0 = N1.b.e()
                int r1 = r8.f10152b
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L2b
                if (r1 == r4) goto L27
                if (r1 == r3) goto L1f
                if (r1 != r2) goto L17
                java.lang.Object r0 = r8.f10151a
                I1.o.b(r9)
                goto L6c
            L17:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L1f:
                java.lang.Object r1 = r8.f10151a
                p.f r1 = (p.C1052f) r1
                I1.o.b(r9)
                goto L51
            L27:
                I1.o.b(r9)
                goto L39
            L2b:
                I1.o.b(r9)
                p.k r9 = p.C1057k.this
                r8.f10152b = r4
                java.lang.Object r9 = p.C1057k.o(r9, r4, r8)
                if (r9 != r0) goto L39
                return r0
            L39:
                r1 = r9
                p.f r1 = (p.C1052f) r1
                M1.g r9 = r8.f10154d
                p.k$s$a r5 = new p.k$s$a
                U1.p r6 = r8.f10155e
                r7 = 0
                r5.<init>(r6, r1, r7)
                r8.f10151a = r1
                r8.f10152b = r3
                java.lang.Object r9 = c2.AbstractC0566i.g(r9, r5, r8)
                if (r9 != r0) goto L51
                return r0
            L51:
                r1.b()
                java.lang.Object r1 = r1.c()
                boolean r1 = kotlin.jvm.internal.m.a(r1, r9)
                if (r1 != 0) goto L6d
                p.k r1 = p.C1057k.this
                r8.f10151a = r9
                r8.f10152b = r2
                java.lang.Object r1 = r1.C(r9, r4, r8)
                if (r1 != r0) goto L6b
                return r0
            L6b:
                r0 = r9
            L6c:
                r9 = r0
            L6d:
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: p.C1057k.s.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: p.k$t */
    static final class t extends kotlin.coroutines.jvm.internal.l implements U1.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f10159a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f10160b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ U1.p f10162d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        t(U1.p pVar, M1.d dVar) {
            super(2, dVar);
            this.f10162d = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final M1.d create(Object obj, M1.d dVar) {
            t tVar = C1057k.this.new t(this.f10162d, dVar);
            tVar.f10160b = obj;
            return tVar;
        }

        @Override // U1.p
        public final Object invoke(N n3, M1.d dVar) {
            return ((t) create(n3, dVar)).invokeSuspend(I1.u.f2419a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objE = N1.d.e();
            int i3 = this.f10159a;
            if (i3 == 0) {
                I1.o.b(obj);
                N n3 = (N) this.f10160b;
                InterfaceC0595x interfaceC0595xB = AbstractC0599z.b(null, 1, null);
                C1057k.this.f10041l.e(new w.a(this.f10162d, interfaceC0595xB, C1057k.this.f10037h.a(), n3.e()));
                this.f10159a = 1;
                obj = interfaceC0595xB.await(this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                I1.o.b(obj);
            }
            return obj;
        }
    }

    /* JADX INFO: renamed from: p.k$u */
    static final class u extends kotlin.jvm.internal.n implements U1.l {
        u() {
            super(1);
        }

        public final void b(Throwable th) {
            if (th != null) {
                C1057k.this.f10037h.c(new p.r(th));
            }
            if (C1057k.this.f10039j.d()) {
                C1057k.this.t().close();
            }
        }

        @Override // U1.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((Throwable) obj);
            return I1.u.f2419a;
        }
    }

    /* JADX INFO: renamed from: p.k$v */
    static final class v extends kotlin.jvm.internal.n implements U1.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final v f10164a = new v();

        v() {
            super(2);
        }

        public final void b(w.a msg, Throwable th) {
            kotlin.jvm.internal.m.e(msg, "msg");
            InterfaceC0595x interfaceC0595xA = msg.a();
            if (th == null) {
                th = new CancellationException("DataStore scope was cancelled before updateData could complete");
            }
            interfaceC0595xA.r(th);
        }

        @Override // U1.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((w.a) obj, (Throwable) obj2);
            return I1.u.f2419a;
        }
    }

    /* JADX INFO: renamed from: p.k$w */
    static final class w extends kotlin.coroutines.jvm.internal.l implements U1.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f10165a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f10166b;

        w(M1.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final M1.d create(Object obj, M1.d dVar) {
            w wVar = C1057k.this.new w(dVar);
            wVar.f10166b = obj;
            return wVar;
        }

        @Override // U1.p
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(w.a aVar, M1.d dVar) {
            return ((w) create(aVar, dVar)).invokeSuspend(I1.u.f2419a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objE = N1.d.e();
            int i3 = this.f10165a;
            if (i3 == 0) {
                I1.o.b(obj);
                w.a aVar = (w.a) this.f10166b;
                C1057k c1057k = C1057k.this;
                this.f10165a = 1;
                if (c1057k.u(aVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                I1.o.b(obj);
            }
            return I1.u.f2419a;
        }
    }

    /* JADX INFO: renamed from: p.k$x */
    static final class x extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f10168a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f10169b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f10171d;

        x(M1.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f10169b = obj;
            this.f10171d |= Integer.MIN_VALUE;
            return C1057k.this.C(null, false, this);
        }
    }

    /* JADX INFO: renamed from: p.k$y */
    static final class y extends kotlin.coroutines.jvm.internal.l implements U1.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f10172a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f10173b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f10174c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.x f10175d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ C1057k f10176e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Object f10177f;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ boolean f10178l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        y(kotlin.jvm.internal.x xVar, C1057k c1057k, Object obj, boolean z2, M1.d dVar) {
            super(2, dVar);
            this.f10175d = xVar;
            this.f10176e = c1057k;
            this.f10177f = obj;
            this.f10178l = z2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final M1.d create(Object obj, M1.d dVar) {
            y yVar = new y(this.f10175d, this.f10176e, this.f10177f, this.f10178l, dVar);
            yVar.f10174c = obj;
            return yVar;
        }

        @Override // U1.p
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(K k3, M1.d dVar) {
            return ((y) create(k3, dVar)).invokeSuspend(I1.u.f2419a);
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0061  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
            /*
                r6 = this;
                java.lang.Object r0 = N1.b.e()
                int r1 = r6.f10173b
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L26
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                I1.o.b(r7)
                goto L5d
            L12:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1a:
                java.lang.Object r1 = r6.f10172a
                kotlin.jvm.internal.x r1 = (kotlin.jvm.internal.x) r1
                java.lang.Object r3 = r6.f10174c
                p.K r3 = (p.K) r3
                I1.o.b(r7)
                goto L45
            L26:
                I1.o.b(r7)
                java.lang.Object r7 = r6.f10174c
                p.K r7 = (p.K) r7
                kotlin.jvm.internal.x r1 = r6.f10175d
                p.k r4 = r6.f10176e
                p.t r4 = p.C1057k.d(r4)
                r6.f10174c = r7
                r6.f10172a = r1
                r6.f10173b = r3
                java.lang.Object r3 = r4.b(r6)
                if (r3 != r0) goto L42
                return r0
            L42:
                r5 = r3
                r3 = r7
                r7 = r5
            L45:
                java.lang.Number r7 = (java.lang.Number) r7
                int r7 = r7.intValue()
                r1.f9749a = r7
                java.lang.Object r7 = r6.f10177f
                r1 = 0
                r6.f10174c = r1
                r6.f10172a = r1
                r6.f10173b = r2
                java.lang.Object r7 = r3.d(r7, r6)
                if (r7 != r0) goto L5d
                return r0
            L5d:
                boolean r7 = r6.f10178l
                if (r7 == 0) goto L7d
                p.k r7 = r6.f10176e
                p.l r7 = p.C1057k.e(r7)
                p.f r0 = new p.f
                java.lang.Object r1 = r6.f10177f
                if (r1 == 0) goto L72
                int r2 = r1.hashCode()
                goto L73
            L72:
                r2 = 0
            L73:
                kotlin.jvm.internal.x r3 = r6.f10175d
                int r3 = r3.f9749a
                r0.<init>(r1, r2, r3)
                r7.c(r0)
            L7d:
                I1.u r7 = I1.u.f2419a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: p.C1057k.y.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C1057k(E storage, List initTasksList, InterfaceC1051e corruptionHandler, N scope) {
        kotlin.jvm.internal.m.e(storage, "storage");
        kotlin.jvm.internal.m.e(initTasksList, "initTasksList");
        kotlin.jvm.internal.m.e(corruptionHandler, "corruptionHandler");
        kotlin.jvm.internal.m.e(scope, "scope");
        this.f10030a = storage;
        this.f10031b = corruptionHandler;
        this.f10032c = scope;
        this.f10033d = f2.d.i(new d(null));
        this.f10034e = l2.g.b(false, 1, null);
        this.f10037h = new p.l();
        this.f10038i = new b(this, initTasksList);
        this.f10039j = I1.i.a(new r());
        this.f10040k = I1.i.a(new c());
        this.f10041l = new B(scope, new u(), v.f10164a, new w(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object A(boolean z2, M1.d dVar) {
        return AbstractC0566i.g(this.f10032c.e(), new q(z2, null), dVar);
    }

    private final Object B(U1.p pVar, M1.g gVar, M1.d dVar) {
        return s().e(new s(gVar, pVar, null), dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object q(M1.d r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof p.C1057k.e
            if (r0 == 0) goto L13
            r0 = r6
            p.k$e r0 = (p.C1057k.e) r0
            int r1 = r0.f10092e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10092e = r1
            goto L18
        L13:
            p.k$e r0 = new p.k$e
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f10090c
            java.lang.Object r1 = N1.b.e()
            int r2 = r0.f10092e
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r1 = r0.f10089b
            l2.a r1 = (l2.a) r1
            java.lang.Object r0 = r0.f10088a
            p.k r0 = (p.C1057k) r0
            I1.o.b(r6)
            goto L4e
        L32:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L3a:
            I1.o.b(r6)
            l2.a r6 = r5.f10034e
            r0.f10088a = r5
            r0.f10089b = r6
            r0.f10092e = r3
            java.lang.Object r0 = r6.c(r4, r0)
            if (r0 != r1) goto L4c
            return r1
        L4c:
            r0 = r5
            r1 = r6
        L4e:
            int r6 = r0.f10035f     // Catch: java.lang.Throwable -> L5e
            int r6 = r6 + (-1)
            r0.f10035f = r6     // Catch: java.lang.Throwable -> L5e
            if (r6 != 0) goto L62
            c2.z0 r6 = r0.f10036g     // Catch: java.lang.Throwable -> L5e
            if (r6 == 0) goto L60
            c2.InterfaceC0600z0.a.b(r6, r4, r3, r4)     // Catch: java.lang.Throwable -> L5e
            goto L60
        L5e:
            r6 = move-exception
            goto L6a
        L60:
            r0.f10036g = r4     // Catch: java.lang.Throwable -> L5e
        L62:
            I1.u r6 = I1.u.f2419a     // Catch: java.lang.Throwable -> L5e
            r1.a(r4)
            I1.u r6 = I1.u.f2419a
            return r6
        L6a:
            r1.a(r4)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p.C1057k.q(M1.d):java.lang.Object");
    }

    private final Object r(boolean z2, U1.l lVar, M1.d dVar) {
        return z2 ? lVar.invoke(dVar) : s().e(new f(lVar, null), dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final p.t s() {
        return (p.t) this.f10040k.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, p.w$a] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16, types: [p.w$a] */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v3, types: [c2.x] */
    /* JADX WARN: Type inference failed for: r9v31 */
    /* JADX WARN: Type inference failed for: r9v32 */
    /* JADX WARN: Type inference failed for: r9v33 */
    /* JADX WARN: Type inference failed for: r9v34 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object u(p.w.a r9, M1.d r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 238
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.C1057k.u(p.w$a, M1.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object v(M1.d r12) throws java.lang.Throwable {
        /*
            r11 = this;
            boolean r0 = r12 instanceof p.C1057k.h
            if (r0 == 0) goto L13
            r0 = r12
            p.k$h r0 = (p.C1057k.h) r0
            int r1 = r0.f10105e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10105e = r1
            goto L18
        L13:
            p.k$h r0 = new p.k$h
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f10103c
            java.lang.Object r1 = N1.b.e()
            int r2 = r0.f10105e
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r1 = r0.f10102b
            l2.a r1 = (l2.a) r1
            java.lang.Object r0 = r0.f10101a
            p.k r0 = (p.C1057k) r0
            I1.o.b(r12)
            goto L4e
        L32:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L3a:
            I1.o.b(r12)
            l2.a r12 = r11.f10034e
            r0.f10101a = r11
            r0.f10102b = r12
            r0.f10105e = r3
            java.lang.Object r0 = r12.c(r4, r0)
            if (r0 != r1) goto L4c
            return r1
        L4c:
            r0 = r11
            r1 = r12
        L4e:
            int r12 = r0.f10035f     // Catch: java.lang.Throwable -> L67
            int r12 = r12 + r3
            r0.f10035f = r12     // Catch: java.lang.Throwable -> L67
            if (r12 != r3) goto L69
            c2.N r5 = r0.f10032c     // Catch: java.lang.Throwable -> L67
            p.k$i r8 = new p.k$i     // Catch: java.lang.Throwable -> L67
            r8.<init>(r4)     // Catch: java.lang.Throwable -> L67
            r9 = 3
            r10 = 0
            r6 = 0
            r7 = 0
            c2.z0 r12 = c2.AbstractC0566i.d(r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L67
            r0.f10036g = r12     // Catch: java.lang.Throwable -> L67
            goto L69
        L67:
            r12 = move-exception
            goto L71
        L69:
            I1.u r12 = I1.u.f2419a     // Catch: java.lang.Throwable -> L67
            r1.a(r4)
            I1.u r12 = I1.u.f2419a
            return r12
        L71:
            r1.a(r4)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p.C1057k.v(M1.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object w(M1.d r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof p.C1057k.j
            if (r0 == 0) goto L13
            r0 = r6
            p.k$j r0 = (p.C1057k.j) r0
            int r1 = r0.f10113e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10113e = r1
            goto L18
        L13:
            p.k$j r0 = new p.k$j
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f10111c
            java.lang.Object r1 = N1.b.e()
            int r2 = r0.f10113e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L44
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            int r1 = r0.f10110b
            java.lang.Object r0 = r0.f10109a
            p.k r0 = (p.C1057k) r0
            I1.o.b(r6)     // Catch: java.lang.Throwable -> L32
            goto L6c
        L32:
            r6 = move-exception
            goto L73
        L34:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L3c:
            java.lang.Object r2 = r0.f10109a
            p.k r2 = (p.C1057k) r2
            I1.o.b(r6)
            goto L57
        L44:
            I1.o.b(r6)
            p.t r6 = r5.s()
            r0.f10109a = r5
            r0.f10113e = r4
            java.lang.Object r6 = r6.c(r0)
            if (r6 != r1) goto L56
            return r1
        L56:
            r2 = r5
        L57:
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            p.k$b r4 = r2.f10038i     // Catch: java.lang.Throwable -> L6f
            r0.f10109a = r2     // Catch: java.lang.Throwable -> L6f
            r0.f10110b = r6     // Catch: java.lang.Throwable -> L6f
            r0.f10113e = r3     // Catch: java.lang.Throwable -> L6f
            java.lang.Object r6 = r4.c(r0)     // Catch: java.lang.Throwable -> L6f
            if (r6 != r1) goto L6c
            return r1
        L6c:
            I1.u r6 = I1.u.f2419a
            return r6
        L6f:
            r0 = move-exception
            r1 = r6
            r6 = r0
            r0 = r2
        L73:
            p.l r0 = r0.f10037h
            p.x r2 = new p.x
            r2.<init>(r6, r1)
            r0.c(r2)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p.C1057k.w(M1.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object x(boolean r10, M1.d r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.C1057k.x(boolean, M1.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object y(M1.d dVar) {
        return G.a(t(), dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x010b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x012a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x014b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00a9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object z(boolean r11, M1.d r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 374
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.C1057k.z(boolean, M1.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object C(java.lang.Object r12, boolean r13, M1.d r14) throws java.lang.Throwable {
        /*
            r11 = this;
            boolean r0 = r14 instanceof p.C1057k.x
            if (r0 == 0) goto L13
            r0 = r14
            p.k$x r0 = (p.C1057k.x) r0
            int r1 = r0.f10171d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10171d = r1
            goto L18
        L13:
            p.k$x r0 = new p.k$x
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.f10169b
            java.lang.Object r1 = N1.b.e()
            int r2 = r0.f10171d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r12 = r0.f10168a
            kotlin.jvm.internal.x r12 = (kotlin.jvm.internal.x) r12
            I1.o.b(r14)
            goto L58
        L2d:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L35:
            I1.o.b(r14)
            kotlin.jvm.internal.x r14 = new kotlin.jvm.internal.x
            r14.<init>()
            p.F r2 = r11.t()
            p.k$y r10 = new p.k$y
            r9 = 0
            r4 = r10
            r5 = r14
            r6 = r11
            r7 = r12
            r8 = r13
            r4.<init>(r5, r6, r7, r8, r9)
            r0.f10168a = r14
            r0.f10171d = r3
            java.lang.Object r12 = r2.e(r10, r0)
            if (r12 != r1) goto L57
            return r1
        L57:
            r12 = r14
        L58:
            int r12 = r12.f9749a
            java.lang.Integer r12 = kotlin.coroutines.jvm.internal.b.c(r12)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p.C1057k.C(java.lang.Object, boolean, M1.d):java.lang.Object");
    }

    @Override // p.InterfaceC1055i
    public Object a(U1.p pVar, M1.d dVar) {
        J j3 = (J) dVar.getContext().get(J.a.C0154a.f10005a);
        if (j3 != null) {
            j3.a(this);
        }
        return AbstractC0566i.g(new J(j3, this), new t(pVar, null), dVar);
    }

    @Override // p.InterfaceC1055i
    public f2.b b() {
        return this.f10033d;
    }

    public final F t() {
        return (F) this.f10039j.getValue();
    }
}
