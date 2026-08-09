package e2;

import h2.A;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes.dex */
public final class m extends A {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final e f7169e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final /* synthetic */ AtomicReferenceArray f7170f;

    public m(long j3, m mVar, e eVar, int i3) {
        super(j3, mVar, i3);
        this.f7169e = eVar;
        this.f7170f = new AtomicReferenceArray(f.f7143b * 2);
    }

    private final void E(int i3, Object obj) {
        z().set(i3 * 2, obj);
    }

    private final /* synthetic */ AtomicReferenceArray z() {
        return this.f7170f;
    }

    public final Object A(int i3) {
        return z().get(i3 * 2);
    }

    public final Object B(int i3) {
        return z().get((i3 * 2) + 1);
    }

    public final void C(int i3, boolean z2) {
        if (z2) {
            y().a1((this.f7422c * ((long) f.f7143b)) + ((long) i3));
        }
        t();
    }

    public final Object D(int i3) {
        Object objA = A(i3);
        w(i3);
        return objA;
    }

    public final void F(int i3, Object obj) {
        z().set((i3 * 2) + 1, obj);
    }

    public final void G(int i3, Object obj) {
        E(i3, obj);
    }

    @Override // h2.A
    public int r() {
        return f.f7143b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0063, code lost:
    
        w(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0066, code lost:
    
        if (r0 == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0068, code lost:
    
        r4 = y().f7137b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x006e, code lost:
    
        if (r4 == null) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0070, code lost:
    
        h2.w.a(r4, r5, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0073, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:?, code lost:
    
        return;
     */
    @Override // h2.A
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void s(int r4, java.lang.Throwable r5, M1.g r6) {
        /*
            r3 = this;
            int r5 = e2.f.f7143b
            if (r4 < r5) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            if (r0 == 0) goto La
            int r4 = r4 - r5
        La:
            java.lang.Object r5 = r3.A(r4)
        Le:
            java.lang.Object r1 = r3.B(r4)
            boolean r2 = r1 instanceof c2.c1
            if (r2 != 0) goto L74
            boolean r2 = r1 instanceof e2.x
            if (r2 == 0) goto L1b
            goto L74
        L1b:
            h2.D r2 = e2.f.j()
            if (r1 == r2) goto L63
            h2.D r2 = e2.f.i()
            if (r1 != r2) goto L28
            goto L63
        L28:
            h2.D r2 = e2.f.p()
            if (r1 == r2) goto Le
            h2.D r2 = e2.f.q()
            if (r1 != r2) goto L35
            goto Le
        L35:
            h2.D r4 = e2.f.f()
            if (r1 == r4) goto L62
            h2.D r4 = e2.f.f7145d
            if (r1 != r4) goto L40
            goto L62
        L40:
            h2.D r4 = e2.f.z()
            if (r1 != r4) goto L47
            return
        L47:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "unexpected state: "
            r5.append(r6)
            r5.append(r1)
            java.lang.String r5 = r5.toString()
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L62:
            return
        L63:
            r3.w(r4)
            if (r0 == 0) goto L73
            e2.e r4 = r3.y()
            U1.l r4 = r4.f7137b
            if (r4 == 0) goto L73
            h2.w.a(r4, r5, r6)
        L73:
            return
        L74:
            if (r0 == 0) goto L7b
            h2.D r2 = e2.f.j()
            goto L7f
        L7b:
            h2.D r2 = e2.f.i()
        L7f:
            boolean r1 = r3.v(r4, r1, r2)
            if (r1 == 0) goto Le
            r3.w(r4)
            r1 = r0 ^ 1
            r3.C(r4, r1)
            if (r0 == 0) goto L9a
            e2.e r4 = r3.y()
            U1.l r4 = r4.f7137b
            if (r4 == 0) goto L9a
            h2.w.a(r4, r5, r6)
        L9a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e2.m.s(int, java.lang.Throwable, M1.g):void");
    }

    public final boolean v(int i3, Object obj, Object obj2) {
        return l.a(z(), (i3 * 2) + 1, obj, obj2);
    }

    public final void w(int i3) {
        E(i3, null);
    }

    public final Object x(int i3, Object obj) {
        return z().getAndSet((i3 * 2) + 1, obj);
    }

    public final e y() {
        e eVar = this.f7169e;
        kotlin.jvm.internal.m.b(eVar);
        return eVar;
    }
}
