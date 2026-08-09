package g2;

import h2.K;
import kotlin.jvm.internal.D;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {
    public static final Object b(M1.g gVar, Object obj, Object obj2, U1.p pVar, M1.d dVar) {
        Object objI = K.i(gVar, obj2);
        try {
            t tVar = new t(dVar, gVar);
            Object objD = !(pVar instanceof kotlin.coroutines.jvm.internal.a) ? N1.c.d(pVar, obj, tVar) : ((U1.p) D.b(pVar, 2)).invoke(obj, tVar);
            K.f(gVar, objI);
            if (objD == N1.d.e()) {
                kotlin.coroutines.jvm.internal.h.c(dVar);
            }
            return objD;
        } catch (Throwable th) {
            K.f(gVar, objI);
            throw th;
        }
    }

    public static /* synthetic */ Object c(M1.g gVar, Object obj, Object obj2, U1.p pVar, M1.d dVar, int i3, Object obj3) {
        if ((i3 & 4) != 0) {
            obj2 = K.g(gVar);
        }
        return b(gVar, obj, obj2, pVar, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f2.c d(f2.c cVar, M1.g gVar) {
        return !(cVar instanceof s) ? new u(cVar, gVar) : cVar;
    }
}
