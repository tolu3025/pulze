package G1;

import e0.AbstractC0825f;
import y1.AbstractC1308k;
import y1.C1298a;
import y1.Z;

/* JADX INFO: loaded from: classes.dex */
public abstract class a extends AbstractC1308k {
    @Override // y1.o0
    public void a(int i3) {
        o().a(i3);
    }

    @Override // y1.o0
    public void b(int i3, long j3, long j4) {
        o().b(i3, j3, j4);
    }

    @Override // y1.o0
    public void c(long j3) {
        o().c(j3);
    }

    @Override // y1.o0
    public void d(long j3) {
        o().d(j3);
    }

    @Override // y1.o0
    public void e(int i3) {
        o().e(i3);
    }

    @Override // y1.o0
    public void f(int i3, long j3, long j4) {
        o().f(i3, j3, j4);
    }

    @Override // y1.o0
    public void g(long j3) {
        o().g(j3);
    }

    @Override // y1.o0
    public void h(long j3) {
        o().h(j3);
    }

    @Override // y1.AbstractC1308k
    public void j() {
        o().j();
    }

    @Override // y1.AbstractC1308k
    public void k() {
        o().k();
    }

    @Override // y1.AbstractC1308k
    public void l(Z z2) {
        o().l(z2);
    }

    @Override // y1.AbstractC1308k
    public void m() {
        o().m();
    }

    @Override // y1.AbstractC1308k
    public void n(C1298a c1298a, Z z2) {
        o().n(c1298a, z2);
    }

    protected abstract AbstractC1308k o();

    public String toString() {
        return AbstractC0825f.b(this).d("delegate", o()).toString();
    }
}
