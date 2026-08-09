package J1;

import java.util.Iterator;

/* JADX INFO: renamed from: J1.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0409m implements Iterator, V1.a {
    public abstract char b();

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Object next() {
        return Character.valueOf(b());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
