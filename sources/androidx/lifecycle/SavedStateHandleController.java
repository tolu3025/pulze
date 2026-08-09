package androidx.lifecycle;

import androidx.lifecycle.AbstractC0516e;

/* JADX INFO: loaded from: classes.dex */
public final class SavedStateHandleController implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f4728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final s f4729b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f4730c;

    public SavedStateHandleController(String key, s handle) {
        kotlin.jvm.internal.m.e(key, "key");
        kotlin.jvm.internal.m.e(handle, "handle");
        this.f4728a = key;
        this.f4729b = handle;
    }

    @Override // androidx.lifecycle.g
    public void d(i source, AbstractC0516e.a event) {
        kotlin.jvm.internal.m.e(source, "source");
        kotlin.jvm.internal.m.e(event, "event");
        if (event == AbstractC0516e.a.ON_DESTROY) {
            this.f4730c = false;
            source.a().c(this);
        }
    }

    public final void e(androidx.savedstate.a registry, AbstractC0516e lifecycle) {
        kotlin.jvm.internal.m.e(registry, "registry");
        kotlin.jvm.internal.m.e(lifecycle, "lifecycle");
        if (!(!this.f4730c)) {
            throw new IllegalStateException("Already attached to lifecycleOwner".toString());
        }
        this.f4730c = true;
        lifecycle.a(this);
        registry.h(this.f4728a, this.f4729b.c());
    }

    public final s i() {
        return this.f4729b;
    }

    public final boolean j() {
        return this.f4730c;
    }
}
