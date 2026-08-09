package D0;

import D0.q;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import k0.C1004r;

/* JADX INFO: loaded from: classes.dex */
public abstract class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static b f1269a = b.a(0, a.f1271a);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Comparator f1270b = new Comparator() { // from class: D0.o
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return q.i((q) obj, (q) obj2);
        }
    };

    public static abstract class a implements Comparable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f1271a = g(w.f1302b, l.g(), -1);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Comparator f1272b = new Comparator() { // from class: D0.p
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return q.a.m((s) obj, (s) obj2);
            }
        };

        public static a g(w wVar, l lVar, int i3) {
            return new D0.b(wVar, lVar, i3);
        }

        public static a h(w wVar, int i3) {
            long jL = wVar.e().l();
            int i4 = wVar.e().i() + 1;
            return g(new w(((double) i4) == 1.0E9d ? new C1004r(jL + 1, 0) : new C1004r(jL, i4)), l.g(), i3);
        }

        public static a i(i iVar) {
            return g(iVar.i(), iVar.getKey(), -1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ int m(s sVar, s sVar2) {
            return i(sVar).compareTo(i(sVar2));
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public int compareTo(a aVar) {
            int iCompareTo = l().compareTo(aVar.l());
            if (iCompareTo != 0) {
                return iCompareTo;
            }
            int iCompareTo2 = j().compareTo(aVar.j());
            return iCompareTo2 != 0 ? iCompareTo2 : Integer.compare(k(), aVar.k());
        }

        public abstract l j();

        public abstract int k();

        public abstract w l();
    }

    public static abstract class b {
        public static b a(long j3, a aVar) {
            return new D0.c(j3, aVar);
        }

        public static b b(long j3, w wVar, l lVar, int i3) {
            return a(j3, a.g(wVar, lVar, i3));
        }

        public abstract a c();

        public abstract long d();
    }

    public static abstract class c implements Comparable {

        public enum a {
            ASCENDING,
            DESCENDING,
            CONTAINS
        }

        public static c e(r rVar, a aVar) {
            return new d(rVar, aVar);
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int compareTo(c cVar) {
            int iCompareTo = g().compareTo(cVar.g());
            return iCompareTo != 0 ? iCompareTo : h().compareTo(cVar.h());
        }

        public abstract r g();

        public abstract a h();
    }

    public static q b(int i3, String str, List list, b bVar) {
        return new D0.a(i3, str, list, bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int i(q qVar, q qVar2) {
        int iCompareTo = qVar.d().compareTo(qVar2.d());
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        Iterator it = qVar.h().iterator();
        Iterator it2 = qVar2.h().iterator();
        while (it.hasNext() && it2.hasNext()) {
            int iCompareTo2 = ((c) it.next()).compareTo((c) it2.next());
            if (iCompareTo2 != 0) {
                return iCompareTo2;
            }
        }
        return Boolean.compare(it.hasNext(), it2.hasNext());
    }

    public c c() {
        for (c cVar : h()) {
            if (cVar.h().equals(c.a.CONTAINS)) {
                return cVar;
            }
        }
        return null;
    }

    public abstract String d();

    public List e() {
        ArrayList arrayList = new ArrayList();
        for (c cVar : h()) {
            if (!cVar.h().equals(c.a.CONTAINS)) {
                arrayList.add(cVar);
            }
        }
        return arrayList;
    }

    public abstract int f();

    public abstract b g();

    public abstract List h();
}
