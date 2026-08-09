package G0;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class D0 {
    public static /* synthetic */ long a(long j3, long j4) {
        long j5 = j3 % j4;
        if (j5 == 0) {
            return 0L;
        }
        return (((j3 ^ j4) >> 63) | 1) > 0 ? j5 : j5 + j4;
    }
}
