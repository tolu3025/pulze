package p;

import c2.AbstractC0570k;
import c2.InterfaceC0600z0;
import c2.N;
import com.google.android.gms.common.api.a;
import e2.k;

/* JADX INFO: loaded from: classes.dex */
public final class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final N f9971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final U1.p f9972b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e2.g f9973c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C1048b f9974d;

    static final class a extends kotlin.jvm.internal.n implements U1.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ U1.l f9975a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ B f9976b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ U1.p f9977c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(U1.l lVar, B b3, U1.p pVar) {
            super(1);
            this.f9975a = lVar;
            this.f9976b = b3;
            this.f9977c = pVar;
        }

        public final void b(Throwable th) {
            I1.u uVar;
            this.f9975a.invoke(th);
            this.f9976b.f9973c.a(th);
            do {
                Object objD = e2.k.d(this.f9976b.f9973c.i());
                if (objD != null) {
                    this.f9977c.invoke(objD, th);
                    uVar = I1.u.f2419a;
                } else {
                    uVar = null;
                }
            } while (uVar != null);
        }

        @Override // U1.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((Throwable) obj);
            return I1.u.f2419a;
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.l implements U1.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f9978a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f9979b;

        b(M1.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final M1.d create(Object obj, M1.d dVar) {
            return B.this.new b(dVar);
        }

        @Override // U1.p
        public final Object invoke(N n3, M1.d dVar) {
            return ((b) create(n3, dVar)).invokeSuspend(I1.u.f2419a);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0050 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:17:0x005c A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0069  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x005a -> B:18:0x005d). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = N1.b.e()
                int r1 = r5.f9979b
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                I1.o.b(r6)
                goto L5d
            L12:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1a:
                java.lang.Object r1 = r5.f9978a
                U1.p r1 = (U1.p) r1
                I1.o.b(r6)
                goto L51
            L22:
                I1.o.b(r6)
                p.B r6 = p.B.this
                p.b r6 = p.B.c(r6)
                int r6 = r6.b()
                if (r6 <= 0) goto L6c
            L31:
                p.B r6 = p.B.this
                c2.N r6 = p.B.d(r6)
                c2.O.d(r6)
                p.B r6 = p.B.this
                U1.p r1 = p.B.a(r6)
                p.B r6 = p.B.this
                e2.g r6 = p.B.b(r6)
                r5.f9978a = r1
                r5.f9979b = r3
                java.lang.Object r6 = r6.d(r5)
                if (r6 != r0) goto L51
                return r0
            L51:
                r4 = 0
                r5.f9978a = r4
                r5.f9979b = r2
                java.lang.Object r6 = r1.invoke(r6, r5)
                if (r6 != r0) goto L5d
                return r0
            L5d:
                p.B r6 = p.B.this
                p.b r6 = p.B.c(r6)
                int r6 = r6.a()
                if (r6 != 0) goto L31
                I1.u r6 = I1.u.f2419a
                return r6
            L6c:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "Check failed."
                java.lang.String r0 = r0.toString()
                r6.<init>(r0)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: p.B.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public B(N scope, U1.l onComplete, U1.p onUndeliveredElement, U1.p consumeMessage) {
        kotlin.jvm.internal.m.e(scope, "scope");
        kotlin.jvm.internal.m.e(onComplete, "onComplete");
        kotlin.jvm.internal.m.e(onUndeliveredElement, "onUndeliveredElement");
        kotlin.jvm.internal.m.e(consumeMessage, "consumeMessage");
        this.f9971a = scope;
        this.f9972b = consumeMessage;
        this.f9973c = e2.j.b(a.e.API_PRIORITY_OTHER, null, null, 6, null);
        this.f9974d = new C1048b(0);
        InterfaceC0600z0 interfaceC0600z0 = (InterfaceC0600z0) scope.e().get(InterfaceC0600z0.f5183i);
        if (interfaceC0600z0 != null) {
            interfaceC0600z0.invokeOnCompletion(new a(onComplete, this, onUndeliveredElement));
        }
    }

    public final void e(Object obj) throws Throwable {
        Object objJ = this.f9973c.j(obj);
        if (objJ instanceof k.a) {
            Throwable thC = e2.k.c(objJ);
            if (thC != null) {
                throw thC;
            }
            throw new e2.q("Channel was closed normally");
        }
        if (!e2.k.f(objJ)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (this.f9974d.c() == 0) {
            AbstractC0570k.d(this.f9971a, null, null, new b(null), 3, null);
        }
    }
}
