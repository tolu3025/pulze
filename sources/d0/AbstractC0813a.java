package d0;

/* JADX INFO: renamed from: d0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0813a {
    public static int a(double d3, long j3) {
        if (Double.isNaN(d3) || d3 < -9.223372036854776E18d) {
            return -1;
        }
        if (d3 >= 9.223372036854776E18d) {
            return 1;
        }
        int iCompare = Long.compare((long) d3, j3);
        return iCompare != 0 ? iCompare : b(d3, j3);
    }

    public static int b(double d3, double d4) {
        if (d3 < d4) {
            return -1;
        }
        if (d3 > d4) {
            return 1;
        }
        if (d3 == d4) {
            return 0;
        }
        if (Double.isNaN(d4)) {
            return !Double.isNaN(d3) ? 1 : 0;
        }
        return -1;
    }
}
