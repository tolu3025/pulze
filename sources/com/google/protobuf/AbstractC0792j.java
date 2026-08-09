package com.google.protobuf;

import com.google.android.gms.common.api.a;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.google.protobuf.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0792j {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static volatile int f6783f = 100;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f6784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f6785b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f6786c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    C0793k f6787d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f6788e;

    /* JADX INFO: renamed from: com.google.protobuf.j$b */
    private static final class b extends AbstractC0792j {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final byte[] f6789g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final boolean f6790h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f6791i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f6792j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f6793k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f6794l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f6795m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private boolean f6796n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private int f6797o;

        private b(byte[] bArr, int i3, int i4, boolean z2) {
            super();
            this.f6797o = a.e.API_PRIORITY_OTHER;
            this.f6789g = bArr;
            this.f6791i = i4 + i3;
            this.f6793k = i3;
            this.f6794l = i3;
            this.f6790h = z2;
        }

        private void S() {
            int i3 = this.f6791i + this.f6792j;
            this.f6791i = i3;
            int i4 = i3 - this.f6794l;
            int i5 = this.f6797o;
            if (i4 <= i5) {
                this.f6792j = 0;
                return;
            }
            int i6 = i4 - i5;
            this.f6792j = i6;
            this.f6791i = i3 - i6;
        }

        private void U() throws D {
            if (this.f6791i - this.f6793k >= 10) {
                V();
            } else {
                W();
            }
        }

        private void V() throws D {
            for (int i3 = 0; i3 < 10; i3++) {
                byte[] bArr = this.f6789g;
                int i4 = this.f6793k;
                this.f6793k = i4 + 1;
                if (bArr[i4] >= 0) {
                    return;
                }
            }
            throw D.f();
        }

        private void W() throws D {
            for (int i3 = 0; i3 < 10; i3++) {
                if (L() >= 0) {
                    return;
                }
            }
            throw D.f();
        }

        @Override // com.google.protobuf.AbstractC0792j
        public int A() {
            return AbstractC0792j.c(P());
        }

        @Override // com.google.protobuf.AbstractC0792j
        public long B() {
            return AbstractC0792j.d(Q());
        }

        @Override // com.google.protobuf.AbstractC0792j
        public String C() throws D {
            int iP = P();
            if (iP > 0) {
                int i3 = this.f6791i;
                int i4 = this.f6793k;
                if (iP <= i3 - i4) {
                    String str = new String(this.f6789g, i4, iP, C.f6666b);
                    this.f6793k += iP;
                    return str;
                }
            }
            if (iP == 0) {
                return "";
            }
            if (iP < 0) {
                throw D.g();
            }
            throw D.m();
        }

        @Override // com.google.protobuf.AbstractC0792j
        public String D() throws D {
            int iP = P();
            if (iP > 0) {
                int i3 = this.f6791i;
                int i4 = this.f6793k;
                if (iP <= i3 - i4) {
                    String strH = A0.h(this.f6789g, i4, iP);
                    this.f6793k += iP;
                    return strH;
                }
            }
            if (iP == 0) {
                return "";
            }
            if (iP <= 0) {
                throw D.g();
            }
            throw D.m();
        }

        @Override // com.google.protobuf.AbstractC0792j
        public int E() throws D {
            if (f()) {
                this.f6795m = 0;
                return 0;
            }
            int iP = P();
            this.f6795m = iP;
            if (B0.a(iP) != 0) {
                return this.f6795m;
            }
            throw D.c();
        }

        @Override // com.google.protobuf.AbstractC0792j
        public int F() {
            return P();
        }

        @Override // com.google.protobuf.AbstractC0792j
        public long G() {
            return Q();
        }

        @Override // com.google.protobuf.AbstractC0792j
        public boolean J(int i3) throws D {
            int iB = B0.b(i3);
            if (iB == 0) {
                U();
                return true;
            }
            if (iB == 1) {
                T(8);
                return true;
            }
            if (iB == 2) {
                T(P());
                return true;
            }
            if (iB == 3) {
                K();
                a(B0.c(B0.a(i3), 4));
                return true;
            }
            if (iB == 4) {
                return false;
            }
            if (iB != 5) {
                throw D.e();
            }
            T(4);
            return true;
        }

        public byte L() throws D {
            int i3 = this.f6793k;
            if (i3 == this.f6791i) {
                throw D.m();
            }
            byte[] bArr = this.f6789g;
            this.f6793k = i3 + 1;
            return bArr[i3];
        }

        public byte[] M(int i3) throws D {
            if (i3 > 0) {
                int i4 = this.f6791i;
                int i5 = this.f6793k;
                if (i3 <= i4 - i5) {
                    int i6 = i3 + i5;
                    this.f6793k = i6;
                    return Arrays.copyOfRange(this.f6789g, i5, i6);
                }
            }
            if (i3 > 0) {
                throw D.m();
            }
            if (i3 == 0) {
                return C.f6668d;
            }
            throw D.g();
        }

        public int N() throws D {
            int i3 = this.f6793k;
            if (this.f6791i - i3 < 4) {
                throw D.m();
            }
            byte[] bArr = this.f6789g;
            this.f6793k = i3 + 4;
            return ((bArr[i3 + 3] & 255) << 24) | (bArr[i3] & 255) | ((bArr[i3 + 1] & 255) << 8) | ((bArr[i3 + 2] & 255) << 16);
        }

        public long O() throws D {
            int i3 = this.f6793k;
            if (this.f6791i - i3 < 8) {
                throw D.m();
            }
            byte[] bArr = this.f6789g;
            this.f6793k = i3 + 8;
            return ((((long) bArr[i3 + 7]) & 255) << 56) | (((long) bArr[i3]) & 255) | ((((long) bArr[i3 + 1]) & 255) << 8) | ((((long) bArr[i3 + 2]) & 255) << 16) | ((((long) bArr[i3 + 3]) & 255) << 24) | ((((long) bArr[i3 + 4]) & 255) << 32) | ((((long) bArr[i3 + 5]) & 255) << 40) | ((((long) bArr[i3 + 6]) & 255) << 48);
        }

        public int P() {
            int i3;
            int i4 = this.f6793k;
            int i5 = this.f6791i;
            if (i5 != i4) {
                byte[] bArr = this.f6789g;
                int i6 = i4 + 1;
                byte b3 = bArr[i4];
                if (b3 >= 0) {
                    this.f6793k = i6;
                    return b3;
                }
                if (i5 - i6 >= 9) {
                    int i7 = i4 + 2;
                    int i8 = (bArr[i6] << 7) ^ b3;
                    if (i8 < 0) {
                        i3 = i8 ^ (-128);
                    } else {
                        int i9 = i4 + 3;
                        int i10 = (bArr[i7] << 14) ^ i8;
                        if (i10 >= 0) {
                            i3 = i10 ^ 16256;
                        } else {
                            int i11 = i4 + 4;
                            int i12 = i10 ^ (bArr[i9] << 21);
                            if (i12 < 0) {
                                i3 = (-2080896) ^ i12;
                            } else {
                                i9 = i4 + 5;
                                byte b4 = bArr[i11];
                                int i13 = (i12 ^ (b4 << 28)) ^ 266354560;
                                if (b4 < 0) {
                                    i11 = i4 + 6;
                                    if (bArr[i9] < 0) {
                                        i9 = i4 + 7;
                                        if (bArr[i11] < 0) {
                                            i11 = i4 + 8;
                                            if (bArr[i9] < 0) {
                                                i9 = i4 + 9;
                                                if (bArr[i11] < 0) {
                                                    int i14 = i4 + 10;
                                                    if (bArr[i9] >= 0) {
                                                        i7 = i14;
                                                        i3 = i13;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i3 = i13;
                                }
                                i3 = i13;
                            }
                            i7 = i11;
                        }
                        i7 = i9;
                    }
                    this.f6793k = i7;
                    return i3;
                }
            }
            return (int) R();
        }

        public long Q() {
            long j3;
            long j4;
            long j5;
            int i3 = this.f6793k;
            int i4 = this.f6791i;
            if (i4 != i3) {
                byte[] bArr = this.f6789g;
                int i5 = i3 + 1;
                byte b3 = bArr[i3];
                if (b3 >= 0) {
                    this.f6793k = i5;
                    return b3;
                }
                if (i4 - i5 >= 9) {
                    int i6 = i3 + 2;
                    int i7 = (bArr[i5] << 7) ^ b3;
                    if (i7 < 0) {
                        j3 = i7 ^ (-128);
                    } else {
                        int i8 = i3 + 3;
                        int i9 = (bArr[i6] << 14) ^ i7;
                        if (i9 >= 0) {
                            j3 = i9 ^ 16256;
                            i6 = i8;
                        } else {
                            int i10 = i3 + 4;
                            int i11 = i9 ^ (bArr[i8] << 21);
                            if (i11 < 0) {
                                long j6 = (-2080896) ^ i11;
                                i6 = i10;
                                j3 = j6;
                            } else {
                                long j7 = i11;
                                i6 = i3 + 5;
                                long j8 = j7 ^ (((long) bArr[i10]) << 28);
                                if (j8 >= 0) {
                                    j5 = 266354560;
                                } else {
                                    int i12 = i3 + 6;
                                    long j9 = j8 ^ (((long) bArr[i6]) << 35);
                                    if (j9 < 0) {
                                        j4 = -34093383808L;
                                    } else {
                                        i6 = i3 + 7;
                                        j8 = j9 ^ (((long) bArr[i12]) << 42);
                                        if (j8 >= 0) {
                                            j5 = 4363953127296L;
                                        } else {
                                            i12 = i3 + 8;
                                            j9 = j8 ^ (((long) bArr[i6]) << 49);
                                            if (j9 < 0) {
                                                j4 = -558586000294016L;
                                            } else {
                                                i6 = i3 + 9;
                                                long j10 = (j9 ^ (((long) bArr[i12]) << 56)) ^ 71499008037633920L;
                                                if (j10 < 0) {
                                                    int i13 = i3 + 10;
                                                    if (bArr[i6] >= 0) {
                                                        i6 = i13;
                                                    }
                                                }
                                                j3 = j10;
                                            }
                                        }
                                    }
                                    j3 = j9 ^ j4;
                                    i6 = i12;
                                }
                                j3 = j8 ^ j5;
                            }
                        }
                    }
                    this.f6793k = i6;
                    return j3;
                }
            }
            return R();
        }

        long R() throws D {
            long j3 = 0;
            for (int i3 = 0; i3 < 64; i3 += 7) {
                byte bL = L();
                j3 |= ((long) (bL & 127)) << i3;
                if ((bL & 128) == 0) {
                    return j3;
                }
            }
            throw D.f();
        }

        public void T(int i3) throws D {
            if (i3 >= 0) {
                int i4 = this.f6791i;
                int i5 = this.f6793k;
                if (i3 <= i4 - i5) {
                    this.f6793k = i5 + i3;
                    return;
                }
            }
            if (i3 >= 0) {
                throw D.m();
            }
            throw D.g();
        }

        @Override // com.google.protobuf.AbstractC0792j
        public void a(int i3) throws D {
            if (this.f6795m != i3) {
                throw D.b();
            }
        }

        @Override // com.google.protobuf.AbstractC0792j
        public int e() {
            return this.f6793k - this.f6794l;
        }

        @Override // com.google.protobuf.AbstractC0792j
        public boolean f() {
            return this.f6793k == this.f6791i;
        }

        @Override // com.google.protobuf.AbstractC0792j
        public void n(int i3) {
            this.f6797o = i3;
            S();
        }

        @Override // com.google.protobuf.AbstractC0792j
        public int o(int i3) throws D {
            if (i3 < 0) {
                throw D.g();
            }
            int iE = i3 + e();
            if (iE < 0) {
                throw D.h();
            }
            int i4 = this.f6797o;
            if (iE > i4) {
                throw D.m();
            }
            this.f6797o = iE;
            S();
            return i4;
        }

        @Override // com.google.protobuf.AbstractC0792j
        public boolean p() {
            return Q() != 0;
        }

        @Override // com.google.protobuf.AbstractC0792j
        public AbstractC0791i q() {
            int iP = P();
            if (iP > 0) {
                int i3 = this.f6791i;
                int i4 = this.f6793k;
                if (iP <= i3 - i4) {
                    AbstractC0791i abstractC0791iN = (this.f6790h && this.f6796n) ? AbstractC0791i.N(this.f6789g, i4, iP) : AbstractC0791i.q(this.f6789g, i4, iP);
                    this.f6793k += iP;
                    return abstractC0791iN;
                }
            }
            return iP == 0 ? AbstractC0791i.f6770b : AbstractC0791i.M(M(iP));
        }

        @Override // com.google.protobuf.AbstractC0792j
        public double r() {
            return Double.longBitsToDouble(O());
        }

        @Override // com.google.protobuf.AbstractC0792j
        public int s() {
            return P();
        }

        @Override // com.google.protobuf.AbstractC0792j
        public int t() {
            return N();
        }

        @Override // com.google.protobuf.AbstractC0792j
        public long u() {
            return O();
        }

        @Override // com.google.protobuf.AbstractC0792j
        public float v() {
            return Float.intBitsToFloat(N());
        }

        @Override // com.google.protobuf.AbstractC0792j
        public int w() {
            return P();
        }

        @Override // com.google.protobuf.AbstractC0792j
        public long x() {
            return Q();
        }

        @Override // com.google.protobuf.AbstractC0792j
        public int y() {
            return N();
        }

        @Override // com.google.protobuf.AbstractC0792j
        public long z() {
            return O();
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.j$c */
    private static final class c extends AbstractC0792j {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final Iterable f6798g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final Iterator f6799h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private ByteBuffer f6800i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final boolean f6801j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private boolean f6802k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f6803l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f6804m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private int f6805n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private int f6806o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private int f6807p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private int f6808q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private long f6809r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private long f6810s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private long f6811t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private long f6812u;

        private c(Iterable iterable, int i3, boolean z2) {
            super();
            this.f6805n = a.e.API_PRIORITY_OTHER;
            this.f6803l = i3;
            this.f6798g = iterable;
            this.f6799h = iterable.iterator();
            this.f6801j = z2;
            this.f6807p = 0;
            this.f6808q = 0;
            if (i3 != 0) {
                Z();
                return;
            }
            this.f6800i = C.f6669e;
            this.f6809r = 0L;
            this.f6810s = 0L;
            this.f6812u = 0L;
            this.f6811t = 0L;
        }

        private long L() {
            return this.f6812u - this.f6809r;
        }

        private void M() throws D {
            if (!this.f6799h.hasNext()) {
                throw D.m();
            }
            Z();
        }

        private void O(byte[] bArr, int i3, int i4) throws D {
            if (i4 < 0 || i4 > V()) {
                if (i4 > 0) {
                    throw D.m();
                }
                if (i4 != 0) {
                    throw D.g();
                }
                return;
            }
            int i5 = i4;
            while (i5 > 0) {
                if (L() == 0) {
                    M();
                }
                int iMin = Math.min(i5, (int) L());
                long j3 = iMin;
                z0.p(this.f6809r, bArr, (i4 - i5) + i3, j3);
                i5 -= iMin;
                this.f6809r += j3;
            }
        }

        private void U() {
            int i3 = this.f6803l + this.f6804m;
            this.f6803l = i3;
            int i4 = i3 - this.f6808q;
            int i5 = this.f6805n;
            if (i4 <= i5) {
                this.f6804m = 0;
                return;
            }
            int i6 = i4 - i5;
            this.f6804m = i6;
            this.f6803l = i3 - i6;
        }

        private int V() {
            return (int) ((((long) (this.f6803l - this.f6807p)) - this.f6809r) + this.f6810s);
        }

        private void X() throws D {
            for (int i3 = 0; i3 < 10; i3++) {
                if (N() >= 0) {
                    return;
                }
            }
            throw D.f();
        }

        private ByteBuffer Y(int i3, int i4) {
            int iPosition = this.f6800i.position();
            int iLimit = this.f6800i.limit();
            ByteBuffer byteBuffer = this.f6800i;
            try {
                try {
                    byteBuffer.position(i3);
                    byteBuffer.limit(i4);
                    return this.f6800i.slice();
                } catch (IllegalArgumentException unused) {
                    throw D.m();
                }
            } finally {
                byteBuffer.position(iPosition);
                byteBuffer.limit(iLimit);
            }
        }

        private void Z() {
            ByteBuffer byteBuffer = (ByteBuffer) this.f6799h.next();
            this.f6800i = byteBuffer;
            this.f6807p += (int) (this.f6809r - this.f6810s);
            long jPosition = byteBuffer.position();
            this.f6809r = jPosition;
            this.f6810s = jPosition;
            this.f6812u = this.f6800i.limit();
            long jK = z0.k(this.f6800i);
            this.f6811t = jK;
            this.f6809r += jK;
            this.f6810s += jK;
            this.f6812u += jK;
        }

        @Override // com.google.protobuf.AbstractC0792j
        public int A() {
            return AbstractC0792j.c(R());
        }

        @Override // com.google.protobuf.AbstractC0792j
        public long B() {
            return AbstractC0792j.d(S());
        }

        @Override // com.google.protobuf.AbstractC0792j
        public String C() throws D {
            int iR = R();
            if (iR > 0) {
                long j3 = iR;
                long j4 = this.f6812u;
                long j5 = this.f6809r;
                if (j3 <= j4 - j5) {
                    byte[] bArr = new byte[iR];
                    z0.p(j5, bArr, 0L, j3);
                    String str = new String(bArr, C.f6666b);
                    this.f6809r += j3;
                    return str;
                }
            }
            if (iR > 0 && iR <= V()) {
                byte[] bArr2 = new byte[iR];
                O(bArr2, 0, iR);
                return new String(bArr2, C.f6666b);
            }
            if (iR == 0) {
                return "";
            }
            if (iR < 0) {
                throw D.g();
            }
            throw D.m();
        }

        @Override // com.google.protobuf.AbstractC0792j
        public String D() throws D {
            int iR = R();
            if (iR > 0) {
                long j3 = iR;
                long j4 = this.f6812u;
                long j5 = this.f6809r;
                if (j3 <= j4 - j5) {
                    String strG = A0.g(this.f6800i, (int) (j5 - this.f6810s), iR);
                    this.f6809r += j3;
                    return strG;
                }
            }
            if (iR >= 0 && iR <= V()) {
                byte[] bArr = new byte[iR];
                O(bArr, 0, iR);
                return A0.h(bArr, 0, iR);
            }
            if (iR == 0) {
                return "";
            }
            if (iR <= 0) {
                throw D.g();
            }
            throw D.m();
        }

        @Override // com.google.protobuf.AbstractC0792j
        public int E() throws D {
            if (f()) {
                this.f6806o = 0;
                return 0;
            }
            int iR = R();
            this.f6806o = iR;
            if (B0.a(iR) != 0) {
                return this.f6806o;
            }
            throw D.c();
        }

        @Override // com.google.protobuf.AbstractC0792j
        public int F() {
            return R();
        }

        @Override // com.google.protobuf.AbstractC0792j
        public long G() {
            return S();
        }

        @Override // com.google.protobuf.AbstractC0792j
        public boolean J(int i3) throws D {
            int iB = B0.b(i3);
            if (iB == 0) {
                X();
                return true;
            }
            if (iB == 1) {
                W(8);
                return true;
            }
            if (iB == 2) {
                W(R());
                return true;
            }
            if (iB == 3) {
                K();
                a(B0.c(B0.a(i3), 4));
                return true;
            }
            if (iB == 4) {
                return false;
            }
            if (iB != 5) {
                throw D.e();
            }
            W(4);
            return true;
        }

        public byte N() throws D {
            if (L() == 0) {
                M();
            }
            long j3 = this.f6809r;
            this.f6809r = 1 + j3;
            return z0.w(j3);
        }

        public int P() {
            if (L() < 4) {
                return (N() & 255) | ((N() & 255) << 8) | ((N() & 255) << 16) | ((N() & 255) << 24);
            }
            long j3 = this.f6809r;
            this.f6809r = 4 + j3;
            return ((z0.w(j3 + 3) & 255) << 24) | (z0.w(j3) & 255) | ((z0.w(1 + j3) & 255) << 8) | ((z0.w(2 + j3) & 255) << 16);
        }

        public long Q() throws D {
            long jN;
            byte bN;
            if (L() >= 8) {
                long j3 = this.f6809r;
                this.f6809r = 8 + j3;
                jN = (((long) z0.w(j3)) & 255) | ((((long) z0.w(1 + j3)) & 255) << 8) | ((((long) z0.w(2 + j3)) & 255) << 16) | ((((long) z0.w(3 + j3)) & 255) << 24) | ((((long) z0.w(4 + j3)) & 255) << 32) | ((((long) z0.w(5 + j3)) & 255) << 40) | ((((long) z0.w(6 + j3)) & 255) << 48);
                bN = z0.w(j3 + 7);
            } else {
                jN = (((long) N()) & 255) | ((((long) N()) & 255) << 8) | ((((long) N()) & 255) << 16) | ((((long) N()) & 255) << 24) | ((((long) N()) & 255) << 32) | ((((long) N()) & 255) << 40) | ((((long) N()) & 255) << 48);
                bN = N();
            }
            return ((((long) bN) & 255) << 56) | jN;
        }

        public int R() {
            int i3;
            long j3 = this.f6809r;
            if (this.f6812u != j3) {
                long j4 = j3 + 1;
                byte bW = z0.w(j3);
                if (bW >= 0) {
                    this.f6809r++;
                    return bW;
                }
                if (this.f6812u - this.f6809r >= 10) {
                    long j5 = 2 + j3;
                    int iW = (z0.w(j4) << 7) ^ bW;
                    if (iW < 0) {
                        i3 = iW ^ (-128);
                    } else {
                        long j6 = 3 + j3;
                        int iW2 = (z0.w(j5) << 14) ^ iW;
                        if (iW2 >= 0) {
                            i3 = iW2 ^ 16256;
                        } else {
                            long j7 = 4 + j3;
                            int iW3 = iW2 ^ (z0.w(j6) << 21);
                            if (iW3 < 0) {
                                i3 = (-2080896) ^ iW3;
                            } else {
                                j6 = 5 + j3;
                                byte bW2 = z0.w(j7);
                                int i4 = (iW3 ^ (bW2 << 28)) ^ 266354560;
                                if (bW2 < 0) {
                                    j7 = 6 + j3;
                                    if (z0.w(j6) < 0) {
                                        j6 = 7 + j3;
                                        if (z0.w(j7) < 0) {
                                            j7 = 8 + j3;
                                            if (z0.w(j6) < 0) {
                                                j6 = 9 + j3;
                                                if (z0.w(j7) < 0) {
                                                    long j8 = j3 + 10;
                                                    if (z0.w(j6) >= 0) {
                                                        i3 = i4;
                                                        j5 = j8;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i3 = i4;
                                }
                                i3 = i4;
                            }
                            j5 = j7;
                        }
                        j5 = j6;
                    }
                    this.f6809r = j5;
                    return i3;
                }
            }
            return (int) T();
        }

        public long S() {
            long j3;
            long j4;
            long j5;
            long j6 = this.f6809r;
            if (this.f6812u != j6) {
                long j7 = j6 + 1;
                byte bW = z0.w(j6);
                if (bW >= 0) {
                    this.f6809r++;
                    return bW;
                }
                if (this.f6812u - this.f6809r >= 10) {
                    long j8 = 2 + j6;
                    int iW = (z0.w(j7) << 7) ^ bW;
                    if (iW < 0) {
                        j3 = iW ^ (-128);
                    } else {
                        long j9 = 3 + j6;
                        int iW2 = (z0.w(j8) << 14) ^ iW;
                        if (iW2 >= 0) {
                            j3 = iW2 ^ 16256;
                            j8 = j9;
                        } else {
                            long j10 = 4 + j6;
                            int iW3 = iW2 ^ (z0.w(j9) << 21);
                            if (iW3 < 0) {
                                j3 = (-2080896) ^ iW3;
                                j8 = j10;
                            } else {
                                long j11 = 5 + j6;
                                long jW = (((long) z0.w(j10)) << 28) ^ ((long) iW3);
                                if (jW >= 0) {
                                    j5 = 266354560;
                                } else {
                                    long j12 = 6 + j6;
                                    long jW2 = jW ^ (((long) z0.w(j11)) << 35);
                                    if (jW2 < 0) {
                                        j4 = -34093383808L;
                                    } else {
                                        j11 = 7 + j6;
                                        jW = jW2 ^ (((long) z0.w(j12)) << 42);
                                        if (jW >= 0) {
                                            j5 = 4363953127296L;
                                        } else {
                                            j12 = 8 + j6;
                                            jW2 = jW ^ (((long) z0.w(j11)) << 49);
                                            if (jW2 < 0) {
                                                j4 = -558586000294016L;
                                            } else {
                                                j11 = 9 + j6;
                                                long jW3 = (jW2 ^ (((long) z0.w(j12)) << 56)) ^ 71499008037633920L;
                                                if (jW3 < 0) {
                                                    long j13 = j6 + 10;
                                                    if (z0.w(j11) >= 0) {
                                                        j3 = jW3;
                                                        j8 = j13;
                                                    }
                                                } else {
                                                    j3 = jW3;
                                                    j8 = j11;
                                                }
                                            }
                                        }
                                    }
                                    j3 = j4 ^ jW2;
                                    j8 = j12;
                                }
                                j3 = j5 ^ jW;
                                j8 = j11;
                            }
                        }
                    }
                    this.f6809r = j8;
                    return j3;
                }
            }
            return T();
        }

        long T() throws D {
            long j3 = 0;
            for (int i3 = 0; i3 < 64; i3 += 7) {
                byte bN = N();
                j3 |= ((long) (bN & 127)) << i3;
                if ((bN & 128) == 0) {
                    return j3;
                }
            }
            throw D.f();
        }

        public void W(int i3) throws D {
            if (i3 < 0 || i3 > (((long) (this.f6803l - this.f6807p)) - this.f6809r) + this.f6810s) {
                if (i3 >= 0) {
                    throw D.m();
                }
                throw D.g();
            }
            while (i3 > 0) {
                if (L() == 0) {
                    M();
                }
                int iMin = Math.min(i3, (int) L());
                i3 -= iMin;
                this.f6809r += (long) iMin;
            }
        }

        @Override // com.google.protobuf.AbstractC0792j
        public void a(int i3) throws D {
            if (this.f6806o != i3) {
                throw D.b();
            }
        }

        @Override // com.google.protobuf.AbstractC0792j
        public int e() {
            return (int) ((((long) (this.f6807p - this.f6808q)) + this.f6809r) - this.f6810s);
        }

        @Override // com.google.protobuf.AbstractC0792j
        public boolean f() {
            return (((long) this.f6807p) + this.f6809r) - this.f6810s == ((long) this.f6803l);
        }

        @Override // com.google.protobuf.AbstractC0792j
        public void n(int i3) {
            this.f6805n = i3;
            U();
        }

        @Override // com.google.protobuf.AbstractC0792j
        public int o(int i3) throws D {
            if (i3 < 0) {
                throw D.g();
            }
            int iE = i3 + e();
            int i4 = this.f6805n;
            if (iE > i4) {
                throw D.m();
            }
            this.f6805n = iE;
            U();
            return i4;
        }

        @Override // com.google.protobuf.AbstractC0792j
        public boolean p() {
            return S() != 0;
        }

        @Override // com.google.protobuf.AbstractC0792j
        public AbstractC0791i q() throws D {
            int iR = R();
            if (iR > 0) {
                long j3 = iR;
                long j4 = this.f6812u;
                long j5 = this.f6809r;
                if (j3 <= j4 - j5) {
                    if (this.f6801j && this.f6802k) {
                        int i3 = (int) (j5 - this.f6811t);
                        AbstractC0791i abstractC0791iL = AbstractC0791i.L(Y(i3, iR + i3));
                        this.f6809r += j3;
                        return abstractC0791iL;
                    }
                    byte[] bArr = new byte[iR];
                    z0.p(j5, bArr, 0L, j3);
                    this.f6809r += j3;
                    return AbstractC0791i.M(bArr);
                }
            }
            if (iR <= 0 || iR > V()) {
                if (iR == 0) {
                    return AbstractC0791i.f6770b;
                }
                if (iR < 0) {
                    throw D.g();
                }
                throw D.m();
            }
            if (!this.f6801j || !this.f6802k) {
                byte[] bArr2 = new byte[iR];
                O(bArr2, 0, iR);
                return AbstractC0791i.M(bArr2);
            }
            ArrayList arrayList = new ArrayList();
            while (iR > 0) {
                if (L() == 0) {
                    M();
                }
                int iMin = Math.min(iR, (int) L());
                int i4 = (int) (this.f6809r - this.f6811t);
                arrayList.add(AbstractC0791i.L(Y(i4, i4 + iMin)));
                iR -= iMin;
                this.f6809r += (long) iMin;
            }
            return AbstractC0791i.o(arrayList);
        }

        @Override // com.google.protobuf.AbstractC0792j
        public double r() {
            return Double.longBitsToDouble(Q());
        }

        @Override // com.google.protobuf.AbstractC0792j
        public int s() {
            return R();
        }

        @Override // com.google.protobuf.AbstractC0792j
        public int t() {
            return P();
        }

        @Override // com.google.protobuf.AbstractC0792j
        public long u() {
            return Q();
        }

        @Override // com.google.protobuf.AbstractC0792j
        public float v() {
            return Float.intBitsToFloat(P());
        }

        @Override // com.google.protobuf.AbstractC0792j
        public int w() {
            return R();
        }

        @Override // com.google.protobuf.AbstractC0792j
        public long x() {
            return S();
        }

        @Override // com.google.protobuf.AbstractC0792j
        public int y() {
            return P();
        }

        @Override // com.google.protobuf.AbstractC0792j
        public long z() {
            return Q();
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.j$d */
    private static final class d extends AbstractC0792j {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final InputStream f6813g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final byte[] f6814h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f6815i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f6816j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f6817k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f6818l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f6819m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private int f6820n;

        private d(InputStream inputStream, int i3) {
            super();
            this.f6820n = a.e.API_PRIORITY_OTHER;
            C.b(inputStream, "input");
            this.f6813g = inputStream;
            this.f6814h = new byte[i3];
            this.f6815i = 0;
            this.f6817k = 0;
            this.f6819m = 0;
        }

        private static int L(InputStream inputStream) throws D {
            try {
                return inputStream.available();
            } catch (D e3) {
                e3.j();
                throw e3;
            }
        }

        private static int M(InputStream inputStream, byte[] bArr, int i3, int i4) throws D {
            try {
                return inputStream.read(bArr, i3, i4);
            } catch (D e3) {
                e3.j();
                throw e3;
            }
        }

        private AbstractC0791i N(int i3) throws IOException {
            byte[] bArrQ = Q(i3);
            if (bArrQ != null) {
                return AbstractC0791i.p(bArrQ);
            }
            int i4 = this.f6817k;
            int i5 = this.f6815i;
            int length = i5 - i4;
            this.f6819m += i5;
            this.f6817k = 0;
            this.f6815i = 0;
            List<byte[]> listR = R(i3 - length);
            byte[] bArr = new byte[i3];
            System.arraycopy(this.f6814h, i4, bArr, 0, length);
            for (byte[] bArr2 : listR) {
                System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
                length += bArr2.length;
            }
            return AbstractC0791i.M(bArr);
        }

        private byte[] P(int i3, boolean z2) throws IOException {
            byte[] bArrQ = Q(i3);
            if (bArrQ != null) {
                return z2 ? (byte[]) bArrQ.clone() : bArrQ;
            }
            int i4 = this.f6817k;
            int i5 = this.f6815i;
            int length = i5 - i4;
            this.f6819m += i5;
            this.f6817k = 0;
            this.f6815i = 0;
            List<byte[]> listR = R(i3 - length);
            byte[] bArr = new byte[i3];
            System.arraycopy(this.f6814h, i4, bArr, 0, length);
            for (byte[] bArr2 : listR) {
                System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
                length += bArr2.length;
            }
            return bArr;
        }

        private byte[] Q(int i3) throws D {
            if (i3 == 0) {
                return C.f6668d;
            }
            if (i3 < 0) {
                throw D.g();
            }
            int i4 = this.f6819m;
            int i5 = this.f6817k;
            int i6 = i4 + i5 + i3;
            if (i6 - this.f6786c > 0) {
                throw D.l();
            }
            int i7 = this.f6820n;
            if (i6 > i7) {
                a0((i7 - i4) - i5);
                throw D.m();
            }
            int i8 = this.f6815i - i5;
            int i9 = i3 - i8;
            if (i9 >= 4096 && i9 > L(this.f6813g)) {
                return null;
            }
            byte[] bArr = new byte[i3];
            System.arraycopy(this.f6814h, this.f6817k, bArr, 0, i8);
            this.f6819m += this.f6815i;
            this.f6817k = 0;
            this.f6815i = 0;
            while (i8 < i3) {
                int iM = M(this.f6813g, bArr, i8, i3 - i8);
                if (iM == -1) {
                    throw D.m();
                }
                this.f6819m += iM;
                i8 += iM;
            }
            return bArr;
        }

        private List R(int i3) throws IOException {
            ArrayList arrayList = new ArrayList();
            while (i3 > 0) {
                int iMin = Math.min(i3, 4096);
                byte[] bArr = new byte[iMin];
                int i4 = 0;
                while (i4 < iMin) {
                    int i5 = this.f6813g.read(bArr, i4, iMin - i4);
                    if (i5 == -1) {
                        throw D.m();
                    }
                    this.f6819m += i5;
                    i4 += i5;
                }
                i3 -= iMin;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        private void X() {
            int i3 = this.f6815i + this.f6816j;
            this.f6815i = i3;
            int i4 = this.f6819m + i3;
            int i5 = this.f6820n;
            if (i4 <= i5) {
                this.f6816j = 0;
                return;
            }
            int i6 = i4 - i5;
            this.f6816j = i6;
            this.f6815i = i3 - i6;
        }

        private void Y(int i3) throws D {
            if (f0(i3)) {
                return;
            }
            if (i3 <= (this.f6786c - this.f6819m) - this.f6817k) {
                throw D.m();
            }
            throw D.l();
        }

        private static long Z(InputStream inputStream, long j3) throws D {
            try {
                return inputStream.skip(j3);
            } catch (D e3) {
                e3.j();
                throw e3;
            }
        }

        private void b0(int i3) throws D {
            if (i3 < 0) {
                throw D.g();
            }
            int i4 = this.f6819m;
            int i5 = this.f6817k;
            int i6 = i4 + i5 + i3;
            int i7 = this.f6820n;
            if (i6 > i7) {
                a0((i7 - i4) - i5);
                throw D.m();
            }
            this.f6819m = i4 + i5;
            int i8 = this.f6815i - i5;
            this.f6815i = 0;
            this.f6817k = 0;
            while (i8 < i3) {
                try {
                    long j3 = i3 - i8;
                    long jZ = Z(this.f6813g, j3);
                    if (jZ < 0 || jZ > j3) {
                        throw new IllegalStateException(this.f6813g.getClass() + "#skip returned invalid result: " + jZ + "\nThe InputStream implementation is buggy.");
                    }
                    if (jZ == 0) {
                        break;
                    } else {
                        i8 += (int) jZ;
                    }
                } finally {
                    this.f6819m += i8;
                    X();
                }
            }
            if (i8 >= i3) {
                return;
            }
            int i9 = this.f6815i;
            int i10 = i9 - this.f6817k;
            this.f6817k = i9;
            while (true) {
                Y(1);
                int i11 = i3 - i10;
                int i12 = this.f6815i;
                if (i11 <= i12) {
                    this.f6817k = i11;
                    return;
                } else {
                    i10 += i12;
                    this.f6817k = i12;
                }
            }
        }

        private void c0() throws D {
            if (this.f6815i - this.f6817k >= 10) {
                d0();
            } else {
                e0();
            }
        }

        private void d0() throws D {
            for (int i3 = 0; i3 < 10; i3++) {
                byte[] bArr = this.f6814h;
                int i4 = this.f6817k;
                this.f6817k = i4 + 1;
                if (bArr[i4] >= 0) {
                    return;
                }
            }
            throw D.f();
        }

        private void e0() throws D {
            for (int i3 = 0; i3 < 10; i3++) {
                if (O() >= 0) {
                    return;
                }
            }
            throw D.f();
        }

        private boolean f0(int i3) throws D {
            int i4 = this.f6817k;
            int i5 = i4 + i3;
            int i6 = this.f6815i;
            if (i5 <= i6) {
                throw new IllegalStateException("refillBuffer() called when " + i3 + " bytes were already available in buffer");
            }
            int i7 = this.f6786c;
            int i8 = this.f6819m;
            if (i3 > (i7 - i8) - i4 || i8 + i4 + i3 > this.f6820n) {
                return false;
            }
            if (i4 > 0) {
                if (i6 > i4) {
                    byte[] bArr = this.f6814h;
                    System.arraycopy(bArr, i4, bArr, 0, i6 - i4);
                }
                this.f6819m += i4;
                this.f6815i -= i4;
                this.f6817k = 0;
            }
            InputStream inputStream = this.f6813g;
            byte[] bArr2 = this.f6814h;
            int i9 = this.f6815i;
            int iM = M(inputStream, bArr2, i9, Math.min(bArr2.length - i9, (this.f6786c - this.f6819m) - i9));
            if (iM == 0 || iM < -1 || iM > this.f6814h.length) {
                throw new IllegalStateException(this.f6813g.getClass() + "#read(byte[]) returned invalid result: " + iM + "\nThe InputStream implementation is buggy.");
            }
            if (iM <= 0) {
                return false;
            }
            this.f6815i += iM;
            X();
            if (this.f6815i >= i3) {
                return true;
            }
            return f0(i3);
        }

        @Override // com.google.protobuf.AbstractC0792j
        public int A() {
            return AbstractC0792j.c(U());
        }

        @Override // com.google.protobuf.AbstractC0792j
        public long B() {
            return AbstractC0792j.d(V());
        }

        @Override // com.google.protobuf.AbstractC0792j
        public String C() throws D {
            int iU = U();
            if (iU > 0) {
                int i3 = this.f6815i;
                int i4 = this.f6817k;
                if (iU <= i3 - i4) {
                    String str = new String(this.f6814h, i4, iU, C.f6666b);
                    this.f6817k += iU;
                    return str;
                }
            }
            if (iU == 0) {
                return "";
            }
            if (iU < 0) {
                throw D.g();
            }
            if (iU > this.f6815i) {
                return new String(P(iU, false), C.f6666b);
            }
            Y(iU);
            String str2 = new String(this.f6814h, this.f6817k, iU, C.f6666b);
            this.f6817k += iU;
            return str2;
        }

        @Override // com.google.protobuf.AbstractC0792j
        public String D() throws IOException {
            byte[] bArrP;
            int iU = U();
            int i3 = this.f6817k;
            int i4 = this.f6815i;
            if (iU <= i4 - i3 && iU > 0) {
                bArrP = this.f6814h;
                this.f6817k = i3 + iU;
            } else {
                if (iU == 0) {
                    return "";
                }
                if (iU < 0) {
                    throw D.g();
                }
                i3 = 0;
                if (iU <= i4) {
                    Y(iU);
                    bArrP = this.f6814h;
                    this.f6817k = iU;
                } else {
                    bArrP = P(iU, false);
                }
            }
            return A0.h(bArrP, i3, iU);
        }

        @Override // com.google.protobuf.AbstractC0792j
        public int E() throws D {
            if (f()) {
                this.f6818l = 0;
                return 0;
            }
            int iU = U();
            this.f6818l = iU;
            if (B0.a(iU) != 0) {
                return this.f6818l;
            }
            throw D.c();
        }

        @Override // com.google.protobuf.AbstractC0792j
        public int F() {
            return U();
        }

        @Override // com.google.protobuf.AbstractC0792j
        public long G() {
            return V();
        }

        @Override // com.google.protobuf.AbstractC0792j
        public boolean J(int i3) throws D {
            int iB = B0.b(i3);
            if (iB == 0) {
                c0();
                return true;
            }
            if (iB == 1) {
                a0(8);
                return true;
            }
            if (iB == 2) {
                a0(U());
                return true;
            }
            if (iB == 3) {
                K();
                a(B0.c(B0.a(i3), 4));
                return true;
            }
            if (iB == 4) {
                return false;
            }
            if (iB != 5) {
                throw D.e();
            }
            a0(4);
            return true;
        }

        public byte O() throws D {
            if (this.f6817k == this.f6815i) {
                Y(1);
            }
            byte[] bArr = this.f6814h;
            int i3 = this.f6817k;
            this.f6817k = i3 + 1;
            return bArr[i3];
        }

        public int S() throws D {
            int i3 = this.f6817k;
            if (this.f6815i - i3 < 4) {
                Y(4);
                i3 = this.f6817k;
            }
            byte[] bArr = this.f6814h;
            this.f6817k = i3 + 4;
            return ((bArr[i3 + 3] & 255) << 24) | (bArr[i3] & 255) | ((bArr[i3 + 1] & 255) << 8) | ((bArr[i3 + 2] & 255) << 16);
        }

        public long T() throws D {
            int i3 = this.f6817k;
            if (this.f6815i - i3 < 8) {
                Y(8);
                i3 = this.f6817k;
            }
            byte[] bArr = this.f6814h;
            this.f6817k = i3 + 8;
            return ((((long) bArr[i3 + 7]) & 255) << 56) | (((long) bArr[i3]) & 255) | ((((long) bArr[i3 + 1]) & 255) << 8) | ((((long) bArr[i3 + 2]) & 255) << 16) | ((((long) bArr[i3 + 3]) & 255) << 24) | ((((long) bArr[i3 + 4]) & 255) << 32) | ((((long) bArr[i3 + 5]) & 255) << 40) | ((((long) bArr[i3 + 6]) & 255) << 48);
        }

        public int U() {
            int i3;
            int i4 = this.f6817k;
            int i5 = this.f6815i;
            if (i5 != i4) {
                byte[] bArr = this.f6814h;
                int i6 = i4 + 1;
                byte b3 = bArr[i4];
                if (b3 >= 0) {
                    this.f6817k = i6;
                    return b3;
                }
                if (i5 - i6 >= 9) {
                    int i7 = i4 + 2;
                    int i8 = (bArr[i6] << 7) ^ b3;
                    if (i8 < 0) {
                        i3 = i8 ^ (-128);
                    } else {
                        int i9 = i4 + 3;
                        int i10 = (bArr[i7] << 14) ^ i8;
                        if (i10 >= 0) {
                            i3 = i10 ^ 16256;
                        } else {
                            int i11 = i4 + 4;
                            int i12 = i10 ^ (bArr[i9] << 21);
                            if (i12 < 0) {
                                i3 = (-2080896) ^ i12;
                            } else {
                                i9 = i4 + 5;
                                byte b4 = bArr[i11];
                                int i13 = (i12 ^ (b4 << 28)) ^ 266354560;
                                if (b4 < 0) {
                                    i11 = i4 + 6;
                                    if (bArr[i9] < 0) {
                                        i9 = i4 + 7;
                                        if (bArr[i11] < 0) {
                                            i11 = i4 + 8;
                                            if (bArr[i9] < 0) {
                                                i9 = i4 + 9;
                                                if (bArr[i11] < 0) {
                                                    int i14 = i4 + 10;
                                                    if (bArr[i9] >= 0) {
                                                        i7 = i14;
                                                        i3 = i13;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i3 = i13;
                                }
                                i3 = i13;
                            }
                            i7 = i11;
                        }
                        i7 = i9;
                    }
                    this.f6817k = i7;
                    return i3;
                }
            }
            return (int) W();
        }

        public long V() {
            long j3;
            long j4;
            long j5;
            int i3 = this.f6817k;
            int i4 = this.f6815i;
            if (i4 != i3) {
                byte[] bArr = this.f6814h;
                int i5 = i3 + 1;
                byte b3 = bArr[i3];
                if (b3 >= 0) {
                    this.f6817k = i5;
                    return b3;
                }
                if (i4 - i5 >= 9) {
                    int i6 = i3 + 2;
                    int i7 = (bArr[i5] << 7) ^ b3;
                    if (i7 < 0) {
                        j3 = i7 ^ (-128);
                    } else {
                        int i8 = i3 + 3;
                        int i9 = (bArr[i6] << 14) ^ i7;
                        if (i9 >= 0) {
                            j3 = i9 ^ 16256;
                            i6 = i8;
                        } else {
                            int i10 = i3 + 4;
                            int i11 = i9 ^ (bArr[i8] << 21);
                            if (i11 < 0) {
                                long j6 = (-2080896) ^ i11;
                                i6 = i10;
                                j3 = j6;
                            } else {
                                long j7 = i11;
                                i6 = i3 + 5;
                                long j8 = j7 ^ (((long) bArr[i10]) << 28);
                                if (j8 >= 0) {
                                    j5 = 266354560;
                                } else {
                                    int i12 = i3 + 6;
                                    long j9 = j8 ^ (((long) bArr[i6]) << 35);
                                    if (j9 < 0) {
                                        j4 = -34093383808L;
                                    } else {
                                        i6 = i3 + 7;
                                        j8 = j9 ^ (((long) bArr[i12]) << 42);
                                        if (j8 >= 0) {
                                            j5 = 4363953127296L;
                                        } else {
                                            i12 = i3 + 8;
                                            j9 = j8 ^ (((long) bArr[i6]) << 49);
                                            if (j9 < 0) {
                                                j4 = -558586000294016L;
                                            } else {
                                                i6 = i3 + 9;
                                                long j10 = (j9 ^ (((long) bArr[i12]) << 56)) ^ 71499008037633920L;
                                                if (j10 < 0) {
                                                    int i13 = i3 + 10;
                                                    if (bArr[i6] >= 0) {
                                                        i6 = i13;
                                                    }
                                                }
                                                j3 = j10;
                                            }
                                        }
                                    }
                                    j3 = j9 ^ j4;
                                    i6 = i12;
                                }
                                j3 = j8 ^ j5;
                            }
                        }
                    }
                    this.f6817k = i6;
                    return j3;
                }
            }
            return W();
        }

        long W() throws D {
            long j3 = 0;
            for (int i3 = 0; i3 < 64; i3 += 7) {
                byte bO = O();
                j3 |= ((long) (bO & 127)) << i3;
                if ((bO & 128) == 0) {
                    return j3;
                }
            }
            throw D.f();
        }

        @Override // com.google.protobuf.AbstractC0792j
        public void a(int i3) throws D {
            if (this.f6818l != i3) {
                throw D.b();
            }
        }

        public void a0(int i3) throws D {
            int i4 = this.f6815i;
            int i5 = this.f6817k;
            if (i3 > i4 - i5 || i3 < 0) {
                b0(i3);
            } else {
                this.f6817k = i5 + i3;
            }
        }

        @Override // com.google.protobuf.AbstractC0792j
        public int e() {
            return this.f6819m + this.f6817k;
        }

        @Override // com.google.protobuf.AbstractC0792j
        public boolean f() {
            return this.f6817k == this.f6815i && !f0(1);
        }

        @Override // com.google.protobuf.AbstractC0792j
        public void n(int i3) {
            this.f6820n = i3;
            X();
        }

        @Override // com.google.protobuf.AbstractC0792j
        public int o(int i3) throws D {
            if (i3 < 0) {
                throw D.g();
            }
            int i4 = i3 + this.f6819m + this.f6817k;
            int i5 = this.f6820n;
            if (i4 > i5) {
                throw D.m();
            }
            this.f6820n = i4;
            X();
            return i5;
        }

        @Override // com.google.protobuf.AbstractC0792j
        public boolean p() {
            return V() != 0;
        }

        @Override // com.google.protobuf.AbstractC0792j
        public AbstractC0791i q() throws D {
            int iU = U();
            int i3 = this.f6815i;
            int i4 = this.f6817k;
            if (iU <= i3 - i4 && iU > 0) {
                AbstractC0791i abstractC0791iQ = AbstractC0791i.q(this.f6814h, i4, iU);
                this.f6817k += iU;
                return abstractC0791iQ;
            }
            if (iU == 0) {
                return AbstractC0791i.f6770b;
            }
            if (iU >= 0) {
                return N(iU);
            }
            throw D.g();
        }

        @Override // com.google.protobuf.AbstractC0792j
        public double r() {
            return Double.longBitsToDouble(T());
        }

        @Override // com.google.protobuf.AbstractC0792j
        public int s() {
            return U();
        }

        @Override // com.google.protobuf.AbstractC0792j
        public int t() {
            return S();
        }

        @Override // com.google.protobuf.AbstractC0792j
        public long u() {
            return T();
        }

        @Override // com.google.protobuf.AbstractC0792j
        public float v() {
            return Float.intBitsToFloat(S());
        }

        @Override // com.google.protobuf.AbstractC0792j
        public int w() {
            return U();
        }

        @Override // com.google.protobuf.AbstractC0792j
        public long x() {
            return V();
        }

        @Override // com.google.protobuf.AbstractC0792j
        public int y() {
            return S();
        }

        @Override // com.google.protobuf.AbstractC0792j
        public long z() {
            return T();
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.j$e */
    private static final class e extends AbstractC0792j {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final ByteBuffer f6821g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final boolean f6822h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final long f6823i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private long f6824j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private long f6825k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private long f6826l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f6827m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private int f6828n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private boolean f6829o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private int f6830p;

        private e(ByteBuffer byteBuffer, boolean z2) {
            super();
            this.f6830p = a.e.API_PRIORITY_OTHER;
            this.f6821g = byteBuffer;
            long jK = z0.k(byteBuffer);
            this.f6823i = jK;
            this.f6824j = ((long) byteBuffer.limit()) + jK;
            long jPosition = jK + ((long) byteBuffer.position());
            this.f6825k = jPosition;
            this.f6826l = jPosition;
            this.f6822h = z2;
        }

        private int L(long j3) {
            return (int) (j3 - this.f6823i);
        }

        static boolean M() {
            return z0.J();
        }

        private void T() {
            long j3 = this.f6824j + ((long) this.f6827m);
            this.f6824j = j3;
            int i3 = (int) (j3 - this.f6826l);
            int i4 = this.f6830p;
            if (i3 <= i4) {
                this.f6827m = 0;
                return;
            }
            int i5 = i3 - i4;
            this.f6827m = i5;
            this.f6824j = j3 - ((long) i5);
        }

        private int U() {
            return (int) (this.f6824j - this.f6825k);
        }

        private void W() throws D {
            if (U() >= 10) {
                X();
            } else {
                Y();
            }
        }

        private void X() throws D {
            for (int i3 = 0; i3 < 10; i3++) {
                long j3 = this.f6825k;
                this.f6825k = 1 + j3;
                if (z0.w(j3) >= 0) {
                    return;
                }
            }
            throw D.f();
        }

        private void Y() throws D {
            for (int i3 = 0; i3 < 10; i3++) {
                if (N() >= 0) {
                    return;
                }
            }
            throw D.f();
        }

        private ByteBuffer Z(long j3, long j4) {
            int iPosition = this.f6821g.position();
            int iLimit = this.f6821g.limit();
            ByteBuffer byteBuffer = this.f6821g;
            try {
                try {
                    byteBuffer.position(L(j3));
                    byteBuffer.limit(L(j4));
                    return this.f6821g.slice();
                } catch (IllegalArgumentException e3) {
                    D dM = D.m();
                    dM.initCause(e3);
                    throw dM;
                }
            } finally {
                byteBuffer.position(iPosition);
                byteBuffer.limit(iLimit);
            }
        }

        @Override // com.google.protobuf.AbstractC0792j
        public int A() {
            return AbstractC0792j.c(Q());
        }

        @Override // com.google.protobuf.AbstractC0792j
        public long B() {
            return AbstractC0792j.d(R());
        }

        @Override // com.google.protobuf.AbstractC0792j
        public String C() throws D {
            int iQ = Q();
            if (iQ <= 0 || iQ > U()) {
                if (iQ == 0) {
                    return "";
                }
                if (iQ < 0) {
                    throw D.g();
                }
                throw D.m();
            }
            byte[] bArr = new byte[iQ];
            long j3 = iQ;
            z0.p(this.f6825k, bArr, 0L, j3);
            String str = new String(bArr, C.f6666b);
            this.f6825k += j3;
            return str;
        }

        @Override // com.google.protobuf.AbstractC0792j
        public String D() throws D {
            int iQ = Q();
            if (iQ > 0 && iQ <= U()) {
                String strG = A0.g(this.f6821g, L(this.f6825k), iQ);
                this.f6825k += (long) iQ;
                return strG;
            }
            if (iQ == 0) {
                return "";
            }
            if (iQ <= 0) {
                throw D.g();
            }
            throw D.m();
        }

        @Override // com.google.protobuf.AbstractC0792j
        public int E() throws D {
            if (f()) {
                this.f6828n = 0;
                return 0;
            }
            int iQ = Q();
            this.f6828n = iQ;
            if (B0.a(iQ) != 0) {
                return this.f6828n;
            }
            throw D.c();
        }

        @Override // com.google.protobuf.AbstractC0792j
        public int F() {
            return Q();
        }

        @Override // com.google.protobuf.AbstractC0792j
        public long G() {
            return R();
        }

        @Override // com.google.protobuf.AbstractC0792j
        public boolean J(int i3) throws D {
            int iB = B0.b(i3);
            if (iB == 0) {
                W();
                return true;
            }
            if (iB == 1) {
                V(8);
                return true;
            }
            if (iB == 2) {
                V(Q());
                return true;
            }
            if (iB == 3) {
                K();
                a(B0.c(B0.a(i3), 4));
                return true;
            }
            if (iB == 4) {
                return false;
            }
            if (iB != 5) {
                throw D.e();
            }
            V(4);
            return true;
        }

        public byte N() throws D {
            long j3 = this.f6825k;
            if (j3 == this.f6824j) {
                throw D.m();
            }
            this.f6825k = 1 + j3;
            return z0.w(j3);
        }

        public int O() throws D {
            long j3 = this.f6825k;
            if (this.f6824j - j3 < 4) {
                throw D.m();
            }
            this.f6825k = 4 + j3;
            return ((z0.w(j3 + 3) & 255) << 24) | (z0.w(j3) & 255) | ((z0.w(1 + j3) & 255) << 8) | ((z0.w(2 + j3) & 255) << 16);
        }

        public long P() throws D {
            long j3 = this.f6825k;
            if (this.f6824j - j3 < 8) {
                throw D.m();
            }
            this.f6825k = 8 + j3;
            return ((((long) z0.w(j3 + 7)) & 255) << 56) | (((long) z0.w(j3)) & 255) | ((((long) z0.w(1 + j3)) & 255) << 8) | ((((long) z0.w(2 + j3)) & 255) << 16) | ((((long) z0.w(3 + j3)) & 255) << 24) | ((((long) z0.w(4 + j3)) & 255) << 32) | ((((long) z0.w(5 + j3)) & 255) << 40) | ((((long) z0.w(6 + j3)) & 255) << 48);
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x008c, code lost:
        
            if (com.google.protobuf.z0.w(r3) < 0) goto L34;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int Q() {
            /*
                r9 = this;
                long r0 = r9.f6825k
                long r2 = r9.f6824j
                int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r2 != 0) goto La
                goto L8e
            La:
                r2 = 1
                long r2 = r2 + r0
                byte r4 = com.google.protobuf.z0.w(r0)
                if (r4 < 0) goto L16
                r9.f6825k = r2
                return r4
            L16:
                long r5 = r9.f6824j
                long r5 = r5 - r2
                r7 = 9
                int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r5 >= 0) goto L21
                goto L8e
            L21:
                r5 = 2
                long r5 = r5 + r0
                byte r2 = com.google.protobuf.z0.w(r2)
                int r2 = r2 << 7
                r2 = r2 ^ r4
                if (r2 >= 0) goto L31
                r0 = r2 ^ (-128(0xffffffffffffff80, float:NaN))
                goto L98
            L31:
                r3 = 3
                long r3 = r3 + r0
                byte r5 = com.google.protobuf.z0.w(r5)
                int r5 = r5 << 14
                r2 = r2 ^ r5
                if (r2 < 0) goto L41
                r0 = r2 ^ 16256(0x3f80, float:2.278E-41)
            L3f:
                r5 = r3
                goto L98
            L41:
                r5 = 4
                long r5 = r5 + r0
                byte r3 = com.google.protobuf.z0.w(r3)
                int r3 = r3 << 21
                r2 = r2 ^ r3
                if (r2 >= 0) goto L52
                r0 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L98
            L52:
                r3 = 5
                long r3 = r3 + r0
                byte r5 = com.google.protobuf.z0.w(r5)
                int r6 = r5 << 28
                r2 = r2 ^ r6
                r6 = 266354560(0xfe03f80, float:2.2112565E-29)
                r2 = r2 ^ r6
                if (r5 >= 0) goto L96
                r5 = 6
                long r5 = r5 + r0
                byte r3 = com.google.protobuf.z0.w(r3)
                if (r3 >= 0) goto L94
                r3 = 7
                long r3 = r3 + r0
                byte r5 = com.google.protobuf.z0.w(r5)
                if (r5 >= 0) goto L96
                r5 = 8
                long r5 = r5 + r0
                byte r3 = com.google.protobuf.z0.w(r3)
                if (r3 >= 0) goto L94
                long r3 = r0 + r7
                byte r5 = com.google.protobuf.z0.w(r5)
                if (r5 >= 0) goto L96
                r5 = 10
                long r5 = r5 + r0
                byte r0 = com.google.protobuf.z0.w(r3)
                if (r0 >= 0) goto L94
            L8e:
                long r0 = r9.S()
                int r0 = (int) r0
                return r0
            L94:
                r0 = r2
                goto L98
            L96:
                r0 = r2
                goto L3f
            L98:
                r9.f6825k = r5
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.AbstractC0792j.e.Q():int");
        }

        public long R() {
            long j3;
            long j4;
            long j5;
            int i3;
            long j6 = this.f6825k;
            if (this.f6824j != j6) {
                long j7 = 1 + j6;
                byte bW = z0.w(j6);
                if (bW >= 0) {
                    this.f6825k = j7;
                    return bW;
                }
                if (this.f6824j - j7 >= 9) {
                    long j8 = 2 + j6;
                    int iW = (z0.w(j7) << 7) ^ bW;
                    if (iW >= 0) {
                        long j9 = 3 + j6;
                        int iW2 = iW ^ (z0.w(j8) << 14);
                        if (iW2 >= 0) {
                            j3 = iW2 ^ 16256;
                            j8 = j9;
                        } else {
                            j8 = 4 + j6;
                            int iW3 = iW2 ^ (z0.w(j9) << 21);
                            if (iW3 < 0) {
                                i3 = (-2080896) ^ iW3;
                            } else {
                                long j10 = 5 + j6;
                                long jW = ((long) iW3) ^ (((long) z0.w(j8)) << 28);
                                if (jW >= 0) {
                                    j5 = 266354560;
                                } else {
                                    long j11 = 6 + j6;
                                    long jW2 = jW ^ (((long) z0.w(j10)) << 35);
                                    if (jW2 < 0) {
                                        j4 = -34093383808L;
                                    } else {
                                        j10 = 7 + j6;
                                        jW = jW2 ^ (((long) z0.w(j11)) << 42);
                                        if (jW >= 0) {
                                            j5 = 4363953127296L;
                                        } else {
                                            j11 = 8 + j6;
                                            jW2 = jW ^ (((long) z0.w(j10)) << 49);
                                            if (jW2 < 0) {
                                                j4 = -558586000294016L;
                                            } else {
                                                long j12 = j6 + 9;
                                                long jW3 = (jW2 ^ (((long) z0.w(j11)) << 56)) ^ 71499008037633920L;
                                                if (jW3 < 0) {
                                                    long j13 = j6 + 10;
                                                    if (z0.w(j12) >= 0) {
                                                        j8 = j13;
                                                        j3 = jW3;
                                                    }
                                                } else {
                                                    j3 = jW3;
                                                    j8 = j12;
                                                }
                                            }
                                        }
                                    }
                                    j3 = j4 ^ jW2;
                                    j8 = j11;
                                }
                                j3 = j5 ^ jW;
                                j8 = j10;
                            }
                        }
                        this.f6825k = j8;
                        return j3;
                    }
                    i3 = iW ^ (-128);
                    j3 = i3;
                    this.f6825k = j8;
                    return j3;
                }
            }
            return S();
        }

        long S() throws D {
            long j3 = 0;
            for (int i3 = 0; i3 < 64; i3 += 7) {
                byte bN = N();
                j3 |= ((long) (bN & 127)) << i3;
                if ((bN & 128) == 0) {
                    return j3;
                }
            }
            throw D.f();
        }

        public void V(int i3) throws D {
            if (i3 >= 0 && i3 <= U()) {
                this.f6825k += (long) i3;
            } else {
                if (i3 >= 0) {
                    throw D.m();
                }
                throw D.g();
            }
        }

        @Override // com.google.protobuf.AbstractC0792j
        public void a(int i3) throws D {
            if (this.f6828n != i3) {
                throw D.b();
            }
        }

        @Override // com.google.protobuf.AbstractC0792j
        public int e() {
            return (int) (this.f6825k - this.f6826l);
        }

        @Override // com.google.protobuf.AbstractC0792j
        public boolean f() {
            return this.f6825k == this.f6824j;
        }

        @Override // com.google.protobuf.AbstractC0792j
        public void n(int i3) {
            this.f6830p = i3;
            T();
        }

        @Override // com.google.protobuf.AbstractC0792j
        public int o(int i3) throws D {
            if (i3 < 0) {
                throw D.g();
            }
            int iE = i3 + e();
            int i4 = this.f6830p;
            if (iE > i4) {
                throw D.m();
            }
            this.f6830p = iE;
            T();
            return i4;
        }

        @Override // com.google.protobuf.AbstractC0792j
        public boolean p() {
            return R() != 0;
        }

        @Override // com.google.protobuf.AbstractC0792j
        public AbstractC0791i q() throws D {
            int iQ = Q();
            if (iQ <= 0 || iQ > U()) {
                if (iQ == 0) {
                    return AbstractC0791i.f6770b;
                }
                if (iQ < 0) {
                    throw D.g();
                }
                throw D.m();
            }
            if (this.f6822h && this.f6829o) {
                long j3 = this.f6825k;
                long j4 = iQ;
                ByteBuffer byteBufferZ = Z(j3, j3 + j4);
                this.f6825k += j4;
                return AbstractC0791i.L(byteBufferZ);
            }
            byte[] bArr = new byte[iQ];
            long j5 = iQ;
            z0.p(this.f6825k, bArr, 0L, j5);
            this.f6825k += j5;
            return AbstractC0791i.M(bArr);
        }

        @Override // com.google.protobuf.AbstractC0792j
        public double r() {
            return Double.longBitsToDouble(P());
        }

        @Override // com.google.protobuf.AbstractC0792j
        public int s() {
            return Q();
        }

        @Override // com.google.protobuf.AbstractC0792j
        public int t() {
            return O();
        }

        @Override // com.google.protobuf.AbstractC0792j
        public long u() {
            return P();
        }

        @Override // com.google.protobuf.AbstractC0792j
        public float v() {
            return Float.intBitsToFloat(O());
        }

        @Override // com.google.protobuf.AbstractC0792j
        public int w() {
            return Q();
        }

        @Override // com.google.protobuf.AbstractC0792j
        public long x() {
            return R();
        }

        @Override // com.google.protobuf.AbstractC0792j
        public int y() {
            return O();
        }

        @Override // com.google.protobuf.AbstractC0792j
        public long z() {
            return P();
        }
    }

    private AbstractC0792j() {
        this.f6785b = f6783f;
        this.f6786c = a.e.API_PRIORITY_OTHER;
        this.f6788e = false;
    }

    public static int c(int i3) {
        return (-(i3 & 1)) ^ (i3 >>> 1);
    }

    public static long d(long j3) {
        return (-(j3 & 1)) ^ (j3 >>> 1);
    }

    public static AbstractC0792j g(InputStream inputStream) {
        return h(inputStream, 4096);
    }

    public static AbstractC0792j h(InputStream inputStream, int i3) {
        if (i3 > 0) {
            return inputStream == null ? k(C.f6668d) : new d(inputStream, i3);
        }
        throw new IllegalArgumentException("bufferSize must be > 0");
    }

    static AbstractC0792j i(Iterable iterable, boolean z2) {
        Iterator it = iterable.iterator();
        int i3 = 0;
        int iRemaining = 0;
        while (it.hasNext()) {
            ByteBuffer byteBuffer = (ByteBuffer) it.next();
            iRemaining += byteBuffer.remaining();
            i3 = byteBuffer.hasArray() ? i3 | 1 : byteBuffer.isDirect() ? i3 | 2 : i3 | 4;
        }
        return i3 == 2 ? new c(iterable, iRemaining, z2) : g(new E(iterable));
    }

    static AbstractC0792j j(ByteBuffer byteBuffer, boolean z2) {
        if (byteBuffer.hasArray()) {
            return m(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining(), z2);
        }
        if (byteBuffer.isDirect() && e.M()) {
            return new e(byteBuffer, z2);
        }
        int iRemaining = byteBuffer.remaining();
        byte[] bArr = new byte[iRemaining];
        byteBuffer.duplicate().get(bArr);
        return m(bArr, 0, iRemaining, true);
    }

    public static AbstractC0792j k(byte[] bArr) {
        return l(bArr, 0, bArr.length);
    }

    public static AbstractC0792j l(byte[] bArr, int i3, int i4) {
        return m(bArr, i3, i4, false);
    }

    static AbstractC0792j m(byte[] bArr, int i3, int i4, boolean z2) {
        b bVar = new b(bArr, i3, i4, z2);
        try {
            bVar.o(i4);
            return bVar;
        } catch (D e3) {
            throw new IllegalArgumentException(e3);
        }
    }

    public abstract int A();

    public abstract long B();

    public abstract String C();

    public abstract String D();

    public abstract int E();

    public abstract int F();

    public abstract long G();

    public final int H(int i3) {
        if (i3 >= 0) {
            int i4 = this.f6785b;
            this.f6785b = i3;
            return i4;
        }
        throw new IllegalArgumentException("Recursion limit cannot be negative: " + i3);
    }

    public final int I(int i3) {
        if (i3 >= 0) {
            int i4 = this.f6786c;
            this.f6786c = i3;
            return i4;
        }
        throw new IllegalArgumentException("Size limit cannot be negative: " + i3);
    }

    public abstract boolean J(int i3);

    public void K() throws D {
        int iE;
        do {
            iE = E();
            if (iE == 0) {
                return;
            }
            b();
            this.f6784a++;
            this.f6784a--;
        } while (J(iE));
    }

    public abstract void a(int i3);

    public void b() throws D {
        if (this.f6784a >= this.f6785b) {
            throw D.i();
        }
    }

    public abstract int e();

    public abstract boolean f();

    public abstract void n(int i3);

    public abstract int o(int i3);

    public abstract boolean p();

    public abstract AbstractC0791i q();

    public abstract double r();

    public abstract int s();

    public abstract int t();

    public abstract long u();

    public abstract float v();

    public abstract int w();

    public abstract long x();

    public abstract int y();

    public abstract long z();
}
