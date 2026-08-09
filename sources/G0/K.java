package G0;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class K {
    public static /* synthetic */ int a(double d3) {
        long jDoubleToLongBits = Double.doubleToLongBits(d3);
        return (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
    }
}
