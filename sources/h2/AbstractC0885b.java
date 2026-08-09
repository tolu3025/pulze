package h2;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: h2.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0885b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f7439a = AtomicReferenceFieldUpdater.newUpdater(AbstractC0885b.class, Object.class, "_next$volatile");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f7440b = AtomicReferenceFieldUpdater.newUpdater(AbstractC0885b.class, Object.class, "_prev$volatile");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    public AbstractC0885b(AbstractC0885b abstractC0885b) {
        this._prev$volatile = abstractC0885b;
    }

    private final AbstractC0885b d() {
        AbstractC0885b abstractC0885bH = h();
        while (abstractC0885bH != null && abstractC0885bH.k()) {
            abstractC0885bH = (AbstractC0885b) f7440b.get(abstractC0885bH);
        }
        return abstractC0885bH;
    }

    private final AbstractC0885b e() {
        AbstractC0885b abstractC0885bF = f();
        kotlin.jvm.internal.m.b(abstractC0885bF);
        while (abstractC0885bF.k()) {
            AbstractC0885b abstractC0885bF2 = abstractC0885bF.f();
            if (abstractC0885bF2 == null) {
                return abstractC0885bF;
            }
            abstractC0885bF = abstractC0885bF2;
        }
        return abstractC0885bF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object g() {
        return f7439a.get(this);
    }

    public final void c() {
        f7440b.set(this, null);
    }

    public final AbstractC0885b f() {
        Object objG = g();
        if (objG == AbstractC0884a.f7438a) {
            return null;
        }
        return (AbstractC0885b) objG;
    }

    public final AbstractC0885b h() {
        return (AbstractC0885b) f7440b.get(this);
    }

    public abstract boolean k();

    public final boolean l() {
        return f() == null;
    }

    public final boolean m() {
        return androidx.concurrent.futures.b.a(f7439a, this, null, AbstractC0884a.f7438a);
    }

    public final void n() {
        Object obj;
        if (l()) {
            return;
        }
        while (true) {
            AbstractC0885b abstractC0885bD = d();
            AbstractC0885b abstractC0885bE = e();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7440b;
            do {
                obj = atomicReferenceFieldUpdater.get(abstractC0885bE);
            } while (!androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, abstractC0885bE, obj, ((AbstractC0885b) obj) == null ? null : abstractC0885bD));
            if (abstractC0885bD != null) {
                f7439a.set(abstractC0885bD, abstractC0885bE);
            }
            if (!abstractC0885bE.k() || abstractC0885bE.l()) {
                if (abstractC0885bD == null || !abstractC0885bD.k()) {
                    return;
                }
            }
        }
    }

    public final boolean o(AbstractC0885b abstractC0885b) {
        return androidx.concurrent.futures.b.a(f7439a, this, null, abstractC0885b);
    }
}
