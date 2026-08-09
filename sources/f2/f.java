package f2;

import I1.u;
import e2.v;

/* JADX INFO: loaded from: classes.dex */
abstract /* synthetic */ class f {

    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f7249a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f7250b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f7251c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f7252d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f7253e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f7254f;

        a(M1.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f7253e = obj;
            this.f7254f |= Integer.MIN_VALUE;
            return f.c(null, null, false, this);
        }
    }

    public static final Object b(c cVar, v vVar, M1.d dVar) throws Throwable {
        Object objC = c(cVar, vVar, true, dVar);
        return objC == N1.d.e() ? objC : u.f2419a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0072 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007f A[Catch: all -> 0x003c, TRY_LEAVE, TryCatch #0 {all -> 0x003c, blocks: (B:13:0x0036, B:24:0x0062, B:28:0x0077, B:30:0x007f, B:20:0x0054, B:23:0x005e), top: B:42:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0091 -> B:14:0x0039). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(f2.c r6, e2.v r7, boolean r8, M1.d r9) throws java.lang.Throwable {
        /*
            boolean r0 = r9 instanceof f2.f.a
            if (r0 == 0) goto L13
            r0 = r9
            f2.f$a r0 = (f2.f.a) r0
            int r1 = r0.f7254f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f7254f = r1
            goto L18
        L13:
            f2.f$a r0 = new f2.f$a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f7253e
            java.lang.Object r1 = N1.b.e()
            int r2 = r0.f7254f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L58
            if (r2 == r4) goto L46
            if (r2 != r3) goto L3e
            boolean r8 = r0.f7252d
            java.lang.Object r6 = r0.f7251c
            e2.i r6 = (e2.i) r6
            java.lang.Object r7 = r0.f7250b
            e2.v r7 = (e2.v) r7
            java.lang.Object r2 = r0.f7249a
            f2.c r2 = (f2.c) r2
            I1.o.b(r9)     // Catch: java.lang.Throwable -> L3c
        L39:
            r9 = r6
            r6 = r2
            goto L62
        L3c:
            r6 = move-exception
            goto L9d
        L3e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L46:
            boolean r8 = r0.f7252d
            java.lang.Object r6 = r0.f7251c
            e2.i r6 = (e2.i) r6
            java.lang.Object r7 = r0.f7250b
            e2.v r7 = (e2.v) r7
            java.lang.Object r2 = r0.f7249a
            f2.c r2 = (f2.c) r2
            I1.o.b(r9)     // Catch: java.lang.Throwable -> L3c
            goto L77
        L58:
            I1.o.b(r9)
            f2.d.g(r6)
            e2.i r9 = r7.iterator()     // Catch: java.lang.Throwable -> L3c
        L62:
            r0.f7249a = r6     // Catch: java.lang.Throwable -> L3c
            r0.f7250b = r7     // Catch: java.lang.Throwable -> L3c
            r0.f7251c = r9     // Catch: java.lang.Throwable -> L3c
            r0.f7252d = r8     // Catch: java.lang.Throwable -> L3c
            r0.f7254f = r4     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r2 = r9.b(r0)     // Catch: java.lang.Throwable -> L3c
            if (r2 != r1) goto L73
            return r1
        L73:
            r5 = r2
            r2 = r6
            r6 = r9
            r9 = r5
        L77:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L3c
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L3c
            if (r9 == 0) goto L94
            java.lang.Object r9 = r6.next()     // Catch: java.lang.Throwable -> L3c
            r0.f7249a = r2     // Catch: java.lang.Throwable -> L3c
            r0.f7250b = r7     // Catch: java.lang.Throwable -> L3c
            r0.f7251c = r6     // Catch: java.lang.Throwable -> L3c
            r0.f7252d = r8     // Catch: java.lang.Throwable -> L3c
            r0.f7254f = r3     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r9 = r2.emit(r9, r0)     // Catch: java.lang.Throwable -> L3c
            if (r9 != r1) goto L39
            return r1
        L94:
            if (r8 == 0) goto L9a
            r6 = 0
            e2.n.a(r7, r6)
        L9a:
            I1.u r6 = I1.u.f2419a
            return r6
        L9d:
            throw r6     // Catch: java.lang.Throwable -> L9e
        L9e:
            r9 = move-exception
            if (r8 == 0) goto La4
            e2.n.a(r7, r6)
        La4:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: f2.f.c(f2.c, e2.v, boolean, M1.d):java.lang.Object");
    }
}
