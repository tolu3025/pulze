package io.grpc.internal;

import e0.AbstractC0821b;
import g0.AbstractC0870a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public abstract class T0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Logger f8723a = Logger.getLogger(T0.class.getName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final byte[] f8724b = "-bin".getBytes(AbstractC0821b.f7061a);

    private static boolean a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length - bArr2.length;
        if (length < 0) {
            return false;
        }
        for (int i3 = length; i3 < bArr.length; i3++) {
            if (bArr[i3] != bArr2[i3 - length]) {
                return false;
            }
        }
        return true;
    }

    private static boolean b(byte[] bArr) {
        for (byte b3 : bArr) {
            if (b3 < 32 || b3 > 126) {
                return false;
            }
        }
        return true;
    }

    private static byte[][] c(byte[][] bArr, int i3) {
        ArrayList arrayList = new ArrayList(bArr.length + 10);
        for (int i4 = 0; i4 < i3; i4++) {
            arrayList.add(bArr[i4]);
        }
        while (i3 < bArr.length) {
            byte[] bArr2 = bArr[i3];
            byte[] bArr3 = bArr[i3 + 1];
            if (a(bArr2, f8724b)) {
                int i5 = 0;
                for (int i6 = 0; i6 <= bArr3.length; i6++) {
                    if (i6 == bArr3.length || bArr3[i6] == 44) {
                        byte[] bArrB = AbstractC0870a.a().b(new String(bArr3, i5, i6 - i5, AbstractC0821b.f7061a));
                        arrayList.add(bArr2);
                        arrayList.add(bArrB);
                        i5 = i6 + 1;
                    }
                }
            } else {
                arrayList.add(bArr2);
                arrayList.add(bArr3);
            }
            i3 += 2;
        }
        return (byte[][]) arrayList.toArray(new byte[0][]);
    }

    public static byte[][] d(y1.Z z2) {
        byte[][] bArrD = y1.M.d(z2);
        if (bArrD == null) {
            return new byte[0][];
        }
        int i3 = 0;
        for (int i4 = 0; i4 < bArrD.length; i4 += 2) {
            byte[] bArr = bArrD[i4];
            byte[] bArr2 = bArrD[i4 + 1];
            if (a(bArr, f8724b)) {
                bArrD[i3] = bArr;
                bArrD[i3 + 1] = y1.M.f11800b.e(bArr2).getBytes(AbstractC0821b.f7061a);
            } else if (b(bArr2)) {
                bArrD[i3] = bArr;
                bArrD[i3 + 1] = bArr2;
            } else {
                String str = new String(bArr, AbstractC0821b.f7061a);
                f8723a.warning("Metadata key=" + str + ", value=" + Arrays.toString(bArr2) + " contains invalid ASCII characters");
            }
            i3 += 2;
        }
        return i3 == bArrD.length ? bArrD : (byte[][]) Arrays.copyOfRange(bArrD, 0, i3);
    }

    public static byte[][] e(byte[][] bArr) {
        for (int i3 = 0; i3 < bArr.length; i3 += 2) {
            byte[] bArr2 = bArr[i3];
            int i4 = i3 + 1;
            byte[] bArr3 = bArr[i4];
            if (a(bArr2, f8724b)) {
                for (byte b3 : bArr3) {
                    if (b3 == 44) {
                        return c(bArr, i3);
                    }
                }
                bArr[i4] = AbstractC0870a.a().b(new String(bArr3, AbstractC0821b.f7061a));
            }
        }
        return bArr;
    }
}
