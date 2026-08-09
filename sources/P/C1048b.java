package p;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: p.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1048b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicInteger f10007a;

    public C1048b(int i3) {
        this.f10007a = new AtomicInteger(i3);
    }

    public final int a() {
        return this.f10007a.decrementAndGet();
    }

    public final int b() {
        return this.f10007a.get();
    }

    public final int c() {
        return this.f10007a.getAndIncrement();
    }

    public final int d() {
        return this.f10007a.incrementAndGet();
    }
}
