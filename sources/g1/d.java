package G1;

import e0.AbstractC0825f;
import java.util.List;
import y1.AbstractC1303f;
import y1.C1298a;
import y1.S;

/* JADX INFO: loaded from: classes.dex */
public abstract class d extends S.i {
    @Override // y1.S.i
    public List b() {
        return j().b();
    }

    @Override // y1.S.i
    public C1298a c() {
        return j().c();
    }

    @Override // y1.S.i
    public AbstractC1303f d() {
        return j().d();
    }

    @Override // y1.S.i
    public Object e() {
        return j().e();
    }

    @Override // y1.S.i
    public void f() {
        j().f();
    }

    @Override // y1.S.i
    public void g() {
        j().g();
    }

    @Override // y1.S.i
    public void h(S.k kVar) {
        j().h(kVar);
    }

    @Override // y1.S.i
    public void i(List list) {
        j().i(list);
    }

    protected abstract S.i j();

    public String toString() {
        return AbstractC0825f.b(this).d("delegate", j()).toString();
    }
}
