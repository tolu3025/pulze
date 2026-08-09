package h0;

/* JADX INFO: renamed from: h0.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC0880e {
    static void a(boolean z2, String str, long j3, long j4) {
        if (z2) {
            return;
        }
        throw new ArithmeticException("overflow: " + str + "(" + j3 + ", " + j4 + ")");
    }

    static int b(String str, int i3) {
        if (i3 > 0) {
            return i3;
        }
        throw new IllegalArgumentException(str + " (" + i3 + ") must be > 0");
    }

    static void c(boolean z2) {
        if (!z2) {
            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
        }
    }
}
