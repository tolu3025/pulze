package h2;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public class M {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f7432b = AtomicIntegerFieldUpdater.newUpdater(M.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private N[] f7433a;

    private final N[] g() {
        N[] nArr = this.f7433a;
        if (nArr == null) {
            N[] nArr2 = new N[4];
            this.f7433a = nArr2;
            return nArr2;
        }
        if (c() < nArr.length) {
            return nArr;
        }
        Object[] objArrCopyOf = Arrays.copyOf(nArr, c() * 2);
        kotlin.jvm.internal.m.d(objArrCopyOf, "copyOf(...)");
        N[] nArr3 = (N[]) objArrCopyOf;
        this.f7433a = nArr3;
        return nArr3;
    }

    private final void k(int i3) {
        f7432b.set(this, i3);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void l(int r6) {
        /*
            r5 = this;
        L0:
            int r0 = r6 * 2
            int r1 = r0 + 1
            int r2 = r5.c()
            if (r1 < r2) goto Lb
            return
        Lb:
            h2.N[] r2 = r5.f7433a
            kotlin.jvm.internal.m.b(r2)
            int r0 = r0 + 2
            int r3 = r5.c()
            if (r0 >= r3) goto L2b
            r3 = r2[r0]
            kotlin.jvm.internal.m.b(r3)
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            r4 = r2[r1]
            kotlin.jvm.internal.m.b(r4)
            int r3 = r3.compareTo(r4)
            if (r3 >= 0) goto L2b
            goto L2c
        L2b:
            r0 = r1
        L2c:
            r1 = r2[r6]
            kotlin.jvm.internal.m.b(r1)
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            r2 = r2[r0]
            kotlin.jvm.internal.m.b(r2)
            int r1 = r1.compareTo(r2)
            if (r1 > 0) goto L3f
            return
        L3f:
            r5.n(r6, r0)
            r6 = r0
            goto L0
        */
        throw new UnsupportedOperationException("Method not decompiled: h2.M.l(int):void");
    }

    private final void m(int i3) {
        while (i3 > 0) {
            N[] nArr = this.f7433a;
            kotlin.jvm.internal.m.b(nArr);
            int i4 = (i3 - 1) / 2;
            N n3 = nArr[i4];
            kotlin.jvm.internal.m.b(n3);
            N n4 = nArr[i3];
            kotlin.jvm.internal.m.b(n4);
            if (((Comparable) n3).compareTo(n4) <= 0) {
                return;
            }
            n(i3, i4);
            i3 = i4;
        }
    }

    private final void n(int i3, int i4) {
        N[] nArr = this.f7433a;
        kotlin.jvm.internal.m.b(nArr);
        N n3 = nArr[i4];
        kotlin.jvm.internal.m.b(n3);
        N n4 = nArr[i3];
        kotlin.jvm.internal.m.b(n4);
        nArr[i3] = n3;
        nArr[i4] = n4;
        n3.c(i3);
        n4.c(i4);
    }

    public final void a(N n3) {
        n3.j(this);
        N[] nArrG = g();
        int iC = c();
        k(iC + 1);
        nArrG[iC] = n3;
        n3.c(iC);
        m(iC);
    }

    public final N b() {
        N[] nArr = this.f7433a;
        if (nArr != null) {
            return nArr[0];
        }
        return null;
    }

    public final int c() {
        return f7432b.get(this);
    }

    public final boolean e() {
        return c() == 0;
    }

    public final N f() {
        N nB;
        synchronized (this) {
            nB = b();
        }
        return nB;
    }

    public final boolean h(N n3) {
        boolean z2;
        synchronized (this) {
            if (n3.i() == null) {
                z2 = false;
            } else {
                i(n3.g());
                z2 = true;
            }
        }
        return z2;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final h2.N i(int r6) {
        /*
            r5 = this;
            h2.N[] r0 = r5.f7433a
            kotlin.jvm.internal.m.b(r0)
            int r1 = r5.c()
            r2 = -1
            int r1 = r1 + r2
            r5.k(r1)
            int r1 = r5.c()
            if (r6 >= r1) goto L3d
            int r1 = r5.c()
            r5.n(r6, r1)
            int r1 = r6 + (-1)
            int r1 = r1 / 2
            if (r6 <= 0) goto L3a
            r3 = r0[r6]
            kotlin.jvm.internal.m.b(r3)
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            r4 = r0[r1]
            kotlin.jvm.internal.m.b(r4)
            int r3 = r3.compareTo(r4)
            if (r3 >= 0) goto L3a
            r5.n(r6, r1)
            r5.m(r1)
            goto L3d
        L3a:
            r5.l(r6)
        L3d:
            int r6 = r5.c()
            r6 = r0[r6]
            kotlin.jvm.internal.m.b(r6)
            r1 = 0
            r6.j(r1)
            r6.c(r2)
            int r2 = r5.c()
            r0[r2] = r1
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: h2.M.i(int):h2.N");
    }

    public final N j() {
        N nI;
        synchronized (this) {
            nI = c() > 0 ? i(0) : null;
        }
        return nI;
    }
}
