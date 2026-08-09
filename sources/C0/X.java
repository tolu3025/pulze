package C0;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
class X implements InterfaceC0277q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private C0279r0 f919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C0244f0 f920b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Set f921c;

    X(C0244f0 c0244f0) {
        this.f920b = c0244f0;
    }

    private boolean b(D0.l lVar) {
        if (this.f920b.i().k(lVar) || c(lVar)) {
            return true;
        }
        C0279r0 c0279r0 = this.f919a;
        return c0279r0 != null && c0279r0.c(lVar);
    }

    private boolean c(D0.l lVar) {
        Iterator it = this.f920b.r().iterator();
        while (it.hasNext()) {
            if (((C0238d0) it.next()).l(lVar)) {
                return true;
            }
        }
        return false;
    }

    @Override // C0.InterfaceC0277q0
    public void a(R1 r12) {
        C0250h0 c0250h0I = this.f920b.i();
        Iterator it = c0250h0I.b(r12.h()).iterator();
        while (it.hasNext()) {
            this.f921c.add((D0.l) it.next());
        }
        c0250h0I.q(r12);
    }

    @Override // C0.InterfaceC0277q0
    public void d(D0.l lVar) {
        this.f921c.add(lVar);
    }

    @Override // C0.InterfaceC0277q0
    public void f(D0.l lVar) {
        this.f921c.add(lVar);
    }

    @Override // C0.InterfaceC0277q0
    public void g(D0.l lVar) {
        this.f921c.remove(lVar);
    }

    @Override // C0.InterfaceC0277q0
    public void h() {
        C0247g0 c0247g0H = this.f920b.h();
        ArrayList arrayList = new ArrayList();
        for (D0.l lVar : this.f921c) {
            if (!b(lVar)) {
                arrayList.add(lVar);
            }
        }
        c0247g0H.removeAll(arrayList);
        this.f921c = null;
    }

    @Override // C0.InterfaceC0277q0
    public void i(D0.l lVar) {
        if (b(lVar)) {
            this.f921c.remove(lVar);
        } else {
            this.f921c.add(lVar);
        }
    }

    @Override // C0.InterfaceC0277q0
    public void k() {
        this.f921c = new HashSet();
    }

    @Override // C0.InterfaceC0277q0
    public long o() {
        return -1L;
    }

    @Override // C0.InterfaceC0277q0
    public void p(C0279r0 c0279r0) {
        this.f919a = c0279r0;
    }
}
