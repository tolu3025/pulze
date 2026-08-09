package h2;

import c2.InterfaceC0561f0;
import c2.InterfaceC0576n;
import c2.U;
import c2.X;

/* JADX INFO: loaded from: classes.dex */
public final class v extends c2.K implements X {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ X f7476c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c2.K f7477d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f7478e;

    /* JADX WARN: Multi-variable type inference failed */
    public v(c2.K k3, String str) {
        X x2 = k3 instanceof X ? (X) k3 : null;
        this.f7476c = x2 == null ? U.a() : x2;
        this.f7477d = k3;
        this.f7478e = str;
    }

    @Override // c2.X
    public void L(long j3, InterfaceC0576n interfaceC0576n) {
        this.f7476c.L(j3, interfaceC0576n);
    }

    @Override // c2.K
    public void U(M1.g gVar, Runnable runnable) {
        this.f7477d.U(gVar, runnable);
    }

    @Override // c2.K
    public boolean V(M1.g gVar) {
        return this.f7477d.V(gVar);
    }

    @Override // c2.X
    public InterfaceC0561f0 b(long j3, Runnable runnable, M1.g gVar) {
        return this.f7476c.b(j3, runnable, gVar);
    }

    @Override // c2.K
    public String toString() {
        return this.f7478e;
    }
}
