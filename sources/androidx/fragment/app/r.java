package androidx.fragment.app;

import androidx.lifecycle.AbstractC0516e;

/* JADX INFO: loaded from: classes.dex */
class r implements androidx.lifecycle.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private androidx.lifecycle.j f4696a = null;

    r() {
    }

    @Override // androidx.lifecycle.i
    public AbstractC0516e a() {
        c();
        return this.f4696a;
    }

    void b(AbstractC0516e.a aVar) {
        this.f4696a.h(aVar);
    }

    void c() {
        if (this.f4696a == null) {
            this.f4696a = new androidx.lifecycle.j(this);
        }
    }

    boolean d() {
        return this.f4696a != null;
    }
}
