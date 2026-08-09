package G1;

import e0.AbstractC0825f;
import y1.S;
import y1.l0;

/* JADX INFO: loaded from: classes.dex */
public abstract class b extends S {
    @Override // y1.S
    public boolean b() {
        return g().b();
    }

    @Override // y1.S
    public void c(l0 l0Var) {
        g().c(l0Var);
    }

    @Override // y1.S
    public void d(S.h hVar) {
        g().d(hVar);
    }

    @Override // y1.S
    public void e() {
        g().e();
    }

    protected abstract S g();

    public String toString() {
        return AbstractC0825f.b(this).d("delegate", g()).toString();
    }
}
