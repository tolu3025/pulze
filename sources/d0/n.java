package D0;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class n implements Iterable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final t0.c f1267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final t0.e f1268b;

    private n(t0.c cVar, t0.e eVar) {
        this.f1267a = cVar;
        this.f1268b = eVar;
    }

    public static n f(final Comparator comparator) {
        return new n(j.a(), new t0.e(Collections.emptyList(), new Comparator() { // from class: D0.m
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return n.p(comparator, (i) obj, (i) obj2);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int p(Comparator comparator, i iVar, i iVar2) {
        int iCompare = comparator.compare(iVar, iVar2);
        return iCompare == 0 ? i.f1261a.compare(iVar, iVar2) : iCompare;
    }

    public n b(i iVar) {
        n nVarQ = q(iVar.getKey());
        return new n(nVarQ.f1267a.m(iVar.getKey(), iVar), nVarQ.f1268b.d(iVar));
    }

    public boolean d(l lVar) {
        return this.f1267a.a(lVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n.class != obj.getClass()) {
            return false;
        }
        n nVar = (n) obj;
        if (size() != nVar.size()) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = nVar.iterator();
        while (it.hasNext()) {
            if (!((i) it.next()).equals((i) it2.next())) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            i iVar = (i) it.next();
            iHashCode = (((iHashCode * 31) + iVar.getKey().hashCode()) * 31) + iVar.b().hashCode();
        }
        return iHashCode;
    }

    public boolean isEmpty() {
        return this.f1267a.isEmpty();
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return this.f1268b.iterator();
    }

    public i l(l lVar) {
        return (i) this.f1267a.b(lVar);
    }

    public i m() {
        return (i) this.f1268b.b();
    }

    public i n() {
        return (i) this.f1268b.a();
    }

    public int o(l lVar) {
        i iVar = (i) this.f1267a.b(lVar);
        if (iVar == null) {
            return -1;
        }
        return this.f1268b.indexOf(iVar);
    }

    public n q(l lVar) {
        i iVar = (i) this.f1267a.b(lVar);
        return iVar == null ? this : new n(this.f1267a.o(lVar), this.f1268b.l(iVar));
    }

    public int size() {
        return this.f1267a.size();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        boolean z2 = true;
        while (it.hasNext()) {
            i iVar = (i) it.next();
            if (z2) {
                z2 = false;
            } else {
                sb.append(", ");
            }
            sb.append(iVar);
        }
        sb.append("]");
        return sb.toString();
    }
}
