package f2;

import I1.u;
import kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes.dex */
abstract /* synthetic */ class j {

    public static final class a implements f2.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ f2.b f7273a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ U1.p f7274b;

        public a(f2.b bVar, U1.p pVar) {
            this.f7273a = bVar;
            this.f7274b = pVar;
        }

        @Override // f2.b
        public Object a(f2.c cVar, M1.d dVar) {
            Object objA = this.f7273a.a(new b(new w(), cVar, this.f7274b), dVar);
            return objA == N1.d.e() ? objA : u.f2419a;
        }
    }

    static final class b implements f2.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ w f7275a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ f2.c f7276b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ U1.p f7277c;

        static final class a extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            Object f7278a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            Object f7279b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f7280c;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f7282e;

            a(M1.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f7280c = obj;
                this.f7282e |= Integer.MIN_VALUE;
                return b.this.emit(null, this);
            }
        }

        b(w wVar, f2.c cVar, U1.p pVar) {
            this.f7275a = wVar;
            this.f7276b = cVar;
            this.f7277c = pVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:31:0x0074  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x008b  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // f2.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object emit(java.lang.Object r7, M1.d r8) throws java.lang.Throwable {
            /*
                r6 = this;
                boolean r0 = r8 instanceof f2.j.b.a
                if (r0 == 0) goto L13
                r0 = r8
                f2.j$b$a r0 = (f2.j.b.a) r0
                int r1 = r0.f7282e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f7282e = r1
                goto L18
            L13:
                f2.j$b$a r0 = new f2.j$b$a
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.f7280c
                java.lang.Object r1 = N1.b.e()
                int r2 = r0.f7282e
                r3 = 3
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L45
                if (r2 == r5) goto L41
                if (r2 == r4) goto L37
                if (r2 != r3) goto L2f
                I1.o.b(r8)
                goto L88
            L2f:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L37:
                java.lang.Object r7 = r0.f7279b
                java.lang.Object r2 = r0.f7278a
                f2.j$b r2 = (f2.j.b) r2
                I1.o.b(r8)
                goto L6c
            L41:
                I1.o.b(r8)
                goto L59
            L45:
                I1.o.b(r8)
                kotlin.jvm.internal.w r8 = r6.f7275a
                boolean r8 = r8.f9748a
                if (r8 == 0) goto L5c
                f2.c r8 = r6.f7276b
                r0.f7282e = r5
                java.lang.Object r7 = r8.emit(r7, r0)
                if (r7 != r1) goto L59
                return r1
            L59:
                I1.u r7 = I1.u.f2419a
                return r7
            L5c:
                U1.p r8 = r6.f7277c
                r0.f7278a = r6
                r0.f7279b = r7
                r0.f7282e = r4
                java.lang.Object r8 = r8.invoke(r7, r0)
                if (r8 != r1) goto L6b
                return r1
            L6b:
                r2 = r6
            L6c:
                java.lang.Boolean r8 = (java.lang.Boolean) r8
                boolean r8 = r8.booleanValue()
                if (r8 != 0) goto L8b
                kotlin.jvm.internal.w r8 = r2.f7275a
                r8.f9748a = r5
                f2.c r8 = r2.f7276b
                r2 = 0
                r0.f7278a = r2
                r0.f7279b = r2
                r0.f7282e = r3
                java.lang.Object r7 = r8.emit(r7, r0)
                if (r7 != r1) goto L88
                return r1
            L88:
                I1.u r7 = I1.u.f2419a
                return r7
            L8b:
                I1.u r7 = I1.u.f2419a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: f2.j.b.emit(java.lang.Object, M1.d):java.lang.Object");
        }
    }

    public static final class c implements f2.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ f2.b f7283a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ U1.p f7284b;

        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            /* synthetic */ Object f7285a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            int f7286b;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f7288d;

            public a(M1.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f7285a = obj;
                this.f7286b |= Integer.MIN_VALUE;
                return c.this.a(null, this);
            }
        }

        public c(f2.b bVar, U1.p pVar) {
            this.f7283a = bVar;
            this.f7284b = pVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // f2.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object a(f2.c r6, M1.d r7) throws java.lang.Throwable {
            /*
                r5 = this;
                boolean r0 = r7 instanceof f2.j.c.a
                if (r0 == 0) goto L13
                r0 = r7
                f2.j$c$a r0 = (f2.j.c.a) r0
                int r1 = r0.f7286b
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f7286b = r1
                goto L18
            L13:
                f2.j$c$a r0 = new f2.j$c$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.f7285a
                java.lang.Object r1 = N1.b.e()
                int r2 = r0.f7286b
                r3 = 1
                if (r2 == 0) goto L37
                if (r2 != r3) goto L2f
                java.lang.Object r6 = r0.f7288d
                f2.j$d r6 = (f2.j.d) r6
                I1.o.b(r7)     // Catch: g2.a -> L2d
                goto L53
            L2d:
                r7 = move-exception
                goto L50
            L2f:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L37:
                I1.o.b(r7)
                f2.b r7 = r5.f7283a
                f2.j$d r2 = new f2.j$d
                U1.p r4 = r5.f7284b
                r2.<init>(r4, r6)
                r0.f7288d = r2     // Catch: g2.a -> L4e
                r0.f7286b = r3     // Catch: g2.a -> L4e
                java.lang.Object r6 = r7.a(r2, r0)     // Catch: g2.a -> L4e
                if (r6 != r1) goto L53
                return r1
            L4e:
                r7 = move-exception
                r6 = r2
            L50:
                g2.j.a(r7, r6)
            L53:
                I1.u r6 = I1.u.f2419a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: f2.j.c.a(f2.c, M1.d):java.lang.Object");
        }
    }

    public static final class d implements f2.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ U1.p f7289a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ f2.c f7290b;

        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            Object f7291a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f7292b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            int f7293c;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f7295e;

            public a(M1.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f7292b = obj;
                this.f7293c |= Integer.MIN_VALUE;
                return d.this.emit(null, this);
            }
        }

        public d(U1.p pVar, f2.c cVar) {
            this.f7289a = pVar;
            this.f7290b = cVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x007e  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0081  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // f2.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object emit(java.lang.Object r8, M1.d r9) throws java.lang.Throwable {
            /*
                r7 = this;
                boolean r0 = r9 instanceof f2.j.d.a
                if (r0 == 0) goto L13
                r0 = r9
                f2.j$d$a r0 = (f2.j.d.a) r0
                int r1 = r0.f7293c
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f7293c = r1
                goto L18
            L13:
                f2.j$d$a r0 = new f2.j$d$a
                r0.<init>(r9)
            L18:
                java.lang.Object r9 = r0.f7292b
                java.lang.Object r1 = N1.b.e()
                int r2 = r0.f7293c
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L46
                if (r2 == r4) goto L38
                if (r2 != r3) goto L30
                java.lang.Object r8 = r0.f7291a
                f2.j$d r8 = (f2.j.d) r8
                I1.o.b(r9)
                goto L7c
            L30:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L38:
                java.lang.Object r8 = r0.f7295e
                java.lang.Object r2 = r0.f7291a
                f2.j$d r2 = (f2.j.d) r2
                I1.o.b(r9)
                r6 = r9
                r9 = r8
                r8 = r2
                r2 = r6
                goto L63
            L46:
                I1.o.b(r9)
                U1.p r9 = r7.f7289a
                r0.f7291a = r7
                r0.f7295e = r8
                r0.f7293c = r4
                r2 = 6
                kotlin.jvm.internal.l.a(r2)
                java.lang.Object r9 = r9.invoke(r8, r0)
                r2 = 7
                kotlin.jvm.internal.l.a(r2)
                if (r9 != r1) goto L60
                return r1
            L60:
                r2 = r9
                r9 = r8
                r8 = r7
            L63:
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                boolean r2 = r2.booleanValue()
                if (r2 == 0) goto L7b
                f2.c r2 = r8.f7290b
                r0.f7291a = r8
                r5 = 0
                r0.f7295e = r5
                r0.f7293c = r3
                java.lang.Object r9 = r2.emit(r9, r0)
                if (r9 != r1) goto L7c
                return r1
            L7b:
                r4 = 0
            L7c:
                if (r4 == 0) goto L81
                I1.u r8 = I1.u.f2419a
                return r8
            L81:
                g2.a r9 = new g2.a
                r9.<init>(r8)
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: f2.j.d.emit(java.lang.Object, M1.d):java.lang.Object");
        }
    }

    public static final f2.b a(f2.b bVar, U1.p pVar) {
        return new a(bVar, pVar);
    }

    public static final f2.b b(f2.b bVar, U1.p pVar) {
        return new c(bVar, pVar);
    }
}
