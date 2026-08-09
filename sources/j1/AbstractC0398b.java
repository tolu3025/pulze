package J1;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: J1.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0398b implements Iterator, V1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f2536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object f2537b;

    private final boolean e() {
        this.f2536a = 3;
        b();
        return this.f2536a == 1;
    }

    protected abstract void b();

    protected final void c() {
        this.f2536a = 2;
    }

    protected final void d(Object obj) {
        this.f2537b = obj;
        this.f2536a = 1;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        int i3 = this.f2536a;
        if (i3 == 0) {
            return e();
        }
        if (i3 == 1) {
            return true;
        }
        if (i3 == 2) {
            return false;
        }
        throw new IllegalArgumentException("hasNext called when the iterator is in the FAILED state.");
    }

    @Override // java.util.Iterator
    public Object next() {
        int i3 = this.f2536a;
        if (i3 != 1 && (i3 == 2 || !e())) {
            throw new NoSuchElementException();
        }
        this.f2536a = 0;
        return this.f2537b;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
