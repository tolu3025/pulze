package io.grpc.internal;

import java.io.Closeable;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public interface z0 extends Closeable {
    void E(OutputStream outputStream, int i3);

    void N(ByteBuffer byteBuffer);

    void S(byte[] bArr, int i3, int i4);

    int a();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    void i();

    boolean markSupported();

    z0 p(int i3);

    int readUnsignedByte();

    void reset();

    void skipBytes(int i3);
}
