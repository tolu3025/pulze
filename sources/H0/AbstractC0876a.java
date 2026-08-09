package h0;

/* JADX INFO: renamed from: h0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0876a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final double f7406a = Math.log(2.0d);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final double[] f7407b = {1.0d, 2.0922789888E13d, 2.631308369336935E35d, 1.2413915592536073E61d, 1.2688693218588417E89d, 7.156945704626381E118d, 9.916779348709496E149d, 1.974506857221074E182d, 3.856204823625804E215d, 5.5502938327393044E249d, 4.7147236359920616E284d};

    public static boolean a(double d3) {
        return AbstractC0877b.b(d3) && (d3 == 0.0d || 52 - Long.numberOfTrailingZeros(AbstractC0877b.a(d3)) <= Math.getExponent(d3));
    }
}
