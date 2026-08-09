package h0;

import e0.AbstractC0829j;

/* JADX INFO: renamed from: h0.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC0877b {
    static long a(double d3) {
        AbstractC0829j.e(b(d3), "not a normal value");
        int exponent = Math.getExponent(d3);
        long jDoubleToRawLongBits = Double.doubleToRawLongBits(d3) & 4503599627370495L;
        return exponent == -1023 ? jDoubleToRawLongBits << 1 : jDoubleToRawLongBits | 4503599627370496L;
    }

    static boolean b(double d3) {
        return Math.getExponent(d3) <= 1023;
    }
}
