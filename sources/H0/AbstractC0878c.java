package h0;

import com.google.android.gms.common.api.a;
import e0.AbstractC0829j;
import i0.AbstractC0901a;
import java.math.RoundingMode;

/* JADX INFO: renamed from: h0.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0878c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final byte[] f7408a = {9, 9, 9, 8, 8, 8, 7, 7, 7, 6, 6, 6, 6, 5, 5, 5, 4, 4, 4, 3, 3, 3, 3, 2, 2, 2, 1, 1, 1, 0, 0, 0, 0};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final int[] f7409b = {1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final int[] f7410c = {3, 31, 316, 3162, 31622, 316227, 3162277, 31622776, 316227766, a.e.API_PRIORITY_OTHER};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int[] f7411d = {1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800, 39916800, 479001600};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static int[] f7412e = {a.e.API_PRIORITY_OTHER, a.e.API_PRIORITY_OTHER, 65536, 2345, 477, 193, 110, 75, 58, 49, 43, 39, 37, 35, 34, 34, 33};

    /* JADX INFO: renamed from: h0.c$a */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f7413a;

        static {
            int[] iArr = new int[RoundingMode.values().length];
            f7413a = iArr;
            try {
                iArr[RoundingMode.UNNECESSARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7413a[RoundingMode.DOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7413a[RoundingMode.FLOOR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7413a[RoundingMode.UP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f7413a[RoundingMode.CEILING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f7413a[RoundingMode.HALF_DOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f7413a[RoundingMode.HALF_UP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f7413a[RoundingMode.HALF_EVEN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public static int a(int i3, int i4, RoundingMode roundingMode) {
        AbstractC0829j.n(roundingMode);
        if (i4 == 0) {
            throw new ArithmeticException("/ by zero");
        }
        int i5 = i3 / i4;
        int i6 = i3 - (i4 * i5);
        if (i6 == 0) {
            return i5;
        }
        int i7 = ((i3 ^ i4) >> 31) | 1;
        switch (a.f7413a[roundingMode.ordinal()]) {
            case 1:
                AbstractC0880e.c(i6 == 0);
                return i5;
            case 2:
                return i5;
            case 3:
                if (i7 >= 0) {
                    return i5;
                }
                break;
            case 4:
                break;
            case 5:
                if (i7 <= 0) {
                    return i5;
                }
                break;
            case 6:
            case 7:
            case 8:
                int iAbs = Math.abs(i6);
                int iAbs2 = iAbs - (Math.abs(i4) - iAbs);
                if (iAbs2 == 0) {
                    if (roundingMode != RoundingMode.HALF_UP) {
                        if (!((roundingMode == RoundingMode.HALF_EVEN) & ((i5 & 1) != 0))) {
                            return i5;
                        }
                    }
                } else if (iAbs2 <= 0) {
                    return i5;
                }
            default:
                throw new AssertionError();
        }
        return i5 + i7;
    }

    public static boolean b(int i3) {
        return (i3 > 0) & ((i3 & (i3 + (-1))) == 0);
    }

    static int c(int i3, int i4) {
        return (~(~(i3 - i4))) >>> 31;
    }

    public static int d(int i3, RoundingMode roundingMode) {
        AbstractC0880e.b("x", i3);
        switch (a.f7413a[roundingMode.ordinal()]) {
            case 1:
                AbstractC0880e.c(b(i3));
                break;
            case 2:
            case 3:
                break;
            case 4:
            case 5:
                return 32 - Integer.numberOfLeadingZeros(i3 - 1);
            case 6:
            case 7:
            case 8:
                int iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(i3);
                return (31 - iNumberOfLeadingZeros) + c((-1257966797) >>> iNumberOfLeadingZeros, i3);
            default:
                throw new AssertionError();
        }
        return 31 - Integer.numberOfLeadingZeros(i3);
    }

    public static int e(int i3, int i4) {
        return AbstractC0901a.a(((long) i3) + ((long) i4));
    }

    public static int f(int i3, int i4) {
        return AbstractC0901a.a(((long) i3) * ((long) i4));
    }
}
