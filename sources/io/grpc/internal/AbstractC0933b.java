package io.grpc.internal;

/* JADX INFO: renamed from: io.grpc.internal.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0933b implements z0 {
    protected final void b(int i3) {
        if (a() < i3) {
            throw new IndexOutOfBoundsException();
        }
    }

    public /* synthetic */ void c() {
        y0.a(this);
    }

    @Override // io.grpc.internal.z0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // io.grpc.internal.z0
    public void i() {
    }

    @Override // io.grpc.internal.z0
    public boolean markSupported() {
        return false;
    }

    public final int readInt() {
        b(4);
        return (readUnsignedByte() << 24) | (readUnsignedByte() << 16) | (readUnsignedByte() << 8) | readUnsignedByte();
    }

    @Override // io.grpc.internal.z0
    public void reset() {
        throw new UnsupportedOperationException();
    }
}
