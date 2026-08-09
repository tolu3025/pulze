package K1;

import J1.AbstractC0399c;
import J1.AbstractC0400d;
import J1.AbstractC0406j;
import J1.AbstractC0411o;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class a extends AbstractC0400d implements List, RandomAccess, Serializable, V1.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final b f2607d = new b(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final a f2608e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Object[] f2609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f2610b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f2611c;

    /* JADX INFO: renamed from: K1.a$a, reason: collision with other inner class name */
    public static final class C0048a extends AbstractC0400d implements List, RandomAccess, Serializable, V1.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Object[] f2612a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f2613b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f2614c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final C0048a f2615d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final a f2616e;

        /* JADX INFO: renamed from: K1.a$a$a, reason: collision with other inner class name */
        private static final class C0049a implements ListIterator, V1.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final C0048a f2617a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private int f2618b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private int f2619c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f2620d;

            public C0049a(C0048a list, int i3) {
                m.e(list, "list");
                this.f2617a = list;
                this.f2618b = i3;
                this.f2619c = -1;
                this.f2620d = ((AbstractList) list).modCount;
            }

            private final void b() {
                if (((AbstractList) this.f2617a.f2616e).modCount != this.f2620d) {
                    throw new ConcurrentModificationException();
                }
            }

            @Override // java.util.ListIterator
            public void add(Object obj) {
                b();
                C0048a c0048a = this.f2617a;
                int i3 = this.f2618b;
                this.f2618b = i3 + 1;
                c0048a.add(i3, obj);
                this.f2619c = -1;
                this.f2620d = ((AbstractList) this.f2617a).modCount;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public boolean hasNext() {
                return this.f2618b < this.f2617a.f2614c;
            }

            @Override // java.util.ListIterator
            public boolean hasPrevious() {
                return this.f2618b > 0;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public Object next() {
                b();
                if (this.f2618b >= this.f2617a.f2614c) {
                    throw new NoSuchElementException();
                }
                int i3 = this.f2618b;
                this.f2618b = i3 + 1;
                this.f2619c = i3;
                return this.f2617a.f2612a[this.f2617a.f2613b + this.f2619c];
            }

            @Override // java.util.ListIterator
            public int nextIndex() {
                return this.f2618b;
            }

            @Override // java.util.ListIterator
            public Object previous() {
                b();
                int i3 = this.f2618b;
                if (i3 <= 0) {
                    throw new NoSuchElementException();
                }
                int i4 = i3 - 1;
                this.f2618b = i4;
                this.f2619c = i4;
                return this.f2617a.f2612a[this.f2617a.f2613b + this.f2619c];
            }

            @Override // java.util.ListIterator
            public int previousIndex() {
                return this.f2618b - 1;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public void remove() {
                b();
                int i3 = this.f2619c;
                if (i3 == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.".toString());
                }
                this.f2617a.remove(i3);
                this.f2618b = this.f2619c;
                this.f2619c = -1;
                this.f2620d = ((AbstractList) this.f2617a).modCount;
            }

            @Override // java.util.ListIterator
            public void set(Object obj) {
                b();
                int i3 = this.f2619c;
                if (i3 == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.".toString());
                }
                this.f2617a.set(i3, obj);
            }
        }

        public C0048a(Object[] backing, int i3, int i4, C0048a c0048a, a root) {
            m.e(backing, "backing");
            m.e(root, "root");
            this.f2612a = backing;
            this.f2613b = i3;
            this.f2614c = i4;
            this.f2615d = c0048a;
            this.f2616e = root;
            ((AbstractList) this).modCount = ((AbstractList) root).modCount;
        }

        private final void o(int i3, Collection collection, int i4) {
            u();
            C0048a c0048a = this.f2615d;
            if (c0048a != null) {
                c0048a.o(i3, collection, i4);
            } else {
                this.f2616e.s(i3, collection, i4);
            }
            this.f2612a = this.f2616e.f2609a;
            this.f2614c += i4;
        }

        private final void p(int i3, Object obj) {
            u();
            C0048a c0048a = this.f2615d;
            if (c0048a != null) {
                c0048a.p(i3, obj);
            } else {
                this.f2616e.t(i3, obj);
            }
            this.f2612a = this.f2616e.f2609a;
            this.f2614c++;
        }

        private final void q() {
            if (((AbstractList) this.f2616e).modCount != ((AbstractList) this).modCount) {
                throw new ConcurrentModificationException();
            }
        }

        private final void r() {
            if (t()) {
                throw new UnsupportedOperationException();
            }
        }

        private final boolean s(List list) {
            return K1.b.h(this.f2612a, this.f2613b, this.f2614c, list);
        }

        private final boolean t() {
            return this.f2616e.f2611c;
        }

        private final void u() {
            ((AbstractList) this).modCount++;
        }

        private final Object v(int i3) {
            u();
            C0048a c0048a = this.f2615d;
            this.f2614c--;
            return c0048a != null ? c0048a.v(i3) : this.f2616e.B(i3);
        }

        private final void w(int i3, int i4) {
            if (i4 > 0) {
                u();
            }
            C0048a c0048a = this.f2615d;
            if (c0048a != null) {
                c0048a.w(i3, i4);
            } else {
                this.f2616e.C(i3, i4);
            }
            this.f2614c -= i4;
        }

        private final int x(int i3, int i4, Collection collection, boolean z2) {
            C0048a c0048a = this.f2615d;
            int iX = c0048a != null ? c0048a.x(i3, i4, collection, z2) : this.f2616e.D(i3, i4, collection, z2);
            if (iX > 0) {
                u();
            }
            this.f2614c -= iX;
            return iX;
        }

        @Override // J1.AbstractC0400d
        public int a() {
            q();
            return this.f2614c;
        }

        @Override // java.util.AbstractList, java.util.List
        public void add(int i3, Object obj) {
            r();
            q();
            AbstractC0399c.f2538a.c(i3, this.f2614c);
            p(this.f2613b + i3, obj);
        }

        @Override // java.util.AbstractList, java.util.List
        public boolean addAll(int i3, Collection elements) {
            m.e(elements, "elements");
            r();
            q();
            AbstractC0399c.f2538a.c(i3, this.f2614c);
            int size = elements.size();
            o(this.f2613b + i3, elements, size);
            return size > 0;
        }

        @Override // J1.AbstractC0400d
        public Object b(int i3) {
            r();
            q();
            AbstractC0399c.f2538a.b(i3, this.f2614c);
            return v(this.f2613b + i3);
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public void clear() {
            r();
            q();
            w(this.f2613b, this.f2614c);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(Object obj) {
            q();
            return obj == this || ((obj instanceof List) && s((List) obj));
        }

        @Override // java.util.AbstractList, java.util.List
        public Object get(int i3) {
            q();
            AbstractC0399c.f2538a.b(i3, this.f2614c);
            return this.f2612a[this.f2613b + i3];
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            q();
            return K1.b.i(this.f2612a, this.f2613b, this.f2614c);
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object obj) {
            q();
            for (int i3 = 0; i3 < this.f2614c; i3++) {
                if (m.a(this.f2612a[this.f2613b + i3], obj)) {
                    return i3;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            q();
            return this.f2614c == 0;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public Iterator iterator() {
            return listIterator(0);
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object obj) {
            q();
            for (int i3 = this.f2614c - 1; i3 >= 0; i3--) {
                if (m.a(this.f2612a[this.f2613b + i3], obj)) {
                    return i3;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator listIterator() {
            return listIterator(0);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean remove(Object obj) {
            r();
            q();
            int iIndexOf = indexOf(obj);
            if (iIndexOf >= 0) {
                remove(iIndexOf);
            }
            return iIndexOf >= 0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean removeAll(Collection elements) {
            m.e(elements, "elements");
            r();
            q();
            return x(this.f2613b, this.f2614c, elements, false) > 0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean retainAll(Collection elements) {
            m.e(elements, "elements");
            r();
            q();
            return x(this.f2613b, this.f2614c, elements, true) > 0;
        }

        @Override // java.util.AbstractList, java.util.List
        public Object set(int i3, Object obj) {
            r();
            q();
            AbstractC0399c.f2538a.b(i3, this.f2614c);
            Object[] objArr = this.f2612a;
            int i4 = this.f2613b;
            Object obj2 = objArr[i4 + i3];
            objArr[i4 + i3] = obj;
            return obj2;
        }

        @Override // java.util.AbstractList, java.util.List
        public List subList(int i3, int i4) {
            AbstractC0399c.f2538a.d(i3, i4, this.f2614c);
            return new C0048a(this.f2612a, this.f2613b + i3, i4 - i3, this, this.f2616e);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public Object[] toArray() {
            q();
            Object[] objArr = this.f2612a;
            int i3 = this.f2613b;
            return AbstractC0406j.i(objArr, i3, this.f2614c + i3);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            q();
            return K1.b.j(this.f2612a, this.f2613b, this.f2614c, this);
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean add(Object obj) {
            r();
            q();
            p(this.f2613b + this.f2614c, obj);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean addAll(Collection elements) {
            m.e(elements, "elements");
            r();
            q();
            int size = elements.size();
            o(this.f2613b + this.f2614c, elements, size);
            return size > 0;
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator listIterator(int i3) {
            q();
            AbstractC0399c.f2538a.c(i3, this.f2614c);
            return new C0049a(this, i3);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public Object[] toArray(Object[] array) {
            m.e(array, "array");
            q();
            int length = array.length;
            int i3 = this.f2614c;
            if (length >= i3) {
                Object[] objArr = this.f2612a;
                int i4 = this.f2613b;
                AbstractC0406j.e(objArr, array, 0, i4, i3 + i4);
                return AbstractC0411o.f(this.f2614c, array);
            }
            Object[] objArr2 = this.f2612a;
            int i5 = this.f2613b;
            Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr2, i5, i3 + i5, array.getClass());
            m.d(objArrCopyOfRange, "copyOfRange(...)");
            return objArrCopyOfRange;
        }
    }

    private static final class b {
        private b() {
        }

        public /* synthetic */ b(h hVar) {
            this();
        }
    }

    private static final class c implements ListIterator, V1.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final a f2621a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f2622b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f2623c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f2624d;

        public c(a list, int i3) {
            m.e(list, "list");
            this.f2621a = list;
            this.f2622b = i3;
            this.f2623c = -1;
            this.f2624d = ((AbstractList) list).modCount;
        }

        private final void b() {
            if (((AbstractList) this.f2621a).modCount != this.f2624d) {
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.ListIterator
        public void add(Object obj) {
            b();
            a aVar = this.f2621a;
            int i3 = this.f2622b;
            this.f2622b = i3 + 1;
            aVar.add(i3, obj);
            this.f2623c = -1;
            this.f2624d = ((AbstractList) this.f2621a).modCount;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f2622b < this.f2621a.f2610b;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f2622b > 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public Object next() {
            b();
            if (this.f2622b >= this.f2621a.f2610b) {
                throw new NoSuchElementException();
            }
            int i3 = this.f2622b;
            this.f2622b = i3 + 1;
            this.f2623c = i3;
            return this.f2621a.f2609a[this.f2623c];
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f2622b;
        }

        @Override // java.util.ListIterator
        public Object previous() {
            b();
            int i3 = this.f2622b;
            if (i3 <= 0) {
                throw new NoSuchElementException();
            }
            int i4 = i3 - 1;
            this.f2622b = i4;
            this.f2623c = i4;
            return this.f2621a.f2609a[this.f2623c];
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f2622b - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            b();
            int i3 = this.f2623c;
            if (i3 == -1) {
                throw new IllegalStateException("Call next() or previous() before removing element from the iterator.".toString());
            }
            this.f2621a.remove(i3);
            this.f2622b = this.f2623c;
            this.f2623c = -1;
            this.f2624d = ((AbstractList) this.f2621a).modCount;
        }

        @Override // java.util.ListIterator
        public void set(Object obj) {
            b();
            int i3 = this.f2623c;
            if (i3 == -1) {
                throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.".toString());
            }
            this.f2621a.set(i3, obj);
        }
    }

    static {
        a aVar = new a(0);
        aVar.f2611c = true;
        f2608e = aVar;
    }

    public a(int i3) {
        this.f2609a = K1.b.d(i3);
    }

    private final void A() {
        ((AbstractList) this).modCount++;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object B(int i3) {
        A();
        Object[] objArr = this.f2609a;
        Object obj = objArr[i3];
        AbstractC0406j.e(objArr, objArr, i3, i3 + 1, this.f2610b);
        K1.b.f(this.f2609a, this.f2610b - 1);
        this.f2610b--;
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C(int i3, int i4) {
        if (i4 > 0) {
            A();
        }
        Object[] objArr = this.f2609a;
        AbstractC0406j.e(objArr, objArr, i3, i3 + i4, this.f2610b);
        Object[] objArr2 = this.f2609a;
        int i5 = this.f2610b;
        K1.b.g(objArr2, i5 - i4, i5);
        this.f2610b -= i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int D(int i3, int i4, Collection collection, boolean z2) {
        int i5 = 0;
        int i6 = 0;
        while (i5 < i4) {
            int i7 = i3 + i5;
            if (collection.contains(this.f2609a[i7]) == z2) {
                Object[] objArr = this.f2609a;
                i5++;
                objArr[i6 + i3] = objArr[i7];
                i6++;
            } else {
                i5++;
            }
        }
        int i8 = i4 - i6;
        Object[] objArr2 = this.f2609a;
        AbstractC0406j.e(objArr2, objArr2, i3 + i6, i4 + i3, this.f2610b);
        Object[] objArr3 = this.f2609a;
        int i9 = this.f2610b;
        K1.b.g(objArr3, i9 - i8, i9);
        if (i8 > 0) {
            A();
        }
        this.f2610b -= i8;
        return i8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s(int i3, Collection collection, int i4) {
        A();
        z(i3, i4);
        Iterator it = collection.iterator();
        for (int i5 = 0; i5 < i4; i5++) {
            this.f2609a[i3 + i5] = it.next();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t(int i3, Object obj) {
        A();
        z(i3, 1);
        this.f2609a[i3] = obj;
    }

    private final void v() {
        if (this.f2611c) {
            throw new UnsupportedOperationException();
        }
    }

    private final boolean w(List list) {
        return K1.b.h(this.f2609a, 0, this.f2610b, list);
    }

    private final void x(int i3) {
        if (i3 < 0) {
            throw new OutOfMemoryError();
        }
        Object[] objArr = this.f2609a;
        if (i3 > objArr.length) {
            this.f2609a = K1.b.e(this.f2609a, AbstractC0399c.f2538a.e(objArr.length, i3));
        }
    }

    private final void y(int i3) {
        x(this.f2610b + i3);
    }

    private final void z(int i3, int i4) {
        y(i4);
        Object[] objArr = this.f2609a;
        AbstractC0406j.e(objArr, objArr, i3 + i4, i3, this.f2610b);
        this.f2610b += i4;
    }

    @Override // J1.AbstractC0400d
    public int a() {
        return this.f2610b;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i3, Object obj) {
        v();
        AbstractC0399c.f2538a.c(i3, this.f2610b);
        t(i3, obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i3, Collection elements) {
        m.e(elements, "elements");
        v();
        AbstractC0399c.f2538a.c(i3, this.f2610b);
        int size = elements.size();
        s(i3, elements, size);
        return size > 0;
    }

    @Override // J1.AbstractC0400d
    public Object b(int i3) {
        v();
        AbstractC0399c.f2538a.b(i3, this.f2610b);
        return B(i3);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        v();
        C(0, this.f2610b);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof List) && w((List) obj));
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i3) {
        AbstractC0399c.f2538a.b(i3, this.f2610b);
        return this.f2609a[i3];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        return K1.b.i(this.f2609a, 0, this.f2610b);
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        for (int i3 = 0; i3 < this.f2610b; i3++) {
            if (m.a(this.f2609a[i3], obj)) {
                return i3;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return this.f2610b == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        for (int i3 = this.f2610b - 1; i3 >= 0; i3--) {
            if (m.a(this.f2609a[i3], obj)) {
                return i3;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        v();
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            remove(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection elements) {
        m.e(elements, "elements");
        v();
        return D(0, this.f2610b, elements, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection elements) {
        m.e(elements, "elements");
        v();
        return D(0, this.f2610b, elements, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i3, Object obj) {
        v();
        AbstractC0399c.f2538a.b(i3, this.f2610b);
        Object[] objArr = this.f2609a;
        Object obj2 = objArr[i3];
        objArr[i3] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public List subList(int i3, int i4) {
        AbstractC0399c.f2538a.d(i3, i4, this.f2610b);
        return new C0048a(this.f2609a, i3, i4 - i3, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        return AbstractC0406j.i(this.f2609a, 0, this.f2610b);
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return K1.b.j(this.f2609a, 0, this.f2610b, this);
    }

    public final List u() {
        v();
        this.f2611c = true;
        return this.f2610b > 0 ? this : f2608e;
    }

    public /* synthetic */ a(int i3, int i4, h hVar) {
        this((i4 & 1) != 0 ? 10 : i3);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        v();
        t(this.f2610b, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection elements) {
        m.e(elements, "elements");
        v();
        int size = elements.size();
        s(this.f2610b, elements, size);
        return size > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator listIterator(int i3) {
        AbstractC0399c.f2538a.c(i3, this.f2610b);
        return new c(this, i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray(Object[] array) {
        m.e(array, "array");
        int length = array.length;
        int i3 = this.f2610b;
        if (length >= i3) {
            AbstractC0406j.e(this.f2609a, array, 0, 0, i3);
            return AbstractC0411o.f(this.f2610b, array);
        }
        Object[] objArrCopyOfRange = Arrays.copyOfRange(this.f2609a, 0, i3, array.getClass());
        m.d(objArrCopyOfRange, "copyOfRange(...)");
        return objArrCopyOfRange;
    }
}
