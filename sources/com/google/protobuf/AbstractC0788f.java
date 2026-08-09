package com.google.protobuf;

import com.google.protobuf.C;

/* JADX INFO: renamed from: com.google.protobuf.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC0788f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile int f6760a = 100;

    /* JADX INFO: renamed from: com.google.protobuf.f$a */
    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f6761a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f6762b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f6763c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final C0799q f6764d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f6765e;

        a(C0799q c0799q) {
            c0799q.getClass();
            this.f6764d = c0799q;
        }
    }

    static int A(int i3, byte[] bArr, int i4, int i5, C.e eVar, a aVar) {
        B b3 = (B) eVar;
        int I2 = I(bArr, i4, aVar);
        while (true) {
            b3.f(AbstractC0792j.c(aVar.f6761a));
            if (I2 >= i5) {
                break;
            }
            int I3 = I(bArr, I2, aVar);
            if (i3 != aVar.f6761a) {
                break;
            }
            I2 = I(bArr, I3, aVar);
        }
        return I2;
    }

    static int B(int i3, byte[] bArr, int i4, int i5, C.e eVar, a aVar) {
        L l3 = (L) eVar;
        int iL = L(bArr, i4, aVar);
        while (true) {
            l3.b(AbstractC0792j.d(aVar.f6762b));
            if (iL >= i5) {
                break;
            }
            int I2 = I(bArr, iL, aVar);
            if (i3 != aVar.f6761a) {
                break;
            }
            iL = L(bArr, I2, aVar);
        }
        return iL;
    }

    static int C(byte[] bArr, int i3, a aVar) throws D {
        int I2 = I(bArr, i3, aVar);
        int i4 = aVar.f6761a;
        if (i4 < 0) {
            throw D.g();
        }
        if (i4 == 0) {
            aVar.f6763c = "";
            return I2;
        }
        aVar.f6763c = new String(bArr, I2, i4, C.f6666b);
        return I2 + i4;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x002e -> B:6:0x000c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static int D(int r4, byte[] r5, int r6, int r7, com.google.protobuf.C.e r8, com.google.protobuf.AbstractC0788f.a r9) throws com.google.protobuf.D {
        /*
            int r6 = I(r5, r6, r9)
            int r0 = r9.f6761a
            if (r0 < 0) goto L3f
            java.lang.String r1 = ""
            if (r0 != 0) goto L10
        Lc:
            r8.add(r1)
            goto L1b
        L10:
            java.lang.String r2 = new java.lang.String
            java.nio.charset.Charset r3 = com.google.protobuf.C.f6666b
            r2.<init>(r5, r6, r0, r3)
        L17:
            r8.add(r2)
            int r6 = r6 + r0
        L1b:
            if (r6 >= r7) goto L3e
            int r0 = I(r5, r6, r9)
            int r2 = r9.f6761a
            if (r4 == r2) goto L26
            goto L3e
        L26:
            int r6 = I(r5, r0, r9)
            int r0 = r9.f6761a
            if (r0 < 0) goto L39
            if (r0 != 0) goto L31
            goto Lc
        L31:
            java.lang.String r2 = new java.lang.String
            java.nio.charset.Charset r3 = com.google.protobuf.C.f6666b
            r2.<init>(r5, r6, r0, r3)
            goto L17
        L39:
            com.google.protobuf.D r4 = com.google.protobuf.D.g()
            throw r4
        L3e:
            return r6
        L3f:
            com.google.protobuf.D r4 = com.google.protobuf.D.g()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.AbstractC0788f.D(int, byte[], int, int, com.google.protobuf.C$e, com.google.protobuf.f$a):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0036 -> B:6:0x000c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static int E(int r5, byte[] r6, int r7, int r8, com.google.protobuf.C.e r9, com.google.protobuf.AbstractC0788f.a r10) throws com.google.protobuf.D {
        /*
            int r7 = I(r6, r7, r10)
            int r0 = r10.f6761a
            if (r0 < 0) goto L59
            java.lang.String r1 = ""
            if (r0 != 0) goto L10
        Lc:
            r9.add(r1)
            goto L23
        L10:
            int r2 = r7 + r0
            boolean r3 = com.google.protobuf.A0.t(r6, r7, r2)
            if (r3 == 0) goto L54
            java.lang.String r3 = new java.lang.String
            java.nio.charset.Charset r4 = com.google.protobuf.C.f6666b
            r3.<init>(r6, r7, r0, r4)
        L1f:
            r9.add(r3)
            r7 = r2
        L23:
            if (r7 >= r8) goto L53
            int r0 = I(r6, r7, r10)
            int r2 = r10.f6761a
            if (r5 == r2) goto L2e
            goto L53
        L2e:
            int r7 = I(r6, r0, r10)
            int r0 = r10.f6761a
            if (r0 < 0) goto L4e
            if (r0 != 0) goto L39
            goto Lc
        L39:
            int r2 = r7 + r0
            boolean r3 = com.google.protobuf.A0.t(r6, r7, r2)
            if (r3 == 0) goto L49
            java.lang.String r3 = new java.lang.String
            java.nio.charset.Charset r4 = com.google.protobuf.C.f6666b
            r3.<init>(r6, r7, r0, r4)
            goto L1f
        L49:
            com.google.protobuf.D r5 = com.google.protobuf.D.d()
            throw r5
        L4e:
            com.google.protobuf.D r5 = com.google.protobuf.D.g()
            throw r5
        L53:
            return r7
        L54:
            com.google.protobuf.D r5 = com.google.protobuf.D.d()
            throw r5
        L59:
            com.google.protobuf.D r5 = com.google.protobuf.D.g()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.AbstractC0788f.E(int, byte[], int, int, com.google.protobuf.C$e, com.google.protobuf.f$a):int");
    }

    static int F(byte[] bArr, int i3, a aVar) throws D {
        int I2 = I(bArr, i3, aVar);
        int i4 = aVar.f6761a;
        if (i4 < 0) {
            throw D.g();
        }
        if (i4 == 0) {
            aVar.f6763c = "";
            return I2;
        }
        aVar.f6763c = A0.h(bArr, I2, i4);
        return I2 + i4;
    }

    static int G(int i3, byte[] bArr, int i4, int i5, w0 w0Var, a aVar) throws D {
        if (B0.a(i3) == 0) {
            throw D.c();
        }
        int iB = B0.b(i3);
        if (iB == 0) {
            int iL = L(bArr, i4, aVar);
            w0Var.n(i3, Long.valueOf(aVar.f6762b));
            return iL;
        }
        if (iB == 1) {
            w0Var.n(i3, Long.valueOf(j(bArr, i4)));
            return i4 + 8;
        }
        if (iB == 2) {
            int I2 = I(bArr, i4, aVar);
            int i6 = aVar.f6761a;
            if (i6 < 0) {
                throw D.g();
            }
            if (i6 > bArr.length - I2) {
                throw D.m();
            }
            w0Var.n(i3, i6 == 0 ? AbstractC0791i.f6770b : AbstractC0791i.q(bArr, I2, i6));
            return I2 + i6;
        }
        if (iB != 3) {
            if (iB != 5) {
                throw D.c();
            }
            w0Var.n(i3, Integer.valueOf(h(bArr, i4)));
            return i4 + 4;
        }
        w0 w0VarK = w0.k();
        int i7 = (i3 & (-8)) | 4;
        int i8 = aVar.f6765e + 1;
        aVar.f6765e = i8;
        a(i8);
        int i9 = 0;
        while (true) {
            if (i4 >= i5) {
                break;
            }
            int I3 = I(bArr, i4, aVar);
            int i10 = aVar.f6761a;
            i9 = i10;
            if (i10 == i7) {
                i4 = I3;
                break;
            }
            int iG = G(i9, bArr, I3, i5, w0VarK, aVar);
            i9 = i10;
            i4 = iG;
        }
        aVar.f6765e--;
        if (i4 > i5 || i9 != i7) {
            throw D.h();
        }
        w0Var.n(i3, w0VarK);
        return i4;
    }

    static int H(int i3, byte[] bArr, int i4, a aVar) {
        int i5;
        int i6 = i3 & 127;
        int i7 = i4 + 1;
        byte b3 = bArr[i4];
        if (b3 >= 0) {
            i5 = b3 << 7;
        } else {
            int i8 = i6 | ((b3 & 127) << 7);
            int i9 = i4 + 2;
            byte b4 = bArr[i7];
            if (b4 >= 0) {
                aVar.f6761a = i8 | (b4 << 14);
                return i9;
            }
            i6 = i8 | ((b4 & 127) << 14);
            i7 = i4 + 3;
            byte b5 = bArr[i9];
            if (b5 >= 0) {
                i5 = b5 << 21;
            } else {
                int i10 = i6 | ((b5 & 127) << 21);
                int i11 = i4 + 4;
                byte b6 = bArr[i7];
                if (b6 >= 0) {
                    aVar.f6761a = i10 | (b6 << 28);
                    return i11;
                }
                int i12 = i10 | ((b6 & 127) << 28);
                while (true) {
                    int i13 = i11 + 1;
                    if (bArr[i11] >= 0) {
                        aVar.f6761a = i12;
                        return i13;
                    }
                    i11 = i13;
                }
            }
        }
        aVar.f6761a = i6 | i5;
        return i7;
    }

    static int I(byte[] bArr, int i3, a aVar) {
        int i4 = i3 + 1;
        byte b3 = bArr[i3];
        if (b3 < 0) {
            return H(b3, bArr, i4, aVar);
        }
        aVar.f6761a = b3;
        return i4;
    }

    static int J(int i3, byte[] bArr, int i4, int i5, C.e eVar, a aVar) {
        B b3 = (B) eVar;
        int I2 = I(bArr, i4, aVar);
        while (true) {
            b3.f(aVar.f6761a);
            if (I2 >= i5) {
                break;
            }
            int I3 = I(bArr, I2, aVar);
            if (i3 != aVar.f6761a) {
                break;
            }
            I2 = I(bArr, I3, aVar);
        }
        return I2;
    }

    static int K(long j3, byte[] bArr, int i3, a aVar) {
        int i4 = i3 + 1;
        byte b3 = bArr[i3];
        long j4 = (j3 & 127) | (((long) (b3 & 127)) << 7);
        int i5 = 7;
        while (b3 < 0) {
            int i6 = i4 + 1;
            byte b4 = bArr[i4];
            i5 += 7;
            j4 |= ((long) (b4 & 127)) << i5;
            i4 = i6;
            b3 = b4;
        }
        aVar.f6762b = j4;
        return i4;
    }

    static int L(byte[] bArr, int i3, a aVar) {
        int i4 = i3 + 1;
        long j3 = bArr[i3];
        if (j3 < 0) {
            return K(j3, bArr, i4, aVar);
        }
        aVar.f6762b = j3;
        return i4;
    }

    static int M(int i3, byte[] bArr, int i4, int i5, C.e eVar, a aVar) {
        L l3 = (L) eVar;
        int iL = L(bArr, i4, aVar);
        while (true) {
            l3.b(aVar.f6762b);
            if (iL >= i5) {
                break;
            }
            int I2 = I(bArr, iL, aVar);
            if (i3 != aVar.f6761a) {
                break;
            }
            iL = L(bArr, I2, aVar);
        }
        return iL;
    }

    static int N(Object obj, n0 n0Var, byte[] bArr, int i3, int i4, int i5, a aVar) throws D {
        Y y2 = (Y) n0Var;
        int i6 = aVar.f6765e + 1;
        aVar.f6765e = i6;
        a(i6);
        int iD0 = y2.d0(obj, bArr, i3, i4, i5, aVar);
        aVar.f6765e--;
        aVar.f6763c = obj;
        return iD0;
    }

    static int O(Object obj, n0 n0Var, byte[] bArr, int i3, int i4, a aVar) throws D {
        int iH = i3 + 1;
        int i5 = bArr[i3];
        if (i5 < 0) {
            iH = H(i5, bArr, iH, aVar);
            i5 = aVar.f6761a;
        }
        int i6 = iH;
        if (i5 < 0 || i5 > i4 - i6) {
            throw D.m();
        }
        int i7 = aVar.f6765e + 1;
        aVar.f6765e = i7;
        a(i7);
        int i8 = i5 + i6;
        n0Var.j(obj, bArr, i6, i8, aVar);
        aVar.f6765e--;
        aVar.f6763c = obj;
        return i8;
    }

    static int P(int i3, byte[] bArr, int i4, int i5, a aVar) throws D {
        if (B0.a(i3) == 0) {
            throw D.c();
        }
        int iB = B0.b(i3);
        if (iB == 0) {
            return L(bArr, i4, aVar);
        }
        if (iB == 1) {
            return i4 + 8;
        }
        if (iB == 2) {
            return I(bArr, i4, aVar) + aVar.f6761a;
        }
        if (iB != 3) {
            if (iB == 5) {
                return i4 + 4;
            }
            throw D.c();
        }
        int i6 = (i3 & (-8)) | 4;
        int i7 = 0;
        while (i4 < i5) {
            i4 = I(bArr, i4, aVar);
            i7 = aVar.f6761a;
            if (i7 == i6) {
                break;
            }
            i4 = P(i7, bArr, i4, i5, aVar);
        }
        if (i4 > i5 || i7 != i6) {
            throw D.h();
        }
        return i4;
    }

    private static void a(int i3) throws D {
        if (i3 >= f6760a) {
            throw D.i();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0021, code lost:
    
        r9 = L(r8, r0, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0029, code lost:
    
        if (r12.f6762b == 0) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002c, code lost:
    
        return r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0013, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x000e, code lost:
    
        if (r12.f6762b != 0) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0010, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0013, code lost:
    
        r11.b(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r9 >= r10) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        r0 = I(r8, r9, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001e, code lost:
    
        if (r7 == r12.f6761a) goto L11;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0029 -> B:4:0x0010). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static int b(int r7, byte[] r8, int r9, int r10, com.google.protobuf.C.e r11, com.google.protobuf.AbstractC0788f.a r12) {
        /*
            com.google.protobuf.g r11 = (com.google.protobuf.AbstractC0789g) r11
            int r9 = L(r8, r9, r12)
            long r0 = r12.f6762b
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 0
            r4 = 1
            if (r0 == 0) goto L12
        L10:
            r0 = r4
            goto L13
        L12:
            r0 = r1
        L13:
            r11.b(r0)
            if (r9 >= r10) goto L2c
            int r0 = I(r8, r9, r12)
            int r5 = r12.f6761a
            if (r7 == r5) goto L21
            goto L2c
        L21:
            int r9 = L(r8, r0, r12)
            long r5 = r12.f6762b
            int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r0 == 0) goto L12
            goto L10
        L2c:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.AbstractC0788f.b(int, byte[], int, int, com.google.protobuf.C$e, com.google.protobuf.f$a):int");
    }

    static int c(byte[] bArr, int i3, a aVar) throws D {
        int I2 = I(bArr, i3, aVar);
        int i4 = aVar.f6761a;
        if (i4 < 0) {
            throw D.g();
        }
        if (i4 > bArr.length - I2) {
            throw D.m();
        }
        if (i4 == 0) {
            aVar.f6763c = AbstractC0791i.f6770b;
            return I2;
        }
        aVar.f6763c = AbstractC0791i.q(bArr, I2, i4);
        return I2 + i4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
    
        r0 = I(r3, r4, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0024, code lost:
    
        if (r2 == r7.f6761a) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0027, code lost:
    
        r4 = I(r3, r0, r7);
        r0 = r7.f6761a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
    
        if (r0 < 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0031, code lost:
    
        if (r0 > (r3.length - r4)) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
    
        if (r0 != 0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003a, code lost:
    
        throw com.google.protobuf.D.m();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003f, code lost:
    
        throw com.google.protobuf.D.g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0040, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x001c, code lost:
    
        r6.add(com.google.protobuf.AbstractC0791i.q(r3, r4, r0));
        r4 = r4 + r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x000c, code lost:
    
        if (r0 == 0) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x000e, code lost:
    
        r6.add(com.google.protobuf.AbstractC0791i.f6770b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0014, code lost:
    
        r6.add(com.google.protobuf.AbstractC0791i.q(r3, r4, r0));
        r4 = r4 + r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001c, code lost:
    
        if (r4 >= r5) goto L31;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0033 -> B:7:0x000e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static int d(int r2, byte[] r3, int r4, int r5, com.google.protobuf.C.e r6, com.google.protobuf.AbstractC0788f.a r7) throws com.google.protobuf.D {
        /*
            int r4 = I(r3, r4, r7)
            int r0 = r7.f6761a
            if (r0 < 0) goto L46
            int r1 = r3.length
            int r1 = r1 - r4
            if (r0 > r1) goto L41
            if (r0 != 0) goto L14
        Le:
            com.google.protobuf.i r0 = com.google.protobuf.AbstractC0791i.f6770b
            r6.add(r0)
            goto L1c
        L14:
            com.google.protobuf.i r1 = com.google.protobuf.AbstractC0791i.q(r3, r4, r0)
            r6.add(r1)
            int r4 = r4 + r0
        L1c:
            if (r4 >= r5) goto L40
            int r0 = I(r3, r4, r7)
            int r1 = r7.f6761a
            if (r2 == r1) goto L27
            goto L40
        L27:
            int r4 = I(r3, r0, r7)
            int r0 = r7.f6761a
            if (r0 < 0) goto L3b
            int r1 = r3.length
            int r1 = r1 - r4
            if (r0 > r1) goto L36
            if (r0 != 0) goto L14
            goto Le
        L36:
            com.google.protobuf.D r2 = com.google.protobuf.D.m()
            throw r2
        L3b:
            com.google.protobuf.D r2 = com.google.protobuf.D.g()
            throw r2
        L40:
            return r4
        L41:
            com.google.protobuf.D r2 = com.google.protobuf.D.m()
            throw r2
        L46:
            com.google.protobuf.D r2 = com.google.protobuf.D.g()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.AbstractC0788f.d(int, byte[], int, int, com.google.protobuf.C$e, com.google.protobuf.f$a):int");
    }

    static double e(byte[] bArr, int i3) {
        return Double.longBitsToDouble(j(bArr, i3));
    }

    static int f(int i3, byte[] bArr, int i4, int i5, C.e eVar, a aVar) {
        AbstractC0796n abstractC0796n = (AbstractC0796n) eVar;
        abstractC0796n.b(e(bArr, i4));
        int i6 = i4 + 8;
        while (i6 < i5) {
            int I2 = I(bArr, i6, aVar);
            if (i3 != aVar.f6761a) {
                break;
            }
            abstractC0796n.b(e(bArr, I2));
            i6 = I2 + 8;
        }
        return i6;
    }

    static int g(int i3, byte[] bArr, int i4, int i5, Object obj, V v2, v0 v0Var, a aVar) {
        aVar.f6764d.a(v2, i3 >>> 3);
        return G(i3, bArr, i4, i5, Y.w(obj), aVar);
    }

    static int h(byte[] bArr, int i3) {
        return ((bArr[i3 + 3] & 255) << 24) | (bArr[i3] & 255) | ((bArr[i3 + 1] & 255) << 8) | ((bArr[i3 + 2] & 255) << 16);
    }

    static int i(int i3, byte[] bArr, int i4, int i5, C.e eVar, a aVar) {
        B b3 = (B) eVar;
        b3.f(h(bArr, i4));
        int i6 = i4 + 4;
        while (i6 < i5) {
            int I2 = I(bArr, i6, aVar);
            if (i3 != aVar.f6761a) {
                break;
            }
            b3.f(h(bArr, I2));
            i6 = I2 + 4;
        }
        return i6;
    }

    static long j(byte[] bArr, int i3) {
        return ((((long) bArr[i3 + 7]) & 255) << 56) | (((long) bArr[i3]) & 255) | ((((long) bArr[i3 + 1]) & 255) << 8) | ((((long) bArr[i3 + 2]) & 255) << 16) | ((((long) bArr[i3 + 3]) & 255) << 24) | ((((long) bArr[i3 + 4]) & 255) << 32) | ((((long) bArr[i3 + 5]) & 255) << 40) | ((((long) bArr[i3 + 6]) & 255) << 48);
    }

    static int k(int i3, byte[] bArr, int i4, int i5, C.e eVar, a aVar) {
        L l3 = (L) eVar;
        l3.b(j(bArr, i4));
        int i6 = i4 + 8;
        while (i6 < i5) {
            int I2 = I(bArr, i6, aVar);
            if (i3 != aVar.f6761a) {
                break;
            }
            l3.b(j(bArr, I2));
            i6 = I2 + 8;
        }
        return i6;
    }

    static float l(byte[] bArr, int i3) {
        return Float.intBitsToFloat(h(bArr, i3));
    }

    static int m(int i3, byte[] bArr, int i4, int i5, C.e eVar, a aVar) {
        AbstractC0804w abstractC0804w = (AbstractC0804w) eVar;
        abstractC0804w.b(l(bArr, i4));
        int i6 = i4 + 4;
        while (i6 < i5) {
            int I2 = I(bArr, i6, aVar);
            if (i3 != aVar.f6761a) {
                break;
            }
            abstractC0804w.b(l(bArr, I2));
            i6 = I2 + 4;
        }
        return i6;
    }

    static int n(n0 n0Var, byte[] bArr, int i3, int i4, int i5, a aVar) throws D {
        Object objF = n0Var.f();
        int iN = N(objF, n0Var, bArr, i3, i4, i5, aVar);
        n0Var.b(objF);
        aVar.f6763c = objF;
        return iN;
    }

    static int o(n0 n0Var, int i3, byte[] bArr, int i4, int i5, C.e eVar, a aVar) throws D {
        int i6 = (i3 & (-8)) | 4;
        int iN = n(n0Var, bArr, i4, i5, i6, aVar);
        while (true) {
            eVar.add(aVar.f6763c);
            if (iN >= i5) {
                break;
            }
            int I2 = I(bArr, iN, aVar);
            if (i3 != aVar.f6761a) {
                break;
            }
            iN = n(n0Var, bArr, I2, i5, i6, aVar);
        }
        return iN;
    }

    static int p(n0 n0Var, byte[] bArr, int i3, int i4, a aVar) throws D {
        Object objF = n0Var.f();
        int iO = O(objF, n0Var, bArr, i3, i4, aVar);
        n0Var.b(objF);
        aVar.f6763c = objF;
        return iO;
    }

    static int q(n0 n0Var, int i3, byte[] bArr, int i4, int i5, C.e eVar, a aVar) throws D {
        int iP = p(n0Var, bArr, i4, i5, aVar);
        while (true) {
            eVar.add(aVar.f6763c);
            if (iP >= i5) {
                break;
            }
            int I2 = I(bArr, iP, aVar);
            if (i3 != aVar.f6761a) {
                break;
            }
            iP = p(n0Var, bArr, I2, i5, aVar);
        }
        return iP;
    }

    static int r(byte[] bArr, int i3, C.e eVar, a aVar) throws D {
        AbstractC0789g abstractC0789g = (AbstractC0789g) eVar;
        int I2 = I(bArr, i3, aVar);
        int i4 = aVar.f6761a + I2;
        while (I2 < i4) {
            I2 = L(bArr, I2, aVar);
            abstractC0789g.b(aVar.f6762b != 0);
        }
        if (I2 == i4) {
            return I2;
        }
        throw D.m();
    }

    static int s(byte[] bArr, int i3, C.e eVar, a aVar) throws D {
        AbstractC0796n abstractC0796n = (AbstractC0796n) eVar;
        int I2 = I(bArr, i3, aVar);
        int i4 = aVar.f6761a + I2;
        while (I2 < i4) {
            abstractC0796n.b(e(bArr, I2));
            I2 += 8;
        }
        if (I2 == i4) {
            return I2;
        }
        throw D.m();
    }

    static int t(byte[] bArr, int i3, C.e eVar, a aVar) throws D {
        B b3 = (B) eVar;
        int I2 = I(bArr, i3, aVar);
        int i4 = aVar.f6761a + I2;
        while (I2 < i4) {
            b3.f(h(bArr, I2));
            I2 += 4;
        }
        if (I2 == i4) {
            return I2;
        }
        throw D.m();
    }

    static int u(byte[] bArr, int i3, C.e eVar, a aVar) throws D {
        L l3 = (L) eVar;
        int I2 = I(bArr, i3, aVar);
        int i4 = aVar.f6761a + I2;
        while (I2 < i4) {
            l3.b(j(bArr, I2));
            I2 += 8;
        }
        if (I2 == i4) {
            return I2;
        }
        throw D.m();
    }

    static int v(byte[] bArr, int i3, C.e eVar, a aVar) throws D {
        AbstractC0804w abstractC0804w = (AbstractC0804w) eVar;
        int I2 = I(bArr, i3, aVar);
        int i4 = aVar.f6761a + I2;
        while (I2 < i4) {
            abstractC0804w.b(l(bArr, I2));
            I2 += 4;
        }
        if (I2 == i4) {
            return I2;
        }
        throw D.m();
    }

    static int w(byte[] bArr, int i3, C.e eVar, a aVar) throws D {
        B b3 = (B) eVar;
        int I2 = I(bArr, i3, aVar);
        int i4 = aVar.f6761a + I2;
        while (I2 < i4) {
            I2 = I(bArr, I2, aVar);
            b3.f(AbstractC0792j.c(aVar.f6761a));
        }
        if (I2 == i4) {
            return I2;
        }
        throw D.m();
    }

    static int x(byte[] bArr, int i3, C.e eVar, a aVar) throws D {
        L l3 = (L) eVar;
        int I2 = I(bArr, i3, aVar);
        int i4 = aVar.f6761a + I2;
        while (I2 < i4) {
            I2 = L(bArr, I2, aVar);
            l3.b(AbstractC0792j.d(aVar.f6762b));
        }
        if (I2 == i4) {
            return I2;
        }
        throw D.m();
    }

    static int y(byte[] bArr, int i3, C.e eVar, a aVar) throws D {
        B b3 = (B) eVar;
        int I2 = I(bArr, i3, aVar);
        int i4 = aVar.f6761a + I2;
        while (I2 < i4) {
            I2 = I(bArr, I2, aVar);
            b3.f(aVar.f6761a);
        }
        if (I2 == i4) {
            return I2;
        }
        throw D.m();
    }

    static int z(byte[] bArr, int i3, C.e eVar, a aVar) throws D {
        L l3 = (L) eVar;
        int I2 = I(bArr, i3, aVar);
        int i4 = aVar.f6761a + I2;
        while (I2 < i4) {
            I2 = L(bArr, I2, aVar);
            l3.b(aVar.f6762b);
        }
        if (I2 == i4) {
            return I2;
        }
        throw D.m();
    }
}
