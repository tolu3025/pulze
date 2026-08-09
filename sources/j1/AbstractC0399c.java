package J1;

import com.google.android.gms.common.api.a;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/* JADX INFO: renamed from: J1.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0399c extends AbstractC0397a implements List, V1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f2538a = new a(null);

    /* JADX INFO: renamed from: J1.c$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.h hVar) {
            this();
        }

        public final void a(int i3, int i4, int i5) {
            if (i3 < 0 || i4 > i5) {
                throw new IndexOutOfBoundsException("startIndex: " + i3 + ", endIndex: " + i4 + ", size: " + i5);
            }
            if (i3 <= i4) {
                return;
            }
            throw new IllegalArgumentException("startIndex: " + i3 + " > endIndex: " + i4);
        }

        public final void b(int i3, int i4) {
            if (i3 < 0 || i3 >= i4) {
                throw new IndexOutOfBoundsException("index: " + i3 + ", size: " + i4);
            }
        }

        public final void c(int i3, int i4) {
            if (i3 < 0 || i3 > i4) {
                throw new IndexOutOfBoundsException("index: " + i3 + ", size: " + i4);
            }
        }

        public final void d(int i3, int i4, int i5) {
            if (i3 < 0 || i4 > i5) {
                throw new IndexOutOfBoundsException("fromIndex: " + i3 + ", toIndex: " + i4 + ", size: " + i5);
            }
            if (i3 <= i4) {
                return;
            }
            throw new IllegalArgumentException("fromIndex: " + i3 + " > toIndex: " + i4);
        }

        public final int e(int i3, int i4) {
            int i5 = i3 + (i3 >> 1);
            if (i5 - i4 < 0) {
                i5 = i4;
            }
            if (i5 - 2147483639 <= 0) {
                return i5;
            }
            if (i4 > 2147483639) {
                return a.e.API_PRIORITY_OTHER;
            }
            return 2147483639;
        }

        public final boolean f(Collection c3, Collection other) {
            kotlin.jvm.internal.m.e(c3, "c");
            kotlin.jvm.internal.m.e(other, "other");
            if (c3.size() != other.size()) {
                return false;
            }
            Iterator it = other.iterator();
            Iterator it2 = c3.iterator();
            while (it2.hasNext()) {
                if (!kotlin.jvm.internal.m.a(it2.next(), it.next())) {
                    return false;
                }
            }
            return true;
        }

        public final int g(Collection c3) {
            kotlin.jvm.internal.m.e(c3, "c");
            Iterator it = c3.iterator();
            int iHashCode = 1;
            while (it.hasNext()) {
                Object next = it.next();
                iHashCode = (iHashCode * 31) + (next != null ? next.hashCode() : 0);
            }
            return iHashCode;
        }
    }

    /* JADX INFO: renamed from: J1.c$b */
    private class b implements Iterator, V1.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f2539a;

        public b() {
        }

        protected final int b() {
            return this.f2539a;
        }

        protected final void c(int i3) {
            this.f2539a = i3;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f2539a < AbstractC0399c.this.size();
        }

        @Override // java.util.Iterator
        public Object next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            AbstractC0399c abstractC0399c = AbstractC0399c.this;
            int i3 = this.f2539a;
            this.f2539a = i3 + 1;
            return abstractC0399c.get(i3);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX INFO: renamed from: J1.c$c, reason: collision with other inner class name */
    private class C0047c extends b implements ListIterator, V1.a {
        public C0047c(int i3) {
            super();
            AbstractC0399c.f2538a.c(i3, AbstractC0399c.this.size());
            c(i3);
        }

        @Override // java.util.ListIterator
        public void add(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return b() > 0;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return b();
        }

        @Override // java.util.ListIterator
        public Object previous() {
            if (!hasPrevious()) {
                throw new NoSuchElementException();
            }
            AbstractC0399c abstractC0399c = AbstractC0399c.this;
            c(b() - 1);
            return abstractC0399c.get(b());
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return b() - 1;
        }

        @Override // java.util.ListIterator
        public void set(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX INFO: renamed from: J1.c$d */
    private static final class d extends AbstractC0399c implements RandomAccess {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final AbstractC0399c f2542b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f2543c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f2544d;

        public d(AbstractC0399c list, int i3, int i4) {
            kotlin.jvm.internal.m.e(list, "list");
            this.f2542b = list;
            this.f2543c = i3;
            AbstractC0399c.f2538a.d(i3, i4, list.size());
            this.f2544d = i4 - i3;
        }

        @Override // J1.AbstractC0397a
        public int a() {
            return this.f2544d;
        }

        @Override // J1.AbstractC0399c, java.util.List
        public Object get(int i3) {
            AbstractC0399c.f2538a.b(i3, this.f2544d);
            return this.f2542b.get(this.f2543c + i3);
        }
    }

    protected AbstractC0399c() {
    }

    @Override // java.util.List
    public void add(int i3, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i3, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            return f2538a.f(this, (Collection) obj);
        }
        return false;
    }

    public abstract Object get(int i3);

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        return f2538a.g(this);
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        Iterator it = iterator();
        int i3 = 0;
        while (it.hasNext()) {
            if (kotlin.jvm.internal.m.a(it.next(), obj)) {
                return i3;
            }
            i3++;
        }
        return -1;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return new b();
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        ListIterator listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (kotlin.jvm.internal.m.a(listIterator.previous(), obj)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    public ListIterator listIterator() {
        return new C0047c(0);
    }

    @Override // java.util.List
    public Object remove(int i3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public Object set(int i3, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public List subList(int i3, int i4) {
        return new d(this, i3, i4);
    }

    public ListIterator listIterator(int i3) {
        return new C0047c(i3);
    }
}
