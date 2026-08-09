package e2;

import c2.I;
import c2.N;
import c2.P;

/* JADX INFO: loaded from: classes.dex */
public abstract class s {
    public static final v a(N n3, M1.g gVar, int i3, a aVar, P p2, U1.l lVar, U1.p pVar) {
        t tVar = new t(I.k(n3, gVar), j.b(i3, aVar, null, 4, null));
        if (lVar != null) {
            tVar.invokeOnCompletion(lVar);
        }
        tVar.L0(p2, tVar, pVar);
        return tVar;
    }

    public static /* synthetic */ v b(N n3, M1.g gVar, int i3, a aVar, P p2, U1.l lVar, U1.p pVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            gVar = M1.h.f2707a;
        }
        M1.g gVar2 = gVar;
        if ((i4 & 2) != 0) {
            i3 = 0;
        }
        int i5 = i3;
        if ((i4 & 4) != 0) {
            aVar = a.f7117a;
        }
        a aVar2 = aVar;
        if ((i4 & 8) != 0) {
            p2 = P.f5096a;
        }
        P p3 = p2;
        if ((i4 & 16) != 0) {
            lVar = null;
        }
        return a(n3, gVar2, i5, aVar2, p3, lVar, pVar);
    }
}
