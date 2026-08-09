package androidx.datastore.preferences.protobuf;

import com.google.android.gms.common.api.a;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0493g {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static volatile int f4077f = 100;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f4078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f4079b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f4080c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    C0494h f4081d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f4082e;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.g$b */
    private static final class b extends AbstractC0493g {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final byte[] f4083g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final boolean f4084h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f4085i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f4086j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f4087k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f4088l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f4089m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private boolean f4090n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private int f4091o;

        private b(byte[] bArr, int i3, int i4, boolean z2) {
            super();
            this.f4091o = a.e.API_PRIORITY_OTHER;
            this.f4083g = bArr;
            this.f4085i = i4 + i3;
            this.f4087k = i3;
            this.f4088l = i3;
            this.f4084h = z2;
        }

        private void O() {
            int i3 = this.f4085i + this.f4086j;
            this.f4085i = i3;
            int i4 = i3 - this.f4088l;
            int i5 = this.f4091o;
            if (i4 <= i5) {
                this.f4086j = 0;
                return;
            }
            int i6 = i4 - i5;
            this.f4086j = i6;
            this.f4085i = i3 - i6;
        }

        private void Q() throws C0507v {
            if (this.f4085i - this.f4087k >= 10) {
                R();
            } else {
                S();
            }
        }

        private void R() throws C0507v {
            for (int i3 = 0; i3 < 10; i3++) {
                byte[] bArr = this.f4083g;
                int i4 = this.f4087k;
                this.f4087k = i4 + 1;
                if (bArr[i4] >= 0) {
                    return;
                }
            }
            throw C0507v.f();
        }

        private void S() throws C0507v {
            for (int i3 = 0; i3 < 10; i3++) {
                if (H() >= 0) {
                    return;
                }
            }
            throw C0507v.f();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0493g
        public String A() throws C0507v {
            int iL = L();
            if (iL > 0) {
                int i3 = this.f4085i;
                int i4 = this.f4087k;
                if (iL <= i3 - i4) {
                    String str = new String(this.f4083g, i4, iL, AbstractC0506u.f4280b);
                    this.f4087k += iL;
                    return str;
                }
            }
            if (iL == 0) {
                return "";
            }
            if (iL < 0) {
                throw C0507v.g();
            }
            throw C0507v.m();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0493g
        public String B() throws C0507v {
            int iL = L();
            if (iL > 0) {
                int i3 = this.f4085i;
                int i4 = this.f4087k;
                if (iL <= i3 - i4) {
                    String strA = j0.a(this.f4083g, i4, iL);
                    this.f4087k += iL;
                    return strA;
                }
            }
            if (iL == 0) {
                return "";
            }
            if (iL <= 0) {
                throw C0507v.g();
            }
            throw C0507v.m();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0493g
        public int C() throws C0507v {
            if (f()) {
                this.f4089m = 0;
                return 0;
            }
            int iL = L();
            this.f4089m = iL;
            if (k0.a(iL) != 0) {
                return this.f4089m;
            }
            throw C0507v.c();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0493g
        public int D() {
            return L();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0493g
        public long E() {
            return M();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0493g
        public boolean F(int i3) throws C0507v {
            int iB = k0.b(i3);
            if (iB == 0) {
                Q();
                return true;
            }
            if (iB == 1) {
                P(8);
                return true;
            }
            if (iB == 2) {
                P(L());
                return true;
            }
            if (iB == 3) {
                G();
                a(k0.c(k0.a(i3), 4));
                return true;
            }
            if (iB == 4) {
                return false;
            }
            if (iB != 5) {
                throw C0507v.e();
            }
            P(4);
            return true;
        }

        public byte H() throws C0507v {
            int i3 = this.f4087k;
            if (i3 == this.f4085i) {
                throw C0507v.m();
            }
            byte[] bArr = this.f4083g;
            this.f4087k = i3 + 1;
            return bArr[i3];
        }

        public byte[] I(int i3) throws C0507v {
            if (i3 > 0) {
                int i4 = this.f4085i;
                int i5 = this.f4087k;
                if (i3 <= i4 - i5) {
                    int i6 = i3 + i5;
                    this.f4087k = i6;
                    return Arrays.copyOfRange(this.f4083g, i5, i6);
                }
            }
            if (i3 > 0) {
                throw C0507v.m();
            }
            if (i3 == 0) {
                return AbstractC0506u.f4282d;
            }
            throw C0507v.g();
        }

        public int J() throws C0507v {
            int i3 = this.f4087k;
            if (this.f4085i - i3 < 4) {
                throw C0507v.m();
            }
            byte[] bArr = this.f4083g;
            this.f4087k = i3 + 4;
            return ((bArr[i3 + 3] & 255) << 24) | (bArr[i3] & 255) | ((bArr[i3 + 1] & 255) << 8) | ((bArr[i3 + 2] & 255) << 16);
        }

        public long K() throws C0507v {
            int i3 = this.f4087k;
            if (this.f4085i - i3 < 8) {
                throw C0507v.m();
            }
            byte[] bArr = this.f4083g;
            this.f4087k = i3 + 8;
            return ((((long) bArr[i3 + 7]) & 255) << 56) | (((long) bArr[i3]) & 255) | ((((long) bArr[i3 + 1]) & 255) << 8) | ((((long) bArr[i3 + 2]) & 255) << 16) | ((((long) bArr[i3 + 3]) & 255) << 24) | ((((long) bArr[i3 + 4]) & 255) << 32) | ((((long) bArr[i3 + 5]) & 255) << 40) | ((((long) bArr[i3 + 6]) & 255) << 48);
        }

        public int L() {
            int i3;
            int i4 = this.f4087k;
            int i5 = this.f4085i;
            if (i5 != i4) {
                byte[] bArr = this.f4083g;
                int i6 = i4 + 1;
                byte b3 = bArr[i4];
                if (b3 >= 0) {
                    this.f4087k = i6;
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
                    this.f4087k = i7;
                    return i3;
                }
            }
            return (int) N();
        }

        public long M() {
            long j3;
            long j4;
            long j5;
            int i3 = this.f4087k;
            int i4 = this.f4085i;
            if (i4 != i3) {
                byte[] bArr = this.f4083g;
                int i5 = i3 + 1;
                byte b3 = bArr[i3];
                if (b3 >= 0) {
                    this.f4087k = i5;
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
                    this.f4087k = i6;
                    return j3;
                }
            }
            return N();
        }

        long N() throws C0507v {
            long j3 = 0;
            for (int i3 = 0; i3 < 64; i3 += 7) {
                byte bH = H();
                j3 |= ((long) (bH & 127)) << i3;
                if ((bH & 128) == 0) {
                    return j3;
                }
            }
            throw C0507v.f();
        }

        public void P(int i3) throws C0507v {
            if (i3 >= 0) {
                int i4 = this.f4085i;
                int i5 = this.f4087k;
                if (i3 <= i4 - i5) {
                    this.f4087k = i5 + i3;
                    return;
                }
            }
            if (i3 >= 0) {
                throw C0507v.m();
            }
            throw C0507v.g();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0493g
        public void a(int i3) throws C0507v {
            if (this.f4089m != i3) {
                throw C0507v.b();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0493g
        public int e() {
            return this.f4087k - this.f4088l;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0493g
        public boolean f() {
            return this.f4087k == this.f4085i;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0493g
        public void l(int i3) {
            this.f4091o = i3;
            O();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0493g
        public int m(int i3) throws C0507v {
            if (i3 < 0) {
                throw C0507v.g();
            }
            int iE = i3 + e();
            if (iE < 0) {
                throw C0507v.h();
            }
            int i4 = this.f4091o;
            if (iE > i4) {
                throw C0507v.m();
            }
            this.f4091o = iE;
            O();
            return i4;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0493g
        public boolean n() {
            return M() != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0493g
        public AbstractC0492f o() {
            int iL = L();
            if (iL > 0) {
                int i3 = this.f4085i;
                int i4 = this.f4087k;
                if (iL <= i3 - i4) {
                    AbstractC0492f abstractC0492fY = (this.f4084h && this.f4090n) ? AbstractC0492f.y(this.f4083g, i4, iL) : AbstractC0492f.m(this.f4083g, i4, iL);
                    this.f4087k += iL;
                    return abstractC0492fY;
                }
            }
            return iL == 0 ? AbstractC0492f.f4066b : AbstractC0492f.x(I(iL));
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0493g
        public double p() {
            return Double.longBitsToDouble(K());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0493g
        public int q() {
            return L();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0493g
        public int r() {
            return J();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0493g
        public long s() {
            return K();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0493g
        public float t() {
            return Float.intBitsToFloat(J());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0493g
        public int u() {
            return L();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0493g
        public long v() {
            return M();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0493g
        public int w() {
            return J();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0493g
        public long x() {
            return K();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0493g
        public int y() {
            return AbstractC0493g.c(L());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0493g
        public long z() {
            return AbstractC0493g.d(M());
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.g$c */
    private static final class c extends AbstractC0493g {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final InputStream f4092g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final byte[] f4093h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f4094i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f4095j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f4096k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f4097l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f4098m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private int f4099n;

        private c(InputStream inputStream, int i3) {
            super();
            this.f4099n = a.e.API_PRIORITY_OTHER;
            AbstractC0506u.b(inputStream, "input");
            this.f4092g = inputStream;
            this.f4093h = new byte[i3];
            this.f4094i = 0;
            this.f4096k = 0;
            this.f4098m = 0;
        }

        private static int H(InputStream inputStream) throws C0507v {
            try {
                return inputStream.available();
            } catch (C0507v e3) {
                e3.j();
                throw e3;
            }
        }

        private static int I(InputStream inputStream, byte[] bArr, int i3, int i4) throws C0507v {
            try {
                return inputStream.read(bArr, i3, i4);
            } catch (C0507v e3) {
                e3.j();
                throw e3;
            }
        }

        private AbstractC0492f J(int i3) throws IOException {
            byte[] bArrM = M(i3);
            if (bArrM != null) {
                return AbstractC0492f.l(bArrM);
            }
            int i4 = this.f4096k;
            int i5 = this.f4094i;
            int length = i5 - i4;
            this.f4098m += i5;
            this.f4096k = 0;
            this.f4094i = 0;
            List<byte[]> listN = N(i3 - length);
            byte[] bArr = new byte[i3];
            System.arraycopy(this.f4093h, i4, bArr, 0, length);
            for (byte[] bArr2 : listN) {
                System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
                length += bArr2.length;
            }
            return AbstractC0492f.x(bArr);
        }

        private byte[] L(int i3, boolean z2) throws IOException {
            byte[] bArrM = M(i3);
            if (bArrM != null) {
                return z2 ? (byte[]) bArrM.clone() : bArrM;
            }
            int i4 = this.f4096k;
            int i5 = this.f4094i;
            int length = i5 - i4;
            this.f4098m += i5;
            this.f4096k = 0;
            this.f4094i = 0;
            List<byte[]> listN = N(i3 - length);
            byte[] bArr = new byte[i3];
            System.arraycopy(this.f4093h, i4, bArr, 0, length);
            for (byte[] bArr2 : listN) {
                System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
                length += bArr2.length;
            }
            return bArr;
        }

        private byte[] M(int i3) throws C0507v {
            if (i3 == 0) {
                return AbstractC0506u.f4282d;
            }
            if (i3 < 0) {
                throw C0507v.g();
            }
            int i4 = this.f4098m;
            int i5 = this.f4096k;
            int i6 = i4 + i5 + i3;
            if (i6 - this.f4080c > 0) {
                throw C0507v.l();
            }
            int i7 = this.f4099n;
            if (i6 > i7) {
                W((i7 - i4) - i5);
                throw C0507v.m();
            }
            int i8 = this.f4094i - i5;
            int i9 = i3 - i8;
            if (i9 >= 4096 && i9 > H(this.f4092g)) {
                return null;
            }
            byte[] bArr = new byte[i3];
            System.arraycopy(this.f4093h, this.f4096k, bArr, 0, i8);
            this.f4098m += this.f4094i;
            this.f4096k = 0;
            this.f4094i = 0;
            while (i8 < i3) {
                int I2 = I(this.f4092g, bArr, i8, i3 - i8);
                if (I2 == -1) {
                    throw C0507v.m();
                }
                this.f4098m += I2;
                i8 += I2;
            }
            return bArr;
        }

        private List N(int i3) throws IOException {
            ArrayList arrayList = new ArrayList();
            while (i3 > 0) {
                int iMin = Math.min(i3, 4096);
                byte[] bArr = new byte[iMin];
                int i4 = 0;
                while (i4 < iMin) {
                    int i5 = this.f4092g.read(bArr, i4, iMin - i4);
                    if (i5 == -1) {
                        throw C0507v.m();
                    }
                    this.f4098m += i5;
                    i4 += i5;
                }
                i3 -= iMin;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        private void T() {
            int i3 = this.f4094i + this.f4095j;
            this.f4094i = i3;
            int i4 = this.f4098m + i3;
            int i5 = this.f4099n;
            if (i4 <= i5) {
                this.f4095j = 0;
                return;
            }
            int i6 = i4 - i5;
            this.f4095j = i6;
            this.f4094i = i3 - i6;
        }

        private void U(int i3) throws C0507v {
            if (b0(i3)) {
                return;
            }
            if (i3 <= (this.f4080c - this.f4098m) - this.f4096k) {
                throw C0507v.m();
            }
            throw C0507v.l();
        }

        private static long V(InputStream inputStream, long j3) throws C0507v {
            try {
                return inputStream.skip(j3);
            } catch (C0507v e3) {
                e3.j();
                throw e3;
            }
        }

        private void X(int i3) throws C0507v {
            if (i3 < 0) {
                throw C0507v.g();
            }
            int i4 = this.f4098m;
            int i5 = this.f4096k;
            int i6 = i4 + i5 + i3;
            int i7 = this.f4099n;
            if (i6 > i7) {
                W((i7 - i4) - i5);
                throw C0507v.m();
            }
            this.f4098m = i4 + i5;
            int i8 = this.f4094i - i5;
            this.f4094i = 0;
            this.f4096k = 0;
            while (i8 < i3) {
                try {
                    long j3 = i3 - i8;
                    long jV = V(this.f4092g, j3);
                    if (jV < 0 || jV > j3) {
                        throw new IllegalStateException(this.f4092g.getClass() + "#skip returned invalid result: " + jV + "\nThe InputStream implementation is buggy.");
                    }
                    if (jV == 0) {
                        break;
                    } else {
                        i8 += (int) jV;
                    }
                } finally {
                    this.f4098m += i8;
                    T();
                }
            }
            if (i8 >= i3) {
                return;
            }
            int i9 = this.f4094i;
            int i10 = i9 - this.f4096k;
            this.f4096k = i9;
            while (true) {
                U(1);
                int i11 = i3 - i10;
                int i12 = this.f4094i;
                if (i11 <= i12) {
                    this.f4096k = i11;
                    return;
                } else {
                    i10 += i12;
                    this.f4096k = i12;
                }
            }
        }

        private void Y() throws C0507v {
            if (this.f4094i - this.f4096k >= 10) {
                Z();
            } else {
                a0();
            }
        }

        private void Z() throws C0507v {
            for (int i3 = 0; i3 < 10; i3++) {
                byte[] bArr = this.f4093h;
                int i4 = this.f4096k;
                this.f4096k = i4 + 1;
                if (bArr[i4] >= 0) {
                    return;
                }
            }
            throw C0507v.f();
        }

        private void a0() throws C0507v {
            for (int i3 = 0; i3 < 10; i3++) {
                if (K() >= 0) {
                    return;
                }
            }
            throw C0507v.f();
        }

        private boolean b0(int i3) throws C0507v {
            int i4 = this.f4096k;
            int i5 = i4 + i3;
            int i6 = this.f4094i;
            if (i5 <= i6) {
                throw new IllegalStateException("refillBuffer() called when " + i3 + " bytes were already available in buffer");
            }
            int i7 = this.f4080c;
            int i8 = this.f4098m;
            if (i3 > (i7 - i8) - i4 || i8 + i4 + i3 > this.f4099n) {
                return false;
            }
            if (i4 > 0) {
                if (i6 > i4) {
                    byte[] bArr = this.f4093h;
                    System.arraycopy(bArr, i4, bArr, 0, i6 - i4);
                }
                this.f4098m += i4;
                this.f4094i -= i4;
                this.f4096k = 0;
            }
            InputStream inputStream = this.f4092g;
            byte[] bArr2 = this.f4093h;
            int i9 = this.f4094i;
            int I2 = I(inputStream, bArr2, i9, Math.min(bArr2.length - i9, (this.f4080c - this.f4098m) - i9));
            if (I2 == 0 || I2 < -1 || I2 > this.f4093h.length) {
                throw new IllegalStateException(this.f4092g.getClass() + "#read(byte[]) returned invalid result: " + I2 + "\nThe InputStream implementation is buggy.");
            }
            if (I2 <= 0) {
                return false;
            }
            this.f4094i += I2;
            T();
            if (this.f4094i >= i3) {
                return true;
            }
            return b0(i3);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0493g
        public String A() throws C0507v {
            int iQ = Q();
            if (iQ > 0) {
                int i3 = this.f4094i;
                int i4 = this.f4096k;
                if (iQ <= i3 - i4) {
                    String str = new String(this.f4093h, i4, iQ, AbstractC0506u.f4280b);
                    this.f4096k += iQ;
                    return str;
                }
            }
            if (iQ == 0) {
                return "";
            }
            if (iQ < 0) {
                throw C0507v.g();
            }
            if (iQ > this.f4094i) {
                return new String(L(iQ, false), AbstractC0506u.f4280b);
            }
            U(iQ);
            String str2 = new String(this.f4093h, this.f4096k, iQ, AbstractC0506u.f4280b);
            this.f4096k += iQ;
            return str2;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0493g
        public String B() throws IOException {
            byte[] bArrL;
            int iQ = Q();
            int i3 = this.f4096k;
            int i4 = this.f4094i;
            if (iQ <= i4 - i3 && iQ > 0) {
                bArrL = this.f4093h;
                this.f4096k = i3 + iQ;
            } else {
                if (iQ == 0) {
                    return "";
                }
                if (iQ < 0) {
                    throw C0507v.g();
                }
                i3 = 0;
                if (iQ <= i4) {
                    U(iQ);
                    bArrL = this.f4093h;
                    this.f4096k = iQ;
                } else {
                    bArrL = L(iQ, false);
                }
            }
            return j0.a(bArrL, i3, iQ);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0493g
        public int C() throws C0507v {
            if (f()) {
                this.f4097l = 0;
                return 0;
            }
            int iQ = Q();
            this.f4097l = iQ;
            if (k0.a(iQ) != 0) {
                return this.f4097l;
            }
            throw C0507v.c();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0493g
        public int D() {
            return Q();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0493g
        public long E() {
            return R();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0493g
        public boolean F(int i3) throws C0507v {
            int iB = k0.b(i3);
            if (iB == 0) {
                Y();
                return true;
            }
            if (iB == 1) {
                W(8);
                return true;
            }
            if (iB == 2) {
                W(Q());
                return true;
            }
            if (iB == 3) {
                G();
                a(k0.c(k0.a(i3), 4));
                return true;
            }
            if (iB == 4) {
                return false;
            }
            if (iB != 5) {
                throw C0507v.e();
            }
            W(4);
            return true;
        }

        public byte K() throws C0507v {
            if (this.f4096k == this.f4094i) {
                U(1);
            }
            byte[] bArr = this.f4093h;
            int i3 = this.f4096k;
            this.f4096k = i3 + 1;
            return bArr[i3];
        }

        public int O() throws C0507v {
            int i3 = this.f4096k;
            if (this.f4094i - i3 < 4) {
                U(4);
                i3 = this.f4096k;
            }
            byte[] bArr = this.f4093h;
            this.f4096k = i3 + 4;
            return ((bArr[i3 + 3] & 255) << 24) | (bArr[i3] & 255) | ((bArr[i3 + 1] & 255) << 8) | ((bArr[i3 + 2] & 255) << 16);
        }

        public long P() throws C0507v {
            int i3 = this.f4096k;
            if (this.f4094i - i3 < 8) {
                U(8);
                i3 = this.f4096k;
            }
            byte[] bArr = this.f4093h;
            this.f4096k = i3 + 8;
            return ((((long) bArr[i3 + 7]) & 255) << 56) | (((long) bArr[i3]) & 255) | ((((long) bArr[i3 + 1]) & 255) << 8) | ((((long) bArr[i3 + 2]) & 255) << 16) | ((((long) bArr[i3 + 3]) & 255) << 24) | ((((long) bArr[i3 + 4]) & 255) << 32) | ((((long) bArr[i3 + 5]) & 255) << 40) | ((((long) bArr[i3 + 6]) & 255) << 48);
        }

        public int Q() {
            int i3;
            int i4 = this.f4096k;
            int i5 = this.f4094i;
            if (i5 != i4) {
                byte[] bArr = this.f4093h;
                int i6 = i4 + 1;
                byte b3 = bArr[i4];
                if (b3 >= 0) {
                    this.f4096k = i6;
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
                    this.f4096k = i7;
                    return i3;
                }
            }
            return (int) S();
        }

        public long R() {
            long j3;
            long j4;
            long j5;
            int i3 = this.f4096k;
            int i4 = this.f4094i;
            if (i4 != i3) {
                byte[] bArr = this.f4093h;
                int i5 = i3 + 1;
                byte b3 = bArr[i3];
                if (b3 >= 0) {
                    this.f4096k = i5;
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
                    this.f4096k = i6;
                    return j3;
                }
            }
            return S();
        }

        long S() throws C0507v {
            long j3 = 0;
            for (int i3 = 0; i3 < 64; i3 += 7) {
                byte bK = K();
                j3 |= ((long) (bK & 127)) << i3;
                if ((bK & 128) == 0) {
                    return j3;
                }
            }
            throw C0507v.f();
        }

        public void W(int i3) throws C0507v {
            int i4 = this.f4094i;
            int i5 = this.f4096k;
            if (i3 > i4 - i5 || i3 < 0) {
                X(i3);
            } else {
                this.f4096k = i5 + i3;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0493g
        public void a(int i3) throws C0507v {
            if (this.f4097l != i3) {
                throw C0507v.b();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0493g
        public int e() {
            return this.f4098m + this.f4096k;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0493g
        public boolean f() {
            return this.f4096k == this.f4094i && !b0(1);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0493g
        public void l(int i3) {
            this.f4099n = i3;
            T();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0493g
        public int m(int i3) throws C0507v {
            if (i3 < 0) {
                throw C0507v.g();
            }
            int i4 = i3 + this.f4098m + this.f4096k;
            if (i4 < 0) {
                throw C0507v.h();
            }
            int i5 = this.f4099n;
            if (i4 > i5) {
                throw C0507v.m();
            }
            this.f4099n = i4;
            T();
            return i5;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0493g
        public boolean n() {
            return R() != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0493g
        public AbstractC0492f o() throws C0507v {
            int iQ = Q();
            int i3 = this.f4094i;
            int i4 = this.f4096k;
            if (iQ <= i3 - i4 && iQ > 0) {
                AbstractC0492f abstractC0492fM = AbstractC0492f.m(this.f4093h, i4, iQ);
                this.f4096k += iQ;
                return abstractC0492fM;
            }
            if (iQ == 0) {
                return AbstractC0492f.f4066b;
            }
            if (iQ >= 0) {
                return J(iQ);
            }
            throw C0507v.g();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0493g
        public double p() {
            return Double.longBitsToDouble(P());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0493g
        public int q() {
            return Q();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0493g
        public int r() {
            return O();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0493g
        public long s() {
            return P();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0493g
        public float t() {
            return Float.intBitsToFloat(O());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0493g
        public int u() {
            return Q();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0493g
        public long v() {
            return R();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0493g
        public int w() {
            return O();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0493g
        public long x() {
            return P();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0493g
        public int y() {
            return AbstractC0493g.c(Q());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0493g
        public long z() {
            return AbstractC0493g.d(R());
        }
    }

    private AbstractC0493g() {
        this.f4079b = f4077f;
        this.f4080c = a.e.API_PRIORITY_OTHER;
        this.f4082e = false;
    }

    public static int c(int i3) {
        return (-(i3 & 1)) ^ (i3 >>> 1);
    }

    public static long d(long j3) {
        return (-(j3 & 1)) ^ (j3 >>> 1);
    }

    public static AbstractC0493g g(InputStream inputStream) {
        return h(inputStream, 4096);
    }

    public static AbstractC0493g h(InputStream inputStream, int i3) {
        if (i3 > 0) {
            return inputStream == null ? i(AbstractC0506u.f4282d) : new c(inputStream, i3);
        }
        throw new IllegalArgumentException("bufferSize must be > 0");
    }

    public static AbstractC0493g i(byte[] bArr) {
        return j(bArr, 0, bArr.length);
    }

    public static AbstractC0493g j(byte[] bArr, int i3, int i4) {
        return k(bArr, i3, i4, false);
    }

    static AbstractC0493g k(byte[] bArr, int i3, int i4, boolean z2) {
        b bVar = new b(bArr, i3, i4, z2);
        try {
            bVar.m(i4);
            return bVar;
        } catch (C0507v e3) {
            throw new IllegalArgumentException(e3);
        }
    }

    public abstract String A();

    public abstract String B();

    public abstract int C();

    public abstract int D();

    public abstract long E();

    public abstract boolean F(int i3);

    public void G() throws C0507v {
        int iC;
        do {
            iC = C();
            if (iC == 0) {
                return;
            }
            b();
            this.f4078a++;
            this.f4078a--;
        } while (F(iC));
    }

    public abstract void a(int i3);

    public void b() throws C0507v {
        if (this.f4078a >= this.f4079b) {
            throw C0507v.i();
        }
    }

    public abstract int e();

    public abstract boolean f();

    public abstract void l(int i3);

    public abstract int m(int i3);

    public abstract boolean n();

    public abstract AbstractC0492f o();

    public abstract double p();

    public abstract int q();

    public abstract int r();

    public abstract long s();

    public abstract float t();

    public abstract int u();

    public abstract long v();

    public abstract int w();

    public abstract long x();

    public abstract int y();

    public abstract long z();
}
