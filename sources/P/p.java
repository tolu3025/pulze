package p;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class p implements F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final File f10196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC1046A f10197b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final t f10198c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final U1.a f10199d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AtomicBoolean f10200e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final l2.a f10201f;

    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f10202a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f10203b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f10204c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f10205d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f10207f;

        a(M1.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f10205d = obj;
            this.f10207f |= Integer.MIN_VALUE;
            return p.this.b(null, this);
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f10208a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f10209b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f10210c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f10211d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f10212e;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f10214l;

        b(M1.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f10212e = obj;
            this.f10214l |= Integer.MIN_VALUE;
            return p.this.e(null, this);
        }
    }

    public p(File file, InterfaceC1046A serializer, t coordinator, U1.a onClose) {
        kotlin.jvm.internal.m.e(file, "file");
        kotlin.jvm.internal.m.e(serializer, "serializer");
        kotlin.jvm.internal.m.e(coordinator, "coordinator");
        kotlin.jvm.internal.m.e(onClose, "onClose");
        this.f10196a = file;
        this.f10197b = serializer;
        this.f10198c = coordinator;
        this.f10199d = onClose;
        this.f10200e = new AtomicBoolean(false);
        this.f10201f = l2.g.b(false, 1, null);
    }

    private final void f() {
        if (!(!this.f10200e.get())) {
            throw new IllegalStateException("StorageConnection has already been disposed.".toString());
        }
    }

    private final void g(File file) throws IOException {
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
            if (parentFile.isDirectory()) {
                return;
            }
            throw new IOException("Unable to create parent directories of " + file);
        }
    }

    @Override // p.F
    public t a() {
        return this.f10198c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007b A[Catch: all -> 0x007c, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x007c, blocks: (B:31:0x007b, B:40:0x008c, B:39:0x0089, B:36:0x0084), top: B:52:0x0022, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r0v11, types: [p.p] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, p.p$a] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [p.p] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [p.p] */
    /* JADX WARN: Type inference failed for: r9v0, types: [U1.q] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v9 */
    @Override // p.F
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object b(U1.q r9, M1.d r10) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r10 instanceof p.p.a
            if (r0 == 0) goto L13
            r0 = r10
            p.p$a r0 = (p.p.a) r0
            int r1 = r0.f10207f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10207f = r1
            goto L18
        L13:
            p.p$a r0 = new p.p$a
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f10205d
            java.lang.Object r1 = N1.b.e()
            int r2 = r0.f10207f
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3e
            if (r2 != r3) goto L36
            boolean r9 = r0.f10204c
            java.lang.Object r1 = r0.f10203b
            p.c r1 = (p.InterfaceC1049c) r1
            java.lang.Object r0 = r0.f10202a
            p.p r0 = (p.p) r0
            I1.o.b(r10)     // Catch: java.lang.Throwable -> L34
            goto L6b
        L34:
            r10 = move-exception
            goto L84
        L36:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3e:
            I1.o.b(r10)
            r8.f()
            l2.a r10 = r8.f10201f
            boolean r10 = l2.a.C0149a.a(r10, r4, r3, r4)
            p.n r2 = new p.n     // Catch: java.lang.Throwable -> L8d
            java.io.File r5 = r8.f10196a     // Catch: java.lang.Throwable -> L8d
            p.A r6 = r8.f10197b     // Catch: java.lang.Throwable -> L8d
            r2.<init>(r5, r6)     // Catch: java.lang.Throwable -> L8d
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.b.a(r10)     // Catch: java.lang.Throwable -> L7e
            r0.f10202a = r8     // Catch: java.lang.Throwable -> L7e
            r0.f10203b = r2     // Catch: java.lang.Throwable -> L7e
            r0.f10204c = r10     // Catch: java.lang.Throwable -> L7e
            r0.f10207f = r3     // Catch: java.lang.Throwable -> L7e
            java.lang.Object r9 = r9.e(r2, r5, r0)     // Catch: java.lang.Throwable -> L7e
            if (r9 != r1) goto L66
            return r1
        L66:
            r0 = r8
            r1 = r2
            r7 = r10
            r10 = r9
            r9 = r7
        L6b:
            r1.close()     // Catch: java.lang.Throwable -> L70
            r1 = r4
            goto L71
        L70:
            r1 = move-exception
        L71:
            if (r1 != 0) goto L7b
            if (r9 == 0) goto L7a
            l2.a r9 = r0.f10201f
            l2.a.C0149a.b(r9, r4, r3, r4)
        L7a:
            return r10
        L7b:
            throw r1     // Catch: java.lang.Throwable -> L7c
        L7c:
            r10 = move-exception
            goto L92
        L7e:
            r9 = move-exception
            r0 = r8
            r1 = r2
            r7 = r10
            r10 = r9
            r9 = r7
        L84:
            r1.close()     // Catch: java.lang.Throwable -> L88
            goto L8c
        L88:
            r1 = move-exception
            I1.a.a(r10, r1)     // Catch: java.lang.Throwable -> L7c
        L8c:
            throw r10     // Catch: java.lang.Throwable -> L7c
        L8d:
            r9 = move-exception
            r0 = r8
            r7 = r10
            r10 = r9
            r9 = r7
        L92:
            if (r9 == 0) goto L99
            l2.a r9 = r0.f10201f
            l2.a.C0149a.b(r9, r4, r3, r4)
        L99:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p.p.b(U1.q, M1.d):java.lang.Object");
    }

    @Override // p.InterfaceC1049c
    public void close() {
        this.f10200e.set(true);
        this.f10199d.invoke();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00bb A[Catch: all -> 0x00f0, IOException -> 0x00f2, TRY_ENTER, TryCatch #0 {all -> 0x00f0, blocks: (B:35:0x00bb, B:37:0x00c1, B:40:0x00ca, B:41:0x00ef, B:46:0x00f5, B:49:0x00fd, B:58:0x010c, B:60:0x0112, B:61:0x0115, B:56:0x010a, B:55:0x0107, B:24:0x007a, B:25:0x0096), top: B:64:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00fd A[Catch: all -> 0x00f0, IOException -> 0x00f2, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x00f0, blocks: (B:35:0x00bb, B:37:0x00c1, B:40:0x00ca, B:41:0x00ef, B:46:0x00f5, B:49:0x00fd, B:58:0x010c, B:60:0x0112, B:61:0x0115, B:56:0x010a, B:55:0x0107, B:24:0x007a, B:25:0x0096), top: B:64:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int, l2.a] */
    @Override // p.F
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object e(U1.p r10, M1.d r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 282
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.p.e(U1.p, M1.d):java.lang.Object");
    }
}
