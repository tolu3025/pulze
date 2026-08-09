package m2;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
final class l implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final OutputStream f9878a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final u f9879b;

    public l(OutputStream out, u timeout) {
        kotlin.jvm.internal.m.e(out, "out");
        kotlin.jvm.internal.m.e(timeout, "timeout");
        this.f9878a = out;
        this.f9879b = timeout;
    }

    @Override // m2.r
    public void T(d source, long j3) throws IOException {
        kotlin.jvm.internal.m.e(source, "source");
        b.b(source.b0(), 0L, j3);
        while (j3 > 0) {
            this.f9879b.c();
            o oVar = source.f9861a;
            kotlin.jvm.internal.m.b(oVar);
            int iMin = (int) Math.min(j3, oVar.f9889c - oVar.f9888b);
            this.f9878a.write(oVar.f9887a, oVar.f9888b, iMin);
            oVar.f9888b += iMin;
            long j4 = iMin;
            j3 -= j4;
            source.a0(source.b0() - j4);
            if (oVar.f9888b == oVar.f9889c) {
                source.f9861a = oVar.b();
                p.b(oVar);
            }
        }
    }

    @Override // m2.r, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f9878a.close();
    }

    @Override // m2.r, java.io.Flushable
    public void flush() throws IOException {
        this.f9878a.flush();
    }

    public String toString() {
        return "sink(" + this.f9878a + ')';
    }
}
