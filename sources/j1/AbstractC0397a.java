package J1;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: J1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0397a implements Collection, V1.a {

    /* JADX INFO: renamed from: J1.a$a, reason: collision with other inner class name */
    static final class C0046a extends kotlin.jvm.internal.n implements U1.l {
        C0046a() {
            super(1);
        }

        @Override // U1.l
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(Object obj) {
            return obj == AbstractC0397a.this ? "(this Collection)" : String.valueOf(obj);
        }
    }

    protected AbstractC0397a() {
    }

    public abstract int a();

    @Override // java.util.Collection
    public boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        if (isEmpty()) {
            return false;
        }
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            if (kotlin.jvm.internal.m.a(it.next(), obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection elements) {
        kotlin.jvm.internal.m.e(elements, "elements");
        if (elements.isEmpty()) {
            return true;
        }
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return a();
    }

    @Override // java.util.Collection, java.util.List
    public Object[] toArray() {
        return kotlin.jvm.internal.g.a(this);
    }

    public String toString() {
        return x.G(this, ", ", "[", "]", 0, null, new C0046a(), 24, null);
    }

    @Override // java.util.Collection, java.util.List
    public Object[] toArray(Object[] array) {
        kotlin.jvm.internal.m.e(array, "array");
        return kotlin.jvm.internal.g.b(this, array);
    }
}
