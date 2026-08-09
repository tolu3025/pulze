package c2;

import h2.C0898o;

/* JADX INFO: loaded from: classes.dex */
public abstract class E0 extends C0898o implements InterfaceC0561f0, InterfaceC0592v0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public F0 f5058d;

    @Override // c2.InterfaceC0592v0
    public K0 a() {
        return null;
    }

    @Override // c2.InterfaceC0561f0
    public void e() {
        u().w0(this);
    }

    @Override // c2.InterfaceC0592v0
    public boolean isActive() {
        return true;
    }

    @Override // h2.C0898o
    public String toString() {
        return S.a(this) + '@' + S.b(this) + "[job@" + S.b(u()) + ']';
    }

    public final F0 u() {
        F0 f02 = this.f5058d;
        if (f02 != null) {
            return f02;
        }
        kotlin.jvm.internal.m.p("job");
        return null;
    }

    public abstract boolean v();

    public abstract void w(Throwable th);

    public final void x(F0 f02) {
        this.f5058d = f02;
    }
}
