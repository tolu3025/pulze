package b2;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes.dex */
public abstract class n extends m {
    public static Long f(String str) {
        kotlin.jvm.internal.m.e(str, "<this>");
        return g(str, 10);
    }

    public static final Long g(String str, int i3) {
        boolean z2;
        kotlin.jvm.internal.m.e(str, "<this>");
        a.a(i3);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i4 = 0;
        char cCharAt = str.charAt(0);
        long j3 = -9223372036854775807L;
        if (kotlin.jvm.internal.m.f(cCharAt, 48) < 0) {
            z2 = true;
            if (length == 1) {
                return null;
            }
            if (cCharAt == '+') {
                z2 = false;
                i4 = 1;
            } else {
                if (cCharAt != '-') {
                    return null;
                }
                j3 = Long.MIN_VALUE;
                i4 = 1;
            }
        } else {
            z2 = false;
        }
        long j4 = -256204778801521550L;
        long j5 = 0;
        long j6 = -256204778801521550L;
        while (i4 < length) {
            int iB = a.b(str.charAt(i4), i3);
            if (iB < 0) {
                return null;
            }
            if (j5 < j6) {
                if (j6 == j4) {
                    j6 = j3 / ((long) i3);
                    if (j5 < j6) {
                    }
                }
                return null;
            }
            long j7 = j5 * ((long) i3);
            long j8 = iB;
            if (j7 < j3 + j8) {
                return null;
            }
            j5 = j7 - j8;
            i4++;
            j4 = -256204778801521550L;
        }
        return z2 ? Long.valueOf(j5) : Long.valueOf(-j5);
    }
}
