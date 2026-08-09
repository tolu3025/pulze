package com.google.android.gms.common.util;

/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final char[] f5670a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final char[] f5671b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static String a(byte[] bArr) {
        return b(bArr, false);
    }

    public static String b(byte[] bArr, boolean z2) {
        int length = bArr.length;
        StringBuilder sb = new StringBuilder(length + length);
        for (int i3 = 0; i3 < length && (!z2 || i3 != length - 1 || (bArr[i3] & 255) != 0); i3++) {
            char[] cArr = f5670a;
            sb.append(cArr[(bArr[i3] & 240) >>> 4]);
            sb.append(cArr[bArr[i3] & 15]);
        }
        return sb.toString();
    }
}
