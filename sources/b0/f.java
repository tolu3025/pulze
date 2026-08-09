package B0;

import java.math.RoundingMode;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f548a;

        static {
            int[] iArr = new int[RoundingMode.values().length];
            f548a = iArr;
            try {
                iArr[RoundingMode.UNNECESSARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f548a[RoundingMode.DOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f548a[RoundingMode.UP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f548a[RoundingMode.CEILING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f548a[RoundingMode.FLOOR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f548a[RoundingMode.HALF_EVEN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f548a[RoundingMode.HALF_DOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f548a[RoundingMode.HALF_UP.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public static int a(int i3, int i4, RoundingMode roundingMode) {
        if (i4 == 0) {
            throw new ArithmeticException("/ by zero");
        }
        int i5 = i3 / i4;
        int i6 = i3 - (i4 * i5);
        if (i6 == 0) {
            return i5;
        }
        int i7 = ((i3 ^ i4) >> 31) | 1;
        switch (a.f548a[roundingMode.ordinal()]) {
            case 1:
            case 2:
                return i5;
            case 3:
                break;
            case 4:
                if (i7 <= 0) {
                    return i5;
                }
                break;
            case 5:
                if (i7 >= 0) {
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
}
