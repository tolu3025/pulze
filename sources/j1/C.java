package J1;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class C implements Iterator, V1.a {
    public abstract int b();

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Object next() {
        return Integer.valueOf(b());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
