package j2;

import c2.K;
import h2.AbstractC0895l;

/* JADX INFO: loaded from: classes.dex */
public final class c extends f {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final c f9423n = new c();

    private c() {
        super(j.f9435c, j.f9436d, j.f9437e, j.f9433a);
    }

    @Override // c2.K
    public K W(int i3, String str) {
        AbstractC0895l.a(i3);
        return i3 >= j.f9435c ? AbstractC0895l.b(this, str) : super.W(i3, str);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // c2.K
    public String toString() {
        return "Dispatchers.Default";
    }
}
