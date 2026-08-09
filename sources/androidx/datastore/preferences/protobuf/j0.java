package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
abstract class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final b f4146a;

    private static class a {
        /* JADX INFO: Access modifiers changed from: private */
        public static void h(byte b3, byte b4, byte b5, byte b6, char[] cArr, int i3) throws C0507v {
            if (m(b4) || (((b3 << 28) + (b4 + 112)) >> 30) != 0 || m(b5) || m(b6)) {
                throw C0507v.d();
            }
            int iR = ((b3 & 7) << 18) | (r(b4) << 12) | (r(b5) << 6) | r(b6);
            cArr[i3] = l(iR);
            cArr[i3 + 1] = q(iR);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void i(byte b3, char[] cArr, int i3) {
            cArr[i3] = (char) b3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void j(byte b3, byte b4, byte b5, char[] cArr, int i3) throws C0507v {
            if (m(b4) || ((b3 == -32 && b4 < -96) || ((b3 == -19 && b4 >= -96) || m(b5)))) {
                throw C0507v.d();
            }
            cArr[i3] = (char) (((b3 & 15) << 12) | (r(b4) << 6) | r(b5));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void k(byte b3, byte b4, char[] cArr, int i3) throws C0507v {
            if (b3 < -62 || m(b4)) {
                throw C0507v.d();
            }
            cArr[i3] = (char) (((b3 & 31) << 6) | r(b4));
        }

        private static char l(int i3) {
            return (char) ((i3 >>> 10) + 55232);
        }

        private static boolean m(byte b3) {
            return b3 > -65;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean n(byte b3) {
            return b3 >= 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean o(byte b3) {
            return b3 < -16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean p(byte b3) {
            return b3 < -32;
        }

        private static char q(int i3) {
            return (char) ((i3 & 1023) + 56320);
        }

        private static int r(byte b3) {
            return b3 & 63;
        }
    }

    static abstract class b {
        b() {
        }

        abstract String a(byte[] bArr, int i3, int i4);

        abstract int b(String str, byte[] bArr, int i3, int i4);
    }

    static final class c extends b {
        c() {
        }

        @Override // androidx.datastore.preferences.protobuf.j0.b
        String a(byte[] bArr, int i3, int i4) throws C0507v {
            if ((i3 | i4 | ((bArr.length - i3) - i4)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i3), Integer.valueOf(i4)));
            }
            int i5 = i3 + i4;
            char[] cArr = new char[i4];
            int i6 = 0;
            while (i3 < i5) {
                byte b3 = bArr[i3];
                if (!a.n(b3)) {
                    break;
                }
                i3++;
                a.i(b3, cArr, i6);
                i6++;
            }
            int i7 = i6;
            while (i3 < i5) {
                int i8 = i3 + 1;
                byte b4 = bArr[i3];
                if (a.n(b4)) {
                    int i9 = i7 + 1;
                    a.i(b4, cArr, i7);
                    while (i8 < i5) {
                        byte b5 = bArr[i8];
                        if (!a.n(b5)) {
                            break;
                        }
                        i8++;
                        a.i(b5, cArr, i9);
                        i9++;
                    }
                    i7 = i9;
                    i3 = i8;
                } else if (a.p(b4)) {
                    if (i8 >= i5) {
                        throw C0507v.d();
                    }
                    i3 += 2;
                    a.k(b4, bArr[i8], cArr, i7);
                    i7++;
                } else if (a.o(b4)) {
                    if (i8 >= i5 - 1) {
                        throw C0507v.d();
                    }
                    int i10 = i3 + 2;
                    i3 += 3;
                    a.j(b4, bArr[i8], bArr[i10], cArr, i7);
                    i7++;
                } else {
                    if (i8 >= i5 - 2) {
                        throw C0507v.d();
                    }
                    byte b6 = bArr[i8];
                    int i11 = i3 + 3;
                    byte b7 = bArr[i3 + 2];
                    i3 += 4;
                    a.h(b4, b6, b7, bArr[i11], cArr, i7);
                    i7 += 2;
                }
            }
            return new String(cArr, 0, i7);
        }

        @Override // androidx.datastore.preferences.protobuf.j0.b
        int b(String str, byte[] bArr, int i3, int i4) {
            int i5;
            int i6;
            char cCharAt;
            int length = str.length();
            int i7 = i4 + i3;
            int i8 = 0;
            while (i8 < length && (i6 = i8 + i3) < i7 && (cCharAt = str.charAt(i8)) < 128) {
                bArr[i6] = (byte) cCharAt;
                i8++;
            }
            if (i8 == length) {
                return i3 + length;
            }
            int i9 = i3 + i8;
            while (i8 < length) {
                char cCharAt2 = str.charAt(i8);
                if (cCharAt2 < 128 && i9 < i7) {
                    bArr[i9] = (byte) cCharAt2;
                    i9++;
                } else if (cCharAt2 < 2048 && i9 <= i7 - 2) {
                    int i10 = i9 + 1;
                    bArr[i9] = (byte) ((cCharAt2 >>> 6) | 960);
                    i9 += 2;
                    bArr[i10] = (byte) ((cCharAt2 & '?') | 128);
                } else {
                    if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || i9 > i7 - 3) {
                        if (i9 > i7 - 4) {
                            if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i5 = i8 + 1) == str.length() || !Character.isSurrogatePair(cCharAt2, str.charAt(i5)))) {
                                throw new d(i8, length);
                            }
                            throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + i9);
                        }
                        int i11 = i8 + 1;
                        if (i11 != str.length()) {
                            char cCharAt3 = str.charAt(i11);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                bArr[i9] = (byte) ((codePoint >>> 18) | 240);
                                bArr[i9 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                int i12 = i9 + 3;
                                bArr[i9 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                i9 += 4;
                                bArr[i12] = (byte) ((codePoint & 63) | 128);
                                i8 = i11;
                            } else {
                                i8 = i11;
                            }
                        }
                        throw new d(i8 - 1, length);
                    }
                    bArr[i9] = (byte) ((cCharAt2 >>> '\f') | 480);
                    int i13 = i9 + 2;
                    bArr[i9 + 1] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
                    i9 += 3;
                    bArr[i13] = (byte) ((cCharAt2 & '?') | 128);
                }
                i8++;
            }
            return i9;
        }
    }

    static class d extends IllegalArgumentException {
        d(int i3, int i4) {
            super("Unpaired surrogate at index " + i3 + " of " + i4);
        }
    }

    static final class e extends b {
        e() {
        }

        static boolean c() {
            return i0.B() && i0.C();
        }

        @Override // androidx.datastore.preferences.protobuf.j0.b
        String a(byte[] bArr, int i3, int i4) throws C0507v {
            Charset charset = AbstractC0506u.f4280b;
            String str = new String(bArr, i3, i4, charset);
            if (str.indexOf(65533) >= 0 && !Arrays.equals(str.getBytes(charset), Arrays.copyOfRange(bArr, i3, i4 + i3))) {
                throw C0507v.d();
            }
            return str;
        }

        @Override // androidx.datastore.preferences.protobuf.j0.b
        int b(String str, byte[] bArr, int i3, int i4) {
            long j3;
            String str2;
            String str3;
            int i5;
            long j4;
            long j5;
            char cCharAt;
            long j6 = i3;
            long j7 = ((long) i4) + j6;
            int length = str.length();
            String str4 = " at index ";
            String str5 = "Failed writing ";
            if (length > i4 || bArr.length - i4 < i3) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + str.charAt(length - 1) + " at index " + (i3 + i4));
            }
            int i6 = 0;
            while (true) {
                j3 = 1;
                if (i6 >= length || (cCharAt = str.charAt(i6)) >= 128) {
                    break;
                }
                i0.H(bArr, j6, (byte) cCharAt);
                i6++;
                j6 = 1 + j6;
            }
            if (i6 == length) {
                return (int) j6;
            }
            while (i6 < length) {
                char cCharAt2 = str.charAt(i6);
                if (cCharAt2 >= 128 || j6 >= j7) {
                    if (cCharAt2 >= 2048 || j6 > j7 - 2) {
                        str2 = str4;
                        str3 = str5;
                        if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || j6 > j7 - 3) {
                            if (j6 > j7 - 4) {
                                if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i5 = i6 + 1) == length || !Character.isSurrogatePair(cCharAt2, str.charAt(i5)))) {
                                    throw new d(i6, length);
                                }
                                throw new ArrayIndexOutOfBoundsException(str3 + cCharAt2 + str2 + j6);
                            }
                            int i7 = i6 + 1;
                            if (i7 != length) {
                                char cCharAt3 = str.charAt(i7);
                                if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                    int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                    j4 = 1;
                                    i0.H(bArr, j6, (byte) ((codePoint >>> 18) | 240));
                                    j5 = j7;
                                    i0.H(bArr, j6 + 1, (byte) (((codePoint >>> 12) & 63) | 128));
                                    long j8 = j6 + 3;
                                    i0.H(bArr, j6 + 2, (byte) (((codePoint >>> 6) & 63) | 128));
                                    j6 += 4;
                                    i0.H(bArr, j8, (byte) ((codePoint & 63) | 128));
                                    i6 = i7;
                                } else {
                                    i6 = i7;
                                }
                            }
                            throw new d(i6 - 1, length);
                        }
                        i0.H(bArr, j6, (byte) ((cCharAt2 >>> '\f') | 480));
                        long j9 = j6 + 2;
                        i0.H(bArr, j6 + 1, (byte) (((cCharAt2 >>> 6) & 63) | 128));
                        j6 += 3;
                        i0.H(bArr, j9, (byte) ((cCharAt2 & '?') | 128));
                    } else {
                        str2 = str4;
                        str3 = str5;
                        long j10 = j6 + j3;
                        i0.H(bArr, j6, (byte) ((cCharAt2 >>> 6) | 960));
                        j6 += 2;
                        i0.H(bArr, j10, (byte) ((cCharAt2 & '?') | 128));
                    }
                    j5 = j7;
                    j4 = 1;
                } else {
                    i0.H(bArr, j6, (byte) cCharAt2);
                    j5 = j7;
                    str3 = str5;
                    j4 = j3;
                    j6 += j3;
                    str2 = str4;
                }
                i6++;
                str4 = str2;
                str5 = str3;
                j3 = j4;
                j7 = j5;
            }
            return (int) j6;
        }
    }

    static {
        f4146a = (!e.c() || AbstractC0490d.c()) ? new c() : new e();
    }

    static String a(byte[] bArr, int i3, int i4) {
        return f4146a.a(bArr, i3, i4);
    }

    static int b(String str, byte[] bArr, int i3, int i4) {
        return f4146a.b(str, bArr, i3, i4);
    }

    static int c(String str) {
        int length = str.length();
        int i3 = 0;
        while (i3 < length && str.charAt(i3) < 128) {
            i3++;
        }
        int iD = length;
        while (true) {
            if (i3 < length) {
                char cCharAt = str.charAt(i3);
                if (cCharAt >= 2048) {
                    iD += d(str, i3);
                    break;
                }
                iD += (127 - cCharAt) >>> 31;
                i3++;
            } else {
                break;
            }
        }
        if (iD >= length) {
            return iD;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) iD) + 4294967296L));
    }

    private static int d(String str, int i3) {
        int length = str.length();
        int i4 = 0;
        while (i3 < length) {
            char cCharAt = str.charAt(i3);
            if (cCharAt < 2048) {
                i4 += (127 - cCharAt) >>> 31;
            } else {
                i4 += 2;
                if (55296 <= cCharAt && cCharAt <= 57343) {
                    if (Character.codePointAt(str, i3) < 65536) {
                        throw new d(i3, length);
                    }
                    i3++;
                }
            }
            i3++;
        }
        return i4;
    }
}
