package m2;

import m2.g;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f9844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final byte[] f9845b;

    static {
        g.a aVar = g.f9870d;
        f9844a = aVar.a("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/").i();
        f9845b = aVar.a("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_").i();
    }

    public static final String a(byte[] bArr, byte[] map) {
        kotlin.jvm.internal.m.e(bArr, "<this>");
        kotlin.jvm.internal.m.e(map, "map");
        byte[] bArr2 = new byte[((bArr.length + 2) / 3) * 4];
        int length = bArr.length - (bArr.length % 3);
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            byte b3 = bArr[i3];
            int i5 = i3 + 2;
            byte b4 = bArr[i3 + 1];
            i3 += 3;
            byte b5 = bArr[i5];
            bArr2[i4] = map[(b3 & 255) >> 2];
            bArr2[i4 + 1] = map[((b3 & 3) << 4) | ((b4 & 255) >> 4)];
            int i6 = i4 + 3;
            bArr2[i4 + 2] = map[((b4 & 15) << 2) | ((b5 & 255) >> 6)];
            i4 += 4;
            bArr2[i6] = map[b5 & 63];
        }
        int length2 = bArr.length - length;
        if (length2 == 1) {
            byte b6 = bArr[i3];
            bArr2[i4] = map[(b6 & 255) >> 2];
            bArr2[i4 + 1] = map[(b6 & 3) << 4];
            bArr2[i4 + 2] = 61;
            bArr2[i4 + 3] = 61;
        } else if (length2 == 2) {
            int i7 = i3 + 1;
            byte b7 = bArr[i3];
            byte b8 = bArr[i7];
            bArr2[i4] = map[(b7 & 255) >> 2];
            bArr2[i4 + 1] = map[((b7 & 3) << 4) | ((b8 & 255) >> 4)];
            bArr2[i4 + 2] = map[(b8 & 15) << 2];
            bArr2[i4 + 3] = 61;
        }
        return v.b(bArr2);
    }

    public static /* synthetic */ String b(byte[] bArr, byte[] bArr2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            bArr2 = f9844a;
        }
        return a(bArr, bArr2);
    }
}
