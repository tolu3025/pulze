package f0;

import e0.AbstractC0829j;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: f0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC0842a extends AbstractC0841A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f7188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f7189b;

    protected AbstractC0842a(int i3, int i4) {
        AbstractC0829j.q(i4, i3);
        this.f7188a = i3;
        this.f7189b = i4;
    }

    protected abstract Object b(int i3);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f7189b < this.f7188a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f7189b > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i3 = this.f7189b;
        this.f7189b = i3 + 1;
        return b(i3);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f7189b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i3 = this.f7189b - 1;
        this.f7189b = i3;
        return b(i3);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f7189b - 1;
    }
}
