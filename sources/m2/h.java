package m2;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
class h implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InputStream f9875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final u f9876b;

    public h(InputStream input, u timeout) {
        kotlin.jvm.internal.m.e(input, "input");
        kotlin.jvm.internal.m.e(timeout, "timeout");
        this.f9875a = input;
        this.f9876b = timeout;
    }

    @Override // m2.t
    public long A(d sink, long j3) throws IOException {
        kotlin.jvm.internal.m.e(sink, "sink");
        if (j3 == 0) {
            return 0L;
        }
        if (j3 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j3).toString());
        }
        try {
            this.f9876b.c();
            o oVarE0 = sink.e0(1);
            int i3 = this.f9875a.read(oVarE0.f9887a, oVarE0.f9889c, (int) Math.min(j3, 8192 - oVarE0.f9889c));
            if (i3 != -1) {
                oVarE0.f9889c += i3;
                long j4 = i3;
                sink.a0(sink.b0() + j4);
                return j4;
            }
            if (oVarE0.f9888b != oVarE0.f9889c) {
                return -1L;
            }
            sink.f9861a = oVarE0.b();
            p.b(oVarE0);
            return -1L;
        } catch (AssertionError e3) {
            if (i.c(e3)) {
                throw new IOException(e3);
            }
            throw e3;
        }
    }

    @Override // m2.t, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f9875a.close();
    }

    public String toString() {
        return "source(" + this.f9875a + ')';
    }
}
