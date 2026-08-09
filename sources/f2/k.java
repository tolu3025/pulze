package f2;

import kotlin.jvm.internal.y;

/* JADX INFO: loaded from: classes.dex */
abstract /* synthetic */ class k {

    public static final class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ y f7296a;

        public a(y yVar) {
            this.f7296a = yVar;
        }

        @Override // f2.c
        public Object emit(Object obj, M1.d dVar) {
            this.f7296a.f9750a = obj;
            throw new g2.a(this);
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f7297a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f7298b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f7299c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f7300d;

        b(M1.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f7299c = obj;
            this.f7300d |= Integer.MIN_VALUE;
            return d.h(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(f2.b r4, M1.d r5) throws java.lang.Throwable {
        /*
            boolean r0 = r5 instanceof f2.k.b
            if (r0 == 0) goto L13
            r0 = r5
            f2.k$b r0 = (f2.k.b) r0
            int r1 = r0.f7300d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f7300d = r1
            goto L18
        L13:
            f2.k$b r0 = new f2.k$b
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f7299c
            java.lang.Object r1 = N1.b.e()
            int r2 = r0.f7300d
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r4 = r0.f7298b
            f2.k$a r4 = (f2.k.a) r4
            java.lang.Object r0 = r0.f7297a
            kotlin.jvm.internal.y r0 = (kotlin.jvm.internal.y) r0
            I1.o.b(r5)     // Catch: g2.a -> L31
            goto L5e
        L31:
            r5 = move-exception
            goto L5b
        L33:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3b:
            I1.o.b(r5)
            kotlin.jvm.internal.y r5 = new kotlin.jvm.internal.y
            r5.<init>()
            f2.k$a r2 = new f2.k$a
            r2.<init>(r5)
            r0.f7297a = r5     // Catch: g2.a -> L57
            r0.f7298b = r2     // Catch: g2.a -> L57
            r0.f7300d = r3     // Catch: g2.a -> L57
            java.lang.Object r4 = r4.a(r2, r0)     // Catch: g2.a -> L57
            if (r4 != r1) goto L55
            return r1
        L55:
            r0 = r5
            goto L5e
        L57:
            r4 = move-exception
            r0 = r5
            r5 = r4
            r4 = r2
        L5b:
            g2.j.a(r5, r4)
        L5e:
            java.lang.Object r4 = r0.f9750a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: f2.k.a(f2.b, M1.d):java.lang.Object");
    }
}
