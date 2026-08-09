package c2;

import M1.g;

/* JADX INFO: loaded from: classes.dex */
public abstract class I {
    private static final M1.g d(M1.g gVar, M1.g gVar2, final boolean z2) {
        boolean zH = h(gVar);
        boolean zH2 = h(gVar2);
        if (!zH && !zH2) {
            return gVar.plus(gVar2);
        }
        final kotlin.jvm.internal.y yVar = new kotlin.jvm.internal.y();
        yVar.f9750a = gVar2;
        M1.h hVar = M1.h.f2707a;
        M1.g gVar3 = (M1.g) gVar.fold(hVar, new U1.p() { // from class: c2.G
            @Override // U1.p
            public final Object invoke(Object obj, Object obj2) {
                return I.e(yVar, z2, (M1.g) obj, (g.b) obj2);
            }
        });
        if (zH2) {
            yVar.f9750a = ((M1.g) yVar.f9750a).fold(hVar, new U1.p() { // from class: c2.H
                @Override // U1.p
                public final Object invoke(Object obj, Object obj2) {
                    return I.f((M1.g) obj, (g.b) obj2);
                }
            });
        }
        return gVar3.plus((M1.g) yVar.f9750a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final M1.g e(kotlin.jvm.internal.y yVar, boolean z2, M1.g gVar, g.b bVar) {
        return gVar.plus(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final M1.g f(M1.g gVar, g.b bVar) {
        return gVar.plus(bVar);
    }

    public static final String g(M1.g gVar) {
        return null;
    }

    private static final boolean h(M1.g gVar) {
        return ((Boolean) gVar.fold(Boolean.FALSE, new U1.p() { // from class: c2.F
            @Override // U1.p
            public final Object invoke(Object obj, Object obj2) {
                return Boolean.valueOf(I.i(((Boolean) obj).booleanValue(), (g.b) obj2));
            }
        })).booleanValue();
    }

    public static final M1.g j(M1.g gVar, M1.g gVar2) {
        return !h(gVar2) ? gVar.plus(gVar2) : d(gVar, gVar2, false);
    }

    public static final M1.g k(N n3, M1.g gVar) {
        M1.g gVarD = d(n3.e(), gVar, true);
        return (gVarD == C0557d0.a() || gVarD.get(M1.e.f2704g) != null) ? gVarD : gVarD.plus(C0557d0.a());
    }

    public static final a1 l(kotlin.coroutines.jvm.internal.e eVar) {
        while (!(eVar instanceof Z) && (eVar = eVar.getCallerFrame()) != null) {
            if (eVar instanceof a1) {
                return (a1) eVar;
            }
        }
        return null;
    }

    public static final a1 m(M1.d dVar, M1.g gVar, Object obj) {
        if (!(dVar instanceof kotlin.coroutines.jvm.internal.e) || gVar.get(b1.f5119a) == null) {
            return null;
        }
        a1 a1VarL = l((kotlin.coroutines.jvm.internal.e) dVar);
        if (a1VarL != null) {
            a1VarL.N0(gVar, obj);
        }
        return a1VarL;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean i(boolean z2, g.b bVar) {
        return z2;
    }
}
