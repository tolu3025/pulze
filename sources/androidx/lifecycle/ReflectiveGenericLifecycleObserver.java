package androidx.lifecycle;

import androidx.lifecycle.AbstractC0516e;
import androidx.lifecycle.C0513b;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
class ReflectiveGenericLifecycleObserver implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f4725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C0513b.a f4726b;

    ReflectiveGenericLifecycleObserver(Object obj) {
        this.f4725a = obj;
        this.f4726b = C0513b.f4731c.c(obj.getClass());
    }

    @Override // androidx.lifecycle.g
    public void d(i iVar, AbstractC0516e.a aVar) {
        this.f4726b.a(iVar, aVar, this.f4725a);
    }
}
