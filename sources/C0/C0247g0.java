package C0;

import A0.AbstractC0207e0;
import D0.q;
import J0.AbstractC0386b;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: C0.g0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C0247g0 implements InterfaceC0282s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private t0.c f968a = D0.j.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private InterfaceC0264m f969b;

    /* JADX INFO: renamed from: C0.g0$b */
    private class b implements Iterable {

        /* JADX INFO: renamed from: C0.g0$b$a */
        class a implements Iterator {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Iterator f971a;

            a(Iterator it) {
                this.f971a = it;
            }

            @Override // java.util.Iterator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public D0.i next() {
                return (D0.i) ((Map.Entry) this.f971a.next()).getValue();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f971a.hasNext();
            }
        }

        private b() {
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return new a(C0247g0.this.f968a.iterator());
        }
    }

    C0247g0() {
    }

    @Override // C0.InterfaceC0282s0
    public void a(InterfaceC0264m interfaceC0264m) {
        this.f969b = interfaceC0264m;
    }

    @Override // C0.InterfaceC0282s0
    public void b(D0.s sVar, D0.w wVar) {
        AbstractC0386b.d(this.f969b != null, "setIndexManager() not called", new Object[0]);
        AbstractC0386b.d(!wVar.equals(D0.w.f1302b), "Cannot add document to the RemoteDocumentCache with a read time of zero", new Object[0]);
        this.f968a = this.f968a.m(sVar.getKey(), sVar.c().w(wVar));
        this.f969b.f(sVar.getKey().n());
    }

    @Override // C0.InterfaceC0282s0
    public Map c(String str, q.a aVar, int i3) {
        throw new UnsupportedOperationException("getAll(String, IndexOffset, int) is not supported.");
    }

    @Override // C0.InterfaceC0282s0
    public Map d(A0.h0 h0Var, q.a aVar, Set set, C0265m0 c0265m0) {
        HashMap map = new HashMap();
        D0.u uVarN = h0Var.d() ? h0Var.h().n() : D0.u.B(AbstractC0207e0.c(h0Var.g()));
        Iterator itN = this.f968a.n(D0.l.j((D0.u) uVarN.m("")));
        while (itN.hasNext()) {
            Map.Entry entry = (Map.Entry) itN.next();
            D0.i iVar = (D0.i) entry.getValue();
            D0.l lVar = (D0.l) entry.getKey();
            if (!uVarN.v(lVar.p())) {
                break;
            }
            if (lVar.p().w() <= uVarN.w() + 1 && q.a.i(iVar).compareTo(aVar) > 0 && (set.contains(iVar.getKey()) || h0Var.e(iVar))) {
                map.put(iVar.getKey(), iVar.c());
            }
        }
        return map;
    }

    @Override // C0.InterfaceC0282s0
    public Map e(Iterable iterable) {
        HashMap map = new HashMap();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            D0.l lVar = (D0.l) it.next();
            map.put(lVar, f(lVar));
        }
        return map;
    }

    @Override // C0.InterfaceC0282s0
    public D0.s f(D0.l lVar) {
        D0.i iVar = (D0.i) this.f968a.b(lVar);
        return iVar != null ? iVar.c() : D0.s.r(lVar);
    }

    long h(r rVar) {
        Iterator it = new b().iterator();
        long jA = 0;
        while (it.hasNext()) {
            jA += (long) rVar.m((D0.i) it.next()).a();
        }
        return jA;
    }

    Iterable i() {
        return new b();
    }

    @Override // C0.InterfaceC0282s0
    public void removeAll(Collection collection) {
        AbstractC0386b.d(this.f969b != null, "setIndexManager() not called", new Object[0]);
        t0.c cVarA = D0.j.a();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            D0.l lVar = (D0.l) it.next();
            this.f968a = this.f968a.o(lVar);
            cVarA = cVarA.m(lVar, D0.s.s(lVar, D0.w.f1302b));
        }
        this.f969b.j(cVarA);
    }
}
