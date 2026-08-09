package c2;

/* JADX INFO: renamed from: c2.n0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0577n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final h2.D f5163a = new h2.D("REMOVED_TASK");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final h2.D f5164b = new h2.D("CLOSED_EMPTY");

    public static final long c(long j3) {
        if (j3 <= 0) {
            return 0L;
        }
        if (j3 >= 9223372036854L) {
            return Long.MAX_VALUE;
        }
        return 1000000 * j3;
    }
}
