package m2;

import java.io.EOFException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class n implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f9883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f9884b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f9885c;

    public n(t source) {
        kotlin.jvm.internal.m.e(source, "source");
        this.f9883a = source;
        this.f9884b = new d();
    }

    @Override // m2.t
    public long A(d sink, long j3) {
        kotlin.jvm.internal.m.e(sink, "sink");
        if (j3 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j3).toString());
        }
        if (!(!this.f9885c)) {
            throw new IllegalStateException("closed".toString());
        }
        if (this.f9884b.b0() == 0 && this.f9883a.A(this.f9884b, 8192L) == -1) {
            return -1L;
        }
        return this.f9884b.A(sink, Math.min(j3, this.f9884b.b0()));
    }

    @Override // m2.f
    public void M(long j3) throws EOFException {
        if (!b(j3)) {
            throw new EOFException();
        }
    }

    public boolean b(long j3) {
        if (j3 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j3).toString());
        }
        if (!(!this.f9885c)) {
            throw new IllegalStateException("closed".toString());
        }
        while (this.f9884b.b0() < j3) {
            if (this.f9883a.A(this.f9884b, 8192L) == -1) {
                return false;
            }
        }
        return true;
    }

    @Override // m2.t, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws EOFException {
        if (this.f9885c) {
            return;
        }
        this.f9885c = true;
        this.f9883a.close();
        this.f9884b.c();
    }

    @Override // m2.f
    public g h(long j3) throws EOFException {
        M(j3);
        return this.f9884b.h(j3);
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f9885c;
    }

    @Override // m2.f
    public void k(long j3) throws EOFException {
        if (!(!this.f9885c)) {
            throw new IllegalStateException("closed".toString());
        }
        while (j3 > 0) {
            if (this.f9884b.b0() == 0 && this.f9883a.A(this.f9884b, 8192L) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j3, this.f9884b.b0());
            this.f9884b.k(jMin);
            j3 -= jMin;
        }
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer sink) {
        kotlin.jvm.internal.m.e(sink, "sink");
        if (this.f9884b.b0() == 0 && this.f9883a.A(this.f9884b, 8192L) == -1) {
            return -1;
        }
        return this.f9884b.read(sink);
    }

    @Override // m2.f
    public byte readByte() throws EOFException {
        M(1L);
        return this.f9884b.readByte();
    }

    @Override // m2.f
    public int readInt() throws EOFException {
        M(4L);
        return this.f9884b.readInt();
    }

    @Override // m2.f
    public short readShort() throws EOFException {
        M(2L);
        return this.f9884b.readShort();
    }

    @Override // m2.f
    public d s() {
        return this.f9884b;
    }

    @Override // m2.f
    public boolean t() {
        if (!this.f9885c) {
            return this.f9884b.t() && this.f9883a.A(this.f9884b, 8192L) == -1;
        }
        throw new IllegalStateException("closed".toString());
    }

    public String toString() {
        return "buffer(" + this.f9883a + ')';
    }

    @Override // m2.f
    public byte[] x(long j3) throws EOFException {
        M(j3);
        return this.f9884b.x(j3);
    }
}
