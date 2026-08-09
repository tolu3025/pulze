package C0;

import C0.T;
import J0.AbstractC0386b;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: C0.b0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C0232b0 implements InterfaceC0277q0, O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C0244f0 f930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final r f931b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private C0279r0 f933d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final T f934e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final A0.Y f935f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f932c = new HashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f936g = -1;

    C0232b0(C0244f0 c0244f0, T.b bVar, r rVar) {
        this.f930a = c0244f0;
        this.f931b = rVar;
        this.f935f = new A0.Y(c0244f0.i().n());
        this.f934e = new T(this, bVar);
    }

    private boolean r(D0.l lVar, long j3) {
        if (t(lVar) || this.f933d.c(lVar) || this.f930a.i().k(lVar)) {
            return true;
        }
        Long l3 = (Long) this.f932c.get(lVar);
        return l3 != null && l3.longValue() > j3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void s(long[] jArr, Long l3) {
        jArr[0] = jArr[0] + 1;
    }

    private boolean t(D0.l lVar) {
        Iterator it = this.f930a.r().iterator();
        while (it.hasNext()) {
            if (((C0238d0) it.next()).l(lVar)) {
                return true;
            }
        }
        return false;
    }

    @Override // C0.InterfaceC0277q0
    public void a(R1 r12) {
        this.f930a.i().f(r12.l(o()));
    }

    @Override // C0.O
    public long b() {
        long jO = this.f930a.i().o();
        final long[] jArr = new long[1];
        m(new J0.n() { // from class: C0.a0
            @Override // J0.n
            public final void accept(Object obj) {
                C0232b0.s(jArr, (Long) obj);
            }
        });
        return jO + jArr[0];
    }

    @Override // C0.O
    public int c(long j3, SparseArray sparseArray) {
        return this.f930a.i().p(j3, sparseArray);
    }

    @Override // C0.InterfaceC0277q0
    public void d(D0.l lVar) {
        this.f932c.put(lVar, Long.valueOf(o()));
    }

    @Override // C0.O
    public int e(long j3) {
        C0247g0 c0247g0H = this.f930a.h();
        ArrayList arrayList = new ArrayList();
        Iterator it = c0247g0H.i().iterator();
        while (it.hasNext()) {
            D0.l key = ((D0.i) it.next()).getKey();
            if (!r(key, j3)) {
                arrayList.add(key);
                this.f932c.remove(key);
            }
        }
        c0247g0H.removeAll(arrayList);
        return arrayList.size();
    }

    @Override // C0.InterfaceC0277q0
    public void f(D0.l lVar) {
        this.f932c.put(lVar, Long.valueOf(o()));
    }

    @Override // C0.InterfaceC0277q0
    public void g(D0.l lVar) {
        this.f932c.put(lVar, Long.valueOf(o()));
    }

    @Override // C0.InterfaceC0277q0
    public void h() {
        AbstractC0386b.d(this.f936g != -1, "Committing a transaction without having started one", new Object[0]);
        this.f936g = -1L;
    }

    @Override // C0.InterfaceC0277q0
    public void i(D0.l lVar) {
        this.f932c.put(lVar, Long.valueOf(o()));
    }

    @Override // C0.O
    public T j() {
        return this.f934e;
    }

    @Override // C0.InterfaceC0277q0
    public void k() {
        AbstractC0386b.d(this.f936g == -1, "Starting a transaction without committing the previous one", new Object[0]);
        this.f936g = this.f935f.a();
    }

    @Override // C0.O
    public long l() {
        long jM = this.f930a.i().m(this.f931b) + this.f930a.h().h(this.f931b);
        Iterator it = this.f930a.r().iterator();
        while (it.hasNext()) {
            jM += ((C0238d0) it.next()).m(this.f931b);
        }
        return jM;
    }

    @Override // C0.O
    public void m(J0.n nVar) {
        for (Map.Entry entry : this.f932c.entrySet()) {
            if (!r((D0.l) entry.getKey(), ((Long) entry.getValue()).longValue())) {
                nVar.accept((Long) entry.getValue());
            }
        }
    }

    @Override // C0.O
    public void n(J0.n nVar) {
        this.f930a.i().l(nVar);
    }

    @Override // C0.InterfaceC0277q0
    public long o() {
        AbstractC0386b.d(this.f936g != -1, "Attempting to get a sequence number outside of a transaction", new Object[0]);
        return this.f936g;
    }

    @Override // C0.InterfaceC0277q0
    public void p(C0279r0 c0279r0) {
        this.f933d = c0279r0;
    }
}
