package t;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: t.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1220b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f11274a;

    public C1220b(boolean z2) {
        this.f11274a = new AtomicBoolean(z2);
    }

    public final boolean a() {
        return this.f11274a.get();
    }

    public final void b(boolean z2) {
        this.f11274a.set(z2);
    }
}
