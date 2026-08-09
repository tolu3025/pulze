package J0;

import A0.AbstractC0219q;
import A0.C0213k;
import A0.C0218p;
import A0.T;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class B {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [A0.q] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v5, types: [A0.k] */
    protected static AbstractC0219q a(AbstractC0219q abstractC0219q) {
        f(abstractC0219q);
        if (m(abstractC0219q)) {
            return abstractC0219q;
        }
        C0213k c0213k = (C0213k) abstractC0219q;
        List listB = c0213k.b();
        if (listB.size() == 1) {
            return a((AbstractC0219q) listB.get(0));
        }
        if (c0213k.h()) {
            return c0213k;
        }
        ArrayList<??> arrayList = new ArrayList();
        Iterator it = listB.iterator();
        while (it.hasNext()) {
            arrayList.add(a((AbstractC0219q) it.next()));
        }
        ArrayList arrayList2 = new ArrayList();
        for (?? r4 : arrayList) {
            if (!(r4 instanceof C0218p)) {
                if (r4 instanceof C0213k) {
                    r4 = (C0213k) r4;
                    if (r4.e().equals(c0213k.e())) {
                        arrayList2.addAll(r4.b());
                    }
                }
            }
            arrayList2.add(r4);
        }
        return arrayList2.size() == 1 ? (AbstractC0219q) arrayList2.get(0) : new C0213k(arrayList2, c0213k.e());
    }

    private static AbstractC0219q b(C0213k c0213k, C0213k c0213k2) {
        AbstractC0386b.d((c0213k.b().isEmpty() || c0213k2.b().isEmpty()) ? false : true, "Found an empty composite filter", new Object[0]);
        if (c0213k.f() && c0213k2.f()) {
            return c0213k.j(c0213k2.b());
        }
        C0213k c0213k3 = c0213k.g() ? c0213k : c0213k2;
        if (c0213k.g()) {
            c0213k = c0213k2;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = c0213k3.b().iterator();
        while (it.hasNext()) {
            arrayList.add(e((AbstractC0219q) it.next(), c0213k));
        }
        return new C0213k(arrayList, C0213k.a.OR);
    }

    private static AbstractC0219q c(C0218p c0218p, C0213k c0213k) {
        if (c0213k.f()) {
            return c0213k.j(Collections.singletonList(c0218p));
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = c0213k.b().iterator();
        while (it.hasNext()) {
            arrayList.add(e(c0218p, (AbstractC0219q) it.next()));
        }
        return new C0213k(arrayList, C0213k.a.OR);
    }

    private static AbstractC0219q d(C0218p c0218p, C0218p c0218p2) {
        return new C0213k(Arrays.asList(c0218p, c0218p2), C0213k.a.AND);
    }

    protected static AbstractC0219q e(AbstractC0219q abstractC0219q, AbstractC0219q abstractC0219q2) {
        f(abstractC0219q);
        f(abstractC0219q2);
        boolean z2 = abstractC0219q instanceof C0218p;
        return a((z2 && (abstractC0219q2 instanceof C0218p)) ? d((C0218p) abstractC0219q, (C0218p) abstractC0219q2) : (z2 && (abstractC0219q2 instanceof C0213k)) ? c((C0218p) abstractC0219q, (C0213k) abstractC0219q2) : ((abstractC0219q instanceof C0213k) && (abstractC0219q2 instanceof C0218p)) ? c((C0218p) abstractC0219q2, (C0213k) abstractC0219q) : b((C0213k) abstractC0219q, (C0213k) abstractC0219q2));
    }

    private static void f(AbstractC0219q abstractC0219q) {
        AbstractC0386b.d((abstractC0219q instanceof C0218p) || (abstractC0219q instanceof C0213k), "Only field filters and composite filters are accepted.", new Object[0]);
    }

    protected static AbstractC0219q g(AbstractC0219q abstractC0219q) {
        f(abstractC0219q);
        if (abstractC0219q instanceof C0218p) {
            return abstractC0219q;
        }
        C0213k c0213k = (C0213k) abstractC0219q;
        if (c0213k.b().size() == 1) {
            return g((AbstractC0219q) abstractC0219q.b().get(0));
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = c0213k.b().iterator();
        while (it.hasNext()) {
            arrayList.add(g((AbstractC0219q) it.next()));
        }
        AbstractC0219q abstractC0219qA = a(new C0213k(arrayList, c0213k.e()));
        if (k(abstractC0219qA)) {
            return abstractC0219qA;
        }
        AbstractC0386b.d(abstractC0219qA instanceof C0213k, "field filters are already in DNF form.", new Object[0]);
        C0213k c0213k2 = (C0213k) abstractC0219qA;
        AbstractC0386b.d(c0213k2.f(), "Disjunction of filters all of which are already in DNF form is itself in DNF form.", new Object[0]);
        AbstractC0386b.d(c0213k2.b().size() > 1, "Single-filter composite filters are already in DNF form.", new Object[0]);
        AbstractC0219q abstractC0219qE = (AbstractC0219q) c0213k2.b().get(0);
        for (int i3 = 1; i3 < c0213k2.b().size(); i3++) {
            abstractC0219qE = e(abstractC0219qE, (AbstractC0219q) c0213k2.b().get(i3));
        }
        return abstractC0219qE;
    }

    protected static AbstractC0219q h(AbstractC0219q abstractC0219q) {
        f(abstractC0219q);
        ArrayList arrayList = new ArrayList();
        if (!(abstractC0219q instanceof C0218p)) {
            C0213k c0213k = (C0213k) abstractC0219q;
            Iterator it = c0213k.b().iterator();
            while (it.hasNext()) {
                arrayList.add(h((AbstractC0219q) it.next()));
            }
            return new C0213k(arrayList, c0213k.e());
        }
        if (!(abstractC0219q instanceof T)) {
            return abstractC0219q;
        }
        T t2 = (T) abstractC0219q;
        Iterator it2 = t2.h().o0().g().iterator();
        while (it2.hasNext()) {
            arrayList.add(C0218p.e(t2.f(), C0218p.b.EQUAL, (V0.I) it2.next()));
        }
        return new C0213k(arrayList, C0213k.a.OR);
    }

    public static List i(C0213k c0213k) {
        if (c0213k.b().isEmpty()) {
            return Collections.emptyList();
        }
        AbstractC0219q abstractC0219qG = g(h(c0213k));
        AbstractC0386b.d(k(abstractC0219qG), "computeDistributedNormalForm did not result in disjunctive normal form", new Object[0]);
        return (m(abstractC0219qG) || l(abstractC0219qG)) ? Collections.singletonList(abstractC0219qG) : abstractC0219qG.b();
    }

    private static boolean j(AbstractC0219q abstractC0219q) {
        if (abstractC0219q instanceof C0213k) {
            C0213k c0213k = (C0213k) abstractC0219q;
            if (c0213k.g()) {
                for (AbstractC0219q abstractC0219q2 : c0213k.b()) {
                    if (!m(abstractC0219q2) && !l(abstractC0219q2)) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    private static boolean k(AbstractC0219q abstractC0219q) {
        return m(abstractC0219q) || l(abstractC0219q) || j(abstractC0219q);
    }

    private static boolean l(AbstractC0219q abstractC0219q) {
        return (abstractC0219q instanceof C0213k) && ((C0213k) abstractC0219q).i();
    }

    private static boolean m(AbstractC0219q abstractC0219q) {
        return abstractC0219q instanceof C0218p;
    }
}
