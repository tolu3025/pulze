package com.google.protobuf;

import com.google.protobuf.A0;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: com.google.protobuf.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0794l extends AbstractC0790h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Logger f6843c = Logger.getLogger(AbstractC0794l.class.getName());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final boolean f6844d = z0.I();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    C0795m f6845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f6846b;

    /* JADX INFO: renamed from: com.google.protobuf.l$b */
    private static abstract class b extends AbstractC0794l {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final byte[] f6847e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final int f6848f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f6849g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f6850h;

        b(int i3) {
            super();
            if (i3 < 0) {
                throw new IllegalArgumentException("bufferSize must be >= 0");
            }
            byte[] bArr = new byte[Math.max(i3, 20)];
            this.f6847e = bArr;
            this.f6848f = bArr.length;
        }

        final void W0(byte b3) {
            byte[] bArr = this.f6847e;
            int i3 = this.f6849g;
            this.f6849g = i3 + 1;
            bArr[i3] = b3;
            this.f6850h++;
        }

        final void X0(int i3) {
            byte[] bArr = this.f6847e;
            int i4 = this.f6849g;
            bArr[i4] = (byte) (i3 & 255);
            bArr[i4 + 1] = (byte) ((i3 >> 8) & 255);
            bArr[i4 + 2] = (byte) ((i3 >> 16) & 255);
            this.f6849g = i4 + 4;
            bArr[i4 + 3] = (byte) ((i3 >> 24) & 255);
            this.f6850h += 4;
        }

        final void Y0(long j3) {
            byte[] bArr = this.f6847e;
            int i3 = this.f6849g;
            bArr[i3] = (byte) (j3 & 255);
            bArr[i3 + 1] = (byte) ((j3 >> 8) & 255);
            bArr[i3 + 2] = (byte) ((j3 >> 16) & 255);
            bArr[i3 + 3] = (byte) (255 & (j3 >> 24));
            bArr[i3 + 4] = (byte) (((int) (j3 >> 32)) & 255);
            bArr[i3 + 5] = (byte) (((int) (j3 >> 40)) & 255);
            bArr[i3 + 6] = (byte) (((int) (j3 >> 48)) & 255);
            this.f6849g = i3 + 8;
            bArr[i3 + 7] = (byte) (((int) (j3 >> 56)) & 255);
            this.f6850h += 8;
        }

        final void Z0(int i3) {
            if (i3 >= 0) {
                b1(i3);
            } else {
                c1(i3);
            }
        }

        final void a1(int i3, int i4) {
            b1(B0.c(i3, i4));
        }

        final void b1(int i3) {
            if (!AbstractC0794l.f6844d) {
                while ((i3 & (-128)) != 0) {
                    byte[] bArr = this.f6847e;
                    int i4 = this.f6849g;
                    this.f6849g = i4 + 1;
                    bArr[i4] = (byte) ((i3 & 127) | 128);
                    this.f6850h++;
                    i3 >>>= 7;
                }
                byte[] bArr2 = this.f6847e;
                int i5 = this.f6849g;
                this.f6849g = i5 + 1;
                bArr2[i5] = (byte) i3;
                this.f6850h++;
                return;
            }
            long j3 = this.f6849g;
            while ((i3 & (-128)) != 0) {
                byte[] bArr3 = this.f6847e;
                int i6 = this.f6849g;
                this.f6849g = i6 + 1;
                z0.O(bArr3, i6, (byte) ((i3 & 127) | 128));
                i3 >>>= 7;
            }
            byte[] bArr4 = this.f6847e;
            int i7 = this.f6849g;
            this.f6849g = i7 + 1;
            z0.O(bArr4, i7, (byte) i3);
            this.f6850h += (int) (((long) this.f6849g) - j3);
        }

        final void c1(long j3) {
            if (!AbstractC0794l.f6844d) {
                while ((j3 & (-128)) != 0) {
                    byte[] bArr = this.f6847e;
                    int i3 = this.f6849g;
                    this.f6849g = i3 + 1;
                    bArr[i3] = (byte) ((((int) j3) & 127) | 128);
                    this.f6850h++;
                    j3 >>>= 7;
                }
                byte[] bArr2 = this.f6847e;
                int i4 = this.f6849g;
                this.f6849g = i4 + 1;
                bArr2[i4] = (byte) j3;
                this.f6850h++;
                return;
            }
            long j4 = this.f6849g;
            while ((j3 & (-128)) != 0) {
                byte[] bArr3 = this.f6847e;
                int i5 = this.f6849g;
                this.f6849g = i5 + 1;
                z0.O(bArr3, i5, (byte) ((((int) j3) & 127) | 128));
                j3 >>>= 7;
            }
            byte[] bArr4 = this.f6847e;
            int i6 = this.f6849g;
            this.f6849g = i6 + 1;
            z0.O(bArr4, i6, (byte) j3);
            this.f6850h += (int) (((long) this.f6849g) - j4);
        }

        @Override // com.google.protobuf.AbstractC0794l
        public final int d0() {
            throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.l$c */
    private static class c extends AbstractC0794l {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final byte[] f6851e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int f6852f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final int f6853g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f6854h;

        c(byte[] bArr, int i3, int i4) {
            super();
            if (bArr == null) {
                throw new NullPointerException("buffer");
            }
            int i5 = i3 + i4;
            if ((i3 | i4 | (bArr.length - i5)) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i3), Integer.valueOf(i4)));
            }
            this.f6851e = bArr;
            this.f6852f = i3;
            this.f6854h = i3;
            this.f6853g = i5;
        }

        @Override // com.google.protobuf.AbstractC0794l
        public final void A0(int i3) throws d {
            if (i3 >= 0) {
                T0(i3);
            } else {
                V0(i3);
            }
        }

        @Override // com.google.protobuf.AbstractC0794l
        final void D0(int i3, V v2, n0 n0Var) throws d {
            R0(i3, 2);
            T0(((AbstractC0780a) v2).l(n0Var));
            n0Var.h(v2, this.f6845a);
        }

        @Override // com.google.protobuf.AbstractC0794l
        public final void E0(V v2) throws d {
            T0(v2.a());
            v2.h(this);
        }

        @Override // com.google.protobuf.AbstractC0794l
        public final void F0(int i3, V v2) throws d {
            R0(1, 3);
            S0(2, i3);
            Y0(3, v2);
            R0(1, 4);
        }

        @Override // com.google.protobuf.AbstractC0794l
        public final void G0(int i3, AbstractC0791i abstractC0791i) throws d {
            R0(1, 3);
            S0(2, i3);
            j0(3, abstractC0791i);
            R0(1, 4);
        }

        @Override // com.google.protobuf.AbstractC0794l
        public final void P0(int i3, String str) throws d {
            R0(i3, 2);
            Q0(str);
        }

        @Override // com.google.protobuf.AbstractC0794l
        public final void Q0(String str) throws d {
            int i3;
            int i4 = this.f6854h;
            try {
                int iS = AbstractC0794l.S(str.length() * 3);
                int iS2 = AbstractC0794l.S(str.length());
                if (iS2 == iS) {
                    int i5 = i4 + iS2;
                    this.f6854h = i5;
                    i3 = A0.i(str, this.f6851e, i5, d0());
                    this.f6854h = i4;
                    T0((i3 - i4) - iS2);
                } else {
                    T0(A0.j(str));
                    i3 = A0.i(str, this.f6851e, this.f6854h, d0());
                }
                this.f6854h = i3;
            } catch (A0.d e3) {
                this.f6854h = i4;
                Y(str, e3);
            } catch (IndexOutOfBoundsException e4) {
                throw new d(e4);
            }
        }

        @Override // com.google.protobuf.AbstractC0794l
        public final void R0(int i3, int i4) throws d {
            T0(B0.c(i3, i4));
        }

        @Override // com.google.protobuf.AbstractC0794l
        public final void S0(int i3, int i4) throws d {
            R0(i3, 0);
            T0(i4);
        }

        @Override // com.google.protobuf.AbstractC0794l
        public final void T0(int i3) throws d {
            while ((i3 & (-128)) != 0) {
                try {
                    byte[] bArr = this.f6851e;
                    int i4 = this.f6854h;
                    this.f6854h = i4 + 1;
                    bArr[i4] = (byte) ((i3 & 127) | 128);
                    i3 >>>= 7;
                } catch (IndexOutOfBoundsException e3) {
                    throw new d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f6854h), Integer.valueOf(this.f6853g), 1), e3);
                }
            }
            byte[] bArr2 = this.f6851e;
            int i5 = this.f6854h;
            this.f6854h = i5 + 1;
            bArr2[i5] = (byte) i3;
        }

        @Override // com.google.protobuf.AbstractC0794l
        public final void U0(int i3, long j3) throws d {
            R0(i3, 0);
            V0(j3);
        }

        @Override // com.google.protobuf.AbstractC0794l
        public final void V0(long j3) throws d {
            if (AbstractC0794l.f6844d && d0() >= 10) {
                while ((j3 & (-128)) != 0) {
                    byte[] bArr = this.f6851e;
                    int i3 = this.f6854h;
                    this.f6854h = i3 + 1;
                    z0.O(bArr, i3, (byte) ((((int) j3) & 127) | 128));
                    j3 >>>= 7;
                }
                byte[] bArr2 = this.f6851e;
                int i4 = this.f6854h;
                this.f6854h = 1 + i4;
                z0.O(bArr2, i4, (byte) j3);
                return;
            }
            while ((j3 & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.f6851e;
                    int i5 = this.f6854h;
                    this.f6854h = i5 + 1;
                    bArr3[i5] = (byte) ((((int) j3) & 127) | 128);
                    j3 >>>= 7;
                } catch (IndexOutOfBoundsException e3) {
                    throw new d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f6854h), Integer.valueOf(this.f6853g), 1), e3);
                }
            }
            byte[] bArr4 = this.f6851e;
            int i6 = this.f6854h;
            this.f6854h = i6 + 1;
            bArr4[i6] = (byte) j3;
        }

        public final void W0(ByteBuffer byteBuffer) throws d {
            int iRemaining = byteBuffer.remaining();
            try {
                byteBuffer.get(this.f6851e, this.f6854h, iRemaining);
                this.f6854h += iRemaining;
            } catch (IndexOutOfBoundsException e3) {
                throw new d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f6854h), Integer.valueOf(this.f6853g), Integer.valueOf(iRemaining)), e3);
            }
        }

        @Override // com.google.protobuf.AbstractC0794l
        public void X() {
        }

        public final void X0(byte[] bArr, int i3, int i4) throws d {
            try {
                System.arraycopy(bArr, i3, this.f6851e, this.f6854h, i4);
                this.f6854h += i4;
            } catch (IndexOutOfBoundsException e3) {
                throw new d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f6854h), Integer.valueOf(this.f6853g), Integer.valueOf(i4)), e3);
            }
        }

        public final void Y0(int i3, V v2) throws d {
            R0(i3, 2);
            E0(v2);
        }

        @Override // com.google.protobuf.AbstractC0790h
        public final void a(ByteBuffer byteBuffer) throws d {
            W0(byteBuffer);
        }

        @Override // com.google.protobuf.AbstractC0794l, com.google.protobuf.AbstractC0790h
        public final void b(byte[] bArr, int i3, int i4) throws d {
            X0(bArr, i3, i4);
        }

        @Override // com.google.protobuf.AbstractC0794l
        public final int d0() {
            return this.f6853g - this.f6854h;
        }

        @Override // com.google.protobuf.AbstractC0794l
        public final void e0(byte b3) throws d {
            try {
                byte[] bArr = this.f6851e;
                int i3 = this.f6854h;
                this.f6854h = i3 + 1;
                bArr[i3] = b3;
            } catch (IndexOutOfBoundsException e3) {
                throw new d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f6854h), Integer.valueOf(this.f6853g), 1), e3);
            }
        }

        @Override // com.google.protobuf.AbstractC0794l
        public final void f0(int i3, boolean z2) throws d {
            R0(i3, 0);
            e0(z2 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.protobuf.AbstractC0794l
        public final void i0(byte[] bArr, int i3, int i4) throws d {
            T0(i4);
            X0(bArr, i3, i4);
        }

        @Override // com.google.protobuf.AbstractC0794l
        public final void j0(int i3, AbstractC0791i abstractC0791i) throws d {
            R0(i3, 2);
            k0(abstractC0791i);
        }

        @Override // com.google.protobuf.AbstractC0794l
        public final void k0(AbstractC0791i abstractC0791i) throws d {
            T0(abstractC0791i.size());
            abstractC0791i.O(this);
        }

        @Override // com.google.protobuf.AbstractC0794l
        public final void p0(int i3, int i4) throws d {
            R0(i3, 5);
            q0(i4);
        }

        @Override // com.google.protobuf.AbstractC0794l
        public final void q0(int i3) throws d {
            try {
                byte[] bArr = this.f6851e;
                int i4 = this.f6854h;
                bArr[i4] = (byte) (i3 & 255);
                bArr[i4 + 1] = (byte) ((i3 >> 8) & 255);
                bArr[i4 + 2] = (byte) ((i3 >> 16) & 255);
                this.f6854h = i4 + 4;
                bArr[i4 + 3] = (byte) ((i3 >> 24) & 255);
            } catch (IndexOutOfBoundsException e3) {
                throw new d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f6854h), Integer.valueOf(this.f6853g), 1), e3);
            }
        }

        @Override // com.google.protobuf.AbstractC0794l
        public final void r0(int i3, long j3) throws d {
            R0(i3, 1);
            s0(j3);
        }

        @Override // com.google.protobuf.AbstractC0794l
        public final void s0(long j3) throws d {
            try {
                byte[] bArr = this.f6851e;
                int i3 = this.f6854h;
                bArr[i3] = (byte) (((int) j3) & 255);
                bArr[i3 + 1] = (byte) (((int) (j3 >> 8)) & 255);
                bArr[i3 + 2] = (byte) (((int) (j3 >> 16)) & 255);
                bArr[i3 + 3] = (byte) (((int) (j3 >> 24)) & 255);
                bArr[i3 + 4] = (byte) (((int) (j3 >> 32)) & 255);
                bArr[i3 + 5] = (byte) (((int) (j3 >> 40)) & 255);
                bArr[i3 + 6] = (byte) (((int) (j3 >> 48)) & 255);
                this.f6854h = i3 + 8;
                bArr[i3 + 7] = (byte) (((int) (j3 >> 56)) & 255);
            } catch (IndexOutOfBoundsException e3) {
                throw new d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f6854h), Integer.valueOf(this.f6853g), 1), e3);
            }
        }

        @Override // com.google.protobuf.AbstractC0794l
        public final void z0(int i3, int i4) throws d {
            R0(i3, 0);
            A0(i4);
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.l$d */
    public static class d extends IOException {
        d(String str, Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + str, th);
        }

        d(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.l$e */
    private static final class e extends b {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final OutputStream f6855i;

        e(OutputStream outputStream, int i3) {
            super(i3);
            if (outputStream == null) {
                throw new NullPointerException("out");
            }
            this.f6855i = outputStream;
        }

        private void d1() throws IOException {
            this.f6855i.write(this.f6847e, 0, this.f6849g);
            this.f6849g = 0;
        }

        private void e1(int i3) throws IOException {
            if (this.f6848f - this.f6849g < i3) {
                d1();
            }
        }

        @Override // com.google.protobuf.AbstractC0794l
        public void A0(int i3) throws IOException {
            if (i3 >= 0) {
                T0(i3);
            } else {
                V0(i3);
            }
        }

        @Override // com.google.protobuf.AbstractC0794l
        void D0(int i3, V v2, n0 n0Var) throws IOException {
            R0(i3, 2);
            i1(v2, n0Var);
        }

        @Override // com.google.protobuf.AbstractC0794l
        public void E0(V v2) throws IOException {
            T0(v2.a());
            v2.h(this);
        }

        @Override // com.google.protobuf.AbstractC0794l
        public void F0(int i3, V v2) throws IOException {
            R0(1, 3);
            S0(2, i3);
            h1(3, v2);
            R0(1, 4);
        }

        @Override // com.google.protobuf.AbstractC0794l
        public void G0(int i3, AbstractC0791i abstractC0791i) throws IOException {
            R0(1, 3);
            S0(2, i3);
            j0(3, abstractC0791i);
            R0(1, 4);
        }

        @Override // com.google.protobuf.AbstractC0794l
        public void P0(int i3, String str) throws IOException {
            R0(i3, 2);
            Q0(str);
        }

        @Override // com.google.protobuf.AbstractC0794l
        public void Q0(String str) throws IOException {
            int iJ;
            try {
                int length = str.length() * 3;
                int iS = AbstractC0794l.S(length);
                int i3 = iS + length;
                int i4 = this.f6848f;
                if (i3 > i4) {
                    byte[] bArr = new byte[length];
                    int i5 = A0.i(str, bArr, 0, length);
                    T0(i5);
                    b(bArr, 0, i5);
                    return;
                }
                if (i3 > i4 - this.f6849g) {
                    d1();
                }
                int iS2 = AbstractC0794l.S(str.length());
                int i6 = this.f6849g;
                try {
                    if (iS2 == iS) {
                        int i7 = i6 + iS2;
                        this.f6849g = i7;
                        int i8 = A0.i(str, this.f6847e, i7, this.f6848f - i7);
                        this.f6849g = i6;
                        iJ = (i8 - i6) - iS2;
                        b1(iJ);
                        this.f6849g = i8;
                    } else {
                        iJ = A0.j(str);
                        b1(iJ);
                        this.f6849g = A0.i(str, this.f6847e, this.f6849g, iJ);
                    }
                    this.f6850h += iJ;
                } catch (A0.d e3) {
                    this.f6850h -= this.f6849g - i6;
                    this.f6849g = i6;
                    throw e3;
                } catch (ArrayIndexOutOfBoundsException e4) {
                    throw new d(e4);
                }
            } catch (A0.d e5) {
                Y(str, e5);
            }
        }

        @Override // com.google.protobuf.AbstractC0794l
        public void R0(int i3, int i4) throws IOException {
            T0(B0.c(i3, i4));
        }

        @Override // com.google.protobuf.AbstractC0794l
        public void S0(int i3, int i4) throws IOException {
            e1(20);
            a1(i3, 0);
            b1(i4);
        }

        @Override // com.google.protobuf.AbstractC0794l
        public void T0(int i3) throws IOException {
            e1(5);
            b1(i3);
        }

        @Override // com.google.protobuf.AbstractC0794l
        public void U0(int i3, long j3) throws IOException {
            e1(20);
            a1(i3, 0);
            c1(j3);
        }

        @Override // com.google.protobuf.AbstractC0794l
        public void V0(long j3) throws IOException {
            e1(10);
            c1(j3);
        }

        @Override // com.google.protobuf.AbstractC0794l
        public void X() throws IOException {
            if (this.f6849g > 0) {
                d1();
            }
        }

        @Override // com.google.protobuf.AbstractC0790h
        public void a(ByteBuffer byteBuffer) throws IOException {
            f1(byteBuffer);
        }

        @Override // com.google.protobuf.AbstractC0794l, com.google.protobuf.AbstractC0790h
        public void b(byte[] bArr, int i3, int i4) throws IOException {
            g1(bArr, i3, i4);
        }

        @Override // com.google.protobuf.AbstractC0794l
        public void e0(byte b3) throws IOException {
            if (this.f6849g == this.f6848f) {
                d1();
            }
            W0(b3);
        }

        @Override // com.google.protobuf.AbstractC0794l
        public void f0(int i3, boolean z2) throws IOException {
            e1(11);
            a1(i3, 0);
            W0(z2 ? (byte) 1 : (byte) 0);
        }

        public void f1(ByteBuffer byteBuffer) throws IOException {
            int iRemaining = byteBuffer.remaining();
            int i3 = this.f6848f;
            int i4 = this.f6849g;
            if (i3 - i4 >= iRemaining) {
                byteBuffer.get(this.f6847e, i4, iRemaining);
                this.f6849g += iRemaining;
            } else {
                int i5 = i3 - i4;
                byteBuffer.get(this.f6847e, i4, i5);
                iRemaining -= i5;
                this.f6849g = this.f6848f;
                this.f6850h += i5;
                d1();
                while (true) {
                    int i6 = this.f6848f;
                    if (iRemaining <= i6) {
                        break;
                    }
                    byteBuffer.get(this.f6847e, 0, i6);
                    this.f6855i.write(this.f6847e, 0, this.f6848f);
                    int i7 = this.f6848f;
                    iRemaining -= i7;
                    this.f6850h += i7;
                }
                byteBuffer.get(this.f6847e, 0, iRemaining);
                this.f6849g = iRemaining;
            }
            this.f6850h += iRemaining;
        }

        public void g1(byte[] bArr, int i3, int i4) throws IOException {
            int i5 = this.f6848f;
            int i6 = this.f6849g;
            if (i5 - i6 >= i4) {
                System.arraycopy(bArr, i3, this.f6847e, i6, i4);
                this.f6849g += i4;
            } else {
                int i7 = i5 - i6;
                System.arraycopy(bArr, i3, this.f6847e, i6, i7);
                int i8 = i3 + i7;
                i4 -= i7;
                this.f6849g = this.f6848f;
                this.f6850h += i7;
                d1();
                if (i4 <= this.f6848f) {
                    System.arraycopy(bArr, i8, this.f6847e, 0, i4);
                    this.f6849g = i4;
                } else {
                    this.f6855i.write(bArr, i8, i4);
                }
            }
            this.f6850h += i4;
        }

        public void h1(int i3, V v2) throws IOException {
            R0(i3, 2);
            E0(v2);
        }

        @Override // com.google.protobuf.AbstractC0794l
        public void i0(byte[] bArr, int i3, int i4) throws IOException {
            T0(i4);
            g1(bArr, i3, i4);
        }

        void i1(V v2, n0 n0Var) throws IOException {
            T0(((AbstractC0780a) v2).l(n0Var));
            n0Var.h(v2, this.f6845a);
        }

        @Override // com.google.protobuf.AbstractC0794l
        public void j0(int i3, AbstractC0791i abstractC0791i) throws IOException {
            R0(i3, 2);
            k0(abstractC0791i);
        }

        @Override // com.google.protobuf.AbstractC0794l
        public void k0(AbstractC0791i abstractC0791i) throws IOException {
            T0(abstractC0791i.size());
            abstractC0791i.O(this);
        }

        @Override // com.google.protobuf.AbstractC0794l
        public void p0(int i3, int i4) throws IOException {
            e1(14);
            a1(i3, 5);
            X0(i4);
        }

        @Override // com.google.protobuf.AbstractC0794l
        public void q0(int i3) throws IOException {
            e1(4);
            X0(i3);
        }

        @Override // com.google.protobuf.AbstractC0794l
        public void r0(int i3, long j3) throws IOException {
            e1(18);
            a1(i3, 1);
            Y0(j3);
        }

        @Override // com.google.protobuf.AbstractC0794l
        public void s0(long j3) throws IOException {
            e1(8);
            Y0(j3);
        }

        @Override // com.google.protobuf.AbstractC0794l
        public void z0(int i3, int i4) throws IOException {
            e1(20);
            a1(i3, 0);
            Z0(i4);
        }
    }

    private AbstractC0794l() {
    }

    static int A(int i3) {
        return S(i3) + i3;
    }

    static int B(int i3, V v2, n0 n0Var) {
        return Q(i3) + D(v2, n0Var);
    }

    public static int C(V v2) {
        return A(v2.a());
    }

    static int D(V v2, n0 n0Var) {
        return A(((AbstractC0780a) v2).l(n0Var));
    }

    static int E(int i3) {
        if (i3 > 4096) {
            return 4096;
        }
        return i3;
    }

    public static int F(int i3, AbstractC0791i abstractC0791i) {
        return (Q(1) * 2) + R(2, i3) + h(3, abstractC0791i);
    }

    public static int G(int i3, int i4) {
        return Q(i3) + H(i4);
    }

    public static int H(int i3) {
        return 4;
    }

    public static int I(int i3, long j3) {
        return Q(i3) + J(j3);
    }

    public static int J(long j3) {
        return 8;
    }

    public static int K(int i3, int i4) {
        return Q(i3) + L(i4);
    }

    public static int L(int i3) {
        return S(V(i3));
    }

    public static int M(int i3, long j3) {
        return Q(i3) + N(j3);
    }

    public static int N(long j3) {
        return U(W(j3));
    }

    public static int O(int i3, String str) {
        return Q(i3) + P(str);
    }

    public static int P(String str) {
        int length;
        try {
            length = A0.j(str);
        } catch (A0.d unused) {
            length = str.getBytes(C.f6666b).length;
        }
        return A(length);
    }

    public static int Q(int i3) {
        return S(B0.c(i3, 0));
    }

    public static int R(int i3, int i4) {
        return Q(i3) + S(i4);
    }

    public static int S(int i3) {
        if ((i3 & (-128)) == 0) {
            return 1;
        }
        if ((i3 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i3) == 0) {
            return 3;
        }
        return (i3 & (-268435456)) == 0 ? 4 : 5;
    }

    public static int T(int i3, long j3) {
        return Q(i3) + U(j3);
    }

    public static int U(long j3) {
        int i3;
        if (((-128) & j3) == 0) {
            return 1;
        }
        if (j3 < 0) {
            return 10;
        }
        if (((-34359738368L) & j3) != 0) {
            j3 >>>= 28;
            i3 = 6;
        } else {
            i3 = 2;
        }
        if (((-2097152) & j3) != 0) {
            i3 += 2;
            j3 >>>= 14;
        }
        return (j3 & (-16384)) != 0 ? i3 + 1 : i3;
    }

    public static int V(int i3) {
        return (i3 >> 31) ^ (i3 << 1);
    }

    public static long W(long j3) {
        return (j3 >> 63) ^ (j3 << 1);
    }

    public static AbstractC0794l a0(OutputStream outputStream, int i3) {
        return new e(outputStream, i3);
    }

    public static AbstractC0794l b0(byte[] bArr) {
        return c0(bArr, 0, bArr.length);
    }

    public static AbstractC0794l c0(byte[] bArr, int i3, int i4) {
        return new c(bArr, i3, i4);
    }

    public static int e(int i3, boolean z2) {
        return Q(i3) + f(z2);
    }

    public static int f(boolean z2) {
        return 1;
    }

    public static int g(byte[] bArr) {
        return A(bArr.length);
    }

    public static int h(int i3, AbstractC0791i abstractC0791i) {
        return Q(i3) + i(abstractC0791i);
    }

    public static int i(AbstractC0791i abstractC0791i) {
        return A(abstractC0791i.size());
    }

    public static int j(int i3, double d3) {
        return Q(i3) + k(d3);
    }

    public static int k(double d3) {
        return 8;
    }

    public static int l(int i3, int i4) {
        return Q(i3) + m(i4);
    }

    public static int m(int i3) {
        return x(i3);
    }

    public static int n(int i3, int i4) {
        return Q(i3) + o(i4);
    }

    public static int o(int i3) {
        return 4;
    }

    public static int p(int i3, long j3) {
        return Q(i3) + q(j3);
    }

    public static int q(long j3) {
        return 8;
    }

    public static int r(int i3, float f3) {
        return Q(i3) + s(f3);
    }

    public static int s(float f3) {
        return 4;
    }

    static int t(int i3, V v2, n0 n0Var) {
        return (Q(i3) * 2) + v(v2, n0Var);
    }

    public static int u(V v2) {
        return v2.a();
    }

    static int v(V v2, n0 n0Var) {
        return ((AbstractC0780a) v2).l(n0Var);
    }

    public static int w(int i3, int i4) {
        return Q(i3) + x(i4);
    }

    public static int x(int i3) {
        if (i3 >= 0) {
            return S(i3);
        }
        return 10;
    }

    public static int y(int i3, long j3) {
        return Q(i3) + z(j3);
    }

    public static int z(long j3) {
        return U(j3);
    }

    public abstract void A0(int i3);

    public final void B0(int i3, long j3) {
        U0(i3, j3);
    }

    public final void C0(long j3) {
        V0(j3);
    }

    abstract void D0(int i3, V v2, n0 n0Var);

    public abstract void E0(V v2);

    public abstract void F0(int i3, V v2);

    public abstract void G0(int i3, AbstractC0791i abstractC0791i);

    public final void H0(int i3, int i4) {
        p0(i3, i4);
    }

    public final void I0(int i3) {
        q0(i3);
    }

    public final void J0(int i3, long j3) {
        r0(i3, j3);
    }

    public final void K0(long j3) {
        s0(j3);
    }

    public final void L0(int i3, int i4) {
        S0(i3, V(i4));
    }

    public final void M0(int i3) {
        T0(V(i3));
    }

    public final void N0(int i3, long j3) {
        U0(i3, W(j3));
    }

    public final void O0(long j3) {
        V0(W(j3));
    }

    public abstract void P0(int i3, String str);

    public abstract void Q0(String str);

    public abstract void R0(int i3, int i4);

    public abstract void S0(int i3, int i4);

    public abstract void T0(int i3);

    public abstract void U0(int i3, long j3);

    public abstract void V0(long j3);

    public abstract void X();

    final void Y(String str, A0.d dVar) throws d {
        f6843c.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) dVar);
        byte[] bytes = str.getBytes(C.f6666b);
        try {
            T0(bytes.length);
            b(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e3) {
            throw new d(e3);
        }
    }

    boolean Z() {
        return this.f6846b;
    }

    @Override // com.google.protobuf.AbstractC0790h
    public abstract void b(byte[] bArr, int i3, int i4);

    public final void d() {
        if (d0() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public abstract int d0();

    public abstract void e0(byte b3);

    public abstract void f0(int i3, boolean z2);

    public final void g0(boolean z2) {
        e0(z2 ? (byte) 1 : (byte) 0);
    }

    public final void h0(byte[] bArr) {
        i0(bArr, 0, bArr.length);
    }

    abstract void i0(byte[] bArr, int i3, int i4);

    public abstract void j0(int i3, AbstractC0791i abstractC0791i);

    public abstract void k0(AbstractC0791i abstractC0791i);

    public final void l0(int i3, double d3) {
        r0(i3, Double.doubleToRawLongBits(d3));
    }

    public final void m0(double d3) {
        s0(Double.doubleToRawLongBits(d3));
    }

    public final void n0(int i3, int i4) {
        z0(i3, i4);
    }

    public final void o0(int i3) {
        A0(i3);
    }

    public abstract void p0(int i3, int i4);

    public abstract void q0(int i3);

    public abstract void r0(int i3, long j3);

    public abstract void s0(long j3);

    public final void t0(int i3, float f3) {
        p0(i3, Float.floatToRawIntBits(f3));
    }

    public final void u0(float f3) {
        q0(Float.floatToRawIntBits(f3));
    }

    public final void v0(int i3, V v2) {
        R0(i3, 3);
        x0(v2);
        R0(i3, 4);
    }

    final void w0(int i3, V v2, n0 n0Var) {
        R0(i3, 3);
        y0(v2, n0Var);
        R0(i3, 4);
    }

    public final void x0(V v2) {
        v2.h(this);
    }

    final void y0(V v2, n0 n0Var) {
        n0Var.h(v2, this.f6845a);
    }

    public abstract void z0(int i3, int i4);
}
