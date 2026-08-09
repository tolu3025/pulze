package h2;

import c2.S;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: h2.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0898o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f7461a = AtomicReferenceFieldUpdater.newUpdater(C0898o.class, Object.class, "_next$volatile");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f7462b = AtomicReferenceFieldUpdater.newUpdater(C0898o.class, Object.class, "_prev$volatile");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f7463c = AtomicReferenceFieldUpdater.newUpdater(C0898o.class, Object.class, "_removedRef$volatile");
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    /* JADX WARN: Code restructure failed: missing block: B:19:0x003f, code lost:
    
        if (androidx.concurrent.futures.b.a(h2.C0898o.f7461a, r3, r2, ((h2.x) r4).f7479a) != false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final h2.C0898o g() {
        /*
            r7 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = o()
            java.lang.Object r0 = r0.get(r7)
            h2.o r0 = (h2.C0898o) r0
            r1 = 0
            r2 = r0
        Lc:
            r3 = r1
        Ld:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = n()
            java.lang.Object r4 = r4.get(r2)
            if (r4 != r7) goto L26
            if (r0 != r2) goto L1a
            return r2
        L1a:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = o()
            boolean r0 = androidx.concurrent.futures.b.a(r1, r7, r0, r2)
            if (r0 != 0) goto L25
            goto L0
        L25:
            return r2
        L26:
            boolean r5 = r7.q()
            if (r5 == 0) goto L2d
            return r1
        L2d:
            boolean r5 = r4 instanceof h2.x
            if (r5 == 0) goto L4f
            if (r3 == 0) goto L44
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = n()
            h2.x r4 = (h2.x) r4
            h2.o r4 = r4.f7479a
            boolean r2 = androidx.concurrent.futures.b.a(r5, r3, r2, r4)
            if (r2 != 0) goto L42
            goto L0
        L42:
            r2 = r3
            goto Lc
        L44:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = o()
            java.lang.Object r2 = r4.get(r2)
            h2.o r2 = (h2.C0898o) r2
            goto Ld
        L4f:
            java.lang.String r3 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode"
            kotlin.jvm.internal.m.c(r4, r3)
            r3 = r4
            h2.o r3 = (h2.C0898o) r3
            r6 = r3
            r3 = r2
            r2 = r6
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: h2.C0898o.g():h2.o");
    }

    private final C0898o i(C0898o c0898o) {
        while (c0898o.q()) {
            c0898o = (C0898o) f7462b.get(c0898o);
        }
        return c0898o;
    }

    private final void j(C0898o c0898o) {
        C0898o c0898o2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7462b;
        do {
            c0898o2 = (C0898o) atomicReferenceFieldUpdater.get(c0898o);
            if (k() != c0898o) {
                return;
            }
        } while (!androidx.concurrent.futures.b.a(f7462b, c0898o, c0898o2, this));
        if (q()) {
            c0898o.g();
        }
    }

    private final x t() {
        x xVar = (x) f7463c.get(this);
        if (xVar != null) {
            return xVar;
        }
        x xVar2 = new x(this);
        f7463c.set(this, xVar2);
        return xVar2;
    }

    public final boolean b(C0898o c0898o, int i3) {
        C0898o c0898oM;
        do {
            c0898oM = m();
            if (c0898oM instanceof C0896m) {
                return (((C0896m) c0898oM).f7460d & i3) == 0 && c0898oM.b(c0898o, i3);
            }
        } while (!c0898oM.c(c0898o, this));
        return true;
    }

    public final boolean c(C0898o c0898o, C0898o c0898o2) {
        f7462b.set(c0898o, this);
        f7461a.set(c0898o, c0898o2);
        if (!androidx.concurrent.futures.b.a(f7461a, this, c0898o2, c0898o)) {
            return false;
        }
        c0898o.j(c0898o2);
        return true;
    }

    public final boolean d(C0898o c0898o) {
        f7462b.set(c0898o, this);
        f7461a.set(c0898o, this);
        while (k() == this) {
            if (androidx.concurrent.futures.b.a(f7461a, this, this, c0898o)) {
                c0898o.j(this);
                return true;
            }
        }
        return false;
    }

    public final void f(int i3) {
        b(new C0896m(i3), i3);
    }

    public final Object k() {
        return f7461a.get(this);
    }

    public final C0898o l() {
        C0898o c0898o;
        Object objK = k();
        x xVar = objK instanceof x ? (x) objK : null;
        if (xVar != null && (c0898o = xVar.f7479a) != null) {
            return c0898o;
        }
        kotlin.jvm.internal.m.c(objK, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        return (C0898o) objK;
    }

    public final C0898o m() {
        C0898o c0898oG = g();
        return c0898oG == null ? i((C0898o) f7462b.get(this)) : c0898oG;
    }

    public boolean q() {
        return k() instanceof x;
    }

    public boolean r() {
        return s() == null;
    }

    public final C0898o s() {
        Object objK;
        C0898o c0898o;
        do {
            objK = k();
            if (objK instanceof x) {
                return ((x) objK).f7479a;
            }
            if (objK == this) {
                return (C0898o) objK;
            }
            kotlin.jvm.internal.m.c(objK, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
            c0898o = (C0898o) objK;
        } while (!androidx.concurrent.futures.b.a(f7461a, this, objK, c0898o.t()));
        c0898o.g();
        return null;
    }

    public String toString() {
        return new kotlin.jvm.internal.q(this) { // from class: h2.o.a
            @Override // Z1.f
            public Object get() {
                return S.a(this.receiver);
            }
        } + '@' + S.b(this);
    }
}
