package G0;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class B0 {
    public static /* synthetic */ long a(long j3, long j4) {
        long j5 = j3 / j4;
        return (j3 - (j4 * j5) != 0 && (((j3 ^ j4) >> 63) | 1) < 0) ? j5 - 1 : j5;
    }
}
