package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.j0;
import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0495i extends AbstractC0491e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Logger f4111c = Logger.getLogger(AbstractC0495i.class.getName());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final boolean f4112d = i0.B();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    C0496j f4113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f4114b;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.i$b */
    private static abstract class b extends AbstractC0495i {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final byte[] f4115e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final int f4116f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f4117g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f4118h;

        b(int i3) {
            super();
            if (i3 < 0) {
                throw new IllegalArgumentException("bufferSize must be >= 0");
            }
            byte[] bArr = new byte[Math.max(i3, 20)];
            this.f4115e = bArr;
            this.f4116f = bArr.length;
        }

        final void R0(byte b3) {
            byte[] bArr = this.f4115e;
            int i3 = this.f4117g;
            this.f4117g = i3 + 1;
            bArr[i3] = b3;
            this.f4118h++;
        }

        final void S0(int i3) {
            byte[] bArr = this.f4115e;
            int i4 = this.f4117g;
            bArr[i4] = (byte) (i3 & 255);
            bArr[i4 + 1] = (byte) ((i3 >> 8) & 255);
            bArr[i4 + 2] = (byte) ((i3 >> 16) & 255);
            this.f4117g = i4 + 4;
            bArr[i4 + 3] = (byte) ((i3 >> 24) & 255);
            this.f4118h += 4;
        }

        final void T0(long j3) {
            byte[] bArr = this.f4115e;
            int i3 = this.f4117g;
            bArr[i3] = (byte) (j3 & 255);
            bArr[i3 + 1] = (byte) ((j3 >> 8) & 255);
            bArr[i3 + 2] = (byte) ((j3 >> 16) & 255);
            bArr[i3 + 3] = (byte) (255 & (j3 >> 24));
            bArr[i3 + 4] = (byte) (((int) (j3 >> 32)) & 255);
            bArr[i3 + 5] = (byte) (((int) (j3 >> 40)) & 255);
            bArr[i3 + 6] = (byte) (((int) (j3 >> 48)) & 255);
            this.f4117g = i3 + 8;
            bArr[i3 + 7] = (byte) (((int) (j3 >> 56)) & 255);
            this.f4118h += 8;
        }

        final void U0(int i3) {
            if (i3 >= 0) {
                W0(i3);
            } else {
                X0(i3);
            }
        }

        final void V0(int i3, int i4) {
            W0(k0.c(i3, i4));
        }

        final void W0(int i3) {
            if (!AbstractC0495i.f4112d) {
                while ((i3 & (-128)) != 0) {
                    byte[] bArr = this.f4115e;
                    int i4 = this.f4117g;
                    this.f4117g = i4 + 1;
                    bArr[i4] = (byte) ((i3 | 128) & 255);
                    this.f4118h++;
                    i3 >>>= 7;
                }
                byte[] bArr2 = this.f4115e;
                int i5 = this.f4117g;
                this.f4117g = i5 + 1;
                bArr2[i5] = (byte) i3;
                this.f4118h++;
                return;
            }
            long j3 = this.f4117g;
            while ((i3 & (-128)) != 0) {
                byte[] bArr3 = this.f4115e;
                int i6 = this.f4117g;
                this.f4117g = i6 + 1;
                i0.H(bArr3, i6, (byte) ((i3 | 128) & 255));
                i3 >>>= 7;
            }
            byte[] bArr4 = this.f4115e;
            int i7 = this.f4117g;
            this.f4117g = i7 + 1;
            i0.H(bArr4, i7, (byte) i3);
            this.f4118h += (int) (((long) this.f4117g) - j3);
        }

        final void X0(long j3) {
            if (!AbstractC0495i.f4112d) {
                while ((j3 & (-128)) != 0) {
                    byte[] bArr = this.f4115e;
                    int i3 = this.f4117g;
                    this.f4117g = i3 + 1;
                    bArr[i3] = (byte) ((((int) j3) | 128) & 255);
                    this.f4118h++;
                    j3 >>>= 7;
                }
                byte[] bArr2 = this.f4115e;
                int i4 = this.f4117g;
                this.f4117g = i4 + 1;
                bArr2[i4] = (byte) j3;
                this.f4118h++;
                return;
            }
            long j4 = this.f4117g;
            while ((j3 & (-128)) != 0) {
                byte[] bArr3 = this.f4115e;
                int i5 = this.f4117g;
                this.f4117g = i5 + 1;
                i0.H(bArr3, i5, (byte) ((((int) j3) | 128) & 255));
                j3 >>>= 7;
            }
            byte[] bArr4 = this.f4115e;
            int i6 = this.f4117g;
            this.f4117g = i6 + 1;
            i0.H(bArr4, i6, (byte) j3);
            this.f4118h += (int) (((long) this.f4117g) - j4);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.i$c */
    public static class c extends IOException {
        c(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.i$d */
    private static final class d extends b {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final OutputStream f4119i;

        d(OutputStream outputStream, int i3) {
            super(i3);
            if (outputStream == null) {
                throw new NullPointerException("out");
            }
            this.f4119i = outputStream;
        }

        private void Y0() throws IOException {
            this.f4119i.write(this.f4115e, 0, this.f4117g);
            this.f4117g = 0;
        }

        private void Z0(int i3) throws IOException {
            if (this.f4116f - this.f4117g < i3) {
                Y0();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0495i
        public void A0(int i3, J j3) throws IOException {
            M0(1, 3);
            N0(2, i3);
            b1(3, j3);
            M0(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0495i
        public void B0(int i3, AbstractC0492f abstractC0492f) throws IOException {
            M0(1, 3);
            N0(2, i3);
            e0(3, abstractC0492f);
            M0(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0495i
        public void K0(int i3, String str) throws IOException {
            M0(i3, 2);
            L0(str);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0495i
        public void L0(String str) throws IOException {
            int iC;
            try {
                int length = str.length() * 3;
                int iQ = AbstractC0495i.Q(length);
                int i3 = iQ + length;
                int i4 = this.f4116f;
                if (i3 > i4) {
                    byte[] bArr = new byte[length];
                    int iB = j0.b(str, bArr, 0, length);
                    O0(iB);
                    a(bArr, 0, iB);
                    return;
                }
                if (i3 > i4 - this.f4117g) {
                    Y0();
                }
                int iQ2 = AbstractC0495i.Q(str.length());
                int i5 = this.f4117g;
                try {
                    if (iQ2 == iQ) {
                        int i6 = i5 + iQ2;
                        this.f4117g = i6;
                        int iB2 = j0.b(str, this.f4115e, i6, this.f4116f - i6);
                        this.f4117g = i5;
                        iC = (iB2 - i5) - iQ2;
                        W0(iC);
                        this.f4117g = iB2;
                    } else {
                        iC = j0.c(str);
                        W0(iC);
                        this.f4117g = j0.b(str, this.f4115e, this.f4117g, iC);
                    }
                    this.f4118h += iC;
                } catch (j0.d e3) {
                    this.f4118h -= this.f4117g - i5;
                    this.f4117g = i5;
                    throw e3;
                } catch (ArrayIndexOutOfBoundsException e4) {
                    throw new c(e4);
                }
            } catch (j0.d e5) {
                W(str, e5);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0495i
        public void M0(int i3, int i4) throws IOException {
            O0(k0.c(i3, i4));
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0495i
        public void N0(int i3, int i4) throws IOException {
            Z0(20);
            V0(i3, 0);
            W0(i4);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0495i
        public void O0(int i3) throws IOException {
            Z0(5);
            W0(i3);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0495i
        public void P0(int i3, long j3) throws IOException {
            Z0(20);
            V0(i3, 0);
            X0(j3);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0495i
        public void Q0(long j3) throws IOException {
            Z0(10);
            X0(j3);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0495i
        public void V() throws IOException {
            if (this.f4117g > 0) {
                Y0();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0495i
        public void Z(byte b3) throws IOException {
            if (this.f4117g == this.f4116f) {
                Y0();
            }
            R0(b3);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0495i, androidx.datastore.preferences.protobuf.AbstractC0491e
        public void a(byte[] bArr, int i3, int i4) throws IOException {
            a1(bArr, i3, i4);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0495i
        public void a0(int i3, boolean z2) throws IOException {
            Z0(11);
            V0(i3, 0);
            R0(z2 ? (byte) 1 : (byte) 0);
        }

        public void a1(byte[] bArr, int i3, int i4) throws IOException {
            int i5 = this.f4116f;
            int i6 = this.f4117g;
            if (i5 - i6 >= i4) {
                System.arraycopy(bArr, i3, this.f4115e, i6, i4);
                this.f4117g += i4;
            } else {
                int i7 = i5 - i6;
                System.arraycopy(bArr, i3, this.f4115e, i6, i7);
                int i8 = i3 + i7;
                i4 -= i7;
                this.f4117g = this.f4116f;
                this.f4118h += i7;
                Y0();
                if (i4 <= this.f4116f) {
                    System.arraycopy(bArr, i8, this.f4115e, 0, i4);
                    this.f4117g = i4;
                } else {
                    this.f4119i.write(bArr, i8, i4);
                }
            }
            this.f4118h += i4;
        }

        public void b1(int i3, J j3) throws IOException {
            M0(i3, 2);
            z0(j3);
        }

        void c1(J j3, Y y2) throws IOException {
            O0(((AbstractC0487a) j3).g(y2));
            y2.i(j3, this.f4113a);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0495i
        public void d0(byte[] bArr, int i3, int i4) throws IOException {
            O0(i4);
            a1(bArr, i3, i4);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0495i
        public void e0(int i3, AbstractC0492f abstractC0492f) throws IOException {
            M0(i3, 2);
            f0(abstractC0492f);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0495i
        public void f0(AbstractC0492f abstractC0492f) throws IOException {
            O0(abstractC0492f.size());
            abstractC0492f.z(this);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0495i
        public void k0(int i3, int i4) throws IOException {
            Z0(14);
            V0(i3, 5);
            S0(i4);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0495i
        public void l0(int i3) throws IOException {
            Z0(4);
            S0(i3);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0495i
        public void m0(int i3, long j3) throws IOException {
            Z0(18);
            V0(i3, 1);
            T0(j3);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0495i
        public void n0(long j3) throws IOException {
            Z0(8);
            T0(j3);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0495i
        public void u0(int i3, int i4) throws IOException {
            Z0(20);
            V0(i3, 0);
            U0(i4);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0495i
        public void v0(int i3) throws IOException {
            if (i3 >= 0) {
                O0(i3);
            } else {
                Q0(i3);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0495i
        void y0(int i3, J j3, Y y2) throws IOException {
            M0(i3, 2);
            c1(j3, y2);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0495i
        public void z0(J j3) throws IOException {
            O0(j3.a());
            j3.d(this);
        }
    }

    private AbstractC0495i() {
    }

    public static int A(J j3) {
        return y(j3.a());
    }

    static int B(J j3, Y y2) {
        return y(((AbstractC0487a) j3).g(y2));
    }

    static int C(int i3) {
        if (i3 > 4096) {
            return 4096;
        }
        return i3;
    }

    public static int D(int i3, AbstractC0492f abstractC0492f) {
        return (O(1) * 2) + P(2, i3) + f(3, abstractC0492f);
    }

    public static int E(int i3, int i4) {
        return O(i3) + F(i4);
    }

    public static int F(int i3) {
        return 4;
    }

    public static int G(int i3, long j3) {
        return O(i3) + H(j3);
    }

    public static int H(long j3) {
        return 8;
    }

    public static int I(int i3, int i4) {
        return O(i3) + J(i4);
    }

    public static int J(int i3) {
        return Q(T(i3));
    }

    public static int K(int i3, long j3) {
        return O(i3) + L(j3);
    }

    public static int L(long j3) {
        return S(U(j3));
    }

    public static int M(int i3, String str) {
        return O(i3) + N(str);
    }

    public static int N(String str) {
        int length;
        try {
            length = j0.c(str);
        } catch (j0.d unused) {
            length = str.getBytes(AbstractC0506u.f4280b).length;
        }
        return y(length);
    }

    public static int O(int i3) {
        return Q(k0.c(i3, 0));
    }

    public static int P(int i3, int i4) {
        return O(i3) + Q(i4);
    }

    public static int Q(int i3) {
        return (352 - (Integer.numberOfLeadingZeros(i3) * 9)) >>> 6;
    }

    public static int R(int i3, long j3) {
        return O(i3) + S(j3);
    }

    public static int S(long j3) {
        return (640 - (Long.numberOfLeadingZeros(j3) * 9)) >>> 6;
    }

    public static int T(int i3) {
        return (i3 >> 31) ^ (i3 << 1);
    }

    public static long U(long j3) {
        return (j3 >> 63) ^ (j3 << 1);
    }

    public static AbstractC0495i Y(OutputStream outputStream, int i3) {
        return new d(outputStream, i3);
    }

    public static int c(int i3, boolean z2) {
        return O(i3) + d(z2);
    }

    public static int d(boolean z2) {
        return 1;
    }

    public static int e(byte[] bArr) {
        return y(bArr.length);
    }

    public static int f(int i3, AbstractC0492f abstractC0492f) {
        return O(i3) + g(abstractC0492f);
    }

    public static int g(AbstractC0492f abstractC0492f) {
        return y(abstractC0492f.size());
    }

    public static int h(int i3, double d3) {
        return O(i3) + i(d3);
    }

    public static int i(double d3) {
        return 8;
    }

    public static int j(int i3, int i4) {
        return O(i3) + k(i4);
    }

    public static int k(int i3) {
        return v(i3);
    }

    public static int l(int i3, int i4) {
        return O(i3) + m(i4);
    }

    public static int m(int i3) {
        return 4;
    }

    public static int n(int i3, long j3) {
        return O(i3) + o(j3);
    }

    public static int o(long j3) {
        return 8;
    }

    public static int p(int i3, float f3) {
        return O(i3) + q(f3);
    }

    public static int q(float f3) {
        return 4;
    }

    static int r(int i3, J j3, Y y2) {
        return (O(i3) * 2) + t(j3, y2);
    }

    public static int s(J j3) {
        return j3.a();
    }

    static int t(J j3, Y y2) {
        return ((AbstractC0487a) j3).g(y2);
    }

    public static int u(int i3, int i4) {
        return O(i3) + v(i4);
    }

    public static int v(int i3) {
        return S(i3);
    }

    public static int w(int i3, long j3) {
        return O(i3) + x(j3);
    }

    public static int x(long j3) {
        return S(j3);
    }

    static int y(int i3) {
        return Q(i3) + i3;
    }

    static int z(int i3, J j3, Y y2) {
        return O(i3) + B(j3, y2);
    }

    public abstract void A0(int i3, J j3);

    public abstract void B0(int i3, AbstractC0492f abstractC0492f);

    public final void C0(int i3, int i4) {
        k0(i3, i4);
    }

    public final void D0(int i3) {
        l0(i3);
    }

    public final void E0(int i3, long j3) {
        m0(i3, j3);
    }

    public final void F0(long j3) {
        n0(j3);
    }

    public final void G0(int i3, int i4) {
        N0(i3, T(i4));
    }

    public final void H0(int i3) {
        O0(T(i3));
    }

    public final void I0(int i3, long j3) {
        P0(i3, U(j3));
    }

    public final void J0(long j3) {
        Q0(U(j3));
    }

    public abstract void K0(int i3, String str);

    public abstract void L0(String str);

    public abstract void M0(int i3, int i4);

    public abstract void N0(int i3, int i4);

    public abstract void O0(int i3);

    public abstract void P0(int i3, long j3);

    public abstract void Q0(long j3);

    public abstract void V();

    final void W(String str, j0.d dVar) throws c {
        f4111c.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) dVar);
        byte[] bytes = str.getBytes(AbstractC0506u.f4280b);
        try {
            O0(bytes.length);
            a(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e3) {
            throw new c(e3);
        }
    }

    boolean X() {
        return this.f4114b;
    }

    public abstract void Z(byte b3);

    @Override // androidx.datastore.preferences.protobuf.AbstractC0491e
    public abstract void a(byte[] bArr, int i3, int i4);

    public abstract void a0(int i3, boolean z2);

    public final void b0(boolean z2) {
        Z(z2 ? (byte) 1 : (byte) 0);
    }

    public final void c0(byte[] bArr) {
        d0(bArr, 0, bArr.length);
    }

    abstract void d0(byte[] bArr, int i3, int i4);

    public abstract void e0(int i3, AbstractC0492f abstractC0492f);

    public abstract void f0(AbstractC0492f abstractC0492f);

    public final void g0(int i3, double d3) {
        m0(i3, Double.doubleToRawLongBits(d3));
    }

    public final void h0(double d3) {
        n0(Double.doubleToRawLongBits(d3));
    }

    public final void i0(int i3, int i4) {
        u0(i3, i4);
    }

    public final void j0(int i3) {
        v0(i3);
    }

    public abstract void k0(int i3, int i4);

    public abstract void l0(int i3);

    public abstract void m0(int i3, long j3);

    public abstract void n0(long j3);

    public final void o0(int i3, float f3) {
        k0(i3, Float.floatToRawIntBits(f3));
    }

    public final void p0(float f3) {
        l0(Float.floatToRawIntBits(f3));
    }

    public final void q0(int i3, J j3) {
        M0(i3, 3);
        s0(j3);
        M0(i3, 4);
    }

    final void r0(int i3, J j3, Y y2) {
        M0(i3, 3);
        t0(j3, y2);
        M0(i3, 4);
    }

    public final void s0(J j3) {
        j3.d(this);
    }

    final void t0(J j3, Y y2) {
        y2.i(j3, this.f4113a);
    }

    public abstract void u0(int i3, int i4);

    public abstract void v0(int i3);

    public final void w0(int i3, long j3) {
        P0(i3, j3);
    }

    public final void x0(long j3) {
        Q0(j3);
    }

    abstract void y0(int i3, J j3, Y y2);

    public abstract void z0(J j3);
}
