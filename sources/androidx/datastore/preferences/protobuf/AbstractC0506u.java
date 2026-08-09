package androidx.datastore.preferences.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0506u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final Charset f4279a = Charset.forName("US-ASCII");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final Charset f4280b = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final Charset f4281c = Charset.forName("ISO-8859-1");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final byte[] f4282d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ByteBuffer f4283e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final AbstractC0493g f4284f;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.u$a */
    public interface a {
        boolean a(int i3);
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.u$b */
    public interface b extends List, RandomAccess {
        void c();

        b e(int i3);

        boolean g();
    }

    static {
        byte[] bArr = new byte[0];
        f4282d = bArr;
        f4283e = ByteBuffer.wrap(bArr);
        f4284f = AbstractC0493g.i(bArr);
    }

    static Object a(Object obj) {
        obj.getClass();
        return obj;
    }

    static Object b(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    public static int c(boolean z2) {
        return z2 ? 1231 : 1237;
    }

    public static int d(byte[] bArr) {
        return e(bArr, 0, bArr.length);
    }

    static int e(byte[] bArr, int i3, int i4) {
        int iG = g(i4, bArr, i3, i4);
        if (iG == 0) {
            return 1;
        }
        return iG;
    }

    public static int f(long j3) {
        return (int) (j3 ^ (j3 >>> 32));
    }

    static int g(int i3, byte[] bArr, int i4, int i5) {
        for (int i6 = i4; i6 < i4 + i5; i6++) {
            i3 = (i3 * 31) + bArr[i6];
        }
        return i3;
    }
}
