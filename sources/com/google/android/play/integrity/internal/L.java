package com.google.android.play.integrity.internal;

/* JADX INFO: loaded from: classes.dex */
final class L extends H {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final /* synthetic */ C0656f f5870l;

    L(C0656f c0656f) {
        this.f5870l = c0656f;
    }

    @Override // com.google.android.play.integrity.internal.H
    public final void b() {
        synchronized (this.f5870l.f5883f) {
            try {
                if (this.f5870l.f5889l.get() > 0 && this.f5870l.f5889l.decrementAndGet() > 0) {
                    this.f5870l.f5879b.d("Leaving the connection open for other ongoing calls.", new Object[0]);
                    return;
                }
                C0656f c0656f = this.f5870l;
                if (c0656f.f5891n != null) {
                    c0656f.f5879b.d("Unbind from service.", new Object[0]);
                    C0656f c0656f2 = this.f5870l;
                    c0656f2.f5878a.unbindService(c0656f2.f5890m);
                    this.f5870l.f5884g = false;
                    this.f5870l.f5891n = null;
                    this.f5870l.f5890m = null;
                }
                this.f5870l.x();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
