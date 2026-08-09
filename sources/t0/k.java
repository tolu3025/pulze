package t0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import t0.c;
import t0.h;

/* JADX INFO: loaded from: classes.dex */
public class k extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private h f11311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Comparator f11312b;

    private k(h hVar, Comparator comparator) {
        this.f11311a = hVar;
        this.f11312b = comparator;
    }

    public static k p(List list, Map map, c.a.InterfaceC0167a interfaceC0167a, Comparator comparator) {
        return b.b(list, map, interfaceC0167a, comparator);
    }

    public static k q(Map map, Comparator comparator) {
        return b.b(new ArrayList(map.keySet()), map, c.a.d(), comparator);
    }

    private h r(Object obj) {
        h hVarA = this.f11311a;
        while (!hVarA.isEmpty()) {
            int iCompare = this.f11312b.compare(obj, hVarA.getKey());
            if (iCompare < 0) {
                hVarA = hVarA.a();
            } else {
                if (iCompare == 0) {
                    return hVarA;
                }
                hVarA = hVarA.e();
            }
        }
        return null;
    }

    @Override // t0.c
    public boolean a(Object obj) {
        return r(obj) != null;
    }

    @Override // t0.c
    public Object b(Object obj) {
        h hVarR = r(obj);
        if (hVarR != null) {
            return hVarR.getValue();
        }
        return null;
    }

    @Override // t0.c
    public Comparator d() {
        return this.f11312b;
    }

    @Override // t0.c
    public Object f() {
        return this.f11311a.h().getKey();
    }

    @Override // t0.c
    public int indexOf(Object obj) {
        h hVarA = this.f11311a;
        int size = 0;
        while (!hVarA.isEmpty()) {
            int iCompare = this.f11312b.compare(obj, hVarA.getKey());
            if (iCompare == 0) {
                return size + hVarA.a().size();
            }
            if (iCompare < 0) {
                hVarA = hVarA.a();
            } else {
                size += hVarA.a().size() + 1;
                hVarA = hVarA.e();
            }
        }
        return -1;
    }

    @Override // t0.c
    public boolean isEmpty() {
        return this.f11311a.isEmpty();
    }

    @Override // t0.c, java.lang.Iterable
    public Iterator iterator() {
        return new d(this.f11311a, null, this.f11312b, false);
    }

    @Override // t0.c
    public Object l() {
        return this.f11311a.g().getKey();
    }

    @Override // t0.c
    public c m(Object obj, Object obj2) {
        return new k(this.f11311a.b(obj, obj2, this.f11312b).d(null, null, h.a.BLACK, null, null), this.f11312b);
    }

    @Override // t0.c
    public Iterator n(Object obj) {
        return new d(this.f11311a, obj, this.f11312b, false);
    }

    @Override // t0.c
    public c o(Object obj) {
        return !a(obj) ? this : new k(this.f11311a.f(obj, this.f11312b).d(null, null, h.a.BLACK, null, null), this.f11312b);
    }

    @Override // t0.c
    public int size() {
        return this.f11311a.size();
    }

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f11313a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Map f11314b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final c.a.InterfaceC0167a f11315c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private j f11316d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private j f11317e;

        /* JADX INFO: renamed from: t0.k$b$b, reason: collision with other inner class name */
        static class C0169b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public boolean f11322a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f11323b;

            C0169b() {
            }
        }

        private b(List list, Map map, c.a.InterfaceC0167a interfaceC0167a) {
            this.f11313a = list;
            this.f11314b = map;
            this.f11315c = interfaceC0167a;
        }

        private h a(int i3, int i4) {
            if (i4 == 0) {
                return g.i();
            }
            if (i4 == 1) {
                Object obj = this.f11313a.get(i3);
                return new f(obj, d(obj), null, null);
            }
            int i5 = i4 / 2;
            int i6 = i3 + i5;
            h hVarA = a(i3, i5);
            h hVarA2 = a(i6 + 1, i5);
            Object obj2 = this.f11313a.get(i6);
            return new f(obj2, d(obj2), hVarA, hVarA2);
        }

        public static k b(List list, Map map, c.a.InterfaceC0167a interfaceC0167a, Comparator comparator) {
            b bVar = new b(list, map, interfaceC0167a);
            Collections.sort(list, comparator);
            int size = list.size();
            for (C0169b c0169b : new a(list.size())) {
                int i3 = c0169b.f11323b;
                size -= i3;
                if (c0169b.f11322a) {
                    bVar.c(h.a.BLACK, i3, size);
                } else {
                    bVar.c(h.a.BLACK, i3, size);
                    int i4 = c0169b.f11323b;
                    size -= i4;
                    bVar.c(h.a.RED, i4, size);
                }
            }
            h hVarI = bVar.f11316d;
            if (hVarI == null) {
                hVarI = g.i();
            }
            return new k(hVarI, comparator);
        }

        private void c(h.a aVar, int i3, int i4) {
            h hVarA = a(i4 + 1, i3 - 1);
            Object obj = this.f11313a.get(i4);
            j iVar = aVar == h.a.RED ? new i(obj, d(obj), null, hVarA) : new f(obj, d(obj), null, hVarA);
            if (this.f11316d == null) {
                this.f11316d = iVar;
            } else {
                this.f11317e.t(iVar);
            }
            this.f11317e = iVar;
        }

        private Object d(Object obj) {
            return this.f11314b.get(this.f11315c.a(obj));
        }

        static class a implements Iterable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private long f11318a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final int f11319b;

            public a(int i3) {
                int i4 = i3 + 1;
                int iFloor = (int) Math.floor(Math.log(i4) / Math.log(2.0d));
                this.f11319b = iFloor;
                this.f11318a = (((long) Math.pow(2.0d, iFloor)) - 1) & ((long) i4);
            }

            @Override // java.lang.Iterable
            public Iterator iterator() {
                return new C0168a();
            }

            /* JADX INFO: renamed from: t0.k$b$a$a, reason: collision with other inner class name */
            class C0168a implements Iterator {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private int f11320a;

                C0168a() {
                    this.f11320a = a.this.f11319b - 1;
                }

                @Override // java.util.Iterator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public C0169b next() {
                    long j3 = a.this.f11318a & ((long) (1 << this.f11320a));
                    C0169b c0169b = new C0169b();
                    c0169b.f11322a = j3 == 0;
                    c0169b.f11323b = (int) Math.pow(2.0d, this.f11320a);
                    this.f11320a--;
                    return c0169b;
                }

                @Override // java.util.Iterator
                public boolean hasNext() {
                    return this.f11320a >= 0;
                }

                @Override // java.util.Iterator
                public void remove() {
                }
            }
        }
    }
}
