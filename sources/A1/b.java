package A1;

import A1.j;
import e0.AbstractC0829j;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
final class b implements C1.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Logger f336d = Logger.getLogger(i.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C1.c f338b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final j f339c = new j(Level.FINE, i.class);

    interface a {
        void e(Throwable th);
    }

    b(a aVar, C1.c cVar) {
        this.f337a = (a) AbstractC0829j.o(aVar, "transportExceptionHandler");
        this.f338b = (C1.c) AbstractC0829j.o(cVar, "frameWriter");
    }

    static Level b(Throwable th) {
        return th.getClass().equals(IOException.class) ? Level.FINE : Level.INFO;
    }

    @Override // C1.c
    public void D(boolean z2, int i3, m2.d dVar, int i4) {
        this.f339c.b(j.a.OUTBOUND, i3, dVar.b(), i4, z2);
        try {
            this.f338b.D(z2, i3, dVar, i4);
        } catch (IOException e3) {
            this.f337a.e(e3);
        }
    }

    @Override // C1.c
    public void G(int i3, C1.a aVar, byte[] bArr) {
        this.f339c.c(j.a.OUTBOUND, i3, aVar, m2.g.p(bArr));
        try {
            this.f338b.G(i3, aVar, bArr);
            this.f338b.flush();
        } catch (IOException e3) {
            this.f337a.e(e3);
        }
    }

    @Override // C1.c
    public int I() {
        return this.f338b.I();
    }

    @Override // C1.c
    public void J(boolean z2, boolean z3, int i3, int i4, List list) {
        try {
            this.f338b.J(z2, z3, i3, i4, list);
        } catch (IOException e3) {
            this.f337a.e(e3);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            this.f338b.close();
        } catch (IOException e3) {
            f336d.log(b(e3), "Failed closing connection", (Throwable) e3);
        }
    }

    @Override // C1.c
    public void d(int i3, C1.a aVar) {
        this.f339c.h(j.a.OUTBOUND, i3, aVar);
        try {
            this.f338b.d(i3, aVar);
        } catch (IOException e3) {
            this.f337a.e(e3);
        }
    }

    @Override // C1.c
    public void e(boolean z2, int i3, int i4) {
        j jVar = this.f339c;
        j.a aVar = j.a.OUTBOUND;
        long j3 = (4294967295L & ((long) i4)) | (((long) i3) << 32);
        if (z2) {
            jVar.f(aVar, j3);
        } else {
            jVar.e(aVar, j3);
        }
        try {
            this.f338b.e(z2, i3, i4);
        } catch (IOException e3) {
            this.f337a.e(e3);
        }
    }

    @Override // C1.c
    public void flush() {
        try {
            this.f338b.flush();
        } catch (IOException e3) {
            this.f337a.e(e3);
        }
    }

    @Override // C1.c
    public void g(int i3, long j3) {
        this.f339c.k(j.a.OUTBOUND, i3, j3);
        try {
            this.f338b.g(i3, j3);
        } catch (IOException e3) {
            this.f337a.e(e3);
        }
    }

    @Override // C1.c
    public void j(C1.i iVar) {
        this.f339c.j(j.a.OUTBOUND);
        try {
            this.f338b.j(iVar);
        } catch (IOException e3) {
            this.f337a.e(e3);
        }
    }

    @Override // C1.c
    public void n(C1.i iVar) {
        this.f339c.i(j.a.OUTBOUND, iVar);
        try {
            this.f338b.n(iVar);
        } catch (IOException e3) {
            this.f337a.e(e3);
        }
    }

    @Override // C1.c
    public void w() {
        try {
            this.f338b.w();
        } catch (IOException e3) {
            this.f337a.e(e3);
        }
    }
}
