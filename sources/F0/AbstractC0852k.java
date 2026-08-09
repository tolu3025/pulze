package f0;

import f0.AbstractC0850i;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.SortedMap;

/* JADX INFO: renamed from: f0.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0852k implements Map, Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final Map.Entry[] f7202d = new Map.Entry[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private transient AbstractC0853l f7203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient AbstractC0853l f7204b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private transient AbstractC0850i f7205c;

    /* JADX INFO: renamed from: f0.k$a */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Comparator f7206a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object[] f7207b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f7208c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f7209d = false;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        C0122a f7210e;

        /* JADX INFO: renamed from: f0.k$a$a, reason: collision with other inner class name */
        static final class C0122a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Object f7211a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final Object f7212b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final Object f7213c;

            C0122a(Object obj, Object obj2, Object obj3) {
                this.f7211a = obj;
                this.f7212b = obj2;
                this.f7213c = obj3;
            }

            IllegalArgumentException a() {
                return new IllegalArgumentException("Multiple entries with same key: " + this.f7211a + "=" + this.f7212b + " and " + this.f7211a + "=" + this.f7213c);
            }
        }

        a(int i3) {
            this.f7207b = new Object[i3 * 2];
        }

        private AbstractC0852k b(boolean z2) {
            Object[] objArrF;
            C0122a c0122a;
            C0122a c0122a2;
            if (z2 && (c0122a2 = this.f7210e) != null) {
                throw c0122a2.a();
            }
            int length = this.f7208c;
            if (this.f7206a == null) {
                objArrF = this.f7207b;
            } else {
                if (this.f7209d) {
                    this.f7207b = Arrays.copyOf(this.f7207b, length * 2);
                }
                objArrF = this.f7207b;
                if (!z2) {
                    objArrF = f(objArrF, this.f7208c);
                    if (objArrF.length < this.f7207b.length) {
                        length = objArrF.length >>> 1;
                    }
                }
                k(objArrF, length, this.f7206a);
            }
            this.f7209d = true;
            C0862u c0862uL = C0862u.l(length, objArrF, this);
            if (!z2 || (c0122a = this.f7210e) == null) {
                return c0862uL;
            }
            throw c0122a.a();
        }

        private void e(int i3) {
            int i4 = i3 * 2;
            Object[] objArr = this.f7207b;
            if (i4 > objArr.length) {
                this.f7207b = Arrays.copyOf(objArr, AbstractC0850i.b.c(objArr.length, i4));
                this.f7209d = false;
            }
        }

        private Object[] f(Object[] objArr, int i3) {
            HashSet hashSet = new HashSet();
            BitSet bitSet = new BitSet();
            for (int i4 = i3 - 1; i4 >= 0; i4--) {
                Object obj = objArr[i4 * 2];
                Objects.requireNonNull(obj);
                if (!hashSet.add(obj)) {
                    bitSet.set(i4);
                }
            }
            if (bitSet.isEmpty()) {
                return objArr;
            }
            Object[] objArr2 = new Object[(i3 - bitSet.cardinality()) * 2];
            int i5 = 0;
            int i6 = 0;
            while (i5 < i3 * 2) {
                if (bitSet.get(i5 >>> 1)) {
                    i5 += 2;
                } else {
                    int i7 = i6 + 1;
                    int i8 = i5 + 1;
                    Object obj2 = objArr[i5];
                    Objects.requireNonNull(obj2);
                    objArr2[i6] = obj2;
                    i6 += 2;
                    i5 += 2;
                    Object obj3 = objArr[i8];
                    Objects.requireNonNull(obj3);
                    objArr2[i7] = obj3;
                }
            }
            return objArr2;
        }

        static void k(Object[] objArr, int i3, Comparator comparator) {
            Map.Entry[] entryArr = new Map.Entry[i3];
            for (int i4 = 0; i4 < i3; i4++) {
                int i5 = i4 * 2;
                Object obj = objArr[i5];
                Objects.requireNonNull(obj);
                Object obj2 = objArr[i5 + 1];
                Objects.requireNonNull(obj2);
                entryArr[i4] = new AbstractMap.SimpleImmutableEntry(obj, obj2);
            }
            Arrays.sort(entryArr, 0, i3, AbstractC0859r.a(comparator).b(AbstractC0857p.c()));
            for (int i6 = 0; i6 < i3; i6++) {
                int i7 = i6 * 2;
                objArr[i7] = entryArr[i6].getKey();
                objArr[i7 + 1] = entryArr[i6].getValue();
            }
        }

        public AbstractC0852k a() {
            return d();
        }

        public AbstractC0852k c() {
            return b(false);
        }

        public AbstractC0852k d() {
            return b(true);
        }

        public a g(Object obj, Object obj2) {
            e(this.f7208c + 1);
            AbstractC0844c.a(obj, obj2);
            Object[] objArr = this.f7207b;
            int i3 = this.f7208c;
            objArr[i3 * 2] = obj;
            objArr[(i3 * 2) + 1] = obj2;
            this.f7208c = i3 + 1;
            return this;
        }

        public a h(Map.Entry entry) {
            return g(entry.getKey(), entry.getValue());
        }

        public a i(Iterable iterable) {
            if (iterable instanceof Collection) {
                e(this.f7208c + ((Collection) iterable).size());
            }
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                h((Map.Entry) it.next());
            }
            return this;
        }

        public a j(Map map) {
            return i(map.entrySet());
        }
    }

    AbstractC0852k() {
    }

    public static a a(int i3) {
        AbstractC0844c.b(i3, "expectedSize");
        return new a(i3);
    }

    public static AbstractC0852k b(Iterable iterable) {
        a aVar = new a(iterable instanceof Collection ? ((Collection) iterable).size() : 4);
        aVar.i(iterable);
        return aVar.a();
    }

    public static AbstractC0852k c(Map map) {
        if ((map instanceof AbstractC0852k) && !(map instanceof SortedMap)) {
            AbstractC0852k abstractC0852k = (AbstractC0852k) map;
            if (!abstractC0852k.h()) {
                return abstractC0852k;
            }
        }
        return b(map.entrySet());
    }

    public static AbstractC0852k j() {
        return C0862u.f7223m;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    abstract AbstractC0853l d();

    abstract AbstractC0853l e();

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return AbstractC0857p.a(this, obj);
    }

    abstract AbstractC0850i f();

    @Override // java.util.Map
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public AbstractC0853l entrySet() {
        AbstractC0853l abstractC0853l = this.f7203a;
        if (abstractC0853l != null) {
            return abstractC0853l;
        }
        AbstractC0853l abstractC0853lD = d();
        this.f7203a = abstractC0853lD;
        return abstractC0853lD;
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    abstract boolean h();

    @Override // java.util.Map
    public int hashCode() {
        return AbstractC0864w.b(entrySet());
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public AbstractC0853l keySet() {
        AbstractC0853l abstractC0853l = this.f7204b;
        if (abstractC0853l != null) {
            return abstractC0853l;
        }
        AbstractC0853l abstractC0853lE = e();
        this.f7204b = abstractC0853lE;
        return abstractC0853lE;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public AbstractC0850i values() {
        AbstractC0850i abstractC0850i = this.f7205c;
        if (abstractC0850i != null) {
            return abstractC0850i;
        }
        AbstractC0850i abstractC0850iF = f();
        this.f7205c = abstractC0850iF;
        return abstractC0850iF;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        return AbstractC0857p.b(this);
    }
}
