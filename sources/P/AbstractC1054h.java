package p;

import java.util.List;

/* JADX INFO: renamed from: p.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1054h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f10010a = new a(null);

    /* JADX INFO: renamed from: p.h$a */
    public static final class a {

        /* JADX INFO: renamed from: p.h$a$a, reason: collision with other inner class name */
        static final class C0155a extends kotlin.coroutines.jvm.internal.l implements U1.p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f10011a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f10012b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ List f10013c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0155a(List list, M1.d dVar) {
                super(2, dVar);
                this.f10013c = list;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final M1.d create(Object obj, M1.d dVar) {
                C0155a c0155a = new C0155a(this.f10013c, dVar);
                c0155a.f10012b = obj;
                return c0155a;
            }

            @Override // U1.p
            /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
            public final Object invoke(s sVar, M1.d dVar) {
                return ((C0155a) create(sVar, dVar)).invokeSuspend(I1.u.f2419a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objE = N1.d.e();
                int i3 = this.f10011a;
                if (i3 == 0) {
                    I1.o.b(obj);
                    s sVar = (s) this.f10012b;
                    a aVar = AbstractC1054h.f10010a;
                    List list = this.f10013c;
                    this.f10011a = 1;
                    if (aVar.c(list, sVar, this) == objE) {
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

        /* JADX INFO: renamed from: p.h$a$b */
        static final class b extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            Object f10014a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            Object f10015b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f10016c;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f10018e;

            b(M1.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f10016c = obj;
                this.f10018e |= Integer.MIN_VALUE;
                return a.this.c(null, null, this);
            }
        }

        /* JADX INFO: renamed from: p.h$a$c */
        static final class c extends kotlin.coroutines.jvm.internal.l implements U1.p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            Object f10019a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            Object f10020b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            Object f10021c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            int f10022d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            /* synthetic */ Object f10023e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ List f10024f;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            final /* synthetic */ List f10025l;

            /* JADX INFO: renamed from: p.h$a$c$a, reason: collision with other inner class name */
            static final class C0156a extends kotlin.coroutines.jvm.internal.l implements U1.l {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                int f10026a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ InterfaceC1053g f10027b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0156a(InterfaceC1053g interfaceC1053g, M1.d dVar) {
                    super(1, dVar);
                    this.f10027b = interfaceC1053g;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final M1.d create(M1.d dVar) {
                    return new C0156a(this.f10027b, dVar);
                }

                @Override // U1.l
                /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
                public final Object invoke(M1.d dVar) {
                    return ((C0156a) create(dVar)).invokeSuspend(I1.u.f2419a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) throws Throwable {
                    Object objE = N1.d.e();
                    int i3 = this.f10026a;
                    if (i3 == 0) {
                        I1.o.b(obj);
                        InterfaceC1053g interfaceC1053g = this.f10027b;
                        this.f10026a = 1;
                        if (interfaceC1053g.a(this) == objE) {
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

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(List list, List list2, M1.d dVar) {
                super(2, dVar);
                this.f10024f = list;
                this.f10025l = list2;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final M1.d create(Object obj, M1.d dVar) {
                c cVar = new c(this.f10024f, this.f10025l, dVar);
                cVar.f10023e = obj;
                return cVar;
            }

            @Override // U1.p
            /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
            public final Object invoke(Object obj, M1.d dVar) {
                return ((c) create(obj, dVar)).invokeSuspend(I1.u.f2419a);
            }

            /* JADX WARN: Removed duplicated region for block: B:13:0x004a  */
            /* JADX WARN: Removed duplicated region for block: B:19:0x006e  */
            /* JADX WARN: Removed duplicated region for block: B:23:0x008a  */
            /* JADX WARN: Removed duplicated region for block: B:24:0x008c A[RETURN] */
            @Override // kotlin.coroutines.jvm.internal.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Throwable {
                /*
                    r9 = this;
                    java.lang.Object r0 = N1.b.e()
                    int r1 = r9.f10022d
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L37
                    if (r1 == r3) goto L22
                    if (r1 != r2) goto L1a
                    java.lang.Object r1 = r9.f10019a
                    java.util.Iterator r1 = (java.util.Iterator) r1
                    java.lang.Object r4 = r9.f10023e
                    java.util.List r4 = (java.util.List) r4
                    I1.o.b(r10)
                    goto L44
                L1a:
                    java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r10.<init>(r0)
                    throw r10
                L22:
                    java.lang.Object r1 = r9.f10021c
                    java.lang.Object r4 = r9.f10020b
                    p.g r4 = (p.InterfaceC1053g) r4
                    java.lang.Object r5 = r9.f10019a
                    java.util.Iterator r5 = (java.util.Iterator) r5
                    java.lang.Object r6 = r9.f10023e
                    java.util.List r6 = (java.util.List) r6
                    I1.o.b(r10)
                    r8 = r6
                    r6 = r4
                    r4 = r8
                    goto L66
                L37:
                    I1.o.b(r10)
                    java.lang.Object r10 = r9.f10023e
                    java.util.List r1 = r9.f10024f
                    java.util.List r4 = r9.f10025l
                    java.util.Iterator r1 = r1.iterator()
                L44:
                    boolean r5 = r1.hasNext()
                    if (r5 == 0) goto L8c
                    java.lang.Object r5 = r1.next()
                    p.g r5 = (p.InterfaceC1053g) r5
                    r9.f10023e = r4
                    r9.f10019a = r1
                    r9.f10020b = r5
                    r9.f10021c = r10
                    r9.f10022d = r3
                    java.lang.Object r6 = r5.c(r10, r9)
                    if (r6 != r0) goto L61
                    return r0
                L61:
                    r8 = r1
                    r1 = r10
                    r10 = r6
                    r6 = r5
                    r5 = r8
                L66:
                    java.lang.Boolean r10 = (java.lang.Boolean) r10
                    boolean r10 = r10.booleanValue()
                    if (r10 == 0) goto L8a
                    p.h$a$c$a r10 = new p.h$a$c$a
                    r7 = 0
                    r10.<init>(r6, r7)
                    r4.add(r10)
                    r9.f10023e = r4
                    r9.f10019a = r5
                    r9.f10020b = r7
                    r9.f10021c = r7
                    r9.f10022d = r2
                    java.lang.Object r10 = r6.b(r1, r9)
                    if (r10 != r0) goto L88
                    return r0
                L88:
                    r1 = r5
                    goto L44
                L8a:
                    r10 = r1
                    goto L88
                L8c:
                    return r10
                */
                throw new UnsupportedOperationException("Method not decompiled: p.AbstractC1054h.a.c.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.h hVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:27:0x006f  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0098  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x009b  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0086 -> B:25:0x0069). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0089 -> B:25:0x0069). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object c(java.util.List r7, p.s r8, M1.d r9) throws java.lang.Throwable {
            /*
                r6 = this;
                boolean r0 = r9 instanceof p.AbstractC1054h.a.b
                if (r0 == 0) goto L13
                r0 = r9
                p.h$a$b r0 = (p.AbstractC1054h.a.b) r0
                int r1 = r0.f10018e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f10018e = r1
                goto L18
            L13:
                p.h$a$b r0 = new p.h$a$b
                r0.<init>(r9)
            L18:
                java.lang.Object r9 = r0.f10016c
                java.lang.Object r1 = N1.b.e()
                int r2 = r0.f10018e
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L46
                if (r2 == r4) goto L3e
                if (r2 != r3) goto L36
                java.lang.Object r7 = r0.f10015b
                java.util.Iterator r7 = (java.util.Iterator) r7
                java.lang.Object r8 = r0.f10014a
                kotlin.jvm.internal.y r8 = (kotlin.jvm.internal.y) r8
                I1.o.b(r9)     // Catch: java.lang.Throwable -> L34
                goto L69
            L34:
                r9 = move-exception
                goto L82
            L36:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L3e:
                java.lang.Object r7 = r0.f10014a
                java.util.List r7 = (java.util.List) r7
                I1.o.b(r9)
                goto L60
            L46:
                I1.o.b(r9)
                java.util.ArrayList r9 = new java.util.ArrayList
                r9.<init>()
                p.h$a$c r2 = new p.h$a$c
                r5 = 0
                r2.<init>(r7, r9, r5)
                r0.f10014a = r9
                r0.f10018e = r4
                java.lang.Object r7 = r8.a(r2, r0)
                if (r7 != r1) goto L5f
                return r1
            L5f:
                r7 = r9
            L60:
                kotlin.jvm.internal.y r8 = new kotlin.jvm.internal.y
                r8.<init>()
                java.util.Iterator r7 = r7.iterator()
            L69:
                boolean r9 = r7.hasNext()
                if (r9 == 0) goto L92
                java.lang.Object r9 = r7.next()
                U1.l r9 = (U1.l) r9
                r0.f10014a = r8     // Catch: java.lang.Throwable -> L34
                r0.f10015b = r7     // Catch: java.lang.Throwable -> L34
                r0.f10018e = r3     // Catch: java.lang.Throwable -> L34
                java.lang.Object r9 = r9.invoke(r0)     // Catch: java.lang.Throwable -> L34
                if (r9 != r1) goto L69
                return r1
            L82:
                java.lang.Object r2 = r8.f9750a
                if (r2 != 0) goto L89
                r8.f9750a = r9
                goto L69
            L89:
                kotlin.jvm.internal.m.b(r2)
                java.lang.Throwable r2 = (java.lang.Throwable) r2
                I1.a.a(r2, r9)
                goto L69
            L92:
                java.lang.Object r7 = r8.f9750a
                java.lang.Throwable r7 = (java.lang.Throwable) r7
                if (r7 != 0) goto L9b
                I1.u r7 = I1.u.f2419a
                return r7
            L9b:
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: p.AbstractC1054h.a.c(java.util.List, p.s, M1.d):java.lang.Object");
        }

        public final U1.p b(List migrations) {
            kotlin.jvm.internal.m.e(migrations, "migrations");
            return new C0155a(migrations, null);
        }
    }
}
