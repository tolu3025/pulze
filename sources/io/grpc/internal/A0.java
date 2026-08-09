package io.grpc.internal;

import e0.AbstractC0829j;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.InvalidMarkException;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public abstract class A0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final z0 f8343a = new c(new byte[0]);

    class a extends O {
        a(z0 z0Var) {
            super(z0Var);
        }

        @Override // io.grpc.internal.z0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }
    }

    private static final class b extends InputStream implements y1.Q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private z0 f8344a;

        public b(z0 z0Var) {
            this.f8344a = (z0) AbstractC0829j.o(z0Var, "buffer");
        }

        @Override // java.io.InputStream
        public int available() {
            return this.f8344a.a();
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f8344a.close();
        }

        @Override // java.io.InputStream
        public void mark(int i3) {
            this.f8344a.i();
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
            return this.f8344a.markSupported();
        }

        @Override // java.io.InputStream
        public int read() {
            if (this.f8344a.a() == 0) {
                return -1;
            }
            return this.f8344a.readUnsignedByte();
        }

        @Override // java.io.InputStream
        public void reset() {
            this.f8344a.reset();
        }

        @Override // java.io.InputStream
        public long skip(long j3) {
            int iMin = (int) Math.min(this.f8344a.a(), j3);
            this.f8344a.skipBytes(iMin);
            return iMin;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i3, int i4) {
            if (this.f8344a.a() == 0) {
                return -1;
            }
            int iMin = Math.min(this.f8344a.a(), i4);
            this.f8344a.S(bArr, i3, iMin);
            return iMin;
        }
    }

    private static class c extends AbstractC0933b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f8345a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f8346b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final byte[] f8347c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f8348d;

        c(byte[] bArr) {
            this(bArr, 0, bArr.length);
        }

        @Override // io.grpc.internal.z0
        public void E(OutputStream outputStream, int i3) throws IOException {
            b(i3);
            outputStream.write(this.f8347c, this.f8345a, i3);
            this.f8345a += i3;
        }

        @Override // io.grpc.internal.z0
        public void N(ByteBuffer byteBuffer) {
            AbstractC0829j.o(byteBuffer, "dest");
            int iRemaining = byteBuffer.remaining();
            b(iRemaining);
            byteBuffer.put(this.f8347c, this.f8345a, iRemaining);
            this.f8345a += iRemaining;
        }

        @Override // io.grpc.internal.z0
        public void S(byte[] bArr, int i3, int i4) {
            System.arraycopy(this.f8347c, this.f8345a, bArr, i3, i4);
            this.f8345a += i4;
        }

        @Override // io.grpc.internal.z0
        public int a() {
            return this.f8346b - this.f8345a;
        }

        @Override // io.grpc.internal.z0
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public c p(int i3) {
            b(i3);
            int i4 = this.f8345a;
            this.f8345a = i4 + i3;
            return new c(this.f8347c, i4, i3);
        }

        @Override // io.grpc.internal.AbstractC0933b, io.grpc.internal.z0
        public void i() {
            this.f8348d = this.f8345a;
        }

        @Override // io.grpc.internal.AbstractC0933b, io.grpc.internal.z0
        public boolean markSupported() {
            return true;
        }

        @Override // io.grpc.internal.z0
        public int readUnsignedByte() {
            b(1);
            byte[] bArr = this.f8347c;
            int i3 = this.f8345a;
            this.f8345a = i3 + 1;
            return bArr[i3] & 255;
        }

        @Override // io.grpc.internal.AbstractC0933b, io.grpc.internal.z0
        public void reset() {
            int i3 = this.f8348d;
            if (i3 == -1) {
                throw new InvalidMarkException();
            }
            this.f8345a = i3;
        }

        @Override // io.grpc.internal.z0
        public void skipBytes(int i3) {
            b(i3);
            this.f8345a += i3;
        }

        c(byte[] bArr, int i3, int i4) {
            this.f8348d = -1;
            AbstractC0829j.e(i3 >= 0, "offset must be >= 0");
            AbstractC0829j.e(i4 >= 0, "length must be >= 0");
            int i5 = i4 + i3;
            AbstractC0829j.e(i5 <= bArr.length, "offset + length exceeds array boundary");
            this.f8347c = (byte[]) AbstractC0829j.o(bArr, "bytes");
            this.f8345a = i3;
            this.f8346b = i5;
        }
    }

    public static z0 a() {
        return f8343a;
    }

    public static z0 b(z0 z0Var) {
        return new a(z0Var);
    }

    public static InputStream c(z0 z0Var, boolean z2) {
        if (!z2) {
            z0Var = b(z0Var);
        }
        return new b(z0Var);
    }

    public static byte[] d(z0 z0Var) {
        AbstractC0829j.o(z0Var, "buffer");
        int iA = z0Var.a();
        byte[] bArr = new byte[iA];
        z0Var.S(bArr, 0, iA);
        return bArr;
    }

    public static String e(z0 z0Var, Charset charset) {
        AbstractC0829j.o(charset, "charset");
        return new String(d(z0Var), charset);
    }

    public static z0 f(byte[] bArr, int i3, int i4) {
        return new c(bArr, i3, i4);
    }
}
