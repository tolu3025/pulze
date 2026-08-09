package I0;

import android.util.Base64;
import com.google.protobuf.AbstractC0791i;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: renamed from: I0.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0373n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f2335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AbstractC0791i f2336b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f2337c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final MessageDigest f2338d;

    /* JADX INFO: renamed from: I0.n$a */
    public static final class a extends Exception {
        public a(String str) {
            super(str);
        }
    }

    public C0373n(AbstractC0791i abstractC0791i, int i3, int i4) {
        if (i3 < 0 || i3 >= 8) {
            throw new IllegalArgumentException("Invalid padding: " + i3);
        }
        if (i4 < 0) {
            throw new IllegalArgumentException("Invalid hash count: " + i4);
        }
        if (abstractC0791i.size() > 0 && i4 == 0) {
            throw new IllegalArgumentException("Invalid hash count: " + i4);
        }
        if (abstractC0791i.size() == 0 && i3 != 0) {
            throw new IllegalArgumentException("Expected padding of 0 when bitmap length is 0, but got " + i3);
        }
        this.f2336b = abstractC0791i;
        this.f2337c = i4;
        this.f2335a = (abstractC0791i.size() * 8) - i3;
        this.f2338d = b();
    }

    public static C0373n a(AbstractC0791i abstractC0791i, int i3, int i4) throws a {
        if (i3 < 0 || i3 >= 8) {
            throw new a("Invalid padding: " + i3);
        }
        if (i4 < 0) {
            throw new a("Invalid hash count: " + i4);
        }
        if (abstractC0791i.size() > 0 && i4 == 0) {
            throw new a("Invalid hash count: " + i4);
        }
        if (abstractC0791i.size() != 0 || i3 == 0) {
            return new C0373n(abstractC0791i, i3, i4);
        }
        throw new a("Expected padding of 0 when bitmap length is 0, but got " + i3);
    }

    private static MessageDigest b() {
        try {
            return MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e3) {
            throw new RuntimeException("Missing MD5 MessageDigest provider: ", e3);
        }
    }

    private int d(long j3, long j4, int i3) {
        return (int) i(j3 + (j4 * ((long) i3)), this.f2335a);
    }

    private static long e(byte[] bArr, int i3) {
        long j3 = 0;
        for (int i4 = 0; i4 < 8; i4++) {
            j3 |= (((long) bArr[i3 + i4]) & 255) << (i4 * 8);
        }
        return j3;
    }

    private boolean f(int i3) {
        return ((1 << (i3 % 8)) & this.f2336b.f(i3 / 8)) != 0;
    }

    private byte[] g(String str) {
        return this.f2338d.digest(str.getBytes(StandardCharsets.UTF_8));
    }

    private static long i(long j3, long j4) {
        long j5 = j3 - ((((j3 >>> 1) / j4) << 1) * j4);
        if (j5 < j4) {
            j4 = 0;
        }
        return j5 - j4;
    }

    int c() {
        return this.f2335a;
    }

    public boolean h(String str) {
        if (this.f2335a == 0) {
            return false;
        }
        byte[] bArrG = g(str);
        if (bArrG.length != 16) {
            throw new RuntimeException("Invalid md5 hash array length: " + bArrG.length + " (expected 16)");
        }
        long jE = e(bArrG, 0);
        long jE2 = e(bArrG, 8);
        for (int i3 = 0; i3 < this.f2337c; i3++) {
            if (!f(d(jE, jE2, i3))) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        return "BloomFilter{hashCount=" + this.f2337c + ", size=" + this.f2335a + ", bitmap=\"" + Base64.encodeToString(this.f2336b.F(), 2) + "\"}";
    }
}
