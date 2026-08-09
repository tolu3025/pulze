package com.google.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
abstract class A0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final b f6625a;

    private static class a {
        /* JADX INFO: Access modifiers changed from: private */
        public static void h(byte b3, byte b4, byte b5, byte b6, char[] cArr, int i3) throws D {
            if (m(b4) || (((b3 << 28) + (b4 + 112)) >> 30) != 0 || m(b5) || m(b6)) {
                throw D.d();
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
        public static void j(byte b3, byte b4, byte b5, char[] cArr, int i3) throws D {
            if (m(b4) || ((b3 == -32 && b4 < -96) || ((b3 == -19 && b4 >= -96) || m(b5)))) {
                throw D.d();
            }
            cArr[i3] = (char) (((b3 & 15) << 12) | (r(b4) << 6) | r(b5));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void k(byte b3, byte b4, char[] cArr, int i3) throws D {
            if (b3 < -62 || m(b4)) {
                throw D.d();
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

        private static int j(ByteBuffer byteBuffer, int i3, int i4) {
            int iL = i3 + A0.l(byteBuffer, i3, i4);
            while (iL < i4) {
                int i5 = iL + 1;
                byte b3 = byteBuffer.get(iL);
                if (b3 >= 0) {
                    iL = i5;
                } else if (b3 < -32) {
                    if (i5 >= i4) {
                        return b3;
                    }
                    if (b3 < -62 || byteBuffer.get(i5) > -65) {
                        return -1;
                    }
                    iL += 2;
                } else {
                    if (b3 >= -16) {
                        if (i5 >= i4 - 2) {
                            return A0.p(byteBuffer, b3, i5, i4 - i5);
                        }
                        int i6 = iL + 2;
                        byte b4 = byteBuffer.get(i5);
                        if (b4 <= -65 && (((b3 << 28) + (b4 + 112)) >> 30) == 0) {
                            int i7 = iL + 3;
                            if (byteBuffer.get(i6) <= -65) {
                                iL += 4;
                                if (byteBuffer.get(i7) > -65) {
                                }
                            }
                        }
                        return -1;
                    }
                    if (i5 >= i4 - 1) {
                        return A0.p(byteBuffer, b3, i5, i4 - i5);
                    }
                    int i8 = iL + 2;
                    byte b5 = byteBuffer.get(i5);
                    if (b5 > -65 || ((b3 == -32 && b5 < -96) || ((b3 == -19 && b5 >= -96) || byteBuffer.get(i8) > -65))) {
                        return -1;
                    }
                    iL += 3;
                }
            }
            return 0;
        }

        final String a(ByteBuffer byteBuffer, int i3, int i4) {
            if (byteBuffer.hasArray()) {
                return b(byteBuffer.array(), byteBuffer.arrayOffset() + i3, i4);
            }
            return byteBuffer.isDirect() ? d(byteBuffer, i3, i4) : c(byteBuffer, i3, i4);
        }

        abstract String b(byte[] bArr, int i3, int i4);

        final String c(ByteBuffer byteBuffer, int i3, int i4) throws D {
            if ((i3 | i4 | ((byteBuffer.limit() - i3) - i4)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i3), Integer.valueOf(i4)));
            }
            int i5 = i3 + i4;
            char[] cArr = new char[i4];
            int i6 = 0;
            while (i3 < i5) {
                byte b3 = byteBuffer.get(i3);
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
                byte b4 = byteBuffer.get(i3);
                if (a.n(b4)) {
                    int i9 = i7 + 1;
                    a.i(b4, cArr, i7);
                    while (i8 < i5) {
                        byte b5 = byteBuffer.get(i8);
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
                        throw D.d();
                    }
                    i3 += 2;
                    a.k(b4, byteBuffer.get(i8), cArr, i7);
                    i7++;
                } else if (a.o(b4)) {
                    if (i8 >= i5 - 1) {
                        throw D.d();
                    }
                    int i10 = i3 + 2;
                    i3 += 3;
                    a.j(b4, byteBuffer.get(i8), byteBuffer.get(i10), cArr, i7);
                    i7++;
                } else {
                    if (i8 >= i5 - 2) {
                        throw D.d();
                    }
                    byte b6 = byteBuffer.get(i8);
                    int i11 = i3 + 3;
                    byte b7 = byteBuffer.get(i3 + 2);
                    i3 += 4;
                    a.h(b4, b6, b7, byteBuffer.get(i11), cArr, i7);
                    i7 += 2;
                }
            }
            return new String(cArr, 0, i7);
        }

        abstract String d(ByteBuffer byteBuffer, int i3, int i4);

        abstract int e(CharSequence charSequence, byte[] bArr, int i3, int i4);

        final boolean f(ByteBuffer byteBuffer, int i3, int i4) {
            return h(0, byteBuffer, i3, i4) == 0;
        }

        final boolean g(byte[] bArr, int i3, int i4) {
            return i(0, bArr, i3, i4) == 0;
        }

        final int h(int i3, ByteBuffer byteBuffer, int i4, int i5) {
            if (!byteBuffer.hasArray()) {
                return byteBuffer.isDirect() ? l(i3, byteBuffer, i4, i5) : k(i3, byteBuffer, i4, i5);
            }
            int iArrayOffset = byteBuffer.arrayOffset();
            return i(i3, byteBuffer.array(), i4 + iArrayOffset, iArrayOffset + i5);
        }

        abstract int i(int i3, byte[] bArr, int i4, int i5);

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0017, code lost:
        
            if (r8.get(r9) > (-65)) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x004c, code lost:
        
            if (r8.get(r9) > (-65)) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x008f, code lost:
        
            if (r8.get(r7) > (-65)) goto L53;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        final int k(int r7, java.nio.ByteBuffer r8, int r9, int r10) {
            /*
                r6 = this;
                if (r7 == 0) goto L92
                if (r9 < r10) goto L5
                return r7
            L5:
                byte r0 = (byte) r7
                r1 = -32
                r2 = -1
                r3 = -65
                if (r0 >= r1) goto L1e
                r7 = -62
                if (r0 < r7) goto L1d
                int r7 = r9 + 1
                byte r9 = r8.get(r9)
                if (r9 <= r3) goto L1a
                goto L1d
            L1a:
                r9 = r7
                goto L92
            L1d:
                return r2
            L1e:
                r4 = -16
                if (r0 >= r4) goto L4f
                int r7 = r7 >> 8
                int r7 = ~r7
                byte r7 = (byte) r7
                if (r7 != 0) goto L38
                int r7 = r9 + 1
                byte r9 = r8.get(r9)
                if (r7 < r10) goto L35
                int r7 = com.google.protobuf.A0.a(r0, r9)
                return r7
            L35:
                r5 = r9
                r9 = r7
                r7 = r5
            L38:
                if (r7 > r3) goto L4e
                r4 = -96
                if (r0 != r1) goto L40
                if (r7 < r4) goto L4e
            L40:
                r1 = -19
                if (r0 != r1) goto L46
                if (r7 >= r4) goto L4e
            L46:
                int r7 = r9 + 1
                byte r9 = r8.get(r9)
                if (r9 <= r3) goto L1a
            L4e:
                return r2
            L4f:
                int r1 = r7 >> 8
                int r1 = ~r1
                byte r1 = (byte) r1
                if (r1 != 0) goto L64
                int r7 = r9 + 1
                byte r1 = r8.get(r9)
                if (r7 < r10) goto L62
                int r7 = com.google.protobuf.A0.a(r0, r1)
                return r7
            L62:
                r9 = 0
                goto L6a
            L64:
                int r7 = r7 >> 16
                byte r7 = (byte) r7
                r5 = r9
                r9 = r7
                r7 = r5
            L6a:
                if (r9 != 0) goto L7c
                int r9 = r7 + 1
                byte r7 = r8.get(r7)
                if (r9 < r10) goto L79
                int r7 = com.google.protobuf.A0.b(r0, r1, r7)
                return r7
            L79:
                r5 = r9
                r9 = r7
                r7 = r5
            L7c:
                if (r1 > r3) goto L91
                int r0 = r0 << 28
                int r1 = r1 + 112
                int r0 = r0 + r1
                int r0 = r0 >> 30
                if (r0 != 0) goto L91
                if (r9 > r3) goto L91
                int r9 = r7 + 1
                byte r7 = r8.get(r7)
                if (r7 <= r3) goto L92
            L91:
                return r2
            L92:
                int r7 = j(r8, r9, r10)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.A0.b.k(int, java.nio.ByteBuffer, int, int):int");
        }

        abstract int l(int i3, ByteBuffer byteBuffer, int i4, int i5);
    }

    static final class c extends b {
        c() {
        }

        private static int m(byte[] bArr, int i3, int i4) {
            while (i3 < i4 && bArr[i3] >= 0) {
                i3++;
            }
            if (i3 >= i4) {
                return 0;
            }
            return n(bArr, i3, i4);
        }

        private static int n(byte[] bArr, int i3, int i4) {
            while (i3 < i4) {
                int i5 = i3 + 1;
                byte b3 = bArr[i3];
                if (b3 < 0) {
                    if (b3 < -32) {
                        if (i5 >= i4) {
                            return b3;
                        }
                        if (b3 >= -62) {
                            i3 += 2;
                            if (bArr[i5] > -65) {
                            }
                        }
                        return -1;
                    }
                    if (b3 >= -16) {
                        if (i5 >= i4 - 2) {
                            return A0.q(bArr, i5, i4);
                        }
                        int i6 = i3 + 2;
                        byte b4 = bArr[i5];
                        if (b4 <= -65 && (((b3 << 28) + (b4 + 112)) >> 30) == 0) {
                            int i7 = i3 + 3;
                            if (bArr[i6] <= -65) {
                                i3 += 4;
                                if (bArr[i7] > -65) {
                                }
                            }
                        }
                        return -1;
                    }
                    if (i5 >= i4 - 1) {
                        return A0.q(bArr, i5, i4);
                    }
                    int i8 = i3 + 2;
                    byte b5 = bArr[i5];
                    if (b5 <= -65 && ((b3 != -32 || b5 >= -96) && (b3 != -19 || b5 < -96))) {
                        i3 += 3;
                        if (bArr[i8] > -65) {
                        }
                    }
                    return -1;
                }
                i3 = i5;
            }
            return 0;
        }

        @Override // com.google.protobuf.A0.b
        String b(byte[] bArr, int i3, int i4) throws D {
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
                        throw D.d();
                    }
                    i3 += 2;
                    a.k(b4, bArr[i8], cArr, i7);
                    i7++;
                } else if (a.o(b4)) {
                    if (i8 >= i5 - 1) {
                        throw D.d();
                    }
                    int i10 = i3 + 2;
                    i3 += 3;
                    a.j(b4, bArr[i8], bArr[i10], cArr, i7);
                    i7++;
                } else {
                    if (i8 >= i5 - 2) {
                        throw D.d();
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

        @Override // com.google.protobuf.A0.b
        String d(ByteBuffer byteBuffer, int i3, int i4) {
            return c(byteBuffer, i3, i4);
        }

        @Override // com.google.protobuf.A0.b
        int e(CharSequence charSequence, byte[] bArr, int i3, int i4) {
            int i5;
            int i6;
            char cCharAt;
            int length = charSequence.length();
            int i7 = i4 + i3;
            int i8 = 0;
            while (i8 < length && (i6 = i8 + i3) < i7 && (cCharAt = charSequence.charAt(i8)) < 128) {
                bArr[i6] = (byte) cCharAt;
                i8++;
            }
            if (i8 == length) {
                return i3 + length;
            }
            int i9 = i3 + i8;
            while (i8 < length) {
                char cCharAt2 = charSequence.charAt(i8);
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
                            if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i5 = i8 + 1) == charSequence.length() || !Character.isSurrogatePair(cCharAt2, charSequence.charAt(i5)))) {
                                throw new d(i8, length);
                            }
                            throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + i9);
                        }
                        int i11 = i8 + 1;
                        if (i11 != charSequence.length()) {
                            char cCharAt3 = charSequence.charAt(i11);
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

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0015, code lost:
        
            if (r8[r9] > (-65)) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0046, code lost:
        
            if (r8[r9] > (-65)) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x0083, code lost:
        
            if (r8[r7] > (-65)) goto L53;
         */
        @Override // com.google.protobuf.A0.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        int i(int r7, byte[] r8, int r9, int r10) {
            /*
                r6 = this;
                if (r7 == 0) goto L86
                if (r9 < r10) goto L5
                return r7
            L5:
                byte r0 = (byte) r7
                r1 = -32
                r2 = -1
                r3 = -65
                if (r0 >= r1) goto L1c
                r7 = -62
                if (r0 < r7) goto L1b
                int r7 = r9 + 1
                r9 = r8[r9]
                if (r9 <= r3) goto L18
                goto L1b
            L18:
                r9 = r7
                goto L86
            L1b:
                return r2
            L1c:
                r4 = -16
                if (r0 >= r4) goto L49
                int r7 = r7 >> 8
                int r7 = ~r7
                byte r7 = (byte) r7
                if (r7 != 0) goto L34
                int r7 = r9 + 1
                r9 = r8[r9]
                if (r7 < r10) goto L31
                int r7 = com.google.protobuf.A0.a(r0, r9)
                return r7
            L31:
                r5 = r9
                r9 = r7
                r7 = r5
            L34:
                if (r7 > r3) goto L48
                r4 = -96
                if (r0 != r1) goto L3c
                if (r7 < r4) goto L48
            L3c:
                r1 = -19
                if (r0 != r1) goto L42
                if (r7 >= r4) goto L48
            L42:
                int r7 = r9 + 1
                r9 = r8[r9]
                if (r9 <= r3) goto L18
            L48:
                return r2
            L49:
                int r1 = r7 >> 8
                int r1 = ~r1
                byte r1 = (byte) r1
                if (r1 != 0) goto L5c
                int r7 = r9 + 1
                r1 = r8[r9]
                if (r7 < r10) goto L5a
                int r7 = com.google.protobuf.A0.a(r0, r1)
                return r7
            L5a:
                r9 = 0
                goto L62
            L5c:
                int r7 = r7 >> 16
                byte r7 = (byte) r7
                r5 = r9
                r9 = r7
                r7 = r5
            L62:
                if (r9 != 0) goto L72
                int r9 = r7 + 1
                r7 = r8[r7]
                if (r9 < r10) goto L6f
                int r7 = com.google.protobuf.A0.b(r0, r1, r7)
                return r7
            L6f:
                r5 = r9
                r9 = r7
                r7 = r5
            L72:
                if (r1 > r3) goto L85
                int r0 = r0 << 28
                int r1 = r1 + 112
                int r0 = r0 + r1
                int r0 = r0 >> 30
                if (r0 != 0) goto L85
                if (r9 > r3) goto L85
                int r9 = r7 + 1
                r7 = r8[r7]
                if (r7 <= r3) goto L86
            L85:
                return r2
            L86:
                int r7 = m(r8, r9, r10)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.A0.c.i(int, byte[], int, int):int");
        }

        @Override // com.google.protobuf.A0.b
        int l(int i3, ByteBuffer byteBuffer, int i4, int i5) {
            return k(i3, byteBuffer, i4, i5);
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

        static boolean m() {
            return z0.I() && z0.J();
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x0039, code lost:
        
            return -1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x0064, code lost:
        
            return -1;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static int n(long r10, int r12) {
            /*
                int r0 = p(r10, r12)
                long r1 = (long) r0
                long r10 = r10 + r1
                int r12 = r12 - r0
            L7:
                r0 = 0
                r1 = r0
            L9:
                r2 = 1
                if (r12 <= 0) goto L1a
                long r4 = r10 + r2
                byte r1 = com.google.protobuf.z0.w(r10)
                if (r1 < 0) goto L19
                int r12 = r12 + (-1)
                r10 = r4
                goto L9
            L19:
                r10 = r4
            L1a:
                if (r12 != 0) goto L1d
                return r0
            L1d:
                int r0 = r12 + (-1)
                r4 = -32
                r5 = -1
                r6 = -65
                if (r1 >= r4) goto L3a
                if (r0 != 0) goto L29
                return r1
            L29:
                int r12 = r12 + (-2)
                r0 = -62
                if (r1 < r0) goto L39
                long r2 = r2 + r10
                byte r10 = com.google.protobuf.z0.w(r10)
                if (r10 <= r6) goto L37
                goto L39
            L37:
                r10 = r2
                goto L7
            L39:
                return r5
            L3a:
                r7 = -16
                r8 = 2
                if (r1 >= r7) goto L65
                r7 = 2
                if (r0 >= r7) goto L48
                int r10 = r(r10, r1, r0)
                return r10
            L48:
                int r12 = r12 + (-3)
                long r2 = r2 + r10
                byte r0 = com.google.protobuf.z0.w(r10)
                if (r0 > r6) goto L64
                r7 = -96
                if (r1 != r4) goto L57
                if (r0 < r7) goto L64
            L57:
                r4 = -19
                if (r1 != r4) goto L5d
                if (r0 >= r7) goto L64
            L5d:
                long r10 = r10 + r8
                byte r0 = com.google.protobuf.z0.w(r2)
                if (r0 <= r6) goto L7
            L64:
                return r5
            L65:
                r4 = 3
                if (r0 >= r4) goto L6d
                int r10 = r(r10, r1, r0)
                return r10
            L6d:
                int r12 = r12 + (-4)
                long r2 = r2 + r10
                byte r0 = com.google.protobuf.z0.w(r10)
                if (r0 > r6) goto L8f
                int r1 = r1 << 28
                int r0 = r0 + 112
                int r1 = r1 + r0
                int r0 = r1 >> 30
                if (r0 != 0) goto L8f
                long r8 = r8 + r10
                byte r0 = com.google.protobuf.z0.w(r2)
                if (r0 > r6) goto L8f
                r0 = 3
                long r10 = r10 + r0
                byte r0 = com.google.protobuf.z0.w(r8)
                if (r0 <= r6) goto L7
            L8f:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.A0.e.n(long, int):int");
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x0039, code lost:
        
            return -1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x0064, code lost:
        
            return -1;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static int o(byte[] r10, long r11, int r13) {
            /*
                int r0 = q(r10, r11, r13)
                int r13 = r13 - r0
                long r0 = (long) r0
                long r11 = r11 + r0
            L7:
                r0 = 0
                r1 = r0
            L9:
                r2 = 1
                if (r13 <= 0) goto L1a
                long r4 = r11 + r2
                byte r1 = com.google.protobuf.z0.x(r10, r11)
                if (r1 < 0) goto L19
                int r13 = r13 + (-1)
                r11 = r4
                goto L9
            L19:
                r11 = r4
            L1a:
                if (r13 != 0) goto L1d
                return r0
            L1d:
                int r0 = r13 + (-1)
                r4 = -32
                r5 = -1
                r6 = -65
                if (r1 >= r4) goto L3a
                if (r0 != 0) goto L29
                return r1
            L29:
                int r13 = r13 + (-2)
                r0 = -62
                if (r1 < r0) goto L39
                long r2 = r2 + r11
                byte r11 = com.google.protobuf.z0.x(r10, r11)
                if (r11 <= r6) goto L37
                goto L39
            L37:
                r11 = r2
                goto L7
            L39:
                return r5
            L3a:
                r7 = -16
                r8 = 2
                if (r1 >= r7) goto L65
                r7 = 2
                if (r0 >= r7) goto L48
                int r10 = s(r10, r1, r11, r0)
                return r10
            L48:
                int r13 = r13 + (-3)
                long r2 = r2 + r11
                byte r0 = com.google.protobuf.z0.x(r10, r11)
                if (r0 > r6) goto L64
                r7 = -96
                if (r1 != r4) goto L57
                if (r0 < r7) goto L64
            L57:
                r4 = -19
                if (r1 != r4) goto L5d
                if (r0 >= r7) goto L64
            L5d:
                long r11 = r11 + r8
                byte r0 = com.google.protobuf.z0.x(r10, r2)
                if (r0 <= r6) goto L7
            L64:
                return r5
            L65:
                r4 = 3
                if (r0 >= r4) goto L6d
                int r10 = s(r10, r1, r11, r0)
                return r10
            L6d:
                int r13 = r13 + (-4)
                long r2 = r2 + r11
                byte r0 = com.google.protobuf.z0.x(r10, r11)
                if (r0 > r6) goto L8f
                int r1 = r1 << 28
                int r0 = r0 + 112
                int r1 = r1 + r0
                int r0 = r1 >> 30
                if (r0 != 0) goto L8f
                long r8 = r8 + r11
                byte r0 = com.google.protobuf.z0.x(r10, r2)
                if (r0 > r6) goto L8f
                r0 = 3
                long r11 = r11 + r0
                byte r0 = com.google.protobuf.z0.x(r10, r8)
                if (r0 <= r6) goto L7
            L8f:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.A0.e.o(byte[], long, int):int");
        }

        private static int p(long j3, int i3) {
            if (i3 < 16) {
                return 0;
            }
            int i4 = (int) ((-j3) & 7);
            int i5 = i4;
            while (i5 > 0) {
                long j4 = 1 + j3;
                if (z0.w(j3) < 0) {
                    return i4 - i5;
                }
                i5--;
                j3 = j4;
            }
            int i6 = i3 - i4;
            while (i6 >= 8 && (z0.D(j3) & (-9187201950435737472L)) == 0) {
                j3 += 8;
                i6 -= 8;
            }
            return i3 - i6;
        }

        private static int q(byte[] bArr, long j3, int i3) {
            int i4 = 0;
            if (i3 < 16) {
                return 0;
            }
            int i5 = 8 - (((int) j3) & 7);
            while (i4 < i5) {
                long j4 = 1 + j3;
                if (z0.x(bArr, j3) < 0) {
                    return i4;
                }
                i4++;
                j3 = j4;
            }
            while (true) {
                int i6 = i4 + 8;
                if (i6 > i3 || (z0.E(bArr, z0.f7012h + j3) & (-9187201950435737472L)) != 0) {
                    break;
                }
                j3 += 8;
                i4 = i6;
            }
            while (i4 < i3) {
                long j5 = j3 + 1;
                if (z0.x(bArr, j3) < 0) {
                    return i4;
                }
                i4++;
                j3 = j5;
            }
            return i3;
        }

        private static int r(long j3, int i3, int i4) {
            if (i4 == 0) {
                return A0.m(i3);
            }
            if (i4 == 1) {
                return A0.n(i3, z0.w(j3));
            }
            if (i4 == 2) {
                return A0.o(i3, z0.w(j3), z0.w(j3 + 1));
            }
            throw new AssertionError();
        }

        private static int s(byte[] bArr, int i3, long j3, int i4) {
            if (i4 == 0) {
                return A0.m(i3);
            }
            if (i4 == 1) {
                return A0.n(i3, z0.x(bArr, j3));
            }
            if (i4 == 2) {
                return A0.o(i3, z0.x(bArr, j3), z0.x(bArr, j3 + 1));
            }
            throw new AssertionError();
        }

        @Override // com.google.protobuf.A0.b
        String b(byte[] bArr, int i3, int i4) throws D {
            Charset charset = C.f6666b;
            String str = new String(bArr, i3, i4, charset);
            if (str.contains("�") && !Arrays.equals(str.getBytes(charset), Arrays.copyOfRange(bArr, i3, i4 + i3))) {
                throw D.d();
            }
            return str;
        }

        @Override // com.google.protobuf.A0.b
        String d(ByteBuffer byteBuffer, int i3, int i4) throws D {
            if ((i3 | i4 | ((byteBuffer.limit() - i3) - i4)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i3), Integer.valueOf(i4)));
            }
            long jK = z0.k(byteBuffer) + ((long) i3);
            long j3 = ((long) i4) + jK;
            char[] cArr = new char[i4];
            int i5 = 0;
            while (jK < j3) {
                byte bW = z0.w(jK);
                if (!a.n(bW)) {
                    break;
                }
                jK++;
                a.i(bW, cArr, i5);
                i5++;
            }
            while (jK < j3) {
                long j4 = jK + 1;
                byte bW2 = z0.w(jK);
                if (a.n(bW2)) {
                    int i6 = i5 + 1;
                    a.i(bW2, cArr, i5);
                    while (j4 < j3) {
                        byte bW3 = z0.w(j4);
                        if (!a.n(bW3)) {
                            break;
                        }
                        j4++;
                        a.i(bW3, cArr, i6);
                        i6++;
                    }
                    i5 = i6;
                    jK = j4;
                } else if (a.p(bW2)) {
                    if (j4 >= j3) {
                        throw D.d();
                    }
                    jK += 2;
                    a.k(bW2, z0.w(j4), cArr, i5);
                    i5++;
                } else if (a.o(bW2)) {
                    if (j4 >= j3 - 1) {
                        throw D.d();
                    }
                    long j5 = 2 + jK;
                    jK += 3;
                    a.j(bW2, z0.w(j4), z0.w(j5), cArr, i5);
                    i5++;
                } else {
                    if (j4 >= j3 - 2) {
                        throw D.d();
                    }
                    byte bW4 = z0.w(j4);
                    long j6 = jK + 3;
                    byte bW5 = z0.w(2 + jK);
                    jK += 4;
                    a.h(bW2, bW4, bW5, z0.w(j6), cArr, i5);
                    i5 += 2;
                }
            }
            return new String(cArr, 0, i5);
        }

        @Override // com.google.protobuf.A0.b
        int e(CharSequence charSequence, byte[] bArr, int i3, int i4) {
            long j3;
            String str;
            String str2;
            int i5;
            long j4;
            long j5;
            char cCharAt;
            long j6 = i3;
            long j7 = ((long) i4) + j6;
            int length = charSequence.length();
            String str3 = " at index ";
            String str4 = "Failed writing ";
            if (length > i4 || bArr.length - i4 < i3) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(length - 1) + " at index " + (i3 + i4));
            }
            int i6 = 0;
            while (true) {
                j3 = 1;
                if (i6 >= length || (cCharAt = charSequence.charAt(i6)) >= 128) {
                    break;
                }
                z0.O(bArr, j6, (byte) cCharAt);
                i6++;
                j6 = 1 + j6;
            }
            if (i6 == length) {
                return (int) j6;
            }
            while (i6 < length) {
                char cCharAt2 = charSequence.charAt(i6);
                if (cCharAt2 >= 128 || j6 >= j7) {
                    if (cCharAt2 >= 2048 || j6 > j7 - 2) {
                        str = str3;
                        str2 = str4;
                        if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || j6 > j7 - 3) {
                            if (j6 > j7 - 4) {
                                if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i5 = i6 + 1) == length || !Character.isSurrogatePair(cCharAt2, charSequence.charAt(i5)))) {
                                    throw new d(i6, length);
                                }
                                throw new ArrayIndexOutOfBoundsException(str2 + cCharAt2 + str + j6);
                            }
                            int i7 = i6 + 1;
                            if (i7 != length) {
                                char cCharAt3 = charSequence.charAt(i7);
                                if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                    int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                    j4 = 1;
                                    z0.O(bArr, j6, (byte) ((codePoint >>> 18) | 240));
                                    j5 = j7;
                                    z0.O(bArr, j6 + 1, (byte) (((codePoint >>> 12) & 63) | 128));
                                    long j8 = j6 + 3;
                                    z0.O(bArr, j6 + 2, (byte) (((codePoint >>> 6) & 63) | 128));
                                    j6 += 4;
                                    z0.O(bArr, j8, (byte) ((codePoint & 63) | 128));
                                    i6 = i7;
                                } else {
                                    i6 = i7;
                                }
                            }
                            throw new d(i6 - 1, length);
                        }
                        z0.O(bArr, j6, (byte) ((cCharAt2 >>> '\f') | 480));
                        long j9 = j6 + 2;
                        z0.O(bArr, j6 + 1, (byte) (((cCharAt2 >>> 6) & 63) | 128));
                        j6 += 3;
                        z0.O(bArr, j9, (byte) ((cCharAt2 & '?') | 128));
                    } else {
                        str = str3;
                        str2 = str4;
                        long j10 = j6 + j3;
                        z0.O(bArr, j6, (byte) ((cCharAt2 >>> 6) | 960));
                        j6 += 2;
                        z0.O(bArr, j10, (byte) ((cCharAt2 & '?') | 128));
                    }
                    j5 = j7;
                    j4 = 1;
                } else {
                    z0.O(bArr, j6, (byte) cCharAt2);
                    j5 = j7;
                    str2 = str4;
                    j4 = j3;
                    j6 += j3;
                    str = str3;
                }
                i6++;
                str3 = str;
                str4 = str2;
                j3 = j4;
                j7 = j5;
            }
            return (int) j6;
        }

        /* JADX WARN: Code restructure failed: missing block: B:35:0x0059, code lost:
        
            if (com.google.protobuf.z0.x(r13, r1) > (-65)) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x009e, code lost:
        
            if (com.google.protobuf.z0.x(r13, r1) > (-65)) goto L59;
         */
        @Override // com.google.protobuf.A0.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        int i(int r12, byte[] r13, int r14, int r15) {
            /*
                Method dump skipped, instruction units count: 204
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.A0.e.i(int, byte[], int, int):int");
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x002e, code lost:
        
            if (com.google.protobuf.z0.w(r1) > (-65)) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x0062, code lost:
        
            if (com.google.protobuf.z0.w(r1) > (-65)) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x00a3, code lost:
        
            if (com.google.protobuf.z0.w(r1) > (-65)) goto L57;
         */
        @Override // com.google.protobuf.A0.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        int l(int r11, java.nio.ByteBuffer r12, int r13, int r14) {
            /*
                Method dump skipped, instruction units count: 212
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.A0.e.l(int, java.nio.ByteBuffer, int, int):int");
        }
    }

    static {
        f6625a = (!e.m() || AbstractC0786d.c()) ? new c() : new e();
    }

    static String g(ByteBuffer byteBuffer, int i3, int i4) {
        return f6625a.a(byteBuffer, i3, i4);
    }

    static String h(byte[] bArr, int i3, int i4) {
        return f6625a.b(bArr, i3, i4);
    }

    static int i(CharSequence charSequence, byte[] bArr, int i3, int i4) {
        return f6625a.e(charSequence, bArr, i3, i4);
    }

    static int j(CharSequence charSequence) {
        int length = charSequence.length();
        int i3 = 0;
        while (i3 < length && charSequence.charAt(i3) < 128) {
            i3++;
        }
        int iK = length;
        while (true) {
            if (i3 < length) {
                char cCharAt = charSequence.charAt(i3);
                if (cCharAt >= 2048) {
                    iK += k(charSequence, i3);
                    break;
                }
                iK += (127 - cCharAt) >>> 31;
                i3++;
            } else {
                break;
            }
        }
        if (iK >= length) {
            return iK;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) iK) + 4294967296L));
    }

    private static int k(CharSequence charSequence, int i3) {
        int length = charSequence.length();
        int i4 = 0;
        while (i3 < length) {
            char cCharAt = charSequence.charAt(i3);
            if (cCharAt < 2048) {
                i4 += (127 - cCharAt) >>> 31;
            } else {
                i4 += 2;
                if (55296 <= cCharAt && cCharAt <= 57343) {
                    if (Character.codePointAt(charSequence, i3) < 65536) {
                        throw new d(i3, length);
                    }
                    i3++;
                }
            }
            i3++;
        }
        return i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int l(ByteBuffer byteBuffer, int i3, int i4) {
        int i5 = i4 - 7;
        int i6 = i3;
        while (i6 < i5 && (byteBuffer.getLong(i6) & (-9187201950435737472L)) == 0) {
            i6 += 8;
        }
        return i6 - i3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int m(int i3) {
        if (i3 > -12) {
            return -1;
        }
        return i3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int n(int i3, int i4) {
        if (i3 > -12 || i4 > -65) {
            return -1;
        }
        return i3 ^ (i4 << 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int o(int i3, int i4, int i5) {
        if (i3 > -12 || i4 > -65 || i5 > -65) {
            return -1;
        }
        return (i3 ^ (i4 << 8)) ^ (i5 << 16);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int p(ByteBuffer byteBuffer, int i3, int i4, int i5) {
        if (i5 == 0) {
            return m(i3);
        }
        if (i5 == 1) {
            return n(i3, byteBuffer.get(i4));
        }
        if (i5 == 2) {
            return o(i3, byteBuffer.get(i4), byteBuffer.get(i4 + 1));
        }
        throw new AssertionError();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int q(byte[] bArr, int i3, int i4) {
        byte b3 = bArr[i3 - 1];
        int i5 = i4 - i3;
        if (i5 == 0) {
            return m(b3);
        }
        if (i5 == 1) {
            return n(b3, bArr[i3]);
        }
        if (i5 == 2) {
            return o(b3, bArr[i3], bArr[i3 + 1]);
        }
        throw new AssertionError();
    }

    static boolean r(ByteBuffer byteBuffer) {
        return f6625a.f(byteBuffer, byteBuffer.position(), byteBuffer.remaining());
    }

    static boolean s(byte[] bArr) {
        return f6625a.g(bArr, 0, bArr.length);
    }

    static boolean t(byte[] bArr, int i3, int i4) {
        return f6625a.g(bArr, i3, i4);
    }

    static int u(int i3, ByteBuffer byteBuffer, int i4, int i5) {
        return f6625a.h(i3, byteBuffer, i4, i5);
    }

    static int v(int i3, byte[] bArr, int i4, int i5) {
        return f6625a.i(i3, bArr, i4, i5);
    }
}
