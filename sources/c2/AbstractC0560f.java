package c2;

import J1.AbstractC0412p;

/* JADX INFO: renamed from: c2.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0560f {

    /* JADX INFO: renamed from: c2.f$a */
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f5135a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f5136b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f5137c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f5138d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f5139e;

        a(M1.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f5138d = obj;
            this.f5139e |= Integer.MIN_VALUE;
            return AbstractC0560f.c(null, this);
        }
    }

    /* JADX INFO: renamed from: c2.f$b */
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f5140a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f5141b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f5142c;

        b(M1.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f5141b = obj;
            this.f5142c |= Integer.MIN_VALUE;
            return AbstractC0560f.b(null, this);
        }
    }

    public static final Object a(V[] vArr, M1.d dVar) {
        return vArr.length == 0 ? AbstractC0412p.h() : new C0558e(vArr).c(dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(java.util.Collection r4, M1.d r5) throws java.lang.Throwable {
        /*
            boolean r0 = r5 instanceof c2.AbstractC0560f.b
            if (r0 == 0) goto L13
            r0 = r5
            c2.f$b r0 = (c2.AbstractC0560f.b) r0
            int r1 = r0.f5142c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5142c = r1
            goto L18
        L13:
            c2.f$b r0 = new c2.f$b
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f5141b
            java.lang.Object r1 = N1.b.e()
            int r2 = r0.f5142c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.f5140a
            java.util.Iterator r4 = (java.util.Iterator) r4
            I1.o.b(r5)
            goto L3c
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            I1.o.b(r5)
            java.util.Iterator r4 = r4.iterator()
        L3c:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L53
            java.lang.Object r5 = r4.next()
            c2.z0 r5 = (c2.InterfaceC0600z0) r5
            r0.f5140a = r4
            r0.f5142c = r3
            java.lang.Object r5 = r5.join(r0)
            if (r5 != r1) goto L3c
            return r1
        L53:
            I1.u r4 = I1.u.f2419a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: c2.AbstractC0560f.b(java.util.Collection, M1.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0052 -> B:19:0x0055). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(c2.InterfaceC0600z0[] r6, M1.d r7) throws java.lang.Throwable {
        /*
            boolean r0 = r7 instanceof c2.AbstractC0560f.a
            if (r0 == 0) goto L13
            r0 = r7
            c2.f$a r0 = (c2.AbstractC0560f.a) r0
            int r1 = r0.f5139e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5139e = r1
            goto L18
        L13:
            c2.f$a r0 = new c2.f$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f5138d
            java.lang.Object r1 = N1.b.e()
            int r2 = r0.f5139e
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            int r6 = r0.f5137c
            int r2 = r0.f5136b
            java.lang.Object r4 = r0.f5135a
            c2.z0[] r4 = (c2.InterfaceC0600z0[]) r4
            I1.o.b(r7)
            r7 = r4
            goto L55
        L32:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3a:
            I1.o.b(r7)
            int r7 = r6.length
            r2 = 0
            r5 = r7
            r7 = r6
            r6 = r5
        L42:
            if (r2 >= r6) goto L57
            r4 = r7[r2]
            r0.f5135a = r7
            r0.f5136b = r2
            r0.f5137c = r6
            r0.f5139e = r3
            java.lang.Object r4 = r4.join(r0)
            if (r4 != r1) goto L55
            return r1
        L55:
            int r2 = r2 + r3
            goto L42
        L57:
            I1.u r6 = I1.u.f2419a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: c2.AbstractC0560f.c(c2.z0[], M1.d):java.lang.Object");
    }
}
