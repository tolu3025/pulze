package C0;

import android.util.SparseArray;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: C0.h0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C0250h0 implements Q1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f976c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final C0244f0 f979f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f974a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C0279r0 f975b = new C0279r0();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private D0.w f977d = D0.w.f1302b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f978e = 0;

    C0250h0(C0244f0 c0244f0) {
        this.f979f = c0244f0;
    }

    @Override // C0.Q1
    public void a(D0.w wVar) {
        this.f977d = wVar;
    }

    @Override // C0.Q1
    public t0.e b(int i3) {
        return this.f975b.d(i3);
    }

    @Override // C0.Q1
    public D0.w c() {
        return this.f977d;
    }

    @Override // C0.Q1
    public void d(int i3) {
        this.f975b.h(i3);
    }

    @Override // C0.Q1
    public void e(t0.e eVar, int i3) {
        this.f975b.g(eVar, i3);
        InterfaceC0277q0 interfaceC0277q0G = this.f979f.g();
        Iterator it = eVar.iterator();
        while (it.hasNext()) {
            interfaceC0277q0G.f((D0.l) it.next());
        }
    }

    @Override // C0.Q1
    public void f(R1 r12) {
        h(r12);
    }

    @Override // C0.Q1
    public void g(t0.e eVar, int i3) {
        this.f975b.b(eVar, i3);
        InterfaceC0277q0 interfaceC0277q0G = this.f979f.g();
        Iterator it = eVar.iterator();
        while (it.hasNext()) {
            interfaceC0277q0G.g((D0.l) it.next());
        }
    }

    @Override // C0.Q1
    public void h(R1 r12) {
        this.f974a.put(r12.g(), r12);
        int iH = r12.h();
        if (iH > this.f976c) {
            this.f976c = iH;
        }
        if (r12.e() > this.f978e) {
            this.f978e = r12.e();
        }
    }

    @Override // C0.Q1
    public int i() {
        return this.f976c;
    }

    @Override // C0.Q1
    public R1 j(A0.n0 n0Var) {
        return (R1) this.f974a.get(n0Var);
    }

    public boolean k(D0.l lVar) {
        return this.f975b.c(lVar);
    }

    public void l(J0.n nVar) {
        Iterator it = this.f974a.values().iterator();
        while (it.hasNext()) {
            nVar.accept((R1) it.next());
        }
    }

    long m(r rVar) {
        Iterator it = this.f974a.entrySet().iterator();
        long jA = 0;
        while (it.hasNext()) {
            jA += (long) rVar.q((R1) ((Map.Entry) it.next()).getValue()).a();
        }
        return jA;
    }

    public long n() {
        return this.f978e;
    }

    public long o() {
        return this.f974a.size();
    }

    int p(long j3, SparseArray sparseArray) {
        Iterator it = this.f974a.entrySet().iterator();
        int i3 = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            int iH = ((R1) entry.getValue()).h();
            if (((R1) entry.getValue()).e() <= j3 && sparseArray.get(iH) == null) {
                it.remove();
                d(iH);
                i3++;
            }
        }
        return i3;
    }

    public void q(R1 r12) {
        this.f974a.remove(r12.g());
        this.f975b.h(r12.h());
    }
}
