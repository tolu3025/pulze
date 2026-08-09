package c2;

import c.AbstractC0527b;

/* JADX INFO: loaded from: classes.dex */
public final class Z0 extends K {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Z0 f5115c = new Z0();

    private Z0() {
    }

    @Override // c2.K
    public void U(M1.g gVar, Runnable runnable) {
        AbstractC0527b.a(gVar.get(d1.f5125b));
        throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
    }

    @Override // c2.K
    public boolean V(M1.g gVar) {
        return false;
    }

    @Override // c2.K
    public K W(int i3, String str) {
        throw new UnsupportedOperationException("limitedParallelism is not supported for Dispatchers.Unconfined");
    }

    @Override // c2.K
    public String toString() {
        return "Dispatchers.Unconfined";
    }
}
