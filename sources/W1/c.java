package W1;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes.dex */
public abstract class c extends b {
    public static double a(double d3, double d4) {
        if (d4 <= 0.0d || d4 == 1.0d) {
            return Double.NaN;
        }
        return Math.log(d3) / Math.log(d4);
    }
}
