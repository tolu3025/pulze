package A1;

import e0.AbstractC0829j;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
abstract class c implements C1.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1.c f340a;

    public c(C1.c cVar) {
        this.f340a = (C1.c) AbstractC0829j.o(cVar, "delegate");
    }

    @Override // C1.c
    public void D(boolean z2, int i3, m2.d dVar, int i4) {
        this.f340a.D(z2, i3, dVar, i4);
    }

    @Override // C1.c
    public void G(int i3, C1.a aVar, byte[] bArr) {
        this.f340a.G(i3, aVar, bArr);
    }

    @Override // C1.c
    public int I() {
        return this.f340a.I();
    }

    @Override // C1.c
    public void J(boolean z2, boolean z3, int i3, int i4, List list) {
        this.f340a.J(z2, z3, i3, i4, list);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f340a.close();
    }

    @Override // C1.c
    public void d(int i3, C1.a aVar) {
        this.f340a.d(i3, aVar);
    }

    @Override // C1.c
    public void e(boolean z2, int i3, int i4) {
        this.f340a.e(z2, i3, i4);
    }

    @Override // C1.c
    public void flush() {
        this.f340a.flush();
    }

    @Override // C1.c
    public void g(int i3, long j3) {
        this.f340a.g(i3, j3);
    }

    @Override // C1.c
    public void j(C1.i iVar) {
        this.f340a.j(iVar);
    }

    @Override // C1.c
    public void n(C1.i iVar) {
        this.f340a.n(iVar);
    }

    @Override // C1.c
    public void w() {
        this.f340a.w();
    }
}
