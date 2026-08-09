package g2;

/* JADX INFO: loaded from: classes.dex */
public final class h extends g {
    public h(f2.b bVar, M1.g gVar, int i3, e2.a aVar) {
        super(bVar, gVar, i3, aVar);
    }

    @Override // g2.e
    protected e g(M1.g gVar, int i3, e2.a aVar) {
        return new h(this.f7359d, gVar, i3, aVar);
    }

    @Override // g2.g
    protected Object n(f2.c cVar, M1.d dVar) {
        Object objA = this.f7359d.a(cVar, dVar);
        return objA == N1.d.e() ? objA : I1.u.f2419a;
    }

    public /* synthetic */ h(f2.b bVar, M1.g gVar, int i3, e2.a aVar, int i4, kotlin.jvm.internal.h hVar) {
        this(bVar, (i4 & 2) != 0 ? M1.h.f2707a : gVar, (i4 & 4) != 0 ? -3 : i3, (i4 & 8) != 0 ? e2.a.f7117a : aVar);
    }
}
