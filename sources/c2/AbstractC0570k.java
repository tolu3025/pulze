package c2;

import M1.e;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: renamed from: c2.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0570k {
    public static final V a(N n3, M1.g gVar, P p2, U1.p pVar) {
        M1.g gVarK = I.k(n3, gVar);
        W h02 = p2.g() ? new H0(gVarK, pVar) : new W(gVarK, true);
        h02.L0(p2, h02, pVar);
        return h02;
    }

    public static /* synthetic */ V b(N n3, M1.g gVar, P p2, U1.p pVar, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            gVar = M1.h.f2707a;
        }
        if ((i3 & 2) != 0) {
            p2 = P.f5096a;
        }
        return AbstractC0566i.a(n3, gVar, p2, pVar);
    }

    public static final InterfaceC0600z0 c(N n3, M1.g gVar, P p2, U1.p pVar) {
        M1.g gVarK = I.k(n3, gVar);
        R0 i02 = p2.g() ? new I0(gVarK, pVar) : new R0(gVarK, true);
        i02.L0(p2, i02, pVar);
        return i02;
    }

    public static /* synthetic */ InterfaceC0600z0 d(N n3, M1.g gVar, P p2, U1.p pVar, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            gVar = M1.h.f2707a;
        }
        if ((i3 & 2) != 0) {
            p2 = P.f5096a;
        }
        return AbstractC0566i.c(n3, gVar, p2, pVar);
    }

    public static final Object e(M1.g gVar, U1.p pVar, M1.d dVar) {
        Object objM0;
        M1.g context = dVar.getContext();
        M1.g gVarJ = I.j(context, gVar);
        C0.h(gVarJ);
        if (gVarJ == context) {
            h2.z zVar = new h2.z(gVarJ, dVar);
            objM0 = i2.b.b(zVar, zVar, pVar);
        } else {
            e.b bVar = M1.e.f2704g;
            if (kotlin.jvm.internal.m.a(gVarJ.get(bVar), context.get(bVar))) {
                a1 a1Var = new a1(gVarJ, dVar);
                M1.g context2 = a1Var.getContext();
                Object objI = h2.K.i(context2, null);
                try {
                    Object objB = i2.b.b(a1Var, a1Var, pVar);
                    h2.K.f(context2, objI);
                    objM0 = objB;
                } catch (Throwable th) {
                    h2.K.f(context2, objI);
                    throw th;
                }
            } else {
                Z z2 = new Z(gVarJ, dVar);
                i2.a.c(pVar, z2, z2);
                objM0 = z2.M0();
            }
        }
        if (objM0 == N1.d.e()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return objM0;
    }
}
