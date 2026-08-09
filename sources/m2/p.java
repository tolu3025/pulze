package m2;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p f9894a = new p();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f9895b = 65536;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final o f9896c = new o(new byte[0], 0, 0, false, false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f9897d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final AtomicReference[] f9898e;

    static {
        int iHighestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f9897d = iHighestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[iHighestOneBit];
        for (int i3 = 0; i3 < iHighestOneBit; i3++) {
            atomicReferenceArr[i3] = new AtomicReference();
        }
        f9898e = atomicReferenceArr;
    }

    private p() {
    }

    private final AtomicReference a() {
        return f9898e[(int) (Thread.currentThread().getId() & (((long) f9897d) - 1))];
    }

    public static final void b(o segment) {
        kotlin.jvm.internal.m.e(segment, "segment");
        if (segment.f9892f != null || segment.f9893g != null) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (segment.f9890d) {
            return;
        }
        AtomicReference atomicReferenceA = f9894a.a();
        o oVar = f9896c;
        o oVar2 = (o) atomicReferenceA.getAndSet(oVar);
        if (oVar2 == oVar) {
            return;
        }
        int i3 = oVar2 != null ? oVar2.f9889c : 0;
        if (i3 >= f9895b) {
            atomicReferenceA.set(oVar2);
            return;
        }
        segment.f9892f = oVar2;
        segment.f9888b = 0;
        segment.f9889c = i3 + 8192;
        atomicReferenceA.set(segment);
    }

    public static final o c() {
        AtomicReference atomicReferenceA = f9894a.a();
        o oVar = f9896c;
        o oVar2 = (o) atomicReferenceA.getAndSet(oVar);
        if (oVar2 == oVar) {
            return new o();
        }
        if (oVar2 == null) {
            atomicReferenceA.set(null);
            return new o();
        }
        atomicReferenceA.set(oVar2.f9892f);
        oVar2.f9892f = null;
        oVar2.f9889c = 0;
        return oVar2;
    }
}
