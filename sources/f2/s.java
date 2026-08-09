package f2;

import I1.n;
import I1.u;
import c2.C0580p;
import com.google.android.gms.common.api.internal.m0;
import h2.AbstractC0886c;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
final class s extends g2.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicReference f7315a = new AtomicReference(null);

    @Override // g2.d
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(q qVar) {
        if (AbstractC0886c.a(this.f7315a) != null) {
            return false;
        }
        AbstractC0886c.b(this.f7315a, r.f7313a);
        return true;
    }

    public final Object e(M1.d dVar) {
        C0580p c0580p = new C0580p(N1.c.c(dVar), 1);
        c0580p.F();
        if (!m0.a(this.f7315a, r.f7313a, c0580p)) {
            n.a aVar = I1.n.f2411b;
            c0580p.resumeWith(I1.n.b(u.f2419a));
        }
        Object objZ = c0580p.z();
        if (objZ == N1.d.e()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return objZ == N1.d.e() ? objZ : u.f2419a;
    }

    @Override // g2.d
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public M1.d[] b(q qVar) {
        AbstractC0886c.b(this.f7315a, null);
        return g2.c.f7348a;
    }

    public final void g() {
        AtomicReference atomicReference = this.f7315a;
        while (true) {
            Object objA = AbstractC0886c.a(atomicReference);
            if (objA == null || objA == r.f7314b) {
                return;
            }
            if (objA == r.f7313a) {
                if (m0.a(this.f7315a, objA, r.f7314b)) {
                    return;
                }
            } else if (m0.a(this.f7315a, objA, r.f7313a)) {
                n.a aVar = I1.n.f2411b;
                ((C0580p) objA).resumeWith(I1.n.b(u.f2419a));
                return;
            }
        }
    }

    public final boolean h() {
        Object andSet = this.f7315a.getAndSet(r.f7313a);
        kotlin.jvm.internal.m.b(andSet);
        return andSet == r.f7314b;
    }
}
