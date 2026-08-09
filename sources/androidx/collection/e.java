package androidx.collection;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    b f3717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    c f3718b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    C0076e f3719c;

    final class a implements Iterator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f3720a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f3721b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f3722c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f3723d = false;

        a(int i3) {
            this.f3720a = i3;
            this.f3721b = e.this.d();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f3722c < this.f3721b;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            Object objB = e.this.b(this.f3722c, this.f3720a);
            this.f3722c++;
            this.f3723d = true;
            return objB;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f3723d) {
                throw new IllegalStateException();
            }
            int i3 = this.f3722c - 1;
            this.f3722c = i3;
            this.f3721b--;
            this.f3723d = false;
            e.this.h(i3);
        }
    }

    final class b implements Set {
        b() {
        }

        @Override // java.util.Set, java.util.Collection
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean add(Map.Entry entry) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection collection) {
            int iD = e.this.d();
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                e.this.g(entry.getKey(), entry.getValue());
            }
            return iD != e.this.d();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            e.this.a();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int iE = e.this.e(entry.getKey());
            if (iE < 0) {
                return false;
            }
            return androidx.collection.c.b(e.this.b(iE, 1), entry.getValue());
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection collection) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return e.k(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int iHashCode = 0;
            for (int iD = e.this.d() - 1; iD >= 0; iD--) {
                Object objB = e.this.b(iD, 0);
                Object objB2 = e.this.b(iD, 1);
                iHashCode += (objB == null ? 0 : objB.hashCode()) ^ (objB2 == null ? 0 : objB2.hashCode());
            }
            return iHashCode;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return e.this.d() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return e.this.new d();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return e.this.d();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray(Object[] objArr) {
            throw new UnsupportedOperationException();
        }
    }

    final class c implements Set {
        c() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            e.this.a();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            return e.this.e(obj) >= 0;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection collection) {
            return e.j(e.this.c(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return e.k(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int iHashCode = 0;
            for (int iD = e.this.d() - 1; iD >= 0; iD--) {
                Object objB = e.this.b(iD, 0);
                iHashCode += objB == null ? 0 : objB.hashCode();
            }
            return iHashCode;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return e.this.d() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return e.this.new a(0);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            int iE = e.this.e(obj);
            if (iE < 0) {
                return false;
            }
            e.this.h(iE);
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection collection) {
            return e.o(e.this.c(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection collection) {
            return e.p(e.this.c(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return e.this.d();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            return e.this.q(0);
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray(Object[] objArr) {
            return e.this.r(objArr, 0);
        }
    }

    final class d implements Iterator, Map.Entry {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f3727a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f3729c = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f3728b = -1;

        d() {
            this.f3727a = e.this.d() - 1;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            this.f3728b++;
            this.f3729c = true;
            return this;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!this.f3729c) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return androidx.collection.c.b(entry.getKey(), e.this.b(this.f3728b, 0)) && androidx.collection.c.b(entry.getValue(), e.this.b(this.f3728b, 1));
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            if (this.f3729c) {
                return e.this.b(this.f3728b, 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            if (this.f3729c) {
                return e.this.b(this.f3728b, 1);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f3728b < this.f3727a;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            if (!this.f3729c) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            Object objB = e.this.b(this.f3728b, 0);
            Object objB2 = e.this.b(this.f3728b, 1);
            return (objB == null ? 0 : objB.hashCode()) ^ (objB2 != null ? objB2.hashCode() : 0);
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f3729c) {
                throw new IllegalStateException();
            }
            e.this.h(this.f3728b);
            this.f3728b--;
            this.f3727a--;
            this.f3729c = false;
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            if (this.f3729c) {
                return e.this.i(this.f3728b, obj);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public String toString() {
            return getKey() + "=" + getValue();
        }
    }

    /* JADX INFO: renamed from: androidx.collection.e$e, reason: collision with other inner class name */
    final class C0076e implements Collection {
        C0076e() {
        }

        @Override // java.util.Collection
        public boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public boolean addAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public void clear() {
            e.this.a();
        }

        @Override // java.util.Collection
        public boolean contains(Object obj) {
            return e.this.f(obj) >= 0;
        }

        @Override // java.util.Collection
        public boolean containsAll(Collection collection) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Collection
        public boolean isEmpty() {
            return e.this.d() == 0;
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return e.this.new a(1);
        }

        @Override // java.util.Collection
        public boolean remove(Object obj) {
            int iF = e.this.f(obj);
            if (iF < 0) {
                return false;
            }
            e.this.h(iF);
            return true;
        }

        @Override // java.util.Collection
        public boolean removeAll(Collection collection) {
            int iD = e.this.d();
            int i3 = 0;
            boolean z2 = false;
            while (i3 < iD) {
                if (collection.contains(e.this.b(i3, 1))) {
                    e.this.h(i3);
                    i3--;
                    iD--;
                    z2 = true;
                }
                i3++;
            }
            return z2;
        }

        @Override // java.util.Collection
        public boolean retainAll(Collection collection) {
            int iD = e.this.d();
            int i3 = 0;
            boolean z2 = false;
            while (i3 < iD) {
                if (!collection.contains(e.this.b(i3, 1))) {
                    e.this.h(i3);
                    i3--;
                    iD--;
                    z2 = true;
                }
                i3++;
            }
            return z2;
        }

        @Override // java.util.Collection
        public int size() {
            return e.this.d();
        }

        @Override // java.util.Collection
        public Object[] toArray() {
            return e.this.q(1);
        }

        @Override // java.util.Collection
        public Object[] toArray(Object[] objArr) {
            return e.this.r(objArr, 1);
        }
    }

    e() {
    }

    public static boolean j(Map map, Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!map.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    public static boolean k(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static boolean o(Map map, Collection collection) {
        int size = map.size();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            map.remove(it.next());
        }
        return size != map.size();
    }

    public static boolean p(Map map, Collection collection) {
        int size = map.size();
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    protected abstract void a();

    protected abstract Object b(int i3, int i4);

    protected abstract Map c();

    protected abstract int d();

    protected abstract int e(Object obj);

    protected abstract int f(Object obj);

    protected abstract void g(Object obj, Object obj2);

    protected abstract void h(int i3);

    protected abstract Object i(int i3, Object obj);

    public Set l() {
        if (this.f3717a == null) {
            this.f3717a = new b();
        }
        return this.f3717a;
    }

    public Set m() {
        if (this.f3718b == null) {
            this.f3718b = new c();
        }
        return this.f3718b;
    }

    public Collection n() {
        if (this.f3719c == null) {
            this.f3719c = new C0076e();
        }
        return this.f3719c;
    }

    public Object[] q(int i3) {
        int iD = d();
        Object[] objArr = new Object[iD];
        for (int i4 = 0; i4 < iD; i4++) {
            objArr[i4] = b(i4, i3);
        }
        return objArr;
    }

    public Object[] r(Object[] objArr, int i3) {
        int iD = d();
        if (objArr.length < iD) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), iD);
        }
        for (int i4 = 0; i4 < iD; i4++) {
            objArr[i4] = b(i4, i3);
        }
        if (objArr.length > iD) {
            objArr[iD] = null;
        }
        return objArr;
    }
}
