package p;

import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public class n implements y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final File f10180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC1046A f10181b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f10182c;

    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f10183a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f10184b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f10185c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f10187e;

        a(M1.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f10185c = obj;
            this.f10187e |= Integer.MIN_VALUE;
            return n.i(n.this, this);
        }
    }

    public n(File file, InterfaceC1046A serializer) {
        kotlin.jvm.internal.m.e(file, "file");
        kotlin.jvm.internal.m.e(serializer, "serializer");
        this.f10180a = file;
        this.f10181b = serializer;
        this.f10182c = new AtomicBoolean(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v11, types: [p.n] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, p.n] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [p.n] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static /* synthetic */ java.lang.Object i(p.n r7, M1.d r8) throws java.lang.Throwable {
        /*
            boolean r0 = r8 instanceof p.n.a
            if (r0 == 0) goto L13
            r0 = r8
            p.n$a r0 = (p.n.a) r0
            int r1 = r0.f10187e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10187e = r1
            goto L18
        L13:
            p.n$a r0 = new p.n$a
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f10185c
            java.lang.Object r1 = N1.b.e()
            int r2 = r0.f10187e
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L4b
            if (r2 == r4) goto L3d
            if (r2 != r3) goto L35
            java.lang.Object r7 = r0.f10183a
            java.io.Closeable r7 = (java.io.Closeable) r7
            I1.o.b(r8)     // Catch: java.lang.Throwable -> L32
            goto L9d
        L32:
            r8 = move-exception
            goto La5
        L35:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3d:
            java.lang.Object r7 = r0.f10184b
            java.io.Closeable r7 = (java.io.Closeable) r7
            java.lang.Object r2 = r0.f10183a
            p.n r2 = (p.n) r2
            I1.o.b(r8)     // Catch: java.lang.Throwable -> L49
            goto L6b
        L49:
            r8 = move-exception
            goto L76
        L4b:
            I1.o.b(r8)
            r7.f()
            java.io.FileInputStream r8 = new java.io.FileInputStream     // Catch: java.io.FileNotFoundException -> L7c
            java.io.File r2 = r7.f10180a     // Catch: java.io.FileNotFoundException -> L7c
            r8.<init>(r2)     // Catch: java.io.FileNotFoundException -> L7c
            p.A r2 = r7.f10181b     // Catch: java.lang.Throwable -> L71
            r0.f10183a = r7     // Catch: java.lang.Throwable -> L71
            r0.f10184b = r8     // Catch: java.lang.Throwable -> L71
            r0.f10187e = r4     // Catch: java.lang.Throwable -> L71
            java.lang.Object r2 = r2.a(r8, r0)     // Catch: java.lang.Throwable -> L71
            if (r2 != r1) goto L67
            return r1
        L67:
            r6 = r2
            r2 = r7
            r7 = r8
            r8 = r6
        L6b:
            S1.b.a(r7, r5)     // Catch: java.io.FileNotFoundException -> L6f
            goto Lb1
        L6f:
            r7 = r2
            goto L7c
        L71:
            r2 = move-exception
            r6 = r2
            r2 = r7
            r7 = r8
            r8 = r6
        L76:
            throw r8     // Catch: java.lang.Throwable -> L77
        L77:
            r4 = move-exception
            S1.b.a(r7, r8)     // Catch: java.io.FileNotFoundException -> L6f
            throw r4     // Catch: java.io.FileNotFoundException -> L6f
        L7c:
            java.io.File r8 = r7.f10180a
            boolean r8 = r8.exists()
            if (r8 == 0) goto Lab
            java.io.FileInputStream r8 = new java.io.FileInputStream
            java.io.File r2 = r7.f10180a
            r8.<init>(r2)
            p.A r7 = r7.f10181b     // Catch: java.lang.Throwable -> La1
            r0.f10183a = r8     // Catch: java.lang.Throwable -> La1
            r0.f10184b = r5     // Catch: java.lang.Throwable -> La1
            r0.f10187e = r3     // Catch: java.lang.Throwable -> La1
            java.lang.Object r7 = r7.a(r8, r0)     // Catch: java.lang.Throwable -> La1
            if (r7 != r1) goto L9a
            return r1
        L9a:
            r6 = r8
            r8 = r7
            r7 = r6
        L9d:
            S1.b.a(r7, r5)
            return r8
        La1:
            r7 = move-exception
            r6 = r8
            r8 = r7
            r7 = r6
        La5:
            throw r8     // Catch: java.lang.Throwable -> La6
        La6:
            r0 = move-exception
            S1.b.a(r7, r8)
            throw r0
        Lab:
            p.A r7 = r7.f10181b
            java.lang.Object r8 = r7.b()
        Lb1:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p.n.i(p.n, M1.d):java.lang.Object");
    }

    @Override // p.y
    public Object c(M1.d dVar) {
        return i(this, dVar);
    }

    @Override // p.InterfaceC1049c
    public void close() {
        this.f10182c.set(true);
    }

    protected final void f() {
        if (!(!this.f10182c.get())) {
            throw new IllegalStateException("This scope has already been closed.".toString());
        }
    }

    protected final File g() {
        return this.f10180a;
    }

    protected final InterfaceC1046A h() {
        return this.f10181b;
    }
}
