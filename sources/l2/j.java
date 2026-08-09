package l2;

import h2.D;
import h2.G;

/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f9821a = G.e("kotlinx.coroutines.semaphore.maxSpinCycles", 100, 0, 0, 12, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final D f9822b = new D("PERMIT");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final D f9823c = new D("TAKEN");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final D f9824d = new D("BROKEN");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final D f9825e = new D("CANCELLED");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f9826f = G.e("kotlinx.coroutines.semaphore.segmentSize", 16, 0, 0, 12, null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final k h(long j3, k kVar) {
        return new k(j3, kVar, 0);
    }
}
