package j;

import java.io.PrintWriter;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f9377a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static char[] f9378b = new char[24];

    private static int a(int i3, int i4, boolean z2, int i5) {
        if (i3 > 99 || (z2 && i5 >= 3)) {
            return i4 + 3;
        }
        if (i3 > 9 || (z2 && i5 >= 2)) {
            return i4 + 2;
        }
        if (z2 || i3 > 0) {
            return i4 + 1;
        }
        return 0;
    }

    public static void b(long j3, long j4, PrintWriter printWriter) {
        if (j3 == 0) {
            printWriter.print("--");
        } else {
            d(j3 - j4, printWriter, 0);
        }
    }

    public static void c(long j3, PrintWriter printWriter) {
        d(j3, printWriter, 0);
    }

    public static void d(long j3, PrintWriter printWriter, int i3) {
        synchronized (f9377a) {
            printWriter.print(new String(f9378b, 0, e(j3, i3)));
        }
    }

    private static int e(long j3, int i3) {
        char c3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        long j4 = j3;
        if (f9378b.length < i3) {
            f9378b = new char[i3];
        }
        char[] cArr = f9378b;
        if (j4 == 0) {
            int i9 = i3 - 1;
            while (i9 > 0) {
                cArr[0] = ' ';
            }
            cArr[0] = '0';
            return 1;
        }
        if (j4 > 0) {
            c3 = '+';
        } else {
            j4 = -j4;
            c3 = '-';
        }
        int i10 = (int) (j4 % 1000);
        int iFloor = (int) Math.floor(j4 / 1000);
        if (iFloor > 86400) {
            i4 = iFloor / 86400;
            iFloor -= 86400 * i4;
        } else {
            i4 = 0;
        }
        if (iFloor > 3600) {
            i5 = iFloor / 3600;
            iFloor -= i5 * 3600;
        } else {
            i5 = 0;
        }
        if (iFloor > 60) {
            int i11 = iFloor / 60;
            i6 = iFloor - (i11 * 60);
            i7 = i11;
        } else {
            i6 = iFloor;
            i7 = 0;
        }
        if (i3 != 0) {
            int iA = a(i4, 1, false, 0);
            int iA2 = iA + a(i5, 1, iA > 0, 2);
            int iA3 = iA2 + a(i7, 1, iA2 > 0, 2);
            int iA4 = iA3 + a(i6, 1, iA3 > 0, 2);
            i8 = 0;
            for (int iA5 = iA4 + a(i10, 2, true, iA4 > 0 ? 3 : 0) + 1; iA5 < i3; iA5++) {
                cArr[i8] = ' ';
                i8++;
            }
        } else {
            i8 = 0;
        }
        cArr[i8] = c3;
        int i12 = i8 + 1;
        boolean z2 = i3 != 0;
        int iF = f(cArr, i4, 'd', i12, false, 0);
        int iF2 = f(cArr, i5, 'h', iF, iF != i12, z2 ? 2 : 0);
        int iF3 = f(cArr, i7, 'm', iF2, iF2 != i12, z2 ? 2 : 0);
        int iF4 = f(cArr, i6, 's', iF3, iF3 != i12, z2 ? 2 : 0);
        int iF5 = f(cArr, i10, 'm', iF4, true, (!z2 || iF4 == i12) ? 0 : 3);
        cArr[iF5] = 's';
        return iF5 + 1;
    }

    private static int f(char[] cArr, int i3, char c3, int i4, boolean z2, int i5) {
        int i6;
        if (!z2 && i3 <= 0) {
            return i4;
        }
        if ((!z2 || i5 < 3) && i3 <= 99) {
            i6 = i4;
        } else {
            int i7 = i3 / 100;
            cArr[i4] = (char) (i7 + 48);
            i6 = i4 + 1;
            i3 -= i7 * 100;
        }
        if ((z2 && i5 >= 2) || i3 > 9 || i4 != i6) {
            int i8 = i3 / 10;
            cArr[i6] = (char) (i8 + 48);
            i6++;
            i3 -= i8 * 10;
        }
        cArr[i6] = (char) (i3 + 48);
        cArr[i6 + 1] = c3;
        return i6 + 2;
    }
}
