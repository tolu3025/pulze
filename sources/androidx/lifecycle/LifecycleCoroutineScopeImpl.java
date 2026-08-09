package androidx.lifecycle;

import androidx.lifecycle.AbstractC0516e;
import c2.D0;

/* JADX INFO: loaded from: classes.dex */
public final class LifecycleCoroutineScopeImpl extends AbstractC0517f implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AbstractC0516e f4705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final M1.g f4706b;

    @Override // androidx.lifecycle.g
    public void d(i source, AbstractC0516e.a event) {
        kotlin.jvm.internal.m.e(source, "source");
        kotlin.jvm.internal.m.e(event, "event");
        if (i().b().compareTo(AbstractC0516e.b.DESTROYED) <= 0) {
            i().c(this);
            D0.d(e(), null, 1, null);
        }
    }

    @Override // c2.N
    public M1.g e() {
        return this.f4706b;
    }

    public AbstractC0516e i() {
        return this.f4705a;
    }
}
