package j2;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.y;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f9440b = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "lastScheduledTask$volatile");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f9441c = AtomicIntegerFieldUpdater.newUpdater(l.class, "producerIndex$volatile");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f9442d = AtomicIntegerFieldUpdater.newUpdater(l.class, "consumerIndex$volatile");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f9443e = AtomicIntegerFieldUpdater.newUpdater(l.class, "blockingTasksInBuffer$volatile");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicReferenceArray f9444a = new AtomicReferenceArray(128);
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;

    private final h b(h hVar) {
        if (e() == 127) {
            return hVar;
        }
        if (hVar.f9431b) {
            f9443e.incrementAndGet(this);
        }
        int i3 = f9441c.get(this) & 127;
        while (this.f9444a.get(i3) != null) {
            Thread.yield();
        }
        this.f9444a.lazySet(i3, hVar);
        f9441c.incrementAndGet(this);
        return null;
    }

    private final void c(h hVar) {
        if (hVar == null || !hVar.f9431b) {
            return;
        }
        f9443e.decrementAndGet(this);
    }

    private final int e() {
        return f9441c.get(this) - f9442d.get(this);
    }

    private final h m() {
        h hVar;
        while (true) {
            int i3 = f9442d.get(this);
            if (i3 - f9441c.get(this) == 0) {
                return null;
            }
            int i4 = i3 & 127;
            if (f9442d.compareAndSet(this, i3, i3 + 1) && (hVar = (h) this.f9444a.getAndSet(i4, null)) != null) {
                c(hVar);
                return hVar;
            }
        }
    }

    private final boolean n(d dVar) {
        h hVarM = m();
        if (hVarM == null) {
            return false;
        }
        dVar.a(hVarM);
        return true;
    }

    private final h o(boolean z2) {
        h hVar;
        do {
            hVar = (h) f9440b.get(this);
            if (hVar == null || hVar.f9431b != z2) {
                int i3 = f9442d.get(this);
                int i4 = f9441c.get(this);
                while (i3 != i4) {
                    if (z2 && f9443e.get(this) == 0) {
                        return null;
                    }
                    i4--;
                    h hVarQ = q(i4, z2);
                    if (hVarQ != null) {
                        return hVarQ;
                    }
                }
                return null;
            }
        } while (!androidx.concurrent.futures.b.a(f9440b, this, hVar, null));
        return hVar;
    }

    private final h p(int i3) {
        int i4 = f9442d.get(this);
        int i5 = f9441c.get(this);
        boolean z2 = i3 == 1;
        while (i4 != i5) {
            if (z2 && f9443e.get(this) == 0) {
                return null;
            }
            int i6 = i4 + 1;
            h hVarQ = q(i4, z2);
            if (hVarQ != null) {
                return hVarQ;
            }
            i4 = i6;
        }
        return null;
    }

    private final h q(int i3, boolean z2) {
        int i4 = i3 & 127;
        h hVar = (h) this.f9444a.get(i4);
        if (hVar == null || hVar.f9431b != z2 || !e2.l.a(this.f9444a, i4, hVar, null)) {
            return null;
        }
        if (z2) {
            f9443e.decrementAndGet(this);
        }
        return hVar;
    }

    private final long s(int i3, y yVar) {
        h hVar;
        do {
            hVar = (h) f9440b.get(this);
            if (hVar == null) {
                return -2L;
            }
            if (((hVar.f9431b ? 1 : 2) & i3) == 0) {
                return -2L;
            }
            long jA = j.f9438f.a() - hVar.f9430a;
            long j3 = j.f9434b;
            if (jA < j3) {
                return j3 - jA;
            }
        } while (!androidx.concurrent.futures.b.a(f9440b, this, hVar, null));
        yVar.f9750a = hVar;
        return -1L;
    }

    public final h a(h hVar, boolean z2) {
        if (z2) {
            return b(hVar);
        }
        h hVar2 = (h) f9440b.getAndSet(this, hVar);
        if (hVar2 == null) {
            return null;
        }
        return b(hVar2);
    }

    public final int i() {
        return f9440b.get(this) != null ? e() + 1 : e();
    }

    public final void j(d dVar) {
        h hVar = (h) f9440b.getAndSet(this, null);
        if (hVar != null) {
            dVar.a(hVar);
        }
        while (n(dVar)) {
        }
    }

    public final h k() {
        h hVar = (h) f9440b.getAndSet(this, null);
        return hVar == null ? m() : hVar;
    }

    public final h l() {
        return o(true);
    }

    public final long r(int i3, y yVar) {
        h hVarM = i3 == 3 ? m() : p(i3);
        if (hVarM == null) {
            return s(i3, yVar);
        }
        yVar.f9750a = hVarM;
        return -1L;
    }
}
