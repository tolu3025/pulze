package J1;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
class J extends AbstractC0399c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f2515b;

    public static final class a implements ListIterator, V1.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ListIterator f2516a;

        a(int i3) {
            this.f2516a = J.this.f2515b.listIterator(v.z(J.this, i3));
        }

        @Override // java.util.ListIterator
        public void add(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f2516a.hasPrevious();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f2516a.hasNext();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public Object next() {
            return this.f2516a.previous();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return v.y(J.this, this.f2516a.previousIndex());
        }

        @Override // java.util.ListIterator
        public Object previous() {
            return this.f2516a.next();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return v.y(J.this, this.f2516a.nextIndex());
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public void set(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public J(List delegate) {
        kotlin.jvm.internal.m.e(delegate, "delegate");
        this.f2515b = delegate;
    }

    @Override // J1.AbstractC0397a
    public int a() {
        return this.f2515b.size();
    }

    @Override // J1.AbstractC0399c, java.util.List
    public Object get(int i3) {
        return this.f2515b.get(v.x(this, i3));
    }

    @Override // J1.AbstractC0399c, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // J1.AbstractC0399c, java.util.List
    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // J1.AbstractC0399c, java.util.List
    public ListIterator listIterator(int i3) {
        return new a(i3);
    }
}
