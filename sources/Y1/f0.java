package y1;

import e0.AbstractC0825f;

/* JADX INFO: loaded from: classes.dex */
abstract class f0 extends AbstractC1304g {
    f0() {
    }

    @Override // y1.AbstractC1304g
    public void a(String str, Throwable th) {
        f().a(str, th);
    }

    @Override // y1.AbstractC1304g
    public void b() {
        f().b();
    }

    @Override // y1.AbstractC1304g
    public void c(int i3) {
        f().c(i3);
    }

    protected abstract AbstractC1304g f();

    public String toString() {
        return AbstractC0825f.b(this).d("delegate", f()).toString();
    }
}
