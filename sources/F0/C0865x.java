package f0;

import e0.AbstractC0829j;

/* JADX INFO: renamed from: f0.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C0865x extends AbstractC0853l {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final transient Object f7244c;

    C0865x(Object obj) {
        this.f7244c = AbstractC0829j.n(obj);
    }

    @Override // f0.AbstractC0853l, f0.AbstractC0850i
    public AbstractC0851j a() {
        return AbstractC0851j.w(this.f7244c);
    }

    @Override // f0.AbstractC0850i
    int b(Object[] objArr, int i3) {
        objArr[i3] = this.f7244c;
        return i3 + 1;
    }

    @Override // f0.AbstractC0850i, java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return this.f7244c.equals(obj);
    }

    @Override // f0.AbstractC0853l, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f7244c.hashCode();
    }

    @Override // f0.AbstractC0850i
    boolean m() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: s */
    public AbstractC0867z iterator() {
        return AbstractC0854m.b(this.f7244c);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return '[' + this.f7244c.toString() + ']';
    }
}
