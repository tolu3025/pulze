package j2;

import c2.K;
import h2.AbstractC0895l;

/* JADX INFO: loaded from: classes.dex */
final class k extends K {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final k f9439c = new k();

    private k() {
    }

    @Override // c2.K
    public void U(M1.g gVar, Runnable runnable) {
        c.f9423n.a0(runnable, true, false);
    }

    @Override // c2.K
    public K W(int i3, String str) {
        AbstractC0895l.a(i3);
        return i3 >= j.f9436d ? AbstractC0895l.b(this, str) : super.W(i3, str);
    }

    @Override // c2.K
    public String toString() {
        return "Dispatchers.IO";
    }
}
