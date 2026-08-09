package D0;

import A0.AbstractC0219q;
import A0.C0203c0;
import A0.C0218p;
import A0.l0;
import D0.q;
import J0.AbstractC0386b;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes.dex */
public class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f1304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SortedSet f1305b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f1306c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f1307d;

    public y(l0 l0Var) {
        this.f1304a = l0Var.d() != null ? l0Var.d() : l0Var.n().s();
        this.f1307d = l0Var.m();
        this.f1305b = new TreeSet(new Comparator() { // from class: D0.x
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return y.e((C0218p) obj, (C0218p) obj2);
            }
        });
        this.f1306c = new ArrayList();
        Iterator it = l0Var.h().iterator();
        while (it.hasNext()) {
            C0218p c0218p = (C0218p) ((AbstractC0219q) it.next());
            if (c0218p.i()) {
                this.f1305b.add(c0218p);
            } else {
                this.f1306c.add(c0218p);
            }
        }
    }

    private boolean c(q.c cVar) {
        Iterator it = this.f1306c.iterator();
        while (it.hasNext()) {
            if (f((C0218p) it.next(), cVar)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int e(C0218p c0218p, C0218p c0218p2) {
        return c0218p.f().compareTo(c0218p2.f());
    }

    private boolean f(C0218p c0218p, q.c cVar) {
        if (c0218p == null || !c0218p.f().equals(cVar.g())) {
            return false;
        }
        return cVar.h().equals(q.c.a.CONTAINS) == (c0218p.g().equals(C0218p.b.ARRAY_CONTAINS) || c0218p.g().equals(C0218p.b.ARRAY_CONTAINS_ANY));
    }

    private boolean g(C0203c0 c0203c0, q.c cVar) {
        if (c0203c0.c().equals(cVar.g())) {
            return (cVar.h().equals(q.c.a.ASCENDING) && c0203c0.b().equals(C0203c0.a.ASCENDING)) || (cVar.h().equals(q.c.a.DESCENDING) && c0203c0.b().equals(C0203c0.a.DESCENDING));
        }
        return false;
    }

    public q b() {
        r rVarF;
        q.c.a aVar;
        if (d()) {
            return null;
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (C0218p c0218p : this.f1306c) {
            if (!c0218p.f().D()) {
                if (c0218p.g().equals(C0218p.b.ARRAY_CONTAINS) || c0218p.g().equals(C0218p.b.ARRAY_CONTAINS_ANY)) {
                    rVarF = c0218p.f();
                    aVar = q.c.a.CONTAINS;
                    arrayList.add(q.c.e(rVarF, aVar));
                } else if (!hashSet.contains(c0218p.f())) {
                    hashSet.add(c0218p.f());
                    rVarF = c0218p.f();
                    aVar = q.c.a.ASCENDING;
                    arrayList.add(q.c.e(rVarF, aVar));
                }
            }
        }
        for (C0203c0 c0203c0 : this.f1307d) {
            if (!c0203c0.c().D() && !hashSet.contains(c0203c0.c())) {
                hashSet.add(c0203c0.c());
                arrayList.add(q.c.e(c0203c0.c(), c0203c0.b() == C0203c0.a.ASCENDING ? q.c.a.ASCENDING : q.c.a.DESCENDING));
            }
        }
        return q.b(-1, this.f1304a, arrayList, q.f1269a);
    }

    public boolean d() {
        return this.f1305b.size() > 1;
    }

    public boolean h(q qVar) {
        AbstractC0386b.d(qVar.d().equals(this.f1304a), "Collection IDs do not match", new Object[0]);
        if (d()) {
            return false;
        }
        q.c cVarC = qVar.c();
        if (cVarC != null && !c(cVarC)) {
            return false;
        }
        Iterator it = this.f1307d.iterator();
        List listE = qVar.e();
        HashSet hashSet = new HashSet();
        int i3 = 0;
        while (i3 < listE.size() && c((q.c) listE.get(i3))) {
            hashSet.add(((q.c) listE.get(i3)).g().n());
            i3++;
        }
        if (i3 == listE.size()) {
            return true;
        }
        if (this.f1305b.size() > 0) {
            C0218p c0218p = (C0218p) this.f1305b.first();
            if (!hashSet.contains(c0218p.f().n())) {
                q.c cVar = (q.c) listE.get(i3);
                if (!f(c0218p, cVar) || !g((C0203c0) it.next(), cVar)) {
                    return false;
                }
            }
            i3++;
        }
        while (i3 < listE.size()) {
            q.c cVar2 = (q.c) listE.get(i3);
            if (!it.hasNext() || !g((C0203c0) it.next(), cVar2)) {
                return false;
            }
            i3++;
        }
        return true;
    }
}
