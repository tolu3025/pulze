package com.google.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public abstract class C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final Charset f6665a = Charset.forName("US-ASCII");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final Charset f6666b = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final Charset f6667c = Charset.forName("ISO-8859-1");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final byte[] f6668d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ByteBuffer f6669e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final AbstractC0792j f6670f;

    public interface a {
        int a();
    }

    public interface b {
    }

    public interface c {
        boolean a(int i3);
    }

    public interface d extends e {
    }

    public interface e extends List, RandomAccess {
        void c();

        e e(int i3);

        boolean g();
    }

    static {
        byte[] bArr = new byte[0];
        f6668d = bArr;
        f6669e = ByteBuffer.wrap(bArr);
        f6670f = AbstractC0792j.k(bArr);
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
        int iH = h(i4, bArr, i3, i4);
        if (iH == 0) {
            return 1;
        }
        return iH;
    }

    public static int f(long j3) {
        return (int) (j3 ^ (j3 >>> 32));
    }

    public static boolean g(byte[] bArr) {
        return A0.s(bArr);
    }

    static int h(int i3, byte[] bArr, int i4, int i5) {
        for (int i6 = i4; i6 < i4 + i5; i6++) {
            i3 = (i3 * 31) + bArr[i6];
        }
        return i3;
    }

    public static String i(byte[] bArr) {
        return new String(bArr, f6666b);
    }
}
