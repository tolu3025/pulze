package m2;

import m2.d;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final d.a f9846a = new d.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f9847b = -1234567890;

    public static final boolean a(byte[] a3, int i3, byte[] b3, int i4, int i5) {
        kotlin.jvm.internal.m.e(a3, "a");
        kotlin.jvm.internal.m.e(b3, "b");
        for (int i6 = 0; i6 < i5; i6++) {
            if (a3[i6 + i3] != b3[i6 + i4]) {
                return false;
            }
        }
        return true;
    }

    public static final void b(long j3, long j4, long j5) {
        if ((j4 | j5) < 0 || j4 > j3 || j3 - j4 < j5) {
            throw new ArrayIndexOutOfBoundsException("size=" + j3 + " offset=" + j4 + " byteCount=" + j5);
        }
    }

    public static final int c(g gVar, int i3) {
        kotlin.jvm.internal.m.e(gVar, "<this>");
        return i3 == f9847b ? gVar.u() : i3;
    }

    public static final String d(int i3) {
        int i4 = 0;
        if (i3 == 0) {
            return "0";
        }
        char[] cArr = {n2.b.d()[(i3 >> 28) & 15], n2.b.d()[(i3 >> 24) & 15], n2.b.d()[(i3 >> 20) & 15], n2.b.d()[(i3 >> 16) & 15], n2.b.d()[(i3 >> 12) & 15], n2.b.d()[(i3 >> 8) & 15], n2.b.d()[(i3 >> 4) & 15], n2.b.d()[i3 & 15]};
        while (i4 < 8 && cArr[i4] == '0') {
            i4++;
        }
        return b2.o.i(cArr, i4, 8);
    }
}
