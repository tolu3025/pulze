package h2;

/* JADX INFO: renamed from: h2.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0892i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final D f7449a = new D("UNDEFINED");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final D f7450b = new D("REUSABLE_CLAIMED");

    /* JADX WARN: Removed duplicated region for block: B:27:0x008e A[Catch: all -> 0x0067, DONT_GENERATE, TryCatch #0 {all -> 0x0067, blocks: (B:11:0x003e, B:13:0x004c, B:15:0x0052, B:28:0x0091, B:18:0x0069, B:20:0x0079, B:25:0x0088, B:27:0x008e, B:33:0x009e, B:36:0x00a7, B:35:0x00a4, B:23:0x007f), top: B:44:0x003e, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(M1.d r6, java.lang.Object r7) {
        /*
            boolean r0 = r6 instanceof h2.C0891h
            if (r0 == 0) goto Lb1
            h2.h r6 = (h2.C0891h) r6
            java.lang.Object r0 = c2.E.b(r7)
            c2.K r1 = r6.f7445d
            M1.g r2 = r6.getContext()
            boolean r1 = r1.V(r2)
            r2 = 1
            if (r1 == 0) goto L26
            r6.f7447f = r0
            r6.f5117c = r2
            c2.K r7 = r6.f7445d
            M1.g r0 = r6.getContext()
            r7.U(r0, r6)
            goto Lb4
        L26:
            c2.V0 r1 = c2.V0.f5110a
            c2.j0 r1 = r1.b()
            boolean r3 = r1.f0()
            if (r3 == 0) goto L3b
            r6.f7447f = r0
            r6.f5117c = r2
            r1.b0(r6)
            goto Lb4
        L3b:
            r1.d0(r2)
            M1.g r3 = r6.getContext()     // Catch: java.lang.Throwable -> L67
            c2.z0$b r4 = c2.InterfaceC0600z0.f5183i     // Catch: java.lang.Throwable -> L67
            M1.g$b r3 = r3.get(r4)     // Catch: java.lang.Throwable -> L67
            c2.z0 r3 = (c2.InterfaceC0600z0) r3     // Catch: java.lang.Throwable -> L67
            if (r3 == 0) goto L69
            boolean r4 = r3.isActive()     // Catch: java.lang.Throwable -> L67
            if (r4 != 0) goto L69
            java.util.concurrent.CancellationException r7 = r3.getCancellationException()     // Catch: java.lang.Throwable -> L67
            r6.d(r0, r7)     // Catch: java.lang.Throwable -> L67
            I1.n$a r0 = I1.n.f2411b     // Catch: java.lang.Throwable -> L67
            java.lang.Object r7 = I1.o.a(r7)     // Catch: java.lang.Throwable -> L67
            java.lang.Object r7 = I1.n.b(r7)     // Catch: java.lang.Throwable -> L67
            r6.resumeWith(r7)     // Catch: java.lang.Throwable -> L67
            goto L91
        L67:
            r7 = move-exception
            goto La8
        L69:
            M1.d r0 = r6.f7446e     // Catch: java.lang.Throwable -> L67
            java.lang.Object r3 = r6.f7448l     // Catch: java.lang.Throwable -> L67
            M1.g r4 = r0.getContext()     // Catch: java.lang.Throwable -> L67
            java.lang.Object r3 = h2.K.i(r4, r3)     // Catch: java.lang.Throwable -> L67
            h2.D r5 = h2.K.f7428a     // Catch: java.lang.Throwable -> L67
            if (r3 == r5) goto L7e
            c2.a1 r0 = c2.I.m(r0, r4, r3)     // Catch: java.lang.Throwable -> L67
            goto L7f
        L7e:
            r0 = 0
        L7f:
            M1.d r5 = r6.f7446e     // Catch: java.lang.Throwable -> L9b
            r5.resumeWith(r7)     // Catch: java.lang.Throwable -> L9b
            I1.u r7 = I1.u.f2419a     // Catch: java.lang.Throwable -> L9b
            if (r0 == 0) goto L8e
            boolean r7 = r0.M0()     // Catch: java.lang.Throwable -> L67
            if (r7 == 0) goto L91
        L8e:
            h2.K.f(r4, r3)     // Catch: java.lang.Throwable -> L67
        L91:
            boolean r7 = r1.i0()     // Catch: java.lang.Throwable -> L67
            if (r7 != 0) goto L91
        L97:
            r1.Y(r2)
            goto Lb4
        L9b:
            r7 = move-exception
            if (r0 == 0) goto La4
            boolean r0 = r0.M0()     // Catch: java.lang.Throwable -> L67
            if (r0 == 0) goto La7
        La4:
            h2.K.f(r4, r3)     // Catch: java.lang.Throwable -> L67
        La7:
            throw r7     // Catch: java.lang.Throwable -> L67
        La8:
            r6.i(r7)     // Catch: java.lang.Throwable -> Lac
            goto L97
        Lac:
            r6 = move-exception
            r1.Y(r2)
            throw r6
        Lb1:
            r6.resumeWith(r7)
        Lb4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h2.AbstractC0892i.b(M1.d, java.lang.Object):void");
    }
}
