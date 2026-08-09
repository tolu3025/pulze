package m2;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class m implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f9880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f9881b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f9882c;

    public m(r sink) {
        kotlin.jvm.internal.m.e(sink, "sink");
        this.f9880a = sink;
        this.f9881b = new d();
    }

    @Override // m2.e
    public e O(String string) {
        kotlin.jvm.internal.m.e(string, "string");
        if (!(!this.f9882c)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f9881b.O(string);
        return b();
    }

    @Override // m2.r
    public void T(d source, long j3) {
        kotlin.jvm.internal.m.e(source, "source");
        if (!(!this.f9882c)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f9881b.T(source, j3);
        b();
    }

    public e b() {
        if (!(!this.f9882c)) {
            throw new IllegalStateException("closed".toString());
        }
        long jQ = this.f9881b.q();
        if (jQ > 0) {
            this.f9880a.T(this.f9881b, jQ);
        }
        return this;
    }

    @Override // m2.r, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        if (this.f9882c) {
            return;
        }
        try {
            if (this.f9881b.b0() > 0) {
                r rVar = this.f9880a;
                d dVar = this.f9881b;
                rVar.T(dVar, dVar.b0());
            }
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            this.f9880a.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.f9882c = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // m2.e, m2.r, java.io.Flushable
    public void flush() {
        if (!(!this.f9882c)) {
            throw new IllegalStateException("closed".toString());
        }
        if (this.f9881b.b0() > 0) {
            r rVar = this.f9880a;
            d dVar = this.f9881b;
            rVar.T(dVar, dVar.b0());
        }
        this.f9880a.flush();
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f9882c;
    }

    @Override // m2.e
    public e m(int i3) {
        if (!(!this.f9882c)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f9881b.m(i3);
        return b();
    }

    @Override // m2.e
    public e o(int i3) {
        if (!(!this.f9882c)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f9881b.o(i3);
        return b();
    }

    public String toString() {
        return "buffer(" + this.f9880a + ')';
    }

    @Override // m2.e
    public e v(int i3) {
        if (!(!this.f9882c)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f9881b.v(i3);
        return b();
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer source) {
        kotlin.jvm.internal.m.e(source, "source");
        if (!(!this.f9882c)) {
            throw new IllegalStateException("closed".toString());
        }
        int iWrite = this.f9881b.write(source);
        b();
        return iWrite;
    }

    @Override // m2.e
    public e y(byte[] source) {
        kotlin.jvm.internal.m.e(source, "source");
        if (!(!this.f9882c)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f9881b.y(source);
        return b();
    }
}
