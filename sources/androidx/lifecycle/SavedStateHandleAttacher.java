package androidx.lifecycle;

import androidx.lifecycle.AbstractC0516e;

/* JADX INFO: loaded from: classes.dex */
public final class SavedStateHandleAttacher implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u f4727a;

    public SavedStateHandleAttacher(u provider) {
        kotlin.jvm.internal.m.e(provider, "provider");
        this.f4727a = provider;
    }

    @Override // androidx.lifecycle.g
    public void d(i source, AbstractC0516e.a event) {
        kotlin.jvm.internal.m.e(source, "source");
        kotlin.jvm.internal.m.e(event, "event");
        if (event == AbstractC0516e.a.ON_CREATE) {
            source.a().c(this);
            this.f4727a.d();
        } else {
            throw new IllegalStateException(("Next event must be ON_CREATE, it was " + event).toString());
        }
    }
}
