package G1;

import e0.AbstractC0825f;
import java.util.concurrent.ScheduledExecutorService;
import y1.AbstractC1303f;
import y1.EnumC1313p;
import y1.S;
import y1.p0;

/* JADX INFO: loaded from: classes.dex */
public abstract class c extends S.e {
    @Override // y1.S.e
    public S.i a(S.b bVar) {
        return g().a(bVar);
    }

    @Override // y1.S.e
    public AbstractC1303f b() {
        return g().b();
    }

    @Override // y1.S.e
    public ScheduledExecutorService c() {
        return g().c();
    }

    @Override // y1.S.e
    public p0 d() {
        return g().d();
    }

    @Override // y1.S.e
    public void e() {
        g().e();
    }

    @Override // y1.S.e
    public void f(EnumC1313p enumC1313p, S.j jVar) {
        g().f(enumC1313p, jVar);
    }

    protected abstract S.e g();

    public String toString() {
        return AbstractC0825f.b(this).d("delegate", g()).toString();
    }
}
