package n2;

import kotlin.jvm.internal.m;
import m2.q;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    public static final int a(int[] iArr, int i3, int i4, int i5) {
        m.e(iArr, "<this>");
        int i6 = i5 - 1;
        while (i4 <= i6) {
            int i7 = (i4 + i6) >>> 1;
            int i8 = iArr[i7];
            if (i8 < i3) {
                i4 = i7 + 1;
            } else {
                if (i8 <= i3) {
                    return i7;
                }
                i6 = i7 - 1;
            }
        }
        return (-i4) - 1;
    }

    public static final int b(q qVar, int i3) {
        m.e(qVar, "<this>");
        int iA = a(qVar.A(), i3 + 1, 0, qVar.B().length);
        return iA >= 0 ? iA : ~iA;
    }
}
