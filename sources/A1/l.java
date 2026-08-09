package A1;

import io.grpc.internal.AbstractC0933b;
import io.grpc.internal.z0;
import java.io.EOFException;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
class l extends AbstractC0933b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m2.d f518a;

    l(m2.d dVar) {
        this.f518a = dVar;
    }

    @Override // io.grpc.internal.z0
    public void E(OutputStream outputStream, int i3) throws IOException {
        this.f518a.m0(outputStream, i3);
    }

    @Override // io.grpc.internal.z0
    public void N(ByteBuffer byteBuffer) {
        throw new UnsupportedOperationException();
    }

    @Override // io.grpc.internal.z0
    public void S(byte[] bArr, int i3, int i4) {
        while (i4 > 0) {
            int iL = this.f518a.L(bArr, i3, i4);
            if (iL == -1) {
                throw new IndexOutOfBoundsException("EOF trying to read " + i4 + " bytes");
            }
            i4 -= iL;
            i3 += iL;
        }
    }

    @Override // io.grpc.internal.z0
    public int a() {
        return (int) this.f518a.b0();
    }

    @Override // io.grpc.internal.AbstractC0933b, io.grpc.internal.z0, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws EOFException {
        this.f518a.c();
    }

    @Override // io.grpc.internal.z0
    public z0 p(int i3) {
        m2.d dVar = new m2.d();
        dVar.T(this.f518a, i3);
        return new l(dVar);
    }

    @Override // io.grpc.internal.z0
    public int readUnsignedByte() {
        try {
            f();
            return this.f518a.readByte() & 255;
        } catch (EOFException e3) {
            throw new IndexOutOfBoundsException(e3.getMessage());
        }
    }

    @Override // io.grpc.internal.z0
    public void skipBytes(int i3) {
        try {
            this.f518a.k(i3);
        } catch (EOFException e3) {
            throw new IndexOutOfBoundsException(e3.getMessage());
        }
    }

    private void f() {
    }
}
