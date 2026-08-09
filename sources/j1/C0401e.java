package J1;

import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC1009c;

/* JADX INFO: renamed from: J1.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C0401e implements Collection, V1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object[] f2545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f2546b;

    public C0401e(Object[] values, boolean z2) {
        kotlin.jvm.internal.m.e(values, "values");
        this.f2545a = values;
        this.f2546b = z2;
    }

    public int a() {
        return this.f2545a.length;
    }

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
        return AbstractC0407k.o(this.f2545a, obj);
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
        return this.f2545a.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return AbstractC1009c.a(this.f2545a);
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

    @Override // java.util.Collection
    public final Object[] toArray() {
        return AbstractC0411o.b(this.f2545a, this.f2546b);
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] array) {
        kotlin.jvm.internal.m.e(array, "array");
        return kotlin.jvm.internal.g.b(this, array);
    }
}
