package c2;

import J1.C0402f;
import h2.AbstractC0895l;

/* JADX INFO: renamed from: c2.j0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0569j0 extends K {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f5149c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f5150d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private C0402f f5151e;

    public static /* synthetic */ void Z(AbstractC0569j0 abstractC0569j0, boolean z2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decrementUseCount");
        }
        if ((i3 & 1) != 0) {
            z2 = false;
        }
        abstractC0569j0.Y(z2);
    }

    private final long a0(boolean z2) {
        return z2 ? 4294967296L : 1L;
    }

    public static /* synthetic */ void e0(AbstractC0569j0 abstractC0569j0, boolean z2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incrementUseCount");
        }
        if ((i3 & 1) != 0) {
            z2 = false;
        }
        abstractC0569j0.d0(z2);
    }

    @Override // c2.K
    public final K W(int i3, String str) {
        AbstractC0895l.a(i3);
        return AbstractC0895l.b(this, str);
    }

    public final void Y(boolean z2) {
        long jA0 = this.f5149c - a0(z2);
        this.f5149c = jA0;
        if (jA0 <= 0 && this.f5150d) {
            shutdown();
        }
    }

    public final void b0(AbstractC0551a0 abstractC0551a0) {
        C0402f c0402f = this.f5151e;
        if (c0402f == null) {
            c0402f = new C0402f();
            this.f5151e = c0402f;
        }
        c0402f.addLast(abstractC0551a0);
    }

    protected long c0() {
        C0402f c0402f = this.f5151e;
        return (c0402f == null || c0402f.isEmpty()) ? Long.MAX_VALUE : 0L;
    }

    public final void d0(boolean z2) {
        this.f5149c += a0(z2);
        if (z2) {
            return;
        }
        this.f5150d = true;
    }

    public final boolean f0() {
        return this.f5149c >= a0(true);
    }

    public final boolean g0() {
        C0402f c0402f = this.f5151e;
        if (c0402f != null) {
            return c0402f.isEmpty();
        }
        return true;
    }

    public abstract long h0();

    public final boolean i0() {
        AbstractC0551a0 abstractC0551a0;
        C0402f c0402f = this.f5151e;
        if (c0402f == null || (abstractC0551a0 = (AbstractC0551a0) c0402f.s()) == null) {
            return false;
        }
        abstractC0551a0.run();
        return true;
    }

    public boolean j0() {
        return false;
    }

    public abstract void shutdown();
}
