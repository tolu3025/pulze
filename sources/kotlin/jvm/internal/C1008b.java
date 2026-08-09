package kotlin.jvm.internal;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: kotlin.jvm.internal.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1008b implements Iterator, V1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object[] f9734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f9735b;

    public C1008b(Object[] array) {
        m.e(array, "array");
        this.f9734a = array;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f9735b < this.f9734a.length;
    }

    @Override // java.util.Iterator
    public Object next() {
        try {
            Object[] objArr = this.f9734a;
            int i3 = this.f9735b;
            this.f9735b = i3 + 1;
            return objArr[i3];
        } catch (ArrayIndexOutOfBoundsException e3) {
            this.f9735b--;
            throw new NoSuchElementException(e3.getMessage());
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
