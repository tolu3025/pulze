package Y0;

/* JADX INFO: loaded from: classes.dex */
abstract class q {
    private static boolean a(int[][] iArr, int i3) {
        if (i3 > 255) {
            return iArr.length > 0 && i3 >= iArr[0][0] && b(iArr, i3);
        }
        for (int[] iArr2 : iArr) {
            if (i3 <= iArr2[1]) {
                int i4 = iArr2[0];
                return i3 >= i4 && (i3 - i4) % iArr2[2] == 0;
            }
        }
        return false;
    }

    private static boolean b(int[][] iArr, int i3) {
        int length = iArr.length;
        int i4 = 0;
        while (i4 < length) {
            int i5 = ((length - i4) / 2) + i4;
            int[] iArr2 = iArr[i5];
            int i6 = iArr2[0];
            if (i6 <= i3 && i3 <= iArr2[1]) {
                return (i3 - i6) % iArr2[2] == 0;
            }
            if (i3 < i6) {
                length = i5;
            } else {
                i4 = i5 + 1;
            }
        }
        return false;
    }

    static boolean c(int i3) {
        return i3 <= 255 ? (i3 >= 32 && i3 < 127) || (i3 >= 161 && i3 != 173) : a(r.f3406I, i3) || a(r.f3409J, i3) || a(r.f3412K, i3) || a(r.f3394E, i3) || a(r.f3397F, i3);
    }

    static int d(int i3) {
        char c3;
        char[] cArr = r.f3449a;
        if (i3 < cArr.length && (c3 = cArr[i3]) != 0) {
            return c3;
        }
        int iA = c.a(i3);
        return iA != i3 ? iA : c.b(i3);
    }
}
